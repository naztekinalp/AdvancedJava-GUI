
package CRUD;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Student extends User {

    String id, cgpa, yearEnrolled, department, className;

    public Student() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        if ((cgpa.matches("[0-9]+")) && cgpa.length() > 1) {
            if (Double.parseDouble(cgpa) > 4.00) {
                try {
                    throw new ExceptionStudent("CGPDA must not Greater Then 4.00 ");
                } catch (ExceptionStudent ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        this.cgpa = cgpa;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getYearEnrolled() {
        return yearEnrolled;
    }

    public void setYearEnrolled(String yearEnrolled) {
        this.yearEnrolled = yearEnrolled;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
