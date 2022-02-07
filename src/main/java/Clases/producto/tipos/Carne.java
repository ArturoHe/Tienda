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
public final class Carne extends ProductoVerificacion {

    //Atributos
    private boolean procesado;
    private int peso;
    private String procedencia;

    //Constructor
    public Carne() {
    }

    public Carne(boolean procesado, int peso, String procedencia, boolean productoImportado, String nombre, String descripcion, int id, String tipo, int precio) {
        super(productoImportado, nombre, descripcion, id, tipo, precio);
        this.procesado = procesado;
        this.peso = peso;
        this.procedencia = procedencia;
    }

    public Carne(boolean procesado, int peso, String procedencia, boolean productoImportado, String paisdeImportacion, String nombre, String descripcion, int id, String tipo, int precio) {
        super(productoImportado, paisdeImportacion, nombre, descripcion, id, tipo, precio);
        this.procesado = procesado;
        this.peso = peso;
        this.procedencia = procedencia;
    }

    //Get & Set
    public boolean isProcesado() {
        return procesado;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

}
