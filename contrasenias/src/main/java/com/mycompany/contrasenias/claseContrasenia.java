/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contrasenias;
import java.util.Random;

/**
 *
 * @author domin
 */
public class claseContrasenia {
    private int longitud = 8;
    private char[] contenedor;
    private String contrasenia;
    private String caracteres = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPZXCVBNM";
    private boolean esFuerte;
    
    public void generar_contraseña(){
        Random random = new Random();
        contenedor = new char[longitud];
        int contador = 0;
      
        for(int i = 0;i<longitud;i++){
            contador = random.nextInt(caracteres.length());
            contenedor[i] = caracteres.charAt(contador);
        }
        contrasenia = new String(contenedor);
        esFuerte();
    }
    
    public void generar_contraseña(int tamanio){
        Random random = new Random();
        contenedor = new char[tamanio];
        int contador = 0;
        for(int i = 0;i<tamanio;i++){
            contador = random.nextInt(caracteres.length());
            contenedor[i] = caracteres.charAt(contador);
        }
        
        contrasenia = new String(contenedor);
        esFuerte();
    }
    
    public void esFuerte(){
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        char letra;
        for (int i = 0;i<contrasenia.length();i++){
            letra = contrasenia.charAt(i);
            if (Character.isDigit(letra)){
                numeros++;
            }
            else if(Character.isUpperCase(letra)){
                mayusculas++;
            }
            else {
                minusculas++;
            }
        }
        if (mayusculas >= 2 && minusculas >= 1 && numeros >= 2){
            esFuerte = true;
        }else{
            esFuerte = false;
        }
    }
    
    public void mostrarContrasenia(){
        if(esFuerte){
            System.out.println(contrasenia + " es fuerte");
        }else{
            System.out.println(contrasenia + " es debil");
        }
    }
        
}

