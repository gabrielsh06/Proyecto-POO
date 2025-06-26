package logica.personajes;

public class Mago extends Personaje{
    private final int inteligencia;
    private final int magia;    
    
    public Mago() {
        super("nombreDefault", "Mago", 100, 5, 20);
        this.inteligencia = 10;
        this.magia = 10;
    }
    
    @Override
    public String getTipo() {
        return "Mago";
    }
    
    @Override
    public int calcularDaño(Atacable objetivo) {
        int daño = inteligencia * magia - objetivo.getEscudo();
        return Math.max(0, daño);
    }
}