
package ai_planning;

import java.util.*;


public class Proceso {
    
    public static List metas = new ArrayList(); 
    public static int posOperador;
    //almacena las iteraciones
    public static List proceso = new ArrayList();
    //almacena la solucion
    public static List resultado = new ArrayList();
    //copiar mundo actual
    public static List mundoActual = new ArrayList();
    
    //para filtrar las operaciones
    public static String constantes, variables, nombreOperador, 
            adicionOriginal, precondicion = "";
    
    public static void adminPreceso(){
        limpiar();
        mundoActual = MundoActual.mundoActual;
        //Soporte.imprimirStrips();
        compararListas();
        
        //Soporte.imprimirLista(resultado, "respuesta: ");
        
    }

    public static void limpiar(){
        metas.clear();
        proceso.clear();
        resultado.clear();
        mundoActual.clear();
        posOperador = -1;
        constantes = "";
        variables = ""; 
        nombreOperador = "";
        adicionOriginal = "";
        precondicion = "";
    }
    
    public static void compararListas(){
        
        String mundoFin = "", mundoAct = "";
        int limI =  MundoFinal.mundoFinal.size();
        for(int i = 0; i < limI; i++){
            int limJ = mundoActual.size() ;
            for(int j = 0; j< limJ; j++){
                //limJ = mundoActual.size() ;
                if (i<limI){
                    mundoFin = MundoFinal.mundoFinal.get(i).toString();
                    mundoAct = mundoActual.get(j).toString();
                }
                if (!mundoFin.equals(mundoAct)){
                    if ((j+1) == limJ){
                        metas.add(MundoFinal.mundoFinal.get(i));
                        resolverMeta();
                    }
                }else{
                    if (i < limI){
                        i++;
                        j=-1;
                    }
                }
            }
        }
    }
    
    public static void resolverMeta(){
        String meta, accionAdicion;
        int limI = Soporte.cantOperadores(), limJ;
        //System.out.println("LIMI " + limI);
        for(int i = 0; i < limI; i++){
            //System.out.println(AI_PLANNING.strips[i].getAdicionar().toString());
            if (i<limI){
                limJ = AI_PLANNING.strips[i].getAdicionar().size();
            } else {
                limJ = 0;
            }
            for(int j = 0; j < limJ; j++){
                if (metas.size()>0){
                    if (i<limI){
                        limJ = AI_PLANNING.strips[i].getAdicionar().size();
                    } /*else {
                        limJ = 0;
                    }*/
                    constantes = metas.get(metas.size()-1).toString();
                    meta = Soporte.filtrarPrimerParte(constantes, "(", 0);
                    //constantes = Soporte.filtrarSegundaParte(constantes);
                    adicionOriginal = AI_PLANNING.strips[i].getAdicionar(j);
                    accionAdicion = Soporte.filtrarPrimerParte(adicionOriginal, "(", 0);
                    if (meta.equals(accionAdicion)){
                        constantes = Soporte.filtrarSegundaParte(constantes, "(", 0);
                        variables = Soporte.filtrarSegundaParte(adicionOriginal, "(", 0);
                        posOperador = i;
                        nombreOperador = Soporte.nombConstanteOperador(constantes, 
                                posOperador, variables);
                        //System.out.println("meta: " + metas.get(metas.size()-1).toString() + " operador: " + nombreOperador);
                        if (AI_PLANNING.strips[posOperador].getNombre().equals(nombreOperador)){
                            nombreOperador = Soporte.renombrar(posOperador);
                           // nombreOperador = Soporte.renombrar(constantes, 
                           //     posOperador, variables);
                            //System.out.println("meta: " + metas.get(metas.size()-1).toString() + " operador: " + nombreOperador);
                        }
                        proceso.add(nombreOperador);
                        evaluarOperador();
                        i = 0;
                        j = -1;
                    }
                }else{
                    posOperador = -1;
                    i = limI;
                    break;
                }
            }
        }
    }
    
    public static void evaluarOperador(){
        String accionesPrecond = "", mundoActu;
        Boolean cambiar = false;
        
        int limI = AI_PLANNING.strips[posOperador].getPrecondiciones().size();
        int limJ = mundoActual.size();
        
        for(int i = 0; i < limI; i++){
            for(int j = 0; j < limJ ; j++){
                //limI = AI_PLANNING.strips[posOperador].getPrecondiciones().size();
                if ( posOperador < 0){
                    i=limI;
                    break;
                }
                if (!cambiar){
                    precondicion = AI_PLANNING.strips[posOperador].getPrecondiciones(i);
                    //necesito crear un comodin.
                    accionesPrecond = Soporte.cambioVarAConst(precondicion, constantes,
                        AI_PLANNING.strips[posOperador].getNombre() , adicionOriginal);
                    cambiar = true;
                }
                //mundo actual y filtrar las variables
                mundoActu = mundoActual.get(j).toString();
                if (!Soporte.comparar(mundoActu, accionesPrecond)){ // accionesPrecond.equals(mundoActu)){
                    if ((j+1) == limJ ){
                        cambiar = false;
                        metas.add(accionesPrecond);
                        resolverMeta();
                        //j = i = 0;
                    }
                } else {
                    if ( i < limI ){
                        if (i==(limI-1 )){
                            //guardar resultado
                            variables = Soporte.filtrarSegundaParte(adicionOriginal, "(", 0);
                            nombreOperador = Soporte.nombConstanteOperador(constantes, 
                                posOperador, variables);
                            resultado.add(nombreOperador);
                            borrar();
                            agregar();
                            metas.remove(metas.size()-1);
                            break;
                        }
                        cambiar = false;
                        i++;
                        j=-1;
                    }
                }
            }
        }
    }
    
    public static void borrar(){
        int limI = AI_PLANNING.strips[posOperador].getBorrar().size();
        int limJ = mundoActual.size();
        Boolean cambiar = false;
        String estadoMundo, estadoQuitar = "";
        for(int i = 0; i < limI; i++){
            for (int j = 0; j < limJ ; j++){
                if (!cambiar){
                    estadoQuitar = AI_PLANNING.strips[posOperador].getBorrar(i);
                    estadoQuitar = Soporte.cambioVarAConst(estadoQuitar, constantes,
                            AI_PLANNING.strips[posOperador].getNombre(), adicionOriginal);
                    cambiar = true;
                }
                estadoMundo =  mundoActual.get(j).toString();
                if (estadoMundo.equals(estadoQuitar) ){
                    mundoActual.remove(j);
                    cambiar = false;
                    if (i < (limI-1)){
                        i++;
                        j=-1;
                    } else {
                        break;
                    }
                }
            }
            cambiar = false;
        }
        //Soporte.imprimirLista(mundoActual, "mundo Actual despues de Borrar");
    }
    
    public static void agregar(){
        int limI = AI_PLANNING.strips[posOperador].getAdicionar().size();
        String estadoAdicionar = "";
        for ( int i = 0; i < limI; i++ ){
            estadoAdicionar = AI_PLANNING.strips[posOperador].getAdicionar(i);
            estadoAdicionar = Soporte.cambioVarAConst(estadoAdicionar, constantes,
                    AI_PLANNING.strips[posOperador].getNombre(), adicionOriginal);
            mundoActual.add(estadoAdicionar);
        }/*
        Soporte.imprimirLista(mundoActual, "mundo Actual despues de adicionar");
        //System.out.println();
        Soporte.imprimirLista(proceso, "proceso: ");
        //System.out.println();
        Soporte.imprimirLista(resultado, "respuesta: ");
        //System.out.println("**************************************************************************************************");
    */
    }
      
}
