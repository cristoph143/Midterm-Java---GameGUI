/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.io.File;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author joopb16
 */
public class GameFrame extends javax.swing.JFrame {

    
    /**
     * Creates new form GameFrame
     */
    public GameFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundpanel = new javax.swing.JPanel();
        upperpaNEL = new javax.swing.JPanel();
        p1bar = new javax.swing.JProgressBar();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        vs = new javax.swing.JLabel();
        p1bar2 = new javax.swing.JProgressBar();
        lowerpanel = new javax.swing.JPanel();
        surrender = new javax.swing.JButton();
        rock = new javax.swing.JButton();
        scissor = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        paper = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        winLoss = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundpanel.setBackground(new java.awt.Color(0, 204, 255));

        upperpaNEL.setBackground(new java.awt.Color(255, 255, 102));

        vs.setText("VS");

        javax.swing.GroupLayout upperpaNELLayout = new javax.swing.GroupLayout(upperpaNEL);
        upperpaNEL.setLayout(upperpaNELLayout);
        upperpaNELLayout.setHorizontalGroup(
            upperpaNELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperpaNELLayout.createSequentialGroup()
                .addGroup(upperpaNELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(upperpaNELLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p1bar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(vs, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(p1bar2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(upperpaNELLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        upperpaNELLayout.setVerticalGroup(
            upperpaNELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperpaNELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upperpaNELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(vs, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(p1bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p1bar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(upperpaNELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        lowerpanel.setBackground(new java.awt.Color(204, 204, 255));

        surrender.setText("Surrender");
        surrender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                surrenderMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                surrenderMousePressed(evt);
            }
        });

        rock.setText("Rock");
        rock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rockMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rockMousePressed(evt);
            }
        });
        rock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockActionPerformed(evt);
            }
        });

        scissor.setText("Scissor");
        scissor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scissorMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                scissorMousePressed(evt);
            }
        });
        scissor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        paper.setText("Paper");
        paper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paperMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paperMousePressed(evt);
            }
        });
        paper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperActionPerformed(evt);
            }
        });

        reset.setText("Reset");

        winLoss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout lowerpanelLayout = new javax.swing.GroupLayout(lowerpanel);
        lowerpanel.setLayout(lowerpanelLayout);
        lowerpanelLayout.setHorizontalGroup(
            lowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lowerpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lowerpanelLayout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(lowerpanelLayout.createSequentialGroup()
                        .addComponent(paper, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(lowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lowerpanelLayout.createSequentialGroup()
                                .addGroup(lowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rock, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(surrender, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(lowerpanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(winLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(scissor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))))
        );
        lowerpanelLayout.setVerticalGroup(
            lowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lowerpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rock, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(lowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(winLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scissor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paper, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(surrender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout backgroundpanelLayout = new javax.swing.GroupLayout(backgroundpanel);
        backgroundpanel.setLayout(backgroundpanelLayout);
        backgroundpanelLayout.setHorizontalGroup(
            backgroundpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(backgroundpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(upperpaNEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lowerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundpanelLayout.setVerticalGroup(
            backgroundpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundpanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(upperpaNEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lowerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//not included
    private void scissorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorActionPerformed

    }//GEN-LAST:event_scissorActionPerformed

    private void rockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockActionPerformed

    }//GEN-LAST:event_rockActionPerformed

    private void rockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rockMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_rockMousePressed

    private void scissorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scissorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_scissorMousePressed

    private void paperMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paperMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_paperMousePressed

    private void surrenderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_surrenderMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_surrenderMousePressed

    private void paperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_paperActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed
//up until here
    
    private void random(int num){
        Random rand = new Random();
        int val = rand.nextInt(3);
        int g = 0;
        //0 = rock, 1 = paper, 2 = scissor
        switch(val)
        {
            case 0: 
                    System.out.println(new File("rock.jpg").getAbsolutePath());
                    p2.setIcon(new ImageIcon("rock.jpg"));
                    switch(num)
                    {
                        case 0: winLoss.setText("Draw");
                                break;
                        case 1: winLoss.setText("P1 Win");
                                p1bar.getValue();
                                p1bar.setValue(g++);
                                break;
                        case 2: winLoss.setText("P2 Win");
                                p1bar2.getValue();
                                p1bar2.setValue(g++);
                                break;
                    }
                    break;
            case 1: 
                    System.out.println(new File("paper.jpg").getAbsolutePath());
                    p2.setIcon(new ImageIcon("paper.jpg"));
                    switch(num)
                    {
                        case 0: winLoss.setText("P2 Win");
                                p1bar2.getValue();
                                p1bar2.setValue(g++);
                                break;
                        case 1: winLoss.setText("Draw");
                                break;
                        case 2: winLoss.setText("P1 Win");
                                p1bar.getValue();
                                p1bar.setValue(g++);
                                break;
                    }
                    break;
            case 2: 
                    System.out.println(new File("scissor.jpg").getAbsolutePath());
                    p2.setIcon(new ImageIcon("scissor.jpg"));
                    switch(num)
                    {
                        case 0: winLoss.setText("P1 Win");
                                p1bar.getValue();
                                p1bar.setValue(g++);
                                break;
                        case 1: winLoss.setText("P2 Win");
                                p1bar2.getValue();
                                p1bar2.setValue(g++);
                                break;
                        case 2: winLoss.setText("Draw");
                                break;
                    }
                    break;
            default:
                    break;
                
        }
        
    }
    
    
    private void paperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paperMouseClicked
        // TODO add your handling code here:
        System.out.println(new File("paper.jpg").getAbsolutePath());
        p1.setIcon(new ImageIcon("paper.jpg"));
        random(1);
        
        
    }//GEN-LAST:event_paperMouseClicked

    private void rockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rockMouseClicked
        // TODO add your handling code here:
        System.out.println(new File("rock.jpg").getAbsolutePath());
        p1.setIcon(new ImageIcon("rock.jpg"));
        random(0);
    }//GEN-LAST:event_rockMouseClicked

    private void scissorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scissorMouseClicked
        // TODO add your handling code here:
        System.out.println(new File("scissor.jpg").getAbsolutePath());
        p1.setIcon(new ImageIcon("scissor.jpg"));
        random(2);
    }//GEN-LAST:event_scissorMouseClicked

    private void surrenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_surrenderMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_surrenderMouseClicked

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
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundpanel;
    private javax.swing.JButton exit;
    private javax.swing.JPanel lowerpanel;
    private javax.swing.JLabel p1;
    private javax.swing.JProgressBar p1bar;
    private javax.swing.JProgressBar p1bar2;
    private javax.swing.JLabel p2;
    private javax.swing.JButton paper;
    private javax.swing.JButton reset;
    private javax.swing.JButton rock;
    private javax.swing.JButton scissor;
    private javax.swing.JButton surrender;
    private javax.swing.JPanel upperpaNEL;
    private javax.swing.JLabel vs;
    private javax.swing.JLabel winLoss;
    // End of variables declaration//GEN-END:variables
}
