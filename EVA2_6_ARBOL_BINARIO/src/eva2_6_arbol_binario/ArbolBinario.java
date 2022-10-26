package eva2_6_arbol_binario;

/**
 *
 * @author Alexis M.
 */
public class ArbolBinario {

    private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }

    //metodo publico para el usuario
    public void agregar(int valor) {
        //1 QUE EL NODO RECIBIDO ES NULL
        //Arbol vacio
        if (root == null) {
            root = new Nodo(valor);
        } else {
            agregarRecur(valor, root);
        }
    }

    //metodo recursivo agregar
    //necesita el valor y el nodo actual
    private void agregarRecur(int valor, Nodo nodoActual) {
        //2 DECIDIR SI VA A IQZ O DER
        /*
         verificra su el lado (nodo) es null
         si es null, ahi va el valor
         si no
         repetir recursion
         */
        Nodo nuevo = new Nodo(valor);
        if (valor < nodoActual.getValor()) { //va a izq
            if (nodoActual.getIzquierda() == null) 
                nodoActual.setIzquierda(nuevo);
             else 
                agregarRecur(valor, nodoActual.getIzquierda());            
        } else if (valor > nodoActual.getValor()) { //va a la der
              if (nodoActual.getDerecha() == null) 
                nodoActual.setDerecha(nuevo);
             else 
                agregarRecur(valor, nodoActual.getDerecha()); 
        } else {//IGUAL
            System.out.println("¡¡ELEMENTO REPETIDO!!"); //IGNORAR
        }
        
       
    } //IMPRESION DE VALORES:
        //IN ORDER
        //izq valor der
        //metodo público
        public void inOrder(){
            inOrderRecu(root);
            System.out.println("");
        }
        //metodo privado recursivo
        private void inOrderRecu(Nodo nodo){
            if(nodo != null){
                inOrderRecu(nodo.getIzquierda());
                System.out.print(nodo.getValor() + " - ");
                inOrderRecu(nodo.getDerecha());
            }
        }
}
