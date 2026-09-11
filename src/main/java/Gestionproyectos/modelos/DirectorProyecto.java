package gestionproyectos.modelos;
import gestionproyectos.interfaces.GestionarProyectos;

public class DirectorProyecto implements GestionarProyectos {
    private Proyecto proyecto;

    public DirectorProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Proyecto getProyecto() { return proyecto; }

    @Override
    public String planificar(Proyecto p) {
        return "Director definiendo cronograma general para: " + p.getNombre();
    }
    @Override
    public String asignarTareas(Proyecto p) {
        return "Delegando recursos para cumplir con: " + p.getDescripcion();
    }
    @Override
    public String entregarResultado(Proyecto p) {
        return "Presentando reporte final a gerencia sobre: " + p.getNombre();
    }
}