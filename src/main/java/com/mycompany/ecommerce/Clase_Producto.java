/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecommerce;
/**
 *
 * @author Lenovo
 */
public class Clase_Producto {
    
    private String nombre_Producto ;
    private String descripción ;
    private int peso ;
    private int precioUsd ;
    private int precioCop ;
    private String categoria ;
    
    public void producto(){
    }

    /**
     * @return the nombre_Producto
     */
    public String getNombre_Producto() {
        return nombre_Producto;
    }

    /**
     * @param nombre_Producto the nombre_Producto to set
     */
    public void setNombre_Producto(String nombre_Producto) {
        this.nombre_Producto = nombre_Producto;
    }
    /**
     * @return the descripción
     */
    public String getDescripción() {
        return descripción;
    }
    /**
     * @param descripción the descripción to set
     */
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }
    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    /**
     * @return the precioUsd
     */
    public int getPrecioUsd() {
        return precioUsd;
    }
    /**
     * @param precioUsd the precioUsd to set
     */
    public void setPrecioUsd(int precioUsd) {
        this.precioUsd = precioUsd;
    }
    /**
     * @return the precioCop
     */
    public int getPrecioCop() {
        return precioCop;
    }
    /**
     * @param precioCop the precioCop to set
     */
    public void setPrecioCop(int precioCop) {
        this.precioCop = precioCop;
    }
    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }
    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }    
}
