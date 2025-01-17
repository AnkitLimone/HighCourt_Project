/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mypackage;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankit Limone
 */
public class Training extends javax.swing.JFrame {

    /**
     * Creates new form Training
     */
    public Training() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtfieldinstitutename = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        CBresult = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        DCfrom = new com.toedter.calendar.JDateChooser();
        jLabel32 = new javax.swing.JLabel();
        DCto = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        txtfieldgrade = new javax.swing.JTextField();
        trainingadded = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        CBtrainingname = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        trainingtbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(254, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/police.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Kokila", 1, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("प्रथम   वाहिनी   विशेष   सशस्त्र   बल");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(628, 628, 628))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 129));

        jLabel50.setFont(new java.awt.Font("Kokila", 1, 58)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("पदस्थापना पंजी उच्च न्यायालय सुरक्षा, इंदौर ( मध्यप्रदेश )");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(448, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(0, 0, 129));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Developed & Designed By Students of International Institute of Professional Studies, Devi Ahilya Vishwavidhyalaya, Indore");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(464, 464, 464))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(244, 244, 244));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "विभागीय प्रशिक्षण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel28.setText("संस्थान का नाम :");

        txtfieldinstitutename.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtfieldinstitutename.setToolTipText("संस्थान का नाम दर्ज करें");
        txtfieldinstitutename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldinstitutenameActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel29.setText("प्रशिक्षण का नाम :");

        jLabel31.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel31.setText("परिणाम :");

        CBresult.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        CBresult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mÙkh.kZ", "vuqÙkh.kZ" }));
        CBresult.setToolTipText("परिणाम का चयन करें");

        jLabel30.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel30.setText("दिनांक से :");

        DCfrom.setDateFormatString("dd MM, yyyy");

        jLabel32.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel32.setText("दिनांक तक :");

        jLabel33.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel33.setText("ग्रेड :");

        txtfieldgrade.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtfieldgrade.setToolTipText("ग्रेड दर्ज करें");

        trainingadded.setBackground(new java.awt.Color(0, 204, 51));
        trainingadded.setFont(new java.awt.Font("Kokila", 1, 36)); // NOI18N
        trainingadded.setForeground(new java.awt.Color(255, 255, 255));
        trainingadded.setText("जोड़ें");
        trainingadded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainingaddedActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(254, 0, 0));
        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Go Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        CBtrainingname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CBtrainingname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Detective Instructor Course", "Physical Training Instructor Course", "Weapons & Tactics Course", "Quater Master Head Constable/ Constable Course", "Quater Master (NGOs) Course", "Map Reading Course", "FC & Tactics Course", "Bomb Detection & Disposal Squad Course", "Anti-Sabotage Checks Course", "VIP Security Course", "Ring-Round Course", "PSO Gunman Course", "U.A.C (Unarmed Combat) Course", "Cammando Course", "Urban Tactics Course", "Departmental Enquiry Course", "D & M Course", "Computer Awarness Course" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(trainingadded, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel30))
                .addGap(93, 93, 93)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtfieldinstitutename, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel29)
                        .addGap(30, 30, 30)
                        .addComponent(CBtrainingname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(DCfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel32)
                        .addGap(30, 30, 30)
                        .addComponent(DCto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel33)
                        .addGap(0, 0, 0)
                        .addComponent(txtfieldgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel31)
                        .addGap(36, 36, 36)
                        .addComponent(CBresult, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 199, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBtrainingname)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtfieldinstitutename, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DCfrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DCto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfieldgrade)
                        .addComponent(jLabel31)
                        .addComponent(CBresult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(trainingadded)
                .addGap(21, 21, 21))
        );

        trainingtbl.setBackground(new java.awt.Color(244, 244, 244));
        trainingtbl.setFont(new java.awt.Font("Kruti Dev 010", 0, 15)); // NOI18N
        trainingtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "संस्थान का नाम", "प्रशिक्षण का नाम", "परिणाम", "दिनांक से", "दिनांक तक", "ग्रेड"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(trainingtbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfieldinstitutenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldinstitutenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldinstitutenameActionPerformed

    private void trainingaddedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainingaddedActionPerformed
        if(txtfieldinstitutename.getText().equals("")||CBtrainingname.getSelectedItem().equals("")||CBresult.getSelectedItem().equals("")||DCfrom.getDate().equals("")||DCto.getDate().equals("")||txtfieldgrade.getText().equals("")){
            JOptionPane.showMessageDialog(this,"कृपया सभी विवरण दर्ज करें");
        }else{

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");

            String result;
            result = CBresult.getSelectedItem().toString();

            String tname;
            tname =CBtrainingname.getSelectedItem().toString();
            
            String fromdate = sdf.format(DCfrom.getDate());
            String todate = sdf.format(DCto.getDate());

            DefaultTableModel tblModel = (DefaultTableModel) trainingtbl.getModel();

            tblModel.insertRow(tblModel.getRowCount(),new Object[]{txtfieldinstitutename.getText(),tname,result,DCfrom.getDate(),DCto.getDate(),txtfieldgrade.getText()});

            
            JOptionPane.showMessageDialog(this,"सफलतापूर्वक जोड़ा गया");
            txtfieldinstitutename.setText("");
            CBtrainingname.setSelectedItem("");
            CBresult.setSelectedItem("");
            
            txtfieldgrade.setText("");
        }
    }//GEN-LAST:event_trainingaddedActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        
        close();
        InsertFrame IF = new InsertFrame();
        IF.setVisible(true); 
    }//GEN-LAST:event_backbtnActionPerformed
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
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
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Training().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBresult;
    private javax.swing.JComboBox<String> CBtrainingname;
    private com.toedter.calendar.JDateChooser DCfrom;
    private com.toedter.calendar.JDateChooser DCto;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton trainingadded;
    private javax.swing.JTable trainingtbl;
    private javax.swing.JTextField txtfieldgrade;
    private javax.swing.JTextField txtfieldinstitutename;
    // End of variables declaration//GEN-END:variables
}
