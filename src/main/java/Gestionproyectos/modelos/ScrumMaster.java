package gestionproyectos.modelos;
import gestionproyectos.interfaces.GestionarProyectos;

public class ScrumMaster implements GestionarProyectos {
    private Proyecto proyecto;

    public ScrumMaster(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Proyecto getProyecto() { return proyecto; }

    @Override
    public String planificar(Proyecto p) {
        return "Scrum Master planificando sprint para: " + p.getNombre();
    }
    @Override
    public String asignarTareas(Proyecto p) {
        return "Asignando historias de usuario basadas en: " + p.getDescripcion();
    }
    @Override
    public String entregarResultado(Proyecto p) {
        return "Entregando incremento funcional de: " + p.getNombre();
    }
}