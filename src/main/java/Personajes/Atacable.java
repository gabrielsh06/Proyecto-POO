package Personajes;

public interface Atacable {
    
    // **** Conocer Estado ****
    
    String getTipo();
    void setTipo(String tipo);
    int getEscudo();
    void setEscudo(int escudo);
    int getVida();
    void setVida(int vida);
    boolean estaVivo();
    void morir();
    
    // **** Acción Atacar ****
    
    int calcularDaño(Atacable objetivo);
    void atacar(Atacable objetivo);
}