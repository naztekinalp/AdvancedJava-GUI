package BussinessLogic;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.jdbc.EmbeddedDriver;

public class DatabaseConnection {

   
    private static Connection conn;
    private static PreparedStatement pstmt;
    private static Statement stmt;
    private static ResultSet rs = null;

    public static void closeConnection() {
        try {
            conn.commit();
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
        } catch (SQLException ex) {
            if (((ex.getErrorCode() == 50000)
                    && ("XJ015".equals(ex.getSQLState())))) {
  
            } else {
                System.err.println("Derby did not shut downnormally");
                System.err.println(ex.getMessage());
            }
        }
    }

    public static boolean executeSqlQuery(String query) {

        boolean chk = false;
        try {
            OpenConnection();
            chk = stmt.execute(query.replaceAll(";", ""));

            conn.commit();

        } catch (SQLException ex) {
            System.out.println("in connection" + ex);
        }

        closeConnection();
        return chk;
    }

    public static ResultSet getResultOfSelection(String query) {
        OpenConnection();
        try {

            rs = stmt.executeQuery(query.replaceAll(";", ""));
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    public static void OpenConnection() {
        try {
            Driver derbyEmbeddedDriver = new EmbeddedDriver();
            DriverManager.registerDriver(derbyEmbeddedDriver);
            conn = DriverManager.getConnection("jdbc:derby:database;create=true");
            stmt = conn.createStatement();

        } catch (SQLException ex) {
            System.out.println("in connection" + ex);
        }

    }
}
