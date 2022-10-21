package eva3_4_queue;

/**
 *
 * @author Alexis M.
 */
public class MyQueue {

    private Nodo inicio;
    private Nodo fin;
    private int cont;

    public MyQueue() {
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

    public Integer peek() {
        //verifucar si la lista esta vacia
        //si no esta vacia, regresar el valor
        if (listaVacia()) {
            return null;
        } else {
            return inicio.getValor();
        }
    }

    public Integer poll() throws Exception {
        //verifucar si la lista esta vacia
        //si no esta vacia, regresar el valor
        if (listaVacia()) {
            return null;
        } else {
            int valor = inicio.getValor();
            //borra el nodo
            borrarEn(0);
            return valor;
        }
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
                inicio.setPrevio(nuevoNodo);
                inicio = nuevoNodo;
            } else {
                Nodo temp = inicio;
                int cont = 0;
                while (cont < pos) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                //Y AHORA?
                nuevoNodo.setSiguiente(temp);
                nuevoNodo.setPrevio(temp.getPrevio());
                temp.getPrevio().setSiguiente(nuevoNodo);
                temp.setPrevio(nuevoNodo);

            }
            this.cont++;
        }
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
            } else { //¿Qué cambios se hacen aquí? (lista doble)
                Nodo temp = inicio;
                int cont = 0;
                while (cont < pos) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                //YA ESTOY EN EL NODO PREVIO
                Nodo objPrev = temp.getPrevio(); //MAS FACIL DE LEER 
                Nodo objSig = temp.getSiguiente();
                objPrev.setSiguiente(objSig);
                if (pos == cantNodos - 1) { //RECONECTAMOS A FIN
                    fin = objPrev;
                } else {

                }
            }
            this.cont--;
        }
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
