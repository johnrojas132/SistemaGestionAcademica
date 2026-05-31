/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestoracademica;

/**
 *
 * @author Usuario
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistemagestoracademica {

    public static void main(String[] args) {

        Utilidades.mostrarBienvenida();
        GestorPersonas gestor = new GestorPersonas();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n========== MENÚ PRINCIPAL ==========");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Docente");
            System.out.println("3. Mostrar todas las personas");
            System.out.println("4. Buscar persona por identificacion");
            System.out.println("5. Mostrar roles");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                switch (opcion) {
                    case 1:
                        registrarEstudianteMenu(gestor, sc);
                        break;
                    case 2:
                        registrarDocenteMenu(gestor, sc);
                        break;
                    case 3:
                        gestor.mostrarTodas();
                        break;
                    case 4:
                        buscarPersonaMenu(gestor, sc);
                        break;
                    case 5:
                        gestor.mostrarRoles();
                        break;
                    case 6:
                        System.out.println("Saliendo del sistema. ¡Hasta luego!");
                        break;
                    default:
                        // IllegalArgumentException para opción fuera de rango
                        throw new IllegalArgumentException("Opción inválida. Elija entre 1 y 6.");
                }

            } catch (InputMismatchException e) {
                // InputMismatchException — excepción propia de Java
                System.out.println(" Error: debe ingresar un numero entero.");
                sc.nextLine(); // limpiar buffer para evitar loop infinito
            } catch (IllegalArgumentException e) {
                System.out.println(" Error: " + e.getMessage());
            }
        }

        sc.close();
    }

    private static void registrarEstudianteMenu(GestorPersonas gestor, Scanner sc) {
        try {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Identificación: ");
            String id = sc.nextLine();

            System.out.print("Provincia: ");
            String provincia = sc.nextLine();

            System.out.print("Ciudad: ");
            String ciudad = sc.nextLine();

            System.out.print("Carrera: ");
            String carrera = sc.nextLine();

            Direccion direccion = new Direccion(provincia, ciudad);
            gestor.registrarEstudiante(nombre, id, direccion, carrera);

        } catch (DatoInvalidoException e) {
            // Captura la excepción personalizada propagada desde GestorPersonas
            System.out.println(" Dato invalido: " + e.getMessage());
        }
    }

    private static void registrarDocenteMenu(GestorPersonas gestor, Scanner sc) {
        try {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Identificacion: ");
            String id = sc.nextLine();

            System.out.print("Provincia: ");
            String provincia = sc.nextLine();

            System.out.print("Ciudad: ");
            String ciudad = sc.nextLine();

            System.out.print("Especialidad: ");
            String especialidad = sc.nextLine();

            Direccion direccion = new Direccion(provincia, ciudad);
            gestor.registrarDocente(nombre, id, direccion, especialidad);

        } catch (DatoInvalidoException e) {
            System.out.println(" Dato inválido: " + e.getMessage());
        }
    }

    private static void buscarPersonaMenu(GestorPersonas gestor, Scanner sc) {
        try {
            System.out.print("Ingrese la identificación a buscar: ");
            String id = sc.nextLine();

            Persona encontrada = gestor.buscarPorIdentificacion(id);

            if (encontrada != null) {
                System.out.println(" Persona encontrada: " + encontrada.getNombre());
                encontrada.describirRol();
            } else {
                System.out.println("No se encontró ninguna persona con esa identificacion.");
            }

        } catch (DatoInvalidoException e) {
            System.out.println(" Dato inválido: " + e.getMessage());
        }
    }
}

