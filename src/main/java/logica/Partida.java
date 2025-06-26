package logica;

public class Partida {
    private int id;
    private int idJugador;
    private int nivelMapa;
    private int vida;
    private int vidaEnemigo;
    private String fecha;
    
    public Partida(int id, int idJugador, int nivelMapa, int vida, int vidaEnemigo, String fecha) {
        this.id = id;
        this.idJugador = idJugador;
        this.nivelMapa = nivelMapa;
        this.vida = vida;
        this.vidaEnemigo = vidaEnemigo;
        this.fecha = fecha;
    }
    
    public void actualizarDesdeCombate(Combate combate) {
        this.vida = combate.getJugador().getPersonaje().getVida();
        this.vidaEnemigo = combate.getEnemigo().getVida();
        // puedes actualizar nivel también si quieres
    }
    
    
    // Getters
    public int getId() { return id; }
    public int getIdJugador() { return idJugador; }
    public int getNivelMapa() { return nivelMapa; }
    public int getVida() { return vida; }
    public int getVidaEnemigo() { return vidaEnemigo; }
    public String getFecha() { return fecha; }
    
    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setVidaEnemigo(int vidaEnemigo) {
        this.vidaEnemigo = vidaEnemigo;
    }

    public void setNivelMapa(int nivelMapa) {
        this.nivelMapa = nivelMapa;
    }
}
