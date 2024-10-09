
package control;

import modelo.Mascota;
import modelo.MascotaService;

public class MascotaController {
    
    private MascotaService mascotaService;
    private Mascota mascota;

    public MascotaController() {
        mascotaService = new MascotaService();
        mascota = new Mascota();
    }
    
    public void registrarNuevaMascota(String nombre, int especieId, int razaId, String fechaNacimiento, int clienteId) {
        mascota.setNombre(nombre);
        mascota.setEspecieId(especieId);
        mascota.setRazaId(razaId);
        mascota.setFechaNacimiento(fechaNacimiento);
        mascota.setClienteId(clienteId);

        mascotaService.registrarMascota(mascota);
    }

    public Mascota obtenerMascotaPorId(int mascotaId) {
        return mascotaService.getMascotaById(mascotaId);
    }
}
