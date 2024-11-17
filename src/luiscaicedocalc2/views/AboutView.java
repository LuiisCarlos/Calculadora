package luiscaicedocalc2.views;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author Luis Carlos Caicedo Giraldo
 */
public class AboutView extends javax.swing.JDialog {

    private final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    
    /**
     * Creates new form AboutView
     */
    public AboutView(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        initView();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPane = new javax.swing.JPanel();
        logoImage = new javax.swing.JLabel();
        authorSubtitleLbl = new javax.swing.JLabel();
        CalculatorTitleLbl = new javax.swing.JLabel();
        appInfoLbl = new javax.swing.JPanel();
        versionLbl = new javax.swing.JLabel();
        osLbl = new javax.swing.JLabel();
        javaLbl = new javax.swing.JLabel();
        authorLbl = new javax.swing.JLabel();
        runtimeLbl = new javax.swing.JLabel();
        currentDirLbl = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca de");
        setResizable(false);

        mainPane.setBackground(new java.awt.Color(255, 255, 255));
        mainPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/calc_logo.png"))); // NOI18N
        mainPane.add(logoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 100));

        authorSubtitleLbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        authorSubtitleLbl.setText("by Luis Carlos");
        mainPane.add(authorSubtitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        CalculatorTitleLbl.setFont(new java.awt.Font("Reem Kufi", 1, 24)); // NOI18N
        CalculatorTitleLbl.setText("CALCULADORA");
        mainPane.add(CalculatorTitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 190, 30));

        appInfoLbl.setBackground(new java.awt.Color(255, 255, 255));
        appInfoLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        versionLbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        versionLbl.setText("Versión: Calculadora 2.0.0");

        osLbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javaLbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        authorLbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        authorLbl.setText("Desarrollado por: Luis Carlos Caicedo Giraldo");

        runtimeLbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        currentDirLbl.setEditable(false);
        currentDirLbl.setColumns(20);
        currentDirLbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        currentDirLbl.setLineWrap(true);
        currentDirLbl.setRows(5);
        currentDirLbl.setBorder(null);
        currentDirLbl.setFocusable(false);

        javax.swing.GroupLayout appInfoLblLayout = new javax.swing.GroupLayout(appInfoLbl);
        appInfoLbl.setLayout(appInfoLblLayout);
        appInfoLblLayout.setHorizontalGroup(
            appInfoLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appInfoLblLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appInfoLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(appInfoLblLayout.createSequentialGroup()
                        .addGroup(appInfoLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(osLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(versionLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, appInfoLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(javaLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                .addComponent(runtimeLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(61, 61, 61))
                    .addGroup(appInfoLblLayout.createSequentialGroup()
                        .addComponent(authorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(appInfoLblLayout.createSequentialGroup()
                        .addComponent(currentDirLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        appInfoLblLayout.setVerticalGroup(
            appInfoLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appInfoLblLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(versionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(osLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(javaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(runtimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentDirLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(authorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPane.add(appInfoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 390, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initView() {
        this.setLocation(SCREEN_SIZE.width / 2 - this.getSize().width /2, SCREEN_SIZE.height / 2 - this.getSize().height /2);
        String osName = System.getProperty("os.name");
        
        String javaVersion = System.getProperty("java.version");
        String javaVMName = System.getProperty("java.vm.name");
        String javaVMVersion = System.getProperty("java.vm.version");
        
        String javaRuntimeName = System.getProperty("java.runtime.name");
        String javaRuntimeVersion = System.getProperty("java.runtime.version");
        
        String currentDir = System.getProperty("user.dir");
        
        
        this.osLbl.setText("Sistema:  " + osName);
        this.javaLbl.setText("Java:  " + javaVersion + ", " + javaVMName + " " + javaVMVersion);
        this.runtimeLbl.setText("Runtime:  " + javaRuntimeName + " " + javaRuntimeVersion);
        this.currentDirLbl.setText("Directorio actual:  " + currentDir);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CalculatorTitleLbl;
    private javax.swing.JPanel appInfoLbl;
    private javax.swing.JLabel authorLbl;
    private javax.swing.JLabel authorSubtitleLbl;
    private javax.swing.JTextArea currentDirLbl;
    private javax.swing.JLabel javaLbl;
    private javax.swing.JLabel logoImage;
    private javax.swing.JPanel mainPane;
    private javax.swing.JLabel osLbl;
    private javax.swing.JLabel runtimeLbl;
    private javax.swing.JLabel versionLbl;
    // End of variables declaration//GEN-END:variables
}
