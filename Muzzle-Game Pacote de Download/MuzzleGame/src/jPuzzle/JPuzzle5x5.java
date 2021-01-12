package jPuzzle;

import janelas.JanelaPrincipal;
import java.io.File;
import ranking.JanelaRanking5X5;
import java.util.Random;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Anna
 */
public class JPuzzle5x5 extends javax.swing.JFrame {

    public JPuzzle5x5() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Sliding Puzzle");
        positionRandomizer(vetor);
        numPosition();
    }
    private int vetor[] = {1,2,3,4,5,6,7,8,9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    private int counter = 0;
    
    public static int pontuacao5X5;
    
    MediaPlayer meow;
    MediaPlayer button;
    MediaPlayer mButton;    
    private String musicPuzzle[] = {"src/sons/meow3.mp3", "src/sons/buttonMenu.mp3", "src/sons/sell1.mp3"};    

    
    private void changeMusic(int i){
        JFXPanel fxPanel = new JFXPanel();
        if(i == 0){            
            Media pick = new Media(new File(musicPuzzle[i]).toURI().toString());   
            meow = new MediaPlayer(pick);
            meow.play();
        }
        if(i == 1){
            Media pick = new Media(new File(musicPuzzle[i]).toURI().toString());   
            button = new MediaPlayer(pick);
            button.setVolume(0.7);
            button.play();
        }
        if(i == 2){
            Media pick = new Media(new File(musicPuzzle[i]).toURI().toString());   
            mButton = new MediaPlayer(pick);
            mButton.setVolume(0.7);
            mButton.play();
        }
    }
    
    private void addCounter() {
        changeMusic(2);
        this.counter += 1;
        tfMovimentos.setText(String.valueOf(this.counter));
    } 
    private void resetCounter() {
        this.counter = 0;
        tfMovimentos.setText(String.valueOf(this.counter));
    }
    
    private boolean win(){
        for (int i = 0; i < 25; i++){
            if(vetor[i] != (i+1)){
                return false;
            }
        }
        return true;
    }
    
    private void MsgWin(){
        changeMusic(0);
        JOptionPane.showMessageDialog(this, "CONGRATULATIONS");
        pontuacao5X5 = (100000-counter);
        resetCounter(); 
        new JanelaRanking5X5().setVisible(true);
        dispose();
    }

    private void positionRandomizer(int [] vetor){     
        Random random = new Random();
         
        for (int i = 0; i < vetor.length; i++) {
            int j = random.nextInt(vetor.length); 
            int temp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = temp;
        }
    }
    
    private void numPosition(){    
        for (int i = 0; i < vetor.length; i++) {
            int valorIndice = vetor[i];
            switch(i){
                
                case 0:
                    jButton1.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton1.setVisible(false);
                    }else{
                        jButton1.setVisible(true);
                    }
                    break;
                    
                case 1:
                    jButton2.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton2.setVisible(false);
                    }else{
                        jButton2.setVisible(true);
                    }
                    break;
                    
                case 2:
                    jButton3.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton3.setVisible(false);
                    }else{
                        jButton3.setVisible(true);
                    }
                    break;
                    
                case 3:
                    jButton4.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton4.setVisible(false);
                    }else{
                        jButton4.setVisible(true);
                    }
                    break;
                    
                case 4:
                    jButton5.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton5.setVisible(false);
                    }else{
                        jButton5.setVisible(true);
                    }
                    break;
                    
                case 5:
                    jButton6.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton6.setVisible(false);
                    }else{
                        jButton6.setVisible(true);
                    }
                    break;
                    
                case 6:
                    jButton7.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton7.setVisible(false);
                    }else{
                        jButton7.setVisible(true);
                    }
                    break;
                
                case 7:
                    jButton8.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton8.setVisible(false);
                    }else{
                        jButton8.setVisible(true);
                    }
                    break;
                    
                case 8:
                    jButton9.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton9.setVisible(false);
                    }else{
                        jButton9.setVisible(true);
                    }
                    break;
                    
                case 9:
                    jButton10.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton10.setVisible(false);
                    }else{
                        jButton10.setVisible(true);
                    }
                    break;
                    
                case 10:
                    jButton11.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton11.setVisible(false);
                    }else{
                        jButton11.setVisible(true);
                    }
                    break;
                
                case 11:
                    jButton12.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton12.setVisible(false);
                    }else{
                        jButton12.setVisible(true);
                    }
                    break;
                
                case 12:
                    jButton13.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton13.setVisible(false);
                    }else{
                        jButton13.setVisible(true);
                    }
                    break;
                
                case 13:
                    jButton14.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton14.setVisible(false);
                    }else{
                        jButton14.setVisible(true);
                    }
                    break;
                
                case 14:
                    jButton15.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton15.setVisible(false);
                    }else{
                        jButton15.setVisible(true);
                    }
                    break;
                
                case 15:
                    jButton16.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton16.setVisible(false);
                    }else{
                        jButton16.setVisible(true);
                    }
                    break;
                    
                case 16:
                    jButton17.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton17.setVisible(false);
                    }else{
                        jButton17.setVisible(true);
                    }
                    break;
                
                case 17:
                    jButton18.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton18.setVisible(false);
                    }else{
                        jButton18.setVisible(true);
                    }
                    break;
                
                case 18:
                    jButton19.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton19.setVisible(false);
                    }else{
                        jButton19.setVisible(true);
                    }
                    break;
                
                case 19:
                    jButton20.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton20.setVisible(false);
                    }else{
                        jButton20.setVisible(true);
                    }
                    break;
                
                case 20:
                    jButton21.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton21.setVisible(false);
                    }else{
                        jButton21.setVisible(true);
                    }
                    break;
                
                case 21:
                    jButton22.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton22.setVisible(false);
                    }else{
                        jButton22.setVisible(true);
                    }
                    break;
                
                case 22:
                    jButton23.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton23.setVisible(false);
                    }else{
                        jButton23.setVisible(true);
                    }
                    break;
                
                case 23:
                    jButton24.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton24.setVisible(false);
                    }else{
                        jButton24.setVisible(true);
                    }
                    break;
                
                case 24:
                    jButton25.setText(Integer.toString(valorIndice));
                    if(valorIndice == 25){
                        jButton25.setVisible(false);
                    }else{
                        jButton25.setVisible(true);
                    }
                    break;                         
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        ganharBT = new javax.swing.JButton();
        level3LB = new javax.swing.JLabel();
        refreshBT = new javax.swing.JButton();
        tfMovimentos = new javax.swing.JTextField();
        voltarBT = new javax.swing.JButton();
        backgroundLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel4.setLayout(null);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(0, 5, 0, 5));

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(64, 64, 64));
        jButton1.setText("X");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(64, 64, 64));
        jButton2.setText("X");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(64, 64, 64));
        jButton3.setText("X");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(64, 64, 64));
        jButton4.setText("X");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(64, 64, 64));
        jButton5.setText("X");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);

        jButton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(64, 64, 64));
        jButton6.setText("X");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);

        jButton7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton7.setForeground(new java.awt.Color(64, 64, 64));
        jButton7.setText("X");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);

        jButton8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton8.setForeground(new java.awt.Color(64, 64, 64));
        jButton8.setText("X");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);

        jButton9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton9.setForeground(new java.awt.Color(64, 64, 64));
        jButton9.setText("X");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);

        jButton10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton10.setForeground(new java.awt.Color(64, 64, 64));
        jButton10.setText("X");
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);

        jButton11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton11.setForeground(new java.awt.Color(64, 64, 64));
        jButton11.setText("X");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11);

        jButton12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton12.setForeground(new java.awt.Color(64, 64, 64));
        jButton12.setText("X");
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12);

        jButton13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton13.setForeground(new java.awt.Color(64, 64, 64));
        jButton13.setText("X");
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13);

        jButton14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton14.setForeground(new java.awt.Color(64, 64, 64));
        jButton14.setText("X");
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14);

        jButton15.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton15.setForeground(new java.awt.Color(64, 64, 64));
        jButton15.setText("X");
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton15);

        jButton16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton16.setForeground(new java.awt.Color(64, 64, 64));
        jButton16.setText("X");
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton16);

        jButton17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton17.setForeground(new java.awt.Color(64, 64, 64));
        jButton17.setText("X");
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton17);

        jButton18.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton18.setForeground(new java.awt.Color(64, 64, 64));
        jButton18.setText("X");
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton18);

        jButton19.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton19.setForeground(new java.awt.Color(64, 64, 64));
        jButton19.setText("X");
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton19);

        jButton20.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton20.setForeground(new java.awt.Color(64, 64, 64));
        jButton20.setText("X");
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton20);

        jButton21.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton21.setForeground(new java.awt.Color(64, 64, 64));
        jButton21.setText("X");
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton21);

        jButton22.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton22.setForeground(new java.awt.Color(64, 64, 64));
        jButton22.setText("X");
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton22);

        jButton23.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton23.setForeground(new java.awt.Color(64, 64, 64));
        jButton23.setText("X");
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton23);

        jButton24.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton24.setForeground(new java.awt.Color(64, 64, 64));
        jButton24.setText("X");
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton24);

        jButton25.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton25.setForeground(new java.awt.Color(64, 64, 64));
        jButton25.setText("X");
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton25);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(190, 130, 420, 420);

        ganharBT.setBackground(new java.awt.Color(255, 255, 0));
        ganharBT.setBorderPainted(false);
        ganharBT.setContentAreaFilled(false);
        ganharBT.setOpaque(true);
        ganharBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganharBTActionPerformed(evt);
            }
        });
        jPanel4.add(ganharBT);
        ganharBT.setBounds(790, 0, 10, 10);

        level3LB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lbLevel3.png"))); // NOI18N
        jPanel4.add(level3LB);
        level3LB.setBounds(300, 25, 200, 80);

        refreshBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btRefresh.png"))); // NOI18N
        refreshBT.setBorderPainted(false);
        refreshBT.setContentAreaFilled(false);
        refreshBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshBTMouseExited(evt);
            }
        });
        refreshBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBTActionPerformed(evt);
            }
        });
        jPanel4.add(refreshBT);
        refreshBT.setBounds(670, 160, 80, 80);

        tfMovimentos.setEditable(false);
        tfMovimentos.setBackground(new java.awt.Color(255, 245, 247));
        tfMovimentos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        tfMovimentos.setForeground(new java.awt.Color(64, 64, 64));
        tfMovimentos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfMovimentos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tfMovimentos.setCaretColor(new java.awt.Color(255, 245, 247));
        tfMovimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfMovimentos.setSelectionColor(new java.awt.Color(255, 245, 247));
        tfMovimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMovimentosActionPerformed(evt);
            }
        });
        jPanel4.add(tfMovimentos);
        tfMovimentos.setBounds(680, 310, 66, 60);

        voltarBT.setBackground(new java.awt.Color(204, 204, 255));
        voltarBT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        voltarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btVoltar.png"))); // NOI18N
        voltarBT.setBorderPainted(false);
        voltarBT.setContentAreaFilled(false);
        voltarBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                voltarBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                voltarBTMouseExited(evt);
            }
        });
        voltarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTActionPerformed(evt);
            }
        });
        jPanel4.add(voltarBT);
        voltarBT.setBounds(30, 30, 80, 80);

        backgroundLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bkg5x5.png"))); // NOI18N
        backgroundLB.setText("jLabel1");
        jPanel4.add(backgroundLB);
        backgroundLB.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!jButton2.isVisible()){
            jButton2.setText(jButton1.getText());
            jButton1.setVisible(false);
            jButton2.setVisible(true);
            int valorbt1 = vetor[0];
            int valorbt2 = vetor[1];
            vetor[0] = valorbt2;
            vetor[1] = valorbt1;
            this.addCounter();
        }
        if(!jButton6.isVisible()){
            jButton6.setText(jButton1.getText());
            jButton1.setVisible(false);
            jButton6.setVisible(true);
            int valorbt1 = vetor[0];
            int valorbt6 = vetor[5];
            vetor[0] = valorbt6;
            vetor[5] = valorbt1;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!jButton3.isVisible()){
            jButton3.setText(jButton2.getText());
            jButton2.setVisible(false);
            jButton3.setVisible(true);
            int valorbt2 = vetor[1];
            int valorbt3 = vetor[2];
            vetor[1] = valorbt3;
            vetor[2] = valorbt2;
            this.addCounter();
        }
        if(!jButton7.isVisible()){
            jButton7.setText(jButton2.getText());
            jButton2.setVisible(false);
            jButton7.setVisible(true);
            int valorbt2 = vetor[1];
            int valorbt7 = vetor[6];
            vetor[1] = valorbt7;
            vetor[6] = valorbt2;
            this.addCounter();
        }
        if(!jButton1.isVisible()){
            jButton1.setText(jButton2.getText());
            jButton2.setVisible(false);
            jButton1.setVisible(true);
            int valorbt2 = vetor[1];
            int valorbt1 = vetor[0];
            vetor[1] = valorbt1;
            vetor[0] = valorbt2;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!jButton8.isVisible()){
            jButton8.setText(jButton3.getText());
            jButton3.setVisible(false);
            jButton8.setVisible(true);
            int valorbt3 = vetor[2];
            int valorbt8 = vetor[7];
            vetor[2] = valorbt8;
            vetor[7] = valorbt3;
            this.addCounter();
        }

        if(!jButton2.isVisible()){
            jButton2.setText(jButton3.getText());
            jButton3.setVisible(false);
            jButton2.setVisible(true);
            int valorbt3 = vetor[2];
            int valorbt2 = vetor[1];
            vetor[2] = valorbt2;
            vetor[1] = valorbt3;
            this.addCounter();
        }
        if(!jButton4.isVisible()){
            jButton4.setText(jButton3.getText());
            jButton3.setVisible(false);
            jButton4.setVisible(true);
            int valorbt3 = vetor[2];
            int valorbt4 = vetor[3];
            vetor[2] = valorbt4;
            vetor[3] = valorbt3;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!jButton3.isVisible()){
            jButton3.setText(jButton4.getText());
            jButton4.setVisible(false);
            jButton3.setVisible(true);
            int valorbt4 = vetor[3];
            int valorbt3 = vetor[2];
            vetor[3] = valorbt3;
            vetor[2] = valorbt4;
            this.addCounter();
        }
        if(!jButton9.isVisible()){
            jButton9.setText(jButton4.getText());
            jButton4.setVisible(false);
            jButton9.setVisible(true);
            int valorbt4 = vetor[3];
            int valorbt9 = vetor[8];
            vetor[3] = valorbt9;
            vetor[8] = valorbt4;
            this.addCounter();
        }
        if(!jButton5.isVisible()){
            jButton5.setText(jButton4.getText());
            jButton4.setVisible(false);
            jButton5.setVisible(true);
            int valorbt4 = vetor[3];
            int valorbt5 = vetor[4];
            vetor[3] = valorbt5;
            vetor[4] = valorbt4;
            this.addCounter();
        }

        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(!jButton4.isVisible()){
            jButton4.setText(jButton5.getText());
            jButton5.setVisible(false);
            jButton4.setVisible(true);
            int valorbt5 = vetor[4];
            int valorbt4 = vetor[3];
            vetor[4] = valorbt4;
            vetor[3] = valorbt5;
            this.addCounter();
        }
        if(!jButton10.isVisible()){
            jButton10.setText(jButton5.getText());
            jButton5.setVisible(false);
            jButton10.setVisible(true);
            int valorbt5 = vetor[4];
            int valorbt10 = vetor[8];
            vetor[4] = valorbt10;
            vetor[9] = valorbt5;
            this.addCounter();
        }

        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!jButton1.isVisible()){
            jButton1.setText(jButton6.getText());
            jButton6.setVisible(false);
            jButton1.setVisible(true);
            int valorbt6 = vetor[5];
            int valorbt1 = vetor[0];
            vetor[5] = valorbt1;
            vetor[0] = valorbt6;
            this.addCounter();
        }
        if(!jButton7.isVisible()){
            jButton7.setText(jButton6.getText());
            jButton6.setVisible(false);
            jButton7.setVisible(true);
            int valorbt6 = vetor[5];
            int valorbt7 = vetor[6];
            vetor[5] = valorbt7;
            vetor[6] = valorbt6;
            this.addCounter();
        }
        if(!jButton11.isVisible()){
            jButton11.setText(jButton6.getText());
            jButton6.setVisible(false);
            jButton11.setVisible(true);
            int valorbt6 = vetor[5];
            int valorbt11 = vetor[10];
            vetor[5] =  valorbt11;
            vetor[10] =  valorbt6;
            this.addCounter();
        }

        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(!jButton2.isVisible()){
            jButton2.setText(jButton7.getText());
            jButton7.setVisible(false);
            jButton2.setVisible(true);
            int valorbt7 = vetor[6];
            int valorbt2 = vetor[1];
            vetor[6] = valorbt2;
            vetor[1] = valorbt7;
            this.addCounter();
        }
        if(!jButton6.isVisible()){
            jButton6.setText(jButton7.getText());
            jButton7.setVisible(false);
            jButton6.setVisible(true);
            int valorbt7 = vetor[6];
            int valorbt6 = vetor[5];
            vetor[6] = valorbt6;
            vetor[5] = valorbt7;
            this.addCounter();
        }
        if(!jButton8.isVisible()){
            jButton8.setText(jButton7.getText());
            jButton7.setVisible(false);
            jButton8.setVisible(true);
            int valorbt7 = vetor[6];
            int valorbt8 = vetor[7];
            vetor[6] = valorbt8;
            vetor[7] = valorbt7;
            this.addCounter();
        }
        if(!jButton12.isVisible()){
            jButton12.setText(jButton7.getText());
            jButton7.setVisible(false);
            jButton12.setVisible(true);
            int valorbt7 = vetor[6];
            int valorbt12 = vetor[11];
            vetor[6] = valorbt12;
            vetor[11] = valorbt7;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(!jButton7.isVisible()){
            jButton7.setText(jButton8.getText());
            jButton8.setVisible(false);
            jButton7.setVisible(true);
            int valorbt8 = vetor[7];
            int valorbt7 = vetor[6];
            vetor[7] = valorbt7;
            vetor[6] = valorbt8;
            this.addCounter();
        }
        if(!jButton3.isVisible()){
            jButton3.setText(jButton8.getText());
            jButton8.setVisible(false);
            jButton3.setVisible(true);
            int valorbt8 = vetor[7];
            int valorbt3 = vetor[2];
            vetor[7] = valorbt3;
            vetor[2] = valorbt8;
            this.addCounter();
        }
        if(!jButton13.isVisible()){
            jButton13.setText(jButton8.getText());
            jButton8.setVisible(false);
            jButton13.setVisible(true);
            int valorbt8 = vetor[7];
            int valorbt13 = vetor[12];
            vetor[7] = valorbt13;
            vetor[12] = valorbt8;
            this.addCounter();
        }
        if(!jButton9.isVisible()){
            jButton9.setText(jButton8.getText());
            jButton8.setVisible(false);
            jButton9.setVisible(true);
            int valorbt8 = vetor[7];
            int valorbt9 = vetor[8];
            vetor[7] = valorbt9;
            vetor[8] = valorbt8;
            this.addCounter();
        }
        
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(!jButton4.isVisible()){
            jButton4.setText(jButton9.getText());
            jButton9.setVisible(false);
            jButton4.setVisible(true);
            int valorbt9 = vetor[8];
            int valorbt4 = vetor[3];
            vetor[8] = valorbt4;
            vetor[3] = valorbt9;
            this.addCounter();
        }
        if(!jButton10.isVisible()){
            jButton10.setText(jButton9.getText());
            jButton9.setVisible(false);
            jButton10.setVisible(true);
            int valorbt9 = vetor[8];
            int valorbt10 = vetor[9];
            vetor[8] = valorbt10;
            vetor[9] = valorbt9;
            this.addCounter();
        }
        if(!jButton14.isVisible()){
            jButton14.setText(jButton9.getText());
            jButton9.setVisible(false);
            jButton14.setVisible(true);
            int valorbt9 = vetor[8];
            int valorbt14 = vetor[13];
            vetor[8] = valorbt14;
            vetor[13] = valorbt9;
            this.addCounter();
        }
        if(!jButton8.isVisible()){
            jButton8.setText(jButton9.getText());
            jButton9.setVisible(false);
            jButton8.setVisible(true);
            int valorbt9 = vetor[8];
            int valorbt8 = vetor[7];
            vetor[8] = valorbt8;
            vetor[7] = valorbt9;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(!jButton5.isVisible()){
            jButton5.setText(jButton10.getText());
            jButton10.setVisible(false);
            jButton5.setVisible(true);
            int valorbt10 = vetor[9];
            int valorbt5 = vetor[4];
            vetor[9] = valorbt5;
            vetor[4] = valorbt10;
            this.addCounter();
        }
        if(!jButton9.isVisible()){
            jButton9.setText(jButton10.getText());
            jButton10.setVisible(false);
            jButton9.setVisible(true);
            int valorbt10 = vetor[9];
            int valorbt9 = vetor[8];
            vetor[9] = valorbt9;
            vetor[8] = valorbt10;
            this.addCounter();
        }
        if(!jButton15.isVisible()){
            jButton15.setText(jButton10.getText());
            jButton10.setVisible(false);
            jButton15.setVisible(true);
            int valorbt10 = vetor[9];
            int valorbt15 = vetor[14];
            vetor[9] = valorbt15;
            vetor[14] = valorbt10;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(!jButton12.isVisible()){
            jButton12.setText(jButton11.getText());
            jButton11.setVisible(false);
            jButton12.setVisible(true);
            int valorbt11 = vetor[10];
            int valorbt12 = vetor[11];
            vetor[10] = valorbt12;
            vetor[11] = valorbt11;
            this.addCounter();
        }
        if(!jButton6.isVisible()){
            jButton6.setText(jButton11.getText());
            jButton11.setVisible(false);
            jButton6.setVisible(true);
            int valorbt11 = vetor[10];
            int valorbt6 = vetor[5];
            vetor[10] = valorbt6;
            vetor[5] = valorbt11;
            this.addCounter();
        }
        if(!jButton16.isVisible()){
            jButton16.setText(jButton11.getText());
            jButton11.setVisible(false);
            jButton16.setVisible(true);
            int valorbt11 = vetor[10];
            int valorbt16 = vetor[15];
            vetor[10] = valorbt16;
            vetor[15] = valorbt11;
            this.addCounter();
        }
        
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(!jButton7.isVisible()){
            jButton7.setText(jButton12.getText());
            jButton12.setVisible(false);
            jButton7.setVisible(true);
            int valorbt12 = vetor[11];
            int valorbt7 = vetor[6];
            vetor[11] = valorbt7;
            vetor[6] = valorbt12;
            this.addCounter();
        }
        if(!jButton11.isVisible()){
            jButton11.setText(jButton12.getText());
            jButton12.setVisible(false);
            jButton11.setVisible(true);
            int valorbt12 = vetor[11];
            int valorbt11 = vetor[10];
            vetor[11] = valorbt11;
            vetor[10] = valorbt12;
            this.addCounter();
        }
        if(!jButton13.isVisible()){
            jButton13.setText(jButton12.getText());
            jButton12.setVisible(false);
            jButton13.setVisible(true);
            int valorbt12 = vetor[11];
            int valorbt13 = vetor[12];
            vetor[11] = valorbt13;
            vetor[12] = valorbt12;
            this.addCounter();
        }
        if(!jButton17.isVisible()){
            jButton17.setText(jButton12.getText());
            jButton12.setVisible(false);
            jButton17.setVisible(true);
            int valorbt12 = vetor[11];
            int valorbt17 = vetor[16];
            vetor[11] = valorbt17;
            vetor[16] = valorbt12;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(!jButton8.isVisible()){
            jButton8.setText(jButton13.getText());
            jButton13.setVisible(false);
            jButton8.setVisible(true);
            int valorbt13 = vetor[12];
            int valorbt8 = vetor[7];
            vetor[12] = valorbt8;
            vetor[7] = valorbt13;
            this.addCounter();
        }
        if(!jButton14.isVisible()){
            jButton14.setText(jButton13.getText());
            jButton13.setVisible(false);
            jButton14.setVisible(true);
            int valorbt13 = vetor[12];
            int valorbt14 = vetor[13];
            vetor[12] = valorbt14;
            vetor[13] = valorbt13;
            this.addCounter();
        }
        if(!jButton12.isVisible()){
            jButton12.setText(jButton13.getText());
            jButton13.setVisible(false);
            jButton12.setVisible(true);
            int valorbt13 = vetor[12];
            int valorbt12 = vetor[11];
            vetor[12] = valorbt12;
            vetor[11] = valorbt13;
            this.addCounter();
        }
        if(!jButton18.isVisible()){
            jButton18.setText(jButton13.getText());
            jButton13.setVisible(false);
            jButton18.setVisible(true);
            int valorbt13 = vetor[12];
            int valorbt18 = vetor[17];
            vetor[12] = valorbt18;
            vetor[17] = valorbt13;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(!jButton13.isVisible()){
            jButton13.setText(jButton14.getText());
            jButton14.setVisible(false);
            jButton13.setVisible(true);
            int valorbt14 = vetor[13];
            int valorbt13 = vetor[12];
            vetor[13] = valorbt13;
            vetor[12] = valorbt14;
            this.addCounter();
        }
        if(!jButton9.isVisible()){
            jButton9.setText(jButton14.getText());
            jButton14.setVisible(false);
            jButton9.setVisible(true);
            int valorbt14 = vetor[13];
            int valorbt9 = vetor[8];
            vetor[13] = valorbt9;
            vetor[8] = valorbt14;
            this.addCounter();
        }
        if(!jButton15.isVisible()){
            jButton15.setText(jButton14.getText());
            jButton14.setVisible(false);
            jButton15.setVisible(true);
            int valorbt14 = vetor[13];
            int valorbt15 = vetor[14];
            vetor[13] = valorbt15;
            vetor[14] = valorbt14;
            this.addCounter();
        }
        if(!jButton19.isVisible()){
            jButton19.setText(jButton14.getText());
            jButton14.setVisible(false);
            jButton19.setVisible(true);
            int valorbt14 = vetor[13];
            int valorbt19 = vetor[18];
            vetor[13] = valorbt19;
            vetor[18] = valorbt14;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(!jButton14.isVisible()){
            jButton14.setText(jButton15.getText());
            jButton15.setVisible(false);
            jButton14.setVisible(true);
            int valorbt15 = vetor[14];
            int valorbt14 = vetor[13];
            vetor[14] = valorbt14;
            vetor[13] = valorbt15;
            this.addCounter();
        }
        if(!jButton10.isVisible()){
            jButton10.setText(jButton15.getText());
            jButton15.setVisible(false);
            jButton10.setVisible(true);
            int valorbt15 = vetor[14];
            int valorbt10 = vetor[9];
            vetor[14] = valorbt10;
            vetor[9] = valorbt15;
            this.addCounter();
        }
        if(!jButton20.isVisible()){
            jButton20.setText(jButton15.getText());
            jButton15.setVisible(false);
            jButton20.setVisible(true);
            int valorbt15 = vetor[14];
            int valorbt20 = vetor[19];
            vetor[14] = valorbt20;
            vetor[19] = valorbt15;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if(!jButton11.isVisible()){
            jButton11.setText(jButton16.getText());
            jButton16.setVisible(false);
            jButton11.setVisible(true);
            int valorbt16 = vetor[15];
            int valorbt11 = vetor[10];
            vetor[15] = valorbt11;
            vetor[10] = valorbt16;
            this.addCounter();
        }
        if(!jButton17.isVisible()){
            jButton17.setText(jButton16.getText());
            jButton16.setVisible(false);
            jButton17.setVisible(true);
            int valorbt16 = vetor[15];
            int valorbt17 = vetor[16];
            vetor[15] = valorbt17;
            vetor[16] = valorbt16;
            this.addCounter();
        }
        if(!jButton21.isVisible()){
            jButton21.setText(jButton16.getText());
            jButton16.setVisible(false);
            jButton21.setVisible(true);
            int valorbt16 = vetor[15];
            int valorbt21 = vetor[20];
            vetor[15] = valorbt21;
            vetor[20] = valorbt16;
            this.addCounter();
        }
        
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if(!jButton12.isVisible()){
            jButton12.setText(jButton17.getText());
            jButton17.setVisible(false);
            jButton12.setVisible(true);
            int valorbt17 = vetor[16];
            int valorbt12 = vetor[11];
            vetor[16] = valorbt12;
            vetor[11] = valorbt17;
            this.addCounter();
        }
        if(!jButton16.isVisible()){
            jButton16.setText(jButton17.getText());
            jButton17.setVisible(false);
            jButton16.setVisible(true);
            int valorbt17 = vetor[16];
            int valorbt16 = vetor[15];
            vetor[16] = valorbt16;
            vetor[15] = valorbt17;
            this.addCounter();
        }
        if(!jButton18.isVisible()){
            jButton18.setText(jButton17.getText());
            jButton17.setVisible(false);
            jButton18.setVisible(true);
            int valorbt17 = vetor[16];
            int valorbt18 = vetor[17];
            vetor[16] = valorbt18;
            vetor[17] = valorbt17;
            this.addCounter();
        }
        if(!jButton22.isVisible()){
            jButton22.setText(jButton17.getText());
            jButton17.setVisible(false);
            jButton22.setVisible(true);
            int valorbt17 = vetor[16];
            int valorbt22 = vetor[21];
            vetor[16] = valorbt22;
            vetor[21] = valorbt17;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if(!jButton23.isVisible()){
            jButton23.setText(jButton18.getText());
            jButton18.setVisible(false);
            jButton23.setVisible(true);
            int valorbt18 = vetor[17];
            int valorbt23 = vetor[22];
            vetor[17] = valorbt23;
            vetor[22] = valorbt18;
            this.addCounter();
        }
        if(!jButton17.isVisible()){
            jButton17.setText(jButton18.getText());
            jButton18.setVisible(false);
            jButton17.setVisible(true);
            int valorbt18 = vetor[17];
            int valorbt17 = vetor[16];
            vetor[17] = valorbt17;
            vetor[16] = valorbt18;
            this.addCounter();
        }
        if(!jButton13.isVisible()){
            jButton13.setText(jButton18.getText());
            jButton18.setVisible(false);
            jButton13.setVisible(true);
            int valorbt18 = vetor[17];
            int valorbt13 = vetor[12];
            vetor[17] = valorbt13;
            vetor[12] = valorbt18;
            this.addCounter();
        }
        if(!jButton19.isVisible()){
            jButton19.setText(jButton18.getText());
            jButton18.setVisible(false);
            jButton19.setVisible(true);
            int valorbt18 = vetor[17];
            int valorbt19 = vetor[18];
            vetor[17] = valorbt19;
            vetor[18] = valorbt18;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if(!jButton14.isVisible()){
            jButton14.setText(jButton19.getText());
            jButton19.setVisible(false);
            jButton14.setVisible(true);
            int valorbt19 = vetor[18];
            int valorbt14 = vetor[13];
            vetor[18] = valorbt14;
            vetor[13] = valorbt19;
            this.addCounter();
        }
        if(!jButton18.isVisible()){
            jButton18.setText(jButton19.getText());
            jButton19.setVisible(false);
            jButton18.setVisible(true);
            int valorbt19 = vetor[18];
            int valorbt18 = vetor[17];
            vetor[18] = valorbt18;
            vetor[17] = valorbt19;
            this.addCounter();
        }
        if(!jButton24.isVisible()){
            jButton24.setText(jButton19.getText());
            jButton19.setVisible(false);
            jButton24.setVisible(true);
            int valorbt19 = vetor[18];
            int valorbt24 = vetor[23];
            vetor[18] = valorbt24;
            vetor[23] = valorbt19;
            this.addCounter();
        }
        if(!jButton20.isVisible()){
            jButton20.setText(jButton19.getText());
            jButton19.setVisible(false);
            jButton20.setVisible(true);
            int valorbt19 = vetor[18];
            int valorbt20 = vetor[19];
            vetor[18] = valorbt20;
            vetor[19] = valorbt19;
            this.addCounter();
        }
        
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if(!jButton15.isVisible()){
            jButton15.setText(jButton20.getText());
            jButton20.setVisible(false);
            jButton15.setVisible(true);
            int valorbt20 = vetor[19];
            int valorbt15 = vetor[14];
            vetor[19] = valorbt15;
            vetor[14] = valorbt20;
            this.addCounter();
        }
        if(!jButton19.isVisible()){
            jButton19.setText(jButton20.getText());
            jButton20.setVisible(false);
            jButton19.setVisible(true);
            int valorbt20 = vetor[19];
            int valorbt19 = vetor[18];
            vetor[19] = valorbt19;
            vetor[18] = valorbt20;
            this.addCounter();
        }
        if(!jButton25.isVisible()){
            jButton25.setText(jButton20.getText());
            jButton20.setVisible(false);
            jButton25.setVisible(true);
            int valorbt20 = vetor[19];
            int valorbt25 = vetor[24];
            vetor[19] = valorbt25;
            vetor[24] = valorbt20;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        if(!jButton16.isVisible()){
            jButton16.setText(jButton21.getText());
            jButton21.setVisible(false);
            jButton16.setVisible(true);
            int valorbt21 = vetor[20];
            int valorbt16 = vetor[15];
            vetor[20] = valorbt16;
            vetor[15] = valorbt21;
            this.addCounter();
        }
        if(!jButton22.isVisible()){
            jButton22.setText(jButton21.getText());
            jButton21.setVisible(false);
            jButton22.setVisible(true);
            int valorbt21 = vetor[20];
            int valorbt22 = vetor[21];
            vetor[20] = valorbt22;
            vetor[21] = valorbt21;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        if(!jButton21.isVisible()){
            jButton21.setText(jButton22.getText());
            jButton22.setVisible(false);
            jButton21.setVisible(true);
            int valorbt22 = vetor[21];
            int valorbt21 = vetor[20];
            vetor[21] = valorbt21;
            vetor[20] = valorbt22;
            this.addCounter();
        }
        if(!jButton17.isVisible()){
            jButton17.setText(jButton22.getText());
            jButton22.setVisible(false);
            jButton17.setVisible(true);
            int valorbt22 = vetor[21];
            int valorbt17 = vetor[16];
            vetor[21] = valorbt17;
            vetor[16] = valorbt22;
            this.addCounter();
        }
        if(!jButton23.isVisible()){
            jButton23.setText(jButton22.getText());
            jButton22.setVisible(false);
            jButton23.setVisible(true);
            int valorbt22 = vetor[21];
            int valorbt23 = vetor[22];
            vetor[21] = valorbt23;
            vetor[22] = valorbt22;
            this.addCounter();
        }
        
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        if(!jButton22.isVisible()){
            jButton22.setText(jButton23.getText());
            jButton23.setVisible(false);
            jButton22.setVisible(true);
            int valorbt23 = vetor[22];
            int valorbt22 = vetor[21];
            vetor[22] = valorbt22;
            vetor[21] = valorbt23;
            this.addCounter();
        }
        if(!jButton18.isVisible()){
            jButton18.setText(jButton23.getText());
            jButton23.setVisible(false);
            jButton18.setVisible(true);
            int valorbt23 = vetor[22];
            int valorbt18 = vetor[17];
            vetor[22] = valorbt18;
            vetor[17] = valorbt23;
            this.addCounter();
        }
        if(!jButton24.isVisible()){
            jButton24.setText(jButton23.getText());
            jButton23.setVisible(false);
            jButton24.setVisible(true);
            int valorbt23 = vetor[22];
            int valorbt24 = vetor[23];
            vetor[22] = valorbt24;
            vetor[23] = valorbt23;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        if(!jButton23.isVisible()){
            jButton23.setText(jButton24.getText());
            jButton24.setVisible(false);
            jButton23.setVisible(true);
            int valorbt24 = vetor[23];
            int valorbt23 = vetor[22];
            vetor[23] = valorbt23;
            vetor[22] = valorbt24;
            this.addCounter();
        }
        if(!jButton19.isVisible()){
            jButton19.setText(jButton24.getText());
            jButton24.setVisible(false);
            jButton19.setVisible(true);
            int valorbt24 = vetor[23];
            int valorbt19 = vetor[18];
            vetor[23] = valorbt19;
            vetor[18] = valorbt24;
            this.addCounter();
        }
        if(!jButton25.isVisible()){
            jButton25.setText(jButton24.getText());
            jButton24.setVisible(false);
            jButton25.setVisible(true);
            int valorbt24 = vetor[23];
            int valorbt25 = vetor[24];
            vetor[23] = valorbt25;
            vetor[24] = valorbt24;
            this.addCounter();
        }
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        if(!jButton20.isVisible()){
            jButton20.setText(jButton25.getText());
            jButton25.setVisible(false);
            jButton20.setVisible(true);
            int valorbt25 = vetor[24];
            int valorbt20 = vetor[19];
            vetor[24] = valorbt20;
            vetor[19] = valorbt25;
            this.addCounter();
        }
        if(!jButton24.isVisible()){
            jButton24.setText(jButton25.getText());
            jButton25.setVisible(false);
            jButton24.setVisible(true);
            int valorbt25 = vetor[24];
            int valorbt24 = vetor[23];
            vetor[24] = valorbt24;
            vetor[23] = valorbt25;
            this.addCounter();
        }
        
        boolean winResult = win();
        if(winResult == true){
            MsgWin();
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void ganharBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganharBTActionPerformed
        MsgWin();
    }//GEN-LAST:event_ganharBTActionPerformed

    private void refreshBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBTMouseEntered
        changeMusic(1);
        refreshBT.setIcon(new ImageIcon("src/imagens/btRefreshShadow.png"));
    }//GEN-LAST:event_refreshBTMouseEntered

    private void refreshBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBTMouseExited
        refreshBT.setIcon(new ImageIcon("src/imagens/btRefresh.png"));
    }//GEN-LAST:event_refreshBTMouseExited

    private void refreshBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBTActionPerformed
        positionRandomizer(vetor);
        numPosition();
        resetCounter();
    }//GEN-LAST:event_refreshBTActionPerformed

    private void tfMovimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMovimentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMovimentosActionPerformed

    private void voltarBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarBTMouseEntered
        changeMusic(1);
        voltarBT.setIcon(new ImageIcon("src/imagens/btVoltarShadow.png"));
    }//GEN-LAST:event_voltarBTMouseEntered

    private void voltarBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarBTMouseExited
        voltarBT.setIcon(new ImageIcon("src/imagens/btVoltar.png"));
    }//GEN-LAST:event_voltarBTMouseExited

    private void voltarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTActionPerformed
        new JanelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarBTActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLB;
    private javax.swing.JButton ganharBT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel level3LB;
    private javax.swing.JButton refreshBT;
    private javax.swing.JTextField tfMovimentos;
    private javax.swing.JButton voltarBT;
    // End of variables declaration//GEN-END:variables
}
