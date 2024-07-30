import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private int posicion;
    private List<String> jugadores;

    public Equipo(String nombre, int posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(String jugador) {
        jugadores.add(jugador);
        System.out.println("Jugador " + jugador + " agregado al equipo " + nombre);
    }

    public void removerJugador(String jugador) {
        jugadores.remove(jugador);
        System.out.println("Jugador " + jugador + " removido del equipo " + nombre);
    }

    public void inscribirEquipo() {
        // Lógica para inscribir el equipo
        System.out.println("Equipo " + nombre + " inscrito en la competición");
    }

    public void inscribirJugador(String jugador) {
        // Lógica para inscribir un jugador
        System.out.println("Jugador " + jugador + " inscrito en el equipo " + nombre);
    }

    public void actualizarEstadisticas(Estadistica estadistica) { // Dependencia
        estadistica.actualizarEstadisticasIndividuales();
        System.out.println("Estadísticas actualizadas para el equipo " + nombre);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public List<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<String> jugadores) {
        this.jugadores = jugadores;
    }
}
