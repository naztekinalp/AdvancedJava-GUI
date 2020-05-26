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

public class CourseCRUD extends DatabaseProvider implements CRUD {

    public CourseCRUD() {
        super();
    }

    @Override
    public boolean Insert(Object object) {
        Course c = (Course) object;
        String query = "insert into course values('" + c.getId() + "','" + c.getName() + ",'" + c.getDescription() + "');";
        if (DatabaseConnection.executeSqlQuery(query)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean Update(Object object) {
        Course c = (Course) object;
        String query = "UPDATE  Course set CourseName='" + c.getName() + ",Description='" + c.getDescription() + "' where CourseID='" + c.getId() + "' ;";
        if (DatabaseConnection.executeSqlQuery(query)) {
            return true;
        }
        return false;

    }

    @Override
    public boolean Delete(String id) {

        String query = "DELETE from  Course  where CourseID='" + id + "' ;";
        if (DatabaseConnection.executeSqlQuery(query)) {
            return true;
        }
        return false;
    }

    public ArrayList<Course> getAll() {
        ArrayList<Course> list = new ArrayList<Course>();

        try {

            String query = "Select * from Course;";
            ResultSet rs = DatabaseConnection.getResultOfSelection(query);
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    Course c = new Course();
                    c.setId(rs.getString(0));
                    c.setName(rs.getString(1));
                    c.setDescription(rs.getString(2));
                    list.add(c);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
