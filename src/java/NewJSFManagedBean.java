/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author swb4062
 */
@ManagedBean(name = "DatabaseMain")
@RequestScoped
public class NewJSFManagedBean {
    
    private String studentID, courseID, majorID, city, street, state, zip, courseDesc, majorDesc = "";

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public NewJSFManagedBean() {
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getMajorID() {
        return majorID;
    }

    public void setMajorID(String majorID) {
        this.majorID = majorID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getMajorDesc() {
        return majorDesc;
    }

    public void setMajorDesc(String majorDesc) {
        this.majorDesc = majorDesc;
    }
    
    
}
