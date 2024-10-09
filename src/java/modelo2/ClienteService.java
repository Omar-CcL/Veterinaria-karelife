
package modelo2;

public class ClienteService {
    
    
    
    public Cliente getClienteById(int clienteId) {
        // Aquí iría la lógica para recuperar un cliente de la base de datos
        Cliente cliente = new Cliente();
        cliente.setClienteId(clienteId);
        cliente.setNombre("Juan Perez");
        cliente.setEmail("juan@example.com");
        cliente.setTelefono("123456789");
        return cliente;
    }

    public void registrarCliente(Cliente cliente) {
        // Lógica para registrar un nuevo cliente
        System.out.println("Cliente registrado: " + cliente.getNombre());
    }
}
