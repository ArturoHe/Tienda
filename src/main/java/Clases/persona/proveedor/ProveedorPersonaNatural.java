/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.persona.proveedor;

/**
 *
 * @author Arturo
 */
public class ProveedorPersonaNatural extends Proveedor {
    
    //Atributos
    private int cedula;
    
    //Constructor

    public ProveedorPersonaNatural() {
    }

    public ProveedorPersonaNatural(int cedula, String producto, String pais, String ciudad, String direccion, String nombre, String celular, String correo) {
        super(producto, pais, ciudad, direccion, nombre, celular, correo);
        this.cedula = cedula;
    }
    
    //Get & Set

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
}
