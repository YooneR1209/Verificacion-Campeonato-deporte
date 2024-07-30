public class Campeonato {
    // Atributos privados
    private String nombre;
    private String deporte;
    private String equipoList;
    private String jugadorList;
    private Sistema sistema;
    private String estadisticaList;

    // Constructor
    public Campeonato(String nombre, String deporte, String equipoList, String jugadorList, Sistema sistema, String estadisticaList) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.equipoList = equipoList;
        this.jugadorList = jugadorList;
        this.sistema = sistema;
        this.estadisticaList = estadisticaList;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(String equipoList) {
        this.equipoList = equipoList;
    }

    public String getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(String jugadorList) {
        this.jugadorList = jugadorList;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public String getEstadisticaList() {
        return estadisticaList;
    }

    public void setEstadisticaList(String estadisticaList) {
        this.estadisticaList = estadisticaList;
    }

    // Método toString para mostrar información del campeonato
    @Override
    public String toString() {
        return "Campeonato{" +
                "nombre='" + nombre + '\'' +
                ", deporte='" + deporte + '\'' +
                ", equipoList='" + equipoList + '\'' +
                ", jugadorList='" + jugadorList + '\'' +
                ", sistema=" + sistema +
                ", estadisticaList='" + estadisticaList + '\'' +
                '}';
    }
}
