/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ranking;

import arquivos.Arquivo3x3;
import static jPuzzle.JPuzzle3x3.pontuacao3X3;
import janelas.JanelaPrincipal;
import static janelas.JanelaPrincipal.nomeJogador;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.ImageIcon;

/**
 *
 * @author andrefumaneri
 */
public class JanelaRanking3X3 extends javax.swing.JFrame {

    /**
     * Creates new form JanelaRanking
     */
    
    public JanelaRanking3X3() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Sliding Puzzle");
        VerificarPontuacao();
        
    }

    String arquivo3x3 = "ranking3x3.txt";
    MediaPlayer player;
    
    private void changeMusic(){
        JFXPanel fxPanel = new JFXPanel();
        Media pick = new Media(new File("src/sons/buttonMenu.mp3").toURI().toString());   
        player = new MediaPlayer(pick);
        player.play();
    }
    
    private void Gravar3x3() {
    
        String terceiroNS = nomeTerceiro3X3.getText();
        String segundoNS = nomeSegundo3X3.getText();
        String primeiroNS = nomePrimeiro3X3.getText();
        
        String terceiroS = pontuacaoTerceiro3X3.getText();
        String segundoS = pontuacaoSegundo3X3.getText();
        String primeiroS = pontuacaoPrimeiro3X3.getText();

        String texto3x3 = primeiroNS+";"+segundoNS+";"+terceiroNS+";"+primeiroS+";"+segundoS+";"+terceiroS+";";
        Arquivo3x3.Write3x3(arquivo3x3,texto3x3);
}
     
    private void Ler3x3(){

         String ler3x3 = Arquivo3x3.Read3x3(arquivo3x3);
         
         String primeiroNS = ler3x3.split(";")[0];
         String segundoNS = ler3x3.split(";")[1];
         String terceiroNS = ler3x3.split(";")[2];
         String primeiroS = ler3x3.split(";")[3];
         String segundoS = ler3x3.split(";")[4];
         String terceiroS = ler3x3.split(";")[5];
         
         pontuacaoTerceiro3X3.setText(terceiroS);
         pontuacaoSegundo3X3.setText(segundoS);
         pontuacaoPrimeiro3X3.setText(primeiroS);
         nomeTerceiro3X3.setText(terceiroNS);
         nomeSegundo3X3.setText(segundoNS);
         nomePrimeiro3X3.setText(primeiroNS);
     }
    
    private void VerificarPontuacao() {
       Ler3x3();

       String terceiroS = pontuacaoTerceiro3X3.getText();
       String segundoS = pontuacaoSegundo3X3.getText();
       String primeiroS = pontuacaoPrimeiro3X3.getText();
       
       int terceiroI = Integer.parseInt(terceiroS);
       int segundoI = Integer.parseInt(segundoS);
       int primeiroI = Integer.parseInt(primeiroS);
      
       String terceiroNS = nomeTerceiro3X3.getText();
       String segundoNS = nomeSegundo3X3.getText();
       String primeiroNS = nomePrimeiro3X3.getText();
       
       
       if (!nomeJogador.isEmpty()) {
       
            if(pontuacao3X3 > terceiroI && pontuacao3X3 < segundoI){
                terceiroI = pontuacao3X3;
                nomeTerceiro3X3.setText(nomeJogador);
            }
            else if (pontuacao3X3 > segundoI && pontuacao3X3 < primeiroI){
                terceiroI = segundoI;
                nomeTerceiro3X3 = nomeSegundo3X3;
                segundoI = pontuacao3X3;
                nomeSegundo3X3.setText(nomeJogador);
            }
            else if (pontuacao3X3 > primeiroI){
                terceiroI = segundoI;
                nomeTerceiro3X3 = nomeSegundo3X3;
                segundoI = primeiroI;
                nomeSegundo3X3 = nomePrimeiro3X3;
                primeiroI = pontuacao3X3;
                nomePrimeiro3X3.setText(nomeJogador);
            }
            else if (pontuacao3X3 == primeiroI && pontuacao3X3 != segundoI ){
                terceiroI = segundoI;
                nomeTerceiro3X3 = nomeSegundo3X3;
                segundoI = pontuacao3X3;
                nomeSegundo3X3.setText(nomeJogador);
            }
            else if (pontuacao3X3 == primeiroI && pontuacao3X3 == segundoI && pontuacao3X3 != terceiroI){
                terceiroI = pontuacao3X3;
                nomeTerceiro3X3.setText(nomeJogador);
            }
            else if (pontuacao3X3 == segundoI && pontuacao3X3 != terceiroI){
                terceiroI = pontuacao3X3;
                nomeTerceiro3X3.setText(nomeJogador);
            }

            terceiroS = String.valueOf(terceiroI);
            segundoS = String.valueOf(segundoI);
            primeiroS = String.valueOf(primeiroI);

            pontuacaoTerceiro3X3.setText(terceiroS);
            pontuacaoSegundo3X3.setText(segundoS);
            pontuacaoPrimeiro3X3.setText(primeiroS);

            Gravar3x3();
            nomeJogador = "";
        }
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        nomePrimeiro3X3 = new javax.swing.JLabel();
        nomeSegundo3X3 = new javax.swing.JLabel();
        nomeTerceiro3X3 = new javax.swing.JLabel();
        pontuacaoPrimeiro3X3 = new javax.swing.JLabel();
        pontuacaoSegundo3X3 = new javax.swing.JLabel();
        pontuacaoTerceiro3X3 = new javax.swing.JLabel();
        okBT = new javax.swing.JButton();
        backgroundLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 245, 247));

        jPanel3.setBackground(new java.awt.Color(255, 245, 247));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel3.setSize(new java.awt.Dimension(800, 600));
        jPanel3.setLayout(null);

        nomePrimeiro3X3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        nomePrimeiro3X3.setForeground(new java.awt.Color(64, 64, 64));
        nomePrimeiro3X3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomePrimeiro3X3.setText("Bababa");
        jPanel3.add(nomePrimeiro3X3);
        nomePrimeiro3X3.setBounds(330, 330, 140, 21);

        nomeSegundo3X3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        nomeSegundo3X3.setForeground(new java.awt.Color(64, 64, 64));
        nomeSegundo3X3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeSegundo3X3.setText("Bebebe");
        jPanel3.add(nomeSegundo3X3);
        nomeSegundo3X3.setBounds(480, 400, 140, 21);

        nomeTerceiro3X3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        nomeTerceiro3X3.setForeground(new java.awt.Color(64, 64, 64));
        nomeTerceiro3X3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeTerceiro3X3.setText("Bububu");
        jPanel3.add(nomeTerceiro3X3);
        nomeTerceiro3X3.setBounds(180, 420, 140, 21);

        pontuacaoPrimeiro3X3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        pontuacaoPrimeiro3X3.setForeground(new java.awt.Color(64, 64, 64));
        pontuacaoPrimeiro3X3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pontuacaoPrimeiro3X3.setText("900");
        jPanel3.add(pontuacaoPrimeiro3X3);
        pontuacaoPrimeiro3X3.setBounds(340, 360, 120, 21);

        pontuacaoSegundo3X3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        pontuacaoSegundo3X3.setForeground(new java.awt.Color(64, 64, 64));
        pontuacaoSegundo3X3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pontuacaoSegundo3X3.setText("800");
        jPanel3.add(pontuacaoSegundo3X3);
        pontuacaoSegundo3X3.setBounds(480, 430, 140, 21);

        pontuacaoTerceiro3X3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        pontuacaoTerceiro3X3.setForeground(new java.awt.Color(64, 64, 64));
        pontuacaoTerceiro3X3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pontuacaoTerceiro3X3.setText("700");
        jPanel3.add(pontuacaoTerceiro3X3);
        pontuacaoTerceiro3X3.setBounds(190, 450, 120, 21);

        okBT.setBackground(new java.awt.Color(204, 204, 255));
        okBT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        okBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btOk.png"))); // NOI18N
        okBT.setBorderPainted(false);
        okBT.setContentAreaFilled(false);
        okBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okBTMouseExited(evt);
            }
        });
        okBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBTActionPerformed(evt);
            }
        });
        jPanel3.add(okBT);
        okBT.setBounds(680, 510, 96, 70);

        backgroundLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bkgRanking3x3.png"))); // NOI18N
        backgroundLB.setText("1");
        jPanel3.add(backgroundLB);
        backgroundLB.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBTActionPerformed
        JanelaPrincipal.isPlaying = true;
        new JanelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_okBTActionPerformed

    private void okBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okBTMouseEntered
        changeMusic();
        okBT.setIcon(new ImageIcon("src/imagens/btOkShadow.png"));
    }//GEN-LAST:event_okBTMouseEntered

    private void okBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okBTMouseExited
        okBT.setIcon(new ImageIcon("src/imagens/btOk.png"));
    }//GEN-LAST:event_okBTMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLB;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nomePrimeiro3X3;
    private javax.swing.JLabel nomeSegundo3X3;
    private javax.swing.JLabel nomeTerceiro3X3;
    private javax.swing.JButton okBT;
    private javax.swing.JLabel pontuacaoPrimeiro3X3;
    private javax.swing.JLabel pontuacaoSegundo3X3;
    private javax.swing.JLabel pontuacaoTerceiro3X3;
    // End of variables declaration//GEN-END:variables
}
