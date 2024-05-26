/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ruben
 */
public class ModeloVoluntario {
    
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String domicilio;
    private String fechaNac;
    private String telefono;
    private String cuentaBancaria;
    private int idSede;
    private int idTipoVoluntario;
    private int idProfesion;
    private boolean diponibilidad;
    private int participaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    
    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public int getIdTipoVoluntario() {
        return idTipoVoluntario;
    }

    public void setIdTipoVoluntario(int idTipoVoluntario) {
        this.idTipoVoluntario = idTipoVoluntario;
    }

    public int getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(int idProfesion) {
        this.idProfesion = idProfesion;
    }

    public boolean isDiponibilidad() {
        return diponibilidad;
    }

    public void setDiponibilidad(boolean diponibilidad) {
        this.diponibilidad = diponibilidad;
    }

    public int getParticipaciones() {
        return participaciones;
    }

    public void setParticipaciones(int participaciones) {
        this.participaciones = participaciones;
    }
    
}
