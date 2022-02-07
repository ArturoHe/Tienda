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
public final class Fruta extends ProductoVerificacion {

    //Atributos
    private boolean totalmenteOrganico;
    private int peso;
    private String especie;

    //Constructores
    public Fruta() {
    }

    public Fruta(boolean totalmenteOrganico, int peso, String especie, boolean productoImportado, String nombre, String descripcion, int id, String tipo, int precio) {
        super(productoImportado, nombre, descripcion, id, tipo, precio);
        this.totalmenteOrganico = totalmenteOrganico;
        this.peso = peso;
        this.especie = especie;
    }

    public Fruta(boolean totalmenteOrganico, int peso, String especie, boolean productoImportado, String paisdeImportacion, String nombre, String descripcion, int id, String tipo, int precio) {
        super(productoImportado, paisdeImportacion, nombre, descripcion, id, tipo, precio);
        this.totalmenteOrganico = totalmenteOrganico;
        this.peso = peso;
        this.especie = especie;
    }

    //Get & Set
    public boolean isTotalmenteOrganico() {
        return totalmenteOrganico;
    }

    public void setTotalmenteOrganico(boolean totalmenteOrganico) {
        this.totalmenteOrganico = totalmenteOrganico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

}
