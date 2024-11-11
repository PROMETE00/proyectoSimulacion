package proyectosimulacion;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prome
 */
public class simulacionTablaDeDatos extends javax.swing.JFrame {
    
    Color cn1 = new Color(76,43,11);//cafe
    Color cn2 = new Color(204,204,204);//gris
    Color cn3 = new Color(118,92,166);//Morado
    Color cn4 = new Color(255,255,255);//Blanco
    Color cn5 = new Color(0,0,0);//negro
    Color cn6 = new Color(172,237,255);//azul claro
    Color cn7 = new Color(64,55,34);//cafe 2
    Color cn8 = new Color(0,168,45);//verde
    Color cn9 = new Color(203,115,91);//cafe claro
    Color cn10 = new Color(127,250,91);//verde claro
    private static final String DATA_FILE = "Datos.csv";
    private DefaultTableModel mt = new DefaultTableModel();
    
    public simulacionTablaDeDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
        pMenu.setBorder(new MatteBorder(0,0,0,4, Color.BLACK));
        pcontenido.setBackground(cn7);
        pMenu.setBackground(cn4);
        setIcon("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/deforestation_1552679.png",100,100);
        estadoInicial();
        pintarBoton(btnMain,"<html>Menú Principal</html>",cn6,cn6,cn5);
        titulo();
        Datos();
        jTable1.setRowHeight(50);
     
    }
    public void pintarBoton(JButton nombreBoton,String txt,Color c1,Color c2, Color c3){
        nombreBoton.setText(txt);
        nombreBoton.setFocusPainted(false);
        nombreBoton.setBackground(c1);
        nombreBoton.setBorder(new LineBorder(c2, 2));
        nombreBoton.setForeground(c3);
    }
    
    public void titulo (){
    lblTitulo.setText("                     TABLA DE DATOS");
    lblTitulo.setForeground(cn4);  // Cambia el color del texto
    lblTitulo.setFont(new Font("Arial", Font.PLAIN, 25)); 
    }
    public void setIcon(String ruta, int s1, int s2){
    ImageIcon originalIcon = new ImageIcon(ruta);
    Image scaledImage = originalIcon.getImage().getScaledInstance(s1,s2, Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    lbliconoTab.setIcon(scaledIcon);
    }
    public void estadoInicial(){
        pintarBoton(btnTabla,"<html>Tablas de datos</html>",cn3,cn3,cn5);
        btnTabla.setEnabled(false);
        pintarBoton(btnEstadisticas,"Estadisticas por bosque",cn4,cn4,cn5);
        pintarBoton(btnFactores,"<html>Factores de deforestación</html>",cn4,cn4,cn5);
        pintarBoton(btnRegresiones,"<html>Regresiones</html>",cn4,cn4,cn5);
        pintarBoton(btnIndices,"<html>Indices de deforestación</html>",cn4,cn4,cn5);
    }

    public void Datos() {
        String ids[]={"TIPO","FRECUENCIA","PORCENTAJE","% VALIDO","% ACULUMADO"};
        mt.setColumnIdentifiers(ids);
        jTable1.setModel(mt);
        
        cargarDatos();
    }
     public void cargarDatos() {
        try (BufferedReader br = new BufferedReader(new FileReader(DATA_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                mt.addRow(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pcontenido = new javax.swing.JPanel();
        pMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEstadisticas = new javax.swing.JButton();
        btnTabla = new javax.swing.JButton();
        btnMain = new javax.swing.JButton();
        btnFactores = new javax.swing.JButton();
        btnRegresiones = new javax.swing.JButton();
        btnIndices = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lbliconoTab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Noto Sans Mono Thin", 3, 20)); // NOI18N
        jLabel2.setText("SIMULACIÓN");

        btnEstadisticas.setText("Estadisticas por Bosque");
        btnEstadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstadisticasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstadisticasMouseExited(evt);
            }
        });
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        btnTabla.setText("Tabla de datos");
        btnTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTablaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTablaMouseExited(evt);
            }
        });
        btnTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaActionPerformed(evt);
            }
        });

        btnMain.setText("jButton1");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });

        btnFactores.setText("Factores de deforestacion");
        btnFactores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFactoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFactoresMouseExited(evt);
            }
        });
        btnFactores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactoresActionPerformed(evt);
            }
        });

        btnRegresiones.setText("Regresiones");
        btnRegresiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresionesMouseExited(evt);
            }
        });
        btnRegresiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresionesActionPerformed(evt);
            }
        });

        btnIndices.setText("Indices de deforestacion");
        btnIndices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIndicesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIndicesMouseExited(evt);
            }
        });
        btnIndices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicesActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blockchain_6298127.png"))); // NOI18N

        javax.swing.GroupLayout pMenuLayout = new javax.swing.GroupLayout(pMenu);
        pMenu.setLayout(pMenuLayout);
        pMenuLayout.setHorizontalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(btnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFactores, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
            .addComponent(btnRegresiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnIndices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pMenuLayout.setVerticalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFactores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresiones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIndices, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                .addComponent(btnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TIPO DE BOSQUE", "LOCALIZACIÓN", "HECTAREAS", "ARBOLES POR HECTAREA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout pcontenidoLayout = new javax.swing.GroupLayout(pcontenido);
        pcontenido.setLayout(pcontenidoLayout);
        pcontenidoLayout.setHorizontalGroup(
            pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcontenidoLayout.createSequentialGroup()
                .addComponent(pMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pcontenidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(lbliconoTab, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pcontenidoLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(69, Short.MAX_VALUE))))
        );
        pcontenidoLayout.setVerticalGroup(
            pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pcontenidoLayout.createSequentialGroup()
                .addGroup(pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pcontenidoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbliconoTab, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pcontenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pcontenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTablaActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
       simulacionEstadisticasPorBosque nuevaVentana = new simulacionEstadisticasPorBosque();
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        ventanaMenuPrincipal nuevaVentana = new ventanaMenuPrincipal();
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMainActionPerformed

    private void btnTablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTablaMouseEntered
  
    }//GEN-LAST:event_btnTablaMouseEntered

    private void btnTablaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTablaMouseExited

    }//GEN-LAST:event_btnTablaMouseExited

    private void btnFactoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactoresActionPerformed
     simulacionFactoresDeDeforestacion nuevaVentana = new  simulacionFactoresDeDeforestacion();
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFactoresActionPerformed

    private void btnFactoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFactoresMouseEntered
        pintarBoton(btnTabla,"",cn4,cn4,cn5);
        pintarBoton(btnEstadisticas,"",cn4,cn4,cn5);
        pintarBoton(btnFactores,"<html>Factores de deforestación</html>",cn3,cn3,cn4);
        pintarBoton(btnRegresiones,"",cn4,cn4,cn5);
        pintarBoton(btnIndices,"",cn4,cn4,cn5);
    }//GEN-LAST:event_btnFactoresMouseEntered

    private void btnFactoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFactoresMouseExited
        estadoInicial();
    }//GEN-LAST:event_btnFactoresMouseExited

    private void btnEstadisticasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadisticasMouseEntered
        pintarBoton(btnTabla,"",cn4,cn4,cn5);
        pintarBoton(btnEstadisticas,"<html>Estadisticas por bosque</html>",cn3,cn3,cn4);
        pintarBoton(btnFactores,"",cn4,cn4,cn5);
        pintarBoton(btnRegresiones,"",cn4,cn4,cn5);
        pintarBoton(btnIndices,"",cn4,cn4,cn5);
    }//GEN-LAST:event_btnEstadisticasMouseEntered

    private void btnEstadisticasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadisticasMouseExited
        estadoInicial();
    }//GEN-LAST:event_btnEstadisticasMouseExited

    private void btnRegresionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresionesMouseEntered
        pintarBoton(btnTabla,"",cn4,cn4,cn5);
        pintarBoton(btnEstadisticas,"",cn4,cn4,cn5);
        pintarBoton(btnFactores,"",cn4,cn4,cn5);
        pintarBoton(btnRegresiones,"<html>Regresiones</html>",cn3,cn3,cn4);
        pintarBoton(btnIndices,"",cn4,cn4,cn5);
    }//GEN-LAST:event_btnRegresionesMouseEntered

    private void btnRegresionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresionesMouseExited
        estadoInicial();
    }//GEN-LAST:event_btnRegresionesMouseExited

    private void btnRegresionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresionesActionPerformed

    private void btnIndicesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIndicesMouseEntered
        pintarBoton(btnTabla,"",cn4,cn4,cn5);
        pintarBoton(btnEstadisticas,"",cn4,cn4,cn5);
        pintarBoton(btnFactores,"",cn4,cn4,cn5);
        pintarBoton(btnRegresiones,"",cn4,cn4,cn5);
        pintarBoton(btnIndices,"<html>Indices de deforestación</html>",cn3,cn3,cn4);
    }//GEN-LAST:event_btnIndicesMouseEntered

    private void btnIndicesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIndicesMouseExited
        estadoInicial();
    }//GEN-LAST:event_btnIndicesMouseExited

    private void btnIndicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIndicesActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simulacionTablaDeDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnFactores;
    private javax.swing.JButton btnIndices;
    private javax.swing.JButton btnMain;
    private javax.swing.JButton btnRegresiones;
    private javax.swing.JButton btnTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbliconoTab;
    private javax.swing.JPanel pMenu;
    private javax.swing.JPanel pcontenido;
    // End of variables declaration//GEN-END:variables
}
