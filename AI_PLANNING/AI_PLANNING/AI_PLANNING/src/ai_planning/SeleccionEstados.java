


package ai_planning;

import java.util.*;
import javax.swing.*;


public class SeleccionEstados extends javax.swing.JFrame {

    
     /**
     * ************************************************************************
     * LISTADOS DE ESTADOS, Y  LISTA DE ACCIONES
     * ************************************************************************
     */
    //para cargar al jlist    
    public static DefaultListModel lista = new DefaultListModel();
    
    public static List listaCargar = new ArrayList(); 
    public static Boolean elijio = false;

    public SeleccionEstados() {
        initComponents();
        
    }
    
    public void iniciar(){
        acciones.setText(IA_PLANNING.identLista);
        operador.setText(IA_PLANNING.identOperador);
        this.setTitle("Ingres de la lista " + acciones.getText() + " del operador " + operador.getText());
        //Mostrar los datos en la lista de la interfaz
        this.jLstEstados.setModel(IA_PLANNING.listaEstados);
        listaCargar.clear();
        lista.clear();
        
        this.jTAAdvertencias.setText("");
        
        int pos = Soporte.busquedaOperador(operador.getText());
        
        if (acciones.getText().equals(IA_PLANNING.precondicion) ){
            if (Soporte.cargadaPrecondicion(pos)){
                lista = Soporte.verListaEnStripsPrecondicion(pos) ;
                listaCargar = Soporte.verListEnStripsPrecondicion(pos);
                //Soporte.cargadoPrecond = false;
            }
        }else{
            if (acciones.getText().equals(IA_PLANNING.adicion ) ){
                if(Soporte.cargadaAdicion(pos)){
                    lista = Soporte.verListaEnStripsAdicion(pos) ;
                    listaCargar = Soporte.verListEnStripsAdicion(pos);
                    //Soporte.cargadoAdicion = false;
                }
            }else {
                if (acciones.getText().equals(IA_PLANNING.borrar ) ){
                    if(Soporte.cargadaBorrado(pos)){
                        lista = Soporte.verListaEnStripsBorrar(pos) ;
                        listaCargar = Soporte.verListEnStripsBorrar(pos);
                        //Soporte.cargadoBorrado = false;
                    }
                }
            }
        }
        jLstOperadores.setModel(lista);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jLstOperadores = new javax.swing.JList();
        jBAñadir = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLstEstados = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        operador = new javax.swing.JLabel();
        acciones = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAAdvertencias = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTModEstado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane4.setViewportView(jLstOperadores);

        jBAñadir.setText("Añadir");
        jBAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAñadirActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jLstEstados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstEstadosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jLstEstados);

        jLabel10.setText("Lista de Estados");

        jLabel12.setText("  del operador");

        operador.setText("YYYY");

        acciones.setText(" XXX ");

        jLabel15.setText("Lista de ");

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jTAAdvertencias.setEditable(false);
        jTAAdvertencias.setColumns(20);
        jTAAdvertencias.setRows(5);
        jScrollPane1.setViewportView(jTAAdvertencias);

        jLabel3.setText("Advertencias");

        jLabel1.setText("Modifica el estado:");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(operador))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acciones))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTModEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTModEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jBAñadir)
                        .addGap(11, 11, 11)
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acciones)
                            .addComponent(jLabel15))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(operador)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAñadirActionPerformed
        // Agregar estandarizacion del estado a la lista

        if (elijio){
            if(Soporte.validarVariable(jTModEstado.getText())){
                lista.addElement(this.jTModEstado.getText());
                listaCargar.add(this.jTModEstado.getText());
                this.jLstOperadores.setModel(lista);
                jTModEstado.setText("");
                elijio = false;
            }else{
                escribeAdvertencia("RECUERDE LAS VARIABLES COMIENZAN CON MAYUSCULA.");
            }
        }else{
            escribeAdvertencia("Primero debe elejir un elemento en la lista de estados para añadir \n"
                    + "y evitar problemas de escritura, \n"
                    + "RECUERDE LAS VARIABLES COMIENZAN CON MAYUSCULA.\n"
                    + "Gracias.");
        }
    }//GEN-LAST:event_jBAñadirActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int pos = jLstOperadores.getSelectedIndex();
        if (pos>=0){
            lista.remove(pos) ;
            listaCargar.remove(pos);
            escribeAdvertencia("Recuerda GUARDAR la nueva información");
        }else{
            escribeAdvertencia("Primero debe elejir un elemento en la lista de " + acciones.getText() + " para Elimiar.");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        // Borra todos los elementos de la lista
        lista.removeAllElements();
        listaCargar.clear();
        // Actualizar la lista interfaz
        this.jLstOperadores.setModel(lista);
        escribeAdvertencia("Se ha eliminado toda la lista de " + acciones.getText() );
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        
        
        int pos = Soporte.busquedaOperador(operador.getText());
        
        if (pos < 0){
            pos = Soporte.posNuevoOperador();
            AI_PLANNING.setNombOperador(operador.getText(), pos);
        }
        if (acciones.getText().equals(IA_PLANNING.precondicion) ){
            Soporte.cargarPrecond(listaCargar, pos);  
        }else{
            if (acciones.getText().equals(IA_PLANNING.adicion ) ){
                Soporte.cargarAdicion(listaCargar, pos);
            }else{
                if (acciones.getText().equals(IA_PLANNING.borrar ) ){
                    Soporte.cargarBorrar(listaCargar, pos);
                }
            }
        }
        escribeAdvertencia( AI_PLANNING.strips[pos].getNombre() + "\n" + acciones.getText() + "\n" + listaCargar.toString());
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jLstEstadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstEstadosMouseClicked
        
        int pos = jLstEstados.getSelectedIndex();
        if (pos>=0){
            jTModEstado.setText(IA_PLANNING.listaEstados.get(pos).toString());
            elijio = true;
        }
    }//GEN-LAST:event_jLstEstadosMouseClicked

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        
        IA_PLANNING.cargarEstados.setVisible(false);
    }//GEN-LAST:event_jBSalirActionPerformed

    /**
     * ************************************************************************
     * CODIGO DE APOYO
     * ************************************************************************
     */    
    
    //Permite escribir las advertencias del programa.
    private void escribeAdvertencia(String advertencia){
        this.jTAAdvertencias.setText(advertencia);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acciones;
    private javax.swing.JButton jBAñadir;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jLstEstados;
    private javax.swing.JList jLstOperadores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTAAdvertencias;
    private javax.swing.JTextField jTModEstado;
    private javax.swing.JLabel operador;
    // End of variables declaration//GEN-END:variables
}
