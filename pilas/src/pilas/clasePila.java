/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author domin
 */
public class clasePila {
    private nodo nodoTope;

    public clasePila() {
        this.nodoTope = null;
    }

    public void apilar(Object elemento) {
        nodo nodoAux = new nodo();
        nodoAux.setDato(elemento);
        nodoAux.setProximo(this.nodoTope);
        this.nodoTope = nodoAux;
    }

    public void desapilar() {
        if (!esVacia()) {
            this.nodoTope = this.nodoTope.getProximo();
        } else {
            System.out.println("La pila está vacía. No se puede desapilar.");
        }
    }

    public Object getTope() {
        if (!esVacia()) {
            return this.nodoTope.getDato();
        } else {
            return null;
        }
    }

    public boolean esVacia() {
        return this.nodoTope == null;
    }
}
