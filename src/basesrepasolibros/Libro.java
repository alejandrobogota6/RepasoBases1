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
public class Libro {
    
    private String Titulo; 
    private String Autor; 
    private int Paginas; 
    private int Calificacion; 
  


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

    public Libro(String Titulo, String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        
            
    }

  
}
