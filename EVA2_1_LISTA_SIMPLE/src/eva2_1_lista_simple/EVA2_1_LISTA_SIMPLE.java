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
        miLista.agregar(10);//0
        miLista.agregar(20);//1
        miLista.agregar(30);//2 aqui debe quedar temp
        miLista.agregar(40);//3 <----- inserción
        miLista.agregar(50);//4
        miLista.agregar(60);//5
        try{
            miLista.insertarEn(70, 3);
        } catch (Exception ex){
            ex.printStackTrace();

        ///int[] arreglo = new int [1000000];
        
       /*for (int i = 0; i < 1000000; i++) { //(N^2)
            miLista.agregar(1000);*/
            
        }
        //System.out.println("Conteo de nodos: " + miLista.tamaLista());
        miLista.imprimir();
        
        
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
