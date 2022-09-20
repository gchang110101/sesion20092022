/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacengdcp;

import modelos.productos.*;

/**
 *
 * @author gabriel chang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProductoDAO lista = new ProductoDAO();
        lista.agregar(1, "Cafe", "Café con leche y caramelo", 120);
        lista.agregar(2, "Pan dulce", "Pico de queso", 20);
        lista.agregar(3, "Desayuno", "Ensalada con Pollo", 150);
        lista.agregar(4, "Baho", "Baho bien tuani", 200);
        lista.agregar(5, "Frijolada", "Frijolada bien tuani", 350);
        lista.agregar(6, "Rundown", "Rundown bien tuani", 450);
        
        for (int c = 0; c < lista.getListaP().size(); c++) {
            System.out.println(lista.getListaP().get(c));
        }
        
        lista.eliminar(4);
        for (int c = 0; c < lista.getListaP().size(); c++) {
            System.out.println(lista.getListaP().get(c));
        }

    }
    
    
    
}
