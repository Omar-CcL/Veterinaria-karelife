
package control2;

import modelo2.Cliente;
import modelo2.ClienteService;

public class ClienteController {

    private ClienteService clienteService;
    private Cliente cliente;
    
    public ClienteController() {
        clienteService = new ClienteService();
        cliente = new Cliente();
    }

    public void registrarNuevoCliente(String nombre, String email, String telefono, String direccion) {
        cliente.setNombre(nombre);
        cliente.setEmail(email);
        cliente.setTelefono(telefono);
        cliente.setDireccion(direccion);
        
        clienteService.registrarCliente(cliente);
    }

    public Cliente obtenerClientePorId(int clienteId) {
        return clienteService.getClienteById(clienteId);
    }
}
