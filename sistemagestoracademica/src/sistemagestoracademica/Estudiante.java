/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestoracademica;

/**
 *
 * @author Chess
 */
public class Estudiante extends Persona {

    private String carrera;
    
    //Clase estudiante version final
    // Constructor
    public Estudiante(String nombre, String identificacion, Direccion direccion, String carrera) {
        super(nombre, identificacion, direccion, TipoPersona.ESTUDIANTE);
        this.carrera = carrera;
    }

    // Método para mostrar datos
    public void mostrarDatosEstudiante() {
        System.out.println("----- DATOS DEL ESTUDIANTE -----");

        System.out.println("Nombre: " + getNombre());
        System.out.println("Identificación: " + getIdentificacion());
        System.out.println("Carrera: " + carrera);

        if (getDireccion() != null) {
            System.out.println("Provincia: " + getDireccion().getProvincia());
            System.out.println("Ciudad: " + getDireccion().getCiudad());
        }
    }

    // Getter
    public String getCarrera() {
        return carrera;
    }

    // Setter
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Método para ver que carrera esta cursando el estudiante
    @Override
    public void describirRol() {
        System.out.println("Soy un estudiante de la carrera: " + carrera);
    }
}
