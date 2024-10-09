
package control2;

import java.sql.Connection;
import java.sql.SQLException;

public class FactoryControl {
    private Connection connection;

    public FactoryControl(Connection connection) {
        this.connection = connection;
    }

}


