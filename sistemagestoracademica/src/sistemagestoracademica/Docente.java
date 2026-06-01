/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestoracademica;

/**
 *
 * @author Chess
 */
public class Docente extends Persona {

    // Atributo propio del docente 
    // Atributo propio del docente
    private String especialidad;

    // Constructor
    public Docente(String nombre, String identificacion,
                   Direccion direccion, String especialidad) {

        // Llama al constructor de Persona
        super(nombre, identificacion, direccion, TipoPersona.DOCENTE);

        this.especialidad = especialidad;
    }

    // Método para mostrar los datos del docente
    public void mostrarDatosDocente() {

        System.out.println("--------- DATOS DEL DOCENTE ------------");

        System.out.println("Nombre: " + getNombre());
        System.out.println("Identificación: " + getIdentificacion());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Tipo de persona: DOCENTE");

        if (getDireccion() != null) {
            System.out.println("Provincia: " + getDireccion().getProvincia());
            System.out.println("Ciudad: " + getDireccion().getCiudad());
        } else {
            System.out.println("Dirección no disponible");
        }
    }

    // Getter
    public String getEspecialidad() {
        return especialidad;
    }

    // Setter
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /*
     * Método sobrescrito de Persona.
     * Describe el rol del docente.
     */
    @Override
    public void describirRol() {
        System.out.println("Soy un docente especializado en: " + especialidad);
    }
}
