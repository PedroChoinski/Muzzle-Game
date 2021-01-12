/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ranking;

import arquivos.Arquivo5x5;
import static jPuzzle.JPuzzle5x5.pontuacao5X5;
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
public class JanelaRanking5X5 extends javax.swing.JFrame {

    /**
     * Creates new form JanelaRanking
     */
    public JanelaRanking5X5() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Sliding Puzzle");
        VerificarPontuacao();
    }
    
    String arquivo5x5 = "ranking5x5.txt";
    MediaPlayer player;
    
    private void changeMusic(){
        JFXPanel fxPanel = new JFXPanel();
        Media pick = new Media(new File("src/sons/buttonMenu.mp3").toURI().toString());   
        player = new MediaPlayer(pick);
        player.play();
    }
    
    private void Gravar5x5() {
    
        String terceiroNS = nomeTerceiro5X5.getText();
        String segundoNS = nomeSegundo5X5.getText();
        String primeiroNS = nomePrimeiro5X5.getText();
        
        String terceiroS = pontuacaoTerceiro5X5.getText();
        String segundoS = pontuacaoSegundo5X5.getText();
        String primeiroS = pontuacaoPrimeiro5X5.getText();

        String texto5x5 = primeiroNS+";"+segundoNS+";"+terceiroNS+";"+primeiroS+";"+segundoS+";"+terceiroS+";";
        Arquivo5x5.Write5x5(arquivo5x5,texto5x5);
}
     
    private void Ler5x5(){

         String ler5x5 = Arquivo5x5.Read5x5(arquivo5x5);
         
         String primeiroNS = ler5x5.split(";")[0];
         String segundoNS = ler5x5.split(";")[1];
         String terceiroNS = ler5x5.split(";")[2];
         String primeiroS = ler5x5.split(";")[3];
         String segundoS = ler5x5.split(";")[4];
         String terceiroS = ler5x5.split(";")[5];
         
         pontuacaoTerceiro5X5.setText(terceiroS);
         pontuacaoSegundo5X5.setText(segundoS);
         pontuacaoPrimeiro5X5.setText(primeiroS);
         nomeTerceiro5X5.setText(terceiroNS);
         nomeSegundo5X5.setText(segundoNS);
         nomePrimeiro5X5.setText(primeiroNS);
     }
    
    private void VerificarPontuacao() {
         
       Ler5x5(); 
       
       String terceiroS = pontuacaoTerceiro5X5.getText();
       String segundoS = pontuacaoSegundo5X5.getText();
       String primeiroS = pontuacaoPrimeiro5X5.getText();
       
       int terceiroI = Integer.parseInt(terceiroS);
       int segundoI = Integer.parseInt(segundoS);
       int primeiroI = Integer.parseInt(primeiroS);
      
       if(!nomeJogador.isEmpty()){
            if(pontuacao5X5 > terceiroI && pontuacao5X5 < segundoI){
                terceiroI = pontuacao5X5;
                nomeTerceiro5X5.setText(nomeJogador);
            }
            else if (pontuacao5X5 > segundoI && pontuacao5X5 < primeiroI){
                terceiroI = segundoI;
                nomeTerceiro5X5 = nomeSegundo5X5;
                segundoI = pontuacao5X5;
                nomeSegundo5X5.setText(nomeJogador);
            }
            else if (pontuacao5X5 > primeiroI){
                terceiroI = segundoI;
                nomeTerceiro5X5 = nomeSegundo5X5;
                segundoI = primeiroI;
                nomeSegundo5X5 = nomePrimeiro5X5;
                primeiroI = pontuacao5X5;
                nomePrimeiro5X5.setText(nomeJogador);
            }
            else if (pontuacao5X5 == primeiroI && pontuacao5X5 != segundoI ){
                terceiroI = segundoI;
                nomeTerceiro5X5 = nomeSegundo5X5;
                segundoI = pontuacao5X5;
                nomeSegundo5X5.setText(nomeJogador);
            }
            else if (pontuacao5X5 == primeiroI && pontuacao5X5 == segundoI && pontuacao5X5 != terceiroI){
                terceiroI = pontuacao5X5;
                nomeTerceiro5X5.setText(nomeJogador);
            }
            else if (pontuacao5X5 == segundoI && pontuacao5X5 != terceiroI){
                terceiroI = pontuacao5X5;
                nomeTerceiro5X5.setText(nomeJogador);
            }


            terceiroS = String.valueOf(terceiroI);
            segundoS = String.valueOf(segundoI);
            primeiroS = String.valueOf(primeiroI);

            pontuacaoTerceiro5X5.setText(terceiroS);
            pontuacaoSegundo5X5.setText(segundoS);
            pontuacaoPrimeiro5X5.setText(primeiroS);

            Gravar5x5();
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
        nomeTerceiro5X5 = new javax.swing.JLabel();
        pontuacaoTerceiro5X5 = new javax.swing.JLabel();
        nomePrimeiro5X5 = new javax.swing.JLabel();
        pontuacaoPrimeiro5X5 = new javax.swing.JLabel();
        nomeSegundo5X5 = new javax.swing.JLabel();
        pontuacaoSegundo5X5 = new javax.swing.JLabel();
        okBT = new javax.swing.JButton();
        backgroundLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jPanel3.setLayout(null);

        nomeTerceiro5X5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        nomeTerceiro5X5.setForeground(new java.awt.Color(64, 64, 64));
        nomeTerceiro5X5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeTerceiro5X5.setText("Bububu");
        jPanel3.add(nomeTerceiro5X5);
        nomeTerceiro5X5.setBounds(180, 420, 140, 21);

        pontuacaoTerceiro5X5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        pontuacaoTerceiro5X5.setForeground(new java.awt.Color(64, 64, 64));
        pontuacaoTerceiro5X5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pontuacaoTerceiro5X5.setText("700");
        jPanel3.add(pontuacaoTerceiro5X5);
        pontuacaoTerceiro5X5.setBounds(190, 450, 120, 21);

        nomePrimeiro5X5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        nomePrimeiro5X5.setForeground(new java.awt.Color(64, 64, 64));
        nomePrimeiro5X5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomePrimeiro5X5.setText("Bababa");
        jPanel3.add(nomePrimeiro5X5);
        nomePrimeiro5X5.setBounds(330, 330, 140, 21);

        pontuacaoPrimeiro5X5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        pontuacaoPrimeiro5X5.setForeground(new java.awt.Color(64, 64, 64));
        pontuacaoPrimeiro5X5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pontuacaoPrimeiro5X5.setText("900");
        jPanel3.add(pontuacaoPrimeiro5X5);
        pontuacaoPrimeiro5X5.setBounds(340, 360, 120, 21);

        nomeSegundo5X5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        nomeSegundo5X5.setForeground(new java.awt.Color(64, 64, 64));
        nomeSegundo5X5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeSegundo5X5.setText("Bebebe");
        jPanel3.add(nomeSegundo5X5);
        nomeSegundo5X5.setBounds(480, 400, 140, 21);

        pontuacaoSegundo5X5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        pontuacaoSegundo5X5.setForeground(new java.awt.Color(64, 64, 64));
        pontuacaoSegundo5X5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pontuacaoSegundo5X5.setText("800");
        jPanel3.add(pontuacaoSegundo5X5);
        pontuacaoSegundo5X5.setBounds(480, 430, 140, 21);

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

        backgroundLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bkgRanking5x5.png"))); // NOI18N
        backgroundLB.setText("jLabel1");
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

    private void okBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okBTMouseEntered
        changeMusic();
        okBT.setIcon(new ImageIcon("src/imagens/btOkShadow.png"));
    }//GEN-LAST:event_okBTMouseEntered

    private void okBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okBTMouseExited
        okBT.setIcon(new ImageIcon("src/imagens/btOk.png"));
    }//GEN-LAST:event_okBTMouseExited

    private void okBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBTActionPerformed
        JanelaPrincipal.isPlaying = true;
        new JanelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_okBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLB;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nomePrimeiro5X5;
    private javax.swing.JLabel nomeSegundo5X5;
    private javax.swing.JLabel nomeTerceiro5X5;
    private javax.swing.JButton okBT;
    private javax.swing.JLabel pontuacaoPrimeiro5X5;
    private javax.swing.JLabel pontuacaoSegundo5X5;
    private javax.swing.JLabel pontuacaoTerceiro5X5;
    // End of variables declaration//GEN-END:variables
}