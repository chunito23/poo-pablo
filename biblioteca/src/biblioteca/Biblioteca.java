/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.util.Scanner;


/**
 *
 * @author domin
 */
public class Biblioteca {
    
    Scanner scaneer = new Scanner(System.in);
    hashArchivos<String,libros> bibliotecla_libros = new hashArchivos<>(20000);
    
    public void agregar_libro(){
            System.out.println("ingrese el titulo: ");
            String titulo = scaneer.nextLine();
            System.out.println("ingrese el autor: ");
            String autor = scaneer.nextLine();
            System.out.println("numero de paginas: ");
            int numeroPaginas = scaneer.nextInt();
            System.out.println("numero de isbn: ");
            int isbn = scaneer.nextInt();
            System.out.println("numero de cantidad ejemplares: ");
            int ejemplares = scaneer.nextInt();
            libros libro = new libros(titulo,autor,numeroPaginas,isbn,ejemplares);
            bibliotecla_libros.put(titulo, libro);
    }
    
    public void mostrar_libro(String titulo){
            libros libro = bibliotecla_libros.get(titulo);
            System.out.println(libro.getAutor());
            System.out.println(libro.getTitulo());
            System.out.println(libro.getCantidadEjemplares());
            System.out.println(libro.getIsbn());
    }
    
    public void pedirLibro(String titulo){
        libros libro = bibliotecla_libros.get(titulo);
        if (libro.getCantidadEjemplares() > 1){
            System.out.println("prestado");
            libro.setCantidadEjemplares(libro.getCantidadEjemplares()-1);
        }else{
            System.out.println("no hay ejemplares para prestar");
        } 
    }
    
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();
        biblio.agregar_libro();
        biblio.mostrar_libro("pepe");
       
        
    }
    
    
}
