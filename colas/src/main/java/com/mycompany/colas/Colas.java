/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colas;

/**
 *
 * @author domin
 */
public class Colas {
    private nodo frente = null;
    private nodo finalCola = null;
    private int cantidadElementos = 0;

    public boolean estaVacia() {
        return frente == null;
    }

    public int longitud() {
        return cantidadElementos;
    }

    public void encolar(Object dato) {
        nodo nuevoNodo = new nodo(dato);

        if (estaVacia()) {
            frente = nuevoNodo;
        } else {
            finalCola.setProximo(nuevoNodo);
        }
        cantidadElementos++;
        finalCola = nuevoNodo;
}

    public Object desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía, no se puede desencolar.");
            return null;
        }
        nodo nodoFrente = frente;
        frente = frente.getProximo();
        cantidadElementos--;
        return nodoFrente.getDato();
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }

        nodo nodo = frente;

        while (nodo != null) {
            System.out.print("" + nodo.getDato() + "\n");
            nodo = nodo.getProximo();
        }
    }

    public Object recuperar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía, no se puede recuperar el elemento.");
            return null;
        }
        return frente.getDato();
    }
    
    public static void main(String[] args) {
        Colas cola = new Colas();

        System.out.println("Cola está vacía: " + cola.estaVacia());
        System.out.println("Longitud de la cola: " + cola.longitud());

        cola.encolar(2);
        cola.encolar(3);

        System.out.println("Cola está vacía: " + cola.estaVacia());
        System.out.println("Longitud de la cola: " + cola.longitud());


        System.out.println("Elemento en frente de la cola: " + cola.recuperar());
        cola.mostrar();


        Object desencolado = cola.desencolar();
        System.out.println("Elemento desencolado: " + desencolado);

        System.out.println("Cola está vacía: " + cola.estaVacia());
        System.out.println("Longitud de la cola: " + cola.longitud());

        cola.mostrar();
        }
    
}
