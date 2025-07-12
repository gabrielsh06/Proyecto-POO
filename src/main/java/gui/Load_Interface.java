package gui;


import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import logica.Jugador;
import logica.Partida;
import persistencia.*;

/**
 *
 * @author ANDRE
 */
public class Load_Interface extends javax.swing.JFrame {

    List<Jugador> jugadores = new ArrayList<>();
    
    public Load_Interface() {
        initComponents();
        
        PartidaDAO partidaDAO = new PartidaDAO();
        JugadorDAO jugadorDAO = new JugadorDAO();
        
        jugadores = jugadorDAO.obtenerJugadores();
        
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for (Jugador jugador : jugadores) {
            if (jugador.getPersonaje() != null) {
                modeloLista.addElement(jugador.getNombre() + " (" + jugador.getPersonaje().getTipo() + ")");
            } else {
                modeloLista.addElement(jugador.getNombre() + " (SIN PERSONAJE)");
            }
        }
        System.out.println("Jugadores encontrados: " + jugadores.size());
        liList.setModel(modeloLista);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        scrollPartidas = new javax.swing.JScrollPane();
        panelContenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liList = new javax.swing.JList<>();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOAD GAME");

        btnLoad.setBackground(new java.awt.Color(30, 30, 30));
        btnLoad.setText("LOAD");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(30, 30, 30));
        btnBack.setText("BACK MENU");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        liList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(liList);

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );

        scrollPartidas.setViewportView(panelContenedor);

        btnDelete.setBackground(new java.awt.Color(30, 30, 30));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(scrollPartidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPartidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        int index = liList.getSelectedIndex();
    
        if (index != -1) {
            Jugador jugadorSeleccionado = jugadores.get(index);

            PartidaDAO partidaDAO = new PartidaDAO();
            List<Partida> partidas = partidaDAO.obtenerPartidasPorJugador(jugadorSeleccionado.getId());

            if (!partidas.isEmpty()) {
                Partida ultimaPartida = partidas.get(partidas.size() - 1); // La última

                // Aquí llamas a la ventana del juego
                Game_Interface game = new Game_Interface(jugadorSeleccionado, ultimaPartida);
                game.setVisible(true);
                game.setLocationRelativeTo(null);
                this.dispose(); // Cierra la ventana actual
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Este jugador no tiene partidas guardadas.");
            }
            System.out.println("ID del jugador seleccionado: " + jugadorSeleccionado.getId());

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecciona un jugador para cargar su partida.");
        }
        
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int index = liList.getSelectedIndex();

    if (index != -1) {
        Jugador jugadorSeleccionado = jugadores.get(index);
        int idJugador = jugadorSeleccionado.getId();

        PartidaDAO partidaDAO = new PartidaDAO();
        JugadorDAO jugadorDAO = new JugadorDAO();

        List<Partida> partidas = partidaDAO.obtenerPartidasPorJugador(idJugador);

        if (!partidas.isEmpty()) {
            Partida ultimaPartida = partidas.get(partidas.size() - 1); // Última

            int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "¿Seguro que deseas eliminar la última partida de este jugador?\n" +
                "Si no tiene más partidas, también se eliminará el jugador.",
                "Confirmar eliminación", javax.swing.JOptionPane.YES_NO_OPTION);

            if (confirm == javax.swing.JOptionPane.YES_OPTION) {
                partidaDAO.eliminarPartida(ultimaPartida.getId());

                // Verificar si aún tiene más partidas
                int cantidad = partidaDAO.contarPartidasPorJugador(idJugador);
                if (cantidad == 0) {
                    jugadorDAO.eliminarJugadorPorId(idJugador);
                }

                // Refrescar la lista
                javax.swing.JOptionPane.showMessageDialog(this, "Partida (y jugador si era el único) eliminados.");
                recargarListaJugadores();
            }

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Este jugador no tiene partidas que eliminar.");
        }

    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecciona un jugador para eliminar su partida.");
    }
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    private void recargarListaJugadores() {
    JugadorDAO jugadorDAO = new JugadorDAO();
    jugadores = jugadorDAO.obtenerJugadores();

    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    for (Jugador jugador : jugadores) {
        if (jugador.getPersonaje() != null) {
            modeloLista.addElement(jugador.getNombre() + " (" + jugador.getPersonaje().getTipo() + ")");
        } else {
            modeloLista.addElement(jugador.getNombre() + " (SIN PERSONAJE)");
        }
    }
    liList.setModel(modeloLista);
}

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> liList;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JScrollPane scrollPartidas;
    // End of variables declaration//GEN-END:variables
}
