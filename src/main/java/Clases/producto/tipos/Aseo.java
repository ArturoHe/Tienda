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
public final class Aseo extends ProductoVerificacion {

    //Atributos
    private boolean esAseoPersonal;
    private int peso;
    private String marca;

    //Constructores
    public Aseo() {
    }

    public Aseo(boolean esAseoPersonal, int peso, String marca, boolean productoImportado, String nombre, String descripcion, int id, String tipo, int precio) {
        super(productoImportado, nombre, descripcion, id, tipo, precio);
        this.esAseoPersonal = esAseoPersonal;
        this.peso = peso;
        this.marca = marca;
    }

    public Aseo(boolean esAseoPersonal, int peso, String marca, boolean productoImportado, String paisdeImportacion, String nombre, String descripcion, int id, String tipo, int precio) {
        super(productoImportado, paisdeImportacion, nombre, descripcion, id, tipo, precio);
        this.esAseoPersonal = esAseoPersonal;
        this.peso = peso;
        this.marca = marca;
    }

    //Get & Set
    public boolean isEsAseoPersonal() {
        return esAseoPersonal;
    }

    public void setEsAseoPersonal(boolean esAseoPersonal) {
        this.esAseoPersonal = esAseoPersonal;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
