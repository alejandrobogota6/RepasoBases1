/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesrepasolibros;

/**
 *
 * @author Bogota
 */
public class BasesRepasoLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConjuntoLibros c = new ConjuntoLibros();
        c.CrearLibros("Alice in Wonderland", "Lewis Carroll", 320, 8);
        c.CrearLibros("El método Lean Startup", "Eric Ries", 700, 7);
        c.CrearLibros("IA", "Turing", 780, 1);
        c.CrearLibros("Fundamentación", "Kant", 400, 6);
        c.mostrarLibros();
        System.out.println("---------------");
       // c.cambiarCalificacion();
        System.out.println("---------------");
        c.mostrarLibros();
        c.mostrarMejores();
        
   
    }
    
}
