import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Campeonato {
    private List<Jugador> jugadores;

    public Campeonato() {
        jugadores = new ArrayList<>();
    }

    // Método para registrar un jugador
    public void registrarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    // Método para mostrar todos los jugadores registrados
    public void mostrarJugadores() {
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }

    // Método para obtener los 3 mejores porteros por efectividad
    public List<Portero> obtenerMejoresPorteros() {
        List<Portero> mejoresPorteros = new ArrayList<>();
        jugadores.stream()
                .filter(jugador -> jugador instanceof Portero)
                .map(jugador -> (Portero) jugador)
                .sorted(Comparator.comparingDouble(Portero::calcularEfectividad).reversed())
                .limit(3)
                .forEach(mejoresPorteros::add);
        return mejoresPorteros;
    }

    // Método para contar la cantidad de extremos con más de un 85% de efectividad
    public long contarExtremosConAltaEfectividad() {
        return jugadores.stream()
                .filter(jugador -> jugador instanceof Extremo)
                .mapToDouble(Jugador::calcularEfectividad)
                .filter(efectividad -> efectividad > 85.0)
                .count();
    }
}
