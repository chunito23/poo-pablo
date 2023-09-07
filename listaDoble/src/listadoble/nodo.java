/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoble;

/**
 *
 * @author domin
 */
public class nodo {
    Object dato;
    nodo siguiente;

    public nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(nodo anterior) {
        this.anterior = anterior;
    }
    nodo anterior;
    
    public void setDato(Object dato){
            this.dato = dato;
    }
    
    public Object getDato(){
        return dato;
    }
    
    public void setProximo(nodo nodito){
        siguiente = nodito;
    }
    
    public nodo getProximo(){
        return siguiente;
    }
    
   
}
