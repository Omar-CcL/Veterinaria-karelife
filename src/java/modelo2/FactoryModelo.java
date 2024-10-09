
package modelo2;

import java.sql.Connection;
import java.sql.SQLException;

public class FactoryModelo {
    private Connection connection;

    public FactoryModelo() throws SQLException {
        this.connection = Singleton.getInstance().getConnection();
    }

    public ClientesModelo getClientesModelo() {
        return new ClientesModelo(connection);
    }

}
