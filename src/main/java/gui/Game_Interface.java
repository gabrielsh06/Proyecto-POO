/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.*;

import logica.Combate;
import logica.Combate.Accion;
import logica.personajes.Enemigo;
import logica.Jugador;
import logica.Partida;
import persistencia.PartidaDAO;

public class Game_Interface extends javax.swing.JFrame {
    
    private String nombre;
    private Partida partida;
    private Jugador jugador;
    
    private List<Enemigo> listaEnemigos;
    private int indiceEnemigo = 0;
    private Enemigo enemigoActual;
    private Combate combate;
    
    /**
     * Creates new form Game_Interface
     */
    
    public Game_Interface(Jugador jugador) {
        this.nombre = jugador.getNombre();
        this.jugador = jugador;

        this.listaEnemigos = new ArrayList<>();
        listaEnemigos.add(new Enemigo("Orco", 50, 50));
        listaEnemigos.add(new Enemigo("Muerto", 40, 10));
        listaEnemigos.add(new Enemigo("Duende", 40, 10));

        enemigoActual = listaEnemigos.get(indiceEnemigo);
        combate = new Combate(jugador, enemigoActual);
        
        this.partida = new Partida(
            0, // id ficticio
            jugador.getId(),
            1, // nivel inicial
            jugador.getPersonaje().getVida(), // vida completa
            enemigoActual.getVida(), // vida completa del enemigo
            LocalDateTime.now().toString() // o la fecha actual
        );

        
        try {
            initComponents();
            jPanel1.setBackground(new java.awt.Color(35, 35, 35));
            jPanel2.setBackground(new java.awt.Color(35, 35, 35));
            txtCombate.setBackground(Color.DARK_GRAY);
            txtCombate.setForeground(Color.WHITE);
            System.out.println("Constructor funcionando correctamente");

            actualizarBarraDeVida();
            actualizarBarraDeVidaEnemigo();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar la ventana:\n" + e.getMessage());
        }
    }

    
    public Game_Interface(Jugador jugador, Partida partida) {
        this.nombre = jugador.getNombre();
        this.partida = partida;
        
        this.jugador = jugador;
        
        List<Enemigo> listaEnemigos = new ArrayList<>();
        listaEnemigos.add(new Enemigo("Orco", 50, 50));
        listaEnemigos.add(new Enemigo("Muerto", 40, 10));
        listaEnemigos.add(new Enemigo("Duende",40, 10));
        
        enemigoActual = listaEnemigos.get(indiceEnemigo);
        enemigoActual.setVida(partida.getVidaEnemigo());
        jugador.getPersonaje().setVida(partida.getVida()); 
        
        combate = new Combate(jugador, enemigoActual);
        
        try {
            initComponents();
            jPanel1.setBackground(new java.awt.Color(35, 35, 35));
            jPanel2.setBackground(new java.awt.Color(35, 35, 35));
            txtCombate.setBackground(Color.DARK_GRAY);
            txtCombate.setForeground(Color.WHITE);
            System.out.println("Constructor funcionando correctamente");
            
            actualizarBarraDeVida();
            actualizarBarraDeVidaEnemigo();
            
        } catch (Exception e) { // Muestra el error en consola
            // Muestra el error en consola
            JOptionPane.showMessageDialog(null, "Error al iniciar la ventana:\n" + e.getMessage());
        }   
    }
    
    private void actualizarBarraDeVida() {
        int vidaActual = partida.getVida(); // vida que se guardó
        int vidaMaxima = jugador.getPersonaje().getVidaMaxima(); // valor fijo, por ejemplo 100

        vidaBar1.setMaximum(vidaMaxima);
        vidaBar1.setValue(vidaActual);
        vidaBar1.setString(vidaActual + "/" + vidaMaxima); // si usas setStringPainted(true)
    }

    private void actualizarBarraDeVidaEnemigo() {
        int vidaActual = partida.getVidaEnemigo(); // valor guardado
        int vidaMaxima = 100; // o el valor que uses para enemigos

        vidaBar2.setMaximum(vidaMaxima);
        vidaBar2.setValue(vidaActual);
        vidaBar2.setString(vidaActual + "/" + vidaMaxima);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_menu = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        vidaBar2 = new javax.swing.JProgressBar();
        vidaBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        btnAtacar = new javax.swing.JButton();
        btnDefender = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCombate = new javax.swing.JTextArea();

        jButton2.setText("Defend");

        jButton1.setText("Attack");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_menu.setText("Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        btn_save.setText("Save Game");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(35, 35, 35));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Gadugi", 2, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("En un mundo dividido por el fuego y la magia, dos antiguos rivales se\nenfrentan una vez más.\nDragon Knight, el guerrero imparable de escamas y acero, ha jurado proteger\nel reino de las amenazas arcanas.\nInvoker, el maestro de los mil hechizos, busca dominar los secretos del \nuniverso, sin que nadie le imponga límites.\n¡Ataca con estrategia, defiéndete con sabiduría... y conquista la victoria!");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        vidaBar2.setBackground(new java.awt.Color(51, 153, 0));
        vidaBar2.setString("Vida: 100/100");
        vidaBar2.setStringPainted(true);

        vidaBar1.setBackground(new java.awt.Color(51, 153, 0));
        vidaBar1.setForeground(new java.awt.Color(102, 204, 0));
        vidaBar1.setToolTipText("");
        vidaBar1.setName(""); // NOI18N
        vidaBar1.setString("Vida: 100/100");
        vidaBar1.setStringPainted(true);

        jPanel2.setBackground(new java.awt.Color(35, 35, 35));

        btnAtacar.setBackground(new java.awt.Color(217, 79, 79));
        btnAtacar.setText("Atacar");
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });

        btnDefender.setBackground(new java.awt.Color(58, 79, 102));
        btnDefender.setText("Defender");
        btnDefender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnAtacar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDefender, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtacar)
                    .addComponent(btnDefender))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        txtCombate.setEditable(false);
        txtCombate.setColumns(20);
        txtCombate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCombate.setLineWrap(true);
        txtCombate.setRows(5);
        txtCombate.setWrapStyleWord(true);
        txtCombate.setCaretColor(new java.awt.Color(30, 30, 30));
        jScrollPane2.setViewportView(txtCombate);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(vidaBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(233, 233, 233)
                                .addComponent(vidaBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(vidaBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vidaBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
        btnAtacar.setEnabled(false);
        btnDefender.setEnabled(false);

        Accion accionJugador = Accion.ATAQUE;
        txtCombate.setText("Atacaste al enemigo...\n");
        
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Accion accionEnemigo = combate.elegirAccionEnemigo();
                String resultado = combate.resolverTurno(accionJugador, accionEnemigo);
                txtCombate.setText(resultado);
                partida.actualizarDesdeCombate(combate);
                actualizarBarraDeVida();
                actualizarBarraDeVidaEnemigo();
                if (combate.getEnemigo().getVida() <= 0) {
                    txtCombate.append("\n¡Has derrotado al enemigo!");
                    btnAtacar.setEnabled(false);
                    btnDefender.setEnabled(false);
                } else {
                    btnAtacar.setEnabled(true);
                    btnDefender.setEnabled(true);
                }
            }
        });
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_btnAtacarActionPerformed

    private void btnDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefenderActionPerformed
        btnAtacar.setEnabled(false);
        btnDefender.setEnabled(false);
        
        Accion accionJugador = Accion.DEFENSA;
        txtCombate.setText("Te defendiste del enemigo...\n");
        
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Accion accionEnemigo = combate.elegirAccionEnemigo();
                String resultado = combate.resolverTurno(accionJugador, accionEnemigo);
                txtCombate.setText(resultado);
                partida.actualizarDesdeCombate(combate);
                actualizarBarraDeVida();
                actualizarBarraDeVidaEnemigo();

                if (combate.getEnemigo().getVida() <= 0) {
                    txtCombate.append("\n¡Has derrotado al enemigo!");
                    btnAtacar.setEnabled(false);
                    btnDefender.setEnabled(false);
                } else {
                    btnAtacar.setEnabled(true);
                    btnDefender.setEnabled(true);
                }

            }
        });
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_btnDefenderActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        PartidaDAO partidaDAO = new PartidaDAO();
        
        partida.actualizarDesdeCombate(combate);
            partidaDAO.insertarPartida(
                partida.getIdJugador(),
                partida.getNivelMapa(),
                partida.getVida(),
                partida.getVidaEnemigo()
        );
        JOptionPane.showMessageDialog(this, "Partida guardada exitosamente");
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        Bienvenida_Interface inicio = new Bienvenida_Interface();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_menuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnDefender;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtCombate;
    private javax.swing.JProgressBar vidaBar1;
    private javax.swing.JProgressBar vidaBar2;
    // End of variables declaration//GEN-END:variables
}
