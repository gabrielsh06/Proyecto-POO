package logica;

public class Partida {
    private int id;
    private int idJugador;
    private int nivelMapa;
    private int vida;
    private String fecha;
    
    public Partida(int id, int idJugador, int nivelMapa, int vida, String fecha) {
        this.id = id;
        this.idJugador = idJugador;
        this.nivelMapa = nivelMapa;
        this.vida = vida;
        this.fecha = fecha;
    }
    
    // Getters
    public int getId() { return id; }
    public int getIdJugador() { return idJugador; }
    public int getNivelMapa() { return nivelMapa; }
    public int getVida() { return vida; }
    public String getFecha() { return fecha; }
}
