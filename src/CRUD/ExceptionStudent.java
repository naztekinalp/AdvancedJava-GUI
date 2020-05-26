/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

public class ExceptionStudent extends Exception {

    public ExceptionStudent(String message) {
        super(message);
        System.out.println(message);
    }

}
