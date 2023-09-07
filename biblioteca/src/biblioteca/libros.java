/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author domin
 */
public class libros {
    private String autor;
    private String titulo;
    private int numeroPaginas;
    private int cantidadEjemplares;
    private int cantidadEjemplaresPrestados;
    private int isbn;
    
    

    
    
    public libros(String autor,String titulo,int numerosPaginas,int isbn,int ejemplares){
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numerosPaginas;
        this.isbn = isbn;
        this.cantidadEjemplares = ejemplares;
    }
    
    public int getIsbn() {
        return isbn;
    }
    

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }


    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public int getCantidadEjemplaresPrestados() {
        return cantidadEjemplaresPrestados;
    }
    
    
    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public void setCantidadEjemplaresPrestados(int cantidadEjemplaresPrestados) {
        this.cantidadEjemplaresPrestados = cantidadEjemplaresPrestados;
    }


    
    
    
}
