package proyectosimulacion;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author prome
 */
public class simulacionEstadisticasGraficaCircular extends javax.swing.JFrame {
    
    Color cn1 = new Color(76,43,11);//cafe
    Color cn2 = new Color(204,204,204);//gris
    Color cn3 = new Color(118,92,166);//Morado
    Color cn4 = new Color(255,255,255);//Blanco
    Color cn5 = new Color(0,0,0);//negro
    Color cn6 = new Color(172,237,255);//azul claro
    Color cn7 = new Color(64,55,34);//cafe 2
    Color cn8 = new Color(0,168,45);//verde
    Color cn9 = new Color(135,48,16);//negro 2
    Color cn10 = new Color(118,169,39);//verde 2
    
    public simulacionEstadisticasGraficaCircular() {
        initComponents();
        this.setLocationRelativeTo(null);
        pMenu.setBorder(new MatteBorder(0,0,0,4, Color.BLACK));
        pcontenido.setBackground(cn7);
        pMenu.setBackground(cn4);
        estadoInicial();
        titulo();
        pintarBoton(btnMain,"<html>Menú Principal</html>",cn6,cn6,cn5);
        pintarBoton(btnAtras,"<html>ATRAS</html>",cn9,cn9,cn4);
        pintarBoton(btnGraficaSig,"<html><center>GRAFICA <br>DE<br>BARRAS</center></html>",cn9,cn9,cn4);
        GraficaPastel();
        pintarBoton(btnH,"HECTAREAS",cn6,cn6,cn5);
        pintarBoton(btnHT,"HECTAREAS Y TIERRAS FORESTALES",cn6,cn6,cn5);
        btnH.setEnabled(false);
    }
   
    
    public void pintarBoton(JButton nombreBoton,String txt,Color c1,Color c2, Color c3){
        nombreBoton.setText(txt);
        nombreBoton.setFocusPainted(false);
        nombreBoton.setBackground(c1);
        nombreBoton.setBorder(new LineBorder(c2, 2));
        nombreBoton.setForeground(c3);
    }
    
   public void GraficaPastel2(){
    double n1 = 67.76;
    double n2 = 30.07;
    double n3 = 1.34;
    double n4 = 0.83;

    DefaultPieDataset datos = new DefaultPieDataset();
    datos.setValue("PASTIZALES", n1);
    datos.setValue("TIERRAS AGRÍCOLAS", n2);
    datos.setValue("OTROS USOS", n3);
    datos.setValue("ASENTAMIENTOS HUMANOS", n4);

    JFreeChart grafico_circular = ChartFactory.createPieChart3D(
         "HECTÁREAS Y TIERRAS FORESTALES",
         datos,
         true,   // Mostrar leyenda
         true,   // Mostrar herramientas de interacción
         false   // No mostrar URL
    );

    ChartPanel panel = new ChartPanel(grafico_circular);
    panel.setMouseWheelEnabled(true);

    // Eliminar el tamaño preferido, ya que puede estar limitando el tamaño
    panel.setPreferredSize(new Dimension(950, 600));  // Ajusta a un tamaño más grande
    panel.setSize(new Dimension(950, 600));  // Asegúrate de que también se defina el tamaño en el componente

    // Establecer layout para que ocupe todo el espacio disponible
    panelGrafica.setLayout(new BorderLayout());
    panelGrafica.add(panel, BorderLayout.CENTER);

    PiePlot3D plot = (PiePlot3D) grafico_circular.getPlot();
    plot.setStartAngle(290);
    plot.setDirection(Rotation.CLOCKWISE);
    plot.setForegroundAlpha(0.7f);  
    plot.setNoDataMessage("No hay datos para mostrar");  

    // Asegúrate de que el panelGrafica se redimensione
    panelGrafica.revalidate();
    panelGrafica.repaint();
    }



    
    public void GraficaPastel() {
    double n1 = 43669;
    double n2 = 56090;
    double n3 = 80002;
    double n4 = 2611;

    DefaultPieDataset datos = new DefaultPieDataset();
    datos.setValue("Pino", n1);
    datos.setValue("Encino", n2);
    datos.setValue("Pino-Encino", n3);
    datos.setValue("Encino-Pino", n4);

    JFreeChart grafico_circular = ChartFactory.createPieChart3D(
            "HECTÁREAS",
            datos,
            true,
            true,
            false
    );

    ChartPanel panel = new ChartPanel(grafico_circular);
    panel.setMouseWheelEnabled(true);

    // Ajustar tamaño del panel para que ocupe todo el espacio disponible
    panel.setPreferredSize(panelGrafica.getSize());

    // Configurar el layout de panelGrafica y agregar el gráfico al centro
    panelGrafica.setLayout(new BorderLayout());
    panelGrafica.add(panel, BorderLayout.CENTER);

    // Configuración del gráfico de pastel (PiePlot3D)
    PiePlot3D plot = (PiePlot3D) grafico_circular.getPlot();
    plot.setStartAngle(290);
    plot.setDirection(Rotation.CLOCKWISE);
    plot.setForegroundAlpha(0.7f);  // Ajusta la transparencia
    plot.setNoDataMessage("No hay datos para mostrar");  // Mensaje si faltan datos

    // Empaqueta y repinta la ventana para ver los cambios
    panelGrafica.revalidate();
    panelGrafica.repaint();
    }

    public void titulo (){
    lblTitulo.setText("         GRAFICA DE PASTEL");
    lblTitulo.setForeground(cn4);  // Cambia el color del texto
    lblTitulo.setFont(new Font("Arial", Font.PLAIN, 25)); 
    }

    public void estadoInicial(){
        pintarBoton(btnTabla,"<html>Tablas de datos</html>",cn4,cn4,cn5);
        pintarBoton(btnEstadisticas,"Estadisticas por bosque",cn3,cn3,cn4);
        btnEstadisticas.setEnabled(false);
        pintarBoton(btnFactores,"<html>Factores de deforestación</html>",cn4,cn4,cn5);
        pintarBoton(btnRegresiones,"<html>Regresiones</html>",cn4,cn4,cn5);
        pintarBoton(btnIndices,"<html>Indices de deforestación</html>",cn4,cn4,cn5);
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
        btnGraficaSig = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        panelGrafica = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btnH = new javax.swing.JButton();
        btnHT = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 415, Short.MAX_VALUE)
                .addComponent(btnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnGraficaSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficaSigActionPerformed(evt);
            }
        });

        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGraficaLayout = new javax.swing.GroupLayout(panelGrafica);
        panelGrafica.setLayout(panelGraficaLayout);
        panelGraficaLayout.setHorizontalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGraficaLayout.createSequentialGroup()
                .addContainerGap(465, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400))
        );
        panelGraficaLayout.setVerticalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        btnH.setText(" HECTAREAS");
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });

        btnHT.setText("HECTAREAS Y TIERRAS FORESTALES");
        btnHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pcontenidoLayout = new javax.swing.GroupLayout(pcontenido);
        pcontenido.setLayout(pcontenidoLayout);
        pcontenidoLayout.setHorizontalGroup(
            pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcontenidoLayout.createSequentialGroup()
                .addComponent(pMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pcontenidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnGraficaSig, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pcontenidoLayout.createSequentialGroup()
                        .addGroup(pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pcontenidoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pcontenidoLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(520, 520, 520)
                                .addComponent(btnHT, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pcontenidoLayout.setVerticalGroup(
            pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pcontenidoLayout.createSequentialGroup()
                .addGroup(pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pcontenidoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGraficaSig, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(panelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(pcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaActionPerformed
        simulacionTablaDeDatos nuevaVentana = new simulacionTablaDeDatos();
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTablaActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        ventanaMenuPrincipal nuevaVentana = new ventanaMenuPrincipal();
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMainActionPerformed

    private void btnTablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTablaMouseEntered
        pintarBoton(btnTabla,"<html>Tablas de datos</html>",cn3,cn3,cn4);
        pintarBoton(btnEstadisticas,"",cn4,cn4,cn5);
        pintarBoton(btnFactores,"",cn4,cn4,cn5);
        pintarBoton(btnRegresiones,"",cn4,cn4,cn5);
        pintarBoton(btnIndices,"",cn4,cn4,cn5);
    }//GEN-LAST:event_btnTablaMouseEntered

    private void btnTablaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTablaMouseExited
        estadoInicial();
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

    }//GEN-LAST:event_btnEstadisticasMouseEntered

    private void btnEstadisticasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadisticasMouseExited

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
        simulacionRegresion nuevaVentana = new simulacionRegresion();
        nuevaVentana.setVisible(true);
        this.dispose();
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

    private void btnGraficaSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficaSigActionPerformed
            simulacionEstadisticasGraficaBarras nuevaVentana = new  simulacionEstadisticasGraficaBarras();
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGraficaSigActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        simulacionEstadisticasPorBosque nuevaVentana = new  simulacionEstadisticasPorBosque();
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        panelGrafica.removeAll();
        GraficaPastel();
        panelGrafica.revalidate();
        panelGrafica.repaint();
        btnH.setEnabled(false);
        btnHT.setEnabled(true);
    }//GEN-LAST:event_btnHActionPerformed

    private void btnHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHTActionPerformed
        panelGrafica.removeAll();
        panelGrafica.revalidate();
        panelGrafica.repaint();
        GraficaPastel2();
        btnHT.setEnabled(false);
        btnH.setEnabled(true);
    }//GEN-LAST:event_btnHTActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simulacionEstadisticasGraficaCircular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnFactores;
    private javax.swing.JButton btnGraficaSig;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnHT;
    private javax.swing.JButton btnIndices;
    private javax.swing.JButton btnMain;
    private javax.swing.JButton btnRegresiones;
    private javax.swing.JButton btnTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pMenu;
    private javax.swing.JPanel panelGrafica;
    private javax.swing.JPanel pcontenido;
    // End of variables declaration//GEN-END:variables
}
