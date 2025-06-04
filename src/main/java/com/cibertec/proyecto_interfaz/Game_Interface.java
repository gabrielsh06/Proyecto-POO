/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cibertec.proyecto_interfaz;

import javax.swing.JOptionPane;

public class Game_Interface extends javax.swing.JFrame {
    int vidaJugador1 = 100;
    int manaJugador1 = 100;
    int vidaJugador2 = 100;
    int manaJugador2 = 100;
    boolean turnoDeJugador1 = true;
    /**
     * Creates new form Game_Interface
     */
    public Game_Interface() {
         try {
        initComponents();
        System.out.println("Constructor funcionando correctamente");
    } catch (Exception e) {
        e.printStackTrace(); // Muestra el error en consola
        JOptionPane.showMessageDialog(null, "Error al iniciar la ventana:\n" + e.getMessage());
    }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_load = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lbInv = new javax.swing.JLabel();
        lbDK = new javax.swing.JLabel();
        manaBar2 = new javax.swing.JProgressBar();
        vidaBar2 = new javax.swing.JProgressBar();
        vidaBar1 = new javax.swing.JProgressBar();
        manaBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        btnAtacar = new javax.swing.JButton();
        btnDefender = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        btnPasar = new javax.swing.JButton();
        estadoLabel = new javax.swing.JLabel();

        jButton2.setText("Defend");

        jButton1.setText("Attack");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        btn_load.setText("Load Game");

        btn_save.setText("Save Game");

        jTextArea1.setBackground(new java.awt.Color(35, 35, 35));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Gadugi", 2, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("En un mundo dividido por el fuego y la magia, dos antiguos rivales se\nenfrentan una vez más.\nDragon Knight, el guerrero imparable de escamas y acero, ha jurado proteger\nel reino de las amenazas arcanas.\nInvoker, el maestro de los mil hechizos, busca dominar los secretos del \nuniverso, sin que nadie le imponga límites.\n¡Ataca con estrategia, defiéndete con sabiduría... y conquista la victoria!");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        lbInv.setForeground(new java.awt.Color(255, 255, 255));
        lbInv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInv.setText("Invoker");

        lbDK.setForeground(new java.awt.Color(255, 255, 255));
        lbDK.setText("Dragon Knight");

        manaBar2.setBackground(new java.awt.Color(0, 153, 204));
        manaBar2.setForeground(new java.awt.Color(102, 204, 0));
        manaBar2.setToolTipText("");
        manaBar2.setName(""); // NOI18N
        manaBar2.setString("Mana: 100/100");
        manaBar2.setStringPainted(true);

        vidaBar2.setBackground(new java.awt.Color(51, 153, 0));
        vidaBar2.setString("Vida: 100/100");
        vidaBar2.setStringPainted(true);

        vidaBar1.setBackground(new java.awt.Color(51, 153, 0));
        vidaBar1.setForeground(new java.awt.Color(102, 204, 0));
        vidaBar1.setToolTipText("");
        vidaBar1.setName(""); // NOI18N
        vidaBar1.setString("Vida: 100/100");
        vidaBar1.setStringPainted(true);

        manaBar1.setBackground(new java.awt.Color(0, 153, 204));
        manaBar1.setForeground(new java.awt.Color(102, 204, 0));
        manaBar1.setToolTipText("");
        manaBar1.setName(""); // NOI18N
        manaBar1.setString("Mana: 100/100");
        manaBar1.setStringPainted(true);

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

        btnRecargar.setBackground(new java.awt.Color(204, 255, 255));
        btnRecargar.setText("Recargar Maná");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        btnPasar.setBackground(new java.awt.Color(255, 255, 204));
        btnPasar.setText("Pasar  Turno");
        btnPasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(22, 22, 22)
                .addComponent(btnRecargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtacar)
                    .addComponent(btnDefender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPasar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        estadoLabel.setBackground(new java.awt.Color(35, 35, 35));
        estadoLabel.setForeground(new java.awt.Color(255, 255, 255));
        estadoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadoLabel.setText("Bienvenidos al Combate!!");

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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(manaBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vidaBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(233, 233, 233)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(vidaBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(manaBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(estadoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(123, 123, 123))))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(lbInv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbDK)
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_load, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_load, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbInv, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDK))
                        .addGap(51, 51, 51)
                        .addComponent(estadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(vidaBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manaBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(vidaBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manaBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        if (turnoDeJugador1) {
            if (manaJugador1 >= 10) {
            manaJugador1 -= 10;
            vidaJugador2 = Math.max(vidaJugador2 - 15, 0);
            estadoLabel.setText("Invoker atacó a Dragon Knight (-15 HP)");
            } else {
                estadoLabel.setText("Invoker no tiene suficiente maná.");
            }
        } else {
            if (manaJugador2 >= 10) {
            manaJugador2 -= 10;
            vidaJugador1 = Math.max(vidaJugador1 - 15, 0);
            estadoLabel.setText("Dragon Knight atacó a Invoker (-15 HP)");
            } else {
                estadoLabel.setText("Dragon Knight no tiene suficiente maná.");
            }
        }
        actualizarBarras();
        turnoDeJugador1 = !turnoDeJugador1;
    }//GEN-LAST:event_btnAtacarActionPerformed

    private void btnPasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasarActionPerformed
        estadoLabel.setText((turnoDeJugador1 ? "Invoker" : "Dragon Knight") + " pasó su turno.");
        turnoDeJugador1 = !turnoDeJugador1;
    }//GEN-LAST:event_btnPasarActionPerformed

    private void btnDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefenderActionPerformed
        estadoLabel.setText((turnoDeJugador1 ? "Invoker" : "Dragon Knight") + " se defendió (simulado)");
        turnoDeJugador1 = !turnoDeJugador1;
    }//GEN-LAST:event_btnDefenderActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
         if (turnoDeJugador1) {
                manaJugador1 = Math.min(manaJugador1 + 15, 100);
                estadoLabel.setText("Invoker recargó 15 de maná.");
            } else {
                manaJugador2 = Math.min(manaJugador2 + 15, 100);
                estadoLabel.setText("Dragon Knight recargó 15 de maná.");
            }
            actualizarBarras();
            turnoDeJugador1 = !turnoDeJugador1;
    }//GEN-LAST:event_btnRecargarActionPerformed
    private void actualizarBarras() {
        vidaBar1.setValue(vidaJugador1);
        manaBar1.setValue(manaJugador1);
        vidaBar2.setValue(vidaJugador2);
        manaBar2.setValue(manaJugador2);
    }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Game_Interface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnDefender;
    private javax.swing.JButton btnPasar;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btn_load;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbDK;
    private javax.swing.JLabel lbInv;
    private javax.swing.JProgressBar manaBar1;
    private javax.swing.JProgressBar manaBar2;
    private javax.swing.JProgressBar vidaBar1;
    private javax.swing.JProgressBar vidaBar2;
    // End of variables declaration//GEN-END:variables
}
