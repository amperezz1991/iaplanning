
package ai_planning;

//import interfaz.IA_PLANNING;
import java.util.*;

public class AI_PLANNING {
    
    public static Scanner leer = new Scanner(System.in);
    public static int tam, cant;
    public static Operador strips[];
    
    public static void main(String[] args) {
        //cargarDatos();
        usarInterfaz();
        //datosYaCargados();
        //System.out.println(Soporte.setStringList("putdown(B1,B2)"));
    }
    
    public static void usarInterfaz(){
        
        iniciarVecStrips();
        IA_PLANNING interfaz = new IA_PLANNING();
        interfaz.setVisible(true);
        
    }
    
    public static void iniciarVecStrips(){
        tam = 100;
        strips = new Operador[tam];
    }
    
    public static void setNombOperador (String nombre, int pos){
        strips[pos] = new Operador(nombre);
    }
    
    public static void datosYaCargados(){
        Estados.estados.add("holding(B1)");
        Estados.estados.add("empty");
        Estados.estados.add("ontable(B1)");
        Estados.estados.add("clear(B1)");
        Estados.estados.add("on(B1,B2)");
        iniciarVecStrips();
        
        strips[0]= new Operador("pickuptable(B1)");
        strips[0].setPrecondiciones(0,"ontable(B1)");
        strips[0].setPrecondiciones(1,"clear(B1)");
        strips[0].setPrecondiciones(2,"empty");
        strips[0].setAdicionar(0,"holding(B1)");
        strips[0].setBorrar(0,"empty");
        strips[0].setBorrar(1,"ontable(B1)");
        strips[0].setBorrar(2,"clear(B1)");
        
        strips[1]= new Operador("pickup(B1,B2)");
        strips[1].setPrecondiciones(0,"on(B1,B2)");
        strips[1].setPrecondiciones(1,"clear(B1)");
        strips[1].setPrecondiciones(2,"empty");
        strips[1].setAdicionar(0,"holding(B1)");
        strips[1].setAdicionar(1,"clear(B2)");
        strips[1].setBorrar(0,"empty");
        strips[1].setBorrar(1,"on(B1,B2)");
        strips[1].setBorrar(2,"clear(B1)");
        
        strips[2]= new Operador("putdowntable(B1)");
        strips[2].setPrecondiciones(0,"holding(B1)");
        strips[2].setAdicionar(0,"empty");
        strips[2].setAdicionar(1,"ontable(B1)");
        strips[2].setAdicionar(2,"clear(B1)");
        strips[2].setBorrar(0,"holding(B1)");
        
        strips[3]= new Operador("putdown(B1,B2)");
        strips[3].setPrecondiciones(0,"clear(B2)");
        strips[3].setPrecondiciones(1,"holding(B1)");
        strips[3].setAdicionar(0,"empty");
        strips[3].setAdicionar(1,"on(B1,B2)");
        strips[3].setAdicionar(2,"clear(B1)");
        strips[3].setBorrar(0,"clear(B2)");
        strips[3].setBorrar(0,"holding(B1)");
        
        MundoActual.mundoActual.add("empty");
        MundoActual.mundoActual.add("ontable(b2)");
        MundoActual.mundoActual.add("clear(b1)");
        MundoActual.mundoActual.add("on(b1,b2)");
        MundoActual.mundoActual.add("ontable(b3)");
        MundoActual.mundoActual.add("clear(b3)");
        
        MundoFinal.mundoFinal.add("empty");
        MundoFinal.mundoFinal.add("ontable(b2)");
        MundoFinal.mundoFinal.add("on(b1,b2)");
        MundoFinal.mundoFinal.add("on(b3,b1)");
        MundoFinal.mundoFinal.add("clear(b3)");
    }
    
    public static void cargarDatos(){
       
        System.out.println("Ingrese los estados");
        Estados.introEstado();
        
        System.out.println("Ingrese la cantidad de operadores a generar");
        tam=leer.nextInt();
        strips = new Operador[tam];
        try{
        for(int i=0; i<tam; i++){
            System.out.println("Ingrese los valores del operador numero " + (i+1));
            System.out.println("------------------------------------");
            System.out.println("Ingrese el Nombre del operador: ");
            strips[i]= new Operador(leer.next());
            System.out.println("Cuantas precondiciones hay: ");
            cant = leer.nextInt();
            strips[i].setPrecondiciones(cant);
            System.out.println("Cuantas elementos de la lista adiciones hay: ");
            cant = leer.nextInt();
            strips[i].setAdicionar(cant);
            System.out.println("Cuantas elementos de la lista borrado hay: ");
            cant = leer.nextInt();
            strips[i].setBorrar(cant);
            System.out.println("------------------------------------");
        }
        }catch(Exception e){}
        
        
        //mostrar los operadores
        for(int i=0;i<tam;i++){
            Soporte.mostrarOperador(strips[i], "Operador" + (i+1));
        }
        
        System.out.println("Ingrese el mundo actual");
        MundoActual.cargarLista();
        
        
        System.out.println("Ingrese el mundo final");
        MundoFinal.cargarLista();
        
        System.out.println("************************\n" + "Calculando Respuesta \n" + "************************" );
        Proceso.compararListas();
    }
    
    public static void mostrar(){
        //mostrar los operadores
        int tamOper = Soporte.cantOperadores();
        for(int i=0;i<tamOper;i++){
            Soporte.mostrarOperador(strips[i], "Operador" + (i+1));
        }
        
        Soporte.imprimirLista(MundoActual.mundoActual, "mundo actual");
        Soporte.imprimirLista(MundoFinal.mundoFinal, "mundo final");
        
        System.out.println("************************\n" + "Calculando Respuesta \n" + "************************" );
    }
    
}
