/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.productos;

import java.util.ArrayList;

/**
 *
 * @author gabriel chang XD
 */
public class ProductoDAO {
    private ArrayList<Producto> listaP;

    public ProductoDAO() {
        this.listaP = new ArrayList();
    }

    public ArrayList<Producto> getListaP() {
        return listaP;
    }

    public void setListaP(ArrayList<Producto> listaP) {
        this.listaP = listaP;
    }
    
    public void agregar(int id, String nom, String desc, double precio) {
        try {
            //Producto p = new Producto(id, nom, desc, precio);
            this.listaP.add(new Producto(id, nom, desc, precio));
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public void editar(int id, String nom, String desc, double precio, int pos) {
        try {
            this.listaP.get(pos).setCodigo(id);
            this.listaP.get(pos).setNombre(nom);
            this.listaP.get(pos).setDesc(desc);
            this.listaP.get(pos).setPrecio(precio);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public Producto buscarPorID(int id) {
        Producto searchP = new Producto();
        try {
            for (Producto p : this.listaP) {
                if (p.getCodigo() == id) return p;
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return searchP;
    }
    
    public String eliminar(int codigo) {
        String msn = "No se pudo eliminar...";
        
        try {
            Producto p = new Producto();
            p = buscarPorID(codigo);
            
            if(p.getCodigo() == 0) {
                return "Registro no se encontro...";
            }
            
            listaP.remove(p);
            msn = "Registro eliminado satisfactoriamente";
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return msn;
    }
}
