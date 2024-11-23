package proyectosimulacion;

import java.util.ArrayList;
import java.util.List;

public class DeforestationProjection {

    // Método para proyectar la deforestación anual usando un modelo exponencial
    public static List<Double> proyectarDeforestacion(double areaInicial, double tasaDeforestacion, int anioInicial, int aniosAProyectar) {
        List<Double> areasProyectadas = new ArrayList<>();

        // Calcular el área forestal proyectada para cada año
        for (int i = 0; i <= aniosAProyectar; i++) {
            int anio = anioInicial + i;
            double area = areaInicial * Math.exp(tasaDeforestacion * (anio - anioInicial));
            areasProyectadas.add(area);
        }
        return areasProyectadas;
    }

    public static void main(String[] args) {
        // Parámetros de entrada para la simulación
        double areaInicial = 501948;      // área forestal inicial en hectáreas
        double tasaDeforestacion = -0.0238; // tasa de deforestación anual (ej., -2.38%)
        int anioInicial = 2022;            // año de inicio de la proyección
        int aniosAProyectar = 5;           // número de años para proyectar

        // Ejecutar la proyección
        List<Double> resultados = proyectarDeforestacion(areaInicial, tasaDeforestacion, anioInicial, aniosAProyectar);

        // Mostrar los resultados
        System.out.println("Año\tÁrea forestal proyectada (hectáreas)");
        for (int i = 0; i <= aniosAProyectar; i++) {
            int anio = anioInicial + i;
            System.out.printf("%d\t%.2f%n", anio, resultados.get(i));
        }
    }
}