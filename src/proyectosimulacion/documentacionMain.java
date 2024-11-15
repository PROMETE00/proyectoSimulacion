package proyectosimulacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 *
 * @author prome
 */
public class documentacionMain extends javax.swing.JFrame {

    Color cn1 = new Color(76, 43, 11);//cafe
    Color cn2 = new Color(204, 204, 204);//gris
    Color cn3 = new Color(118, 92, 166);//Morado
    Color cn4 = new Color(255, 255, 255);//Blanco
    Color cn5 = new Color(0, 0, 0);//negro
    Color cn6 = new Color(172, 237, 255);//azul claro
    public JLabel lblImg1 = new JLabel();
    public JTextArea txtModelo = new JTextArea();
    public JScrollPane jScrollPane1 = new JScrollPane();
    public JTextArea txtModelo2 = new JTextArea();
    public JScrollPane jScrollPane3 = new JScrollPane();
    

    public documentacionMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        estadoInicial();
        pMenu.setBorder(new MatteBorder(0, 0, 0, 4, Color.BLACK));
        pcontenido.setBackground(cn1);
        jPanel2.setBackground(cn2);
        jPanel2.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        pMenu.setBackground(cn4);
        pintarBoton(btnMain, "<html>Menú Principal</html>", cn6, cn6, cn5);
        componentesModeloMatematico();
        pintarBoton(btnExp, "<html>Explicación del<br>modelo matemático</html>", cn3, cn3, cn4);
        verif();
        pPrincipal.repaint();
        pPrincipal.revalidate();
        pPrincipal.setBackground(cn4);
    }
    public void documentacion2Objetivos(){
        lblTitulo.setText("                         MODELO DE REGRESION SIMPLE");
        pPrincipal.setBackground(cn1);
        lblImg1.setVisible(true);
        txtModelo.setVisible(true);
        ImageIcon icon = new ImageIcon("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/Regresión-lineal-2162541869.png");
        lblImg1.setIcon(icon);
        lblImg1.setBounds(220, 0, 600, 500);
        pPrincipal.add(lblImg1);
        txtModelo.setText("Y : Variable dependiente o respuesta. \n"
                        + "X : Vaiable independiente o predictoria.\n"
                        + "B0 : Ordenada al origeno intercepto.\n"
                        + "Valor estimado de Y cuando X = 0 \n"
                        +"B1 : Pendiente, indica cuánto cambia Y \n"
                        + "por cada unidad de cambio en X.");
        persoTexArea(txtModelo, jScrollPane1, 29);
        txtModelo.setBounds(230, 485, 650, 600);
        txtModelo.setForeground(cn4);
        txtModelo.setBackground(cn1);
        pPrincipal.add(txtModelo);
        btnMod.setEnabled(false);
    }

    public void documentacionObjetivos() {
        pPrincipal.setBackground(cn4);
        lblTitulo.setText("     OBJETIVOS DEL ANALISIS Y RESULTADOS ESPERADOS");
        pMenu.setBorder(new MatteBorder(0, 0, 0, 4, Color.BLACK));
        pcontenido.setBackground(cn1);
        txtModelo.setText(" El análisis estadístico de los datos tiene como propósito principal la identificación de patrones y tendencias que puedan emplearse para \n"
                + " realizar predicciones informadas y evaluar posibles escenarios futuros. Estos son los objetivos específicos y los resultados esperados de  \n"
                + " este análisis:\n\n"
                + "                                                                                       1. Predicción de Comportamiento Futuro \n"
                + " Usando el modelo de regresión lineal, se buscará proyectar el comportamiento de los datos a corto y mediano plazo. La regresión \n "
                + "permitirá extrapolar los valores, generando estimaciones basadas en las tendencias observadas en el conjunto de datos inicial. Así, se \n "
                + "espera contar  con una herramienta predictiva que brinde un panorama sobre posibles valores futuros y la variabilidad que podría  \n "
                + "esperarse bajo condiciones similares a las de los datos analizados.\n \n"
                + "                                                                                                   2. Simulación de Escenarios \n"
                + " A partir de las métricas de dispersión, como la varianza y el rango de los datos, se podrá simular escenarios alternativos, considerando \n "
                + "diferentes posibles variaciones en los valores. Esto permitirá explorar cómo cambios en la variable \n "
                + "independiente podrían afectar los resultados y cómo estos ajustes se reflejan en el modelo de regresión lineal.\n\n"
                + "                                                                                3. Identificación de Patrones y Tendencias Generales \n"
                + " A través de la pendiente y el coeficiente de determinación ((R^2)) de la regresión lineal, el análisis revelará la dirección y la fuerza de \n "
                + "la relación entre variables, proporcionando una visión de las tendencias generales que dominan el comportamiento de los datos. Un \n "
                + "(R^2) alto indicaría una tendencia clara que podría ser útil en la toma de decisiones, mientras que un valor bajo sugeriría mayor \n "
                + "variabilidad y, por lo tanto, menor predictibilidad en los datos.\n\n"
                + "                                                                                     4. Evaluación de la Precisión en las Estimaciones \n "
                + "Al comparar las proyecciones del modelo con los valores reales, se podrá evaluar la precisión del análisis. Este proceso de validación \n "
                + "permitirá identificar el grado de confianza del modelo y ajustar cualquier parámetro que mejore la precisión de las predicciones futuras.\n\n"
                + "                                                                                  5. Mejora en la Toma de Decisiones Basada en Datos \n"
                + " Finalmente, el análisis busca ofrecer una base cuantitativa sólida para la toma de decisiones informadas. Al entender mejor el \n"
                + " comportamiento histórico y su potencial de cambio, será posible evaluar el impacto de diferentes acciones o políticas y predecir cómo \n"
                + " estas decisiones podrían influir en el futuro de los valores estudiados.\n\n "
                + "                                                                                                          Resultados Esperados\n "
                + "Los resultados esperados del análisis estadístico incluyen la obtención de un modelo de predicción confiable y una comprensión \n"
                + " detallada de las tendencias presentes en los datos. Además, se espera identificar cualquier patrón significativo y simular variaciones \n"
                + " para evaluar la solidez del modelo, brindando así una herramienta analítica que ayude a anticipar y manejar cambios en el contexto del \n estudio.");
        txtModelo.setVisible(true);
        jScrollPane1.setVisible(true);
        persoTexArea(txtModelo, jScrollPane1,14);
        txtModelo.setBounds(10, 10, 930, 700);
        pPrincipal.add(txtModelo);
        pPrincipal.revalidate();
        pPrincipal.repaint();
        btnObj.setEnabled(false);
    }

    public void componentesModeloMatematico() {
        pPrincipal.setBackground(cn4);
        lblImg1.setVisible(true);
        lblTitulo.setText("             COMPONENTES DEL MODELO MATEMATICO");
        txtModelo.setText("Pendiente (ß1):\n\n"
                + "Refleja la tasa de cambio de la variable dependiente y respecto a la independiente X\n\n"
                + "                 Si ß1 > 0,hay una relación positiva: y aumenta cuando X crece.\n"
                + "                 Si ß1 < 0,la relación es negativa: y disminuye con aumentos en X\n\n"
                + "Ordena al origen(ß0):Represena el valor esperado de Y cuando X = 0\n\n"
                + "Esto proporciona un punto de referencia inicial para interpretar \n"
                + "el comportamiento del modelo.\n\n"
                + "                                                                         Coeficiente de Determinación (R^2):");
        txtModelo.setBounds(40, 40, 1000, 500);
        persoTexArea(txtModelo, jScrollPane1,17);
        ImageIcon icon = new ImageIcon("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/Captura de pantalla_20241106_221530.png");
        lblImg1.setIcon(icon);
        lblImg1.setBounds(400, 340, 200, 200);
        pPrincipal.add(lblImg1);
        txtModelo2.setText("\n\nMide la proporción de variabilidad en y explicada por el modelo lineal.\n\n"
                + "R^2 cercano a 1:El modelo tiene un ajuste excelente y explica casi toda la"
                + "variabilidad en los datos.\n\n"
                + "R^2 bajo:El modelo no representa bien la tendencia de los datos,surgiendo una"
                + "relación débil entre X e Y.");
        persoTexArea(txtModelo2, jScrollPane3,17);
        txtModelo2.setBounds(40, 500, 1000, 700);
        pPrincipal.setBackground(cn4);
        pPrincipal.add(txtModelo);
        pPrincipal.add(txtModelo2);
        Re();
        btnExp.setEnabled(false);
        txtModelo.setVisible(true);
        jScrollPane1.setVisible(true);
        txtModelo2.setVisible(true);
        jScrollPane3.setVisible(true);
    }

    public void Re() {
        pPrincipal.revalidate();
        pPrincipal.repaint();
    }

    public void persoTexArea(JTextArea txtM, JScrollPane jS, int n) {
        txtM.setFont(new Font("Arial", Font.PLAIN, n));
        txtM.setForeground(cn5);
        txtM.setEditable(false);
        txtM.setCursor(null);
        txtM.setBorder(null);
        txtM.setBorder(BorderFactory.createEmptyBorder());
        jS.setBorder(BorderFactory.createEmptyBorder());
        txtM.setBackground(cn4);
        txtM.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                txtM.setCaretPosition(0);
            }
        });
        txtM.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                txtM.getCaret().setVisible(false);
            }
        });

    }

    public void tDispo() {
        btnExp.setEnabled(true);
        btnMod.setEnabled(true);
        btnObj.setEnabled(true);
    }

    public void pintarBoton(javax.swing.JButton nombreBoton, String txt, Color c1, Color c2, Color c3) {
        nombreBoton.setText(txt);
        nombreBoton.setFocusPainted(false);
        nombreBoton.setBackground(c1);
        nombreBoton.setBorder(new LineBorder(c2, 2));
        nombreBoton.setForeground(c3);
    }

    public void estadoInicial() {
        pintarBoton(btnExp, "<html>Explicación del<br>modelo matemático</html>", cn4, cn4, cn5);
        pintarBoton(btnMod, "<html>Modelo de regresión <br>lineal simple</html>", cn4, cn4, cn5);
        pintarBoton(btnObj, "<html>Objetivos del analisis<br>y resultados esperados</html>", cn4, cn4, cn5);
    }

    public void verif() {
        if (!btnExp.isEnabled()) {
            pintarBoton(btnExp, "<html>Explicación del<br>modelo matemático</html>", cn3, cn3, cn4);
        } else if (!btnMod.isEnabled()) {
            pintarBoton(btnMod, "<html>Modelo de regresión <br>lineal simple</html>", cn3, cn3, cn4);
        } else if (!btnObj.isEnabled()) {
            pintarBoton(btnObj, "<html>Objetivos del analisis<br>y resultados esperados</html>", cn3, cn3, cn4);
        }
    }
    public void rest (){
    lblImg1.setVisible(false);
    txtModelo.setVisible(false);
    jScrollPane1.setVisible(false); 
    txtModelo2.setVisible(false);
    jScrollPane3.setVisible(false); 
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
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pPrincipal = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Noto Sans Mono Thin", 3, 20)); // NOI18N
        jLabel2.setText("DOCUMENTACIÓN");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documentation_9746255.png"))); // NOI18N

        btnObj.setText("obj");
        btnObj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnObjMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnObjMouseExited(evt);
            }
        });
        btnObj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjActionPerformed(evt);
            }
        });

        btnExp.setText("exp");
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

        btnMod.setText("mod");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 527, Short.MAX_VALUE)
                .addComponent(btnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblTitulo.setBackground(new java.awt.Color(153, 153, 153));
        lblTitulo.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N

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

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 962, Short.MAX_VALUE)
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
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
                        .addContainerGap(300, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pcontenidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        pcontenidoLayout.setVerticalGroup(
            pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pcontenidoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        rest();
        tDispo();
        componentesModeloMatematico();
        Re();
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnObjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjActionPerformed
        rest();
        tDispo();
        documentacionObjetivos();
        Re();
    }//GEN-LAST:event_btnObjActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        ventanaMenuPrincipal nuevaVentana = new ventanaMenuPrincipal();
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMainActionPerformed

    private void btnExpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpMouseEntered
        estadoInicial();
        pintarBoton(btnExp, "<html>Explicación del<br>modelo matemático</html>", cn3, cn3, cn4);
    }//GEN-LAST:event_btnExpMouseEntered

    private void btnExpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpMouseExited
        estadoInicial();
        verif();
    }//GEN-LAST:event_btnExpMouseExited

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        rest();
        tDispo();
        documentacion2Objetivos();
        Re();
    }//GEN-LAST:event_btnModActionPerformed

    private void btnModMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModMouseEntered
        estadoInicial();
        pintarBoton(btnMod, "<html>Modelo de regresión <br>lineal simple</html>", cn3, cn3, cn4);
    }//GEN-LAST:event_btnModMouseEntered

    private void btnModMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModMouseExited
        estadoInicial();
        verif();
    }//GEN-LAST:event_btnModMouseExited

    private void btnObjMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObjMouseEntered
        estadoInicial();
        pintarBoton(btnObj, "<html>Objetivos del analisis<br>y resultados esperados</html>", cn3, cn3, cn4);

    }//GEN-LAST:event_btnObjMouseEntered

    private void btnObjMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObjMouseExited
        estadoInicial();
        verif();
    }//GEN-LAST:event_btnObjMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new documentacionMain().setVisible(true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pMenu;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pcontenido;
    // End of variables declaration//GEN-END:variables
}
