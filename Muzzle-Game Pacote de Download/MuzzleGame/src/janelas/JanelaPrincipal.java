package janelas;

import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
//import javafx.embed.swing.JFXPanel;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Sliding Puzzle");
        changeMusic(0);
    }
    public static boolean isPlaying = false;
    
    public static String nomeJogador;
    int i = 0;
    MediaPlayer player;
    MediaPlayer mainMusic;
    
    private String musicMain[] = {"src/sons/soundMain.mp3", "src/sons/buttonMenu.mp3"};    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        escolhaBT = new javax.swing.JButton();
        rankingBT = new javax.swing.JButton();
        somBT = new javax.swing.JButton();
        creditosBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 245, 247));
        jPanel1.setLayout(null);

        escolhaBT.setBackground(new java.awt.Color(204, 204, 255));
        escolhaBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btPlay.png"))); // NOI18N
        escolhaBT.setContentAreaFilled(false);
        escolhaBT.setPreferredSize(new java.awt.Dimension(100, 70));
        escolhaBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escolhaBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escolhaBTMouseExited(evt);
            }
        });
        escolhaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaBTActionPerformed(evt);
            }
        });
        jPanel1.add(escolhaBT);
        escolhaBT.setBounds(310, 390, 190, 80);

        rankingBT.setBackground(new java.awt.Color(204, 204, 255));
        rankingBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btRanking.png"))); // NOI18N
        rankingBT.setToolTipText("");
        rankingBT.setContentAreaFilled(false);
        rankingBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rankingBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rankingBTMouseExited(evt);
            }
        });
        rankingBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingBTActionPerformed(evt);
            }
        });
        jPanel1.add(rankingBT);
        rankingBT.setBounds(290, 480, 230, 80);

        somBT.setBackground(new java.awt.Color(204, 204, 255));
        somBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btSom.png"))); // NOI18N
        somBT.setContentAreaFilled(false);
        somBT.setMaximumSize(new java.awt.Dimension(50, 50));
        somBT.setMinimumSize(new java.awt.Dimension(50, 50));
        somBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                somBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                somBTMouseExited(evt);
            }
        });
        somBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somBTActionPerformed(evt);
            }
        });
        jPanel1.add(somBT);
        somBT.setBounds(720, 20, 50, 50);

        creditosBT.setBackground(new java.awt.Color(255, 245, 247));
        creditosBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btCreditos.png"))); // NOI18N
        creditosBT.setContentAreaFilled(false);
        creditosBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creditosBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creditosBTMouseExited(evt);
            }
        });
        creditosBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosBTActionPerformed(evt);
            }
        });
        jPanel1.add(creditosBT);
        creditosBT.setBounds(720, 90, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bkgPrincipal.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void changeMusic(int i){
        JFXPanel fxPanel = new JFXPanel();
        if(i == 0 && isPlaying != true){            
            Media pick = new Media(new File(musicMain[i]).toURI().toString());   
            mainMusic = new MediaPlayer(pick);
            mainMusic.play();
        }
        if(i == 1){
            Media pick = new Media(new File(musicMain[i]).toURI().toString());   
            player = new MediaPlayer(pick);
            player.setVolume(0.7);
            player.play();
        }
    }
    
    private void escolhaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaBTActionPerformed
        changeMusic(1);
        int x = 0;
        do{
            ImageIcon icon = new ImageIcon("src/imagem/lbNovo.png");
            nomeJogador = (String) JOptionPane.showInputDialog(this, "Insira o seu nome", "Gamer");
            if (nomeJogador.length()<6){
                if (nomeJogador.trim().equals("")){
                JOptionPane.showMessageDialog(this, "Você precisa digitar algo");
            } else {
                x++;
            } 
        }else {
            JOptionPane.showMessageDialog(this, "O nome do jogador pode ter no máximo 5 caracteres");
            }
        } while (x == 0);
        new JanelaEscolha().setVisible(true);
        dispose();
    }//GEN-LAST:event_escolhaBTActionPerformed

    private void rankingBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingBTActionPerformed
        changeMusic(1);
        new JanelaRanking().setVisible(true);
        dispose();
    }//GEN-LAST:event_rankingBTActionPerformed

    private void creditosBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosBTActionPerformed
        changeMusic(1);
        new JanelaCreditos().setVisible(true);
        
    }//GEN-LAST:event_creditosBTActionPerformed

    private void escolhaBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escolhaBTMouseEntered
        escolhaBT.setIcon(new ImageIcon("src/imagens/btPlayShadow.png"));
        changeMusic(1);
    }//GEN-LAST:event_escolhaBTMouseEntered

    private void rankingBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rankingBTMouseEntered
        rankingBT.setIcon(new ImageIcon("src/imagens/btRankingShadow.png"));
        changeMusic(1);
    }//GEN-LAST:event_rankingBTMouseEntered

    private void escolhaBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escolhaBTMouseExited
        escolhaBT.setIcon(new ImageIcon("src/imagens/btPlay.png"));
    }//GEN-LAST:event_escolhaBTMouseExited

    private void rankingBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rankingBTMouseExited
        rankingBT.setIcon(new ImageIcon("src/imagens/btRanking.png"));
    }//GEN-LAST:event_rankingBTMouseExited

    private void creditosBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditosBTMouseEntered
        changeMusic(1);
        creditosBT.setIcon(new ImageIcon("src/imagens/btCreditosShadow.png"));
    }//GEN-LAST:event_creditosBTMouseEntered

    private void creditosBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditosBTMouseExited
        creditosBT.setIcon(new ImageIcon("src/imagens/btCreditos.png"));
    }//GEN-LAST:event_creditosBTMouseExited

    private void somBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_somBTMouseEntered
        changeMusic(1);
        somBT.setIcon(new ImageIcon("src/imagens/btSomShadow.png"));
    }//GEN-LAST:event_somBTMouseEntered

    private void somBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_somBTMouseExited
        somBT.setIcon(new ImageIcon("src/imagens/btSom.png"));
    }//GEN-LAST:event_somBTMouseExited

    private void somBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somBTActionPerformed
        i++;
        if(i % 2 != 0){
            mainMusic.stop();
        } else{
            mainMusic.play();
        }       
    }//GEN-LAST:event_somBTActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditosBT;
    private javax.swing.JButton escolhaBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rankingBT;
    private javax.swing.JButton somBT;
    // End of variables declaration//GEN-END:variables
}
