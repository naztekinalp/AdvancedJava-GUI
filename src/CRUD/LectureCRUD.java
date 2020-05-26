/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import BussinessLogic.DatabaseConnection;
import BussinessLogic.DatabaseProvider;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LectureCRUD extends DatabaseProvider implements CRUD {

    public LectureCRUD() {
        super();

    }

    @Override
    public boolean Insert(Object object) {
        Lecture lec = new Lecture();
        lec = (Lecture) object;
        String query = "insert into Lecture values('"
                + lec.getId() + "','"
                + lec.getLectureName() + "','"
                + lec.getCourseName() + "','"
                + lec.getCourseDescription() + "','"
                + lec.getDepartment() + "','"
                + lec.getClassName() + "','"
                + lec.getTime() + "');";

        if (DatabaseConnection.executeSqlQuery(query)) {

            return true;

        }
        return false;

    }

    @Override
    public boolean Update(Object object) {
        Lecture lec = new Lecture();
        lec = (Lecture) object;
        String query = "Update Lecture set LecturerName='"
                + lec.getLectureName() + "',courseName='"
                + lec.getCourseName() + "',courseDescription='"
                + lec.getCourseDescription() + "',department='"
                + lec.getDepartment() + "',className='"
                + lec.getClassName() + "',time='"
                + lec.getTime() + "' where id='"
                + lec.getId() + "';";

        if (DatabaseConnection.executeSqlQuery(query)) {

            return true;

        }
        return false;
    }

    @Override
    public boolean Delete(String id) {
        String query = "delete from Lecture where id='" + id + "'";
        if (DatabaseConnection.executeSqlQuery(query)) {
            return true;
        }
        return false;

    }

    public ArrayList<Lecture> getAllLecture() {
        ArrayList<Lecture> list = new ArrayList<Lecture>();
        ResultSet rs = null;
        String query = "Select*from Lecture";
        rs = DatabaseConnection.getResultOfSelection(query);
        try {

            while (rs.next()) {
                Lecture lec = new Lecture();
                lec.setId(rs.getString("id"));
                lec.setLectureName(rs.getString("lecturerName"));
                lec.setCourseName(rs.getString("courseName"));
                lec.setCourseDescription(rs.getString("courseDescription"));
                lec.setClassName(rs.getString("department"));
                lec.setDepartment(rs.getString("className"));
                lec.setTime(rs.getString("time"));
                list.add(lec);

            }

        } catch (SQLException ex) {
            Logger.getLogger(LectureCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Lecture> getAllLecture(String lecturerName) {
        ArrayList<Lecture> list = new ArrayList<Lecture>();
        ResultSet rs = null;
        String query = "Select*from Lecture where lecturerName='" + lecturerName + "';";
        rs = DatabaseConnection.getResultOfSelection(query);
        try {
            if (rs.isFirst()) {
                while (rs.next()) {
                    Lecture lec = new Lecture();
                    lec.setId(rs.getString("id"));
                    lec.setLectureName(rs.getString("lecturerName"));
                    lec.setCourseName(rs.getString("courseName"));
                    lec.setCourseDescription(rs.getString("courseDescription"));
                    lec.setClassName(rs.getString("department"));
                    lec.setDepartment(rs.getString("className"));
                    lec.setId(rs.getString("time"));
                    lec.setId(rs.getString(6));

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LectureCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
