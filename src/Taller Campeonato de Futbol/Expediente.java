public class Expediente {
    
    private Equipo ultimoCampeon;
    private String descripcion;
    private String historial;
    private String fechaInicio;
    private String fechaFin;

    public void actualizarExpediente(Campeonato campeonato) {
        // Implementación del método para actualizar el expediente basado en el campeonato
    }

    // Getters y setters
    public Equipo getUltimoCampeon() {
        return ultimoCampeon;
    }

    public void setUltimoCampeon(Equipo ultimoCampeon) {
        this.ultimoCampeon = ultimoCampeon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}
