
package modelo2;

public class Especie extends AnimalPrototype {
    
    public Especie(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    @Override
    public AnimalPrototype clone() {
        return new Especie(this.nombre, this.estado);
    }
}
