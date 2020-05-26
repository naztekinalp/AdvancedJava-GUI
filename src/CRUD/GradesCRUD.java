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

public class GradesCRUD extends DatabaseProvider implements CRUD {

    public GradesCRUD() {
        super();
    }

    @Override
    public boolean Insert(Object object) {
        Grade s = new Grade();
        s = (Grade) object;
        String query = "insert into Grades values('"
                + s.getFullName() + "','"
                + s.getClassName() + "','"
                + s.getDepartment() + "','"
                + s.getStudentId() + "','"
                + s.getMidterm() + "','"
                + s.getFinal() + "','"
                + s.getTotalGrade() + "','"
                + s.getAbsenteme() + "');";

        if (DatabaseConnection.executeSqlQuery(query)) {

            return true;

        }
        return false;

    }

    @Override
    public boolean Update(Object object) {
        Grade s = new Grade();
        s = (Grade) object;
        String query = "UPDATE Grades  Set FullName='"
                + s.getFullName() + "',Class='"
                + s.getClassName() + "',Department='"
                + s.getDepartment() + "',MidTerm='"
                + s.getMidterm() + "',Final='"
                + s.getFinal() + "',TotalGrade='"
                + s.getTotalGrade() + "',ABSTENTEESM='"
                + s.getAbsenteme() + "' where StudentID='" + s.getStudentId() + "';";

        if (DatabaseConnection.executeSqlQuery(query)) {

            return true;

        }
        return false;

    }

    @Override
    public boolean Delete(String id) {
        String query = "Delete from Grades where StudentID='" + id + "'";
        if (DatabaseConnection.executeSqlQuery(query)) {
            return true;
        }

        return false;
    }

    public ArrayList<Grade> getAll() {
        ArrayList<Grade> list = new ArrayList<Grade>();
        String query = "Select * from Grades;";
        ResultSet rs = null;
        rs = DatabaseConnection.getResultOfSelection(query);

        try {

            while (rs.next()) {
                Grade g = new Grade();
                g.setFullName(rs.getString("FullName"));
                g.setClassName(rs.getString("Class"));
                g.setDepartment(rs.getString("Department"));
                g.setStudentId(rs.getString("StudentID"));
                g.setMidterm(rs.getString("MidTerm"));
                g.setFinal(rs.getString("Final"));
                g.setTotalGrade(rs.getString("TotalGrade"));
                g.setAbsenteme(rs.getString("Absenteesm"));
                list.add(g);

            }
        } catch (SQLException ex) {
            Logger.getLogger(GradesCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Grade> getAll(String name) {
        ArrayList<Grade> list = new ArrayList<Grade>();
        String query = "Select * from Grades where  FullName LIKE '" + name + "%' or StudentID LIKE '" + name + "%';";
        ResultSet rs = null;
        rs = DatabaseConnection.getResultOfSelection(query);

        try {

            while (rs.next()) {
                Grade g = new Grade();
                g.setFullName(rs.getString("FullName"));
                g.setClassName(rs.getString("Class"));
                g.setDepartment(rs.getString("Department"));
                g.setStudentId(rs.getString("StudentID"));
                g.setMidterm(rs.getString("MidTerm"));
                g.setFinal(rs.getString("Final"));
                g.setTotalGrade(rs.getString("TotalGrade"));
                g.setAbsenteme(rs.getString("Absenteesm"));
                list.add(g);

            }

        } catch (SQLException ex) {
            Logger.getLogger(GradesCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
