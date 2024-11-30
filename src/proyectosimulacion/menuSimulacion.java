package proyectosimulacion;

import javax.swing.*;
import java.awt.*;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import org.apache.commons.math4.legacy.stat.StatUtils;
import org.apache.commons.math4.legacy.stat.regression.SimpleRegression;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class menuSimulacion {

    JPanel panel = new JPanel();
    JPanel frameLI = new JPanel();
    JPanel frameLD = new JPanel();
    JPanel panelGrafica = new JPanel();
    JPanel panelBarras = new JPanel();
    JPanel panelFactores = new JPanel();
    JPanel panelVista = new JPanel();
    JPanel panelRegresion = new JPanel();
    JFrame frame = new JFrame();
    JLabel imgMain = new JLabel();
    JLabel imgIngresar = new JLabel();
    JLabel ingresarDaMan = new JLabel();
    JLabel ingresarAnio = new JLabel();
    JLabel ingresarDef = new JLabel();
    JLabel ingresarInser = new JLabel();
    JLabel ingresarZAlfa = new JLabel();
    JLabel ingresarLimInf = new JLabel();
    JLabel ingresarLimSup = new JLabel();
    JLabel ingresarAnioFIn = new JLabel();
    JLabel subirDatos = new JLabel();
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
    JButton btnF1 = new JButton();
    JButton btnF2 = new JButton();
    JButton btnIngresarDatos = new JButton();
    JButton btnMandarDatos = new JButton();
    JButton btnSubirDatos = new JButton();
    JButton btnExplicarAnio = new JButton();
    JButton btnExplicarDeforestacion = new JButton();
    JButton btnExplicarIncertidumbre = new JButton();
    JButton btnExplicarAlfa = new JButton();
    JButton btnExplicarLimInf = new JButton();
    JButton btnExplicarLimSup = new JButton();
    JButton btnExplicarAnioFin = new JButton();
    JButton btnExplicarCsv = new JButton();
    JButton impCsv = new JButton();

    JLabel txtInciciarSImulacion = new JLabel();
    JLabel txtSImulacion = new JLabel();
    JTextArea txtTiempoSimulacion = new JTextArea();
    JLabel imagenLI = new JLabel();
    JLabel textoLI = new JLabel();
    JLabel imagenMG = new JLabel();
    JLabel lblImg1 = new JLabel();
    JLabel LblSim = new JLabel();
    JLabel imgFac = new JLabel();
    JTextArea txtModelo = new JTextArea();
    JTextArea txtModelo2 = new JTextArea();
    JTextArea txtRegresion = new JTextArea();
    JScrollPane jScrollPane1 = new JScrollPane();
    JScrollPane jScrollPane2 = new JScrollPane();

    JTextField inAnio = new JTextField();
    JTextField inDef = new JTextField();
    JTextField inInc = new JTextField();
    JTextField inAlfa = new JTextField();
    JTextField inLimInf = new JTextField();
    JTextField inLimSup = new JTextField();
    JTextField inAnioFin = new JTextField();

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

    private static final String DATA_FILE = "simulacion.csv";
    private DefaultTableModel mt = new DefaultTableModel();
    private JTable tabla;
    private JScrollPane scrollPane;
    private boolean metodoUnoActivo = true;
    private double[] x = {90.5, 0, 15, 10, 15, 28.5, 74, 86, 41, 27.5, 35, 15};
    private double[] y = {10.529, 4.660, 4.660, 4.660, 10.013, 10.013, 10.013, 13.048, 13.048, 13.048, 3.234, 3.234};
    private SimpleRegression sr = new SimpleRegression();

    public void ventanaMain() {
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        panel.setLayout(null);
        panel.setBackground(cn26);
        frame.add(panel);
//        menuPrincipal();
//        simulacion();
        pantallaIngresar();
        frame.setVisible(true);
    }

    public void pantallaIngresar() {
        img("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/sinkhole_10567249.png", 200, 200, imgIngresar);
        imgIngresar.setBounds(10, 10, 200, 200);
        panel.add(imgIngresar);
        ingresarDaMan.setText("INGRESAR DATOS PARA SIMULAR AÑO ESPECIFICO");
        ingresarDaMan.setFont(new Font("Arial", Font.BOLD, 36));
        ingresarDaMan.setForeground(cn4);
        ingresarDaMan.setBounds(585, 20, 900, 200);
        panel.add(ingresarDaMan);
        ingresarAnio.setText("INGRESAR AÑO INICIO:");
        ingresarAnio.setFont(new Font("Arial", Font.BOLD, 20));
        ingresarAnio.setForeground(cn4);
        ingresarAnio.setBounds(450, 250, 300, 200);
        panel.add(ingresarAnio);
        ingresarDef.setText("INGRESAR DEFORESTACION:");
        ingresarDef.setFont(new Font("Arial", Font.BOLD, 20));
        ingresarDef.setForeground(cn4);
        ingresarDef.setBounds(450, 325, 300, 200);
        panel.add(ingresarDef);
        ingresarInser.setText("INGRESAR INCERTIDUMBRES:");
        ingresarInser.setFont(new Font("Arial", Font.BOLD, 20));
        ingresarInser.setForeground(cn4);
        ingresarInser.setBounds(450, 400, 300, 200);
        panel.add(ingresarInser);
        ingresarZAlfa.setText("INGRESAR ALFA:");
        ingresarZAlfa.setFont(new Font("Arial", Font.BOLD, 20));
        ingresarZAlfa.setForeground(cn4);
        ingresarZAlfa.setBounds(450, 475, 300, 200);
        panel.add(ingresarZAlfa);
        ingresarLimInf.setText("INGRESAR LIMITE INFERIOR:");
        ingresarLimInf.setFont(new Font("Arial", Font.BOLD, 20));
        ingresarLimInf.setForeground(cn4);
        ingresarLimInf.setBounds(450, 550, 300, 200);
        panel.add(ingresarLimInf);
        ingresarLimSup.setText("INGRESAR LIMITE SUPERIOR:");
        ingresarLimSup.setFont(new Font("Arial", Font.BOLD, 20));
        ingresarLimSup.setForeground(cn4);
        ingresarLimSup.setBounds(450, 625, 300, 200);
        panel.add(ingresarLimSup);
        ingresarAnioFIn.setText("INGRESAR AÑO FINALIZACIÓN:");
        ingresarAnioFIn.setFont(new Font("Arial", Font.BOLD, 20));
        ingresarAnioFIn.setForeground(cn4);
        ingresarAnioFIn.setBounds(450, 700, 350, 200);
        panel.add(ingresarAnioFIn);
        subirDatos.setText("SUBIR DATOS DESDE CSV");
        subirDatos.setFont(new Font("Arial", Font.BOLD, 20));
        subirDatos.setForeground(cn4);
        subirDatos.setBounds(900, 800, 300, 200);
        panel.add(subirDatos);

        inAnio.setBounds(850, 325, 500, 50);
        panel.add(inAnio);
        inDef.setBounds(850, 400, 500, 50);
        panel.add(inDef);
        inInc.setBounds(850, 475, 500, 50);
        panel.add(inInc);
        inAlfa.setBounds(850, 550, 500, 50);
        panel.add(inAlfa);
        inLimInf.setBounds(850, 625, 500, 50);
        panel.add(inLimInf);
        inLimSup.setBounds(850, 700, 500, 50);
        panel.add(inLimSup);
        inAnioFin.setBounds(850, 775, 500, 50);
        panel.add(inAnioFin);

        btnExplicarAnio.setText("");
        btnExplicarAnio.setToolTipText("Indica el año específico en que se recolectaron los datos o se realizaron las estimaciones. ");
        btnExplicarAnio.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarAnio.setFocusPainted(false);
        btnExplicarAnio.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarAnio.setContentAreaFilled(false);
        btnExplicarAnio.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarAnio);
        btnExplicarAnio.setBounds(1360, 325, 50, 50);
        panel.add(btnExplicarAnio);
        btnExplicarDeforestacion.setText("");
        btnExplicarDeforestacion.setToolTipText("Representa la cantidad de áreas boscosas que se perdieron en un año determinado.(HECTAREAS)");
        btnExplicarDeforestacion.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarDeforestacion.setFocusPainted(false);
        btnExplicarDeforestacion.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarDeforestacion.setContentAreaFilled(false);
        btnExplicarDeforestacion.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarDeforestacion);
        btnExplicarDeforestacion.setBounds(1360, 400, 50, 50);
        panel.add(btnExplicarDeforestacion);
        btnExplicarIncertidumbre.setText("");
        btnExplicarIncertidumbre.setToolTipText("Es una medida de la variabilidad o el margen de error de las estadísticas, indicando qué tan confiables son los datos.");
        btnExplicarIncertidumbre.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarIncertidumbre.setFocusPainted(false);
        btnExplicarIncertidumbre.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarIncertidumbre.setContentAreaFilled(false);
        btnExplicarIncertidumbre.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarIncertidumbre);
        btnExplicarIncertidumbre.setBounds(1360, 475, 50, 50);
        panel.add(btnExplicarIncertidumbre);
        btnExplicarAlfa.setText("");
        btnExplicarAlfa.setToolTipText("El valor crítico de una distribución normal dependiente del nivel de confianza,La desviación estándar se utiliza para calcular intervalos de confianza y evaluar la precisión de las estimaciones.");
        btnExplicarAlfa.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarAlfa.setFocusPainted(false);
        btnExplicarAlfa.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarAlfa.setContentAreaFilled(false);
        btnExplicarAlfa.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarAlfa);
        btnExplicarAlfa.setBounds(1360, 550, 50, 50);
        panel.add(btnExplicarAlfa);
        btnExplicarLimInf.setText("");
        btnExplicarLimInf.setToolTipText("Representa el valor mínimo dentro del intervalo de confianza para las estadísticas de deforestación.");
        btnExplicarLimInf.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarLimInf.setFocusPainted(false);
        btnExplicarLimInf.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarLimInf.setContentAreaFilled(false);
        btnExplicarLimInf.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarLimInf);
        btnExplicarLimInf.setBounds(1360, 625, 50, 50);
        panel.add(btnExplicarLimInf);
        btnExplicarLimSup.setText("");
        btnExplicarLimSup.setToolTipText("Representa el valor máximo dentro del intervalo de confianza, indica el mejor escenario dentro del rango calculado.");
        btnExplicarLimSup.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarLimSup.setFocusPainted(false);
        btnExplicarLimSup.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarLimSup.setContentAreaFilled(false);
        btnExplicarLimSup.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarLimSup);
        btnExplicarLimSup.setBounds(1360, 700, 50, 50);
        panel.add(btnExplicarLimSup);
        btnExplicarAnioFin.setText("");
        btnExplicarAnioFin.setToolTipText("Año de finalizacion de la simulación");
        btnExplicarAnioFin.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarAnioFin.setFocusPainted(false);
        btnExplicarAnioFin.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarAnioFin.setContentAreaFilled(false);
        btnExplicarAnioFin.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarAnioFin);
        btnExplicarAnioFin.setBounds(1360, 775, 50, 50);
        panel.add(btnExplicarAnioFin);
        btnExplicarCsv.setText("");
        btnExplicarCsv.setToolTipText("Importar datos desde un csv,cumpliendo con los campos minimos necesarios.");
        btnExplicarCsv.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarCsv.setFocusPainted(false);
        btnExplicarCsv.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarCsv.setContentAreaFilled(false);
        btnExplicarCsv.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 30, 30, btnExplicarCsv);
        btnExplicarCsv.setBounds(1150, 887, 30, 30);
        panel.add(btnExplicarCsv);

        impCsv.setFocusPainted(false);
        impCsv.setBorder(BorderFactory.createEmptyBorder());
        impCsv.setContentAreaFilled(false);
        impCsv.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/outbox_393799.png", 100, 100, impCsv);
        impCsv.setBounds(990, 967, 100, 100);

        impCsv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Selecciona un archivo CSV");
                int result = fileChooser.showOpenDialog(frame);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    if (selectedFile.getName().endsWith(".csv")) {
                        try {
                            boolean valid = leerYValidarCSV(selectedFile);
                            if (valid) {
                                JOptionPane.showMessageDialog(frame, "El archivo es válido ,procediendo con la simulacion.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                            } else {
                                JOptionPane.showMessageDialog(frame, "El archivo no contiene los campos requeridos.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(frame, "Error al leer el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "Por favor selecciona un archivo CSV.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        panel.add(impCsv);

        RoundButton menuSImmulacion = new RoundButton(20);

        menuSImmulacion.setText("Menú simulación");
        menuSImmulacion.setFont(new Font("Arial", Font.BOLD, 16));
        menuSImmulacion.setForeground(cn5);
        menuSImmulacion.setBackground(cn11);
        menuSImmulacion.setBounds(20, 1050, 300, 60);
        panel.add(menuSImmulacion);

        RoundButton btnEnviarSimulacion = new RoundButton(20);

        btnEnviarSimulacion.setText("INICIAR SIMULACIÓN");
        btnEnviarSimulacion.setFont(new Font("Arial", Font.BOLD, 20));
        btnEnviarSimulacion.setForeground(cn5);
        btnEnviarSimulacion.setBackground(cn11);
        btnEnviarSimulacion.setBounds(1520, 510, 300, 60);
        panel.add(btnEnviarSimulacion);

        btnEnviarSimulacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panel.removeAll();
                String anio = inAnio.getText();
                String deforestacion = inDef.getText();
                String inc = inInc.getText();
                String alfa = inAlfa.getText();
                String limInf = inLimInf.getText();
                String limSup = inLimSup.getText();
                String anioFin = inAnioFin.getText();
                iniciarSimulacion(anio, anioFin, deforestacion, inc, alfa, limInf, limSup);
                limpiarPanel();
                
                tablaDeDatos();
                barraInteraccion();
            }
        });

        menuSImmulacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                simulacion();
            }
        });
    }

    public void iniciarSimulacion(String anioInicio, String anioFinal, String deforestacion, String inc, String alfa, String limInf, String limSup) {
        try {
            int anioIni = Integer.parseInt(anioInicio);
            int anioFin = Integer.parseInt(anioFinal);
            double def = Double.parseDouble(deforestacion);
            double incertidumbre = Double.parseDouble(inc);
            double alpha = Double.parseDouble(alfa);
            double limiteInferior = Double.parseDouble(limInf);
            double limiteSuperior = Double.parseDouble(limSup);

            // Validar datos
            if (anioIni > anioFin) {
                JOptionPane.showMessageDialog(null, "El año inicial no puede ser mayor que el año final.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Especificar ruta del archivo (cambia según tu preferencia)
            String rutaDirectorio = "/home/prome/NetBeansProjects/proyectoSimulacion/"; // Cambia a la ruta deseada
            String nombreArchivo = "simulacion.csv";
            String rutaCompleta = rutaDirectorio + nombreArchivo;

            // Crear directorio si no existe
            java.io.File directorio = new java.io.File(rutaDirectorio);
            if (!directorio.exists()) {
                directorio.mkdirs();
            }

            // Crear archivo CSV (sobrescribe si ya existe)
            FileWriter fileWriter = new FileWriter(rutaCompleta, false); // 'false' para sobrescribir
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Escribir encabezado en el archivo CSV
            printWriter.println("Año,Deforestación,Incertidumbre,Alfa,Límite Inferior,Límite Superior");

            // Generar simulación y escribir datos año por año
            for (int anio = anioIni; anio <= anioFin; anio++) {
                double defAnual = def + (Math.random() * incertidumbre) - (incertidumbre / 2);
                double limInfAnual = limiteInferior - (alpha * Math.random());
                double limSupAnual = limiteSuperior + (alpha * Math.random());

                // Escribir línea en el archivo
                printWriter.printf("%d,%.2f,%.2f,%.2f,%.2f,%.2f%n", anio, defAnual, incertidumbre, alpha, limInfAnual, limSupAnual);
            }

            // Cerrar archivo
            printWriter.close();
            JOptionPane.showMessageDialog(null, "Simulación completada. Archivo creado: " + rutaCompleta, "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato de los datos. Verifique las entradas.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo CSV: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean leerYValidarCSV(File file) throws IOException {
        String[] camposRequeridos = {"año", "deforestacion", "incertidumbre(%)", "Z_alfa/2*sigma", "limite_inferior", "limite_superior"};
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String primeraLinea = br.readLine();
            if (primeraLinea == null) {
                return false; // Archivo vacío
            }
            String[] campos = primeraLinea.split(",");
            List<String> encabezadosNormalizados = Arrays.stream(campos)
                    .map(String::trim) // Elimina espacios alrededor
                    .map(String::toLowerCase) // Convierte a minúsculas
                    .toList();
            List<String> camposRequeridosNormalizados = Arrays.stream(camposRequeridos)
                    .map(String::trim)
                    .map(String::toLowerCase)
                    .toList();
            return encabezadosNormalizados.containsAll(camposRequeridosNormalizados);
        }
    }

    public void buscarDatosDesdeCsv(String rutaCsv, int anioBuscado) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(rutaCsv));
            String linea;

            // Saltar encabezado
            reader.readLine();

            while ((linea = reader.readLine()) != null) {
                // Dividir línea por comas
                String[] datos = linea.split(",");

                // Verificar que los datos sean válidos
                if (datos.length < 6) {
                    continue;
                }

                // Parsear los valores
                int anio = Integer.parseInt(datos[0].trim());
                if (anio == anioBuscado) {
                    double deforestacion = Double.parseDouble(datos[1].trim());
                    double incertidumbres = Double.parseDouble(datos[2].trim());
                    double zAlfa2Sigma = Double.parseDouble(datos[3].trim());
                    double limiteInferior = Double.parseDouble(datos[4].trim());
                    double limiteSuperior = Double.parseDouble(datos[5].trim());

                    // Mostrar los datos en consola o manipularlos según necesites
                    System.out.println("Datos encontrados para el año " + anioBuscado + ":");
                    System.out.println("Deforestación: " + deforestacion);
                    System.out.println("Incertidumbres: " + incertidumbres);
                    System.out.println("Z_Alfa/2 * Sigma: " + zAlfa2Sigma);
                    System.out.println("Límite Inferior: " + limiteInferior);
                    System.out.println("Límite Superior: " + limiteSuperior);

                    // Puedes conectar esto con elementos de la interfaz gráfica
                    txtTiempoSimulacion.setText("Año: " + anio + "\nDeforestación: " + deforestacion
                            + "\nIncertidumbres: " + incertidumbres
                            + "\nLímite Inferior: " + limiteInferior
                            + "\nLímite Superior: " + limiteSuperior);

                    // Salir del bucle tras encontrar el año
                    return;
                }
            }
            // Si no se encontró el año
            System.out.println("Año " + anioBuscado + " no encontrado en el archivo CSV.");
            txtTiempoSimulacion.setText("Año " + anioBuscado + " no encontrado en el archivo CSV.");
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            txtTiempoSimulacion.setText("Error al leer el archivo CSV o procesar los datos.");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public SimulacionDatos obtenerDatosSimulacion(JScrollBar yearScrollBar, RoundTextField txtInput) {
        int anioSeleccionado = yearScrollBar.getValue();
        int aniosASimular;
        try {
            aniosASimular = Integer.parseInt(txtInput.getText());
        } catch (NumberFormatException e) {
            aniosASimular = 0; // Valor predeterminado en caso de error
        }
        return new SimulacionDatos(anioSeleccionado, aniosASimular);
    }

    public void simulacion() {
        JLabel aInicio = new JLabel();
        JLabel aFin = new JLabel();
        JLabel aActual = new JLabel("2001");
        JLabel aCalculado = new JLabel();
        RoundButton btnIniciarSimulacion = new RoundButton(20);

        txtInciciarSImulacion.setText("SELECCIONE EL AÑO DE INICIO DE LA SIMULACIÓN");
        txtInciciarSImulacion.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 23));
        txtInciciarSImulacion.setForeground(cn4);
        txtInciciarSImulacion.setBounds(1050, 30, 900, 60);
        panel.add(txtInciciarSImulacion);

        txtSImulacion.setText("AÑOS A SIMULAR:");
        txtSImulacion.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 20));
        txtSImulacion.setForeground(cn4);
        txtSImulacion.setBounds(1090, 285, 900, 60);
        panel.add(txtSImulacion);

        txtTiempoSimulacion.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 20));
        txtTiempoSimulacion.setBounds(995, 420, 400, 100);
        txtTiempoSimulacion.setBackground(inv);
        txtTiempoSimulacion.setForeground(cn4);
        txtTiempoSimulacion.setEditable(false);
        txtTiempoSimulacion.setCaretColor(inv);
        panel.add(txtTiempoSimulacion);

        aInicio.setText("2001");
        aInicio.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 23));
        aInicio.setBounds(993, 115, 100, 100);
        aInicio.setForeground(cn4);
        panel.add(aInicio);

        aFin.setText("2021");
        aFin.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 23));
        aFin.setBounds(1685, 115, 100, 100);
        aFin.setForeground(cn4);
        panel.add(aFin);

        btnIngresarDatos.setText("INGRESAR DATOS MANUALMENTE");
        btnIngresarDatos.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 10));
        btnIngresarDatos.setBounds(615, 45, 200, 60);
        btnIngresarDatos.setForeground(cn4);
        btnIngresarDatos.setBackground(inv);
        panel.add(btnIngresarDatos);

        RoundTextField txtInput = new RoundTextField(1, 30); // 1 columna, radio 30
        txtInput.setFont(new Font("Arial", Font.PLAIN, 20));
        txtInput.setForeground(cn4); // Letra blanca
        txtInput.setBackground(inv); // Fondo negro
        txtInput.setCaretColor(cn4); // Cursor blanco
        txtInput.setHorizontalAlignment(JTextField.CENTER);
        txtInput.setBounds(1330, 285, 100, 60);
        panel.add(txtInput);

        aActual.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 23));
        aActual.setBounds(1350, 200, 100, 30); // Ubicación inicial debajo de la scrollbar
        aActual.setForeground(cn4);
        panel.add(aActual);

        JScrollBar yearScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 2001, 1, 2001, 2022);
        yearScrollBar.setUnitIncrement(1);
        yearScrollBar.setBounds(1070, 150, 600, 30);

        // Cambiar estilo de la scrollbar
        yearScrollBar.setBackground(Color.GRAY);
        yearScrollBar.setForeground(cn4);

        yearScrollBar.setUI(new javax.swing.plaf.basic.BasicScrollBarUI() {
            @Override
            protected JButton createDecreaseButton(int orientation) {
                JButton button = super.createDecreaseButton(orientation);
                button.setPreferredSize(new Dimension(15, 15)); // Tamaño mínimo visible
                button.setBackground(Color.GRAY); // Color del botón
                return button;
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                JButton button = super.createIncreaseButton(orientation);
                button.setPreferredSize(new Dimension(15, 15)); // Tamaño mínimo visible
                button.setBackground(Color.GRAY); // Color del botón
                return button;
            }
        });

        // Listener para actualizar valores dinámicamente
        Runnable actualizarCalculo = () -> {
            try {
                int inputValue = Integer.parseInt(txtInput.getText());
                int selectedYear = yearScrollBar.getValue();
                int suma = inputValue + selectedYear;
                txtTiempoSimulacion.setText("SE SIMULARA HASTA EL AÑO:");
                aCalculado.setText(String.valueOf(suma));
            } catch (NumberFormatException ex) {
                aCalculado.setText("");
            }
        };

        yearScrollBar.addAdjustmentListener(e -> {
            int selectedYear = yearScrollBar.getValue();
            aActual.setText(String.valueOf(selectedYear)); // Actualiza el texto del JLabel
            actualizarCalculo.run();
        });

        txtInput.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                actualizarCalculo.run();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                actualizarCalculo.run();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                actualizarCalculo.run();
            }
        });

        // Configuración visual de aCalculado
        aCalculado.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 23));
        aCalculado.setForeground(cn4);
        aCalculado.setBounds(1352, 385, 600, 100);
        panel.add(aCalculado);

        // Botón de inicio de simulación
        pintarBoton(btnIniciarSimulacion, "INICIAR SIMULACION", cn22, cn22, cn4);
        btnIniciarSimulacion.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 23));
        btnIniciarSimulacion.setBounds(1230, 500, 300, 60);
        panel.add(btnIniciarSimulacion);

        // Imagen de fondo
        img("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/18157321.png", 1920, 1150, LblSim);
        LblSim.setBounds(0, 0, 1920, 1150);
        panel.add(LblSim);

        panel.add(yearScrollBar);
        panel.revalidate();
        panel.repaint();

        btnIniciarSimulacion.addActionListener(e -> {
            SimulacionDatos datos = obtenerDatosSimulacion(yearScrollBar, txtInput);
            buscarDatosDesdeCsv("/home/prome/NetBeansProjects/proyectoSimulacion/Datos.csv", datos.getAnioSeleccionado());
            realizarSimulacionYCrearCsv(
                    "/home/prome/NetBeansProjects/proyectoSimulacion/Datos.csv",
                    "/home/prome/NetBeansProjects/proyectoSimulacion/simulacion.csv",
                    datos.getAnioSeleccionado(),
                    datos.getAniosASimular()
            );
            limpiarPanel();
            tablaDeDatos();
            barraInteraccion();
        });
    }

    public void realizarSimulacionYCrearCsv(String rutaCsv, String rutaSalida, int anioSeleccionado, int aniosASimular) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            // Leer el archivo CSV
            reader = new BufferedReader(new FileReader(rutaCsv));
            String linea;
            String[] encabezado = null;
            String[] datosIniciales = null;

            // Leer encabezado
            if ((linea = reader.readLine()) != null) {
                encabezado = linea.split(",");
            }

            // Buscar el año seleccionado
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (Integer.parseInt(datos[0].trim()) == anioSeleccionado) {
                    datosIniciales = datos;
                    break;
                }
            }

            // Validar si se encontró el año
            if (datosIniciales == null) {
                System.out.println("Año seleccionado no encontrado en el archivo CSV.");
                return;
            }

            // Crear archivo CSV de salida
            writer = new BufferedWriter(new FileWriter(rutaSalida));
            writer.write(String.join(",", encabezado)); // Escribir encabezado
            writer.newLine();

            // Variables iniciales para la simulación
            double deforestacion = Double.parseDouble(datosIniciales[1].trim());
            double incertidumbres = Double.parseDouble(datosIniciales[2].trim());
            double zAlfa2Sigma = Double.parseDouble(datosIniciales[3].trim());
            double limiteInferior = Double.parseDouble(datosIniciales[4].trim());
            double limiteSuperior = Double.parseDouble(datosIniciales[5].trim());

            // Generar datos simulados para cada año
            for (int i = 0; i < aniosASimular; i++) {
                anioSeleccionado++;

                // Ejemplo de simulación: incrementar los valores en un porcentaje fijo
                deforestacion *= 1.02; // Incremento del 2%
                incertidumbres *= 1.01; // Incremento del 1%
                zAlfa2Sigma *= 1.005; // Incremento del 0.5%
                limiteInferior = deforestacion - incertidumbres;
                limiteSuperior = deforestacion + incertidumbres;

                // Escribir línea en el archivo CSV
                String lineaSimulada = anioSeleccionado + ","
                        + deforestacion + ","
                        + incertidumbres + ","
                        + zAlfa2Sigma + ","
                        + limiteInferior + ","
                        + limiteSuperior;
                writer.write(lineaSimulada);
                writer.newLine();
            }

            System.out.println("Simulación completada. Datos guardados en: " + rutaSalida);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Error durante la simulación o al escribir el archivo CSV.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void actualizarCalculo(JScrollBar yearScrollBar, RoundTextField txtInput, JLabel aCalculado) {
        try {
            int anioSeleccionado = yearScrollBar.getValue();
            int aniosASimular = Integer.parseInt(txtInput.getText());
            int suma = anioSeleccionado + aniosASimular;
            aCalculado.setText(String.valueOf(suma));
        } catch (NumberFormatException ex) {
            aCalculado.setText("");
        }
    }

    public void Regresion() {
        frame.setTitle("REGRESION LINEAL");
        try {
            initializeData();

            XYSeries series = createDataset();
            JFreeChart chart = createChart(series);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(panelRegresion.getWidth(), panelRegresion.getHeight()));

            panelRegresion.removeAll();  // Limpiar jPanel1
            panelRegresion.setLayout(new BorderLayout());  // Establecer un diseño de borde
            panelRegresion.add(chartPanel, BorderLayout.CENTER);
            panelRegresion.validate();  // Validar el panel para que se renderice correctamente

            showResults();  // Muestra los resultados si es necesario en otro lugar

        } catch (Exception e) {
            e.printStackTrace();
        }
        panelRegresion.setBounds(450, 20, 1320, 790);
        panel.add(panelRegresion);
    }

    private void initializeData() {
        if (x.length != y.length) {
            throw new IllegalArgumentException("Arrays 'x' and 'y' must have the same length.");
        }

        for (int i = 0; i < x.length; i++) {
            sr.addData(x[i], y[i]);
        }
    }

    private XYSeries createDataset() {
        XYSeries series = new XYSeries("Datos");
        for (int i = 0; i < x.length; i++) {
            series.add(x[i], y[i]);
        }
        return series;
    }

    private JFreeChart createChart(XYSeries series) {
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createScatterPlot(
                "", "X", "Y", dataset, PlotOrientation.VERTICAL, true, true, false);

        double[] yc = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            yc[i] = sr.predict(x[i]);
        }

        XYSeries regressionSeries = new XYSeries("Regresion");
        for (int i = 0; i < x.length; i++) {
            regressionSeries.add(x[i], yc[i]);
        }

        dataset.addSeries(regressionSeries);

        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setRenderer(1, plot.getRenderer(0));  // Copia el renderer del gráfico de dispersión
        plot.setDataset(1, dataset);  // Agrega el conjunto de datos de regresión
        plot.mapDatasetToRangeAxis(1, 0);  // Mapea el conjunto de datos de regresión al eje y derecho

        ValueAxis yAxis = new NumberAxis("Y");
        plot.setRangeAxis(1, yAxis);  // Agrega el eje y derecho
        plot.setRangeAxisLocation(1, AxisLocation.BOTTOM_OR_RIGHT);

        return chart;
    }

    private void showResults() {
        String sp = " ".repeat(32);
        String sp1 = " ".repeat(10);
        String sp2 = " ".repeat(5);

        txtRegresion.setText("");
        txtRegresion.setFont(new Font("Arial", Font.PLAIN, 20));
        txtRegresion.setLineWrap(true);
        txtRegresion.append("   DATOS LEIDOS" + sp + "ORDENADAS AL ORIGEN" + sp + "PENDIENTE" + sp + sp2 + "        R2" + sp + sp2.repeat(3) + "VALOR MÍNIMO\n\n");
        txtRegresion.append(sp1 + "    " + sr.getN() + sp + sp1 + sp2 + "    " + sr.getIntercept() + sp1.repeat(2) + sp2 + "   " + sr.getSlope() + sp1 + sp2 + "   " + sr.getRSquare() + sp2.repeat(7) + "    " + StatUtils.min(y) + "\n\n");

        txtRegresion.append(" VALOR MÁXIMO" + sp1.repeat(2) + sp2.repeat(3) + "   VALOR PROMEDIO" + sp2.repeat(6) + " VALOR VARIANZA" + sp2.repeat(4) + "    VALOR GEOMETRICO" + sp2.repeat(6) + "VALOR SUMA" + "\n\n");
        txtRegresion.append(sp2 + "     " + StatUtils.max(y) + sp + sp2.repeat(3) + StatUtils.mean(y) + sp2.repeat(5) + "   " + StatUtils.variance(y) + sp1.repeat(2) + "  " + StatUtils.geometricMean(y) + sp2.repeat(5) + StatUtils.sum(y) + "\n\n");
        txtRegresion.append(sp1.repeat(13) + "     VALOR PRODUCTO\n\n" + sp.repeat(4) + "   " + StatUtils.product(y));
        txtRegresion.setBounds(385, 815, 1580, 315);
        txtRegresion.setEditable(false);
        txtRegresion.setForeground(cn4);
        txtRegresion.setBackground(inv);
        panel.add(txtRegresion);

    }

    public void menuFactores() {

        img("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/deforest_9568180.png", 160, 160, imgFac);
        imgFac.setBounds(1015, 20, 160, 160);
        panel.add(imgFac);

        frame.setTitle("FACTORES DE DEFORESTACIÓN PRIMARIOS");
//        btnF1.setBounds(380, 1000, 240, 100);
        btnF2.setBounds(1600, 45, 240, 100);
//        pintarBoton(btnF1, "FACTORES PRIMARIOS", cn3, cn3, cn4);
        pintarBoton(btnF2, "FACTORES SECUNDARIOS", cn3, cn3, cn4);

        panelVista.setBounds(380, 200, 1460, 850);
        panel.add(panelVista);
        primarios();
        panel.add(btnF1);
        panel.add(btnF2);

        btnF2.addActionListener(e -> {
            if (metodoUnoActivo) {
                frame.setTitle("FACTORES  DE DEFORESTACIÓN PRIMARIOS");
                primarios();
            } else {
                frame.setTitle("FACTORES  DE DEFORESTACIÓN SECUNDARIOS");
                secundarios();
            }
            metodoUnoActivo = !metodoUnoActivo;
            barraInteraccion();
        });
//        btnF1.addActionListener(e -> {
//        });
    }

    public void secundarios() {
        panelVista.removeAll();
        btnF2.setText("FACTORES PRIMARIOS");
        double n1 = 0;
        double n2 = 65;
        double n3 = 42;
        double n4 = 29;
        double n5 = 0;
        double n6 = 5;
        double n7 = 45.5;
        double n8 = 33;
        double n9 = 14.5;

        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue(n1, "ESTADISTICA", "factor socioeconomico");
        datos.setValue(n2, "ESTADISTICA", "necesidades dendroenergeticas ");
        datos.setValue(n3, "ESTADISTICA", "seguridad alimentaria ");
        datos.setValue(n4, "ESTADISTICA", "falta demedios de vida alternativos en zona rural");
        datos.setValue(n5, "ESTADISTICA", "servicios de extencion deficientes");
        datos.setValue(n6, "ESTADISTICA", "sin demarcacion de limites ");
        datos.setValue(n7, "ESTADISTICA", "manejo forestal insostenible ");
        datos.setValue(n8, "ESTADISTICA", "mala implementacion de leyes ");
        datos.setValue(n9, "ESTADISTICA", "presion politica sobre funcionarios forestales");

        JFreeChart grafico_barras = ChartFactory.createBarChart3D(
                "FACTORES SECUNDARIOS",
                "TIPO",
                "PORCENTAJE",
                datos,
                PlotOrientation.HORIZONTAL,
                true,
                true,
                false
        );

        ChartPanel chartPanel = new ChartPanel(grafico_barras);
        chartPanel.setMouseWheelEnabled(true);

        // Usar un layout para que el ChartPanel ocupe todo el espacio
        panelVista.setLayout(new BorderLayout());
        panelVista.add(chartPanel, BorderLayout.CENTER); // Cambiar a BorderLayout.CENTER

        panelVista.revalidate(); // Revalidar el panel
        panelVista.repaint(); // Repaint para actualizar la vista
    }

    public void primarios() {

        btnF2.setText("FACTORES SECUNDARIOS");
        panelVista.removeAll();
        double n1 = 90.5;
        double n2 = 0;
        double n3 = 15;
        double n4 = 10;
        double n5 = 15;
        double n6 = 28.5;
        double n7 = 74;
        double n8 = 86;
        double n9 = 41;
        double n10 = 27.5;
        double n11 = 35;
        double n12 = 15;

        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        datos.setValue(n1, "ESTADISTICA", "factor socioeconomico");
        datos.setValue(n2, "ESTADISTICA", "extraccion insostenible de leña para combustible");
        datos.setValue(n3, "ESTADISTICA", "extraccion de madera insostenible");
        datos.setValue(n4, "ESTADISTICA", "incendios forestales (intencionales)");
        datos.setValue(n5, "ESTADISTICA", "incendios forestales naturales");
        datos.setValue(n6, "ESTADISTICA", "desarrollo de infraestructura ");
        datos.setValue(n7, "ESTADISTICA", "pastero de ganado libre ");
        datos.setValue(n8, "ESTADISTICA", "expansion urbana y rural ");
        datos.setValue(n9, "ESTADISTICA", "expansion agricula de subsistencia  ");
        datos.setValue(n10, "ESTADISTICA", "deslizamiento de tierra  ");
        datos.setValue(n11, "ESTADISTICA", "plagas");
        datos.setValue(n12, "ESTADISTICA", "gobernanza debil");

        JFreeChart grafico_barras = ChartFactory.createBarChart3D(
                "FACTORES PRIMARIOS",
                "TIPO",
                "PORCENTAJE",
                datos,
                PlotOrientation.HORIZONTAL,
                true,
                true,
                false
        );

        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(1000, 500));

        panelVista.setLayout(new BorderLayout());
        panelVista.add(panel, BorderLayout.CENTER);

        panelVista.repaint();
        panelVista.revalidate();
    }

    public void deforestacion() {
        panelBarras.removeAll();
        double n1 = 17933;
        double n2 = 17933;
        double n3 = 17933;
        double n4 = 15899;
        double n5 = 15899;
        double n6 = 15899;
        double n7 = 22626;
        double n8 = 22626;
        double n9 = 22626;
        double n10 = 18214;
        double n11 = 18214;
        double n12 = 18214;
        double n13 = 18770;
        double n14 = 18770;
        double n15 = 18770;
        double n16 = 20520;
        double n17 = 20520;
        double n18 = 20520;
        double n19 = 10613;
        double n20 = 10613;
        double n21 = 10613;

        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        datos.setValue(n1, "1", "2001");
        datos.setValue(n2, "2", "2002");
        datos.setValue(n3, "3", "2003");
        datos.setValue(n4, "4", "2004");
        datos.setValue(n5, "5", "2005");
        datos.setValue(n6, "6", "2006");
        datos.setValue(n7, "7", "2007");
        datos.setValue(n8, "8", "2008");
        datos.setValue(n9, "9", "2009");
        datos.setValue(n10, "10", "2010");
        datos.setValue(n11, "11", "2011");
        datos.setValue(n12, "12", "2012");
        datos.setValue(n13, "13", "2013");
        datos.setValue(n14, "14", "2014");
        datos.setValue(n15, "15", "2015");
        datos.setValue(n16, "16", "2016");
        datos.setValue(n17, "17", "2017");
        datos.setValue(n18, "18", "2018");
        datos.setValue(n19, "19", "2019");
        datos.setValue(n20, "20", "2020");
        datos.setValue(n21, "21", "2021");

        // Crear un gráfico de barras
        JFreeChart grafico_barras = ChartFactory.createBarChart3D(
                "OAXACA",
                "PERIODO 2001-2021",
                "SUPERFICIE DEFORESTADA",
                datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);

        // Configurar el tamaño dinámico
        panel.setPreferredSize(new Dimension(panelBarras.getWidth(), panelBarras.getHeight())); // Ajustar al tamaño del contenedor

        // Asegurarse de que el panel del gráfico se ajuste al tamaño disponible
        panel.setSize(panelBarras.getWidth(), panelBarras.getHeight());
        panel.setMinimumSize(new Dimension(200, 100));  // Tamaño mínimo si el contenedor es pequeño

        panelBarras.setLayout(new BorderLayout());
        panelBarras.removeAll();  // Limpiar el panel actual
        panelBarras.add(panel, BorderLayout.CENTER);

        // Asegúrate de que el panelGrafica se redimensione
        panelBarras.revalidate();
        panelBarras.repaint();
    }

    public void ecorregion() {
        panelBarras.removeAll();
        double n1 = 5767;
        double n2 = 7454;
        double n3 = 4575;

        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        datos.setValue(n1, "SELVAS", "CALIDO-HUMEDAS");
        datos.setValue(n2, "SELVAS1", "CALIDO-SECAS");
        datos.setValue(n3, "SIERRAS", "TEMPLADAS");

        // Crear un gráfico de barras
        JFreeChart grafico_barras = ChartFactory.createBarChart3D(
                "DEFORESTACION(HA/AÑO)",
                "ECORREGION",
                "HAS",
                datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);

        panel.setPreferredSize(new Dimension(panelBarras.getWidth(), panelBarras.getHeight())); // Ajustar al tamaño del contenedor

        panel.setSize(panelBarras.getWidth(), panelBarras.getHeight());
        panel.setMinimumSize(new Dimension(200, 100));  // Tamaño mínimo si el contenedor es pequeño

        panelBarras.setLayout(new BorderLayout());
        panelBarras.add(panel, BorderLayout.CENTER);

        panelBarras.revalidate();
        panelBarras.repaint();
    }

    public void menuGraficaBarras() {

        btnGB1.setBounds(350, 50, 200, 60);
        btnGB2.setBounds(1665, 50, 200, 60);
        btnGB3.setBounds(380, 1000, 200, 60);
        btnGB4.setBounds(960, 1000, 250, 60);
        btnGB5.setBounds(1590, 1000, 250, 60);
        pintarBoton(btnGB1, "ATRAS", cn3, cn3, cn4);
        pintarBoton(btnGB2, "GRAFICA DE PASTEL", cn3, cn3, cn4);
        pintarBoton(btnGB3, "TIPOS DE BOSQUE", cn3, cn3, cn4);
        pintarBoton(btnGB4, "ECORREGION", cn3, cn3, cn4);
        pintarBoton(btnGB5, "DEFORESTACION", cn3, cn3, cn4);

        panel.add(btnGB1);
        panel.add(btnGB2);
        panel.add(btnGB3);
        panel.add(btnGB4);
        panel.add(btnGB5);

        panelBarras.setBounds(380, 170, 1460, 780); // Posición y tamaño
        panel.add(panelBarras); // Agregar al panel principal
        GraficaBarras();
        btnGB1.addActionListener(e -> {
            limpiarPanel();
            menuGraficas();
            barraInteraccion();
        });
        btnGB2.addActionListener(e -> {
            limpiarPanel();
            panel.removeAll();
            graficaCircular();
            barraInteraccion();
        });
        btnGB3.addActionListener(e -> {
            GraficaBarras();
            barraInteraccionD();
        });
        btnGB4.addActionListener(e -> {
            ecorregion();
            barraInteraccionD();
        });
        btnGB5.addActionListener(e -> {
            deforestacion();
            barraInteraccionD();
        });
    }

    public void GraficaBarras() {
        panelBarras.removeAll();
        double n1 = 15.5;
        double n2 = 7.1;
        double n3 = 25.75;
        double n4 = 9.98;
        double n5 = 18.67;
        double n6 = 23;

        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        datos.setValue(n1, "Bosque", "Encino");
        datos.setValue(n2, "Bosque", "Encino-pino");
        datos.setValue(n3, "Bosque", "Oyamel");
        datos.setValue(n4, "Bosque", "Pino");
        datos.setValue(n5, "Bosque", "Pino-encino");
        datos.setValue(n6, "Bosque", "Mesofolio de montaña");

        JFreeChart grafico_barras = ChartFactory.createBarChart3D(
                "SIERRA NORTE",
                "TIPO DE BOSQUE",
                "PORCENTAJE",
                datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400, 200));

        panelBarras.setLayout(new BorderLayout());
        panelBarras.add(panel, BorderLayout.CENTER);
        Dimension size = panelBarras.getSize();
        panel.setPreferredSize(new Dimension((int) size.getWidth(), (int) size.getHeight()));

        CategoryPlot plot = grafico_barras.getCategoryPlot();
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
                CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 4.0) // 45 grados
        );
        domainAxis.setTickLabelFont(new Font("SansSerif", Font.PLAIN, 14)); // Reducir a 8
        panel.repaint();

        panelBarras.revalidate();
        panelBarras.repaint();
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
            documentacionExplicacion();
            barraInteraccionD();
        });

        btnObj.addActionListener(e -> {
            documentacionObjetivos();
            barraInteraccionD();
        });

        btnMod.addActionListener(e -> {
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
        btnGCB1.addActionListener(e -> {
            limpiarPanel();
            menuGraficas();
            barraInteraccion();
        });
        btnGCB2.addActionListener(e -> {
            limpiarPanel();
            menuGraficaBarras();
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
            simulacion();
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
        frame.setTitle("TABLA DE DATOS");
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
        frame.setTitle("ESTADISTICAS POR BOSQUE");
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
        btnGB.addActionListener(e -> {
            limpiarPanel();
            menuGraficaBarras();
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
        textoLI.setText("SIMULACIÓN");
        textoLI.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 30));
        textoLI.setBounds(80, 0, 200, 50);
        panel.add(textoLI);
        btnTablaDatos.setBounds(0, 200, 300, 60);
        pintarBoton(btnTablaDatos, "<html>TABLA DE DATOS</html>", cn22, cn22, cn4);
        btnEstadisticas.setBounds(0, 265, 300, 60);
        pintarBoton(btnEstadisticas, "<html><center>ESTADISTICAS<br>POR BOSQUE</center></html>", cn22, cn22, cn4);
        btnFactores.setBounds(0, 330, 300, 60);
        pintarBoton(btnFactores, "<html><center>FACTORES DE<br>DEFORESTACION</center></html>", cn22, cn22, cn4);
        btnRegresiones.setBounds(0, 395, 300, 60);
        pintarBoton(btnRegresiones, "<html><center>MODELO DE <br>REGRESION LINEAL</center></html>", cn22, cn22, cn4);

        btnMenuP.setBounds(0, 1073, 300, 60);
        pintarBoton(btnMenuP, "<html>MENÚ PRINCIPAL</html>", cn3, cn3, cn4);
        panel.add(btnMenuP);

        btnTablaDatos.addActionListener(e -> {
//            menuGraficas();
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
        btnFactores.addActionListener(e -> {
            limpiarPanel();
            menuFactores();
            barraInteraccion();
        });
        btnRegresiones.addActionListener(e -> {
            limpiarPanel();
            Regresion();
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

    public void imgB(String ruta, int n1, int n2, JButton lb) {
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
