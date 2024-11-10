package proyectosimulacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 *
 * @author prome
 */
public class documentacion1Objetivos extends javax.swing.JFrame {
    
    Color cn1 = new Color(76,43,11);//cafe
    Color cn2 = new Color(204,204,204);//gris
    Color cn3 = new Color(118,92,166);//Morado
    Color cn4 = new Color(255,255,255);//Blanco
    Color cn5 = new Color(0,0,0);//negro
    Color cn6 = new Color(172,237,255);//azul claro

    public documentacion1Objetivos() {
        initComponents();
        this.setLocationRelativeTo(null);
        pMenu.setBorder(new MatteBorder(0,0,0,4, Color.BLACK));
        pcontenido.setBackground(cn1);
        jPanel2.setBackground(cn2);
        jPanel2.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        txtTexto.setText(" El análisis estadístico de los datos tiene como propósito principal la identificación de patrones y tendencias que puedan emplearse para \n"+ 
                        " realizar predicciones informadas y evaluar posibles escenarios futuros. Estos son los objetivos específicos y los resultados esperados de este  \n"+
                        " análisis:\n\n"
                        +"                                                                                       1. Predicción de Comportamiento Futuro \n"+
                        " Usando el modelo de regresión lineal, se buscará proyectar el comportamiento de los datos a corto y mediano plazo. La regresión permitirá \n "+
                        "extrapolar los valores, generando estimaciones basadas en las tendencias observadas en el conjunto de datos inicial. Así, se espera contar \n "+
                        "con una herramienta predictiva que brinde un panorama sobre posibles valores futuros y la variabilidad que podría esperarse bajo  \n "+
                        "condiciones similares a las de los datos analizados.\n \n"
                        +"                                                                                                   2. Simulación de Escenarios \n"+
                        " A partir de las métricas de dispersión, como la varianza y el rango de los datos, se podrá simular escenarios alternativos, considerando \n "+
                        "diferentes posibles variaciones en los valores. Esto permitirá explorar cómo cambios en la variable \n "+
                        "independiente podrían afectar los resultados y cómo estos ajustes se reflejan en el modelo de regresión lineal.\n\n"
                        +"                                                                                3. Identificación de Patrones y Tendencias Generales \n"+
                        " A través de la pendiente y el coeficiente de determinación (\\(R^2\\)) de la regresión lineal, el análisis revelará la dirección y la fuerza de \n "+
                        "la relación entre variables, proporcionando una visión de las tendencias generales que dominan el comportamiento de los datos. Un \\(R^2\\)\n "+
                        "alto indicaría una tendencia clara que podría ser útil en la toma de decisiones, mientras que un valor bajo sugeriría mayor variabilidad y,\n "+
                        "por lo tanto, menor predictibilidad en los datos.\n\n"
                        +"                                                                                     4. Evaluación de la Precisión en las Estimaciones \n "+
                        "Al comparar las proyecciones del modelo con los valores reales, se podrá evaluar la precisión del análisis. Este proceso de validación \n "+
                        "permitirá identificar el grado de confianza del modelo y ajustar cualquier parámetro que mejore la precisión de las predicciones futuras.\n\n"+
                         "                                                                                  5. Mejora en la Toma de Decisiones Basada en Datos \n"
                        +" Finalmente, el análisis busca ofrecer una base cuantitativa sólida para la toma de decisiones informadas. Al entender mejor el \n"+
                        " comportamiento histórico y su potencial de cambio, será posible evaluar el impacto de diferentes acciones o políticas y predecir cómo estas \n"+ 
                        " decisiones podrían influir en el futuro de los valores estudiados.\n\n "
                        +"                                                                                                          Resultados Esperados\n "+
                        "Los resultados esperados del análisis estadístico incluyen la obtención de un modelo de predicción confiable y una comprensión detallada \n"+ 
                        " de las tendencias presentes en los datos. Además, se espera identificar cualquier patrón significativo y simular variaciones para evaluar la\n"+ 
                        " solidez del modelo, brindando así una herramienta analítica que ayude a anticipar y manejar cambios en el contexto del estudio.");
        txtTexto.setFont(new Font("Arial", Font.PLAIN, 15));
        txtTexto.setEditable(false);
        txtTexto.setCursor(null);  
        txtTexto.setBackground(cn2);
        txtTexto.setBorder(new LineBorder(cn2, 1));
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        txtTexto.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            txtTexto.setCaretPosition(0); 
        }
        });
        txtTexto.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent e) {
        txtTexto.getCaret().setVisible(false); 
        }
        });
        
        pMenu.setBackground(cn4);     
        estadoInicial();
        pintarBoton(btnMain,"<html>Menú Principal</html>",cn6,cn6,cn5);
        
    }
    public void pintarBoton(javax.swing.JButton nombreBoton,String txt,Color c1,Color c2, Color c3){
        nombreBoton.setText(txt);
        nombreBoton.setFocusPainted(false);
        nombreBoton.setBackground(c1);
        nombreBoton.setBorder(new LineBorder(c2, 2));
        nombreBoton.setForeground(c3);
    }
    public void estadoInicial(){
        pintarBoton(btnExp,"<html>Explicación del<br>modelo matemático</html>",cn4,cn4,cn5);
        pintarBoton(btnObj,"<html>Objetivos del analisis<br>y resultados esperados</html>",cn3,cn3,cn4);
        btnObj.setEnabled(false);
        pintarBoton(btnMod,"<html>Modelo de regresión <br>lineal simple</html>",cn4,cn4,cn5);
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pcontenido = new javax.swing.JPanel();
        pMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnObj = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        btnMain = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Noto Sans Mono Thin", 3, 20)); // NOI18N
        jLabel2.setText("DOCUMENTACIÓN");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documentation_9746255.png"))); // NOI18N

        btnObj.setText("jButton1");
        btnObj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjActionPerformed(evt);
            }
        });

        btnExp.setText("jButton1");
        btnExp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExpMouseExited(evt);
            }
        });
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnMain.setText("jButton1");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });

        btnMod.setText("jButton1");
        btnMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModMouseExited(evt);
            }
        });
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMenuLayout = new javax.swing.GroupLayout(pMenu);
        pMenu.setLayout(pMenuLayout);
        pMenuLayout.setHorizontalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnObj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnExp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(btnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pMenuLayout.setVerticalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnObj, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        txtTexto.setColumns(20);
        txtTexto.setRows(5);
        jScrollPane1.setViewportView(txtTexto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTitulo.setBackground(new java.awt.Color(153, 153, 153));
        lblTitulo.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        lblTitulo.setText("   OBJETIVOS DEL ANALISIS Y RESULTADOS ESPERADOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pcontenidoLayout = new javax.swing.GroupLayout(pcontenido);
        pcontenido.setLayout(pcontenidoLayout);
        pcontenidoLayout.setHorizontalGroup(
            pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcontenidoLayout.createSequentialGroup()
                .addComponent(pMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pcontenidoLayout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pcontenidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        pcontenidoLayout.setVerticalGroup(
            pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pcontenidoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pcontenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pcontenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        documentacion3Objetivos nuevaVentana = new documentacion3Objetivos();
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnObjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnObjActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        ventanaMenuPrincipal nuevaVentana = new ventanaMenuPrincipal();
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMainActionPerformed

    private void btnExpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpMouseEntered
        pintarBoton(btnExp,"<html>Explicación del<br>modelo matemático</html>",cn3,cn3,cn4);
        pintarBoton(btnObj,"",cn4,cn4,cn4);
        btnObj.setEnabled(false);      
        btnMod.setText("");
    }//GEN-LAST:event_btnExpMouseEntered

    private void btnExpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpMouseExited
        estadoInicial();
    }//GEN-LAST:event_btnExpMouseExited

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        documentacion2Objetivos nuevaVentana = new documentacion2Objetivos();
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModActionPerformed

    private void btnModMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModMouseEntered
        pintarBoton(btnExp,"",cn4,cn4,cn4);
        pintarBoton(btnObj,"",cn4,cn4,cn4);
        pintarBoton(btnMod,"<html>Modelo de regresión <br>lineal simple</html>",cn3,cn3,cn4);
    }//GEN-LAST:event_btnModMouseEntered

    private void btnModMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModMouseExited
        estadoInicial();
    }//GEN-LAST:event_btnModMouseExited

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new documentacion1Objetivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnMain;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnObj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pMenu;
    private javax.swing.JPanel pcontenido;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables
}
