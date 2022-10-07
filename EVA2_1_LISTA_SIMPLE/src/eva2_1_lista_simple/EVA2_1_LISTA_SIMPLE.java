package eva2_1_lista_simple;

import java.util.logging.Level;
import java.util.logging.Logger;

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
        System.out.println("La cantidad de nodos es: " + miLista.tamaLista());
        miLista.agregar(10);//0
        miLista.agregar(20);//1
        miLista.agregar(30);//2 aqui debe quedar temp
        miLista.agregar(40);//3 <----- inserción
        miLista.agregar(50);//4
        miLista.agregar(60);//5
        System.out.println("La cantidad de nodos es: " + miLista.tamaLista());
        miLista.imprimir();
        try {
            miLista.insertarEn(70, 3);
        } catch (Exception ex) {
            ex.printStackTrace();

            ///int[] arreglo = new int [1000000];
            /*for (int i = 0; i < 1000000; i++) { //(N^2)
             miLista.agregar(1000);*/
        }

        //System.out.println("Conteo de nodos: " + miLista.tamaLista());
        System.out.println("");
        miLista.imprimir();
        System.out.println("");
        /*
         miLista.vaciarLista(); //Se psuo en comentarios por que la lista estaba vacia y no
         se podia imprimir el número en la posición 4 (metodo de abajo) 
         miLista.imprimir();*/

        System.out.println("");
        System.out.println("La cantidad de nodos es: " + miLista.tamaLista());

        try {
            miLista.borrarEn(3);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_1_LISTA_SIMPLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.imprimir();
        System.out.println("");
        try {
            System.out.println("Valor en 4: " + miLista.obtenValorEn(4));

        } catch (Exception ex) {
            Logger.getLogger(EVA2_1_LISTA_SIMPLE.class.getName()).log(Level.SEVERE, null, ex);
        }

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
