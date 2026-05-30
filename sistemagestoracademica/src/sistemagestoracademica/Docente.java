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
    private String especialidad;

    // Constructor recibe los datos básicos  y la  especialidad
    public Docente(String nombre, String identificacion, Direccion direccion, String especialidad) {
        // Llamamos al constructor de la clase padre (Persona)
        super(nombre, identificacion, direccion, TipoPersona.DOCENTE);
        this.especialidad = especialidad;
    }

    // Método para mostrar toda la información del docente
    public void mostrarDatosDocente() {
        System.out.println("--------- DATOS DEL DOCENTE ------------");

        // Usamos los getters heredados de Persona
        System.out.println("Nombre: " + getNombre());
        System.out.println("Identificación: " + getIdentificacion());
        System.out.println("Especialidad del docente: " + especialidad);
        System.out.println("Tipo de persona: DOCENTE");

        // Verificamos que la dirección exista antes de usarla
        if (getDireccion() != null) {
            System.out.println("Provincia: " + getDireccion().getProvincia());
            System.out.println("Ciudad: " + getDireccion().getCiudad());
        } else {
            System.out.println("Dirección no disponible");
        }
    }

    // Getter de especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    // Setter de especialidad
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método sobrescrito: describe el rol del docente
    @Override
    public void describirRol() {
        System.out.println("Soy un docente especializado en: " + especialidad);
    }
}
