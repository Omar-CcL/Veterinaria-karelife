
package control2;

public class ControllerFactory {
    
    public static Object createController(String type) {
        switch (type) {
            case "ClienteController":
                return new ClienteController();
            case "MascotaController":
                return new MascotaController();
            case "ServicioController":
                return new ServicioController();
            default:
                throw new IllegalArgumentException("Tipo de controlador no reconocido");
        }
    }
}
