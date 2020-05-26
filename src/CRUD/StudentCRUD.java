
package CRUD;

import BussinessLogic.DatabaseConnection;
import BussinessLogic.DatabaseProvider;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentCRUD extends DatabaseProvider implements CRUD {

    public StudentCRUD() {

    }

   
    public ArrayList<Student> getAllStudents(String id) {

        ArrayList<Student> list = new ArrayList<Student>();
        String query = "Select * from Student where StudentID='" + id + "';";
        try {

            ResultSet rs = DatabaseConnection.getResultOfSelection(query);

            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getString("StudentID"));
                s.setName(rs.getString("StudentName"));
                s.setCgpa(rs.getString("CGPA"));
                s.setClassName(rs.getString("Class"));
                s.setDepartment(rs.getString("Department"));
                s.setYearEnrolled(rs.getString("YearEnrolled"));
                list.add(s);

            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public boolean Insert(Object object) {
        Student s;
        s = (Student) object;
        String query = "insert into student values('"
                + s.getId() + "','"
                + s.getName() + "','"
                + s.getCgpa() + "','"
                + s.getClassName() + "','"
                + s.getDepartment() + "','"
                + s.getYearEnrolled() + "');";
        String query2 = "insert into users values('"
                + s.getId() + "','"
                + s.getName() + "','1234','Student');";
        if (DatabaseConnection.executeSqlQuery(query)) {
            if (DatabaseConnection.executeSqlQuery(query2)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean Update(Object object) {
        Student s;
        s = (Student) object;
        String query = "update student set StudentName='"
                + s.getName() + "',CGPA='"
                + s.getCgpa() + "',Class='"
                + s.getClassName() + "',Department='"
                + s.getDepartment() + "',YearEnrolled='"
                + s.getYearEnrolled() + "' where StudentID='" + s.getId() + "';";

        if (DatabaseConnection.executeSqlQuery(query)) {

            return true;

        }
        return false;
    }

    @Override
    public boolean Delete(String id) {

        String query = "Delete from Student where StudentID='" + id + "'";
        if (DatabaseConnection.executeSqlQuery(query)) {
            return true;
        }

        return false;
    }

    public ArrayList<Student> getAll() {
        ArrayList<Student> list = new ArrayList<>();
        String query = "Select * from Student";
        try {

            ResultSet rs = DatabaseConnection.getResultOfSelection(query);

            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getString("StudentID"));
                s.setName(rs.getString("StudentName"));
                s.setCgpa(rs.getString("CGPA"));
                s.setClassName(rs.getString("Class"));
                s.setDepartment(rs.getString("Department"));
                s.setYearEnrolled(rs.getString("YearEnrolled"));
                list.add(s);

            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public ArrayList<Student> getAll(String search) {
        ArrayList<Student> list = new ArrayList<Student>();
        String query = "Select * from Student where StudentID LIKE '" + search + "%' or StudentName LIKE '" + search + "%' or Class LIKE '" + search + "%';";
        try {

            ResultSet rs = DatabaseConnection.getResultOfSelection(query);

            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getString("StudentID"));
                s.setName(rs.getString("StudentName"));
                s.setCgpa(rs.getString("CGPA"));
                s.setClassName(rs.getString("Class"));
                s.setDepartment(rs.getString("Department"));
                s.setYearEnrolled(rs.getString("YearEnrolled"));
                list.add(s);

            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

}
