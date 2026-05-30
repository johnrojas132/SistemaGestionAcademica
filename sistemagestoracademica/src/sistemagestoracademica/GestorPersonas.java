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

    // Agrega cualquier Persona (Estudiante o Docente) a la lista
    public void agregarPersona(Persona persona) {
        if (persona == null) {
            throw new IllegalArgumentException("No se puede agregar una persona nula.");
        }
        listaPersonas.add(persona);
        System.out.println("Persona registrada: " + persona.getNombre());
    }

    /**
     * Recorre la lista e invoca métodos polimórficos:
     * mostrarIdentificacion() → método final de Persona
     * describirRol()          → método abstracto, cada subclase lo implementa distinto
     * evaluar()               → solo si implementa Evaluable
     */
    public void mostrarTodas() {
        if (listaPersonas.isEmpty()) {
            System.out.println("No hay personas registradas.");
            return;
        }

        System.out.println("\n===== LISTA DE PERSONAS REGISTRADAS =====");
        for (Persona p : listaPersonas) {
            System.out.println("-----------------------------------------");
            p.mostrarIdentificacion();  // final → no puede sobrescribirse
            p.describirRol();           // polimórfico → cada subclase responde diferente
            ejecutarEvaluar(p);         // solo Estudiante (u otro Evaluable) responde
        }
        System.out.println("=========================================\n");
    }

    /**
     * Busca una persona por su identificación.
     * Retorna null si no la encuentra.
     */
    public Persona buscarPorIdentificacion(String id) {
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

    /**
     * Recorre la lista ejecutando solo describirRol() — demostración pura
     * de polimorfismo: misma llamada, comportamiento diferente según el tipo.
     */
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
