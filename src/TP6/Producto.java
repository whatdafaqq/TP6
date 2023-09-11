/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6;

import java.util.TreeSet;

/**
 *
 * @author ramir
 */
public class Producto implements Comparable<Producto>{
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String rubro;

    public Producto(String descripcion, double precio, int stock, String rubro, int codigo) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    
    @Override
    public int compareTo(Producto p) {
        if (this.codigo == p.codigo) {
            return 0;
        }else if(this.codigo<p.codigo){
            return -1;
        }
        else{
            return 1;
        }
    }
    
    
}
