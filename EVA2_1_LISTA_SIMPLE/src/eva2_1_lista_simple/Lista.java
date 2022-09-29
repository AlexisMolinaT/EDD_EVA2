package eva2_1_lista_simple;

/**
 *
 * @author Alexis M.
 */
public class Lista {

    private Nodo inicio;
    private Nodo fin;

    //POR DEFAULT, LA LISTA ESRA VACIA
    public Lista() {
        this.inicio = null;  //NO HAY NODOS EN LA LISTA
        this.fin = null;
    }

    public void imprimir() {
        Nodo temp = inicio;
        //¿COMO MUEVO A TEMP?
        while (temp != null) { //EL WHILE SIRVE PARA MOVERNOS  
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();

        }
    }

    //AGREGAR UN NODO AL FINAL DE LA LISTA
    //SOLUCION 1: O(N)
    public void agreagar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        //VERIFICAR SI HAY NODOS EN LA LISTA
        if (inicio == null) {//NO HAY NODOS EN LA LISTA
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else { //HAY NODOS EN LA LISTA
            //HAY QUE MOVERNOS POR LA LISTA
            //USANDO UN NODO TEMPORAL HASTA EL
            //ULTIMO NODO DE LA LISTA
            /*Nodo temp = inicio;
             //¿COMO MUEVO A TEMP?
             while (temp.getSiguiente() != null) { //EL WHILE SIRVE PARA MOVERNOS  
             temp = temp.getSiguiente();

             }
             temp.setSiguiente(nuevoNodo);*/
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
    }

    public int tamaLista() {
        int cont = 0;
        Nodo temp = inicio;
        //¿COMO MUEVO A TEMP?
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();

        }
        return cont;
    }

    public void agregarEn(int valor, int pos) {
            //¿que debemos validar?
        //insertar en una posicion no válida
        //posiciones negativas
        //posiciones mayores a la cantidad de elementos

    }

}
