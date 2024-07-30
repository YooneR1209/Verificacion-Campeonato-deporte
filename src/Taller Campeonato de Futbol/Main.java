public class Main {
    public static void main(String[] args) {
        Estadistica estadistica = new Estadistica("Tabla de Posiciones", "Lista de Estadísticas Individuales");
        Equipo equipo = new Equipo("Los Guerreros", 1);

        equipo.agregarJugador("Juan Pérez");
        equipo.agregarJugador("Carlos Sánchez");

        equipo.inscribirEquipo();
        equipo.inscribirJugador("Juan Pérez");

        equipo.actualizarEstadisticas(estadistica);
    }
}
