package eva2_1_lista_simple;

/**
 *
 * @author Alexis M.
 */
public class Lista {

    private Nodo inicio;
    private Nodo fin;
    private int cont = 0;

    //POR DEFAULT, LA LISTA ESRA VACIA
    public Lista() {
        this.inicio = null;  //NO HAY NODOS EN LA LISTA
        this.fin = null;
        this.cont = 0;
    }
    public boolean listaVacia(){
        if (inicio == null)
            return true;
        else
            return false;
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

    //AGREGAR UN NODO AL FINAL DE LA LISTA
    //SOLUCION 1: O(N)
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
            /*Nodo temp = inicio;
             //¿COMO MUEVO A TEMP?
             while (temp.getSiguiente() != null) { //EL WHILE SIRVE PARA MOVERNOS  
             temp = temp.getSiguiente();

             }
             temp.setSiguiente(nuevoNodo);*/
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
        cont++;
    }

    public int tamaLista() {
        /*int cont = 0;
        Nodo temp = inicio;
        //¿COMO MUEVO A TEMP?
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();

        }*/
        return this.cont;
    }

    public void insertarEn(int valor, int pos) throws Exception {
        //¿que debemos validar?
        //insertar en una posicion no válida
        //posiciones negativas (listo)
        //posiciones mayores a la cantidad de elementos

        int cantNodos = tamaLista();

        if (pos < 0) {
            throw new Exception("No puede insertar unu nodo en una posición negativa");
        } else if (pos >= cantNodos) {
            throw new Exception(pos + " no es una posición valida en la lista");
        } else {
            Nodo nuevoNodo = new Nodo(valor);
            if (pos == 0) { //Insertar al inicio de la tabla
                nuevoNodo.setSiguiente(inicio);
                inicio = nuevoNodo;
            } else {
                Nodo temp = inicio;
                int cont = 0;
                while (cont < (pos - 1)) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                //System.out.println(temp.getValor() + " - ");

                nuevoNodo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevoNodo);

            }
            this.cont++;
        }
    }

    public void vaciarLista() {
        inicio = null;
        fin = null;
        cont = 0;
    }

    public void borrarEn(int pos) throws Exception {
        int cantNodos = tamaLista();

        if (pos < 0) {
            throw new Exception("No puede insertar unu nodo en una posición negativa");
        } else if (pos >= cantNodos) {
            throw new Exception(pos + " no es una posición valida en la lista");
        } else //PIENSEN COMO PROGRAMADORES:
        //QUE PUEDE SALIR MAL SI: 
        if (cantNodos == 1) {
            vaciarLista();
        } else {
            //BORRAR EL PRIMER NODO
            //BORRAR NODO INTERMEDIO
            //BORRAR EL ÚLTIMO NODO
            if (pos == 0) {
                inicio = inicio.getSiguiente();
            } else {
                Nodo temp = inicio;
                int cont = 0;
                while (cont < (pos - 1)) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                //YA ESTOY EN EL NODO PREVIO
                Nodo objSig = temp.getSiguiente(); //MAS FACIL DE LEER 
                temp.setSiguiente(objSig.getSiguiente());
                if (pos == cantNodos - 1) { //RECONECTAMOS A FIN
                    fin = temp;
                }
            }
            this.cont--;
        }
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
