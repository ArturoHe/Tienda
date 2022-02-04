package Clases.persona.proveedor;

import clases.persona.Persona;

public class Proveedor extends Persona {

    //Atributos
    private String producto;
    private String pais;
    private String ciudad;
    private String direccion;

    //Constructor
    public Proveedor() {
    }

    //Get & Set
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
