/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestoracademica;

/**
 *
 * @author Usuario
 */

//Atributos
public abstract class Persona {
    private String nombre;
    private String identificacion;
    private Direccion direccion;
    private TipoPersona tipo;

    
    public static final String PAIS = "Costa Rica";

    //Contructor con validaciones
    public Persona(String nombre, String identificacion, Direccion direccion, TipoPersona tipo) {
        validarCampo(nombre, "El nombre no puede estar vacio ");
        validarCampo(identificacion, "La identificación no puede estar vacia ");
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.tipo = tipo;
    }
    
    //Un metodo para validar la informacion
    private void validarCampo(String valor, String mensajeError) {
        if (valor == null || valor.isEmpty()) {
            throw new IllegalArgumentException(mensajeError);
        }
    }
    //getters y setters y validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        validarCampo(nombre, "El nombre no puede estar vacio ");
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        validarCampo(identificacion, "La identificacion no puede estar vacia ");
        this.identificacion = identificacion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public TipoPersona getTipo() {
        return tipo;
    }

    public void setTipo(TipoPersona tipo) {
        this.tipo = tipo;
    }

    //Esto onliga las subclases hacer su rol
    public final void mostrarIdentificacion() {
        System.out.println("Identificacion: " + identificacion);
    }

    //Muestra todos los datos de la persona en una linea
    public abstract void describirRol();
    
    @Override
    public String toString() {
        return String.format("Nombre: %s | ID: %s | Direccion: %s | Tipo: %s | Pais: %s",
                nombre, identificacion, direccion, tipo, PAIS);
    }
}
