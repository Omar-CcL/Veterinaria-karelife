
package control2;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import modelo2.Cliente;
import modelo2.FactoryModelo;

public class ControladorClientes {
    private Connection connection;
    private FactoryModelo factoryModelo;

    public ControladorClientes(Connection connection) throws SQLException {
        this.connection = connection;
        this.factoryModelo = new FactoryModelo();
    }

    public void agregarCliente(Cliente cliente) throws SQLException {
        factoryModelo.getClientesModelo().ejecutarSP("Insert", cliente, null);
    }

    public void actualizarCliente(Cliente cliente) throws SQLException {
        factoryModelo.getClientesModelo().ejecutarSP("Update", cliente, cliente.getId());
    }

    public List<Cliente> listarClientes() throws SQLException {
        return factoryModelo.getClientesModelo().ejecutarSP("Select", null, null);
    }

    public void cambiarEstadoCliente(int clienteId, int estadoId) throws SQLException {
        factoryModelo.getClientesModelo().ejecutarSP("Status", new Cliente(clienteId, null, null, null, null, estadoId), clienteId);
    }
}

