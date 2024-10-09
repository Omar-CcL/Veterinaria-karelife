
package modelo2;

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
