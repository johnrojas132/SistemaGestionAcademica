/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestoracademica;

/**
 *
 * @author efer0
 */

import java.util.ArrayList; 

public class GestorPersonas {

    private ArrayList<Persona> listaPersonas;

    public GestorPersonas() {
        this.listaPersonas = new ArrayList<>();
    }

    /**
     * Valida que un campo de texto no sea nulo ni vacío.
     * Usa throws para propagar DatoInvalidoException al método que lo llame.
     */
    public static void validarCampo(String valor, String nombreCampo) throws DatoInvalidoException {
        if (valor == null || valor.trim().isEmpty()) {
            throw new DatoInvalidoException("El campo '" + nombreCampo + "' no puede estar vacío.");
        }
    }

    /**
     * Registra un estudiante aplicando validaciones.
     * Propaga DatoInvalidoException si algún dato es inválido.
     */
    public void registrarEstudiante(String nombre, String id, Direccion direccion, String carrera)
            throws DatoInvalidoException {
        try {
            validarCampo(nombre, "nombre");
            validarCampo(id, "identificación");
            validarCampo(carrera, "carrera");
        } catch (DatoInvalidoException e) {
            // Se relanza con más contexto — demostración de sucesión de excepciones
            throw new DatoInvalidoException("Error al registrar estudiante: " + e.getMessage());
        }
        Estudiante estudiante = new Estudiante(nombre, id, direccion, carrera);
        agregarPersona(estudiante);
    }

    /**
     * Registra un docente aplicando validaciones.
     * Propaga DatoInvalidoException si algún dato es inválido.
     */
    public void registrarDocente(String nombre, String id, Direccion direccion, String especialidad)
            throws DatoInvalidoException {
        try {
            validarCampo(nombre, "nombre");
            validarCampo(id, "identificación");
            validarCampo(especialidad, "especialidad");
        } catch (DatoInvalidoException e) {
            throw new DatoInvalidoException("Error al registrar docente: " + e.getMessage());
        }
        Docente docente = new Docente(nombre, id, direccion, especialidad);
        agregarPersona(docente);
    }

    public void agregarPersona(Persona persona) {
        // IllegalArgumentException — excepción propia de Java (RuntimeException)
        if (persona == null) {
            throw new IllegalArgumentException("No se puede agregar una persona nula.");
        }
        listaPersonas.add(persona);
        System.out.println(" Persona registrada: " + persona.getNombre());
    }

    public void mostrarTodas() {
        if (listaPersonas.isEmpty()) {
            System.out.println("No hay personas registradas.");
            return;
        }
        System.out.println("\n===== LISTA DE PERSONAS REGISTRADAS =====");
        for (Persona p : listaPersonas) {
            System.out.println("-----------------------------------------");
            p.mostrarIdentificacion();
            p.describirRol();
            ejecutarEvaluar(p);
        }
        System.out.println("=========================================\n");
    }

    public Persona buscarPorIdentificacion(String id) throws DatoInvalidoException {
        // Validamos que el ID ingresado no esté vacío
        validarCampo(id, "identificación a buscar");
        for (Persona p : listaPersonas) {
            if (p.getIdentificacion().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public void ejecutarEvaluar(Persona p) {
        if (p instanceof Evaluable) {
            ((Evaluable) p).evaluar();
        }
    }

    public void mostrarRoles() {
        System.out.println("\n===== ROLES =====");
        for (Persona p : listaPersonas) {
            p.describirRol();
        }
        System.out.println("=================\n");
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }
}
