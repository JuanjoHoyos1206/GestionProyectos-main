package gestionproyectos.controladores;

import gestionproyectos.interfaces.GestionarProyectos;
import gestionproyectos.modelos.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProyectoController {

    @GetMapping("/")
    public String mostrarProyectos(Model model) {
        List<GestionarProyectos> listaObjetos = new ArrayList<>();

        // 3 objetos ScrumMaster
        listaObjetos.add(new ScrumMaster(new Proyecto("App Móvil", "Frontend en Android")));
        listaObjetos.add(new ScrumMaster(new Proyecto("API Rest", "Backend en Spring Boot")));
        listaObjetos.add(new ScrumMaster(new Proyecto("Web Portal", "Diseño responsivo")));

        // 3 objetos DirectorProyecto
        listaObjetos.add(new DirectorProyecto(new Proyecto("Migración Nube", "Traslado a servidores AWS")));
        listaObjetos.add(new DirectorProyecto(new Proyecto("Renovación IT", "Compra de nuevos equipos")));
        listaObjetos.add(new DirectorProyecto(new Proyecto("Auditoría", "Revisión de seguridad")));

        // 3 objetos LiderTecnico
        listaObjetos.add(new LiderTecnico(new Proyecto("Machine Learning", "Modelo de predicción")));
        listaObjetos.add(new LiderTecnico(new Proyecto("Base de Datos", "Optimización en SQL")));
        listaObjetos.add(new LiderTecnico(new Proyecto("Microservicios", "Implementación con Docker")));

        model.addAttribute("listaGestion", listaObjetos);

        return "proyectos";
    }
}