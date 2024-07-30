public class Estadistica {
    private String tablaPosicionList;
    private String estadisticaIndividualList;

    public Estadistica(String tablaPosicionList, String estadisticaIndividualList) {
        this.tablaPosicionList = tablaPosicionList;
        this.estadisticaIndividualList = estadisticaIndividualList;
    }

    public void actualizarPosiciones() {
        // Lógica para actualizar posiciones
        System.out.println("Actualizando posiciones en la tabla: " + tablaPosicionList);
    }

    public void actualizarEstadisticasIndividuales() {
        // Lógica para actualizar estadísticas individuales
        System.out.println("Actualizando estadísticas individuales: " + estadisticaIndividualList);
    }

    // Getters y setters
    public String getTablaPosicionList() {
        return tablaPosicionList;
    }

    public void setTablaPosicionList(String tablaPosicionList) {
        this.tablaPosicionList = tablaPosicionList;
    }

    public String getEstadisticaIndividualList() {
        return estadisticaIndividualList;
    }

    public void setEstadisticaIndividualList(String estadisticaIndividualList) {
        this.estadisticaIndividualList = estadisticaIndividualList;
    }
}
