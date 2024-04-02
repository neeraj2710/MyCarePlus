/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbutil.DBConnection2;
import pojo.DoctorPojo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class DoctorsDao {
    public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection2.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update doctors set doctor_name=? where doctor_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
}
public static boolean addDoctor(DoctorPojo doc)throws SQLException{
     Connection conn=DBConnection2.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into doctors values(?,?,?,?,?,?,?)");
     ps.setString(1,doc.getDoctorId());
     ps.setString(2, doc.getDoctorName());
     ps.setString(3,doc.getEmailId());
     ps.setString(4, doc.getContactNo());
     ps.setString(5, doc.getQualification());
     ps.setString(7, doc.getSpecialist());
     ps.setString(6, doc.getGender());
     return ps.executeUpdate()==1;
}
public static String getNewDocId()throws  SQLException{
   Connection conn=DBConnection2.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select max(doctor_id) from doctors");
   rs.next();
   int docId=101;
   String id=rs.getString(1);
   if(id!=null){
       String num=id.substring(3);
       docId=Integer.parseInt(num)+1;
    }
   return "DOC"+docId;
} 
public static List<String> getAllDoctorId()throws SQLException
{
    Connection conn=DBConnection2.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select doctor_id from doctors");
    List<String>doctorList=new ArrayList<>();
    while(rs.next())
    {
        doctorList.add(rs.getString(1));
    }
    return doctorList;
}
public static boolean deleteDoctorById(String docId)throws SQLException{
     Connection conn=DBConnection2.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select doctor_name from doctors where doctor_id=?");
     ps.setString(1, docId);
     ResultSet rs=ps.executeQuery();
     rs.next();
     String docName=rs.getString(1);
     UserDao.deleteUserByName(docName);
     ps=conn.prepareStatement("Delete from doctors where doctor_id=?");
     ps.setString(1, docId);
     return ps.executeUpdate()==1;
}
public static List<DoctorPojo> getAllDoctorDetails()throws SQLException{
    Connection conn=DBConnection2.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from doctors order by doctor_id");
    List<DoctorPojo>docList=new ArrayList<>();
    while(rs.next()){
    DoctorPojo doc=new DoctorPojo();
    doc.setDoctorName(rs.getString("doctor_name"));
    doc.setContactNo(rs.getString("contact_no"));
    doc.setDoctorId(rs.getString("doctor_id"));
    doc.setEmailId(rs.getString("email_id"));
    doc.setQualification(rs.getString("qualification"));
    doc.setGender(rs.getString("gender"));
    doc.setSpecialist(rs.getString("specialist"));
    docList.add(doc);
    
    
    }
    return docList;
} 
public static String getDoctorNameById(String docId)throws SQLException{
    Connection conn=DBConnection2.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select doctor_name from doctors where doctor_id=?");
    ps.setString(1,docId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    return rs.getString(1);
    
 } 
public static boolean updateDoctor(DoctorPojo doc)throws SQLException{
     Connection conn=DBConnection2.getConnection();
      
     PreparedStatement ps=conn.prepareStatement("update doctors set doctor_name=?,email_id=?,contact_no=?,gender=? where doctor_id=?");
     ps.setString(1, doc.getDoctorName());
     ps.setString(2, doc.getEmailId());
     ps.setString(3, doc.getContactNo());
     ps.setString(4, doc.getGender());
     ps.setString(5, doc.getDoctorId());
     return ps.executeUpdate()==1;
}
public static DoctorPojo getDocDetailsById(String docId)throws SQLException{
    Connection conn=DBConnection2.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from doctors where doctor_id=?");
        ps.setString(1,docId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        DoctorPojo rec= new DoctorPojo();
        rec.setDoctorId(rs.getString("doctor_id"));
        rec.setDoctorName(rs.getString("doctor_name"));
        rec.setEmailId(rs.getString("email_id"));
        rec.setContactNo(rs.getString("contact_no"));
        rec.setQualification(rs.getString("qualification"));
        rec.setGender(rs.getString("gender"));
        rec.setSpecialist(rs.getString("specialist"));
        
        return rec;
}
}
