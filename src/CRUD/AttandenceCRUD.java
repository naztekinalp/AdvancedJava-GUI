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

public class AttandenceCRUD extends DatabaseProvider implements CRUD {

    public AttandenceCRUD() {
        super();
    }

    @Override
    public boolean Insert(Object object) {

        Attandence atn = new Attandence();
        atn = (Attandence) object;
        String query = "insert into Attandance values('"
                + atn.getStudentID() + "','"
                + atn.getStudentName() + "','Dept','abc','xyz','"
                + atn.getPresenceStatus() + "');";

        if (DatabaseConnection.executeSqlQuery(query)) {

            return true;

        }
        return false;
    }

    @Override
    public boolean Update(Object object) {
        Attandence atn = new Attandence();
        atn = (Attandence) object;
        String query = "UPDATE  Attandance set StudentName='"
                + atn.getStudentName() + "',Department='"
                + atn.getDepartment() + "',CourseName='"
                + atn.getCourseName() + "',CourseID='"
                + atn.getCourseID() + "',PresenceStat='"
                + atn.getPresenceStatus() + "' where Student ID='" + atn.getStudentID() + "';";

        if (DatabaseConnection.executeSqlQuery(query)) {

            return true;

        }
        return false;

    }

    @Override
    public boolean Delete(String id) {
        String query = "delete from Attandence where StudentID='" + id + "'";
        if (DatabaseConnection.executeSqlQuery(query)) {
            return true;
        }
        return false;

    }

    public ArrayList<Attandence> getAttandence() {
        ArrayList<Attandence> list = new ArrayList<Attandence>();
        ResultSet rs = null;
        String query = "Select*from Attandance;";
        rs = DatabaseConnection.getResultOfSelection(query);
        try {

            while (rs.next()) {
                Attandence atn = new Attandence();
                atn.setStudentID(rs.getString("StudentID"));
                atn.setStudentName(rs.getString("StudentName"));
                atn.setDepartment(rs.getString("Department"));
                atn.setCourseName(rs.getString("CourseName"));
                atn.setCourseID(rs.getString("CourseID"));
                atn.setPresenceStatus(rs.getString("PresenceStatus"));
                list.add(atn);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LectureCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Attandence> getAttandence(String sName, String cName) {
        ArrayList<Attandence> list = new ArrayList<Attandence>();
        ResultSet rs = null;
        String query = "Select*from Attandance where StudentName='" + sName + "' and CourseName='" + cName + "';";
        rs = DatabaseConnection.getResultOfSelection(query);
        try {
            if (rs.isFirst()) {
                while (rs.next()) {
                    Attandence atn = new Attandence();
                    atn.setStudentID(rs.getString(0));
                    atn.setStudentName(rs.getString(1));
                    atn.setDepartment(rs.getString(2));
                    atn.setCourseName(rs.getString(3));
                    atn.setCourseID(rs.getString(4));
                    atn.setPresenceStatus(rs.getString(5));
                    list.add(atn);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LectureCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
