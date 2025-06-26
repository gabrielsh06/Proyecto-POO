package logica;

import logica.personajes.*;
import logica.Jugador;

public class Combate {
    private Jugador jugador;
    private Enemigo enemigo;
    
    public Combate(Jugador jugador) {
        this.jugador = jugador;
    }
    
    public Combate(Jugador jugador, Enemigo enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
    }
    
    public enum Accion {
        ATAQUE, DEFENSA
    }
    
    public String resolverTurno(Accion accionJugador, Accion accionEnemigo) {
        StringBuilder resultado = new StringBuilder();

        Personaje pj = jugador.getPersonaje(); // más corto
        Enemigo enemigo = this.enemigo;

        if (accionJugador == Accion.DEFENSA && accionEnemigo == Accion.DEFENSA) {
            resultado.append("Ambos se defendieron. El turno termina sin daños.\n");
        } 
        else if (accionJugador == Accion.DEFENSA && accionEnemigo == Accion.ATAQUE) {
            int daño = enemigo.calcularDaño(pj) / 2;
            pj.setVida(pj.getVida() - daño);
            resultado.append("Te defendiste y el enemigo te atacó.\n");
            resultado.append("Recibiste " + daño + " de daño.\n");
        } 
        else if (accionJugador == Accion.ATAQUE && accionEnemigo == Accion.DEFENSA) {
            int daño = pj.calcularDaño(enemigo) / 2;
            enemigo.setVida(enemigo.getVida() - daño);
            resultado.append("Atacaste, pero el enemigo se defendió.\n");
            resultado.append("Le hiciste " + daño + " de daño.\n");
        } 
        else if (accionJugador == Accion.ATAQUE && accionEnemigo == Accion.ATAQUE) {
            int dañoJugador = pj.calcularDaño(enemigo);
            int dañoEnemigo = enemigo.calcularDaño(pj);
            enemigo.setVida(enemigo.getVida() - dañoJugador);
            pj.setVida(pj.getVida() - dañoEnemigo);

            resultado.append("¡Ambos atacaron!\n");
            resultado.append("Le hiciste " + dañoJugador + " de daño al enemigo.\n");
            resultado.append("Recibiste " + dañoEnemigo + " de daño.\n");
        }

        // Verificar si alguien murió
        if (!pj.estaVivo()) {
            resultado.append("\nHas sido derrotado...\n");
        } else if (!enemigo.estaVivo()) {
            resultado.append("\n¡Has ganado!\n");
        }

        return resultado.toString();
    }
    
    public Accion elegirAccionEnemigo() {
        return Math.random() < 0.5 ? Accion.ATAQUE : Accion.DEFENSA;
    }
    
    public Jugador getJugador() {
        return jugador;
    }
    public Atacable getEnemigo() {
        return enemigo;
    }
    public int getNivelActual() {
        return 1;
    }
}