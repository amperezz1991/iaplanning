
package ai_planning;

import java.util.*;

public class MundoActual {
    
    public static List mundoActual = new ArrayList();
    
    public static void cargarLista(){
        Scanner leer = new Scanner(System.in);
        int cant;
        System.out.println("Cuantas elementos exsistiran en mundo actual: ");
        cant = leer.nextInt();
        mundoActual = Soporte.cargarListaPantalla(cant, "mundo actual");
        Soporte.imprimirLista(mundoActual, "mundo actual");
    }

    public static List getMundoActual() {
        return mundoActual;
    }

    public static void setMundoActual(List mundoActual) {
        MundoActual.mundoActual = mundoActual;
    }

}
