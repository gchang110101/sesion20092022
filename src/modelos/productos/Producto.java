/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.productos;

/**
 *
 * @author Gabriel Chang
 * La clase Producto contiene información
 * sobre las diferentes caracteristicsa
 * de los prouctos que ofertan
 */
public class Producto {
 
    private int codigo;
    private String nombre, desc;
    private double precio;
    
    //private final int limit = 50;

    public Producto(int codigo, String nombre, String desc, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.desc = desc;
        this.precio = precio;
    }

    public Producto() {
    }

    public String probar() {
        return "Esto es una prueba";
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Datos del producto\n" + "Codigo: " + codigo + ", \nNombre: " + nombre +
                " \nDescripcion: " + desc + "\nPrecio: " + precio + '\n';
    }
    
    
    
   
}
