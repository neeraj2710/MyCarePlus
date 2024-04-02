/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbutil.DBConnection2;
import pojo.User;
import pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class UserDao {
         public static String validateUser(User user) throws SQLException{
         Connection conn=DBConnection2.getConnection();
         PreparedStatement ps=conn.prepareStatement("Select user_name from users where login_id=? and password=? and user_type=?");
         ps.setString(1, user.getLoginId());
         ps.setString(2,user.getPassword());
         ps.setString(3, user.getUserType());
         ResultSet rs=ps.executeQuery();
         String name=null;
         if(rs.next()){
             name=rs.getString("user_name");
         }
         return name;
      }
     public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection2.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update users set user_name=? where user_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
     }
     public static boolean addUser(UserPojo user)throws SQLException{
     Connection conn=DBConnection2.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into users values(?,?,?,?)");
     ps.setString(1,user.getLoginId());
     ps.setString(2,user.getUserName());
     ps.setString(3,user.getPassword());
     ps.setString(4, user.getUserType().toUpperCase());
     return ps.executeUpdate()==1;
     }
     public static boolean deleteUserByName(String name)throws SQLException{
     Connection conn=DBConnection2.getConnection();
     PreparedStatement ps=conn.prepareStatement("delete from users where user_name=?");
     ps.setString(1, name);
     return ps.executeUpdate()==1;
     }
     public static boolean updateUser(String prvLoginId,UserPojo user)throws SQLException{
         Connection conn=DBConnection2.getConnection();
         PreparedStatement ps=conn.prepareStatement("update users set login_id=?,user_name=?,password=? where login_id=?");
         ps.setString(1, user.getLoginId());
         ps.setString(2, user.getUserName());
         ps.setString(3,user.getPassword());
         ps.setString(4, prvLoginId);
         return ps.executeUpdate()==1;
     }
    
}
