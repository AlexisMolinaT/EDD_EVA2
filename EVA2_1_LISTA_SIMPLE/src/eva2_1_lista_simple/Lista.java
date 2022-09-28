package eva2_1_lista_simple;

/**
 *
 * @author Alexis M.
 */
public class Lista {
    private Nodo inicio;

    //POR DEFAULT, LA LISTA ESRA VACIA
    public Lista() {
        this.inicio = null;  //NO HAY NODOS EN LA LISTA
    }
    
    
    public void imprimir(){
        Nodo temp = inicio;
            //¿COMO MUEVO A TEMP?
            while(temp.getSiguiente() != null){ //EL WHILE SIRVE PARA MOVERNOS  
                System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
                
            }
    }
    
    
    //AGREGAR UN NODO AL FINAL DE LA LISTA
    public void agreagar(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        
        //VERIFICAR SI HAY NODOS EN LA LISTA
        if(inicio == null){//NO HAY NODOS EN LA LISTA
            inicio = nuevoNodo;
    }else{ //HAY NODOS EN LA LISTA
        //HAY QUE MOVERNOS POR LA LISTA
        //USANDO UN NODO TEMPORAL HASTA EL
        //ULTIMO NODO DE LA LISTA
            Nodo temp = inicio;
            //¿COMO MUEVO A TEMP?
            while(temp.getSiguiente() != null){ //EL WHILE SIRVE PARA MOVERNOS  
                temp = temp.getSiguiente();
                
            }
            temp.setSiguiente(nuevoNodo);
    }
    
}
}