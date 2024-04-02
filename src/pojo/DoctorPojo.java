/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Asus
 */
public class DoctorPojo {
    private String DoctorId;
    private String DoctorName;
    private String EmailId;
    private String Gender;
    private String ContactNo;
    private String Qualification;
    private String Specialist;

    public DoctorPojo() {
    }

    public String getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(String DoctorId) {
        this.DoctorId = DoctorId;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }

    public String getGender() {
        return Gender;
    }

    public DoctorPojo(String DoctorId, String DoctorName, String EmailId, String Gender, String ContactNo, String Qualification, String Specialist) {
        this.DoctorId = DoctorId;
        this.DoctorName = DoctorName;
        this.EmailId = EmailId;
        this.Gender = Gender;
        this.ContactNo = ContactNo;
        this.Qualification = Qualification;
        this.Specialist = Specialist;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public String getSpecialist() {
        return Specialist;
    }

    public void setSpecialist(String Specialist) {
        this.Specialist = Specialist;
    }

    
}
