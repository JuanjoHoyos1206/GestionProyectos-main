package gestionproyectos.modelos;

public class Proyecto {
    private String nombre;
    private String descripcion;

    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
}