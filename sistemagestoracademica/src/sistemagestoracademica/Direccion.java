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
public class Direccion {
    private String provincia;
    private String ciudad;

    //Contructor q inizializa provincia y cuidad
    public Direccion(String provincia, String ciudad) {
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    //getters y setters para provincia y cuidad
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    //Devuelve la info
    @Override
    public String toString() {
        return provincia + ", " + ciudad;
    }
}
