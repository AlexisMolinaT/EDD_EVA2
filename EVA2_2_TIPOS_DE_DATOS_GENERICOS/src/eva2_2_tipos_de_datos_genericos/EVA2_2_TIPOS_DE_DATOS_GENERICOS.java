package eva2_2_tipos_de_datos_genericos;

import java.util.LinkedList;

/**
 *
 * @author Alexis M.
 */
public class EVA2_2_TIPOS_DE_DATOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> miLista = new LinkedList<String>();
        //miLista.
        TiposDatosGenericos<Integer> miObj = new TiposDatosGenericos<Integer>();
        miObj.setValor(100);
        System.out.println("Tu número es: " + miObj.getValor());
    }
    
}

class TiposDatosGenericos<T>{
    private T valor;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    
}
