/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej11;

/**
 *
 * @author domin
 */
public class juego {
    
    
    public void ganador(Jugador j1, Jugador j2){
        if (j1.getPuntaje() > j2.getPuntaje()){
            System.out.println("j1 gano");
        }else{
            System.out.println("j2 gano");
        }
    }
}
