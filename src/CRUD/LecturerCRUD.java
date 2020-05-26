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

public class LecturerCRUD extends DatabaseProvider implements CRUD {

    public LecturerCRUD() {
        super();
    }

    @Override
    public boolean Insert(Object object) {
        Lecturer lec = new Lecturer();
        lec = (Lecturer) object;
        String query = "insert into Lecturer values('"
                + lec.getId() + "','"
                + lec.getUserName() + "','"
                + lec.getDepartment() + "','"
                + lec.getQualification() + "');";
        String query2 = "insert into users values('"
                + lec.getId() + "','"
                + lec.getUserName() + "','"
                + lec.getPassword() + "','LECTURER');";
        if (DatabaseConnection.executeSqlQuery(query)) {
            if (DatabaseConnection.executeSqlQuery(query2)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean Update(Object object) {

        Lecturer lec = new Lecturer();
        lec = (Lecturer) object;
        String query = "UPDATE  Lecturer set userName='"
                + lec.getUserName() + "',department='"
                + lec.getDepartment() + "',qualification='"
                + lec.getQualification() + "' where id='" + lec.getId() + "';";

        if (DatabaseConnection.executeSqlQuery(query)) {

            return true;

        }
        return false;
    }

    @Override
    public boolean Delete(String id) {
        String query = "delete from Lecturer where id='" + id + "'";
        if (DatabaseConnection.executeSqlQuery(query)) {
            return true;
        }
        return false;
    }

    public ArrayList<Lecturer> getAllLecturer() {
        ArrayList<Lecturer> list = new ArrayList<Lecturer>();
        ResultSet rs;
        String query = "Select *From Lecturer;";
        rs = DatabaseConnection.getResultOfSelection(query);
        try {

            while (rs.next()) {
                Lecturer lec = new Lecturer();
                lec.setId(rs.getString("id"));
                lec.setUserName(rs.getString("userName"));
                lec.setDepartment(rs.getString("department"));
                lec.setQualification(rs.getString("qualification"));
                list.add(lec);

            }

        } catch (SQLException ex) {
            Logger.getLogger(LecturerCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Lecturer> getAllLecturer(String id) {
        ArrayList<Lecturer> list = new ArrayList<Lecturer>();
        ResultSet rs;
        String query = "Select *From Lecturer where userName LIKE '" + id + "%';";
        rs = DatabaseConnection.getResultOfSelection(query);
        try {

            while (rs.next()) {
                Lecturer lec = new Lecturer();
                lec.setId(rs.getString("id"));
                lec.setUserName(rs.getString("userName"));
                lec.setDepartment(rs.getString("department"));
                lec.setQualification(rs.getString("qualification"));
                list.add(lec);

            }

        } catch (SQLException ex) {
            Logger.getLogger(LecturerCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
