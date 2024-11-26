package proyectosimulacion;

/**
 *
 * @author prome
 */
public class SimulacionDatos {

    private int anioSeleccionado;
    private int aniosASimular;

    public SimulacionDatos(int anioSeleccionado, int aniosASimular) {
        this.anioSeleccionado = anioSeleccionado;
        this.aniosASimular = aniosASimular;
    }

    public int getAnioSeleccionado() {
        return anioSeleccionado;
    }

    public int getAniosASimular() {
        return aniosASimular;
    }
}
