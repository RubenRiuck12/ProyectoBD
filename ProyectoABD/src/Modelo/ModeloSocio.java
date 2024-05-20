
package Modelo;

/**
 *
 * @author Ruben
 */
public class ModeloSocio {
    
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String domicilio;
    private String fechaNac;
    private String telefono;
    private String cuentaBancaria;
    private String fechPago;
    private String idSede;
    private String tipoCuota;

    public ModeloSocio() {
    }

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

    public String getCuentaBnacaria() {
        return cuentaBancaria;
    }

    public void setCuentaBnacaria(String cuentaBnacaria) {
        this.cuentaBancaria = cuentaBnacaria;
    }

    public String getFechPago() {
        return fechPago;
    }

    public void setFechPago(String fechPago) {
        this.fechPago = fechPago;
    }

    public String getIdSede() {
        return idSede;
    }

    public void setIdSede(String idSede) {
        this.idSede = idSede;
    }

    public String getTipoCuota() {
        return tipoCuota;
    }

    public void setTipoCuota(String tipoCuota) {
        this.tipoCuota = tipoCuota;
    }
}
