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
    private String representanteLegal;
    private boolean documentosEnRegla;
    
    
    //Constructor
    public ProveedorEmpresa() {
    }

    public ProveedorEmpresa(int nit, String representanteLegal, boolean documentosEnRegla, String producto, String pais, String ciudad, String direccion, String nombre, String celular, String correo) {
        super(producto, pais, ciudad, direccion, nombre, celular, correo);
        this.nit = nit;
        this.representanteLegal = representanteLegal;
        this.documentosEnRegla = documentosEnRegla;
    }

    

    //Get & Set
    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public boolean isDocumentosEnRegla() {
        return documentosEnRegla;
    }

    public void setDocumentosEnRegla(boolean documentosEnRegla) {
        this.documentosEnRegla = documentosEnRegla;
    }
    
    
}
