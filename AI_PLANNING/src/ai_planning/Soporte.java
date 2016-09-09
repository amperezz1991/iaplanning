
package ai_planning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.*;

public class Soporte {
    
    
    public static Scanner leer = new Scanner(System.in);
    public static final String extension = ".stp";
    public static final String estados = "LISTA DE ESTADOS";
    public static final String strips = "LISTA DE STRIPS";
    public static final String mundoActual = "MUNDO ACTUAL";
    public static final String mundoFinal = "MUNDO FINAL";
    public static final String comentario = "//";
    public static final String espacios = "                         ";
    public static final String comodin = "jokey";
    
    
    public static List cargarListaPantalla(int cant, String nombreLista){
        List valores = new ArrayList();
        for (int i = 0; i < cant; i++){
            System.out.println("Ingrese el elemento numero " + (i+1) + " de la lista " + nombreLista + ": ");
            valores.add(i, Estados.elegirEstado(nombreLista));
        }
        return valores;
    }
    
    public static String cargarLista(int i, String nombreLista){
        String valores;
        System.out.println("Ingrese el elemento numero " + (i+1) + " de la lista " + nombreLista + ": ");
        valores=Estados.elegirEstado(nombreLista);
        return valores;
    }
    
    public static void mostrarOperador(Operador imprimir, String nombre){
        System.out.println(nombre);
        System.out.println("Nombre: " + imprimir.getNombre());
        System.out.println("Precondiciones: " + imprimir.getPrecondiciones());
        //imprimir.getPrecondiciones();
        System.out.println("Adicionar: " + imprimir.getAdicionar());
        System.out.println("Borrar: " + imprimir.getBorrar());
    }
    
    public static void imprimirStrips(){
        System.out.println("imprimir strips");
        for(int i=0;i<Soporte.cantOperadores();i++){
            Soporte.mostrarOperador(AI_PLANNING.strips[i], "Operador" + (i+1));
        }
    }
    
    public static void imprimirLista (List imprimir, String nombre){
        System.out.println(nombre);
        for(int i = 0; i < imprimir.size(); i++){
            System.out.print(imprimir.get(i) + ", ");
        }
        System.out.println();
    }
    
    public static String nombConstanteOperador (String constantes, int posOperador, String variables){
    /*    String resultado = AI_PLANNING.strips[posOperador].getNombre();
        String varOperador = filtrarSegundaParte(resultado, "(", 0);
        if(varOperador.equals(variables)){
            resultado = filtrarPrimerParte(resultado, "(", 0) + constantes;
        }
        return resultado;
    }
    
    
    public static String renombrar (String constantes, int posOperador, String variables){*/
        String resultado = AI_PLANNING.strips[posOperador].getNombre(),primR,segR;
        //resultado = filtrarPrimerParte(resultado, "(", 0);
        int pos, cant;
        List constant = new ArrayList();
        List var = new ArrayList();
        
        constant = setStringList(constantes);
        var = setStringList(variables);
        
        //System.out.println("constant: " + constant.toString() + " var: "+ var.toString());
        
        //int limI = Mayor(constant.size(), var.size());
        int limI = var.size();
        for( int i = 0; i < limI; i++){
            //if (constant.size() < i){
            pos = resultado.indexOf(var.get(i).toString());
            cant = var.get(i).toString().length();
                if ( pos >= 0){
                    primR = resultado.substring(0,pos) + constant.get(i).toString();
                    segR = resultado.substring(pos+cant);
                    resultado = primR + segR;
                    //resultado.replaceAll(var.get(i).toString(), constant.get(i).toString());
                }
            //}
        }
        //organizar lo de la mayuscula en el proceso se tiene que meter un jokey
        return resultado;
    }
    
    public static int Mayor(int uno, int dos){
        int mayor = uno;
        if ( mayor > dos){
            mayor = dos;
        }
        return mayor;
    }
    
    public static String renombrar (int posOperador){
        String nombre = "", primP = "", primMA = "", constantes = "", variable = "";
        int limI = AI_PLANNING.strips[posOperador].getPrecondiciones().size();
        
        for (int i = 0; i < limI; i++){
            int limJ = Proceso.mundoActual.size();
            variable = AI_PLANNING.strips[posOperador].getPrecondiciones(i).toString();
            primP = filtrarPrimerParte(variable , "(", 0);
            for (int j = 0; j < limJ; j++){
                constantes = Proceso.mundoActual.get(j).toString();
                primMA = filtrarPrimerParte(constantes , "(", 0);
                if (primP.equals(primMA)){
                    Proceso.constantes = Soporte.filtrarSegundaParte(constantes, "(", 0);
                    Proceso.variables = Soporte.filtrarSegundaParte(variable, "(", 0);
                    Proceso.adicionOriginal = variable;
                    nombre = nombConstanteOperador(Proceso.constantes, posOperador, Proceso.variables);
                }
            }
        }
        
        return nombre;
    }
    
    public static String filtrarPrimerParte (String dato, String filtro, int error){
        String filtrado = dato;
        int pos = dato.indexOf(filtro);
        if (pos > -1){
            filtrado = dato.substring(0,pos+error);
        }
        return filtrado;
    }
    
    public static String filtrarSegundaParte (String dato, String filtro, int error){
        String filtrado = dato;
        int pos = dato.indexOf(filtro);
        if (pos > -1){
            filtrado = dato.substring(pos+error);
        }
        return filtrado;
    }
    
    public static String cambioVarAConst (String precondicion, String constantes,
            String operVariable, String adiVariable){
       
        String resultado = filtrarPrimerParte(precondicion, "(", 1);
        
        if (precondicion.indexOf("(") >= 0){
            List varOperador = new ArrayList();  // operVariable
            List varAdicion = new ArrayList(); //adiVariable
            List posVarAdicion = new ArrayList(); //posicion de los parametros de la ads en funcion del operador
            List varCondicion = new ArrayList();  //precondicion
            List posVarCondi = new ArrayList(); //posicion de los parametros de la precondicion en funcion del operador
            //List constOperador = new ArrayList();  // para identificar las constantes segun las variables
            String constOperador[];
            List constAdicion = new ArrayList(); //constantes
            List constCondicion = new ArrayList();  //resultado
            //cargar valores
            varOperador = setStringList(operVariable);
            int tam = varOperador.size();
            varAdicion = setStringList(adiVariable);
            varCondicion = setStringList(precondicion);
            constAdicion = setStringList(constantes);  
            
            constOperador = new String[tam];
            
            //ubicando las posiciones de las variables 
            for(int i = 0; i < varOperador.size(); i++){
                for(int j = 0; j < varAdicion.size(); j++){
                    if(varOperador.get(i).toString().equals(varAdicion.get(j).toString()) ){
                        posVarAdicion.add(i);
                        break;
                    }
                }
            }
            //no recuerdo para que es esto
            for(int i = 0; i < varOperador.size(); i++){
                for(int j = 0; j < varCondicion.size(); j++){
                    if(varOperador.get(i).toString().equals(varCondicion.get(j).toString()) ){
                        posVarCondi.add(i);
                        break;
                    }
                }
            }    
            
            //identificando las constantes segun la posicion de las variables
            for(int i = 0; i < constAdicion.size(); i++){
                int pos = Integer.parseInt(posVarAdicion.get(i).toString());
                if ( pos >= 0){
                    constOperador[pos] = constAdicion.get(i).toString(); 
                }
            }
            
            for ( int i = 0; i < tam; i++){
                if (constOperador[i] == null){
                    constOperador[i] = comodin;
                }
            }
            
            for(int i = 0; i < posVarCondi.size(); i++){
                int pos = Integer.parseInt(posVarCondi.get(i).toString());
                if ( pos >= 0){
                    constCondicion.add( constOperador[pos] );
                }
                resultado = resultado + constCondicion.get(i) + ",";
            }
            
            resultado = resultado.substring(0,resultado.length()-1) + ")";
        }
        return resultado;
    }
    
    public static Boolean comparar (String mundoActual, String precondicion){
        Boolean resultado = false;
        String primMA = "", primP = "";
        List parMA = new ArrayList();
        List parP = new ArrayList();
            
            
        if( mundoActual.equals(precondicion) ){
            resultado = true;
        }else{
            if (precondicion.indexOf(comodin) >= 0){
                primMA = filtrarPrimerParte(mundoActual, "(", 0);
                primP = filtrarPrimerParte(precondicion, "(", 0);
                if (primMA.equals(primP)){
                    parMA = setStringList(mundoActual);
                    parP = setStringList(precondicion);
                    for ( int i = 0; i < parMA.size(); i++){
                        if(parMA.get(i) == parP.get(i) || 
                                parP.get(i).toString().equals(comodin)){
                            resultado = true;
                            Proceso.constantes = filtrarSegundaParte(mundoActual, "(", 0);
                            Proceso.adicionOriginal = Proceso.precondicion;
                        }
                    }
                }
            }
        }
        
        return resultado;
    }
    
    public static List setStringList(String valores){
        int pos=0;
        List resultado = new ArrayList();  
        
        valores = filtrarSegundaParte(valores,"(",1);
        valores = filtrarPrimerParte(valores,")",0);
        do{
            resultado.add(filtrarPrimerParte(valores,",",0));
            pos = valores.indexOf(",");
            valores = filtrarSegundaParte(valores,",",1);
        } while (pos >= 0 );
        
        return resultado;
    }
    
    public static Boolean validarConstante(String evaluar){
        Boolean valido = false;
        char caracter;
        List parametros = new ArrayList(setStringList(evaluar));
        if (!evaluar.equals(parametros.get(0))){
            for (Object parametro : parametros) {
                caracter = parametro.toString().charAt(0) ;
                if (Character.isLowerCase(caracter) ){
                    valido = true;
                } else {
                    valido = false;
                    break;
                }
            }
        }else{
            valido = true;
        }
        return valido;
    }
    
    public static Boolean validarVariable(String evaluar){
        Boolean valido = false;
        char caracter;
        List parametros = new ArrayList(setStringList(evaluar));
        if (!evaluar.equals(parametros.get(0))){
            for (Object parametro : parametros) {
                caracter = parametro.toString().charAt(0) ;
                if (Character.isUpperCase(caracter) ){
                    valido = true;
                } else {
                    valido = false;
                    break;
                }
            }
        }else{
            valido = true;
        }
        return valido;
    }
    
    public static List verListEnStripsPrecondicion(int pos){
        List respuesta = new ArrayList();
        int tam = AI_PLANNING.strips[pos].getPrecondiciones().size();
        if(tam>0){
            for (int i = 0; i < tam; i++){
                respuesta.add(AI_PLANNING.strips[pos].getPrecondiciones(i));
            }
        }
        return respuesta;
    }
    
    public static List verListEnStripsAdicion(int pos){
        List respuesta = new ArrayList();
        int tam = AI_PLANNING.strips[pos].getAdicionar().size();
        if(tam>0){
            for (int i = 0; i < tam; i++){
                respuesta.add(AI_PLANNING.strips[pos].getAdicionar(i));
            }  
        }
        return respuesta;
    }
    
    public static List verListEnStripsBorrar(int pos){
        List respuesta = new ArrayList();
        int tam = AI_PLANNING.strips[pos].getBorrar().size();
        if(tam>0){
            for (int i = 0; i < tam; i++){
                respuesta.add(AI_PLANNING.strips[pos].getBorrar(i));
            }
        }
        return respuesta;
    }
    
    public static DefaultListModel verListaEnStripsPrecondicion(int pos){
        DefaultListModel respuesta = new DefaultListModel();
        int tam = AI_PLANNING.strips[pos].getPrecondiciones().size();
        if(tam > 0){
            for (int i = 0; i < tam; i++){
                respuesta.addElement(AI_PLANNING.strips[pos].getPrecondiciones(i));
            }
        }
        return respuesta;
    }
    
    public static DefaultListModel verListaEnStripsAdicion(int pos){
        DefaultListModel respuesta = new DefaultListModel();
        
        int tam = AI_PLANNING.strips[pos].getAdicionar().size();
        if(tam>0){
            for (int i = 0; i < tam; i++){
                respuesta.addElement(AI_PLANNING.strips[pos].getAdicionar(i));
            }
        }
        return respuesta;
    }
    
    public static DefaultListModel verListaEnStripsBorrar(int pos){
        DefaultListModel respuesta = new DefaultListModel();
        
        int tam = AI_PLANNING.strips[pos].getBorrar().size();
        if(tam>0){
            for (int i = 0; i < tam; i++){
                respuesta.addElement(AI_PLANNING.strips[pos].getBorrar(i));
            }
        }
        return respuesta;
    }
    
    public static void cargarPrecond(List lista, int pos){
        AI_PLANNING.strips[pos].borrarPrecondiciones();
        for (int i = 0; i < lista.size(); i++){
            AI_PLANNING.strips[pos].setPrecondiciones(i, lista.get(i).toString());     
            //cargadoPrecond = true;
        }
    }
    
    public static void cargarAdicion(List lista, int pos){
        AI_PLANNING.strips[pos].borrarAdiciones();
        for (int i = 0; i < lista.size(); i++){
            AI_PLANNING.strips[pos].setAdicionar(i, lista.get(i).toString());
            //cargadoAdicion = true;
        }
        //imprimirLista(AI_PLANNING.strips[pos].getAdicionar(), "lista adicion");
    }
    
    public static void cargarBorrar(List lista, int pos){
        AI_PLANNING.strips[pos].borrarBorrar();
        for (int i = 0; i < lista.size(); i++){
            AI_PLANNING.strips[pos].setBorrar(i, lista.get(i).toString());
            //cargadoBorrado = true;
        }
        //imprimirLista(AI_PLANNING.strips[pos].getBorrar(), "lista borrar");
    }
    
    //para cargar el nombre del operador
    public static int busquedaOperador(String operador){
        int pos = -1, tam;
        tam = AI_PLANNING.tam;
        for ( int i = 0; i < tam; i++){
            if (AI_PLANNING.strips[i] != null ){
                if (AI_PLANNING.strips[i].getNombre().equals(operador)){
                    pos = i;
                    break;
                }
            }else{
                break;
            }
        }
        return pos;
    }
    
    public static int posNuevoOperador(){
        int pos = -1, tam = AI_PLANNING.tam;
        for ( int i = 0; i < tam; i++){
            if (AI_PLANNING.strips[i] == null){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    //ver cantidad de operadores ingresados
    public static int cantOperadores (){
        int cantidad = 0;
        
        for (int i = 0; i < AI_PLANNING.tam; i++){
            if (AI_PLANNING.strips[i] == null){
                cantidad = i;
                break;
            }
        }
        
        return cantidad;
    }
    
    //para guardar el archivo
    public static void guardarArchivo(List mundoActual, List mundoFinal, int respuesta, javax.swing.JFileChooser guardar){
        
        String nombArchivo;
        if(respuesta==javax.swing.JFileChooser.APPROVE_OPTION){
                nombArchivo=guardar.getSelectedFile().toString();
                int tam=nombArchivo.length();
                String subCad=nombArchivo.substring(tam-4);
                if (!subCad.equals(extension)){
                    nombArchivo+=extension;
                }
                guardar(nombArchivo, mundoActual, mundoFinal);
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Guardado sin finalizar");
        }
    }
    
    public static void guardar(String dir, List mundoActual, List mundoFinal){
        
        String separador = "; ";
        try{
                FileWriter arch = new FileWriter(dir);
                BufferedWriter bw = bw = new BufferedWriter(new FileWriter(dir, true));
                PrintWriter salida = new PrintWriter (bw);

                int tamMA = mundoActual.size();
                int tamMF = mundoFinal.size();
                int tamStrips = cantOperadores();
                int tamEstados = IA_PLANNING.listaEstadosCargar.size();
                
                salida.println("LISTA DE ESTADOS:");
                for ( int i = 0; i < tamEstados; i++){
                    salida.println(IA_PLANNING.listaEstadosCargar.get(i));
                }
                
                salida.println();
                salida.println("LISTA DE STRIPS:");
                salida.println("//Nombre Operador: Lista Precondiciones: Lista Adiciones: Lista Borrados");
                
                String operador;
                for( int i = 0; i < tamStrips; i++){
                    salida.print(AI_PLANNING.strips[i].getNombre()+": ");
                    int limPrecond = AI_PLANNING.strips[i].getPrecondiciones().size();
                    for ( int j = 0; j < limPrecond; j++){
                        salida.print(AI_PLANNING.strips[i].getPrecondiciones(j));
                        if ( (j+1) == limPrecond ){
                            salida.print(": ");
                        }else{
                            salida.print(separador);
                        }
                    }
                    int limAdiciones = AI_PLANNING.strips[i].getAdicionar().size();
                    for ( int j = 0; j < limAdiciones; j++){
                        salida.print(AI_PLANNING.strips[i].getAdicionar(j));
                        if ( (j+1) == limAdiciones ){
                            salida.print(": ");
                        }else{
                            salida.print(separador);
                        }
                    }
                    int limBorrados = AI_PLANNING.strips[i].getBorrar().size();
                    for ( int j = 0; j < limBorrados; j++){
                        salida.print(AI_PLANNING.strips[i].getBorrar(j));
                        if ( (j+1) == limBorrados ){
                            salida.println();
                        }else{
                            salida.print(separador);
                        }
                    }
                    
                }
                
                salida.println();
                salida.println("MUNDO ACTUAL:");
                for( int i = 0; i < tamMA; i++){
                    salida.println(mundoActual.get(i).toString());
                }
                
                salida.println();
                salida.println("MUNDO FINAL:");
                for( int i = 0; i < tamMF; i++){
                    salida.println(mundoFinal.get(i).toString());
                }
               
                salida.close();
                bw.close();
                arch.close();  
            }
            catch(IOException e){
                javax.swing.JOptionPane.showMessageDialog(null, "Anomalia en el flujo de salida\n"+e);
            }
    }
    
    //para abrir el archivo
    public static void abrirArchivo(javax.swing.JFileChooser abrirArch, int resp) {
        //Boolean dondeImprime = false;
        if (resp == javax.swing.JFileChooser.APPROVE_OPTION) {
            String dir = abrirArch.getSelectedFile().toString();
            //dondeImprime=abrir(dir);
            int tam = dir.length();
            String ext = dir.substring(tam-4);
            if ( ext.equals(extension)){
                abrir(dir);
            }else{
                IA_PLANNING.advertencia = ("TIPO DE DOCUMENTO NO VALIDO");
            }
        } else {
            IA_PLANNING.advertencia = ("NO CARGO EL ARCHIVO");
        }
        //return dondeImprime;
    }
    
    public static void abrir(String dir){
        //String dato = "";
        try {
                System.out.println("dir " + dir);
                FileReader lee = new FileReader(dir);
                BufferedReader entrada = new BufferedReader(lee);
                String doc;
                int codigoAbrir, cargarDatos = 0;
                while ((doc = entrada.readLine()) != null) {
                    if (doc.indexOf(comentario) == -1  && (!doc.trim().equals("")) ){
                        codigoAbrir = buscarLista(cargarDatos, doc);
                        if (cargarDatos == codigoAbrir){
                            switch (codigoAbrir){
                                case 1:{
                                    //Cargar estados
                                    IA_PLANNING.listaEstados.addElement(doc);
                                    IA_PLANNING.listaEstadosCargar.add(doc);
                                    Estados.estados.add(doc); break;
                                }
                                case 2:{
                                    //Cargar strips
                                    cargarOperadores(doc); break;
                                }
                                case 3:{
                                    //Cargar Mundo Actual
                                    IA_PLANNING.listaMundoActual.addElement(doc);
                                    IA_PLANNING.listaMundoActualCargar.add(doc);
                                    MundoActual.mundoActual.add(doc); break;
                                }   
                                case 4:{
                                    //Cargar Mundo Final
                                    IA_PLANNING.listaMundoFinal.addElement(doc);
                                    IA_PLANNING.listaMundoFinalCargar.add(doc);
                                    MundoFinal.mundoFinal.add(doc); break;
                                }
                                default: break;
                            }
                        }
                        cargarDatos = codigoAbrir;
                    }
                }
                entrada.close();
                lee.close();
            } catch (java.io.FileNotFoundException fnfex) {
                IA_PLANNING.advertencia = ("ARCHIVO NO ENCONTRADO\n");
            } catch (java.io.IOException ioex) {
                IA_PLANNING.advertencia = ("ARCHIVO NO ENCONTRADO\n");
            }
        //return dato;
    }
    
    public static int buscarLista (int codigoActual, String dato){
        int codigo = 0, pos = -1;
        
        dato = dato.toUpperCase();
        pos = dato.indexOf(estados);
        if(pos >= 0){
            codigo = 1;
        }else{
            pos = dato.indexOf(strips);
            if(pos >= 0){
                codigo = 2;
            }else{
                pos = dato.indexOf(mundoActual);
                if(pos >= 0){
                    codigo = 3;
                }else{
                    pos = dato.indexOf(mundoFinal);
                    if(pos >= 0){
                        codigo = 4;
                    }else{
                        codigo = codigoActual;
                    }
                }
            }
        }
        
        return codigo;        
    }
    
    public static void cargarOperadores (String dato){
        String nombre = null, precondicion = null , adicion = null ,
                borrar = null, primerParte = null, filtrado = ";";
        int pos, filtro = 0, posList=0;
        
        nombre = filtrarPrimerParte(dato, ":", 0);
        nombre = nombre.trim();
        dato = filtrarSegundaParte(dato, ":", 1);
        
        precondicion = filtrarPrimerParte(dato, ":", 0);
        precondicion = precondicion.trim();
        dato = filtrarSegundaParte(dato, ":", 1);
        
        adicion = filtrarPrimerParte(dato, ":", 0);
        adicion = adicion.trim();
        dato = filtrarSegundaParte(dato, ":", 1);
        
        borrar = dato;
        borrar = borrar.trim();
        //guardar posicion del strips
        pos = posNuevoOperador();
        //guardar el nombre del operador
        if (nombre != null){
            AI_PLANNING.setNombOperador(nombre, pos);
            IA_PLANNING.listaOperadores.addElement(nombre);
        }else{
            IA_PLANNING.advertencia += "NO SE HA IDENTIFICADO EL NOMBRE DEL OPERADOR "
                    + "\nEN EL ARCHIVO";
        }
        
        //guardar la lista de precondicion
        if (precondicion != null){
            do{
                precondicion = precondicion.trim();
                primerParte = filtrarPrimerParte(precondicion,filtrado,0);
                AI_PLANNING.strips[pos].setPrecondiciones(posList, primerParte);
                posList++;
                filtro = precondicion.indexOf(filtrado);
                precondicion = filtrarSegundaParte(precondicion,filtrado,1);
            }while (filtro >= 0);
        }else{
            IA_PLANNING.advertencia += "NO SE HA IDENTIFICADO LA LISTA DE PRECONDICIONES "
                    + "\nEN EL ARCHIVO";
        }
        
        //guardar la lista de adicion
        filtro = 0; posList=0;
        if (adicion != null){
            do{
                adicion = adicion.trim();
                primerParte = filtrarPrimerParte(adicion,filtrado,0);
                AI_PLANNING.strips[pos].setAdicionar(posList, primerParte);
                posList++;
                filtro = adicion.indexOf(filtrado);
                adicion = filtrarSegundaParte(adicion,filtrado,1);
            }while (filtro >= 0);
        }else{
            IA_PLANNING.advertencia += "NO SE HA IDENTIFICADO LA LISTA DE ADICIONES "
                    + "\nEN EL ARCHIVO";
        }
        
        //guardar la lista de borrar
        filtro = 0; posList=0;
        if (borrar != null){
            do{
                borrar = borrar.trim();
                primerParte = filtrarPrimerParte(borrar,filtrado,0);
                AI_PLANNING.strips[pos].setBorrar(posList, primerParte);
                posList++;
                filtro = borrar.indexOf(filtrado);
                borrar = filtrarSegundaParte(borrar,filtrado,1);
            }while (filtro >= 0);
        }else{
            IA_PLANNING.advertencia += "NO SE HA IDENTIFICADO LA LISTA DE BORRADOS "
                    + "\nEN EL ARCHIVO";
        }
        
    }
    
    
    //listas estan cargadas
    public static Boolean cargadaPrecondicion(int pos){
        Boolean cargado = false;
        if(AI_PLANNING.strips[pos].getPrecondiciones().size() > 0){
            cargado = true;
        }
        return cargado;
    }
    
    public static Boolean cargadaAdicion(int pos){
        Boolean cargado = false;
        if(AI_PLANNING.strips[pos].getAdicionar().size() > 0){
            cargado = true;
        }
        return cargado;
    }
    
    public static Boolean cargadaBorrado(int pos){
        Boolean cargado = false;
        if(AI_PLANNING.strips[pos].getBorrar().size() > 0){
            cargado = true;
        }
        return cargado;
    }
    
    
    //ver strips para la interfaz ver "ACCIONES A REALIZAR"
    public static String organizarStrips (){
        String datos = "", nombre;
        int tam = cantOperadores(), tamMayorList;
        for ( int i = 0; i < tam; i++){
            nombre = completar(AI_PLANNING.strips[i].getNombre(), espacios.length());
            datos = datos + nombre;
            tamMayorList = tamañoMayor(i);
            for( int j = 0; j < tamMayorList; j++){
                if (j > 0){
                    datos = datos + espacios;
                }
                if (j < AI_PLANNING.strips[i].getPrecondiciones().size() ){
                    datos = datos + completar(AI_PLANNING.strips[i].getPrecondiciones(j), nombre.length());
                }else{
                    datos = datos + espacios;
                }
                if (j < AI_PLANNING.strips[i].getAdicionar().size() ){
                    datos = datos + completar(AI_PLANNING.strips[i].getAdicionar(j), espacios.length() );
                }else{
                    datos = datos + espacios;
                }
                if (j < AI_PLANNING.strips[i].getBorrar().size() ){
                    datos = datos + completar(AI_PLANNING.strips[i].getBorrar(j), espacios.length() );
                }else{
                    datos = datos + espacios;
                }
                datos = datos + "\n";
            }
            datos = datos + "\n";
        }
        return datos;
    }
    
    public static String completar(String dato, int tamTotal){
        //String completo = null;
        //int tamTotal = espacios.length();
        while(dato.length()<tamTotal){
            dato = dato + " ";
        }
        return dato;
    }
    
    public static int tamañoMayor(int pos){
        int mayor = AI_PLANNING.strips[pos].getPrecondiciones().size();
        
        if(mayor < AI_PLANNING.strips[pos].getAdicionar().size() ){
            mayor = AI_PLANNING.strips[pos].getAdicionar().size();
            if(mayor < AI_PLANNING.strips[pos].getBorrar().size()){
                mayor = AI_PLANNING.strips[pos].getBorrar().size();
            }
        }else{
            if(mayor < AI_PLANNING.strips[pos].getBorrar().size()){
                mayor = AI_PLANNING.strips[pos].getBorrar().size();
                if(mayor < AI_PLANNING.strips[pos].getAdicionar().size() ){
                mayor = AI_PLANNING.strips[pos].getAdicionar().size();
                }
            }
        }
        
        return mayor;
    }
    
    
    //imprimir el proceso
    public static String verProceso(){
        String proceso = "";
        
        int tamProceso = Proceso.proceso.size();
        for ( int i = 0; i < tamProceso; i++ ){
            proceso += Proceso.proceso.get(i).toString() + "\n";
        }
        
        return proceso;
        
    }
    
    //imprimir el resultado
    public static String verResultado(){
        String resultado = "";
        
        int tamResultado = Proceso.resultado.size();
        for (int i = 0; i < tamResultado; i++ ){
            resultado += Proceso.resultado.get(i).toString() + "\n";
        }
        
        return resultado;
    }
    
}
