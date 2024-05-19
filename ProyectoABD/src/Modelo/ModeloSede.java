/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ruben
 */
public class ModeloSede {
    
    public ModeloSede(){
        
    }

    public ModeloSede(String domicilio, String ciudad, String director) {
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.director = director;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    String domicilio;
    String ciudad;
    String director;
    
}
