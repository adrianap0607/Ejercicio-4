public class Portero extends Jugador {
    private int paradasEfectivas;
    private int golesRecibidos;

    public Portero(String nombre, String país, int faltas, int golesDirectos, int totalLanzamientos,
                   int paradasEfectivas, int golesRecibidos) {
        super(nombre, país, faltas, golesDirectos, totalLanzamientos);
        this.paradasEfectivas = paradasEfectivas;
        this.golesRecibidos = golesRecibidos;
    }

    // Getters y setters

    public int getParadasEfectivas() {
        return paradasEfectivas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    // Método para calcular la efectividad para un portero
    @Override
    public double calcularEfectividad() {
        return ((paradasEfectivas - golesRecibidos) * 100.0 / (paradasEfectivas + golesRecibidos))
                + (getGolesDirectos() * 100.0 / getTotalLanzamientos());
    }
}
