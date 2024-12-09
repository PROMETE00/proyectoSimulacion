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
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
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
    JButton exp1 = new JButton();
    JButton exp2 = new JButton();
    JButton exp3 = new JButton();
    JButton exp4 = new JButton();
    JButton exp5 = new JButton();
    JButton exp6 = new JButton();
    JButton exp7 = new JButton();
    JButton exp8 = new JButton();
    JButton exp9 = new JButton();
    JButton exp10 = new JButton();
    JButton exp11 = new JButton();
    RoundButton btnMSim = new RoundButton(20);
    RoundButton btnMDoc = new RoundButton(20);
    RoundButton btnTablaDatos = new RoundButton(20);
    RoundButton btnEstadisticas = new RoundButton(20);
    RoundButton btnFactores = new RoundButton(20);
    RoundButton btnRegresiones = new RoundButton(20);
    JButton btnIndices = new JButton();
    RoundButton btnExp = new RoundButton(20);
    RoundButton btnMod = new RoundButton(20);
    RoundButton btnObj = new RoundButton(20);
    RoundButton btnMenuP = new RoundButton(20);
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
    RoundButton btnF2 = new RoundButton(20);
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
    JButton ExpCsv = new JButton();
    JButton botonAnio = new JButton();
    JButton botonDeforestacion = new JButton();
    JButton botonIncertidumbre = new JButton();
    JButton botonZAlpha = new JButton();
    JButton botonLimiteInferior = new JButton();
    JButton botonLimiteSuperior = new JButton();
    JLabel txtExp1 = new JLabel();
    JLabel txtExp2 = new JLabel();
    JLabel txtExp3 = new JLabel();
    JLabel txtExp4 = new JLabel();
    JLabel txtExp5 = new JLabel();
    JLabel txtExp6 = new JLabel();
    JLabel txtTab = new JLabel();
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

    JTextField inAnio1 = new JTextField();
    JTextField inDef1 = new JTextField();
    JTextField inDe1 = new JTextField();
    JTextField inInc1 = new JTextField();
    JTextField inAlfa1 = new JTextField();
    JTextField inLimInf1 = new JTextField();
    JTextField inLimSup1 = new JTextField();

    JTextField inAnio2 = new JTextField();
    JTextField inDef2 = new JTextField();
    JTextField inInc2 = new JTextField();
    JTextField inAlfa2 = new JTextField();
    JTextField inLimInf2 = new JTextField();
    JTextField inLimSup2 = new JTextField();

    JTextField inAnio3 = new JTextField();
    JTextField inDef3 = new JTextField();
    JTextField inInc3 = new JTextField();
    JTextField inAlfa3 = new JTextField();
    JTextField inLimInf3 = new JTextField();
    JTextField inLimSup3 = new JTextField();

    JTextField inAnio4 = new JTextField();
    JTextField inDef4 = new JTextField();
    JTextField inInc4 = new JTextField();
    JTextField inAlfa4 = new JTextField();
    JTextField inLimInf4 = new JTextField();
    JTextField inLimSup4 = new JTextField();

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
    double randomValue = 0.1 + (Math.random() * (10.0 - 1.0));
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
        menuPrincipal();
//        simulacion();
//        pantallaIngresar();
//        Regresion("/home/prome/NetBeansProjects/proyectoSimulacion/simulacion.csv");
//        tablaDeDatos();
//        barraInteraccion();
        frame.setVisible(true);
    }

    public List<String> buscarFilaPorAnio(String filePath, int targetYear) {
        List<String> filaEncontrada = null;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            boolean esPrimeraLinea = true;

            while ((linea = br.readLine()) != null) {
                // Dividir la línea en valores separados por comas
                String[] valores = linea.split(",");

                // Omitir la primera línea (encabezados)
                if (esPrimeraLinea) {
                    esPrimeraLinea = false;
                    continue;
                }

                // Verificar si el primer valor coincide con el año buscado
                if (valores.length > 0 && Integer.parseInt(valores[0].trim()) == targetYear) {
                    filaEncontrada = new ArrayList<>();
                    for (String valor : valores) {
                        filaEncontrada.add(valor.trim());
                    }
                    break; // Detener la búsqueda una vez encontrada la fila
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + filePath);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Formato no válido en el archivo CSV: " + e.getMessage());
        }

        return filaEncontrada;
    }

    public void mostrarDatosEnCampos(List<String> datos, JTextField txtAnio, JTextField txtD, JTextField txtI, JTextField txtAlfa, JTextField txtLimI, JTextField txtLimS) {
        if (datos != null && datos.size() >= 6) { // Asegúrate de que hay suficientes columnas
            txtAnio.setText(datos.get(0));             // Año
            txtD.setText(datos.get(1));    // Deforestación
            txtI.setText(datos.get(2));    // Incertidumbre
            txtAlfa.setText(datos.get(3));             // Alfa
            txtLimI.setText(datos.get(4));   // Límite Inferior
            txtLimS.setText(datos.get(5));   // Límite Superior
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos para mostrar o el archivo CSV tiene menos columnas de las esperadas.");
        }
    }

    public void pantallaIngresar() {
        panel.removeAll();
        JButton anio = new JButton();
        anio.setBounds(570, 225, 75, 60);
        anio.setBorder(new LineBorder(inv, 3));
        anio.setBackground(inv);
        anio.setFocusPainted(false);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/download_473632.png", 75, 60, anio);
        panel.add(anio);
        JButton anio1 = new JButton();
        anio1.setBounds(820, 225, 75, 60);
        anio1.setBorder(new LineBorder(inv, 3));
        anio1.setBackground(inv);
        anio1.setFocusPainted(false);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/download_473632.png", 75, 60, anio1);
        panel.add(anio1);
        JButton anio2 = new JButton();
        anio2.setBounds(1070, 225, 75, 60);
        anio2.setBorder(new LineBorder(inv, 3));
        anio2.setBackground(inv);
        anio2.setFocusPainted(false);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/download_473632.png", 75, 60, anio2);
        panel.add(anio2);
        JButton anio3 = new JButton();
        anio3.setBounds(1320, 225, 75, 60);
        anio3.setBorder(new LineBorder(inv, 3));
        anio3.setBackground(inv);
        anio3.setFocusPainted(false);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/download_473632.png", 75, 60, anio3);
        panel.add(anio3);
        JButton anio4 = new JButton();
        anio4.setBounds(1570, 225, 75, 60);
        anio4.setBorder(new LineBorder(inv, 3));
        anio4.setBackground(inv);
        anio4.setFocusPainted(false);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/download_473632.png", 75, 60, anio4);
        panel.add(anio4);
        String ruta = "/home/prome/NetBeansProjects/proyectoSimulacion/Datos.csv";

        anio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inAnio.getText().trim(); // Elimina espacios en blanco
                if (text.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El campo de año está vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try {
                    int x = Integer.parseInt(text); // Convierte a entero
                    List<String> res = buscarFilaPorAnio(ruta, x); // Busca la fila
                    mostrarDatosEnCampos(res, inAnio, inDef, inInc, inAlfa, inLimInf, inLimSup); // Muestra datos
                    inAnio1.setText(String.valueOf(x + 1));
                    inAnio2.setText(String.valueOf(x + 2));
                    inAnio3.setText(String.valueOf(x + 3));
                    inAnio4.setText(String.valueOf(x + 4));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        anio1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inAnio1.getText().trim(); // Elimina espacios en blanco
                if (text.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El campo de año está vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try {
                    int x = Integer.parseInt(text); // Convierte a entero
                    List<String> res = buscarFilaPorAnio(ruta, x); // Busca la fila
                    mostrarDatosEnCampos(res, inAnio1, inDef1, inInc1, inAlfa1, inLimInf1, inLimSup1); // Muestra datos
                    inAnio.setText(String.valueOf(x - 1));
                    inAnio2.setText(String.valueOf(x + 1));
                    inAnio3.setText(String.valueOf(x + 2));
                    inAnio4.setText(String.valueOf(x + 3));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        anio2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inAnio2.getText().trim(); // Elimina espacios en blanco
                if (text.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El campo de año está vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try {
                    int x = Integer.parseInt(text); // Convierte a entero
                    List<String> res = buscarFilaPorAnio(ruta, x); // Busca la fila
                    mostrarDatosEnCampos(res, inAnio2, inDef2, inInc2, inAlfa2, inLimInf2, inLimSup2); // Muestra datos
                    inAnio.setText(String.valueOf(x - 2));
                    inAnio1.setText(String.valueOf(x - 1));
                    inAnio3.setText(String.valueOf(x + 1));
                    inAnio4.setText(String.valueOf(x + 2));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        anio3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inAnio3.getText().trim(); // Elimina espacios en blanco
                if (text.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El campo de año está vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try {
                    int x = Integer.parseInt(text); // Convierte a entero
                    List<String> res = buscarFilaPorAnio(ruta, x); // Busca la fila
                    mostrarDatosEnCampos(res, inAnio3, inDef3, inInc3, inAlfa3, inLimInf3, inLimSup3); // Muestra datos
                    inAnio.setText(String.valueOf(x - 3));
                    inAnio1.setText(String.valueOf(x - 2));
                    inAnio2.setText(String.valueOf(x - 1));
                    inAnio4.setText(String.valueOf(x + 1));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        anio4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inAnio4.getText().trim(); // Elimina espacios en blanco
                if (text.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El campo de año está vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try {
                    int x = Integer.parseInt(text); // Convierte a entero
                    List<String> res = buscarFilaPorAnio(ruta, x); // Busca la fila
                    mostrarDatosEnCampos(res, inAnio4, inDef4, inInc4, inAlfa4, inLimInf4, inLimSup4); // Muestra datos
                    inAnio.setText(String.valueOf(x - 4));
                    inAnio1.setText(String.valueOf(x - 3));
                    inAnio2.setText(String.valueOf(x - 2));
                    inAnio3.setText(String.valueOf(x - 1));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

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
        ingresarAnio.setBounds(150, 250, 300, 200);
        panel.add(ingresarAnio);
        ingresarDef.setText("INGRESAR DEFORESTACION:");
        ingresarDef.setFont(new Font("Arial", Font.BOLD, 20));
        ingresarDef.setForeground(cn4);
        ingresarDef.setBounds(150, 325, 300, 200);
        panel.add(ingresarDef);
        ingresarInser.setText("INGRESAR INCERTIDUMBRES:");
        ingresarInser.setFont(new Font("Arial", Font.BOLD, 20));
        ingresarInser.setForeground(cn4);
        ingresarInser.setBounds(150, 400, 300, 200);
        panel.add(ingresarInser);
        ingresarZAlfa.setText("INGRESAR ALFA:");
        ingresarZAlfa.setFont(new Font("Arial", Font.BOLD, 20));
        ingresarZAlfa.setForeground(cn4);
        ingresarZAlfa.setBounds(150, 475, 300, 200);
        panel.add(ingresarZAlfa);
        ingresarLimInf.setText("INGRESAR LIMITE INFERIOR:");
        ingresarLimInf.setFont(new Font("Arial", Font.BOLD, 20));
        ingresarLimInf.setForeground(cn4);
        ingresarLimInf.setBounds(150, 550, 300, 200);
        panel.add(ingresarLimInf);
        ingresarLimSup.setText("INGRESAR LIMITE SUPERIOR:");
        ingresarLimSup.setFont(new Font("Arial", Font.BOLD, 20));
        ingresarLimSup.setForeground(cn4);
        ingresarLimSup.setBounds(150, 625, 300, 200);
        panel.add(ingresarLimSup);
        ingresarAnioFIn.setText("INGRESAR AÑO FINALIZACIÓN:");
        ingresarAnioFIn.setFont(new Font("Arial", Font.BOLD, 20));
        ingresarAnioFIn.setForeground(cn4);
        ingresarAnioFIn.setBounds(150, 700, 350, 200);
        panel.add(ingresarAnioFIn);
        subirDatos.setText("SUBIR DATOS DESDE CSV");
        subirDatos.setFont(new Font("Arial", Font.BOLD, 20));
        subirDatos.setForeground(cn4);
        subirDatos.setBounds(1625, 750, 300, 200);
        panel.add(subirDatos);

        inAnio.setBounds(500, 325, 200, 50);
        inAnio.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inAnio);
        inDef.setBounds(500, 400, 200, 50);
        inDef.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inDef);
        inInc.setBounds(500, 475, 200, 50);
        inInc.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inInc);
        inAlfa.setBounds(500, 550, 200, 50);
        inAlfa.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inAlfa);
        inLimInf.setBounds(500, 625, 200, 50);
        inLimInf.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inLimInf);
        inLimSup.setBounds(500, 700, 200, 50);
        inLimSup.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inLimSup);
        inAnioFin.setBounds(1000, 775, 200, 50);
        inAnioFin.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inAnioFin);

        inAnio1.setBounds(750, 325, 200, 50);
        inAnio1.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inAnio1);
        inDef1.setBounds(750, 400, 200, 50);
        inDef1.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inDef1);
        inInc1.setBounds(750, 475, 200, 50);
        inInc1.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inInc1);
        inAlfa1.setBounds(750, 550, 200, 50);
        inAlfa1.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inAlfa1);
        inLimInf1.setBounds(750, 625, 200, 50);
        inLimInf1.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inLimInf1);
        inLimSup1.setBounds(750, 700, 200, 50);
        inLimSup1.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inLimSup1);

        inAnio2.setBounds(1000, 325, 200, 50);
        inAnio2.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inAnio2);
        inDef2.setBounds(1000, 400, 200, 50);
        inDef2.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inDef2);
        inInc2.setBounds(1000, 475, 200, 50);
        inInc2.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inInc2);
        inAlfa2.setBounds(1000, 550, 200, 50);
        inAlfa2.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inAlfa2);
        inLimInf2.setBounds(1000, 625, 200, 50);
        inLimInf2.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inLimInf2);
        inLimSup2.setBounds(1000, 700, 200, 50);
        inLimSup2.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inLimSup2);

        inAnio3.setBounds(1250, 325, 200, 50);
        inAnio3.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inAnio3);
        inDef3.setBounds(1250, 400, 200, 50);
        inDef3.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inDef3);
        inInc3.setBounds(1250, 475, 200, 50);
        inInc3.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inInc3);
        inAlfa3.setBounds(1250, 550, 200, 50);
        inAlfa3.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inAlfa3);
        inLimInf3.setBounds(1250, 625, 200, 50);
        inLimInf3.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inLimInf3);
        inLimSup3.setBounds(1250, 700, 200, 50);
        inLimSup3.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inLimSup3);

        inAnio4.setBounds(1500, 325, 200, 50);
        inAnio4.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inAnio4);
        inDef4.setBounds(1500, 400, 200, 50);
        inDef4.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inDef4);
        inInc4.setBounds(1500, 475, 200, 50);
        inInc4.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inInc4);
        inAlfa4.setBounds(1500, 550, 200, 50);
        inAlfa4.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inAlfa4);
        inLimInf4.setBounds(1500, 625, 200, 50);
        inLimInf4.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inLimInf4);
        inLimSup4.setBounds(1500, 700, 200, 50);
        inLimSup4.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inLimSup4);

        btnExplicarAnio.setText("");
        btnExplicarAnio.setToolTipText("Indica el año específico en que se recolectaron los datos o se realizaron las estimaciones. ");
        btnExplicarAnio.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarAnio.setFocusPainted(false);
        btnExplicarAnio.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarAnio.setContentAreaFilled(false);
        btnExplicarAnio.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarAnio);
        btnExplicarAnio.setBounds(1750, 325, 50, 50);
        panel.add(btnExplicarAnio);
        btnExplicarDeforestacion.setText("");
        btnExplicarDeforestacion.setToolTipText("Representa la cantidad de áreas boscosas que se perdieron en un año determinado.(HECTAREAS)");
        btnExplicarDeforestacion.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarDeforestacion.setFocusPainted(false);
        btnExplicarDeforestacion.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarDeforestacion.setContentAreaFilled(false);
        btnExplicarDeforestacion.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarDeforestacion);
        btnExplicarDeforestacion.setBounds(1750, 400, 50, 50);
        panel.add(btnExplicarDeforestacion);
        btnExplicarIncertidumbre.setText("");
        btnExplicarIncertidumbre.setToolTipText("Es una medida de la variabilidad o el margen de error de las estadísticas, indicando qué tan confiables son los datos.");
        btnExplicarIncertidumbre.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarIncertidumbre.setFocusPainted(false);
        btnExplicarIncertidumbre.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarIncertidumbre.setContentAreaFilled(false);
        btnExplicarIncertidumbre.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarIncertidumbre);
        btnExplicarIncertidumbre.setBounds(1750, 475, 50, 50);
        panel.add(btnExplicarIncertidumbre);
        btnExplicarAlfa.setText("");
        btnExplicarAlfa.setToolTipText("El valor crítico de una distribución normal dependiente del nivel de confianza,La desviación estándar se utiliza para calcular intervalos de confianza y evaluar la precisión de las estimaciones.");
        btnExplicarAlfa.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarAlfa.setFocusPainted(false);
        btnExplicarAlfa.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarAlfa.setContentAreaFilled(false);
        btnExplicarAlfa.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarAlfa);
        btnExplicarAlfa.setBounds(1750, 550, 50, 50);
        panel.add(btnExplicarAlfa);
        btnExplicarLimInf.setText("");
        btnExplicarLimInf.setToolTipText("Representa el valor mínimo dentro del intervalo de confianza para las estadísticas de deforestación.");
        btnExplicarLimInf.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarLimInf.setFocusPainted(false);
        btnExplicarLimInf.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarLimInf.setContentAreaFilled(false);
        btnExplicarLimInf.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarLimInf);
        btnExplicarLimInf.setBounds(1750, 625, 50, 50);
        panel.add(btnExplicarLimInf);
        btnExplicarLimSup.setText("");
        btnExplicarLimSup.setToolTipText("Representa el valor máximo dentro del intervalo de confianza, indica el mejor escenario dentro del rango calculado.");
        btnExplicarLimSup.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarLimSup.setFocusPainted(false);
        btnExplicarLimSup.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarLimSup.setContentAreaFilled(false);
        btnExplicarLimSup.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarLimSup);
        btnExplicarLimSup.setBounds(1750, 700, 50, 50);
        panel.add(btnExplicarLimSup);
        btnExplicarAnioFin.setText("");
        btnExplicarAnioFin.setToolTipText("Año de finalizacion de la simulación");
        btnExplicarAnioFin.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarAnioFin.setFocusPainted(false);
        btnExplicarAnioFin.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarAnioFin.setContentAreaFilled(false);
        btnExplicarAnioFin.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 50, 50, btnExplicarAnioFin);
        btnExplicarAnioFin.setBounds(1250, 775, 50, 50);
        panel.add(btnExplicarAnioFin);
        btnExplicarCsv.setText("");
        btnExplicarCsv.setToolTipText("Importar datos desde un csv,cumpliendo con los campos minimos necesarios.");
        btnExplicarCsv.setFont(new Font("Arial", Font.BOLD, 16));
        btnExplicarCsv.setFocusPainted(false);
        btnExplicarCsv.setBorder(BorderFactory.createEmptyBorder());
        btnExplicarCsv.setContentAreaFilled(false);
        btnExplicarCsv.setForeground(Color.BLUE);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 30, 30, btnExplicarCsv);
        btnExplicarCsv.setBounds(1880, 900, 30, 30);
        panel.add(btnExplicarCsv);

        impCsv.setFocusPainted(false);
        impCsv.setBorder(BorderFactory.createEmptyBorder());
        impCsv.setContentAreaFilled(false);
        impCsv.setForeground(Color.BLUE);
//        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/box_15309795.gif", 100, 100, impCsv);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/outbox_393799.png", 100, 100, impCsv);
        impCsv.setBounds(1690, 917, 100, 100);

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
                                limpiarPanel();
                                simularYExportarCSV(selectedFile, "/home/prome/NetBeansProjects/proyectoSimulacion/simulacion.csv");
                                tablaDeDatos();
                                barraInteraccion();
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

        menuSImmulacion.setText("MENÚ SIMULACIÓN");
        menuSImmulacion.setFont(new Font("Arial", Font.BOLD, 16));
        menuSImmulacion.setForeground(cn5);
        menuSImmulacion.setBackground(cn11);
        menuSImmulacion.setBounds(20, 1050, 200, 60);
        panel.add(menuSImmulacion);

        RoundButton btnEnviarSimulacion = new RoundButton(20);

        btnEnviarSimulacion.setText("INICIAR SIMULACIÓN");
        btnEnviarSimulacion.setFont(new Font("Arial", Font.BOLD, 20));
        btnEnviarSimulacion.setForeground(cn5);
        btnEnviarSimulacion.setBackground(cn11);
        btnEnviarSimulacion.setBounds(800, 960, 300, 60);
        panel.add(btnEnviarSimulacion);

        btnEnviarSimulacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar panel antes de la simulación
                panel.removeAll();
                String ini = inAnio.getText();
                int añoInicio = Integer.parseInt(ini);

                // Obtener los valores de los campos de entrada
                String[] deforestaciones = {
                    inDef.getText(), inDef1.getText(), inDef2.getText(), inDef3.getText(), inDef4.getText()
                };
                String[] incs = {
                    inInc.getText(), inInc1.getText(), inInc2.getText(), inInc3.getText(), inInc4.getText()
                };
                String[] alfas = {
                    inAlfa.getText(), inAlfa1.getText(), inAlfa2.getText(), inAlfa3.getText(), inAlfa4.getText()
                };
                String[] limInfs = {
                    inLimInf.getText(), inLimInf1.getText(), inLimInf2.getText(), inLimInf3.getText(), inLimInf4.getText()
                };
                String[] limSups = {
                    inLimSup.getText(), inLimSup1.getText(), inLimSup2.getText(), inLimSup3.getText(), inLimSup4.getText()
                };

                // Obtener el año final de la simulación
                int añoFin = Integer.parseInt(inAnioFin.getText());

                // Iniciar simulación con los valores obtenidos de los campos
                iniciarSimulacion(añoInicio, deforestaciones, incs, alfas, limInfs, limSups, añoFin);

                // Limpiar el panel y realizar otras acciones
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

    public void simularYExportarCSV(File archivoBase, String rutaDestino) {
        try {
            // Leer los datos desde el archivo CSV
            List<Map<String, String>> datosBase = leerDatosDesdeCSV(archivoBase);

            // Verificar que los datos base no estén vacíos
            if (datosBase.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "El archivo no contiene datos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Mostrar las claves disponibles en el archivo
            datosBase.forEach(fila -> System.out.println("Claves disponibles: " + fila.keySet()));

            // Extraer los valores de las columnas de interés
            String[] deforestaciones = datosBase.stream()
                    .map(fila -> fila.getOrDefault("deforestacion", "0").trim())
                    .toArray(String[]::new);
            String[] incs = datosBase.stream()
                    .map(fila -> fila.getOrDefault("Incertidumbre(%)", "0").trim())
                    .toArray(String[]::new);
            String[] alfas = datosBase.stream()
                    .map(fila -> fila.getOrDefault("Z_alfa/2*sigma", "0").trim())
                    .toArray(String[]::new);
            String[] limInfs = datosBase.stream()
                    .map(fila -> fila.getOrDefault("limite_inferior", "0").trim())
                    .toArray(String[]::new);
            String[] limSups = datosBase.stream()
                    .map(fila -> fila.getOrDefault("limite_superior", "0").trim())
                    .toArray(String[]::new);

            // Mostrar los valores extraídos para depuración
            System.out.println("Incertidumbre: " + Arrays.toString(incs));
            System.out.println("Alfa: " + Arrays.toString(alfas));

            // Solicitar el año a simular
            String input = JOptionPane.showInputDialog(frame, "Ingresa el año hasta el que deseas simular:");
            if (input == null || input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "No se ingresó un año.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int añoFin = Integer.parseInt(input.trim());

            // Obtener el año de inicio desde los datos
            String añoInicioStr = datosBase.get(0).getOrDefault("año", "0").trim();
            int añoInicio = Integer.parseInt(añoInicioStr);

            // Mostrar años para depuración
            System.out.println("Año inicio: " + añoInicio);
            System.out.println("Año fin: " + añoFin);

            // Llamar al método iniciarSimulacion con los datos leídos
            iniciarSimulacion(añoInicio, deforestaciones, incs, alfas, limInfs, limSups, añoFin);

            JOptionPane.showMessageDialog(frame, "Simulación completada y exportada a: " + rutaDestino, "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "El año ingresado no es válido o los datos no están en el formato correcto.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Error al procesar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

// Método para leer los datos desde un archivo CSV y devolverlos como una lista de mapas
    private List<Map<String, String>> leerDatosDesdeCSV(File archivo) throws IOException {
        List<Map<String, String>> datos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            // Leer la primera línea para obtener los encabezados
            String[] encabezados = br.readLine().split(",");

            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(",");
                Map<String, String> fila = new HashMap<>();
                for (int i = 0; i < encabezados.length; i++) {
                    fila.put(encabezados[i].trim(), valores[i].trim());
                }
                datos.add(fila);
            }
        }
        return datos;
    }

    private List<Map<String, Double>> simularDatos(List<Map<String, Double>> datosBase, int anoSimulacion) {
        List<Map<String, Double>> simulados = new ArrayList<>();
        List<Integer> anos = new ArrayList<>();
        List<Double> deforestaciones = new ArrayList<>();
        List<Double> incertidumbres = new ArrayList<>();

        for (Map<String, Double> fila : datosBase) {
            try {
                anos.add(fila.get("año").intValue());
                deforestaciones.add(fila.get("deforestacion"));
                incertidumbres.add(fila.get("incertidumbre(%)"));
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(frame, "Datos faltantes en el archivo CSV.", "Error", JOptionPane.ERROR_MESSAGE);
                return simulados; // Detener la simulación
            }
        }

        if (anos.size() != deforestaciones.size() || anos.size() != incertidumbres.size()) {
            JOptionPane.showMessageDialog(frame, "Las listas no tienen el mismo tamaño. Revisa los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return simulados;
        }

        if (anos.contains(null) || deforestaciones.contains(null) || incertidumbres.contains(null)) {
            JOptionPane.showMessageDialog(frame, "Hay valores nulos en las listas. Revisa los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return simulados;
        }

        LinearRegression modeloDeforestacion = new LinearRegression(anos, deforestaciones);
        LinearRegression modeloIncertidumbre = new LinearRegression(anos, incertidumbres);

        int ultimoAno = anos.get(anos.size() - 1);
        for (int ano = ultimoAno + 1; ano <= anoSimulacion; ano++) {
            double deforestacion = modeloDeforestacion.predict(ano);
            double incertidumbre = modeloIncertidumbre.predict(ano);
            double sigma = incertidumbre / 100 * deforestacion;
            double limiteInferior = deforestacion - 1.96 * sigma;
            double limiteSuperior = deforestacion + 1.96 * sigma;

            Map<String, Double> simulado = new HashMap<>();
            simulado.put("año", (double) ano);
            simulado.put("deforestacion", deforestacion);
            simulado.put("incertidumbre(%)", incertidumbre);
            simulado.put("Z_alfa/2*sigma", sigma);
            simulado.put("limite_inferior", limiteInferior);
            simulado.put("limite_superior", limiteSuperior);

            simulados.add(simulado);
        }
        return simulados;
    }

    private void exportarCSV(List<Map<String, Double>> datos, String rutaDestino) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaDestino))) {
            // Escribir encabezados
            writer.write("año,deforestacion,incertidumbre(%),Z_alfa/2*sigma,limite_inferior,limite_superior\n");

            // Escribir filas
            for (Map<String, Double> fila : datos) {
                writer.write(String.format(Locale.US, "%.0f,%.2f,%.2f,%.2f,%.2f,%.2f\n",
                        fila.get("año"),
                        fila.get("deforestacion"),
                        fila.get("incertidumbre(%)"),
                        fila.get("Z_alfa/2*sigma"),
                        fila.get("limite_inferior"),
                        fila.get("limite_superior")));
            }
        }
    }

    public void iniciarSimulacion(int anioInicio, String[] deforestaciones, String[] incs, String[] alfas, String[] limInfs, String[] limSups, int añoFin) {
        try {
            // Validación de que los arreglos tengan el mismo tamaño
            if (deforestaciones.length != incs.length || deforestaciones.length != alfas.length || deforestaciones.length != limInfs.length || deforestaciones.length != limSups.length) {
                throw new IllegalArgumentException("Todos los arreglos deben tener el mismo tamaño.");
            }

            String rutaDirectorio = "/home/prome/NetBeansProjects/proyectoSimulacion/"; // Cambiar ruta si necesario
            String nombreArchivo = "simulacion.csv";
            String rutaCompleta = rutaDirectorio + nombreArchivo;

            // Crear el archivo CSV
            java.io.File directorio = new java.io.File(rutaDirectorio);
            if (!directorio.exists()) {
                directorio.mkdirs();
            }
            java.io.File archivoAnterior = new java.io.File(rutaCompleta);
            if (archivoAnterior.exists()) {
                archivoAnterior.delete();
            }

            FileWriter fileWriter = new FileWriter(rutaCompleta, false); // 'false' sobrescribe
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Convertir las entradas de String a double
            double[] deforestacionVals = new double[deforestaciones.length];
            double[] incsVals = new double[incs.length];
            double[] alfasVals = new double[alfas.length];
            double[] limInfsVals = new double[limInfs.length];
            double[] limSupsVals = new double[limSups.length];
            for (int i = 0; i < deforestaciones.length; i++) {
                deforestacionVals[i] = Double.parseDouble(deforestaciones[i]);
                incsVals[i] = Double.parseDouble(incs[i]);
                alfasVals[i] = Double.parseDouble(alfas[i]);
                limInfsVals[i] = Double.parseDouble(limInfs[i]);
                limSupsVals[i] = Double.parseDouble(limSups[i]);
            }

            // Escribir los datos iniciales para los primeros años
            int anioActual = anioInicio;
            for (int i = 0; i < deforestacionVals.length; i++) {
                printWriter.printf("%d,%.2f,%.2f,%.2f,%.2f,%.2f%n", anioActual, deforestacionVals[i], incsVals[i], alfasVals[i], limInfsVals[i], limSupsVals[i]);
                anioActual++;
            }

            // Simular fluctuaciones controladas para los años restantes
            Random random = new Random();
            double deforestacionActual = deforestacionVals[deforestacionVals.length - 1];

            // Definir una variabilidad moderada con un 3% de cambio anual
            double rangoFluctuacion = 0.2 * deforestacionActual;  // ±3% de la deforestación actual

            // Iterar sobre los años hasta el año final
            for (int año = anioActual; año <= añoFin; año++) {
                // Generar fluctuaciones aleatorias, controlando la magnitud de la variación
                double cambio = random.nextDouble() * 2 * rangoFluctuacion - rangoFluctuacion;  // Generar fluctuaciones entre -3% y +3%
                deforestacionActual = Math.max(0, deforestacionActual + cambio);  // Evitar que la deforestación sea negativa

                // Calcular la incertidumbre de forma dinámica, manteniendo un rango moderado
                double incertidumbre = 10 + random.nextDouble() * 10;  // 10% a 20%
                double zAlfa = deforestacionActual * (incertidumbre / 100);

                // Calcular los límites superior e inferior con base en la incertidumbre
                double limiteInferior = Math.max(0, deforestacionActual - zAlfa);
                double limiteSuperior = deforestacionActual + zAlfa;

                // Escribir los valores simulados en el archivo CSV
                printWriter.printf("%d,%.2f,%.2f,%.2f,%.2f,%.2f%n", año, deforestacionActual, incertidumbre, zAlfa, limiteInferior, limiteSuperior);
            }

            printWriter.close();
            JOptionPane.showMessageDialog(null, "Simulación ajustada completada. Archivo creado: " + rutaCompleta, "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato de los datos. Verifique las entradas.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo CSV: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private double calcularSimulacionConVariabilidad(double[] valores, Random random) {
        double tasaDeCambio = (valores[valores.length - 1] - valores[0]) / (valores.length - 1);
        double variabilidad = tasaDeCambio * 0.1; // Variabilidad del 10%
        double cambioAleatorio = random.nextDouble() * variabilidad - (variabilidad / 2); // Rango [-variabilidad/2, variabilidad/2]
        return Math.max(0, valores[valores.length - 1] + tasaDeCambio + cambioAleatorio);
    }

    private double calcularExtrapolacionSuave(int[] años, double[] valores, int añoSimulacion) {
        int n = años.length;
        double[] tasasDeCambio = new double[n - 1];

        for (int i = 0; i < n - 1; i++) {
            tasasDeCambio[i] = (valores[i + 1] - valores[i]) / (años[i + 1] - años[i]);
        }

        double tasaPromedio = 0;
        double factorSuavizado = 0.5;
        for (int i = 0; i < n - 1; i++) {
            tasasDeCambio[i] *= factorSuavizado;
            tasaPromedio += tasasDeCambio[i] * (n - i - 1);
        }
        tasaPromedio /= (n * (n - 1)) / 2.0;

        double valorSimulado = valores[n - 1] + tasaPromedio * (añoSimulacion - años[n - 1]);

        double limiteInferior = valores[n - 1] * 0.8;
        double limiteSuperior = valores[n - 1] * 1.2;
        valorSimulado = Math.min(limiteSuperior, Math.max(limiteInferior, valorSimulado));

        return Math.max(0, valorSimulado);
    }

// Método para calcular la extrapolación con un factor de suavizado
    private double calcularExtrapolacion(int[] años, double[] valores, int añoSimulacion, double factorSuavizado) {
        int n = años.length;

        // Calcular las tasas de cambio entre cada par de valores consecutivos
        double[] tasasDeCambio = new double[n - 1];
        for (int i = 0; i < n - 1; i++) {
            tasasDeCambio[i] = (valores[i + 1] - valores[i]) / (años[i + 1] - años[i]);
        }

        // Calcular la tasa de cambio promedio ponderada (más reciente tiene mayor peso)
        double tasaPromedio = 0;
        for (int i = 0; i < n - 1; i++) {
            tasaPromedio += tasasDeCambio[i] * (n - i - 1); // Ponderación decreciente
        }
        tasaPromedio /= (n * (n - 1)) / 2.0; // Normalizar la ponderación

        // Proyección lineal controlada con la tasa de cambio y un factor de suavizado
        double valorSimulado = valores[n - 1] + tasaPromedio * (añoSimulacion - años[n - 1]);

        // Aplicar el factor de suavizado para evitar un crecimiento excesivo
        valorSimulado = valores[n - 1] + (valorSimulado - valores[n - 1]) * factorSuavizado;

        // Asegurarse de que el valor simulado no sea negativo
        valorSimulado = Math.max(0, valorSimulado);

        return valorSimulado;
    }

// Método para calcular la extrapolación usando una tasa de cambio ponderada
    private double calcularExtrapolacion(int[] años, double[] valores, int añoSimulacion) {
        int n = años.length;

        // Calcular las tasas de cambio entre cada par de valores consecutivos
        double[] tasasDeCambio = new double[n - 1];
        for (int i = 0; i < n - 1; i++) {
            tasasDeCambio[i] = (valores[i + 1] - valores[i]) / (años[i + 1] - años[i]);
        }

        // Calcular la tasa de cambio promedio ponderada (más reciente tiene mayor peso)
        double tasaPromedio = 0;
        for (int i = 0; i < n - 1; i++) {
            tasaPromedio += tasasDeCambio[i] * (n - i - 1); // Ponderación decreciente
        }
        tasaPromedio /= (n * (n - 1)) / 2.0; // Normalizar la ponderación

        // Proyección lineal controlada con la tasa de cambio
        double valorSimulado = valores[n - 1] + tasaPromedio * (añoSimulacion - años[n - 1]);

        // Asegurarse de que el valor simulado no sea negativo
        valorSimulado = Math.max(0, valorSimulado);

        return valorSimulado;
    }

// Método para calcular la extrapolación moderada
    private double calcularExtrapolacionModerada(int[] años, double[] valores, int añoSimulacion) {
        int n = años.length;

        // Calcular el cambio promedio entre los valores
        double cambioTotal = valores[n - 1] - valores[0];
        double cambioPromedio = cambioTotal / (años[n - 1] - años[0]);

        // Utilizar un enfoque lineal moderado para evitar extrapolaciones extremas
        double valorSimulado = valores[n - 1] + cambioPromedio * (añoSimulacion - años[n - 1]);

        // Asegurarse de que el valor simulado no sea negativo
        valorSimulado = Math.max(0, valorSimulado);

        return valorSimulado;
    }

// Método para calcular la regresión lineal
    private double calcularRegresionLineal(int[] años, double[] valores, int añoSimulacion) {
        // Calcular las sumas necesarias para la regresión lineal
        int n = años.length;
        double sumaX = 0, sumaY = 0, sumaXY = 0, sumaX2 = 0;

        for (int i = 0; i < n; i++) {
            sumaX += años[i];
            sumaY += valores[i];
            sumaXY += años[i] * valores[i];
            sumaX2 += años[i] * años[i];
        }

        // Calcular la pendiente (m) y la intersección (b) de la recta de regresión
        double m = (n * sumaXY - sumaX * sumaY) / (n * sumaX2 - sumaX * sumaX);
        double b = (sumaY - m * sumaX) / n;

        // Usar la ecuación de la recta: Y = m * X + b
        return m * añoSimulacion + b;
    }

// Método auxiliar para agregar un nuevo valor al arreglo (simular crecimiento)
    public double[] appendToArray(double[] originalArray, double newValue) {
        double[] newArray = new double[originalArray.length + 1];
        System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);
        newArray[originalArray.length] = newValue;
        return newArray;
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
        RoundButton IngresarM = new RoundButton(20);

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

        aFin.setText("2016");
        aFin.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 23));
        aFin.setBounds(1685, 115, 100, 100);
        aFin.setForeground(cn4);
        panel.add(aFin);

        IngresarM.setText("INGRESAR DATOS MANUALMENTE");
        IngresarM.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 15));
        IngresarM.setBounds(615, 45, 300, 60);
        IngresarM.setForeground(cn5);
        IngresarM.setFocusPainted(false);
        IngresarM.setBackground(cn10);
        panel.add(IngresarM);

        IngresarM.addActionListener(e -> {
            panel.removeAll();
            pantallaIngresar();
            panel.revalidate(); // Recalcula el diseño del panel
            panel.repaint();
        });

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

        JScrollBar yearScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 2001, 1, 2001, 2017);
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
//            writer.write(String.join(",", encabezado)); // Escribir encabezado
//            writer.newLine();

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

    public void Regresion(String csvFilePath) {
        frame.setTitle("REGRESION LINEAL");
        try {
            loadDataFromCSV(csvFilePath);  // Cargar los datos desde el CSV
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
        panelRegresion.setBounds(350, 90, 1220, 950);
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
        String sp = " ".repeat(20);
        String sp1 = " ".repeat(10);
        String sp2 = " ".repeat(5);

        txtRegresion.setText("");
        txtRegresion.setFont(new Font("Arial", Font.PLAIN, 20));
        txtRegresion.setLineWrap(true);
        txtRegresion.append("DATOS ANALIZADOS:\n" + sr.getN() + "\n\n");
        txtRegresion.append("VALOR MÍNIMO:\n" + StatUtils.min(y) + "\n\n");
        txtRegresion.append("VALOR MÁXIMO:\n" + StatUtils.max(y) + "\n\n");
        txtRegresion.append("VALOR PROMEDIO:\n" + StatUtils.mean(y) + "\n\n");
        txtRegresion.append("VALOR VARIANZA:\n" + StatUtils.variance(y) + "\n\n");
        txtRegresion.append("VALOR GEOMÉTRICO:\n" + StatUtils.geometricMean(y) + "\n\n");
        txtRegresion.append("VALOR SUMA:\n" + StatUtils.sum(y) + "\n\n");
        txtRegresion.append("PENDIENTE:\n" + sr.getSlope() + "\n\n");
        txtRegresion.append("R²:\n" + sr.getRSquare() + "\n\n");
//        Border debugBorder = BorderFactory.createLineBorder(Color.RED, 2);
//        txtRegresion.setBorder(debugBorder);
        txtRegresion.setBounds(1650, 145, 1580, 915);
        txtRegresion.setEditable(false);
        txtRegresion.setForeground(cn4);
        txtRegresion.setBackground(inv);
        panel.add(txtRegresion);

        exp1.setToolTipText("Cantidad de datos analizados para realizar la regresión lineal.");
        exp1.setFont(new Font("Arial", Font.BOLD, 16));
        exp1.setFocusPainted(false);
        exp1.setBorder(BorderFactory.createEmptyBorder());
        exp1.setContentAreaFilled(false);
        exp1.setForeground(inv);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 20, 20, exp1);
        exp1.setBounds(1630, 155, 20, 20);
        panel.add(exp1);

        exp2.setToolTipText("El menor valor encontrado en el conjunto de datos.");
        exp2.setFont(new Font("Arial", Font.BOLD, 16));
        exp2.setFocusPainted(false);
        exp2.setBorder(BorderFactory.createEmptyBorder());
        exp2.setContentAreaFilled(false);
        exp2.setForeground(inv);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 20, 20, exp2);
        exp2.setBounds(1630, 240, 20, 20);
        panel.add(exp2);

        exp3.setToolTipText("El mayor valor encontrado en el conjunto de datos.");
        exp3.setFont(new Font("Arial", Font.BOLD, 16));
        exp3.setFocusPainted(false);
        exp3.setBorder(BorderFactory.createEmptyBorder());
        exp3.setContentAreaFilled(false);
        exp3.setForeground(inv);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 20, 20, exp3);
        exp3.setBounds(1630, 320, 20, 20);
        panel.add(exp3);

        exp4.setToolTipText("El promedio de los valores en el conjunto de datos, calculado como la suma de los valores dividida entre el número de datos.");
        exp4.setFont(new Font("Arial", Font.BOLD, 16));
        exp4.setFocusPainted(false);
        exp4.setBorder(BorderFactory.createEmptyBorder());
        exp4.setContentAreaFilled(false);
        exp4.setForeground(inv);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 20, 20, exp4);
        exp4.setBounds(1630, 405, 20, 20);
        panel.add(exp4);

        exp5.setToolTipText("La varianza mide la dispersión de los datos respecto al promedio. Un valor alto indica una mayor variabilidad.");
        exp5.setFont(new Font("Arial", Font.BOLD, 16));
        exp5.setFocusPainted(false);
        exp5.setBorder(BorderFactory.createEmptyBorder());
        exp5.setContentAreaFilled(false);
        exp5.setForeground(inv);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 20, 20, exp5);
        exp5.setBounds(1630, 490, 20, 20);
        panel.add(exp5);

        exp6.setToolTipText("La media geométrica, utilizada especialmente cuando los valores tienen escalas exponenciales o multiplicativas.");
        exp6.setFont(new Font("Arial", Font.BOLD, 16));
        exp6.setFocusPainted(false);
        exp6.setBorder(BorderFactory.createEmptyBorder());
        exp6.setContentAreaFilled(false);
        exp6.setForeground(inv);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 20, 20, exp6);
        exp6.setBounds(1630, 575, 20, 20);
        panel.add(exp6);

        exp7.setToolTipText("La suma de todos los valores en el conjunto de datos.");
        exp7.setFont(new Font("Arial", Font.BOLD, 16));
        exp7.setFocusPainted(false);
        exp7.setBorder(BorderFactory.createEmptyBorder());
        exp7.setContentAreaFilled(false);
        exp7.setForeground(inv);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 20, 20, exp7);
        exp7.setBounds(1630, 660, 20, 20);
        panel.add(exp7);

        exp8.setToolTipText("Indica cuánto cambia la variable dependiente por cada unidad que cambia la independiente.");
        exp8.setFont(new Font("Arial", Font.BOLD, 16));
        exp8.setFocusPainted(false);
        exp8.setBorder(BorderFactory.createEmptyBorder());
        exp8.setContentAreaFilled(false);
        exp8.setForeground(inv);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 20, 20, exp8);
        exp8.setBounds(1630, 745, 20, 20);
        panel.add(exp8);

        exp9.setToolTipText("El coeficiente de determinación, que mide qué tan bien el modelo se ajusta a los datos. Un valor cercano a 1 indica un ajuste fuerte.");
        exp9.setFont(new Font("Arial", Font.BOLD, 16));
        exp9.setFocusPainted(false);
        exp9.setBorder(BorderFactory.createEmptyBorder());
        exp9.setContentAreaFilled(false);
        exp9.setForeground(inv);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 20, 20, exp9);
        exp9.setBounds(1630, 830, 20, 20);
        panel.add(exp9);
    }

    private void loadDataFromCSV(String filePath) {
        ArrayList<Double> xList = new ArrayList<>();
        ArrayList<Double> yList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;  // Saltar la cabecera
                    continue;
                }

                String[] values = line.split(","); // Suponiendo que el delimitador es una coma
                double year = Double.parseDouble(values[0].trim());
                double deforestation = Double.parseDouble(values[1].trim());

                xList.add(year);
                yList.add(deforestation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convertir las listas a arreglos
        x = xList.stream().mapToDouble(Double::doubleValue).toArray();
        y = yList.stream().mapToDouble(Double::doubleValue).toArray();
    }

    public void menuFactores(double x) {
        frame.setTitle("HECTARES DEFORESTADAS POR AÑO");

//        img("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/deforest_9568180.png", 160, 160, imgFac);
//        imgFac.setBounds(1015, 20, 160, 160);
//        panel.add(imgFac);
//
//        frame.setTitle("FACTORES DE DEFORESTACIÓN PRIMARIOS");
////        btnF1.setBounds(380, 1000, 240, 100);
//        btnF2.setBounds(1600, 45, 240, 100);
////        pintarBoton(btnF1, "FACTORES PRIMARIOS", cn3, cn3, cn4);
//        pintarBoton(btnF2, "FACTORES SECUNDARIOS", cn3, cn3, cn4);

        panelVista.setBounds(380, 30, 1460, 1050);
        panel.add(panelVista);
        primarios(x);
//        panel.add(btnF1);
//        panel.add(btnF2);

//        btnF2.addActionListener(e -> {
//            if (metodoUnoActivo) {
//                frame.setTitle("FACTORES  DE DEFORESTACIÓN PRIMARIOS");
//                primarios(x);
//            } else {
//                frame.setTitle("FACTORES  DE DEFORESTACIÓN SECUNDARIOS");
//                secundarios(x);
//            }
//            metodoUnoActivo = !metodoUnoActivo;
//            barraInteInteraccion();
//        });
    }

    public void secundarios(double x) {

        panelVista.removeAll();
        btnF2.setText("FACTORES PRIMARIOS");
        double n1 = 9 * x;
        double n2 = 65 * x;
        double n3 = 42 * x;
        double n4 = 29 * x;
        double n5 = 15 * x;
        double n6 = 5 * x;
        double n7 = 45.5 * x;
        double n8 = 33 * x;
        double n9 = 14.5 * x;

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

    public void primarios(double x) {
        btnF2.setText("HECTARES DEFORESTADAS POR AÑO");
        panelVista.removeAll();

        // Cargar datos desde el archivo CSV
        String csvFile = "/home/prome/NetBeansProjects/proyectoSimulacion/simulacion.csv";
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            // Leer todas las filas del archivo CSV
            List<String[]> rows = reader.readAll();

            // Crear el dataset para el gráfico
            DefaultCategoryDataset datos = new DefaultCategoryDataset();

            // Iterar sobre las filas del CSV (omite la cabecera si la tiene)
            for (String[] row : rows) {
                if (row.length > 1) {
                    // Suponemos que la primera columna es el año y las siguientes son los valores de los factores
                    String año = row[0];  // Año en la primera columna

                    // Multiplicar los valores por el factor 'x'
                    double factorSocioeconomico = Double.parseDouble(row[1]) * x;
                    double extraccionLeña = Double.parseDouble(row[2]) * x;
                    double extraccionMadera = Double.parseDouble(row[3]) * x;
                    double incendios = Double.parseDouble(row[4]) * x;

                    // Añadir los valores al dataset con el año como categoría
                    datos.setValue(factorSocioeconomico, "", "" + año);
                    datos.setValue(extraccionLeña, "", "" + año);
                    datos.setValue(extraccionMadera, "", "" + año);
                    datos.setValue(incendios, "", "" + año);
                }
            }

            // Crear el gráfico de barras
            JFreeChart grafico_barras = ChartFactory.createBarChart3D(
                    "HECTAREAS DEFORESTADAS POR AÑO",
                    "AÑO",
                    "HECTAREAS",
                    datos,
                    PlotOrientation.HORIZONTAL,
                    true,
                    true,
                    false
            );

            // Configurar el panel del gráfico
            ChartPanel panel = new ChartPanel(grafico_barras);
            panel.setMouseWheelEnabled(true);
            panel.setPreferredSize(new Dimension(1000, 500));

            // Agregar el gráfico al panelVista
            panelVista.setLayout(new BorderLayout());
            panelVista.add(panel, BorderLayout.CENTER);

            panelVista.repaint();
            panelVista.revalidate();

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
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
//        frame.setTitle("TABLA DE DATOS");
        ExpCsv.setBounds(1790, 30, 70, 70);
        txtTab.setText("TABLA DE DATOS");
        txtTab.setBounds(880, 1, 450, 65);
        txtTab.setBorder(new LineBorder(inv, 2));
        txtTab.setFont(new Font("Noto Sans Mono Thin", Font.BOLD, 50));
        txtTab.setForeground(cn4);
        txtTab.setBackground(inv);
        panel.add(txtTab);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/package_1079004.png", 70, 70, ExpCsv);
        ExpCsv.setBorderPainted(false);
        ExpCsv.setFocusPainted(false);
        ExpCsv.setOpaque(false);
        ExpCsv.setContentAreaFilled(false);
        ExpCsv.setBackground(inv);
        ExpCsv.addActionListener(e -> {
            String sourcePath = "/home/prome/NetBeansProjects/proyectoSimulacion/simulacion.csv";
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Selecciona la ruta de destino");
            int result = fileChooser.showSaveDialog(null);
            if (result != JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                return;
            }
            File destinationFile = fileChooser.getSelectedFile();
            if (!destinationFile.getName().toLowerCase().endsWith(".csv")) {
                destinationFile = new File(destinationFile.getAbsolutePath() + ".csv");
            }

            // Llamar al método para agregar encabezados y copiar el archivo
            agregarEncabezadosYCopiarCSV(sourcePath, destinationFile);
        });

        panel.add(ExpCsv);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 45, 45, botonAnio);
        botonAnio.setToolTipText("El año en el que se recopilaron los datos sobre deforestación.");
        botonAnio.setBounds(445, 75, 45, 45);
        botonAnio.setOpaque(false);
        botonAnio.setBorderPainted(false);
        botonAnio.setFocusPainted(false);
        botonAnio.setBackground(inv);
        panel.add(botonLimiteInferior);
        panel.add(botonAnio);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 45, 45, botonDeforestacion);
        botonDeforestacion.setToolTipText("Cantidad total de área deforestada en hectáreas durante ese año.");
        botonDeforestacion.setBounds(700, 75, 45, 45);
        botonDeforestacion.setOpaque(false);
        botonDeforestacion.setBorderPainted(false);
        botonDeforestacion.setFocusPainted(false);
        botonDeforestacion.setBackground(inv);
        panel.add(botonLimiteInferior);
        panel.add(botonDeforestacion);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 45, 45, botonIncertidumbre);
        botonIncertidumbre.setToolTipText("El margen de error del cálculo de deforestación, expresado en porcentaje.");
        botonIncertidumbre.setBounds(945, 75, 45, 45);
        botonIncertidumbre.setOpaque(false);
        botonIncertidumbre.setBorderPainted(false);
        botonIncertidumbre.setFocusPainted(false);
        botonIncertidumbre.setBackground(inv);
        panel.add(botonLimiteInferior);
        panel.add(botonIncertidumbre);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 45, 45, botonZAlpha);
        botonZAlpha.setToolTipText("Valor estadístico que mide la variabilidad de los datos para calcular intervalos de confianza.");
        botonZAlpha.setBounds(1190, 75, 45, 45);
        botonZAlpha.setOpaque(false);
        botonZAlpha.setBorderPainted(false);
        botonZAlpha.setFocusPainted(false);
        botonZAlpha.setBackground(inv);
        panel.add(botonLimiteInferior);
        panel.add(botonZAlpha);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 45, 45, botonLimiteInferior);
        botonLimiteInferior.setToolTipText("El valor mínimo estimado del área deforestada dentro del intervalo de confianza.");
        botonLimiteInferior.setBounds(1430, 75, 45, 45);
        botonLimiteInferior.setOpaque(false);
        botonLimiteInferior.setBorderPainted(false);
        botonLimiteInferior.setFocusPainted(false);
        botonLimiteInferior.setBackground(inv);
        panel.add(botonLimiteInferior);
        imgB("/home/prome/NetBeansProjects/proyectoSimulacion/src/imagenes/dudas.png", 45, 45, botonLimiteSuperior);
        botonLimiteSuperior.setToolTipText("El valor máximo estimado del área deforestada dentro del intervalo de confianza.");
        botonLimiteSuperior.setBounds(1685, 75, 45, 45);
        botonLimiteSuperior.setOpaque(false);
        botonLimiteSuperior.setBorderPainted(false);
        botonLimiteSuperior.setFocusPainted(false);
        botonLimiteSuperior.setBackground(inv);
        panel.add(botonLimiteSuperior);
        tabla = new JTable(mt);
        scrollPane = new JScrollPane(tabla);
        tabla.setRowHeight(46);
        scrollPane.setBounds(350, 130, 1510, 960);
        panel.add(scrollPane);
        Datos();
        panel.revalidate();
        panel.repaint();

        // Establecer el renderizador de celdas para cambiar el color de fondo de las filas
        tabla.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Cambiar el color de fondo solo para las primeras 5 filas
                if (row < 5) {
                    c.setBackground(Color.YELLOW); // Fondo amarillo para las primeras 5 filas
                } else {
                    c.setBackground(Color.WHITE); // Fondo blanco para el resto de las filas
                }
                return c;
            }
        });
    }

    private void agregarEncabezadosYCopiarCSV(String sourcePath, File destinationFile) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourcePath)); BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            String encabezados = "año,deforestacion,Incertidumbre (%),Z_alfa/2 * sigma,limite inferior,limite superior";
            writer.write(encabezados);
            writer.newLine();
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea);
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Archivo guardado correctamente en: " + destinationFile.getAbsolutePath());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar el archivo: " + ex.getMessage());
            ex.printStackTrace();
        }
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
        pintarBoton(btnEstadisticas, "<html><center>MODELO DE <br>REGRESION LINEAL</center></html>", cn22, cn22, cn4);
        btnFactores.setBounds(0, 330, 300, 60);
        pintarBoton(btnFactores, "<html><center>GRAFICA DE<br>BARRAS</center></html>", cn22, cn22, cn4);
//        btnRegresiones.setBounds(0, 395, 300, 60);
//        pintarBoton(btnRegresiones, "", cn22, cn22, cn4);
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
            Regresion("/home/prome/NetBeansProjects/proyectoSimulacion/simulacion.csv");
            barraInteraccion();
        });
        btnFactores.addActionListener(e -> {
            limpiarPanel();
            menuFactores(randomValue);
            barraInteraccion();
        });
        btnRegresiones.addActionListener(e -> {
            limpiarPanel();
            Regresion("/home/prome/NetBeansProjects/proyectoSimulacion/simulacion.csv");
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
