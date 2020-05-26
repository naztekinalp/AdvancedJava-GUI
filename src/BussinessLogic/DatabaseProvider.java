
package BussinessLogic;

public abstract class DatabaseProvider {

    public static DatabaseConnection dbCon;

    public DatabaseProvider() {
        dbCon = new DatabaseConnection();
    }

}
