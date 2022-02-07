/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.producto.tipos;

import Clases.producto.ProductoVerificacion;

/**
 *
 * @author Arturo
 */
public final class Otro extends ProductoVerificacion {

    //Atributos
    private boolean comestible;
    private boolean artesania;
    private int cantidadDisponible;

    //Constructores
    public Otro() {
    }

    public Otro(boolean comestible, boolean artesania, int cantidadDisponible, boolean productoImportado, String nombre, String descripcion, int id, String tipo, int precio) {
        super(productoImportado, nombre, descripcion, id, tipo, precio);
        this.comestible = comestible;
        this.artesania = artesania;
        this.cantidadDisponible = cantidadDisponible;
    }

    public Otro(boolean comestible, boolean artesania, int cantidadDisponible, boolean productoImportado, String paisdeImportacion, String nombre, String descripcion, int id, String tipo, int precio) {
        super(productoImportado, paisdeImportacion, nombre, descripcion, id, tipo, precio);
        this.comestible = comestible;
        this.artesania = artesania;
        this.cantidadDisponible = cantidadDisponible;
    }

    //Get & Set
    public boolean isComestible() {
        return comestible;
    }

    public void setComestible(boolean comestible) {
        this.comestible = comestible;
    }

    public boolean isArtesania() {
        return artesania;
    }

    public void setArtesania(boolean artesania) {
        this.artesania = artesania;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

}
