package eva2_1_lista_simple;

/**
 *
 * @author Alexis M.
 */
public class EVA2_1_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista miLista = new Lista();
        ///int[] arreglo = new int [1000000];
        
        for (int i = 0; i < 1000000; i++) { //(N^2)
            miLista.agreagar(1000);
            
        }
        System.out.println("Conteo de nodos: " + miLista.tamaLista());
        
        
        
        /*miLista.agreagar(10);
        miLista.agreagar(20);
        miLista.agreagar(30);
        miLista.agreagar(40);
        miLista.agreagar(50);
        miLista.agreagar(60);
        miLista.imprimir();
        */
                
    }
    
}
