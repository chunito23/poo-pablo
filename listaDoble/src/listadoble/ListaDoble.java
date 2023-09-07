/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadoble;

/**
 *
 * @author domin
 */
public class ListaDoble {

    /**
     * @param args the command line arguments
     */
    nodo primero = null;
    int cantidad = 0;

    public void agregar (Object dato) {
        nodo nuevoNodo = new nodo();
        nuevoNodo.setDato(dato);
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            nodo nodo = primero;
            while (nodo.getProximo() != null) {
                nodo = nodo.getProximo();
            }
            nodo.setProximo(nuevoNodo);
            nuevoNodo.setAnterior(nodo);
        }
        cantidad++;
    }

    public void insertar(Object dato, int pos) {
    if (vacio() || pos < 1) {
        return;
    }
    nodo nuevoNodo = new nodo();
    nuevoNodo.setDato(dato);
    if (pos == 1) {
        nuevoNodo.setProximo(primero);
        if (primero != null) {
            primero.setAnterior(nuevoNodo);
        }
        primero = nuevoNodo;
    } else {
        nodo nodo = primero;
        for (int i = 1; i < pos; i++) {
            if (nodo == null) {
                break; // Insertar al final si pos es mayor que la longitud actual
            }
            nodo = nodo.getProximo();
        }

        if (nodo != null) {
            nuevoNodo.setProximo(nodo);
            nuevoNodo.setAnterior(nodo.getAnterior());
            if (nodo.getAnterior() != null) {
                nodo.getAnterior().setProximo(nuevoNodo);
            }
            nodo.setAnterior(nuevoNodo);
        } else {
            // Insertar al final de la lista si pos es mayor que la longitud actual
            nodo = primero;
            while (nodo.getProximo() != null) {
                nodo = nodo.getProximo();
            }
            nuevoNodo.setAnterior(nodo);
            nodo.setProximo(nuevoNodo);
        }
    }
    cantidad++;
    }

    public void eliminar(int pos) {
    if (vacio() || pos < 1 || pos > cantidad) {
        return;
    }

    if (pos == 1) {
        primero = primero.getProximo();
        if (primero != null) {
            primero.setAnterior(null);
        }
    } else {
        nodo nodo = primero;
        for (int i = 1; i < pos; i++) {
            nodo = nodo.getProximo();
        }

        nodo.getAnterior().setProximo(nodo.getProximo());
        if (nodo.getProximo() != null) {
            nodo.getProximo().setAnterior(nodo.getAnterior());
        }
    }
    cantidad--;
}

    public Object recuperar (int pos) {
        if (cantidad == 0 || pos < 1 || pos > cantidad) {
            return null;
        }
        if (pos == 1) {
            return primero.getDato();
        } else {
            nodo nodo = primero;
            for (int i = 0;i < pos - 1;i++) {
                nodo = nodo.getProximo();
            }
            return nodo.getDato();
        }
    }

    public int longitud () {
        return cantidad;
    }


    public boolean vacio () {
        return cantidad == 0;
    }

    public void mostrar () {
        if (primero != null) {
            nodo nodo = primero;
            while (nodo != null) {
                System.out.println(nodo.getDato());
                nodo = nodo.getProximo();
            }
        }
    }
    
    public static void main(String[] args) {
        ListaDoble listita = new ListaDoble();
        if (listita.vacio()){
            System.out.println("esta vacia");
        }else{
            System.out.println("no esta vacia");
        }
        listita.agregar(1);
        listita.agregar(2);
        listita.agregar(3);
        listita.eliminar(3);
        listita.insertar(3, 3);
        System.out.println("la cantidad de elementos es: " + listita.longitud());
        listita.mostrar();

    }
    
}
