
package ai_planning;

import java.util.*;
import javax.swing.*;


public class IA_PLANNING extends javax.swing.JFrame {
    
    /**
     * ************************************************************************
     * LISTADOS DE ESTADOS, OPERADORES, PRECONDICIONES
     * ADICIONES, BORRADOS, MUNDO ACTUAL Y MUNDO FINAL
     * ************************************************************************
     */
    //para cargar al jlist    
    public static DefaultListModel listaEstados = new DefaultListModel();
    public static DefaultListModel listaOperadores = new DefaultListModel();
    public static DefaultListModel listaPrecondiciones = new DefaultListModel();
    public static DefaultListModel listaAdiciones = new DefaultListModel();
    public static DefaultListModel listaBorrar = new DefaultListModel();
    public static DefaultListModel listaMundoActual = new DefaultListModel();
    public static DefaultListModel listaMundoFinal = new DefaultListModel();
    //para cargar la lista de estados porque no se puede castear
    public static List listaEstadosCargar = new ArrayList();
    public static List listaMundoActualCargar = new ArrayList();
    public static List listaMundoFinalCargar = new ArrayList();
    
    public static String identLista=null;
    public static String identOperador=null;
    public static final String precondicion=" Precondiciones ";
    public static final String adicion=" Adiciones ";    
    public static final String borrar=" Borrar ";
    public static Boolean elijioMA = false;
    public static Boolean elijioMF = false;
    public static String advertencia = "";
    
    

    public static SeleccionEstados cargarEstados = new SeleccionEstados();
    
    public IA_PLANNING() {
        initComponents();
        cargarListas();
        this.setTitle("PLANIFICACION STRIPS");
        this.jLPresentacion.setText("Este software, es un Shell de la tecnica de inteligencia\n  artificial planificacion...... ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTPPrincipal = new javax.swing.JTabbedPane();
        jPPresentacion = new javax.swing.JPanel();
        jLPresentacion = new javax.swing.JLabel();
        jPIngresoDatos = new javax.swing.JPanel();
        jTInsertVar = new javax.swing.JTabbedPane();
        jPDefEstados = new javax.swing.JPanel();
        jTDefEstados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBAgregarEstado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstEstados = new javax.swing.JList();
        jBEliminarEstado = new javax.swing.JButton();
        jBBorrarEstado = new javax.swing.JButton();
        jBGuardarEstado = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPDefOperador = new javax.swing.JPanel();
        jBAgregarOperador = new javax.swing.JButton();
        jBBorrarOperador = new javax.swing.JButton();
        jBEliminarOperador = new javax.swing.JButton();
        jTDefOperador = new javax.swing.JTextField();
        jBGuardarAccion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLstOperadores = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jLstPrecondiciones = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLstAdiciones = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        jLstBorrados = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLPrecondicion = new javax.swing.JLabel();
        jLAdiciones = new javax.swing.JLabel();
        jLBorrados = new javax.swing.JLabel();
        jBEditarPrecondicion = new javax.swing.JButton();
        jBEditarAdiciones = new javax.swing.JButton();
        jBEditarBorrados = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPDefMundoActual = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTDefMA = new javax.swing.JTextField();
        jBAgregarMA = new javax.swing.JButton();
        jBEliminarMA = new javax.swing.JButton();
        jBBorrarMA = new javax.swing.JButton();
        jBGuardarMA = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jLstMA = new javax.swing.JList();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jLstEstMA = new javax.swing.JList();
        jPDefMundoFinal = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTDefMF = new javax.swing.JTextField();
        jBAgregarMF = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jLstEstMF = new javax.swing.JList();
        jBEliminarMF = new javax.swing.JButton();
        jBBorrarMF = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jBGuardarMF = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jLstMF = new javax.swing.JList();
        jPVerAcciones = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTAVerStrips = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jLVerMA = new javax.swing.JList();
        jScrollPane20 = new javax.swing.JScrollPane();
        jLVerMF = new javax.swing.JList();
        jPProcesoPlanning = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTAProceso = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTAResultado = new javax.swing.JTextArea();
        jBCalcular = new javax.swing.JButton();
        jPCreditos = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAAdvertencias = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMAbrir = new javax.swing.JMenu();
        jMGuardar = new javax.swing.JMenu();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPPresentacionLayout = new javax.swing.GroupLayout(jPPresentacion);
        jPPresentacion.setLayout(jPPresentacionLayout);
        jPPresentacionLayout.setHorizontalGroup(
            jPPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPresentacionLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(341, Short.MAX_VALUE))
        );
        jPPresentacionLayout.setVerticalGroup(
            jPPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPresentacionLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        jTPPrincipal.addTab("PRESENTACION", jPPresentacion);

        jLabel2.setText("Estado a introducir:");

        jBAgregarEstado.setText("Agregar");
        jBAgregarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarEstadoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jLstEstados);

        jBEliminarEstado.setText("Eliminar");
        jBEliminarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarEstadoActionPerformed(evt);
            }
        });

        jBBorrarEstado.setText("Borrar");
        jBBorrarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarEstadoActionPerformed(evt);
            }
        });

        jBGuardarEstado.setText("Guardar");
        jBGuardarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarEstadoActionPerformed(evt);
            }
        });

        jLabel8.setText("Estados a agregar: ");

        javax.swing.GroupLayout jPDefEstadosLayout = new javax.swing.GroupLayout(jPDefEstados);
        jPDefEstados.setLayout(jPDefEstadosLayout);
        jPDefEstadosLayout.setHorizontalGroup(
            jPDefEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDefEstadosLayout.createSequentialGroup()
                .addGroup(jPDefEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPDefEstadosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPDefEstadosLayout.createSequentialGroup()
                        .addGroup(jPDefEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDefEstadosLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel8))
                            .addGroup(jPDefEstadosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPDefEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDefEstadosLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTDefEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPDefEstadosLayout.createSequentialGroup()
                                        .addComponent(jBAgregarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBEliminarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBBorrarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBGuardarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );
        jPDefEstadosLayout.setVerticalGroup(
            jPDefEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDefEstadosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPDefEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDefEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(jPDefEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregarEstado)
                    .addComponent(jBEliminarEstado)
                    .addComponent(jBBorrarEstado)
                    .addComponent(jBGuardarEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTInsertVar.addTab("DEFINICION DE ESTADOS", jPDefEstados);

        jBAgregarOperador.setText("Agregar Operador");
        jBAgregarOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarOperadorActionPerformed(evt);
            }
        });

        jBBorrarOperador.setText("Borrar Operador");
        jBBorrarOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarOperadorActionPerformed(evt);
            }
        });

        jBEliminarOperador.setText("Eliminar Operador");
        jBEliminarOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarOperadorActionPerformed(evt);
            }
        });

        jBGuardarAccion.setText("Guardar Acción");
        jBGuardarAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarAccionActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre del Operador: ");

        jLabel7.setText("Operadores de la lista ");

        jLstOperadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstOperadoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jLstOperadores);

        jLabel9.setText("Lista de precondiciones del operador ");

        jScrollPane4.setViewportView(jLstPrecondiciones);

        jScrollPane5.setViewportView(jLstAdiciones);

        jScrollPane6.setViewportView(jLstBorrados);

        jLabel10.setText("Lista de Adiciones del operador ");

        jLabel11.setText("Lista de Borrados del operador ");

        jLPrecondicion.setText(" ");

        jLAdiciones.setText(" ");

        jLBorrados.setText(" ");

        jBEditarPrecondicion.setText("Editar Precondición");
        jBEditarPrecondicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarPrecondicionActionPerformed(evt);
            }
        });

        jBEditarAdiciones.setText("Editar Adiciones");
        jBEditarAdiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarAdicionesActionPerformed(evt);
            }
        });

        jBEditarBorrados.setText("Editar Borrados");
        jBEditarBorrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarBorradosActionPerformed(evt);
            }
        });

        jLabel12.setText("de acciones: ");

        javax.swing.GroupLayout jPDefOperadorLayout = new javax.swing.GroupLayout(jPDefOperador);
        jPDefOperador.setLayout(jPDefOperadorLayout);
        jPDefOperadorLayout.setHorizontalGroup(
            jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDefOperadorLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTDefOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                .addComponent(jBAgregarOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBEliminarOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBBorrarOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(jBGuardarAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDefOperadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLPrecondicion)))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDefOperadorLayout.createSequentialGroup()
                                .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jBEditarPrecondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLAdiciones)))
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDefOperadorLayout.createSequentialGroup()
                                .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jBEditarAdiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLBorrados)
                                    .addComponent(jBEditarBorrados, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPDefOperadorLayout.setVerticalGroup(
            jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDefOperadorLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jBGuardarAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDefOperadorLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTDefOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBAgregarOperador)
                            .addComponent(jBEliminarOperador)
                            .addComponent(jBBorrarOperador))))
                .addGap(18, 18, 18)
                .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDefOperadorLayout.createSequentialGroup()
                        .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLPrecondicion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel12)
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEditarPrecondicion))
                    .addGroup(jPDefOperadorLayout.createSequentialGroup()
                        .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLBorrados))
                            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(5, 5, 5)
                                .addComponent(jLAdiciones)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDefOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBEditarAdiciones))
                            .addGroup(jPDefOperadorLayout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBEditarBorrados)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTInsertVar.addTab("DEFINICION DE ACCIONES", jPDefOperador);

        jLabel14.setText("Estado a introducir:");

        jBAgregarMA.setText("Agregar");
        jBAgregarMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarMAActionPerformed(evt);
            }
        });

        jBEliminarMA.setText("Eliminar");
        jBEliminarMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarMAActionPerformed(evt);
            }
        });

        jBBorrarMA.setText("Borrar");
        jBBorrarMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarMAActionPerformed(evt);
            }
        });

        jBGuardarMA.setText("Guardar");
        jBGuardarMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarMAActionPerformed(evt);
            }
        });

        jLabel15.setText("Estados a agregar: ");

        jScrollPane7.setViewportView(jLstMA);

        jLabel18.setText("Estados a agregar:  (ESTADOS BASE)");

        jLstEstMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstEstMAMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jLstEstMA);

        javax.swing.GroupLayout jPDefMundoActualLayout = new javax.swing.GroupLayout(jPDefMundoActual);
        jPDefMundoActual.setLayout(jPDefMundoActualLayout);
        jPDefMundoActualLayout.setHorizontalGroup(
            jPDefMundoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDefMundoActualLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPDefMundoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDefMundoActualLayout.createSequentialGroup()
                        .addGroup(jPDefMundoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPDefMundoActualLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jBAgregarMA, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBEliminarMA, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPDefMundoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDefMundoActualLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15)
                            .addGroup(jPDefMundoActualLayout.createSequentialGroup()
                                .addComponent(jBBorrarMA, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jBGuardarMA, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addGroup(jPDefMundoActualLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTDefMA, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPDefMundoActualLayout.setVerticalGroup(
            jPDefMundoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDefMundoActualLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPDefMundoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDefMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGroup(jPDefMundoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDefMundoActualLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPDefMundoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBAgregarMA)
                            .addComponent(jBEliminarMA)
                            .addComponent(jBBorrarMA)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDefMundoActualLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBGuardarMA)))
                .addGap(18, 18, 18)
                .addGroup(jPDefMundoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPDefMundoActualLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDefMundoActualLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTInsertVar.addTab("MUNDO ACTUAL", jPDefMundoActual);

        jLabel19.setText("Estado a introducir:");

        jBAgregarMF.setText("Agregar");
        jBAgregarMF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarMFActionPerformed(evt);
            }
        });

        jLabel20.setText("Estados a agregar:  (ESTADOS BASE)");

        jLstEstMF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstEstMFMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jLstEstMF);

        jBEliminarMF.setText("Eliminar");
        jBEliminarMF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarMFActionPerformed(evt);
            }
        });

        jBBorrarMF.setText("Borrar");
        jBBorrarMF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarMFActionPerformed(evt);
            }
        });

        jLabel21.setText("Estados a agregar: ");

        jBGuardarMF.setText("Guardar");
        jBGuardarMF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarMFActionPerformed(evt);
            }
        });

        jScrollPane11.setViewportView(jLstMF);

        javax.swing.GroupLayout jPDefMundoFinalLayout = new javax.swing.GroupLayout(jPDefMundoFinal);
        jPDefMundoFinal.setLayout(jPDefMundoFinalLayout);
        jPDefMundoFinalLayout.setHorizontalGroup(
            jPDefMundoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDefMundoFinalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPDefMundoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDefMundoFinalLayout.createSequentialGroup()
                        .addGroup(jPDefMundoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20)
                            .addGroup(jPDefMundoFinalLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jBAgregarMF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBEliminarMF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane10))
                        .addGroup(jPDefMundoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDefMundoFinalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21)
                                .addGap(270, 405, Short.MAX_VALUE))
                            .addGroup(jPDefMundoFinalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jBBorrarMF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jBGuardarMF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPDefMundoFinalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(122, Short.MAX_VALUE))))
                    .addGroup(jPDefMundoFinalLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTDefMF, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPDefMundoFinalLayout.setVerticalGroup(
            jPDefMundoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDefMundoFinalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPDefMundoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDefMF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(23, 23, 23)
                .addGroup(jPDefMundoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregarMF)
                    .addComponent(jBEliminarMF)
                    .addComponent(jBBorrarMF)
                    .addComponent(jBGuardarMF))
                .addGap(18, 18, 18)
                .addGroup(jPDefMundoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPDefMundoFinalLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDefMundoFinalLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTInsertVar.addTab("MUNDO FINAL", jPDefMundoFinal);

        javax.swing.GroupLayout jPIngresoDatosLayout = new javax.swing.GroupLayout(jPIngresoDatos);
        jPIngresoDatos.setLayout(jPIngresoDatosLayout);
        jPIngresoDatosLayout.setHorizontalGroup(
            jPIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTInsertVar, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPIngresoDatosLayout.setVerticalGroup(
            jPIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTInsertVar)
        );

        jTPPrincipal.addTab("INGRESO DE DATOS", jPIngresoDatos);

        jLabel16.setText("OPERADOR");

        jLabel17.setText("LISTA DE PRECONDICIONES");

        jLabel22.setText("LISTA DE BORRADOS");

        jLabel23.setText("LISTA DE ADICIONES");

        jTAVerStrips.setColumns(20);
        jTAVerStrips.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTAVerStrips.setRows(5);
        jTAVerStrips.setText("\n");
        jScrollPane15.setViewportView(jTAVerStrips);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("ACCIONES A REALIZAR", jPanel5);

        jLabel24.setText("MUNDO ACTUAL");

        jLabel25.setText("MUNDO FINAL");

        jScrollPane17.setViewportView(jLVerMA);

        jScrollPane20.setViewportView(jLVerMF);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel24))
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25))
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("UNA VISTA AL MUNDO", jPanel6);

        javax.swing.GroupLayout jPVerAccionesLayout = new javax.swing.GroupLayout(jPVerAcciones);
        jPVerAcciones.setLayout(jPVerAccionesLayout);
        jPVerAccionesLayout.setHorizontalGroup(
            jPVerAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPVerAccionesLayout.setVerticalGroup(
            jPVerAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPVerAccionesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTPPrincipal.addTab("VER DATOS", jPVerAcciones);

        jLabel26.setText("PASO A PASO");

        jLabel27.setText("RESULTADO");

        jTAProceso.setColumns(20);
        jTAProceso.setRows(5);
        jScrollPane18.setViewportView(jTAProceso);

        jTAResultado.setColumns(20);
        jTAResultado.setRows(5);
        jScrollPane19.setViewportView(jTAResultado);

        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPProcesoPlanningLayout = new javax.swing.GroupLayout(jPProcesoPlanning);
        jPProcesoPlanning.setLayout(jPProcesoPlanningLayout);
        jPProcesoPlanningLayout.setHorizontalGroup(
            jPProcesoPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProcesoPlanningLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPProcesoPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPProcesoPlanningLayout.createSequentialGroup()
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPProcesoPlanningLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel27)
                        .addGap(146, 146, 146)))
                .addGap(118, 118, 118))
        );
        jPProcesoPlanningLayout.setVerticalGroup(
            jPProcesoPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProcesoPlanningLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPProcesoPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPProcesoPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jLabel27))
                    .addComponent(jBCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPProcesoPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTPPrincipal.addTab("PROCESO DE LA PLANIFICACION", jPProcesoPlanning);

        jLabel28.setText("ESTEFANIA AGUIERRE");

        jLabel29.setText("DIANA GAVIRIA");

        jLabel30.setText("ANGELA MARIA PEREZ");

        javax.swing.GroupLayout jPCreditosLayout = new javax.swing.GroupLayout(jPCreditos);
        jPCreditos.setLayout(jPCreditosLayout);
        jPCreditosLayout.setHorizontalGroup(
            jPCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCreditosLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(jPCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28))
                .addContainerGap(534, Short.MAX_VALUE))
        );
        jPCreditosLayout.setVerticalGroup(
            jPCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCreditosLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel28)
                .addGap(31, 31, 31)
                .addComponent(jLabel29)
                .addGap(50, 50, 50)
                .addComponent(jLabel30)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        jTPPrincipal.addTab("CREDITOS", jPCreditos);

        jTAAdvertencias.setEditable(false);
        jTAAdvertencias.setColumns(20);
        jTAAdvertencias.setRows(5);
        jScrollPane2.setViewportView(jTAAdvertencias);

        jLabel3.setText("Advertencias");

        jMenu1.setText("ARCHIVO");

        jMAbrir.setText("Abrir");
        jMAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMAbrirMouseClicked(evt);
            }
        });
        jMenu1.add(jMAbrir);

        jMGuardar.setText("Guardar");
        jMGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMGuardarMouseClicked(evt);
            }
        });
        jMenu1.add(jMGuardar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 721, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addComponent(jTPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * ************************************************************************
     * BOTONES DE AGREGAR, ELIMINAR, BORRAR Y GUARDAR; PARA LOS DATOS QUE
     * SE DEBEN PROCESAR
     * ************************************************************************
     */    
    
    // Manipulacion de datos de las listas ESTADO
    private void jBAgregarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarEstadoActionPerformed
        // Agregar estandarizacion del estado a la lista
        if(Soporte.validarVariable(jTDefEstados.getText())){
            listaEstados.addElement(this.jTDefEstados.getText());
            listaEstadosCargar.add(this.jTDefEstados.getText());
            jTDefEstados.setText("");
        }else{
            escribeAdvertencia("RECUERDE LAS VARIABLES COMIENZAN CON MAYUSCULA.");
        }
        
    }//GEN-LAST:event_jBAgregarEstadoActionPerformed

    private void jBEliminarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarEstadoActionPerformed
        // Eliminar un elemento seleccionado de la lista
        // encuentra posicion elejida
        int pos = jLstEstados.getSelectedIndex();
        if (pos>=0){
            //remueve el elemento en la lista
            listaEstados.remove(pos);
            listaEstadosCargar.remove(pos);
            escribeAdvertencia("Recuerda GUARDAR la nueva información");
        }else{
            escribeAdvertencia("No Hay Elementos en la lista para eliminar.");
        }
    }//GEN-LAST:event_jBEliminarEstadoActionPerformed

    private void jBBorrarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarEstadoActionPerformed
        // Borra todos los elementos de la lista
        listaEstados.removeAllElements();
        listaEstadosCargar.clear();
    }//GEN-LAST:event_jBBorrarEstadoActionPerformed

    private void jBGuardarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarEstadoActionPerformed
        // Cargo la informacion al codigo fuente del programa
        Estados.setEstados(listaEstadosCargar); 
        advertencia = ("Informacion de lista de Estados GUARDADA");
        //escribeAdvertencia("Informacion de lista de Estados GUARDADA");
        cargarListas();
    }//GEN-LAST:event_jBGuardarEstadoActionPerformed

    // Manipulacion de datos de las listas OPERADORES
    private void jBAgregarOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarOperadorActionPerformed
      // Agregar estandarizacion del estado a la lista
        if(Soporte.validarVariable(jTDefOperador.getText())){
            listaOperadores.addElement(this.jTDefOperador.getText());
            //listaOperadoresCargar.add(this.jTDefOperador.getText());
            jTDefOperador.setText("");
            escribeAdvertencia("");
        }else{
            escribeAdvertencia("RECUERDE LAS VARIABLES COMIENZAN CON MAYUSCULA.");
        }
        
    }//GEN-LAST:event_jBAgregarOperadorActionPerformed

    private void jBEliminarOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarOperadorActionPerformed
        // Eliminar un elemento seleccionado de la lista
        // encuentra posicion elejida
        int pos = jLstOperadores.getSelectedIndex();
        if (pos>=0){
            //remueve el elemento en la lista
            listaOperadores.remove(pos);
            //listaOperadoresCargar.remove(pos);
            escribeAdvertencia("");
        }else{
            escribeAdvertencia("No Hay Elementos en la lista para eliminar.");
        }
    }//GEN-LAST:event_jBEliminarOperadorActionPerformed

    private void jBBorrarOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarOperadorActionPerformed
       // Borra todos los elementos de la lista
        listaOperadores.removeAllElements();
        //listaOperadoresCargar.clear();
        // Actualizar la lista interfaz
        this.jLstOperadores.setModel(listaOperadores);
    }//GEN-LAST:event_jBBorrarOperadorActionPerformed

    
    /*
    * GUARDAR ACCION POR ACCION
    */
    private void jBGuardarAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarAccionActionPerformed
        int pos = jLstOperadores.getSelectedIndex();
        escribeAdvertencia("nombre: " + AI_PLANNING.strips[pos].getNombre() + "\n pregond" + 
                AI_PLANNING.strips[pos].getPrecondiciones().toString() + "\n adicion" + 
                AI_PLANNING.strips[pos].getAdicionar().toString() + "\n borrado" +
                AI_PLANNING.strips[pos].getBorrar().toString() );
    }//GEN-LAST:event_jBGuardarAccionActionPerformed

    //elije los estados de las listas
    private void jBEditarBorradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarBorradosActionPerformed
        // Agregar estandarizacion del estado a la lista
        //SeleccionEstados cargarEstados = new SeleccionEstados();
        identLista= borrar;
        if (cargarOperador()){
            if (listaEstadosCargar.size()>=0){
                cargarEstados.setVisible(true);
                cargarEstados.iniciar();
                escribeAdvertencia("");
            }else{
                escribeAdvertencia("No se han ingresado o guardado la lista de estados.");
            }
        }
    }//GEN-LAST:event_jBEditarBorradosActionPerformed

    private void jBEditarAdicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarAdicionesActionPerformed
        // Agregar estandarizacion del estado a la lista
        //SeleccionEstados cargarEstados = new SeleccionEstados();
        identLista= adicion;
        if (cargarOperador()){
            if (listaEstadosCargar.size()>=0){
                cargarEstados.setVisible(true);
                cargarEstados.iniciar();
                escribeAdvertencia("");
            }else{
                escribeAdvertencia("No se han ingresado o guardado la lista de estados.");
            }
        }
    }//GEN-LAST:event_jBEditarAdicionesActionPerformed
    
    private void jBEditarPrecondicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarPrecondicionActionPerformed
        // Agregar estandarizacion del estado a la lista
        //SeleccionEstados cargarEstados = new SeleccionEstados();
        identLista= precondicion;
        if (cargarOperador()){
            if (listaEstadosCargar.size()>=0){
                cargarEstados.setVisible(true);
                cargarEstados.iniciar();
                escribeAdvertencia("");
            }else{
                escribeAdvertencia("No se han ingresado o guardado la lista de estados.");
            }
        }
    }//GEN-LAST:event_jBEditarPrecondicionActionPerformed

    // Manipulacion de datos de las listas MUNDO ACTUAL
    private void jBAgregarMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarMAActionPerformed
        if (elijioMA){
            if (Soporte.validarConstante(jTDefMA.getText())){
                listaMundoActual.addElement(this.jTDefMA.getText());
                listaMundoActualCargar.add(this.jTDefMA.getText());
                this.jTDefMA.setText("");
                elijioMA = false;
                escribeAdvertencia("");
            }else{
                escribeAdvertencia("RECUERDE LAS CONSTANTES COMIENZAN CON MINUSCULA.");
            }
        }else{
            escribeAdvertencia("Primero debe elejir un elemento en la lista de estados para añadir \n"
                    + "y evitar problemas de escritura, \n"
                    + "RECUERDE LAS CONSTANTES COMIENZAN CON MINUSCULA.\n"
                    + "Gracias.");
        }
    }//GEN-LAST:event_jBAgregarMAActionPerformed

    private void jBEliminarMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarMAActionPerformed
        int pos = this.jLstEstMA.getSelectedIndex();
        if (pos>=0){
            //remueve el elemento en la lista
            listaMundoActual.remove(pos);
            listaMundoActualCargar.remove(pos);
            escribeAdvertencia("Recuerda GUARDAR la nueva información");
        }else{
            escribeAdvertencia("No Hay o no ha elejido ningun Elementos en la lista para eliminar.");
        }
    }//GEN-LAST:event_jBEliminarMAActionPerformed

    private void jBBorrarMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarMAActionPerformed
        listaMundoActual.removeAllElements();
        listaMundoActualCargar.clear();
        escribeAdvertencia("");
    }//GEN-LAST:event_jBBorrarMAActionPerformed

    private void jBGuardarMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarMAActionPerformed
        MundoActual.setMundoActual(listaMundoActualCargar);
        advertencia = ("Informacion de lista del Mundo Actual GUARDADA" + MundoActual.mundoActual.toString());
        //escribeAdvertencia("Informacion de lista del Mundo Actual GUARDADA");
        //escribeAdvertencia(MundoActual.mundoActual.toString());
        cargarListas();
    }//GEN-LAST:event_jBGuardarMAActionPerformed

    // Manipulacion de datos de las listas MUNDO FINAL
    private void jBAgregarMFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarMFActionPerformed
        if (elijioMF){
             if (Soporte.validarConstante(jTDefMF.getText())){
                 listaMundoFinal.addElement(this.jTDefMF.getText());
                listaMundoFinalCargar.add(this.jTDefMF.getText());
                //jLstMF.setModel(listaMundoFinal);
                this.jTDefMF.setText("");
                elijioMF = false;
                escribeAdvertencia("");
             }else{
                escribeAdvertencia("RECUERDE LAS CONSTANTES COMIENZAN CON MINUSCULA.");
            }
        }else{
            escribeAdvertencia("Primero debe elejir un elemento en la lista de estados para añadir \n"
                    + "y evitar problemas de escritura, \n"
                    + "RECUERDE LAS CONSTANTES COMIENZAN CON MINUSCULA.\n"
                    + "Gracias.");
        }
    }//GEN-LAST:event_jBAgregarMFActionPerformed

    private void jBEliminarMFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarMFActionPerformed
        int pos = this.jLstEstMF.getSelectedIndex();
        if (pos>=0){
            //remueve el elemento en la lista
            listaMundoFinal.remove(pos);
            listaMundoFinalCargar.remove(pos);
            escribeAdvertencia("Recuerda GUARDAR la nueva información");
        }else{
            escribeAdvertencia("No Hay o no ha elejido ningun Elementos en la lista para eliminar.");
        }
    }//GEN-LAST:event_jBEliminarMFActionPerformed

    private void jBBorrarMFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarMFActionPerformed
        listaMundoFinal.removeAllElements();
        listaMundoFinalCargar.clear();
        escribeAdvertencia("");
    }//GEN-LAST:event_jBBorrarMFActionPerformed

    private void jBGuardarMFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarMFActionPerformed
        MundoFinal.setMundoFinal(listaMundoFinalCargar);
        //escribeAdvertencia("Informacion de lista del Mundo Final GUARDADA");
        //escribeAdvertencia(MundoFinal.mundoFinal.toString());
        advertencia = ("Informacion de lista del Mundo Final GUARDADA" + MundoFinal.mundoFinal.toString());
        cargarListas();
    }//GEN-LAST:event_jBGuardarMFActionPerformed

    
    private void jLstOperadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstOperadoresMouseClicked
        int pos = this.jLstOperadores.getSelectedIndex();
        if (pos > -1 ){
            this.jLAdiciones.setText(listaOperadores.get(pos).toString());
            this.jLBorrados.setText(listaOperadores.get(pos).toString());
            this.jLPrecondicion.setText(listaOperadores.get(pos).toString());
            pos = Soporte.busquedaOperador(listaOperadores.get(pos).toString());
            if (pos >= 0){
                if (Soporte.cargadaPrecondicion(pos) ){
                  listaPrecondiciones = Soporte.verListaEnStripsPrecondicion(pos) ;
                }
                if(Soporte.cargadaAdicion(pos)){
                    listaAdiciones = Soporte.verListaEnStripsAdicion(pos) ;
                }
                if(Soporte.cargadaBorrado(pos)){
                    listaBorrar = Soporte.verListaEnStripsBorrar(pos) ;
                }
            }else{
                listaPrecondiciones.clear();
                listaAdiciones.clear();
                listaBorrar.clear();
            }
        }
        advertencia = "";
        cargarListas();
        // ver operadores
        //this.jTAVerStrips.append(listaOperadores.get(pos).toString());
    }//GEN-LAST:event_jLstOperadoresMouseClicked

    private void jLstEstMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstEstMAMouseClicked
        // TODO add your handling code here:
        int pos = jLstEstMA.getSelectedIndex();
        if (pos > -1){
            elijioMA = true;
            jTDefMA.setText(listaEstados.get(pos).toString());
        }
    }//GEN-LAST:event_jLstEstMAMouseClicked

    private void jLstEstMFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstEstMFMouseClicked
        // TODO add your handling code here:
        int pos = jLstEstMF.getSelectedIndex();
        if (pos > -1){
            elijioMF = true;
            jTDefMF.setText(listaEstados.get(pos).toString());
        }
    }//GEN-LAST:event_jLstEstMFMouseClicked

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        // TODO add your handling code here:
        //AI_PLANNING.mostrar();
        
        Proceso.adminPreceso();
        
        this.jTAProceso.setText("");
        this.jTAResultado.setText("");
        //if (termino){
        this.jTAProceso.append(Soporte.verProceso());
        this.jTAResultado.append(Soporte.verResultado());
        //}
        
    }//GEN-LAST:event_jBCalcularActionPerformed

    private void jMGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMGuardarMouseClicked
        javax.swing.JFileChooser guardarDialogo = new javax.swing.JFileChooser();
        int archivo = guardarDialogo.showSaveDialog(this);
        Soporte.guardarArchivo(listaMundoActualCargar, listaMundoFinalCargar, archivo, guardarDialogo);
    }//GEN-LAST:event_jMGuardarMouseClicked

    private void jMAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMAbrirMouseClicked
        limpiarListas();
        javax.swing.JFileChooser abrirDialg = new javax.swing.JFileChooser();
        int archivo = abrirDialg.showOpenDialog(this);
        Soporte.abrirArchivo(abrirDialg, archivo);
        cargarListas();
    }//GEN-LAST:event_jMAbrirMouseClicked

    /**
     * ************************************************************************
     * CODIGO DE APOYO
     * ************************************************************************
     */
    
    //Permite escribir las advertencias del programa.    
    private void escribeAdvertencia(String advertencia){
        this.jTAAdvertencias.setText(advertencia);
    }
    
    //para usar la ventana secundaria
    public Boolean cargarOperador(){
        int pos = jLstOperadores.getSelectedIndex();
        if (pos>=0){
            identOperador = listaOperadores.getElementAt(pos).toString();
            return true;
        }else{
            escribeAdvertencia("Debe crear o seleccionar el operador al que se le cargara la lista de " + identLista);
            return false;
        }
        
    } 
    
    //Cargar lista de modelos 
    public void cargarListas(){
        this.jLstEstados.setModel(listaEstados);
        this.jLstOperadores.setModel(listaOperadores);
        this.jLstBorrados.setModel(listaBorrar);
        this.jLstAdiciones.setModel(listaAdiciones);
        this.jLstPrecondiciones.setModel(listaPrecondiciones);
        this.jLstMA.setModel(listaMundoActual);
        this.jLstMF.setModel(listaMundoFinal);
        this.jLVerMA.setModel(listaMundoActual);
        this.jLVerMF.setModel(listaMundoFinal);
        this.jLstEstMA.setModel(listaEstados);
        this.jLstEstMF.setModel(listaEstados);
        this.jTAAdvertencias.append(advertencia);
        this.jTAVerStrips.setText(Soporte.organizarStrips());
        
    }
    
    //limpiar listas
    public void limpiarListas(){
        listaEstados.removeAllElements();
        listaOperadores.removeAllElements();
        listaPrecondiciones.removeAllElements();
        listaAdiciones.removeAllElements();
        listaBorrar.removeAllElements();
        listaMundoActual.removeAllElements();
        listaMundoFinal.removeAllElements();
        listaEstadosCargar.clear();
        listaMundoActualCargar.clear();
        listaMundoFinalCargar.clear();
        identLista=null;
        identOperador=null;
        elijioMA = false;
        elijioMF = false;
        advertencia = "";
        this.jTAProceso.setText("");
        this.jTAResultado.setText("");
        cargarListas();
        AI_PLANNING.iniciarVecStrips();
        Estados.estados.clear();
        MundoActual.mundoActual.clear();
        MundoFinal.mundoFinal.clear();
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IA_PLANNING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IA_PLANNING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IA_PLANNING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IA_PLANNING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IA_PLANNING().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarEstado;
    private javax.swing.JButton jBAgregarMA;
    private javax.swing.JButton jBAgregarMF;
    private javax.swing.JButton jBAgregarOperador;
    private javax.swing.JButton jBBorrarEstado;
    private javax.swing.JButton jBBorrarMA;
    private javax.swing.JButton jBBorrarMF;
    private javax.swing.JButton jBBorrarOperador;
    private javax.swing.JButton jBCalcular;
    private javax.swing.JButton jBEditarAdiciones;
    private javax.swing.JButton jBEditarBorrados;
    private javax.swing.JButton jBEditarPrecondicion;
    private javax.swing.JButton jBEliminarEstado;
    private javax.swing.JButton jBEliminarMA;
    private javax.swing.JButton jBEliminarMF;
    private javax.swing.JButton jBEliminarOperador;
    private javax.swing.JButton jBGuardarAccion;
    private javax.swing.JButton jBGuardarEstado;
    private javax.swing.JButton jBGuardarMA;
    private javax.swing.JButton jBGuardarMF;
    private javax.swing.JLabel jLAdiciones;
    private javax.swing.JLabel jLBorrados;
    private javax.swing.JLabel jLPrecondicion;
    private javax.swing.JLabel jLPresentacion;
    private javax.swing.JList jLVerMA;
    private javax.swing.JList jLVerMF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jLstAdiciones;
    private javax.swing.JList jLstBorrados;
    private javax.swing.JList jLstEstMA;
    private javax.swing.JList jLstEstMF;
    private javax.swing.JList jLstEstados;
    private javax.swing.JList jLstMA;
    private javax.swing.JList jLstMF;
    private javax.swing.JList jLstOperadores;
    private javax.swing.JList jLstPrecondiciones;
    private javax.swing.JMenu jMAbrir;
    private javax.swing.JMenu jMGuardar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPCreditos;
    private javax.swing.JPanel jPDefEstados;
    private javax.swing.JPanel jPDefMundoActual;
    private javax.swing.JPanel jPDefMundoFinal;
    private javax.swing.JPanel jPDefOperador;
    private javax.swing.JPanel jPIngresoDatos;
    private javax.swing.JPanel jPPresentacion;
    private javax.swing.JPanel jPProcesoPlanning;
    private javax.swing.JPanel jPVerAcciones;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTAAdvertencias;
    private javax.swing.JTextArea jTAProceso;
    private javax.swing.JTextArea jTAResultado;
    private javax.swing.JTextArea jTAVerStrips;
    private javax.swing.JTextField jTDefEstados;
    private javax.swing.JTextField jTDefMA;
    private javax.swing.JTextField jTDefMF;
    private javax.swing.JTextField jTDefOperador;
    private javax.swing.JTabbedPane jTInsertVar;
    private javax.swing.JTabbedPane jTPPrincipal;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
