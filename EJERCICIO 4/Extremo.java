public class Extremo extends Jugador {
    private int pases;
    private int asistenciasEfectivas;

    public Extremo(String nombre, String país, int faltas, int golesDirectos, int totalLanzamientos,
                   int pases, int asistenciasEfectivas) {
        super(nombre, país, faltas, golesDirectos, totalLanzamientos);
        this.pases = pases;
        this.asistenciasEfectivas = asistenciasEfectivas;
    }

    // Getters y setters

    public int getPases() {
        return pases;
    }

    public int getAsistenciasEfectivas() {
        return asistenciasEfectivas;
    }

    // Método para calcular la efectividad para un extremo
    @Override
    public double calcularEfectividad() {
        return ((pases + asistenciasEfectivas - getFaltas()) * 100.0
                / (pases + asistenciasEfectivas + getFaltas()))
                + (getGolesDirectos() * 100.0 / getTotalLanzamientos());
    }
}
