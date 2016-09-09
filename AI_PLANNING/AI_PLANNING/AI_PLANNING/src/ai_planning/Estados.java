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
public class Estados {
    
    
    public static List estados=new ArrayList();
    public static Scanner leer = new Scanner(System.in);

    public static List getEstados() {
        return estados;
    }

    public static void setEstados(List estados) {
        Estados.estados = estados;
    }
    
    public static void introEstado(){
        int n;
        System.out.println("Ingrese la cantidad de los estados: ");
        n=leer.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Ingrese el estado numero " + (i+1) + " del problema: ");
            String esta=leer.next();
            estados.add(esta);
        }
    }
    
    public static String elegirEstado(String nombre){
        String nomEstado;
        int n;
        for(int i=0;i<estados.size();i++){
            System.out.println((i+1) + " " + estados.get(i));
        }
        System.out.println("Elija el estado que desea " + nombre + ":");
        n=leer.nextInt();
        nomEstado= estados.get(n-1).toString();
        return nomEstado;
    }
    
}
