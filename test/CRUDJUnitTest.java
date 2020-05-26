/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CRUD.Student;
import CRUD.StudentCRUD;
import org.junit.Test;
import static org.junit.Assert.*;

public class CRUDJUnitTest {

    @Test
    public void testIt() throws Exception {

        StudentCRUD s = new StudentCRUD();
        Student std = new Student();
        std.setId("123");
        std.setUserName("testing");
        std.setYearEnrolled("2018");
        std.setDepartment("CS");
        try {
            System.out.println("Test Started");
            s.Insert(std);

            assertEquals("testing", s.getAllStudents(std.getId()).get(0).getUserName());
            std.setUserName("TestUpdated");
            System.out.println("Test Insertion Passsed");
            s.Update(std);

            assertEquals("TestUpdated", s.getAllStudents(std.getId()).get(0).getUserName());
            System.out.println("Test Updation Passed");
            s.Delete(std.getId());

            assertEquals(0, s.getAllStudents(std.getId()).size());
            System.out.println("Test Deletion Passsed");
            System.out.println("All Test Passsed");

        } finally {
        }
    }
}
