class Jugador extends Persona {
    public Jugador(String nombre, int edad) {
        super(nombre, edad);
        
    }

    // Atributo privado
    private String equipo;

    // Método público
    public EstadisticaIndividual jugar() {
        // Implementación del método jugar
        
        return new EstadisticaIndividual();
    }
}
