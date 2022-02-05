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
public class ProveedorEmpresa extends Proveedor {
    
    //Atributos
    private int nit;
    
    //Constructor
    public ProveedorEmpresa() {
    }

    public ProveedorEmpresa(int nit, String producto, String pais, String ciudad, String direccion, String nombre, String celular, String correo) {
        super(producto, pais, ciudad, direccion, nombre, celular, correo);
        this.nit = nit;
    }

    //Get & Set
    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
    
    
    
    
    
}
