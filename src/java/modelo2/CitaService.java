
package modelo2;

import java.time.LocalDateTime;

public class CitaService {
    
    public void agendarCita(Cliente cliente, Mascota mascota, int servicioId, LocalDateTime fechaCita) {
        // Lógica para agendar una cita, posiblemente interactuando con la base de datos
        System.out.println("Cita agendada para el cliente " + cliente.getNombre() + " con la mascota " + mascota.getNombre() + " para el servicio " + servicioId + " en la fecha " + fechaCita);
    }
}
