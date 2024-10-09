
package control;

import modelo.Cliente;
import modelo.Mascota;
import modelo.Servicio;

public class EntityFactory {
    
    public static Object createEntity(String type) {
        switch (type) {
            case "Cliente":
                return new Cliente();
            case "Mascota":
                return new Mascota();
            case "Servicio":
                return new Servicio();
            default:
                throw new IllegalArgumentException("Tipo de entidad no reconocido");
        }
    }
}
