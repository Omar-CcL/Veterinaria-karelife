
package control;

import java.time.LocalDateTime;
import modelo.CitaService;
import modelo.Cliente;
import modelo.ClienteService;
import modelo.Mascota;
import modelo.MascotaService;

public class VeterinaryFacade {
    private CitaService citaService;
    private ClienteService clienteService;
    private MascotaService mascotaService;

    public VeterinaryFacade() {
        this.citaService = new CitaService();
        this.clienteService = new ClienteService();
        this.mascotaService = new MascotaService();
    }

    public void agendarCita(int clienteId, int mascotaId, int servicioId, LocalDateTime fechaCita) {
        Cliente cliente = clienteService.getClienteById(clienteId);
        Mascota mascota = mascotaService.getMascotaById(mascotaId);
        citaService.agendarCita(cliente, mascota, servicioId, fechaCita);
    }
}
