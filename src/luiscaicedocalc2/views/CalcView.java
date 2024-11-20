package luiscaicedocalc2.views;

import luiscaicedocalc2.classes.*;

import java.util.ArrayList;
import java.util.List;

import java.io.File;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 * @author Luis Carlos Caicedo Giraldo
 */
public class CalcView extends javax.swing.JDialog {
    
    private final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    private final Dimension MAX_DIMENSION = new Dimension(1200, 800);
    private final MainView parent;
    
    private List<Operation> operations = new ArrayList<>();
    private String result = "";
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
        this.session = this.parent.getSession();
        initView();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        sessionUserLbl = new javax.swing.JLabel();
        sessionCreationDateLbl = new javax.swing.JLabel();
        userTitle = new javax.swing.JLabel();
        creationDateLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sumBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        oneBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        divideBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        twoButtn = new javax.swing.JButton();
        sqBtn = new javax.swing.JButton();
        dotBtn = new javax.swing.JButton();
        multiplyBtn = new javax.swing.JButton();
        powBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        substractBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        equalsBtn = new javax.swing.JButton();
        reciprocalBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sevenBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadBtn = new javax.swing.JMenuItem();
        saveBtn = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        logoutBtn = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        exitBtn = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        showLogsBtn = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        helpBtn = new javax.swing.JMenuItem();
        useCaseBtn = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        aboutBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora");
        setMinimumSize(new java.awt.Dimension(400, 680));

        jPanel2.setBackground(new java.awt.Color(120, 157, 188));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setMinimumSize(new java.awt.Dimension(280, 104));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sessionUserLbl.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        sessionUserLbl.setForeground(new java.awt.Color(255, 255, 255));
        sessionUserLbl.setText("Nombre: ");
        jPanel2.add(sessionUserLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        sessionCreationDateLbl.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        sessionCreationDateLbl.setForeground(new java.awt.Color(255, 255, 255));
        sessionCreationDateLbl.setText("Fecha de creación:");
        jPanel2.add(sessionCreationDateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        userTitle.setFont(new java.awt.Font("Reem Kufi", 1, 14)); // NOI18N
        userTitle.setForeground(new java.awt.Color(255, 255, 255));
        userTitle.setText("USUARIO");
        jPanel2.add(userTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 8, -1, -1));

        creationDateLbl.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        creationDateLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(creationDateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 110, 16));

        usernameLbl.setBackground(new java.awt.Color(255, 255, 255));
        usernameLbl.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        usernameLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(usernameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 150, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sumBtn.setBackground(new java.awt.Color(120, 157, 188));
        sumBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sumBtn.setText("+");
        sumBtn.setToolTipText("Operador de suma");
        sumBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sumBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sumBtnMouseExited(evt);
            }
        });
        sumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumBtnActionPerformed(evt);
            }
        });
        jPanel3.add(sumBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 55, 45));

        fourBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fourBtn.setText("4");
        fourBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fourBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fourBtnMouseExited(evt);
            }
        });
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });
        jPanel3.add(fourBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 55, 56));

        nineBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nineBtn.setText("9");
        nineBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nineBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nineBtnMouseExited(evt);
            }
        });
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });
        jPanel3.add(nineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 55, 56));

        fiveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fiveBtn.setText("5");
        fiveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fiveBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fiveBtnMouseExited(evt);
            }
        });
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });
        jPanel3.add(fiveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 55, 56));

        oneBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        oneBtn.setText("1");
        oneBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oneBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                oneBtnMouseExited(evt);
            }
        });
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });
        jPanel3.add(oneBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 55, 56));

        clearBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        clearBtn.setText("C");
        clearBtn.setToolTipText("Limpia la pantalla");
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearBtnMouseExited(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        clearBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clearBtnKeyPressed(evt);
            }
        });
        jPanel3.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 55, 45));

        divideBtn.setBackground(new java.awt.Color(120, 157, 188));
        divideBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        divideBtn.setText("÷");
        divideBtn.setToolTipText("Operador de división");
        divideBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                divideBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                divideBtnMouseExited(evt);
            }
        });
        divideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideBtnActionPerformed(evt);
            }
        });
        jPanel3.add(divideBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 55, 56));

        sixBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sixBtn.setText("6");
        sixBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sixBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sixBtnMouseExited(evt);
            }
        });
        sixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtnActionPerformed(evt);
            }
        });
        jPanel3.add(sixBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 55, 56));

        twoButtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        twoButtn.setText("2");
        twoButtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                twoButtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                twoButtnMouseExited(evt);
            }
        });
        twoButtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtnActionPerformed(evt);
            }
        });
        jPanel3.add(twoButtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 55, 56));

        sqBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sqBtn.setText("√");
        sqBtn.setToolTipText("Raíz cuadrada del número en pantalla");
        sqBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sqBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sqBtnMouseExited(evt);
            }
        });
        sqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqBtnActionPerformed(evt);
            }
        });
        jPanel3.add(sqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 55, 45));

        dotBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dotBtn.setText(".");
        dotBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dotBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dotBtnMouseExited(evt);
            }
        });
        dotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotBtnActionPerformed(evt);
            }
        });
        jPanel3.add(dotBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 55, 56));

        multiplyBtn.setBackground(new java.awt.Color(120, 157, 188));
        multiplyBtn.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        multiplyBtn.setText("X");
        multiplyBtn.setToolTipText("Operador de multiplicación");
        multiplyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                multiplyBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                multiplyBtnMouseExited(evt);
            }
        });
        multiplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyBtnActionPerformed(evt);
            }
        });
        jPanel3.add(multiplyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 55, 56));

        powBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        powBtn.setText("x² ");
        powBtn.setToolTipText("Eleva al cuadrado el número en pantalla");
        powBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                powBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                powBtnMouseExited(evt);
            }
        });
        powBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powBtnActionPerformed(evt);
            }
        });
        jPanel3.add(powBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 55, 45));

        eightBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eightBtn.setText("8");
        eightBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eightBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eightBtnMouseExited(evt);
            }
        });
        eightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtnActionPerformed(evt);
            }
        });
        jPanel3.add(eightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 55, 56));

        substractBtn.setBackground(new java.awt.Color(120, 157, 188));
        substractBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        substractBtn.setText("-");
        substractBtn.setToolTipText("Operador de resta");
        substractBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                substractBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                substractBtnMouseExited(evt);
            }
        });
        substractBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractBtnActionPerformed(evt);
            }
        });
        jPanel3.add(substractBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 55, 56));

        zeroBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        zeroBtn.setText("0");
        zeroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                zeroBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                zeroBtnMouseExited(evt);
            }
        });
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });
        jPanel3.add(zeroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 55, 56));

        threeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        threeBtn.setText("3");
        threeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                threeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                threeBtnMouseExited(evt);
            }
        });
        threeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtnActionPerformed(evt);
            }
        });
        jPanel3.add(threeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 55, 56));

        equalsBtn.setBackground(new java.awt.Color(120, 157, 188));
        equalsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equalsBtn.setText("=");
        equalsBtn.setToolTipText("Calcula la operación en pantalla");
        equalsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                equalsBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                equalsBtnMouseExited(evt);
            }
        });
        equalsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsBtnActionPerformed(evt);
            }
        });
        jPanel3.add(equalsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 128, 42));

        reciprocalBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reciprocalBtn.setText("1/X");
        reciprocalBtn.setToolTipText("");
        reciprocalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reciprocalBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reciprocalBtnMouseExited(evt);
            }
        });
        reciprocalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciprocalBtnActionPerformed(evt);
            }
        });
        jPanel3.add(reciprocalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 60, 45));

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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 90));

        sevenBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sevenBtn.setText("7");
        sevenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sevenBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sevenBtnMouseExited(evt);
            }
        });
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });
        jPanel3.add(sevenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 55, 56));

        jMenu1.setText("Archivo");

        loadBtn.setText("Cargar historial");
        loadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnActionPerformed(evt);
            }
        });
        jMenu1.add(loadBtn);

        saveBtn.setText("Guardar historial");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jMenu1.add(saveBtn);
        jMenu1.add(jSeparator1);

        logoutBtn.setText("Cerrar sesión");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jMenu1.add(logoutBtn);
        jMenu1.add(jSeparator3);

        exitBtn.setText("Salir");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jMenu1.add(exitBtn);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Vista");

        showLogsBtn.setText("Mostrar historial");
        showLogsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showLogsBtnActionPerformed(evt);
            }
        });
        jMenu2.add(showLogsBtn);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        helpBtn.setText("Ayuda");
        helpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtnActionPerformed(evt);
            }
        });
        jMenu3.add(helpBtn);

        useCaseBtn.setText("Casos de uso");
        useCaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useCaseBtnActionPerformed(evt);
            }
        });
        jMenu3.add(useCaseBtn);
        jMenu3.add(jSeparator2);

        aboutBtn.setText("Acerca de");
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });
        jMenu3.add(aboutBtn);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Custom code">  
    private void initView() {
        this.setLocation(SCREEN_SIZE.width / 2 - this.getSize().width /2, SCREEN_SIZE.height / 2 - this.getSize().height /2);
        this.history = new LogView(this, false);
        setTheme();
        setSession();
        customizeWindowBehavior();
    }
    
    private void setSession() {
        if (this.session.getType().equals(1)) {
            this.usernameLbl.setText(this.session.getUsername());
            this.creationDateLbl.setText(Utilities.formatDateToEu(this.session.getCreationDate()));
            this.sessionCreationDateLbl.setVisible(true);
            this.creationDateLbl.setVisible(true);
            this.showLogsBtn.setEnabled(true);
            this.saveBtn.setEnabled(true);
            this.logoutBtn.setText("Cerrar sesión");
            initTable();
        } else {
            this.usernameLbl.setText("Invitado");
            this.creationDateLbl.setVisible(false);
            this.showLogsBtn.setEnabled(false);
            this.sessionCreationDateLbl.setVisible(false);
            this.logoutBtn.setText("Atras");
            
        }
    }

    private void updateTable() {
        DefaultTableModel currentModel = (DefaultTableModel) history.Table.getModel();
        history.Table.setModel(Utilities.updateTable(currentModel, operations));
    }
    
    private void initTable() {
        if (session.getOperations() == null) {
            history.Table.setModel(Utilities.initTable());
        } else {
            history.Table.setModel(Utilities.initTable(session.getOperations()));
        }
    }
    
    private void confirmExit() {
        if (!operations.isEmpty()) {
            int option = JOptionPane.showConfirmDialog(null,
                "¿Desea guardar la sesión?", "No ha guardado la sesión actual", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.OK_OPTION) saveSession(); 
        }
        closeLogView();
    }

    private void customizeWindowBehavior() {
        addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmExit();
            }
        });
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {

                Dimension currentSize = getSize();
                int width = Math.min(currentSize.width, MAX_DIMENSION.width);
                int height = Math.min(currentSize.height, MAX_DIMENSION.height);
                setSize(width, height);
            }
        });
    }
    
    private void closeLogView() {
        history.setVisible(false);
        this.showLogsBtn.setText("Mostrar historial");
    }
    
    private void saveSession() {
        if (this.session.getType().equals(1)) {
            if (!operations.isEmpty()) {
                session.setOperations(operations);
            }  
        }
            
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Guardar una sesión");
        if (this.session.getType().equals(1)) {
            fc.setSelectedFile( new File(session.getUsername() + "-" + Utilities.formatDateToEu(session.getCreationDate()) + ".txt")  );
        }  else {
            String input = JOptionPane.showInputDialog(null, "Introduce el nombre de la sesion", "Guardar una sesión", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                this.session = new Session(input, java.time.LocalDate.now(),1, operations);
                setSession();
                fc.setSelectedFile( new File(this.session.getUsername() + "-" + this.session.getCreationDate().toString() + ".txt") );
            } else{
               return; 
            }     
        }
        
        int option = fc.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            Utilities.createSessionFile(session, fc.getSelectedFile());
        } 
    }
    
    private void loadSession() {
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt", "txt");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.addChoosableFileFilter(filter);
        fc.setDialogTitle("Cargar una sesión");
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                this.session = Utilities.getSession(fc.getSelectedFile());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                   "El formato del archivo no es válido", "!Atención", JOptionPane.ERROR_MESSAGE);
                return;
            }
            setSession();
            initTable();
        }
    }
    
    private void setTheme() {
        this.getContentPane().setBackground(Color.WHITE);
        this.clearBtn.setBackground(Color.WHITE);
        this.sqBtn.setBackground(Color.WHITE);
        this.powBtn.setBackground(Color.WHITE);
        this.reciprocalBtn.setBackground(Color.WHITE);
        this.dotBtn.setBackground(Color.WHITE);
        
        this.zeroBtn.setBackground(Color.WHITE);
        this.oneBtn.setBackground(Color.WHITE);
        this.twoButtn.setBackground(Color.WHITE);
        this.threeBtn.setBackground(Color.WHITE);
        this.fourBtn.setBackground(Color.WHITE);
        this.fiveBtn.setBackground(Color.WHITE);
        this.sixBtn.setBackground(Color.WHITE);
        this.sevenBtn.setBackground(Color.WHITE);
        this.eightBtn.setBackground(Color.WHITE);
        this.nineBtn.setBackground(Color.WHITE);
               
        this.sumBtn.setBackground(new Color(120, 157, 188));
        this.substractBtn.setBackground(new Color(120, 157, 188));
        this.divideBtn.setBackground(new Color(120, 157, 188));
        this.multiplyBtn.setBackground(new Color(120, 157, 188));
        this.equalsBtn.setBackground(new Color(120, 157, 188));
    }
    // </editor-fold> 
    
    private void substractBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_substractBtnMouseEntered
        this.substractBtn.setBackground(this.substractBtn.getBackground().darker());
    }//GEN-LAST:event_substractBtnMouseEntered

    private void substractBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_substractBtnMouseExited
        this.substractBtn.setBackground(new Color(120, 157, 188));
    }//GEN-LAST:event_substractBtnMouseExited

    private void substractBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substractBtnActionPerformed
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                aux += " - ";
                this.jLabel1.setText(aux);
            }
        }
    }//GEN-LAST:event_substractBtnActionPerformed

    private void zeroBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroBtnMouseEntered
        this.zeroBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_zeroBtnMouseEntered

    private void zeroBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroBtnMouseExited
        this.zeroBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_zeroBtnMouseExited

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("0");
        } else {
            aux += 0;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void threeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeBtnMouseEntered
        this.threeBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_threeBtnMouseEntered

    private void threeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeBtnMouseExited
        this.threeBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_threeBtnMouseExited

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() - 1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("3");
        } else {
            aux += 3;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_threeBtnActionPerformed

    private void equalsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalsBtnMouseEntered
        this.equalsBtn.setBackground(this.equalsBtn.getBackground().darker());
    }//GEN-LAST:event_equalsBtnMouseEntered

    private void equalsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalsBtnMouseExited
        this.equalsBtn.setBackground(new Color(120, 157, 188));
    }//GEN-LAST:event_equalsBtnMouseExited

    private void equalsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsBtnActionPerformed
        String screen = this.jLabel1.getText();
        Operation operation;
        String[] fields;

        if (screen.contains(" ") && (screen.contains("+") ||
                screen.contains("-") || screen.contains("÷") || screen.contains("x")
                )) {
            fields = screen.split(" ");
            
            if (fields.length == 3) {
                operation = new Operation(fields[0], fields[1], fields[2]);
                this.result = operation.getResult();
            
                if (this.result == null) {
                    JOptionPane.showMessageDialog(null, "No es posible dividir entre 0", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    this.jLabel1.setText(result);
                }
            } else {
                return;
            }
            
            operations.add(operation);
            updateTable();
        }   
    }//GEN-LAST:event_equalsBtnActionPerformed

    private void fourBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourBtnMouseEntered
        this.fourBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_fourBtnMouseEntered

    private void fourBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourBtnMouseExited
        this.fourBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_fourBtnMouseExited

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("4");
        } else {
            aux += 4;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_fourBtnActionPerformed

    private void fiveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveBtnMouseEntered
        this.fiveBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_fiveBtnMouseEntered

    private void fiveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveBtnMouseExited
        this.fiveBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_fiveBtnMouseExited

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("5");
        } else {
            aux += 5;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        this.result = null;
        this.jLabel1.setText("0");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void clearBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clearBtnKeyPressed
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
                        operation.setX(screen);
                        operation.setY(null);
                        operation.setOperator("^");
                        this.result = operation.getResult();
                        this.jLabel1.setText(this.result);
                    }
                }
                break;
            case 's':
                operation = new Operation();
                if (!screen.contains(" ")) {
                    if (screen.length() > 0 && screen.charAt(screen.length() - 1) != ' ') {
                        operation.setX(screen);
                        operation.setY(null);
                        operation.setOperator("s");
                        this.result = operation.getResult();
                        this.jLabel1.setText(this.result);
                    }
                }
                break;
            }
    }//GEN-LAST:event_clearBtnKeyPressed

    private void sixBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixBtnMouseEntered
        this.sixBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_sixBtnMouseEntered

    private void sixBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixBtnMouseExited
        this.sixBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_sixBtnMouseExited

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("6");
        } else {
            aux += 6;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_sixBtnActionPerformed

    private void sqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqBtnActionPerformed
        Operation operation = new Operation();
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                operation.setX(aux);
                operation.setOperator("s");
                operation.setY(null);
                this.result = operation.getResult();
                this.jLabel1.setText(this.result);
            }
        }
        
        operations.add(operation);
        updateTable();
    }//GEN-LAST:event_sqBtnActionPerformed

    private void multiplyBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyBtnMouseEntered
        this.multiplyBtn.setBackground(this.multiplyBtn.getBackground().darker());
    }//GEN-LAST:event_multiplyBtnMouseEntered

    private void multiplyBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyBtnMouseExited
        this.multiplyBtn.setBackground(new Color(120, 157, 188));
    }//GEN-LAST:event_multiplyBtnMouseExited

    private void multiplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyBtnActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                aux += " x ";
                this.jLabel1.setText(aux);
            }
        }
    }//GEN-LAST:event_multiplyBtnActionPerformed

    private void powBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powBtnActionPerformed
        Operation operation = new Operation();
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                operation.setX(aux);
                operation.setOperator("^");
                operation.setY(null);
                this.result = operation.getResult();
                this.jLabel1.setText(this.result);
            }
        }
        
        operations.add(operation);
        updateTable();
    }//GEN-LAST:event_powBtnActionPerformed

    private void eightBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightBtnMouseEntered
        this.eightBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_eightBtnMouseEntered

    private void eightBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightBtnMouseExited
        this.eightBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_eightBtnMouseExited

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("8");
        } else {
            aux += 8;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_eightBtnActionPerformed

    private void reciprocalBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reciprocalBtnMouseEntered
        this.reciprocalBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_reciprocalBtnMouseEntered

    private void reciprocalBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reciprocalBtnMouseExited
        this.reciprocalBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_reciprocalBtnMouseExited

    private void reciprocalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciprocalBtnActionPerformed
        Operation operation = new Operation();
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                operation.setX(aux);
                operation.setOperator("/");
                operation.setY(null);
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
    }//GEN-LAST:event_reciprocalBtnActionPerformed

    private void sevenBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenBtnMouseEntered
        this.sevenBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_sevenBtnMouseEntered

    private void sevenBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenBtnMouseExited
        this.sevenBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_sevenBtnMouseExited

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("7");
        } else {
            aux += 7;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_sevenBtnActionPerformed

    private void sumBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumBtnMouseEntered
        this.sumBtn.setBackground(this.sumBtn.getBackground().darker());
    }//GEN-LAST:event_sumBtnMouseEntered

    private void sumBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumBtnMouseExited
        this.sumBtn.setBackground(new Color(120, 157, 188));
    }//GEN-LAST:event_sumBtnMouseExited

    private void sumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumBtnActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                aux += " + ";
                this.jLabel1.setText(aux);
            }
        }
    }//GEN-LAST:event_sumBtnActionPerformed

    private void nineBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineBtnMouseEntered
        this.nineBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_nineBtnMouseEntered

    private void nineBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineBtnMouseExited
        this.nineBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_nineBtnMouseExited

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("9");
        } else {
            aux += 9;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_nineBtnActionPerformed

    private void oneBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneBtnMouseEntered
        this.oneBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_oneBtnMouseEntered

    private void oneBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneBtnMouseExited
        this.oneBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_oneBtnMouseExited

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("1");
        } else {
            aux += 1;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_oneBtnActionPerformed

    private void divideBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideBtnMouseEntered
        this.divideBtn.setBackground(this.divideBtn.getBackground().darker());
    }//GEN-LAST:event_divideBtnMouseEntered

    private void divideBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideBtnMouseExited
        this.divideBtn.setBackground(new Color(120, 157, 188));
    }//GEN-LAST:event_divideBtnMouseExited

    private void divideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideBtnActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (!aux.contains(" ")) {
            if (aux.length() > 0 && aux.charAt(aux.length() - 1) != ' ') {
                aux += " ÷ ";
                this.jLabel1.setText(aux);
            }
        }
    }//GEN-LAST:event_divideBtnActionPerformed

    private void twoButtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoButtnMouseEntered
        this.twoButtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_twoButtnMouseEntered

    private void twoButtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoButtnMouseExited
        this.twoButtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_twoButtnMouseExited

    private void twoButtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtnActionPerformed
        // TODO add your handling code here:
        String aux = this.jLabel1.getText();
        if (aux.length() -  1 == 0 && aux.charAt(0) == '0') {
            this.jLabel1.setText("2");
        } else {
            aux += 2;
            this.jLabel1.setText(aux);
        }
    }//GEN-LAST:event_twoButtnActionPerformed

    private void dotBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotBtnMouseEntered
        this.dotBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_dotBtnMouseEntered

    private void dotBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotBtnMouseExited
        this.dotBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_dotBtnMouseExited

    private void dotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotBtnActionPerformed
        String aux = this.jLabel1.getText();
        if (!aux.contains(".")) {
            if (aux.length() - 1 == 0 && aux.charAt(0) == '0') {
                this.jLabel1.setText("0.");
            } else {
                aux += ".";
                this.jLabel1.setText(aux);
            }
        }
    }//GEN-LAST:event_dotBtnActionPerformed

    private void showLogsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showLogsBtnActionPerformed
        if (this.showLogsBtn.getText().equals("Mostrar historial")) {
            history.setVisible(true);
            this.showLogsBtn.setText("Ocultar historial");
        } else {
            history.setVisible(false);
            this.showLogsBtn.setText("Mostrar historial");
        }
    }//GEN-LAST:event_showLogsBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        if (!operations.isEmpty()) {
            int option = JOptionPane.showConfirmDialog(null,
                "¿Desea guardar la sesión?", "No ha guardado la sesión actual", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.OK_OPTION) {
                saveSession();
            }
        }
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        saveSession();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void loadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnActionPerformed
        if (!operations.isEmpty()) {
            int option = JOptionPane.showConfirmDialog(null,
                "¿Desea guardar la sesión?", "No ha guardado la sesión actual", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.OK_OPTION) {
                this.history.dispose();
                saveSession();
            }
        }
        loadSession();
    }//GEN-LAST:event_loadBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        if (!operations.isEmpty()) {
            int option = JOptionPane.showConfirmDialog(null,
                "¿Desea guardar la sesión?", "No ha guardado la sesión actual", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.OK_OPTION) {
                this.history.dispose();
                saveSession();
            }
        }
        dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void helpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBtnActionPerformed
        new HelpView(this, true).setVisible(true);
    }//GEN-LAST:event_helpBtnActionPerformed

    private void useCaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useCaseBtnActionPerformed
        new UseCaseView(this, true).setVisible(true);
    }//GEN-LAST:event_useCaseBtnActionPerformed

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        new AboutView(this, true).setVisible(true);
    }//GEN-LAST:event_aboutBtnActionPerformed

    private void powBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powBtnMouseEntered
        this.powBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_powBtnMouseEntered

    private void powBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powBtnMouseExited
        this.powBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_powBtnMouseExited

    private void sqBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqBtnMouseEntered
        this.sqBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_sqBtnMouseEntered

    private void sqBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqBtnMouseExited
        this.sqBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_sqBtnMouseExited

    private void clearBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseEntered
        this.clearBtn.setBackground(Color.WHITE.darker());
    }//GEN-LAST:event_clearBtnMouseEntered

    private void clearBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseExited
        this.clearBtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_clearBtnMouseExited
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel creationDateLbl;
    private javax.swing.JButton divideBtn;
    private javax.swing.JButton dotBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton equalsBtn;
    private javax.swing.JMenuItem exitBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JMenuItem helpBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem loadBtn;
    private javax.swing.JMenuItem logoutBtn;
    private javax.swing.JButton multiplyBtn;
    private javax.swing.JButton nineBtn;
    private javax.swing.JButton oneBtn;
    private javax.swing.JButton powBtn;
    private javax.swing.JButton reciprocalBtn;
    private javax.swing.JMenuItem saveBtn;
    private javax.swing.JLabel sessionCreationDateLbl;
    private javax.swing.JLabel sessionUserLbl;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JMenuItem showLogsBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton sqBtn;
    private javax.swing.JButton substractBtn;
    private javax.swing.JButton sumBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoButtn;
    private javax.swing.JMenuItem useCaseBtn;
    private javax.swing.JLabel userTitle;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
