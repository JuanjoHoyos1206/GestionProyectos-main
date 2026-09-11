package gestionproyectos.modelos;
import gestionproyectos.interfaces.GestionarProyectos;

public class LiderTecnico implements GestionarProyectos {
    private Proyecto proyecto;

    public LiderTecnico(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Proyecto getProyecto() { return proyecto; }

    @Override
    public String planificar(Proyecto p) {
        return "Líder Técnico diseñando arquitectura para: " + p.getNombre();
    }
    @Override
    public String asignarTareas(Proyecto p) {
        return "Asignando tickets de desarrollo técnico para: " + p.getDescripcion();
    }
    @Override
    public String entregarResultado(Proyecto p) {
        return "Desplegando a producción el código de: " + p.getNombre();
    }
}