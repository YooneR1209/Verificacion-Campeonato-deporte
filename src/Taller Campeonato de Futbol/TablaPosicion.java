import java.util.List;

public class TablaPosicion {

    // Atributo privado
    private List<Equipo> posicionList;

    // Método público
    public void actualizarTabla(List<Equipo> posicionList) {
        this.posicionList = posicionList;
        // Lógica adicional para actualizar la tabla puede ser agregada aquí
    }

    // Método getter para posicionList (opcional)
    public List<Equipo> getPosicionList() {
        return posicionList;
    }

    // Método setter para posicionList (opcional)
    public void setPosicionList(List<Equipo> posicionList) {
        this.posicionList = posicionList;
    }
}
