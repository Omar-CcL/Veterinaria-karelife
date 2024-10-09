
package modelo2;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Singleton {
    private static Singleton instance;
    private DataSource dataSource;

    private Singleton() {
        try {
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env");
            dataSource = (DataSource) envContext.lookup("jdbc/ClinicaVeterinaria");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    
    //Para la conexion
    //Connection conn = DatabaseConnection.getInstance().getConnection();
}
