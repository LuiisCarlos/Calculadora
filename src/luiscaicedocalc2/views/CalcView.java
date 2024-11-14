package luiscaicedocalc2.views;

import luiscaicedocalc2.classes.Operation;
import luiscaicedocalc2.classes.Session;
import luiscaicedocalc2.classes.Utilities;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 * @author Luis Carlos
 */
public class CalcView extends javax.swing.JDialog {
    
    private final MainView parent;
    
    private List<Operation> operations = new ArrayList<>();
    private String result = null;
    private LogView history;
    private File sessionFile;
    private Session session;
    private int sessionType;
    

    /**
     * Creates new form CalculatorView
     */
    public CalcView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.parent = (MainView) parent;
        sessionType = 0;
        initApp();
    }
    
    public CalcView(java.awt.Frame parent, boolean modal, File sessionFile) {
        super(parent, modal);
        initComponents();
        
        this.parent = (MainView) parent;
        this.sessionFile = sessionFile;
        sessionType = 1;
        initApp();
    }
    
    public CalcView(java.awt.Frame parent, boolean modal, Session session) {
        super(parent, modal);
        initComponents();
        
        this.parent = (MainView) parent;
        this.session = session;
        sessionType = 1;
        initApp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        sessionUserLbl = new javax.swing.JLabel();
        sessionCreationDateLbl = new javax.swing.JLabel();
        userTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sessionUserLbl.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        sessionUserLbl.setText("Nombre: ");

        sessionCreationDateLbl.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        sessionCreationDateLbl.setText("Fecha de creación:");

        userTitle.setFont(new java.awt.Font("Reem Kufi", 1, 14)); // NOI18N
        userTitle.setText("USUARIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userTitle))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sessionUserLbl)
                            .addComponent(sessionCreationDateLbl))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(userTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sessionUserLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sessionCreationDateLbl)
                .addGap(16, 16, 16))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(java.awt.Color.orange);
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("+");
        jButton6.setToolTipText("Operador de suma");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 55, 45));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton11.setText("4");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton11MouseExited(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 55, 56));

        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton17.setText("9");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton17MouseExited(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 55, 56));

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton12.setText("5");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 55, 56));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("1");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 55, 56));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setText("AC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 55, 45));

        jButton18.setBackground(java.awt.Color.orange);
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton18.setText("÷");
        jButton18.setToolTipText("Operador de división");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton18MouseExited(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 55, 56));

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton13.setText("6");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton13MouseExited(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 55, 56));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("2");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 55, 56));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("√");
        jButton2.setToolTipText("Raíz cuadrada del número en pantalla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 55, 45));

        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton19.setText(".");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton19MouseExited(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 55, 56));

        jButton14.setBackground(java.awt.Color.orange);
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton14.setText("X");
        jButton14.setToolTipText("Operador de multiplicación");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton14MouseExited(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 55, 56));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("x² ");
        jButton3.setToolTipText("Eleva al cuadrado el número en pantalla");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 55, 45));

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton15.setText("8");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton15MouseExited(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 55, 56));

        jButton9.setBackground(java.awt.Color.orange);
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton9.setText("-");
        jButton9.setToolTipText("Operador de resta");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 55, 56));

        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton20.setText("0");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton20MouseExited(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 55, 56));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("3");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 55, 56));

        jButton21.setBackground(java.awt.Color.orange);
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton21.setText("=");
        jButton21.setToolTipText("Calcula la operación en pantalla");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton21MouseExited(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 128, 42));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("1/X");
        jButton4.setToolTipText("");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 60, 45));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("0");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 300, -1));

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton16.setText("7");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton16MouseExited(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 55, 56));

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Cargar historial");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar historial");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem8.setText("Cerrar sesión");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);
        jMenu1.add(jSeparator3);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Vista");

        jMenuItem4.setText("Mostrar historial");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMenuItem5.setText("Ayuda");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Casos de uso");
        jMenu3.add(jMenuItem6);
        jMenu3.add(jSeparator2);

        jMenuItem7.setText("Acerca de");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Custom code">  
    private void initApp() {
        this.history = new LogView(parent, false);
        setTheme();
        setSession();
    }
    
    private void setSession() {
        if (sessionType == 1) {
            if (session == null) {
                session = Utilities.getSession(sessionFile);
                initTable();
            }
            
            this.sessionUserLbl.setText("Nombre   " +  this.session.getUsername());
            this.sessionCreationDateLbl.setText("Fecha de creación   " +  Utilities.formatDateToEu(this.session.getCreationDate()));
            this.sessionCreationDateLbl.setVisible(true);
        } else {
            this.sessionUserLbl.setText("Nombre   " + "invitado");
            this.sessionCreationDateLbl.setVisible(false);
        }
    }
    
    private void updateTable() {
        DefaultTableModel currentModel = (DefaultTableModel) history.Table.getModel();
        history.Table.setModel(Utilities.updateTable(currentModel, operations));
    }
    
    private void initTable() {
        history.Table.setModel(Utilities.initTable(session.getOperations()));
    }
    
    private void confirmExit() {
        int option =  JOptionPane.showConfirmDialog(this,"Are you sure you want to leave?", "Confirm exit", JOptionPane.YES_NO_OPTION);
        parent.setVisible(true);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        }
    }
    
    private void saveSession() {
        session.setOperations(operations);
        
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fc.showSaveDialog(parent);
        if (option == JFileChooser.APPROVE_OPTION) {
            Utilities.createSessionFile(session, fc.getSelectedFile());
        }
    }
    
    private void loadSession() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt", "txt");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.addChoosableFileFilter(filter);
        int option = fileChooser.showOpenDialog(parent);
        if (option == JFileChooser.APPROVE_OPTION) {
            this.sessionFile = fileChooser.getSelectedFile();
            session = null;
            sessionType = 1;
            setSession();
        }
    }
    
    private void setTheme() {
        this.getContentPane().setBackground(Color.WHITE);
        this.jButton1.setBackground(Color.WHITE);
        this.jButton2.setBackground(Color.WHITE);
        this.jButton3.setBackground(Color.WHITE);
        this.jButton4.setBackground(Color.WHITE);
        this.jButton6.setBackground(Color.ORANGE);
        this.jButton7.setBackground(Color.WHITE);
        this.jButton8.setBackground(Color.WHITE);
        this.jButton10.setBackground(Color.WHITE);
        this.jButton11.setBackground(Color.WHITE);
        this.jButton12.setBackground(Color.WHITE);
        this.jButton13.setBackground(Color.WHITE);
        this.jButton15.setBackground(Color.WHITE);
        this.jButton16.setBackground(Color.WHITE);
        this.jButton17.setBackground(Color.WHITE);
        this.jButton19.setBackground(Color.WHITE);
        this.jButton20.setBackground(Color.WHITE);
    }
    // </editor-fold> 
    
    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        this.jButton9.setBackground(new Color(170, 74, 0));
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        this.jButton9.setBackground(Color.ORANGE);
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                aux += " - ";
                this.jLabel1.setText(aux);
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseEntered
        this.jButton20.setBackground(new Color(140, 140, 140));
    }//GEN-LAST:event_jButton20MouseEntered

    private void jButton20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseExited
        this.jButton20.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton20MouseExited

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("0");
        } else {
            aux += 0;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseEntered
        this.jButton10.setBackground(new Color(140, 140, 140));
    }//GEN-LAST:event_jButton10MouseEntered

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        this.jButton10.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() - 1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("3");
        } else {
            aux += 3;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseEntered
        // TODO add your handling code here:
        this.jButton21.setBackground(new Color(170, 74, 0));
    }//GEN-LAST:event_jButton21MouseEntered

    private void jButton21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseExited
        this.jButton21.setBackground(Color.ORANGE);
    }//GEN-LAST:event_jButton21MouseExited

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        String[] fields;
        String screen = this.jLabel1.getText();
        Operation operation = new Operation();
        

        if (screen.contains(" ")) {
            fields = screen.split(" ");
            operation.x = fields[0];
            operation.operator = fields[1];
            operation.y = fields[2];
            this.result = operation.getResult();
            if (result == null) {
                JOptionPane.showMessageDialog(null, "No es posible dividir entre 0", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                this.jLabel1.setText(result);
            }
        } else {
            operation.x = this.result;
            this.result = operation.getResult();
            if (result == null) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                this.jLabel1.setText(result);
            }
        }
        
        operations.add(operation);
        updateTable();
        System.out.println(operations);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseEntered
        this.jButton11.setBackground(new Color(140, 140, 140));
    }//GEN-LAST:event_jButton11MouseEntered

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
        this.jButton11.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton11MouseExited

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("4");
        } else {
            aux += 4;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseEntered
        this.jButton12.setBackground(new Color(140, 140, 140));
    }//GEN-LAST:event_jButton12MouseEntered

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        this.jButton12.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("5");
        } else {
            aux += 5;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.result = null;
        this.jLabel1.setText("0");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        String screen = this.jLabel1.getText();
        Operation operation;
        
        switch (evt.getKeyChar()) {
            case '1':
                if (screen.length() -  1 == 0 && screen.charAt(0) == '0') {
                    this.jLabel1.setText("1");
                } else {
                    this.jLabel1.setText(screen + "1");
                }
                break;
            case '2':
                if (screen.length() -  1 == 0 && screen.charAt(0) == '0') {
                    this.jLabel1.setText("2");
                } else {
                    this.jLabel1.setText(screen + "2");
                }
                break;
            case '3':
                if (screen.length() -  1 == 0 && screen.charAt(0) == '0') {
                    this.jLabel1.setText("3");
                } else {
                    this.jLabel1.setText(screen + "3");
                }
                break;
            case '4':
                if (screen.length() -  1 == 0 && screen.charAt(0) == '0') {
                    this.jLabel1.setText("4");
                } else {
                    this.jLabel1.setText(screen + "4");
                }
                break;
            case '5':
                if (screen.length() -  1 == 0 && screen.charAt(0) == '0') {
                    this.jLabel1.setText("5");
                } else {
                    this.jLabel1.setText(screen + "5");
                }
                break;
            case '6':
                if (screen.length() -  1 == 0 && screen.charAt(0) == '0') {
                    this.jLabel1.setText("6");
                } else {
                    this.jLabel1.setText(screen + "6");
                }
                break;
            case '7':
                if (screen.length() -  1 == 0 && screen.charAt(0) == '0') {
                    this.jLabel1.setText("7");
                } else {
                    this.jLabel1.setText(screen + "7");
                }
                break;
            case '8':
                if (screen.length() -  1 == 0 && screen.charAt(0) == '0') {
                    this.jLabel1.setText("8");
                } else {
                    this.jLabel1.setText(screen + "8");
                }
                break;
            case '9':
                if (screen.length() -  1 == 0 && screen.charAt(0) == '0') {
                    this.jLabel1.setText("9");
                } else {
                    this.jLabel1.setText(screen + "9");
                }
                break;
            case '0':
                if (screen.length() -1 == 0 && screen.charAt(0) == '0') {
                    this.jLabel1.setText("0");
                } else {
                    this.jLabel1.setText(screen += "0");
                }
                break;
            case '+':
                if (!screen.contains(" ") && screen.charAt(0) != '0') {
                    if (screen.length() > 0 && screen.charAt(screen.length() - 1) != ' ') {
                        this.jLabel1.setText(screen += " + ");
                    }
                }
                break;
            case '-':
                if (!screen.contains(" ") && screen.charAt(0) != '0') {
                    if (screen.length() > 0 && screen.charAt(screen.length() - 1) != ' ') {
                        this.jLabel1.setText(screen += " - ");
                    }
                }
                break;
            case '/':
                if (!screen.contains(" ") && screen.charAt(0) != '0') {
                    if (screen.length() > 0 && screen.charAt(screen.length() - 1) != ' ') {
                        this.jLabel1.setText(screen += " ÷ ");
                    }
                }
                break;
            case 'x':
                if (!screen.contains(" ") && screen.charAt(0) != '0') {
                    if (screen.length() > 0 && screen.charAt(screen.length() - 1) != ' ') {
                        this.jLabel1.setText(screen += " x ");
                    }
                }
                break;
            case '*':
                if (!screen.contains(" ") && screen.charAt(0) != '0') {
                    if (screen.length() > 0 && screen.charAt(screen.length() - 1) != ' ') {
                        this.jLabel1.setText(screen += " x ");
                    }
                }
                break;
            case '.':
                if (!screen.contains(".")) {
                    if (screen.length() - 1 == 0 && screen.charAt(0) == '0') {
                        this.jLabel1.setText("0.");
                    } else {
                        this.jLabel1.setText(screen += ".");
                    }
                }
                break;
            case 'p':
                operation = new Operation();
                if (!screen.contains(" ")) {
                    if (screen.length() > 0 && screen.charAt(screen.length() - 1) != ' ') {
                        operation.x = screen;
                        operation.operator = "^";
                        operation.y = null;
                        this.result = operation.getResult();
                        this.jLabel1.setText(this.result);
                    }
                }
                break;
            case 's':
                operation = new Operation();
                if (!screen.contains(" ")) {
                    if (screen.length() > 0 && screen.charAt(screen.length() - 1) != ' ') {
                        operation.x = screen;
                        operation.operator = "s";
                        operation.y = null;
                        this.result = operation.getResult();
                        this.jLabel1.setText(this.result);
                    }
                }
                break;
            }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseEntered
        this.jButton13.setBackground(new Color(140, 140, 140));
    }//GEN-LAST:event_jButton13MouseEntered

    private void jButton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseExited
        this.jButton13.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton13MouseExited

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("6");
        } else {
            aux += 6;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Operation operation = new Operation();
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                operation.x = aux;
                operation.operator = "s";
                operation.y = null;
                this.result = operation.getResult();
                this.jLabel1.setText(this.result);
            }
        }
        
        operations.add(operation);
        updateTable();
        System.out.println(operations);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseEntered
        this.jButton14.setBackground(new Color(170, 74, 0));
    }//GEN-LAST:event_jButton14MouseEntered

    private void jButton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseExited
        this.jButton14.setBackground(Color.ORANGE);
    }//GEN-LAST:event_jButton14MouseExited

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                aux += " x ";
                this.jLabel1.setText(aux);
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Operation operation = new Operation();
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                operation.x = aux;
                operation.operator = "^";
                operation.y = null;
                this.result = operation.getResult();
                this.jLabel1.setText(this.result);
            }
        }
        
        operations.add(operation);
        updateTable();
        System.out.println(operations);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseEntered
        this.jButton15.setBackground(new Color(140, 140, 140));
    }//GEN-LAST:event_jButton15MouseEntered

    private void jButton15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseExited
        this.jButton15.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton15MouseExited

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("8");
        } else {
            aux += 8;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        this.jButton4.setBackground(new Color(140, 140, 140));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        this.jButton4.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Operation operation = new Operation();
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                operation.x = aux;
                operation.operator = "/";
                operation.y = null;
                this.result = operation.getResult();
                if (this.result == null) {
                    this.jLabel1.setText("0");
                } else {
                    this.jLabel1.setText(this.result);
                }
            }
        }
        
        operations.add(operation);
        updateTable();
        System.out.println(operations);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseEntered
        this.jButton16.setBackground(new Color(140, 140, 140));
    }//GEN-LAST:event_jButton16MouseEntered

    private void jButton16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseExited
        this.jButton16.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton16MouseExited

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("7");
        } else {
            aux += 7;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        this.jButton6.setBackground(new Color(170, 74, 0));
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        this.jButton6.setBackground(Color.ORANGE);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                aux += " + ";
                this.jLabel1.setText(aux);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseEntered
        this.jButton17.setBackground(new Color(140, 140, 140));
    }//GEN-LAST:event_jButton17MouseEntered

    private void jButton17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseExited
        this.jButton17.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton17MouseExited

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("9");
        } else {
            aux += 9;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        this.jButton7.setBackground(new Color(140, 140, 140));
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        this.jButton7.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("1");
        } else {
            aux += 1;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseEntered
        this.jButton18.setBackground(new Color(170, 74, 0));
    }//GEN-LAST:event_jButton18MouseEntered

    private void jButton18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseExited
        this.jButton18.setBackground(Color.ORANGE);
    }//GEN-LAST:event_jButton18MouseExited

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                aux += " ÷ ";
                this.jLabel1.setText(aux);
            }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        this.jButton8.setBackground(new Color(140, 140, 140));
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        this.jButton8.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -  1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("2");
        } else {
            aux += 2;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseEntered
        this.jButton19.setBackground(new Color(140, 140, 140));
    }//GEN-LAST:event_jButton19MouseEntered

    private void jButton19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseExited
        this.jButton19.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton19MouseExited

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (!aux.contains(".")) {
            if (aux.length() - 1 == 0 && aux.charAt(0) == '0') {
                this.jLabel1.setText("0.");
            } else {
                aux += ".";
                this.jLabel1.setText(aux);
            }
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if (this.jMenuItem4.getText().equals("Mostrar historial")) {
            history.setVisible(true);
            this.jMenuItem4.setText("Ocultar historial");
        } else {
            history.setVisible(false);
            this.jMenuItem4.setText("Mostrar historial");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.out.println(operations);
        if (!operations.isEmpty()) {
            int option = JOptionPane.showConfirmDialog(null,
                "¿Desea guardar la sesión?", "No ha guardado la sesión actual", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.OK_OPTION) {
                saveSession();
            }
        }
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        saveSession();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.out.println(operations);
        if (!operations.isEmpty()) {
            int option = JOptionPane.showConfirmDialog(null,
                "¿Desea guardar la sesión?", "No ha guardado la sesión actual", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.OK_OPTION) {
                saveSession();
            }
        }
        loadSession();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        System.out.println(operations);
        if (!operations.isEmpty()) {
            int option = JOptionPane.showConfirmDialog(null,
                "¿Desea guardar la sesión?", "No ha guardado la sesión actual", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.OK_OPTION) {
                saveSession();
            }
        }
        dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel sessionCreationDateLbl;
    private javax.swing.JLabel sessionUserLbl;
    private javax.swing.JLabel userTitle;
    // End of variables declaration//GEN-END:variables
}
