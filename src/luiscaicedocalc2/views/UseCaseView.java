package luiscaicedocalc2.views;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Luis Carlos Caicedo Giraldo
 */
public class UseCaseView extends javax.swing.JDialog {

    private final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    
    /**
     * Creates new form UseCaseView
     */
    public UseCaseView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initApp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AppTitleLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Casos de uso");

        jPanel1.setBackground(new java.awt.Color(255, 227, 227));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 780));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 780));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        AppTitleLbl.setFont(new java.awt.Font("Reem Kufi", 1, 36)); // NOI18N
        AppTitleLbl.setText("CALCULADORA V2");

        jLabel1.setFont(new java.awt.Font("Reem Kufi", 1, 24)); // NOI18N
        jLabel1.setText("Casos de uso");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Caso 1: Entrar como Invitado y Realizar Operaciones Básicas\n\n1. El usuario abre el programa y selecciona la opción \"Entrar como invitado\".\n2. Accede a la calculadora y realiza las siguientes operaciones:\n    - Introduce 45, selecciona +, introduce 30 y presiona =. Resultado: 75.\n3. El historial muestra las operaciones realizadas, pero no se guarda automáticamente.\n4. Al cerrar la sesión, el programa pregunta al usuario si desea guardar el historial realizado. El usuario puede elegir entre guardar o descartar el historial.\n\nCaso 2: Cargar un Historial Existente\n\n1. El usuario abre el programa y selecciona \"Cargar historial\".\n2. Selecciona un archivo que contiene un historial con las siguientes operaciones anteriores:\n     - 10 + 5 = 15\n3. El usuario continúa trabajando sobre el mismo historial, añadiendo una operación:\n     - Introduce 8, selecciona -, introduce 3 y presiona =. Resultado: 5.\n4. Guarda el nuevo historial con un nombre diferente.\n\nCaso 3: Operaciones Avanzadas\n\n1. El usuario ingresa 16 y presiona el botón de raíz cuadrada (√). Resultado: 4.\n2. Introduce 7 y presiona el botón de elevado al cuadrado (x²). Resultado: 49.\n3. Introduce 4 y presiona el botón de función recíproca (1/x). Resultado: 0.25.\n4. Todas las operaciones se registran automáticamente en el historial visible.\n\nCaso 4: Guardar y Recuperar el Historial\n\n1. Tras realizar varias operaciones, el usuario selecciona la opción \"Guardar historial\".\n2. Se genera un archivo que puede ser usado en futuras sesiones.\n3. Más tarde, abre el programa, selecciona \"Cargar historial\", y retoma exactamente desde donde dejó la última sesión.\n\nCaso 5: Comprobar Resultados de Operaciones\n\n1. Un estudiante utiliza la calculadora para resolver problemas matemáticos:\n      - Introduce 5.5, selecciona *, introduce 4.2 y presiona =. Resultado: 23.1.\n      - Usa el botón de elevado al cuadrado (x²) con 6. Resultado: 36.\n2. Guarda el historial como referencia para verificar sus cálculos más tarde.");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jTextArea2.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Luis Carlos Caicedo Giraldo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(AppTitleLbl))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addComponent(jLabel1))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(AppTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 530, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initApp() {
        this.setLocation(SCREEN_SIZE.width / 2 - this.getSize().width /2, SCREEN_SIZE.height / 2 - this.getSize().height /2);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppTitleLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
