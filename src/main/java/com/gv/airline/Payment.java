/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gv.airline;

import com.airplane.logic.Airline;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gvpal
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form payment
     */
    public Payment() {
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

        jLabel2 = new javax.swing.JLabel();
        res = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Pnam = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        b = new javax.swing.JTextField();
        pl = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        res1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        res2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel2.setText("PAYMENT DETAILS");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        res.setBackground(new java.awt.Color(0, 0, 0));
        res.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        res.setForeground(new java.awt.Color(255, 255, 255));
        res.setText("Pay");
        res.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pan.setBackground(new java.awt.Color(102, 102, 255));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel3.setText("Passenger name     :");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel4.setText("Card number         :");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel5.setText("Payable amount     :");

        Pnam.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        Pnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnamActionPerformed(evt);
            }
        });

        c.setEditable(false);
        c.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel6.setText(" Passenger ID         :");

        id.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel1.setText("Plane number     :");

        b.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N

        pl.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N

        jButton3.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jButton3.setText("fetch payable amount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLayout = new javax.swing.GroupLayout(pan);
        pan.setLayout(panLayout);
        panLayout.setHorizontalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                    .addGroup(panLayout.createSequentialGroup()
                        .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pnam, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c))))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panLayout.setVerticalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pnam, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))))
                .addGap(18, 18, 18)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        res1.setBackground(new java.awt.Color(0, 0, 0));
        res1.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        res1.setForeground(new java.awt.Color(255, 255, 255));
        res1.setText("print   data");
        res1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        res1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res1ActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ));
        table.setRowHeight(50);
        table.setRowMargin(1);
        jScrollPane1.setViewportView(table);

        res2.setBackground(new java.awt.Color(0, 0, 0));
        res2.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        res2.setForeground(new java.awt.Color(255, 255, 255));
        res2.setText("view bill");
        res2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        res2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(374, 374, 374))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(res1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(res2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(359, 359, 359))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(res2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(res1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
        // TODO add your handling code here:
        String name = Pnam.getText();
        String card = b.getText();
        String amount = c.getText();

        Airline dl = new Airline();
        if (name.isEmpty() || card.isEmpty() || amount.isEmpty()) {
            JOptionPane.showMessageDialog(res, "value is not entered in Required field");
        }
        else if (!name.matches("[A-Za-z]*$"))  {
            JOptionPane.showMessageDialog(null, "Invalid NAME entered");
        }
        else if (!card.matches("[0-9]*$")) {
            JOptionPane.showMessageDialog(null, "Invalid card number");

        } else if ((!amount.matches("[0-9.]*$"))) {
            JOptionPane.showMessageDialog(null, "given amount value is not valid");
        }
        else if (dl.payment(name, card, amount)) {
            JOptionPane.showMessageDialog(res, "\nPayment Successfull \n your booking is confirmed");

            //  setVisible(false);
        } else {

            JOptionPane.showMessageDialog(res, "Payment failed");

        }


    }//GEN-LAST:event_resActionPerformed

    private void PnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnamActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        new Pbcheck().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Mainpage().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void res1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res1ActionPerformed
        // TODO add your handling code here:
        try {
            table.print(JTable.PrintMode.NORMAL);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_res1ActionPerformed

    private void res2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res2ActionPerformed
        // TODO add your handling code here:
        try {
            java.sql.ResultSet rs = new Airline().paymentbill();
            Vector vect = new Vector();
           
            vect.add("passenger name");
            vect.add("card no");
            vect.add("amount");

            DefaultTableModel dtm = new DefaultTableModel(vect, 0);
            while (rs.next()) {
                Object ob[] = new Object[3];
                ob[0] = rs.getString(1);
                ob[1] = rs.getString(3);
                 ob[2] = rs.getString(4);
                

                dtm.addRow(ob);
                table.setModel(dtm);

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_res2ActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         String plno = pl.getText();
         String amt=c.getText();
         try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "root");
    PreparedStatement pstmt1 = con.prepareStatement("select * from bill where pid = ?");
    pstmt1.setString(1,plno);
    ResultSet rs = pstmt1.executeQuery();
         if (rs.next()) {
          String a=rs.getString("pid");
           System.out.println(a);
          if(a.equals( pl.getText())){
     Class.forName("com.mysql.cj.jdbc.Driver");
    Connection co = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "root");
     PreparedStatement pstmt2 = co.prepareStatement("select * from bill where amount = ?");
    pstmt2.setString(1,amt);
    ResultSet rs2 = pstmt2.executeQuery();
                     String g=rs.getString("amount");
                      System.out.println(g);
                     c.setText(g);
                  }
              
          
         }
         }
        
         catch(Exception e) {
    JOptionPane.showMessageDialog(null, e);
         }
        
          
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Pnam;
    private javax.swing.JTextField b;
    private javax.swing.JTextField c;
    public javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pan;
    public javax.swing.JTextField pl;
    private javax.swing.JButton res;
    private javax.swing.JButton res1;
    private javax.swing.JButton res2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
