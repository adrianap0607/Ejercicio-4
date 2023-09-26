
public class Jugador {
    private String nombre;
    private String pais;
    private int faltas;
    private int golesDirectos;
    private int totalLanzamientos;

    public Jugador(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos) {
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.golesDirectos = golesDirectos;
        this.totalLanzamientos = totalLanzamientos;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getFaltas() {
        return faltas;
    }

    public int getGolesDirectos() {
        return golesDirectos;
    }

    public int getTotalLanzamientos() {
        return totalLanzamientos;
    }

    // Método para calcular la efectividad (a implementar en subclases)
    public double calcularEfectividad() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", País: " + pais + ", Efectividad: " + calcularEfectividad();
    }
}
