/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.producto;

/**
 *
 * @author Arturo
 */
public abstract class ProductoVerificacion extends Producto {
    
    //Atributos
    private boolean productoImportado;
    private String paisdeImportacion;
    
    //Constructores

    public ProductoVerificacion() {
    }

    public ProductoVerificacion(boolean productoImportado, String nombre, String descripcion, int id, String tipo, int precio) {
        super(nombre, descripcion, id, tipo, precio);
        this.productoImportado = productoImportado;
    }

    public ProductoVerificacion(boolean productoImportado, String paisdeImportacion, String nombre, String descripcion, int id, String tipo, int precio) {
        super(nombre, descripcion, id, tipo, precio);
        this.productoImportado = productoImportado;
        this.paisdeImportacion = paisdeImportacion;
    }
    
    //Get & Set

    public boolean isProductoImportado() {
        return productoImportado;
    }

    public void setProductoImportado(boolean productoImportado) {
        this.productoImportado = productoImportado;
    }

    public String getPaisdeImportacion() {
        return paisdeImportacion;
    }

    public void setPaisdeImportacion(String paisdeImportacion) {
        this.paisdeImportacion = paisdeImportacion;
    }
    
}
