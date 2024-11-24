package proyectosimulacion;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;

public class menuSimulacion {

    JPanel panel = new JPanel();
    JPanel frameLI = new JPanel();
    JPanel frameLD = new JPanel();
    JPanel panelGrafica = new JPanel();
    JFrame frame = new JFrame();
    JLabel imgMain = new JLabel();
    JButton btnMSim = new JButton();
    JButton btnMDoc = new JButton();
    JButton btnTablaDatos = new JButton();
    JButton btnEstadisticas = new JButton();
    JButton btnFactores = new JButton();
    JButton btnRegresiones = new JButton();
    JButton btnIndices = new JButton();
    JButton btnExp = new JButton();
    JButton btnMod = new JButton();
    JButton btnObj = new JButton();
    JButton btnMenuP = new JButton();
    JButton btnGC = new JButton();
    JButton btnGB = new JButton();
    JButton btnGCB1 = new JButton();
    JButton btnGCB2 = new JButton();
    JButton btnGCB3 = new JButton();
    JButton btnGCB4 = new JButton();
    JButton btnGB1 = new JButton();
    JButton btnGB2 = new JButton();
    JButton btnGB3 = new JButton();
    JButton btnGB4 = new JButton();
    JButton btnGB5 = new JButton();
    JLabel imagenLI = new JLabel();
    JLabel textoLI = new JLabel();
    JLabel imagenMG = new JLabel();
    JLabel lblImg1 = new JLabel();
    JLabel lblTitulo = new JLabel();
    JTextArea txtModelo = new JTextArea();
    JTextArea txtModelo2 = new JTextArea();
    JScrollPane jScrollPane1 = new JScrollPane();
    JScrollPane jScrollPane2 = new JScrollPane();

    Color cn1 = new Color(76, 43, 11); // café
    Color cn2 = new Color(204, 204, 204); // gris
    Color cn3 = new Color(118, 92, 166); // morado
    Color cn4 = new Color(255, 255, 255); // blanco
    Color cn5 = new Color(0, 0, 0); // negro
    Color cn6 = new Color(172, 237, 255); // azul claro
    Color cn7 = new Color(64, 55, 34); // café 2
    Color cn8 = new Color(0, 168, 45); // verde
    Color cn9 = new Color(203, 115, 91); // café claro
    Color cn10 = new Color(127, 250, 91); // verde claro
    Color cn11 = new Color(108, 186, 118); // 
    Color cn12 = new Color(91, 156, 135); // 
    Color cn13 = new Color(123, 211, 134); // 
    Color cn14 = new Color(71, 122, 106); // 
    Color cn15 = new Color(45, 83, 25);//verde mas oscuro
    Color cn16 = new Color(12, 51, 13);//
    Color cn17 = new Color(54, 98, 30);//
    Color cn18 = new Color(14, 66, 15);//
    Color cn19 = new Color(92, 114, 68);//
    Color cn20 = new Color(7, 100, 44);//
    Color cn21 = new Color(3, 52, 41);//
    Color cn22 = new Color(172, 159, 60);//
    Color cn23 = new Color(188, 170, 164);
    Color cn24 = new Color(75, 90, 64);
    Color cn25 = new Color(0, 95, 126);
    Color cn26 = new Color(0, 70, 94);
    Color inv = new Color(0, 0, 0, 0);

    private static final String DATA_FILE = "Datos.csv";
    private DefaultTableModel mt = new DefaultTableModel();
    private JTable tabla;
    private JScrollPane scrollPane;

    public void ventanaMain() {
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);

        // Configurar panel principal
        panel.setLayout(null); // Posicionamiento manual de componentes
        panel.setBackground(cn26);
        frame.add(panel);

        menuPrincipal();
//        menuGraficaBarras();

        frame.setVisible(true);
    }

    public void documentacionExplicacion() {
        lblImg1.setVisible(true);
        frame.setTitle("             COMPONENTES DEL MODELO MATEMATICO");
        txtModelo.setText("Pendiente (ß1):\n\n"
                + "Refleja la tasa de cambio de la variable dependiente y respecto a la independiente X\n\n"
                + "                 Si ß1 > 0,hay una relación positiva: y aumenta cuando X crece.\n"
                + "                 Si ß1 < 0,la relación es negativa: y disminuye con aumentos en X\n\n"
                + "Ordena al origen(ß0):Represena el valor esperado de Y cuando X = 0\n\n"
                + "Esto proporciona un punto de referencia inicial para interpretar \n"
                + "el comportamiento del modelo.\n\n"
                + "                                           Coeficiente de Determinación :");
        txtModelo.setBounds(640, 40, 1000, 500);
        txtModelo.setBackground(inv);
        persoTexArea(txtModelo, jScrollPane1, 27);
        txtModelo.setForeground(cn4);
        img("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/Captura de pantalla_20241106.png", 700, 300, lblImg1);
        lblImg1.setBounds(800, 540, 700, 300);
        lblImg1.setBackground(inv);
        panel.add(lblImg1);
        txtModelo2.setText("\n\nMide la proporción de variabilidad en y explicada por el modelo lineal.\n\n"
                + "R^2 cercano a 1:El modelo tiene un ajuste excelente y explica casi toda la"
                + "variabilidad en los datos.\n\n"
                + "R^2 bajo:El modelo no representa bien la tendencia de los datos,surgiendo una"
                + "relación débil entre X e Y.");
        persoTexArea(txtModelo2, jScrollPane2, 27);
        txtModelo2.setBounds(640, 800, 1000, 700);
        txtModelo2.setBackground(inv);
        txtModelo2.setForeground(cn4); //
        panel.add(txtModelo);
        panel.add(txtModelo2);
        Re();
        txtModelo.setOpaque(false); // Esto asegura que el fondo sea transparente si inv tiene alfa 0
        txtModelo.setBackground(inv);
        txtModelo2.setOpaque(false);
        txtModelo2.setBackground(inv);
    }

    public void documentacionObjetivos() {
        frame.setTitle("     OBJETIVOS DEL ANALISIS Y RESULTADOS ESPERADOS");
        txtModelo.setText(" El análisis estadístico de los datos tiene como propósito principal la identificación de patrones y tendencias que puedan emplearse para \n"
                + " realizar predicciones informadas y evaluar posibles escenarios futuros. Estos son los objetivos específicos y los resultados esperados de  \n"
                + " este análisis:\n"
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
        persoTexArea(txtModelo, jScrollPane1, 22);
        txtModelo.setBackground(inv);
        txtModelo.setBounds(400, 40, 1450, 1100);
        panel.add(txtModelo);
        panel.revalidate();
        panel.repaint();
    }

    public void documentacionModelo() {
        frame.setTitle("MODELO DE REGRESION SIMPLE");
        panel.setBackground(cn1);
        lblImg1.setVisible(true);
        txtModelo.setVisible(true);
        img("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/Regresión-lineal-2162541869.png", 850, 700, lblImg1);
        lblImg1.setBounds(650, 50, 850, 700);
        panel.add(lblImg1);
        txtModelo.setText("Y : Variable dependiente o respuesta. \n"
                + "X : Vaiable independiente o predictoria.\n"
                + "B0 : Ordenada al origeno intercepto.\n"
                + "Valor estimado de Y cuando X = 0 \n"
                + "B1 : Pendiente, indica cuánto cambia Y \n"
                + "por cada unidad de cambio en X.");
        persoTexArea(txtModelo, jScrollPane1, 35);
        txtModelo.setBounds(740, 790, 650, 600);
        txtModelo.setForeground(cn4);
        txtModelo.setBackground(inv);
        panel.add(txtModelo);
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

    public void Re() {
        panel.revalidate();
        panel.repaint();
    }

    public void barraInteraccionD() {

        img("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/documentation_9746255.png", 70, 70, imagenLI);
        imagenLI.setBounds(0, 0, 70, 70);
        panel.add(imagenLI);
        textoLI.setText("DOCUMENTACIÓN");
        textoLI.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 23));
        textoLI.setBounds(80, 0, 200, 50);
        panel.add(textoLI);
        btnExp.setBounds(0, 200, 300, 60);
        pintarBoton(btnExp, "<html>Explicación del modelo matemático</html>", cn22, cn22, cn4);
        btnObj.setBounds(0, 265, 300, 60);
        pintarBoton(btnObj, "<html>Objetivos del analisis y resultados esperados</html>", cn22, cn22, cn4);
        btnMod.setBounds(0, 330, 300, 60);
        pintarBoton(btnMod, "<html>Modelo de regresión lineal simple</html>", cn22, cn22, cn4);

        btnMenuP.setBounds(0, 1073, 300, 60);
        pintarBoton(btnMenuP, "<html>MENÚ PRINCIPAL</html>", cn3, cn3, cn4);
        panel.add(btnMenuP);

        btnExp.addActionListener(e -> {
            limpiarPanel();
            documentacionExplicacion();
            barraInteraccionD();
        });

        btnObj.addActionListener(e -> {
            limpiarPanel();
            documentacionObjetivos();
            barraInteraccionD();
        });

        btnMod.addActionListener(e -> {
            limpiarPanel();
            documentacionModelo();
            barraInteraccionD();
        });

        btnMenuP.addActionListener(e -> {
            limpiarPanel();
            menuPrincipal();
        });
        panel.add(btnExp);
        panel.add(btnObj);
        panel.add(btnMod);
        frameLI.setBackground(cn23);
        frameLD.setBackground(cn24);
        frameLI.setBounds(0, 0, 300, 1150);
        frameLD.setBounds(300, 0, 1650, 1150);
        panel.add(frameLI);
        panel.add(frameLD);
    }

    public void menuGraficaBarras() {
        btnGB1.setBounds(350, 50, 200, 60);
        btnGB2.setBounds(1665, 50, 200, 60);
        btnGB3.setBounds(380, 1000, 200, 60);
        btnGB4.setBounds(1590, 1000, 250, 60);
        btnGB5.setBounds(960, 1000, 250, 60);
        pintarBoton(btnGB1, "ATRAS", cn3, cn3, cn4);
        pintarBoton(btnGB2, "GRAFICA DE PASTEL", cn3, cn3, cn4);
        pintarBoton(btnGB3, "TIPOS DE BOSQUE", cn3, cn3, cn4);
        pintarBoton(btnGB4, "ECORREGION", cn3, cn3, cn4);
        pintarBoton(btnGB5, "DEFORESTACION", cn3, cn3, cn4);

        if (!btnGB3.isEnabled()) {
            btnGB4.setEnabled(true);
            btnGB5.setEnabled(true);
        } else if (!btnGB4.isEnabled()) {
            btnGB3.setEnabled(true);
            btnGB5.setEnabled(true);
        } else if (!btnGB5.isEnabled()) {
            btnGCB3.setEnabled(true);
            btnGCB4.setEnabled(true);
        }

        panel.add(btnGB1);
        panel.add(btnGB2);
        panel.add(btnGB3);
        panel.add(btnGB4);
        panel.add(btnGB5);

        panelGrafica.setBounds(380, 170, 1460, 780); // Posición y tamaño
        panel.add(panelGrafica); // Agregar al panel principal

        btnGB3.addActionListener(e -> {
            barraInteraccionD();
        });
        btnGB4.addActionListener(e -> {
            barraInteraccionD();
        });
        btnGB5.addActionListener(e -> {
            barraInteraccionD();
        });
    }

    public void GraficaBarras() {
        panelGrafica.removeAll();
        graficaCircular();
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
                true, // Mostrar leyenda
                true, // Mostrar herramientas de interacción
                false // No mostrar URL
        );

        ChartPanel chartPanel = new ChartPanel(grafico_circular);
        chartPanel.setMouseWheelEnabled(true);
        chartPanel.setPreferredSize(new Dimension(1420, 770));

        PiePlot3D plot = (PiePlot3D) grafico_circular.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.7f);
        plot.setNoDataMessage("No hay datos para mostrar");

        panelGrafica.setLayout(new BorderLayout());
        panelGrafica.add(chartPanel, BorderLayout.CENTER);

        panelGrafica.revalidate();
        panelGrafica.repaint();
        btnGCB4.setEnabled(false);
        btnGCB3.setEnabled(true);
    }

    public void GraficaPastel2() {
        panelGrafica.removeAll();
        graficaCircular();
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
                true, // Mostrar leyenda
                true, // Mostrar herramientas de interacción
                false // No mostrar URL
        );

        ChartPanel chartPanel = new ChartPanel(grafico_circular);
        chartPanel.setMouseWheelEnabled(true);
        chartPanel.setPreferredSize(new Dimension(1420, 770));

        PiePlot3D plot = (PiePlot3D) grafico_circular.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.7f);
        plot.setNoDataMessage("No hay datos para mostrar");

        panelGrafica.setLayout(new BorderLayout());
        panelGrafica.add(chartPanel, BorderLayout.CENTER);

        panelGrafica.revalidate();
        panelGrafica.repaint();
        btnGCB4.setEnabled(false);
        btnGCB3.setEnabled(true);
    }

    public void GraficaPastel() {
        panelGrafica.removeAll();
        graficaCircular();
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

        ChartPanel chartPanel = new ChartPanel(grafico_circular);
        chartPanel.setMouseWheelEnabled(true);
        chartPanel.setPreferredSize(new Dimension(1420, 770));

        PiePlot3D plot = (PiePlot3D) grafico_circular.getPlot();
        plot.setStartAngle(290); // Ángulo de inicio
        plot.setDirection(Rotation.CLOCKWISE); // Dirección del gráfico
        plot.setForegroundAlpha(0.7f); // Transparencia
        plot.setNoDataMessage("No hay datos para mostrar"); // Mensaje en caso de datos faltantes

        panelGrafica.setLayout(new BorderLayout());
        panelGrafica.add(chartPanel, BorderLayout.CENTER);

        panelGrafica.revalidate();
        panelGrafica.repaint();
        btnGCB3.setEnabled(false);
        btnGCB4.setEnabled(true);
    }

    public void graficaCircular() {
        // Configurar botones
        btnGCB1.setBounds(350, 50, 200, 60);
        btnGCB2.setBounds(1665, 50, 200, 60);
        btnGCB3.setBounds(550, 1000, 200, 60);
        btnGCB4.setBounds(1450, 1000, 250, 60);
        pintarBoton(btnGCB1, "ATRAS", cn3, cn3, cn4);
        pintarBoton(btnGCB2, "GRAFICA BARRAS", cn3, cn3, cn4);
        pintarBoton(btnGCB3, "HECTAREAS", cn3, cn3, cn4);
        pintarBoton(btnGCB4, "HECTAREAS Y TIERRAS FORESTALES", cn3, cn3, cn4);

        if (!btnGCB3.isEnabled()) {
            btnGCB4.setEnabled(true);
        } else if (!btnGCB4.isEnabled()) {
            btnGCB3.setEnabled(true);
        }

        // Agregar botones al panel principal
        panel.add(btnGCB1);
        panel.add(btnGCB2);
        panel.add(btnGCB3);
        panel.add(btnGCB4);

        // Configurar y agregar panelGrafica al panel principal
        panelGrafica.setBounds(620, 250, 951, 608); // Posición y tamaño
        panel.add(panelGrafica); // Agregar al panel principal
        // Llamar al método que genera la gráfica
        btnGCB3.addActionListener(e -> {
            GraficaPastel();
            barraInteraccion();
        });
        btnGCB4.addActionListener(e -> {
            GraficaPastel2();
            barraInteraccion();
        });
    }

    public void menuSimulacion() {
        Color in = new Color(0, 0, 0, 0);
        // Configuración inicial del panel
        frame.setTitle("Simulación");
        limpiarPanel();
        JTextArea lblExplicacion = new JTextArea("Proyeccion exponencial:\n\n"
                + "Utiliza el modelo            A(t)=A0​⋅er⋅(t−t0​)\n\n"
                + "Donde:\n\n A0​:   Área inicial.\n"
                + " rr:     Tasa de deforestación anual (puede ser negativa si es una pérdida).\n"
                + " tt:     Año de proyección.\n"
                + " t0t0​:   Año inicial.");

        JTextArea lblDatos = new JTextArea("Area inicial: 501948\n\nTasa de deforestacion: -0.0238 (-2.38%)\n\n"
                + "Año Inicial: 2022\n");

        JLabel lblInstruccion = new JLabel("Ingrese los años a simular:");

        lblExplicacion.setFont(new Font("Arial", Font.PLAIN, 20));
        lblDatos.setFont(new Font("Arial", Font.PLAIN, 20));
        lblInstruccion.setFont(new Font("Arial", Font.PLAIN, 20));

        lblExplicacion.setBackground(in);
        lblDatos.setBackground(in);

        lblExplicacion.setForeground(cn4);
        lblDatos.setForeground(cn4);
        lblInstruccion.setForeground(cn4);

        lblExplicacion.setBounds(500, 50, 1500, 300);
        lblDatos.setBounds(900, 355, 400, 300);
        lblInstruccion.setBounds(500, 650, 400, 30);
        panel.add(lblExplicacion);
        panel.add(lblDatos);
        panel.add(lblInstruccion);

        JTextField txtInput = new JTextField();
        txtInput.setBounds(500, 750, 300, 40);
        panel.add(txtInput);

        JButton btnSimular = new JButton("Simular");
        pintarBoton(btnSimular, "Simular", cn8, cn8, cn4);
        btnSimular.setBounds(500, 860, 300, 40);
        panel.add(btnSimular);

        btnSimular.addActionListener(e -> {
            String input = txtInput.getText().trim();
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Por favor, ingrese un valor.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                mostrarResultados(input);
            }
        });

        panel.revalidate();
        panel.repaint();
    }

    private void mostrarResultados(String input) {
        Color in = new Color(0, 0, 0, 0);
        limpiarPanel();
        frame.setTitle("Año\tÁrea forestal proyectada (hectáreas)");

        JLabel lblResultado = new JLabel("Años simulados: " + input);
        lblResultado.setFont(new Font("Arial", Font.PLAIN, 35));
        lblResultado.setForeground(cn4);
        lblResultado.setBounds(950, 150, 600, 30);
        panel.add(lblResultado);

        JTextArea lblCalculo = new JTextArea(realizarCalculo(input));
        lblCalculo.setFont(new Font("Arial", Font.PLAIN, 35));
        lblCalculo.setBackground(in);
        lblCalculo.setForeground(cn4);
        lblCalculo.setBounds(900, 250, 1300, 1000);
        panel.add(lblCalculo);

        barraInteraccion();

        panel.revalidate();
        panel.repaint();
    }

    private String realizarCalculo(String input) {
        try {
            int aniosAProyectar = Integer.parseInt(input); // Convertir el input a un entero
            if (aniosAProyectar < 0) {
                return "El número de años debe ser positivo.";
            }

            double areaInicial = 501948; // área inicial
            double tasaDeforestacion = -0.0238; // tasa de deforestación anual (-2.38%)
            int anioInicial = 2022; // año inicial

            List<Double> resultados = DeforestationProjection.proyectarDeforestacion(
                    areaInicial, tasaDeforestacion, anioInicial, aniosAProyectar
            );

            StringBuilder resultadoTexto = new StringBuilder("Año\tÁrea forestal\n                             proyectada (hectáreas)\n\n");
            for (int i = 0; i <= aniosAProyectar; i++) {
                int anio = anioInicial + i;
                resultadoTexto.append(anio).append("\t").append(String.format("%.2f", resultados.get(i))).append("\n");
            }

            return resultadoTexto.toString();
        } catch (NumberFormatException e) {
            return "Valor inválido, ingrese un número entero.";
        }
    }

    public void menuPrincipal() {
        frame.setTitle("Menú Principal");

        btnMSim.setBounds(400, 900, 400, 130);
        btnMDoc.setBounds(1200, 900, 400, 130);

        panel.add(btnMSim);
        panel.add(btnMDoc);

        pintarBoton(btnMSim, "SIMULACIÓN", cn17, cn17, cn4);
        btnMSim.setFont(new Font("Arial", Font.PLAIN, 35));
        pintarBoton(btnMDoc, "DOCUMENTACIÓN", cn18, cn18, cn4);
        btnMDoc.setFont(new Font("Arial", Font.PLAIN, 35));

        img("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/deforestation_5051014.png", 700, 700, imgMain);
        imgMain.setBounds(650, 50, 700, 700);
        panel.add(imgMain);

        btnMSim.addActionListener(e -> {
            limpiarPanel();
            menuSimulacion();
            barraInteraccion();
        });

        btnMDoc.addActionListener(e -> {
            limpiarPanel();
            documentacionExplicacion();
            barraInteraccionD();
        });
        btnMSim.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(cn15);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(cn26);
            }
        });

        btnMDoc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(cn16);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(cn26);
            }
        });
    }

    private void limpiarPanel() {
        panel.removeAll(); // Elimina todos los componentes
        panel.revalidate(); // Reorganiza los componentes en el contenedor
        panel.repaint();    // Redibuja el panel
    }

    public void tablaDeDatos() {
        tabla = new JTable(mt);
        scrollPane = new JScrollPane(tabla);
        tabla.setRowHeight(46);
        scrollPane.setBounds(350, 50, 1510, 1040);
        panel.add(scrollPane);
        Datos();
        panel.revalidate();
        panel.repaint();
    }

    public void limpiarTablaDeDatos() {
        mt.setRowCount(0);
    }

    public void Datos() {
        String ids[] = {"Año", "Deforestaciónn", "Incertidumbres%", "Z_alfa/2   * sigma", "Limite Inferior", "Limite Superior"};
        mt.setColumnIdentifiers(ids);

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

    public void menuGraficas() {
        img("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/deforestation_8992494.png", 700, 700, imagenMG);
        imagenMG.setBounds(750, 100, 700, 700);
        pintarBoton(btnGC, "GRAFICA CIRCULAR", cn3, cn3, cn4);
        pintarBoton(btnGB, "GRAFICA DE BARRAS", cn3, cn3, cn4);
        btnGC.setBounds(600, 900, 300, 60);
        btnGB.setBounds(1300, 900, 300, 60);

        btnGC.addActionListener(e -> {
            limpiarPanel();
            graficaCircular();
            GraficaPastel();
            barraInteraccion();
        });

        panel.add(imagenMG);
        panel.add(btnGC);
        panel.add(btnGB);
    }

    public void barraInteraccion() {

        img("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/blockchain_6298127.png", 70, 70, imagenLI);
        imagenLI.setBounds(0, 0, 70, 70);
        panel.add(imagenLI);
        textoLI.setText("SIMULACION");
        textoLI.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 30));
        textoLI.setBounds(80, 0, 200, 50);
        panel.add(textoLI);
        btnTablaDatos.setBounds(0, 200, 300, 60);
        pintarBoton(btnTablaDatos, "<html>TABLA DE DATOS</html>", cn22, cn22, cn4);
        btnEstadisticas.setBounds(0, 265, 300, 60);
        pintarBoton(btnEstadisticas, "<html>ESTADISTICAS POR BOSQUE</html>", cn22, cn22, cn4);
        btnFactores.setBounds(0, 330, 300, 60);
        pintarBoton(btnFactores, "<html>FACTORES DE DEFORESTACION</html>", cn22, cn22, cn4);
        btnRegresiones.setBounds(0, 395, 300, 60);
        pintarBoton(btnRegresiones, "<html>REGRESIONES</html>", cn22, cn22, cn4);
        btnIndices.setBounds(0, 460, 300, 60);
        pintarBoton(btnIndices, "<html>INDICES DE DEFORESTACION</html>", cn22, cn22, cn4);

        btnMenuP.setBounds(0, 1073, 300, 60);
        pintarBoton(btnMenuP, "<html>MENÚ PRINCIPAL</html>", cn3, cn3, cn4);
        panel.add(btnMenuP);

        btnTablaDatos.addActionListener(e -> {
            limpiarPanel();
            limpiarTablaDeDatos();
            tablaDeDatos();
            barraInteraccion();
        });

        btnEstadisticas.addActionListener(e -> {
            limpiarPanel();
            menuGraficas();
            barraInteraccion();
        });

        btnIndices.addActionListener(e -> {
            limpiarPanel();
            menuSimulacion();
            barraInteraccion();
        });

        btnMenuP.addActionListener(e -> {
            limpiarPanel();
            menuPrincipal();
        });

        panel.add(btnTablaDatos);
        panel.add(btnEstadisticas);
        panel.add(btnFactores);
        panel.add(btnRegresiones);
        panel.add(btnIndices);

        frameLI.setBackground(cn23);
        frameLD.setBackground(cn24);
        frameLI.setBounds(0, 0, 300, 1150);
        frameLD.setBounds(300, 0, 1650, 1150);
        panel.add(frameLI);
        panel.add(frameLD);
    }

    public void img(String ruta, int n1, int n2, JLabel lb) {
        ImageIcon iconoOriginal = new ImageIcon(ruta);
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(n1, n2, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionado = new ImageIcon(imagenEscalada);
        lb.setIcon(iconoRedimensionado);
    }

    public void textField() {
        RoundTextField textField = new RoundTextField(20, 15); // 20 columnas, 15 px de radio
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.BLACK);
        textField.setBounds(500, 200, 300, 40); // Posición y tamaño del JTextField
        panel.add(textField); // Agregar al panel
    }

    public void pintarBoton(JButton nombreBoton, String txt, Color c1, Color c2, Color c3) {
        nombreBoton.setText(txt);
        nombreBoton.setFocusPainted(false);
        nombreBoton.setBackground(c1);
        nombreBoton.setBorder(new LineBorder(c2, 2));
        nombreBoton.setForeground(c3);
    }

    public void estadoInicial() {
        pintarBoton(btnExp, "<html>Explicación del<br>modelo matemático</html>", cn4, cn4, cn5);
        pintarBoton(btnMod, "<html>Modelo de regresión <br>lineal simple</html>", cn4, cn4, cn5);
        pintarBoton(btnObj, "<html>Objetivos del análisis<br>y resultados esperados</html>", cn4, cn4, cn5);
    }

    public void verif() {
        if (!btnExp.isEnabled()) {
            pintarBoton(btnExp, "<html>Explicación del<br>modelo matemático</html>", cn3, cn3, cn4);
        } else if (!btnMod.isEnabled()) {
            pintarBoton(btnMod, "<html>Modelo de regresión <br>lineal simple</html>", cn3, cn3, cn4);
        } else if (!btnObj.isEnabled()) {
            pintarBoton(btnObj, "<html>Objetivos del análisis<br>y resultados esperados</html>", cn3, cn3, cn4);
        }
    }

    public static void main(String[] args) {
        menuSimulacion mn = new menuSimulacion();
        SwingUtilities.invokeLater(mn::ventanaMain);
    }
}
