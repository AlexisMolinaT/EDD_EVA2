/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_lista_doble;

/**
 *
 * @author Alexis M.
 */
public class ListaDoble {

    private Nodo inicio;
    private Nodo fin;
    private int cont;

    public ListaDoble() {
        this.inicio = null;  //NO HAY NODOS EN LA LISTA
        this.fin = null;
        this.cont = 0;
    }

    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        if (listaVacia()) {
            System.out.println("LISTA VACIA :(");
        } else {
            Nodo temp = inicio;
            //¿COMO MUEVO A TEMP?
            while (temp != null) { //EL WHILE SIRVE PARA MOVERNOS  
                System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();

            }

        }
    }

    public int tamaLista() {
        return this.cont;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        //VERIFICAR SI HAY NODOS EN LA LISTA
        if (inicio == null) {//NO HAY NODOS EN LA LISTA
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else { //HAY NODOS EN LA LISTA
            //HAY QUE MOVERNOS POR LA LISTA
            //USANDO UN NODO TEMPORAL HASTA EL
            //ULTIMO NODO DE LA LISTA          
            fin.setSiguiente(nuevoNodo);
            nuevoNodo.setPrevio(fin);
            fin = nuevoNodo;
        }
        cont++;
    }
    
    
    public void vaciarLista() {
        inicio = null;
        fin = null;
        cont = 0;
    }

    public int obtenValorEn(int pos) throws Exception {
        int cantNodos = tamaLista();
        int valor = 0;

        if (pos < 0) {
            throw new Exception("No puede insertar unu nodo en una posición negativa");
        } else if (pos >= cantNodos) {
            throw new Exception(pos + " no es una posición valida en la lista");
        } else {
            Nodo temp = inicio;
                int cont = 0;
                while (cont < pos) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                valor = temp.getValor();

        }
        return valor;
    }
    
    
    
    
    
}
