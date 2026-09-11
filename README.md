# Polimorfismo e Interfaces: Gestión de Proyectos

**Estudiante:** Juan José Hoyos Escobar (Estudiante #10)  
**Institución:** Politécnico Colombiano Jaime Isaza Cadavid  
**Materia:** Construcción de Software

## Descripción del Proyecto
Este proyecto es una aplicación web desarrollada con Spring Boot y Thymeleaf que demuestra los conceptos fundamentales de la programación orientada a objetos, específicamente el uso de **Polimorfismo** y **Herencia de Interfaces** en Java.

La temática asignada para este desarrollo es **"Gestionar Proyectos"**, transitando objetos de la clase base `Proyecto`.

## Requerimientos Cumplidos
De acuerdo con las especificaciones del documento del trabajo:
1. **Herencia de Interfaces:** Se crearon 3 interfaces base (`InterfazPlanificar`, `InterfazAsignar`, `InterfazEntregar`), cada una con su método respectivo que recibe un objeto `Proyecto`.
2. **Jerarquía de Herencias:** Se implementó una interfaz principal `GestionarProyectos` que hereda de las 3 interfaces anteriores.
3. **Clases Concretas:** Se codificaron 3 clases (`ScrumMaster`, `DirectorProyecto`, `LiderTecnico`) que implementan la interfaz principal y procesan la información de los atributos del proyecto a través de sus constructores.
4. **Polimorfismo:** En el controlador se instanciaron 9 objetos diferentes (3 de cada clase concreta).
5. **Vistas:** Se muestra toda la información generada de los métodos heredados en un archivo HTML utilizando `Thymeleaf` y estilizado con `Bootstrap 5`. Todo el código lógico se maneja en el controlador, manteniendo el método `main` intacto.

## Tecnologías Utilizadas
* **Java** (JDK)
* **Spring Boot** (Spring Web, Spring Boot DevTools)
* **Thymeleaf** (Motor de plantillas)
* **HTML5 / CSS3 / Bootstrap 5**

## Cómo ejecutar el proyecto
1. Importar el proyecto en IntelliJ IDEA (o el IDE de preferencia).
2. Sincronizar las dependencias de Maven (`pom.xml`).
3. Ejecutar la clase principal `GestionProyectosApplication.java`.
4. Abrir el navegador e ingresar a la ruta: `http://localhost:8080/`