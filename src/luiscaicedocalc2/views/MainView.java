package luiscaicedocalc2.views;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.io.File;
import java.time.LocalDate;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import luiscaicedocalc2.classes.Session;

/**
 * @author Luis Carlos
 */
public class MainView extends javax.swing.JFrame {
    
    private final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    
    private int xMouse, yMouse;
    

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        stablishWindowLocation();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mainPane = new javax.swing.JPanel();
        navPane = new javax.swing.JPanel();
        exitPane = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();
        usernameHolder = new javax.swing.JSeparator();
        usernameTextField = new javax.swing.JTextField();
        CalculatorTitleLbl = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();
        loginPane = new javax.swing.JPanel();
        loginBtn = new javax.swing.JLabel();
        guestBtn = new javax.swing.JLabel();
        loadHistoryBtn = new javax.swing.JLabel();
        logoImage = new javax.swing.JLabel();
        UserTitleLbl = new javax.swing.JLabel();
        authorSubtitleLbl = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPane.setBackground(new java.awt.Color(254, 249, 242));
        mainPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navPane.setBackground(new java.awt.Color(240, 240, 240));
        navPane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                navPaneMouseDragged(evt);
            }
        });
        navPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                navPaneMousePressed(evt);
            }
        });

        exitPane.setBackground(new java.awt.Color(240, 240, 240));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/close.png"))); // NOI18N
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitBtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout exitPaneLayout = new javax.swing.GroupLayout(exitPane);
        exitPane.setLayout(exitPaneLayout);
        exitPaneLayout.setHorizontalGroup(
            exitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitPaneLayout.setVerticalGroup(
            exitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout navPaneLayout = new javax.swing.GroupLayout(navPane);
        navPane.setLayout(navPaneLayout);
        navPaneLayout.setHorizontalGroup(
            navPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navPaneLayout.createSequentialGroup()
                .addGap(0, 872, Short.MAX_VALUE)
                .addComponent(exitPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navPaneLayout.setVerticalGroup(
            navPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPane.add(navPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        usernameHolder.setForeground(new java.awt.Color(0, 0, 0));
        mainPane.add(usernameHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 220, 10));

        usernameTextField.setBackground(new java.awt.Color(254, 249, 242));
        usernameTextField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(153, 153, 153));
        usernameTextField.setText("Nombre de usuario");
        usernameTextField.setBorder(null);
        usernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusLost(evt);
            }
        });
        mainPane.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 200, 40));

        CalculatorTitleLbl.setFont(new java.awt.Font("Reem Kufi", 1, 24)); // NOI18N
        CalculatorTitleLbl.setText("CALCULADORA");
        mainPane.add(CalculatorTitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 190, 30));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/background.png"))); // NOI18N
        mainPane.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 530, 520));

        loginPane.setBackground(new java.awt.Color(240, 240, 240));

        loginBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setText("Acceder");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginBtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout loginPaneLayout = new javax.swing.GroupLayout(loginPane);
        loginPane.setLayout(loginPaneLayout);
        loginPaneLayout.setHorizontalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        loginPaneLayout.setVerticalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        mainPane.add(loginPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 140, 40));

        guestBtn.setText("<html><u>Acceder como invitado</u></html>");
        guestBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guestBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestBtnMouseClicked(evt);
            }
        });
        mainPane.add(guestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 130, -1));

        loadHistoryBtn.setText("<html><u>Cargar historial</u></html>");
        loadHistoryBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loadHistoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadHistoryBtnMouseClicked(evt);
            }
        });
        mainPane.add(loadHistoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 90, -1));

        logoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/calc_logo.png"))); // NOI18N
        logoImage.setText("jLabel9");
        mainPane.add(logoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 190, 100));

        UserTitleLbl.setFont(new java.awt.Font("Reem Kufi", 1, 18)); // NOI18N
        UserTitleLbl.setText("USUARIO");
        mainPane.add(UserTitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        authorSubtitleLbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        authorSubtitleLbl.setText("by Luis Carlos");
        mainPane.add(authorSubtitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navPaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navPaneMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_navPaneMouseDragged

    private void navPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navPaneMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_navPaneMousePressed

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        this.exitPane.setBackground(new Color(240, 100, 100));
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        this.exitPane.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_exitBtnMouseExited

    private void exitBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMousePressed
        this.exitPane.setBackground(new Color(140, 40, 40));
    }//GEN-LAST:event_exitBtnMousePressed

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        this.loginPane.setBackground(new Color(200, 200, 200));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        this.loginPane.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        String username = this.usernameTextField.getText();
        
        if (!username.isEmpty() || username.equals("Nombre de usuario")) {
            LocalDate currentDate = LocalDate.now();
        
            Session session = new Session(username, currentDate);
            new CalcView(this, false, session).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha introducio un nombre de usuario.", "!Atención!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void loginBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMousePressed
        this.loginPane.setBackground(new Color(140, 140, 140));
    }//GEN-LAST:event_loginBtnMousePressed

    private void loadHistoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadHistoryBtnMouseClicked
        File sessionFile;
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt","txt");
        
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.addChoosableFileFilter(filter);
        var option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            sessionFile = fileChooser.getSelectedFile();
            new CalcView(this, false, sessionFile).setVisible(true);
        }
    }//GEN-LAST:event_loadHistoryBtnMouseClicked

    private void guestBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestBtnMouseClicked
        new CalcView(this, false).setVisible(true);
    }//GEN-LAST:event_guestBtnMouseClicked

    private void usernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusGained
        if (this.usernameTextField.getText().equals("Nombre de usuario")) {
            this.usernameTextField.setText("");
            this.usernameTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_usernameTextFieldFocusGained

    private void usernameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusLost
        if (this.usernameTextField.getText().isEmpty()) {
            this.usernameTextField.setText("Nombre de usuario");
            this.usernameTextField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_usernameTextFieldFocusLost

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    // <editor-fold defaultstate="collapsed" desc="Operational Code"> 
    private void stablishWindowLocation() {
        this.setLocation(SCREEN_SIZE.width / 2 - this.getSize().width /2, SCREEN_SIZE.height / 2 - this.getSize().height /2);
    }
    
    // </editor-fold>
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CalculatorTitleLbl;
    private javax.swing.JLabel UserTitleLbl;
    private javax.swing.JLabel authorSubtitleLbl;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JPanel exitPane;
    private javax.swing.JLabel guestBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loadHistoryBtn;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JPanel loginPane;
    private javax.swing.JLabel logoImage;
    private javax.swing.JPanel mainPane;
    private javax.swing.JPanel navPane;
    private javax.swing.JSeparator usernameHolder;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
