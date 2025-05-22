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
    public void insertarPartida(int idJugador, int nivel, int vida) {
        String sql = "INSERT INTO partidas (id_jugador, nivel, vida, fecha) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            String fechaActual = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            pstmt.setInt(1, idJugador);
            pstmt.setInt(2, nivel);
            pstmt.setInt(3, vida);
            pstmt.setString(4, fechaActual);

            pstmt.executeUpdate();
            System.out.println("Partida guardada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // **** Cargar partida ****
    public List<Partida> obtenerPartidasPorJugador(int idJugador) {
        List<Partida> lista = new ArrayList<>();
        String sql = "SELECT * FROM partidas WHERE id_jugador = ?";

        try (Connection conn = ConexionSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idJugador);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int nivel = rs.getInt("nivel");
                int vida = rs.getInt("vida");
                String fecha = rs.getString("fecha");

                Partida partida = new Partida(id, idJugador, nivel, vida, fecha);
                lista.add(partida);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}