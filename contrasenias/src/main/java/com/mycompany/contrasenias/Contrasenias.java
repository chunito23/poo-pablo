/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contrasenias;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author domin
 */
public class Contrasenias {

    public static void main(String[] args) {
        List<claseContrasenia> contraseñas = new ArrayList<>();
        contraseñas.add(new claseContrasenia());
        contraseñas.add(new claseContrasenia());
        contraseñas.get(0).generar_contraseña(20);
        contraseñas.get(1).generar_contraseña(4);
        contraseñas.get(0).mostrarContrasenia();
        contraseñas.get(1).mostrarContrasenia();
        
    }
    
    
}
