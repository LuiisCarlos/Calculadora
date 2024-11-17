package luiscaicedocalc2.views;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author Luis Carlos Caicedo Giraldo
 */
public class UseCaseView extends javax.swing.JDialog {

    private final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    
    /**
     * Creates new form UseCaseView
     */
    public UseCaseView(java.awt.Dialog parent, boolean modal) {
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
        subtitleLbl = new javax.swing.JLabel();
        useCaseTextarea = new javax.swing.JTextArea();
        authorLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Casos de uso");
        setResizable(false);

        mainPane.setBackground(new java.awt.Color(255, 227, 227));
        mainPane.setMinimumSize(new java.awt.Dimension(610, 780));
        mainPane.setPreferredSize(new java.awt.Dimension(610, 780));
        mainPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentPane.setBackground(new java.awt.Color(255, 255, 255));

        titleLbl.setFont(new java.awt.Font("Reem Kufi", 1, 36)); // NOI18N
        titleLbl.setText("CALCULADORA V2");

        subtitleLbl.setFont(new java.awt.Font("Reem Kufi", 1, 24)); // NOI18N
        subtitleLbl.setText("Casos de uso");

        useCaseTextarea.setEditable(false);
        useCaseTextarea.setColumns(20);
        useCaseTextarea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        useCaseTextarea.setLineWrap(true);
        useCaseTextarea.setRows(5);
        useCaseTextarea.setText("Caso 1: Entrar como Invitado y Realizar Operaciones Básicas\n\n1. El usuario abre el programa y selecciona la opción \"Entrar como invitado\".\n2. Accede a la calculadora y realiza las siguientes operaciones:\n    - Introduce 45, selecciona +, introduce 30 y presiona =. Resultado: 75.\n3. El historial muestra las operaciones realizadas, pero no se guarda automáticamente.\n4. Al cerrar la sesión, el programa pregunta al usuario si desea guardar el historial realizado. El usuario puede elegir entre guardar o descartar el historial.\n\nCaso 2: Cargar un Historial Existente\n\n1. El usuario abre el programa y selecciona \"Cargar historial\".\n2. Selecciona un archivo que contiene un historial con las siguientes operaciones anteriores:\n     - 10 + 5 = 15\n3. El usuario continúa trabajando sobre el mismo historial, añadiendo una operación:\n     - Introduce 8, selecciona -, introduce 3 y presiona =. Resultado: 5.\n4. Guarda el nuevo historial con un nombre diferente.\n\nCaso 3: Operaciones Avanzadas\n\n1. El usuario ingresa 16 y presiona el botón de raíz cuadrada (√). Resultado: 4.\n2. Introduce 7 y presiona el botón de elevado al cuadrado (x²). Resultado: 49.\n3. Introduce 4 y presiona el botón de función recíproca (1/x). Resultado: 0.25.\n4. Todas las operaciones se registran automáticamente en el historial visible.\n\nCaso 4: Guardar y Recuperar el Historial\n\n1. Tras realizar varias operaciones, el usuario selecciona la opción \"Guardar historial\".\n2. Se genera un archivo que puede ser usado en futuras sesiones.\n3. Más tarde, abre el programa, selecciona \"Cargar historial\", y retoma exactamente desde donde dejó la última sesión.\n\nCaso 5: Comprobar Resultados de Operaciones\n\n1. Un estudiante utiliza la calculadora para resolver problemas matemáticos:\n      - Introduce 5.5, selecciona *, introduce 4.2 y presiona =. Resultado: 23.1.\n      - Usa el botón de elevado al cuadrado (x²) con 6. Resultado: 36.\n2. Guarda el historial como referencia para verificar sus cálculos más tarde.");
        useCaseTextarea.setWrapStyleWord(true);
        useCaseTextarea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        useCaseTextarea.setFocusable(false);

        authorLbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        authorLbl.setText("Luis Carlos Caicedo Giraldo");

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(authorLbl)
                    .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(useCaseTextarea, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(titleLbl))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addComponent(subtitleLbl))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(useCaseTextarea, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(authorLbl)
                .addContainerGap(14, Short.MAX_VALUE))
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
    private javax.swing.JPanel contentPane;
    private javax.swing.JPanel mainPane;
    private javax.swing.JLabel subtitleLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextArea useCaseTextarea;
    // End of variables declaration//GEN-END:variables
}
