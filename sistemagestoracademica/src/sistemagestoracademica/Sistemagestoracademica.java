/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestoracademica;

/**
 *
 * @author Usuario
 */



public class Sistemagestoracademica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
     // Lista polimórfica
        Utilidades.mostrarBienvenida(); // ← faltaba

    GestorPersonas gestor = new GestorPersonas();

    Direccion d1 = new Direccion("San Jose", "Desamparados");
    Direccion d2 = new Direccion("Cartago", "Paraiso");

    Estudiante estudiante = new Estudiante("Juan", "123", d1, "Ingenieria en Sistemas");
    Docente docente = new Docente("Maria", "456", d2, "Programacion");

    gestor.agregarPersona(estudiante);
    gestor.agregarPersona(docente);

    gestor.mostrarTodas();   // lista polimórfica completa
    gestor.mostrarRoles();   // solo roles

    // Búsqueda por ID
    Persona encontrada = gestor.buscarPorIdentificacion("123");
    if (encontrada != null) {
        System.out.println("Persona encontrada: " + encontrada.getNombre());
        encontrada.describirRol();
    } else {
        System.out.println("Persona no encontrada.");
    }
 }
    }
    

