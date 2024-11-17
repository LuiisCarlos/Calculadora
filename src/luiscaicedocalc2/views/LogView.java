package luiscaicedocalc2.views;

import java.awt.Dimension;
import java.awt.Toolkit;
import luiscaicedocalc2.classes.Utilities;

import javax.swing.table.DefaultTableModel;

/**
 * @author Luis Carlos Caicedo Giraldo
 */
public class LogView extends javax.swing.JDialog {
    
    private final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    
    private int xMouse, yMouse;
    
    /**
     * Creates new form LogView
     */
    public LogView(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        initView();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPane = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        barPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPane.setBackground(new java.awt.Color(255, 255, 255));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table.getTableHeader().setReorderingAllowed(false);
        ScrollPane.setViewportView(Table);

        barPane.setBackground(new java.awt.Color(240, 240, 240));
        barPane.setPreferredSize(new java.awt.Dimension(459, 30));
        barPane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barPaneMouseDragged(evt);
            }
        });
        barPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barPaneMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Historial");

        javax.swing.GroupLayout barPaneLayout = new javax.swing.GroupLayout(barPane);
        barPane.setLayout(barPaneLayout);
        barPaneLayout.setHorizontalGroup(
            barPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(407, Short.MAX_VALUE))
        );
        barPaneLayout.setVerticalGroup(
            barPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addComponent(barPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                .addComponent(barPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barPaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barPaneMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_barPaneMouseDragged

    private void barPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barPaneMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_barPaneMousePressed

    private void initView() {
        this.setLocation(SCREEN_SIZE.width / 4 - this.getSize().width /2, SCREEN_SIZE.height / 2 - this.getSize().height /2);
        initTable();
    }
    
    private void initTable() {
        DefaultTableModel tableModel = new DefaultTableModel();
        String[] columns = {"x", "operador", "y", "resultado"};
        tableModel.setColumnIdentifiers(columns);
        
        this.Table.setModel(Utilities.initTable());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane ScrollPane;
    public javax.swing.JTable Table;
    private javax.swing.JPanel barPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPane;
    // End of variables declaration//GEN-END:variables
}