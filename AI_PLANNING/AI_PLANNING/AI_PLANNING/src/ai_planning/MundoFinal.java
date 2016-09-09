/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_planning;

import java.util.*;

/**
 *
 * @author DIANA
 */
public class MundoFinal {
    
    public static List mundoFinal = new ArrayList();
    
    public static void cargarLista(){
        Scanner leer = new Scanner(System.in);
        int cant;
        System.out.println("Cuantas elementos exsistiran en mundo final: ");
        cant = leer.nextInt();
        mundoFinal = Soporte.cargarListaPantalla(cant, "mundo final");
        Soporte.imprimirLista(mundoFinal, "mundo fina");
    }

    public static List getMundoFinal() {
        return mundoFinal;
    }

    public static void setMundoFinal(List mundoFinal) {
        MundoFinal.mundoFinal = mundoFinal;
    }


    
}
