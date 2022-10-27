package eva2_7_collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Alexis M.
 */
public class EVA2_7_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LISTA
        System.out.println("--------LinkedList--------");
        LinkedList<String> listaEnlazada = new LinkedList();
        listaEnlazada.add("Hola");
        listaEnlazada.add("Checo");
        listaEnlazada.add("Te amo");
        listaEnlazada.add("!!");
        System.out.println(listaEnlazada);
        System.out.println(listaEnlazada.get(0));
        listaEnlazada.remove(0);
        System.out.println(listaEnlazada);
        listaEnlazada.addFirst("Hola");
        System.out.println(listaEnlazada);
        System.out.println("--------Valores impresos con for--------");
        for (int i = 0; i < listaEnlazada.size(); i++) {
            System.out.print(listaEnlazada.get(i) + " ");
        }
        System.out.println("");
        System.out.println("--------ArrayList--------");
        //ARRAYLIST
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        System.out.println(arrayList);
        arrayList.add(2, 250);
        System.out.println(arrayList);
        System.out.println("--------Valores impresos con for--------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        //QUEUES
        //STACK
        //CONJUNTOS
    }

}
