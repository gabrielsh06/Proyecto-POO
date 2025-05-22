package logica;

public class Jugador {
    private int id;
    private String nombre;
    private String tipo;
    
    public Jugador(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    // Guetters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getTipo() {return tipo; }
}
