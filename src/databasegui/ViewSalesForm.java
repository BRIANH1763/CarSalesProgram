/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasegui;

import java.util.ArrayList;

/**
 *
 * @author b-hou
 */
public class ViewSalesForm extends javax.swing.JFrame {

    private CustomerConnection CustomerConnection;
    private Sales[] Sales;
    private int currentIndex;
    private int numberOfRecords;
    private CustomerConnection dc = null;
    private ArrayList data = null;

    /**
     * Creates new form ViewSalesForm
     */
    public ViewSalesForm() {
        initComponents();
        CustomerConnection = new CustomerConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOrderID = new javax.swing.JTextField();
        txtStaffID = new javax.swing.JTextField();
        txtCustomerID = new javax.swing.JTextField();
        txtCarID = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtReceiptDate = new javax.swing.JTextField();
        btnSalesView = new javax.swing.JButton();
        btnMain = new javax.swing.JButton();
        currRecordTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        maxRecordTextField = new javax.swing.JTextField();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Impact", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sales");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(321, 11, 93, 45);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OrderID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(266, 93, 100, 21);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("StaffID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(275, 120, 94, 21);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CustomerID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(235, 148, 134, 21);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CarID:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(295, 176, 74, 21);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(267, 204, 102, 21);

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Purchase Date:");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(199, 232, 170, 21);
        getContentPane().add(txtOrderID);
        txtOrderID.setBounds(390, 90, 102, 20);
        getContentPane().add(txtStaffID);
        txtStaffID.setBounds(390, 180, 102, 20);
        getContentPane().add(txtCustomerID);
        txtCustomerID.setBounds(390, 150, 102, 20);
        getContentPane().add(txtCarID);
        txtCarID.setBounds(390, 120, 102, 20);
        getContentPane().add(txtQuantity);
        txtQuantity.setBounds(390, 210, 102, 20);
        getContentPane().add(txtReceiptDate);
        txtReceiptDate.setBounds(390, 240, 102, 20);

        btnSalesView.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 18)); // NOI18N
        btnSalesView.setText("Browse all sales");
        btnSalesView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesViewActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalesView);
        btnSalesView.setBounds(10, 306, 213, 29);

        btnMain.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 18)); // NOI18N
        btnMain.setText("Back to main menu");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });
        getContentPane().add(btnMain);
        btnMain.setBounds(470, 350, 215, 29);
        getContentPane().add(currRecordTextField);
        currRecordTextField.setBounds(270, 310, 38, 20);

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Of");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(319, 310, 29, 21);

        maxRecordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxRecordTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(maxRecordTextField);
        maxRecordTextField.setBounds(360, 310, 44, 20);

        btnPrevious.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 18)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrevious);
        btnPrevious.setBounds(454, 306, 123, 29);

        btnNext.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 18)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext);
        btnNext.setBounds(606, 306, 81, 29);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgimages/car seat.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 710, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalesViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesViewActionPerformed
        try {
            //set up array to store the data sent back from the StudentConnection             
            Sales = CustomerConnection.getAllSales();
            //number of items in the array             
            numberOfRecords = CustomerConnection.numRecordsInQuery;
            currentIndex = 0;
            if (numberOfRecords != 0) {
                //display the first students details                 

                String Order = Integer.toString(Sales[currentIndex].getOrderID());
                String Staff = Integer.toString(Sales[currentIndex].getStaffID());
                String Car = Integer.toString(Sales[currentIndex].getCarID());
                String Customer = Integer.toString(Sales[currentIndex].getCustomerID());
                String Quantity = Integer.toString(Sales[currentIndex].getQuantity());
                
                txtOrderID.setText(Order);
                txtStaffID.setText(Staff);
                txtCarID.setText(Car);
                txtCustomerID.setText(Customer);
                txtQuantity.setText(Quantity);
                txtReceiptDate.setText(Sales[currentIndex].getPaymentDate());

                //display the current index for current and last record                 
                //currRecordTextField.setText(Integer.toString(currentIndex + 1));
                //maxRecordTextField.setText(Integer.toString(numberOfRecords));
                //enable buttons to navigate through students                 
                //btnPrevious.setEnabled(true);
                //btnNext.setEnabled(true);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // TODO add your handling code here:


    }//GEN-LAST:event_btnSalesViewActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        MainMenu form1 = new MainMenu();
        form1.setVisible( true );
        this.setVisible(false);

    }//GEN-LAST:event_btnMainActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        if (currentIndex != 0) {
            currentIndex--;
            currRecordTextField.setText(Integer.toString(currentIndex + 1));
            //display the students details at currentIndex
             String Order = Integer.toString(Sales[currentIndex].getOrderID());
                String Staff = Integer.toString(Sales[currentIndex].getStaffID());
                String Car = Integer.toString(Sales[currentIndex].getCarID());
                String Customer = Integer.toString(Sales[currentIndex].getCustomerID());
                String Quantity = Integer.toString(Sales[currentIndex].getQuantity());
                
                txtOrderID.setText(Order);
                txtStaffID.setText(Staff);
                txtCarID.setText(Car);
                txtCustomerID.setText(Customer);
                txtQuantity.setText(Quantity);
                txtReceiptDate.setText(Sales[currentIndex].getPaymentDate());
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        numberOfRecords = CustomerConnection.numRecordsInQuery;
        //button will move to the record after current one
        //if the last record is showing there will be no response
        if (currentIndex < numberOfRecords - 1) {
            currentIndex++;
            currRecordTextField.setText(Integer.toString(currentIndex + 1));
            //display the students details at currentIndex
             String Order = Integer.toString(Sales[currentIndex].getOrderID());
                String Staff = Integer.toString(Sales[currentIndex].getStaffID());
                String Car = Integer.toString(Sales[currentIndex].getCarID());
                String Customer = Integer.toString(Sales[currentIndex].getCustomerID());
                String Quantity = Integer.toString(Sales[currentIndex].getQuantity());
                
                txtOrderID.setText(Order);
                txtStaffID.setText(Staff);
                txtCarID.setText(Car);
                txtCustomerID.setText(Customer);
                txtQuantity.setText(Quantity);
                txtReceiptDate.setText(Sales[currentIndex].getPaymentDate());
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void maxRecordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxRecordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxRecordTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSalesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMain;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSalesView;
    private javax.swing.JTextField currRecordTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField maxRecordTextField;
    private javax.swing.JTextField txtCarID;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtOrderID;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtReceiptDate;
    private javax.swing.JTextField txtStaffID;
    // End of variables declaration//GEN-END:variables
}
