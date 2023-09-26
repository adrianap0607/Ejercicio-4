import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Registrar un nuevo jugador");
            System.out.println("2. Mostrar todos los jugadores");
            System.out.println("3. Obtener los 3 mejores porteros");
            System.out.println("4. Contar extremos con más de 85% de efectividad");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese los datos del jugador:");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("País: ");
                    String país = scanner.nextLine();
                    System.out.print("Faltas: ");
                    int faltas = scanner.nextInt();
                    System.out.print("Goles Directos: ");
                    int golesDirectos = scanner.nextInt();
                    System.out.print("Total de Lanzamientos: ");
                    int totalLanzamientos = scanner.nextInt();

                    System.out.println("Tipo de jugador:");
                    System.out.println("1. Portero");
                    System.out.println("2. Extremo");
                    System.out.print("Seleccione el tipo de jugador: ");
                    int tipoJugador = scanner.nextInt();

                    Jugador jugador = null;
                    if (tipoJugador == 1) {
                        System.out.print("Paradas Efectivas: ");
                        int paradasEfectivas = scanner.nextInt();
                        System.out.print("Goles Recibidos: ");
                        int golesRecibidos = scanner.nextInt();
                        jugador = new Portero(nombre, país, faltas, golesDirectos, totalLanzamientos, paradasEfectivas, golesRecibidos);
                    } else if (tipoJugador == 2) {
                        System.out.print("Pases: ");
                        int pases = scanner.nextInt();
                        System.out.print("Asistencias Efectivas: ");
                        int asistenciasEfectivas = scanner.nextInt();
                        jugador = new Extremo(nombre, país, faltas, golesDirectos, totalLanzamientos, pases, asistenciasEfectivas);
                    } else {
                        System.out.println("Opción inválida.");
                    }

                    if (jugador != null) {
                        campeonato.registrarJugador(jugador);
                        System.out.println("Jugador registrado exitosamente.");
                    }
                    break;
                case 2:
                    System.out.println("\nTodos los jugadores registrados:");
                    campeonato.mostrarJugadores();
                    break;
                case 3:
                    System.out.println("\nLos 3 mejores porteros:");
                    List<Portero> mejoresPorteros = campeonato.obtenerMejoresPorteros();
                    for (Portero portero : mejoresPorteros) {
                        System.out.println(portero);
                    }
                    break;
                case 4:
                    long extremosConAltaEfectividad = campeonato.contarExtremosConAltaEfectividad();
                    System.out.println("\nCantidad de extremos con más de 85% de efectividad: " + extremosConAltaEfectividad);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
