package proyectosimulacion;

import java.awt.Color;
import javax.swing.border.LineBorder;

/**
 *
 * @author prome
 */
public class ventanaMenuPrincipal extends javax.swing.JFrame {

    Color cn = new Color(123,211,134);//verde claro
    Color cn1 = new Color(76,43,11);//cafe
    Color cn2 = new Color(95,163,142);//verde mas oscuro
    
    public ventanaMenuPrincipal() {
        initComponents();
        modificacionBotones();
       this.setLocationRelativeTo(null);
    }

    public void modificacionBotones(){
    btnDocumentacion.setBorder(new LineBorder(Color.BLACK,2,true));
    btnSimulacion.setBorder(new LineBorder(Color.BLACK,2,true));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFondo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnDocumentacion = new javax.swing.JButton();
        btnSimulacion = new javax.swing.JButton();
        pImagen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFondo.setBackground(new java.awt.Color(76, 43, 11));

        jLabel2.setFont(new java.awt.Font("Noto Sans Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DEFORESTACIÓN DE LOS BOSQUES TEMPLADOS ");

        btnDocumentacion.setBackground(new java.awt.Color(95, 163, 142));
        btnDocumentacion.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnDocumentacion.setText("DOCUMENTACIÓN");
        btnDocumentacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDocumentacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDocumentacionMouseExited(evt);
            }
        });
        btnDocumentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentacionActionPerformed(evt);
            }
        });

        btnSimulacion.setBackground(new java.awt.Color(123, 211, 134));
        btnSimulacion.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnSimulacion.setText("SIMULACIÓN");
        btnSimulacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSimulacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSimulacionMouseExited(evt);
            }
        });
        btnSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulacionActionPerformed(evt);
            }
        });

        pImagen.setBackground(new java.awt.Color(76, 43, 11));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deforestation_5051014.png"))); // NOI18N

        javax.swing.GroupLayout pImagenLayout = new javax.swing.GroupLayout(pImagen);
        pImagen.setLayout(pImagenLayout);
        pImagenLayout.setHorizontalGroup(
            pImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pImagenLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pImagenLayout.setVerticalGroup(
            pImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addComponent(btnSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnDocumentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addComponent(pImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFondoLayout.createSequentialGroup()
                                .addComponent(btnDocumentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(331, 331, 331))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFondoLayout.createSequentialGroup()
                                .addComponent(btnSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(324, 324, 324))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulacionActionPerformed
        simulacionEstadisticasPorBosque nuevaVentana = new simulacionEstadisticasPorBosque();
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSimulacionActionPerformed

    private void btnSimulacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimulacionMouseEntered
        pFondo.setBackground(cn);
        pImagen.setBackground(cn);
        btnDocumentacion.setBackground(cn);
        btnDocumentacion.setBorder(new LineBorder(cn,2,true));
        btnDocumentacion.setText("");
    }//GEN-LAST:event_btnSimulacionMouseEntered

    private void btnDocumentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentacionActionPerformed
        documentacion1Objetivos nuevaVentana = new documentacion1Objetivos();
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDocumentacionActionPerformed

    private void btnSimulacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimulacionMouseExited
        pFondo.setBackground(cn1);
        pImagen.setBackground(cn1);
        btnDocumentacion.setBackground(cn2);
        btnDocumentacion.setBorder(new LineBorder(Color.BLACK,2,true));
        btnDocumentacion.setText("DOCUMENTACIÓN");
    }//GEN-LAST:event_btnSimulacionMouseExited

    private void btnDocumentacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDocumentacionMouseEntered
        pFondo.setBackground(cn2);
        pImagen.setBackground(cn2);
        btnSimulacion.setBackground(cn2);
        btnSimulacion.setBorder(new LineBorder(cn2,2,true));
        btnSimulacion.setText("");
    }//GEN-LAST:event_btnDocumentacionMouseEntered

    private void btnDocumentacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDocumentacionMouseExited
        pFondo.setBackground(cn1);
        pImagen.setBackground(cn1);
        btnSimulacion.setBackground(cn);
        btnSimulacion.setBorder(new LineBorder(Color.BLACK,2,true));
        btnSimulacion.setText("SIMULACIÓN");
    }//GEN-LAST:event_btnDocumentacionMouseExited

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocumentacion;
    private javax.swing.JButton btnSimulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pFondo;
    private javax.swing.JPanel pImagen;
    // End of variables declaration//GEN-END:variables
}
