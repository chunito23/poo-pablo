/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej11;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author domin
 */
public class diccionario {
    List<String> palabras = new ArrayList<>();
    
    public void agregarPalabra(String palabraNueva){
        palabras.add(palabraNueva);
    }
    
    public void mostrarPalabras(){
        for(int i = 0;i<palabras.size();i++){
            System.out.println(palabras.get(i));
        }
    }
    
    public boolean existePalabra(String palabra){
        for(int i = 0;i<palabras.size();i++){
            if (palabra.equals(palabras.get(i))){
                return true;
            }
        }
        return false;
    }
    
}
