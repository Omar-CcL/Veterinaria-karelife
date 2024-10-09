
package modelo2;

public class Raza extends AnimalPrototype {
    
    public Raza(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    @Override
    public AnimalPrototype clone() {
        return new Raza(this.nombre, this.estado);
    }
}
