/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sohak9660
 */
public class ChampionMatchups extends javax.swing.JFrame {

    /**
     * Creates new form ChampionMatchups
     */
    public ChampionMatchups() {
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

        BackButton = new javax.swing.JButton();
        BlackPanel = new javax.swing.JPanel();
        Tittle = new javax.swing.JLabel();
        SowrdImage = new javax.swing.JLabel();
        SwordImage2 = new javax.swing.JLabel();
        MeleeVsRange = new javax.swing.JLabel();
        RangeVsPoke = new javax.swing.JLabel();
        MeleeVsPoke = new javax.swing.JLabel();
        BurstVsMelee = new javax.swing.JLabel();
        BurstVsRange = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FifthInfo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        SecondInfo = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ForthInfo = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        FirstInfo = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        ThirdInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1210, 685));
        getContentPane().setLayout(null);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(0, 620, 55, 23);

        BlackPanel.setBackground(new java.awt.Color(0, 0, 0));

        Tittle.setBackground(new java.awt.Color(0, 0, 0));
        Tittle.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        Tittle.setForeground(new java.awt.Color(0, 204, 204));
        Tittle.setText("Please Select the Matchup You Would Like Infomation On");

        SowrdImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swords.jpg"))); // NOI18N
        SowrdImage.setText("jLabel2");

        SwordImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swords.jpg"))); // NOI18N
        SwordImage2.setText("jLabel2");

        javax.swing.GroupLayout BlackPanelLayout = new javax.swing.GroupLayout(BlackPanel);
        BlackPanel.setLayout(BlackPanelLayout);
        BlackPanelLayout.setHorizontalGroup(
            BlackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SowrdImage, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(Tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(SwordImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BlackPanelLayout.setVerticalGroup(
            BlackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BlackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SwordImage2)
                    .addComponent(SowrdImage))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(BlackPanel);
        BlackPanel.setBounds(0, 0, 1200, 137);

        MeleeVsRange.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        MeleeVsRange.setText("Melee vs Range");
        getContentPane().add(MeleeVsRange);
        MeleeVsRange.setBounds(70, 160, 149, 25);

        RangeVsPoke.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        RangeVsPoke.setText("Range vs Poke/Roam");
        getContentPane().add(RangeVsPoke);
        RangeVsPoke.setBounds(480, 320, 199, 25);

        MeleeVsPoke.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        MeleeVsPoke.setText("Melee vs Poke/Roam");
        getContentPane().add(MeleeVsPoke);
        MeleeVsPoke.setBounds(595, 163, 196, 25);

        BurstVsMelee.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        BurstVsMelee.setText("Burst vs Melee");
        getContentPane().add(BurstVsMelee);
        BurstVsMelee.setBounds(872, 163, 148, 25);

        BurstVsRange.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        BurstVsRange.setText("Burst vs Poke/Roam");
        getContentPane().add(BurstVsRange);
        BurstVsRange.setBounds(302, 163, 198, 25);

        FifthInfo.setColumns(20);
        FifthInfo.setRows(5);
        FifthInfo.setText("This matchup can go\neither way, since\nboth champions\nwant to do the same\nthing, whichever\nchamp is able to \ndo a better job\nwould win.");
        jScrollPane1.setViewportView(FifthInfo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(510, 360, 183, 96);

        SecondInfo.setColumns(20);
        SecondInfo.setRows(5);
        SecondInfo.setText("In this matchup\neither can win the \nmatch but it depends\non how each player \nplays. The poke \nchamp wants to \nexchange hits and\ngo for quike fights\nbut the burst champ\nwants to go jump\nand assasin the\nenemy.");
        jScrollPane2.setViewportView(SecondInfo);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(330, 210, 183, 96);

        ForthInfo.setColumns(20);
        ForthInfo.setRows(5);
        ForthInfo.setText("In this matchup\nthe melee champion\nactually stands a \nchance, the Melee\nchampion just has to \nbuild a few \nressistances and\nhe can easily \nsurvive the lane\nmatchup");
        jScrollPane3.setViewportView(ForthInfo);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(880, 210, 183, 113);

        FirstInfo.setColumns(20);
        FirstInfo.setRows(5);
        FirstInfo.setText("The range champion\nwould have the \nadvantage because\nthey can constantly\ndeal damage to the \nrange champion and\nkeep them at low \nhealth and if an \nopening is found\nthe range champ\ncan all in the \nmelee champ and\nget a kill.");
        jScrollPane4.setViewportView(FirstInfo);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(60, 210, 183, 96);

        ThirdInfo.setColumns(20);
        ThirdInfo.setRows(5);
        ThirdInfo.setText("This matchup is in\nfavor for the \npoke/roam champ,\nsimilar to the range\nchamp they want to \njump poke the enemy\nuntil they are low\nhealth then jump in \nfor the kill.");
        jScrollPane5.setViewportView(ThirdInfo);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(610, 210, 183, 96);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        new SecondScreen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChampionMatchups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChampionMatchups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChampionMatchups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChampionMatchups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChampionMatchups().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel BlackPanel;
    private javax.swing.JLabel BurstVsMelee;
    private javax.swing.JLabel BurstVsRange;
    private javax.swing.JTextArea FifthInfo;
    private javax.swing.JTextArea FirstInfo;
    private javax.swing.JTextArea ForthInfo;
    private javax.swing.JLabel MeleeVsPoke;
    private javax.swing.JLabel MeleeVsRange;
    private javax.swing.JLabel RangeVsPoke;
    private javax.swing.JTextArea SecondInfo;
    private javax.swing.JLabel SowrdImage;
    private javax.swing.JLabel SwordImage2;
    private javax.swing.JTextArea ThirdInfo;
    private javax.swing.JLabel Tittle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
