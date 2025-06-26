package persistencia;

import logica.Partida;
import persistencia.ConexionSQLite;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PartidaDAO {
    
    // **** Guardar Partida ****
    public void insertarPartida(int idJugador, int nivel, int vida, int enemigo) {
        String sql = "INSERT INTO partidas (jugador_id, nivel_mapa, vida, vida_enemigo, fecha_guardado) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexionSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            String fechaActual = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            pstmt.setInt(1, idJugador);
            pstmt.setInt(2, nivel);
            pstmt.setInt(3, vida);
            pstmt.setInt(4, enemigo);
            pstmt.setString(5, fechaActual);

            pstmt.executeUpdate();
            System.out.println("Partida guardada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Insertando partida para jugador con ID: " + idJugador);

    }
    
    // **** Cargar partida ****
    public List<Partida> obtenerPartidasPorJugador(int jugador_id) {
        List<Partida> lista = new ArrayList<>();
        String sql = "SELECT * FROM partidas WHERE jugador_id = ?";

        try (Connection conn = ConexionSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, jugador_id);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int nivel_mapa = rs.getInt("nivel_mapa");
                int vida = rs.getInt("vida");
                int vidaEnemigo = rs.getInt("vida_enemigo");
                String fecha = rs.getString("fecha_guardado");

                Partida partida = new Partida(id, jugador_id, nivel_mapa, vida, vidaEnemigo, fecha);
                lista.add(partida);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}