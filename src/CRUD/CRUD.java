/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

public interface CRUD {

    public boolean Insert(Object object);

    public boolean Update(Object object);

    public boolean Delete(String id);

}
