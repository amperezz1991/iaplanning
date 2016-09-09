package ai_planning;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Operador{
    public  String nombre;
    private List precondiciones = new ArrayList();
    private List adicionar = new ArrayList();
    private List borrar = new ArrayList();
    public Operador(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List getPrecondiciones() { return precondiciones; }
    public String getPrecondiciones(int pos) { return precondiciones.get(pos).toString(); }
    public void setPrecondiciones(int pos, String precondiciones) { this.precondiciones.add(pos, precondiciones); }
    public void borrarPrecondiciones(){ this.precondiciones.clear(); }
    public void borrarAdiciones(){ this.adicionar.clear(); }
    public void borrarBorrar(){ this.borrar.clear(); }
    public void setPrecondiciones(int cant) { for (int i=0;i<cant;i++){ setPrecondiciones(i,Soporte.cargarLista(i,"precondicion")); } }
    public void setPrecondiciones(List precondiciones) { this.precondiciones = precondiciones; }
    public void setAdicionar(List adicionar) { this.adicionar = adicionar; }
    public void setBorrar(List borrar) { this.borrar = borrar; }
    public List getAdicionar() { return adicionar; }
    public String getAdicionar(int pos) { return adicionar.get(pos).toString(); }
    public void setAdicionar(int pos, String adicionar) { this.adicionar.add(pos,adicionar); }
    public void setAdicionar(int cant) { for (int i=0;i<cant;i++){ setAdicionar(i,Soporte.cargarLista(i,"adición")); } }
    public List getBorrar() { return borrar; }
    public String getBorrar(int pos) { return borrar.get(pos).toString(); } 
    public void setBorrar(int pos, String borrar) { this.borrar.add(pos, borrar); }
    public void setBorrar(int cant) { for (int i=0;i<cant;i++){ setBorrar(i,Soporte.cargarLista(i,"adición")); } }
}