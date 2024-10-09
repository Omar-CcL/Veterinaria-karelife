
package control2;

import java.sql.SQLException;
import java.util.List;
import modelo2.Cliente;
import java.sql.Connection;

public class FacadeSistemaClinicaVeterinaria {
    private ControladorClientes controladorClientes;

    public FacadeSistemaClinicaVeterinaria(Connection connection) throws SQLException {
        this.controladorClientes = new ControladorClientes(connection);
    }

    public void agregarCliente(Cliente cliente) throws SQLException {
        controladorClientes.agregarCliente(cliente);
    }

    public void actualizarCliente(Cliente cliente) throws SQLException {
        controladorClientes.actualizarCliente(cliente);
    }

    public List<Cliente> listarClientes() throws SQLException {
        return controladorClientes.listarClientes();
    }

    public void cambiarEstadoCliente(int clienteId, int estadoId) throws SQLException {
        controladorClientes.cambiarEstadoCliente(clienteId, estadoId);
    }
}



