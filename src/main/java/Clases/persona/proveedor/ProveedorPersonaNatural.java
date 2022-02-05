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
    private String diaDeEntregaMercancias;
    private boolean activo;
    
    //Constructor

    public ProveedorPersonaNatural() {
    }

    public ProveedorPersonaNatural(int cedula, String diaDeEntregaMercancias, boolean activo, String producto, String pais, String ciudad, String direccion, String nombre, String celular, String correo) {
        super(producto, pais, ciudad, direccion, nombre, celular, correo);
        this.cedula = cedula;
        this.diaDeEntregaMercancias = diaDeEntregaMercancias;
        this.activo = activo;
    }

    
    
    //Get & Set

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDiaDeEntregaMercancias() {
        return diaDeEntregaMercancias;
    }

    public void setDiaDeEntregaMercancias(String diaDeEntregaMercancias) {
        this.diaDeEntregaMercancias = diaDeEntregaMercancias;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
