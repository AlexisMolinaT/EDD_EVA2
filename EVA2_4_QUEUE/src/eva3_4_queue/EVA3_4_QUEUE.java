package eva3_4_queue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexis M.
 */
public class EVA3_4_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //add --> al final de la lista
        //poll --> lee y elimina el primier elemento de la lista
        //peek --> lee el primer elemento de la lista
        MyQueue myQueue = new MyQueue();
        //FIFO --> FIRST IN FIRST OUT
        myQueue.agregar(10); //PRIMERO EN LLEGAR, PRIMERO EN SER ATENDIDO
        myQueue.agregar(20);
        myQueue.agregar(30);
        myQueue.agregar(40);
        myQueue.agregar(50); //ÚLTIMO EN LLEGAR, ÚLTIMO EN SER ATENDIDO
        System.out.println("El primer valor en llegar es: " + myQueue.peek());
        myQueue.imprimir();
        
        System.out.println("");
        try {
            System.out.println("El primer valor en llegar es: " + myQueue.poll());
        } catch (Exception ex) {
            Logger.getLogger(EVA3_4_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        myQueue.imprimir();
    }

}
