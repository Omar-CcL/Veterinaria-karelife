
package modelo2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientesModelo {
    private Connection connection;
    
    public ClientesModelo(Connection connection) {
        this.connection = connection;
    }

    public List<Cliente> ejecutarSP(String accion, Cliente cliente, Integer clienteId) throws SQLException {
        String sql = "{call usp_Clientes(?, ?, ?, ?, ?, ?, ?)}";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, accion);

            if ("Insert".equals(accion)) {
                stmt.setString(3, cliente.getNombre());
                stmt.setString(4, cliente.getEmail());
                stmt.setString(5, cliente.getTelefono());
                stmt.setString(6, cliente.getDireccion());
                stmt.setObject(7, cliente.getEstadoId(), java.sql.Types.INTEGER);
                stmt.executeUpdate();
                return null; // o lanzar una excepción si es necesario

            } else if ("Update".equals(accion)) {
                stmt.setInt(2, clienteId);
                stmt.setString(3, cliente.getNombre());
                stmt.setString(4, cliente.getEmail());
                stmt.setString(5, cliente.getTelefono());
                stmt.setString(6, cliente.getDireccion());
                stmt.setObject(7, cliente.getEstadoId(), java.sql.Types.INTEGER);
                stmt.executeUpdate();
                return null; // o lanzar una excepción si es necesario

            } else if ("Select".equals(accion)) {
                ResultSet rs = stmt.executeQuery();
                List<Cliente> clientes = new ArrayList<>();
                while (rs.next()) {
                    Cliente c = new Cliente(
                        rs.getInt("cliente_id"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("telefono"),
                        rs.getString("direccion"),
                        rs.getInt("estado_id")
                    );
                    clientes.add(c);
                }
                return clientes;

            } else if ("Status".equals(accion)) {
                stmt.setInt(2, clienteId);
                stmt.setInt(3, cliente.getEstadoId());
                stmt.executeUpdate();
                return null;
            }
        }
        return null;
    }
}

