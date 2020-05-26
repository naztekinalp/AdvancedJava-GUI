package BussinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginAuthenticator {

    public LoginAuthenticator() {

    }

    public boolean authenticateUser(String username, String password, int type) {
        String typeUser = "";
        String query = "";
        switch (type) {
            case 0:
                typeUser = "Student";
                break;
            case 1:
                typeUser = "Admin";
                break;
            case 2:
                typeUser = "Lec";
                break;

        }
        query = "Select*from Users where userName= '" + username + "' and password='" + password + "' and userType='" + typeUser + "';";
        if (typeUser.equals("Student")) {
            return true;
        }
        if (!typeUser.isEmpty()) {
            try {
                ResultSet rs;

                rs = DatabaseConnection.getResultOfSelection(query);

                int rowcount = 0;
                while ((rs.next())) {
                    DatabaseConnection.closeConnection();
                    
                    return true;

                }
                DatabaseConnection.closeConnection();
                

                return false;
            } catch (SQLException ex) {
                Logger.getLogger(LoginAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        DatabaseConnection.closeConnection();
        return false;
    }

}
