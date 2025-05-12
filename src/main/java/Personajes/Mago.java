package Personajes;

public class Mago extends Personaje{
    private final int inteligencia;
    private final int magia;    
    
    public Mago(int fuerza, int escudo, int inteligencia, int magia) {
        super("nombreDefault", "Mago", 100, fuerza, escudo);
        this.inteligencia = inteligencia;
        this.magia = magia;
    }
    
    @Override
    public int calcularDaño(Atacable objetivo) {
        int daño = inteligencia * magia - objetivo.getEscudo();
        return Math.max(0, daño);
    }
}