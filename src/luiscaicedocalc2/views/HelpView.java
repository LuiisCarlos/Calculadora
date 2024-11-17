package luiscaicedocalc2.views;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author Luis Carlos Caicedo Giraldo
 */
public class HelpView extends javax.swing.JDialog {

   private final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    
    /**
     * Creates new form helpView
     */
    public HelpView(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initView();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPane = new javax.swing.JPanel();
        contentPane = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        descriptionTextarea = new javax.swing.JTextArea();
        subtitle1Lbl = new javax.swing.JLabel();
        behaviorTextarea = new javax.swing.JTextArea();
        subtitile2Lbl = new javax.swing.JLabel();
        authorLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ayuda");
        setResizable(false);

        mainPane.setBackground(new java.awt.Color(201, 233, 210));
        mainPane.setMinimumSize(new java.awt.Dimension(610, 780));
        mainPane.setPreferredSize(new java.awt.Dimension(610, 780));
        mainPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentPane.setBackground(new java.awt.Color(255, 255, 255));

        titleLbl.setFont(new java.awt.Font("Reem Kufi", 1, 36)); // NOI18N
        titleLbl.setText("CALCULADORA V2");

        descriptionTextarea.setEditable(false);
        descriptionTextarea.setColumns(20);
        descriptionTextarea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        descriptionTextarea.setLineWrap(true);
        descriptionTextarea.setRows(5);
        descriptionTextarea.setText("El programa es una aplicación con interfaz gráfica que inicia con un login simple sin contraseña, ofreciendo las opciones de cargar un historial o entrar como invitado. Al acceder, se muestra una calculadora funcional con un sistema de historial que guarda automáticamente las operaciones realizadas, permitiendo además guardar o cargar historiales existentes.");
        descriptionTextarea.setWrapStyleWord(true);
        descriptionTextarea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        descriptionTextarea.setFocusable(false);

        subtitle1Lbl.setFont(new java.awt.Font("Reem Kufi", 1, 14)); // NOI18N
        subtitle1Lbl.setText("Descripción");

        behaviorTextarea.setEditable(false);
        behaviorTextarea.setColumns(20);
        behaviorTextarea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        behaviorTextarea.setLineWrap(true);
        behaviorTextarea.setRows(5);
        behaviorTextarea.setText("La calculadora está diseñada para realizar operaciones básicas y avanzadas, con un funcionamiento intuitivo y claro:\n\nBotones de Número y Decimales\n   - Los botones del 0 al 9 permiten ingresar valores numéricos.\n   - Se puede incluir un punto decimal (.) para trabajar con números decimales.\n\nOperaciones Básicas\n   - Las operaciones de suma (+), resta (-), multiplicación (*) y división (/) requieren      dos valores.\n      1. Se introduce el primer número.\n      2. Se selecciona la operación deseada.\n      3. Se introduce el segundo número.\n      4. Al presionar el botón igual (=), se calcula y muestra el resultado.\n  - Si no se completan los pasos correctamente, el botón igual no ejecutará la operación.\n\nOperaciones Avanzadas\nEstas operaciones requieren solo un valor y se ejecutan automáticamente al presionar su botón:\n  1. Elevado al cuadrado (x²): Calcula el cuadrado del número ingresado.\n  2. Calcula la raíz cuadrada del número.\n\nPara estas operaciones:\n  - Se ingresa un único valor en pantalla.\n  - Al presionar el botón correspondiente, el resultado se muestra inmediatamente sin necesidad de usar el botón igual.\n\nEste diseño asegura que todas las funciones sean rápidas y fáciles de usar, adaptándose tanto a cálculos básicos como a necesidades más específicas.");
        behaviorTextarea.setWrapStyleWord(true);
        behaviorTextarea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        behaviorTextarea.setFocusable(false);

        subtitile2Lbl.setFont(new java.awt.Font("Reem Kufi", 1, 14)); // NOI18N
        subtitile2Lbl.setText("Funcionamiento de la Calculadora");

        authorLbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        authorLbl.setText("Luis Carlos Caicedo Giraldo");

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addComponent(authorLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(subtitile2Lbl)
                        .addComponent(behaviorTextarea, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subtitle1Lbl)
                        .addComponent(descriptionTextarea, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(subtitle1Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionTextarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subtitile2Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(behaviorTextarea, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(authorLbl)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        mainPane.add(contentPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 530, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initView() {
        this.setLocation(SCREEN_SIZE.width / 2 - this.getSize().width /2, SCREEN_SIZE.height / 2 - this.getSize().height /2);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLbl;
    private javax.swing.JTextArea behaviorTextarea;
    private javax.swing.JPanel contentPane;
    private javax.swing.JTextArea descriptionTextarea;
    private javax.swing.JPanel mainPane;
    private javax.swing.JLabel subtitile2Lbl;
    private javax.swing.JLabel subtitle1Lbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
