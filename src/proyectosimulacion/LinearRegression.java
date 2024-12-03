package proyectosimulacion;

import java.util.List;

public class LinearRegression {

    private final double slope;
    private final double intercept;

    public LinearRegression(List<Integer> x, List<Double> y) {

        if (x == null || y == null) {
            throw new IllegalArgumentException("Las listas no deben ser nulas.");
        }
        if (x.size() != y.size() || x.isEmpty()) {
            throw new IllegalArgumentException("Las listas deben tener el mismo tamaño y no estar vacías.");
        }
        if (x.contains(null) || y.contains(null)) {
            throw new IllegalArgumentException("Las listas no deben contener valores nulos.");
        }
        if (x.size() != y.size() || x.isEmpty()) {
            throw new IllegalArgumentException("Las listas deben tener el mismo tamaño y no estar vacías.");
        }

        int n = x.size();
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += x.get(i);
            sumY += y.get(i);
            sumXY += x.get(i) * y.get(i);
            sumX2 += x.get(i) * x.get(i);
        }

        double meanX = sumX / n;
        double meanY = sumY / n;

        // Cálculo de la pendiente (slope) y la intersección (intercept)
        slope = (sumXY - n * meanX * meanY) / (sumX2 - n * meanX * meanX);
        intercept = meanY - slope * meanX;
    }

    public double predict(int x) {
        return slope * x + intercept;
    }
}
