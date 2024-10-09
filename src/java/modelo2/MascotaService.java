
package modelo2;

public class MascotaService {
    
    public Mascota getMascotaById(int mascotaId) {
        // Aquí iría la lógica para recuperar una mascota de la base de datos
        Mascota mascota = new Mascota();
        mascota.setMascotaId(mascotaId);
        mascota.setNombre("Firulais");
        mascota.setEspecieId(1);
        mascota.setRazaId(2);
        return mascota;
    }

    public void registrarMascota(Mascota mascota) {
        // Lógica para registrar una nueva mascota
        System.out.println("Mascota registrada: " + mascota.getNombre());
    }
}
