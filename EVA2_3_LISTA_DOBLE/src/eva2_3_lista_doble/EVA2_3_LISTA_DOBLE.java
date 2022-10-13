package eva2_3_lista_doble;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexis M
 */
public class EVA2_3_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble listaDoble = new ListaDoble();
        listaDoble.agregar(10);//0
        listaDoble.agregar(20);//1
        listaDoble.agregar(30);//2
        listaDoble.agregar(40);//3
        listaDoble.imprimir();
        
        try {
            listaDoble.insertarEn(5, 0);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_3_LISTA_DOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("");
        System.out.println("Nùmero 5 insertado en posición 0");
        listaDoble.imprimir();
        
        System.out.println("");
    }

}
