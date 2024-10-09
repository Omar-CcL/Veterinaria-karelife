public abstract class AnimalPrototype implements Cloneable {
    protected String nombre;
    protected String estado;

    @Override
    public abstract AnimalPrototype clone();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

// Especie concreta
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

// Raza concreta
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
