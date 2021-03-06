/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfcheckout.gui;

import java.time.LocalDate;
import java.time.Month;
import java.time.DateTimeException;

/**
 *
 * @author Cole
 */
public class ApproveTransactionGUI extends javax.swing.JFrame {
  
    ProductGUI pg;
    TransactionGUI tr;
    
    /**
     * Creates new form ApproveTransaction
     */
    public ApproveTransactionGUI() {
        initComponents();
    }
    
    public ApproveTransactionGUI(TransactionGUI tr) {
        initComponents();
        this.tr = tr;
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
        SelectMonth = new javax.swing.JComboBox();
        SelectDay = new javax.swing.JComboBox<>();
        SelectYear = new javax.swing.JComboBox<>();
        tobacco = new javax.swing.JButton();
        alcohol = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Enter the customer's birthdate:");

        SelectMonth.setMaximumRowCount(12);
        SelectMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        SelectDay.setMaximumRowCount(31);
        SelectDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        SelectYear.setMaximumRowCount(116);
        SelectYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        tobacco.setText("Check for Tobacco");
        tobacco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tobaccoActionPerformed(evt);
            }
        });

        alcohol.setText("Check for Alcohol");
        alcohol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alcoholActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(SelectMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SelectDay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SelectYear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(tobacco, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(alcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SelectDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectMonth)
                    .addComponent(SelectYear))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tobacco, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tobaccoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tobaccoActionPerformed
        // TODO add your handling code here:
        LocalDate now = LocalDate.now();
        LocalDate maxDate = now.minusYears(18); // customer must be born on or before this date
        
        String month = (String)SelectMonth.getSelectedItem(); // get selected month
        String day = (String)SelectDay.getSelectedItem(); // get selected day
        String year = (String)SelectYear.getSelectedItem(); // get selected year
        LocalDate enteredDate;
        
        // create date from selections; if invalid, return
        try {
            enteredDate = LocalDate.of(Integer.parseInt(year), Month.valueOf(month.toUpperCase()), Integer.parseInt(day));
        } catch (DateTimeException ex) {
            return;
        }
        
        if (enteredDate.isEqual(maxDate) || enteredDate.isBefore(maxDate)) // customer is 18 or older
        {
            // open up list of products, delete window
            pg = new ProductGUI(tr, "Alcohol/Tobacco");
            pg.setVisible(true);
            this.dispose();
        }
        
        else // customer is not of age
            this.dispose();
    }//GEN-LAST:event_tobaccoActionPerformed

    private void alcoholActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alcoholActionPerformed
        // TODO add your handling code here:
        LocalDate now = LocalDate.now();
        LocalDate maxDate = now.minusYears(21); // customer must be born on or before this date
        
        String month = (String)SelectMonth.getSelectedItem(); // get selected month
        String day = (String)SelectDay.getSelectedItem(); // get selected day
        String year = (String)SelectYear.getSelectedItem(); // get selected year
        LocalDate enteredDate;
        
        // create date from selections by converting to appropriate types; if date is invalid, return
        try {
            enteredDate = LocalDate.of(Integer.parseInt(year), Month.valueOf(month.toUpperCase()), Integer.parseInt(day));
        } catch (Exception ex) {
            return;        
        }
        
        if (enteredDate.isEqual(maxDate) || enteredDate.isBefore(maxDate)) // customer is 21 or older
        {
            // open up list of products, delete window
            pg = new ProductGUI(tr, "Alcohol/Tobacco");
            pg.setVisible(true);
            this.dispose();
        }
        
        else // customer is not of age
            this.dispose();
    }//GEN-LAST:event_alcoholActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ApproveTransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApproveTransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApproveTransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApproveTransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApproveTransactionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SelectDay;
    private javax.swing.JComboBox SelectMonth;
    private javax.swing.JComboBox<String> SelectYear;
    private javax.swing.JButton alcohol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton tobacco;
    // End of variables declaration//GEN-END:variables
}
