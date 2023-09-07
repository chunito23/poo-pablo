/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

/**
 *
 * @author domin
 */
public class nodo {
    private Object dato;
    private nodo proximo = null;

    public nodo(Object dato) {
        this.dato = dato;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setProximo(nodo nodito) {
        proximo = nodito;
    }

    public nodo getProximo() {
        return proximo;
    }
}