public class Estadistica {

    private String estadisticaIndividualList;

    public Estadistica(String tablaPosicionList, String estadisticaIndividualList) {
        this.estadisticaIndividualList = estadisticaIndividualList;
    }

    public void actualizarEstadisticasIndividuales() {
        // Lógica para actualizar estadísticas individuales
        System.out.println("Actualizando estadísticas individuales: " + estadisticaIndividualList);
    }


    public String getEstadisticaIndividualList() {
        return estadisticaIndividualList;
    }

    public void setEstadisticaIndividualList(String estadisticaIndividualList) {
        this.estadisticaIndividualList = estadisticaIndividualList;
    }
}
