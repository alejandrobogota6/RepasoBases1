/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesrepasolibros;

import java.util.Scanner;


/**
 *
 * @author Bogota
 */
public class ConjuntoLibros {

    private Libro[] Libros;
    
    Libro[] ArregloLibros = new Libro[9];
    String[] Arreglo = new String[9];
    
    boolean Repetido = true; 
     
    int contador=0;
    
    public void CrearLibros(String Titulo, String Autor, int Paginas, int Calificacion){
        
        
        if(Repetido == true){
            for (int i = 0; i < ArregloLibros.length; i++) {
                ArregloLibros[i]=null;
            }
            Repetido = false; 
        }
        
        if(contador==0){
            Libro l = new Libro(Titulo, Autor);
            l.setPaginas(Paginas);
            l.setCalificacion(Calificacion);
            ArregloLibros[contador]=l;
            contador++;
        }
        
        else{
            
            boolean comparar = false;
            for (int i = 0; i < ArregloLibros.length; i++) {
                
                if(ArregloLibros[i]!=null){
                String compararT = ArregloLibros[i].getTitulo();
                String compararA = ArregloLibros[i].getAutor();
  
                if(compararT.equals(Titulo) || compararA.equals(Autor)){
                    comparar = true; 
                    System.out.println("Son iguales");
                
                }
                
                }
                
            }
    
        if(comparar== false){
            Libro l = new Libro(Titulo, Autor);
            l.setPaginas(Paginas);
            l.setCalificacion(Calificacion);
            ArregloLibros[contador]=l;
            contador++;
        
        
        }else{
            System.out.println("No se pueden inscribir el libro");
        
        }
        }
 
        
    }
    
    public void mostrarLibros(){
        for (int i = 0; i < ArregloLibros.length; i++) {
            if(ArregloLibros[i]!=null){
             System.out.println(i+" "+ArregloLibros[i].getTitulo()+" "+ArregloLibros[i].getAutor()+" "+ArregloLibros[i].getPaginas()+" "+ArregloLibros[i].getCalificacion());
            }
           
        }
    
    
    }

    public void cambiarCalificacion(){
        
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro que desea cambiar la clasificación");
        String libro = n.nextLine();
        
        System.out.println("Ingrese la nueva calificación");
        int calificacio = n.nextInt();
        
        
        for (int i = 0; i < ArregloLibros.length; i++) {
            if(ArregloLibros[i]!=null){
                String compararT = ArregloLibros[i].getTitulo();
               
                if(compararT.equals(libro)){
                    ArregloLibros[i].setCalificacion(calificacio);
                    
                
                }
                
            }
        }
    
    }
    
    public void mostrarMejores(){
        int comp=0;
        int mayor=0;
        int menor=0;
        int comp1=10;
        
        for (int i = 0; i < ArregloLibros.length; i++) {
            
            if(ArregloLibros[i]!=null){
                int calificacion = ArregloLibros[i].getCalificacion();
                if(calificacion>comp){
                    mayor=i;
                    comp=calificacion;
                }
                
            }
        }
        
        for (int i = 0; i < ArregloLibros.length; i++) {
            
            if(ArregloLibros[i]!=null){
                int calificacion = ArregloLibros[i].getCalificacion();
                if(calificacion<comp1){
                    menor=i;
                    comp1=calificacion;
                }
            }
        }
        System.out.println("-----------");
        System.out.println("El libro con mayor calificación es: "+" "+ArregloLibros[mayor].getTitulo()+" "+ArregloLibros[mayor].getAutor()+" "+ArregloLibros[mayor].getPaginas()+" "+ArregloLibros[mayor].getCalificacion());
        System.out.println("El libro con menor calificación es: "+" "+ArregloLibros[menor].getTitulo()+" "+ArregloLibros[menor].getAutor()+" "+ArregloLibros[menor].getPaginas()+" "+ArregloLibros[menor].getCalificacion());
        
    
    }

    
    
}
