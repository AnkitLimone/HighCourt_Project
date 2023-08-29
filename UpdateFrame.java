
package mypackage;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Date;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ankit Limone
 * @author Mahak Gupta
 */
public class UpdateFrame extends javax.swing.JFrame {
    
    
    private static final String username= "root";
    private static final String password= "Ankit@1516";
    private static final String dataConn= "jdbc:mysql://localhost:3306/posting_register";
    
    
    
    
    
    Connection sqlConn = null;
    PreparedStatement pst  =null;
    PreparedStatement pst1  =null;
    PreparedStatement pst2  =null;
    ResultSet rs = null;
    int q , i, id, deleteItem;
    private Object stmt;
            
                /**
     * Creates new form UpdateFrame
     */
    public UpdateFrame() {
        initComponents();
       jScrollPane5.getVerticalScrollBar().setUnitIncrement(16);
    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtfieldUC = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtfieldpost = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfieldbadgeno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfieldname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtfieldfname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CBcategory = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtfieldaadhar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtfieldpan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtfieldgpfdpf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtfieldbankacc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtfieldifsc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtfieldhd = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareapadd = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtarealadd = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        CBblood = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        txtfieldpran = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        ubtn = new javax.swing.JButton();
        sbtn = new javax.swing.JButton();
        dbtn = new javax.swing.JButton();
        ebtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        ibtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        CBbasict = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txtfieldiffail = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtfieldinstitutename = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtfieldtrainingno = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        CBresult = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtfieldgrade = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        CBedu = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        txtfieldcourse = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtfieldspname = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        CBgender = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        txtfieldmobno = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtfieldstatus = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtfieldspaadhar = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtfieldfaadhar = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtfieldmname = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtfieldmaadhar = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        CBchild = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        txtfieldcstatus = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtfieldsbankacc = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtfieldsifsc = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtareasadd = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        subbtn = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        txtfieldUC1 = new javax.swing.JTextField();
        searchbtn1 = new javax.swing.JButton();
        updatebtn1 = new javax.swing.JButton();
        exitbtn1 = new javax.swing.JButton();
        backbtn1 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtfieldbadgeno1 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtfieldname1 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtfieldfname1 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        CBcategory1 = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        txtfieldaadhar1 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtfieldpan1 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtfieldgpfdpf1 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txtfieldbankacc1 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txtfieldifsc1 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        txtfieldhd1 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtareapadd1 = new javax.swing.JTextArea();
        jLabel67 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtarealadd1 = new javax.swing.JTextArea();
        jLabel68 = new javax.swing.JLabel();
        CBblood1 = new javax.swing.JComboBox<>();
        jLabel69 = new javax.swing.JLabel();
        txtfieldpran1 = new javax.swing.JTextField();
        CBpost1 = new javax.swing.JComboBox<>();
        DCbirth1 = new com.toedter.calendar.JDateChooser();
        jPanel24 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        CBbasict1 = new javax.swing.JComboBox<>();
        jLabel71 = new javax.swing.JLabel();
        txtfieldiffail1 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txtfieldcourse1 = new javax.swing.JTextField();
        DCrecruit1 = new com.toedter.calendar.JDateChooser();
        previousunit = new javax.swing.JTextField();
        txtfieldedu1 = new javax.swing.JTextField();
        DCfirstjoiningunit1 = new javax.swing.JTextField();
        DCpromotion1 = new javax.swing.JTextField();
        DChighcourtdeploy1 = new javax.swing.JTextField();
        DCbasictpass1 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        txtfieldspname1 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        CBgender1 = new javax.swing.JComboBox<>();
        jLabel88 = new javax.swing.JLabel();
        txtfieldmobno1 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        txtfieldstatus1 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        txtfieldspaadhar1 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        txtfieldfaadhar1 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        txtfieldmname1 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        txtfieldmaadhar1 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        CBchild1 = new javax.swing.JComboBox<>();
        jLabel95 = new javax.swing.JLabel();
        txtfieldcstatus1 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        txtfieldsbankacc1 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        txtfieldsifsc1 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtareasadd1 = new javax.swing.JTextArea();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(254, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("POSTING REGISTER HIGH COURT SECURITY, INDORE (MADHYA PRADESH)");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/police.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 129));

        jLabel3.setFont(new java.awt.Font("Kokila", 1, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("प्रथम   वाहिनी   विशेष   सशस्त्र   बल,  इन्दौर");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(610, 610, 610))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Kokila", 0, 36)); // NOI18N
        jLabel6.setText("यूनिक कोड :");

        txtfieldUC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfieldUC.setToolTipText("यूनिक कोड दर्ज करें");
        txtfieldUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldUCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel6)
                .addGap(112, 112, 112)
                .addComponent(txtfieldUC, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtfieldUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "व्यक्तिगत विवरण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Kokila", 0, 36)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel4.setText("पोस्ट :");

        txtfieldpost.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldpost.setToolTipText("पोस्ट दर्ज करें");

        jLabel5.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel5.setText("बैज क्र. :");

        txtfieldbadgeno.setFont(new java.awt.Font("Kokila", 0, 30)); // NOI18N
        txtfieldbadgeno.setToolTipText("बैज क्रमांक दर्ज करें");

        jLabel7.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel7.setText("नाम :");

        txtfieldname.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldname.setToolTipText("नाम दर्ज करें");

        jLabel8.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel8.setText("पिता का नाम :");

        txtfieldfname.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldfname.setToolTipText("पिता का नाम दर्ज करें");

        jLabel9.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel9.setText("वर्ग :");

        CBcategory.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        CBcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "सामान्य", "अन्य पिछड़ा वर्ग", "अजा", "अ०ज०जा" }));
        CBcategory.setToolTipText("वर्ग का चयन करें");

        jLabel10.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel10.setText("आधार क्र. :");

        txtfieldaadhar.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldaadhar.setToolTipText("आधार क्रमांक दर्ज करें");
        txtfieldaadhar.setName(""); // NOI18N

        jLabel11.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel11.setText("पैन क्र. :");

        txtfieldpan.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldpan.setToolTipText("पेन क्रमांक दर्ज करें");

        jLabel12.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel12.setText("GPF/DPF NO.");

        txtfieldgpfdpf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfieldgpfdpf.setToolTipText("जीपीएफ या डीपीएफ नंबर दर्ज करें");

        jLabel13.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel13.setText("बैंक खाता क्र.");

        txtfieldbankacc.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldbankacc.setToolTipText("बैंक खाता क्रमांक दर्ज करें");

        jLabel14.setFont(new java.awt.Font("Kokila", 0, 30)); // NOI18N
        jLabel14.setText("IFSC  कोड:");

        txtfieldifsc.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldifsc.setToolTipText("IFSC कोड दर्ज करें");

        jLabel15.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel15.setText("गृह ज़िला :");

        txtfieldhd.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldhd.setToolTipText("ग्रह जिला दर्ज करें");

        jLabel16.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel16.setText("जन्म दिनांक :");

        jLabel17.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel17.setText("स्थायी पता :");

        txtareapadd.setColumns(20);
        txtareapadd.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtareapadd.setRows(5);
        txtareapadd.setToolTipText("स्थाई पता दर्ज करें");
        jScrollPane2.setViewportView(txtareapadd);

        jLabel18.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel18.setText("वर्तमान पता :");

        txtarealadd.setColumns(20);
        txtarealadd.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtarealadd.setRows(5);
        txtarealadd.setToolTipText("वर्तमान पता दर्ज करें");
        jScrollPane3.setViewportView(txtarealadd);

        jLabel19.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel19.setText("ब्लड ग्रुप :");

        CBblood.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        CBblood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        CBblood.setToolTipText("ब्लड ग्रुप दर्ज करें");

        jLabel49.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel49.setText("पी. आर. एन. क्रमांक :");

        txtfieldpran.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldpran.setToolTipText("पीआरऐन नंबर दर्ज करें");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17))
                .addGap(90, 90, 90)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfieldfname)
                    .addComponent(txtfieldpost)
                    .addComponent(txtfieldpan)
                    .addComponent(txtfieldifsc, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18))
                .addGap(91, 91, 91)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfieldbadgeno)
                    .addComponent(CBcategory, 0, 295, Short.MAX_VALUE)
                    .addComponent(txtfieldgpfdpf)
                    .addComponent(txtfieldhd)
                    .addComponent(jScrollPane3))
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfieldname, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(txtfieldaadhar)
                    .addComponent(txtfieldbankacc)
                    .addComponent(CBblood, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfieldpran, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(CBcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtfieldbadgeno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(txtfieldaadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtfieldname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(txtfieldpost, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(31, 31, 31)))
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtfieldfname)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel8)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(70, 70, 70))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtfieldpan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(txtfieldbankacc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfieldgpfdpf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtfieldifsc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtfieldhd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(CBblood, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfieldpran)))
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        ubtn.setBackground(new java.awt.Color(254, 0, 0));
        ubtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ubtn.setForeground(new java.awt.Color(255, 255, 255));
        ubtn.setText("UPDATE");
        ubtn.setBorder(null);
        ubtn.setBorderPainted(false);
        ubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubtnActionPerformed(evt);
            }
        });

        sbtn.setBackground(new java.awt.Color(254, 0, 0));
        sbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sbtn.setForeground(new java.awt.Color(255, 255, 255));
        sbtn.setText("SEARCH");
        sbtn.setBorder(null);
        sbtn.setBorderPainted(false);
        sbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbtnActionPerformed(evt);
            }
        });

        dbtn.setBackground(new java.awt.Color(254, 0, 0));
        dbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dbtn.setForeground(new java.awt.Color(255, 255, 255));
        dbtn.setText("DELETE");
        dbtn.setBorder(null);
        dbtn.setBorderPainted(false);
        dbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbtnActionPerformed(evt);
            }
        });

        ebtn.setBackground(new java.awt.Color(254, 0, 0));
        ebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ebtn.setForeground(new java.awt.Color(255, 255, 255));
        ebtn.setText("EXIT");
        ebtn.setBorder(null);
        ebtn.setBorderPainted(false);
        ebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebtnActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(254, 0, 0));
        resetbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        ibtn.setBackground(new java.awt.Color(254, 0, 0));
        ibtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ibtn.setForeground(new java.awt.Color(255, 255, 255));
        ibtn.setText("INSERT");
        ibtn.setBorder(null);
        ibtn.setBorderPainted(false);
        ibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        jButton2.setText("krdo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(ubtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(resetbtn)
                .addGap(40, 40, 40)
                .addComponent(sbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(dbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ibtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(ubtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "प्रशिक्षण विवरण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel20.setText("बुनियादी प्रशिक्षण :");

        CBbasict.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        CBbasict.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "उत्तीर्ण", "अनुत्तीर्ण" }));
        CBbasict.setToolTipText("बुनियादी प्रशिक्षण का चयन करें");

        jLabel21.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel21.setText("यदि अनुत्तीर्ण हैं तो :");

        txtfieldiffail.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldiffail.setToolTipText("यदि अनुतीर्ण हैं तो विषय दर्ज करें");

        jLabel22.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel22.setText("भर्ती की तिथि :");

        jLabel23.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel23.setText("प्रथम नियुक्ति इकाई :");

        jLabel24.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel24.setText("पुर्व इकाई :");

        jLabel25.setFont(new java.awt.Font("Kokila", 0, 30)); // NOI18N
        jLabel25.setText("वर्तमान पदोन्नति दिनांक :");

        jLabel26.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel26.setText("मान.उ. न्याया. इंदौर में तैनाती दिनांक :");

        jLabel27.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel27.setText("बुनियादी प्रक्षिक्षण उत्तीर्ण दिनांक :");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "विभागीय प्रक्षिशण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel28.setText("संस्थान का नाम :");

        txtfieldinstitutename.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldinstitutename.setToolTipText("संस्थान का नाम दर्ज करें");

        jLabel29.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel29.setText("प्रशिक्षण संख्या :");

        txtfieldtrainingno.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldtrainingno.setToolTipText("प्रशिक्षण संख्या दर्ज करें");

        jLabel30.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel30.setText("दिनांक से :");

        jLabel31.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel31.setText("परिणाम :");

        CBresult.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        CBresult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "उत्तीर्ण", "अनुत्तीर्ण" }));
        CBresult.setToolTipText("परिणाम का चयन करें");

        jLabel32.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel32.setText("दिनांक तक :");

        jLabel33.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel33.setText("ग्रेड :");

        txtfieldgrade.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldgrade.setToolTipText("ग्रेड दर्ज करें");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel30))
                .addGap(93, 93, 93)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtfieldinstitutename, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel29)
                        .addGap(91, 91, 91)
                        .addComponent(txtfieldtrainingno, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel31)
                        .addGap(54, 54, 54)
                        .addComponent(CBresult, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(txtfieldgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBresult, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtfieldinstitutename)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfieldtrainingno)
                        .addComponent(jLabel31)))
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfieldgrade))
                .addGap(29, 29, 29))
        );

        jLabel36.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel36.setText("शिक्षा:");

        CBedu.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        CBedu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Intermediate", "Metric", "Graduation", "Post Graduation" }));
        CBedu.setToolTipText("शिक्षा का चयन करें");

        jLabel37.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel37.setText("कोर्स :");

        txtfieldcourse.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldcourse.setToolTipText("कोर्स दर्ज करें");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36)
                                .addGap(52, 52, 52)
                                .addComponent(CBedu, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfieldcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBbasict, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel24))
                                .addGap(64, 64, 64)
                                .addComponent(txtfieldiffail)
                                .addGap(46, 46, 46)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel25))))
                        .addGap(100, 100, 100))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CBbasict)
                        .addComponent(jLabel21))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtfieldiffail)
                        .addComponent(jLabel22)))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel25))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(CBedu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)
                        .addComponent(txtfieldcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "उत्तराधिकारी विवरण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N

        jLabel35.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel35.setText("जीवनसाथी का नाम :");

        txtfieldspname.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldspname.setToolTipText("जीवन साथी का नाम दर्ज करें");

        jLabel38.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel38.setText("लिंग :");

        CBgender.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        CBgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "पुरूष", "महिला", "अन्य" }));
        CBgender.setToolTipText("लिंग का चयन करें");

        jLabel39.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel39.setText("मोबाइल नं :");

        txtfieldmobno.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldmobno.setToolTipText("मोबाइल नम्बर दर्ज करें");

        jLabel40.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel40.setText("व्यवसाय :");

        txtfieldstatus.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldstatus.setToolTipText("जीवन साथी का व्यवसाय दर्ज करें");

        jLabel41.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel41.setText("जीवनसाथी का आधार क्रमांक:");

        txtfieldspaadhar.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldspaadhar.setToolTipText("जीवन साथी का आधार क्रमांक दर्ज करें");

        jLabel42.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel42.setText("पिता का आधार क्रमांक :");

        txtfieldfaadhar.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldfaadhar.setToolTipText("पिता का आधार क्रमांक दर्ज करें");

        jLabel43.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel43.setText("माता का नाम :");

        txtfieldmname.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldmname.setToolTipText("माता का नाम दर्ज करें");

        jLabel44.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel44.setText("माता का आधार क्रमांक :");

        txtfieldmaadhar.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldmaadhar.setToolTipText("माता का आधार  क्रमांक दर्ज करें");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel40)
                    .addComponent(jLabel43))
                .addGap(114, 114, 114)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfieldspname, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtfieldmname)
                        .addComponent(txtfieldstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(142, 142, 142)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel44))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtfieldmaadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtfieldspaadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel42)
                                .addGap(18, 18, 18)
                                .addComponent(txtfieldfaadhar))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CBgender, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel39)
                        .addGap(76, 76, 76)
                        .addComponent(txtfieldmobno, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtfieldspname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(CBgender, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(txtfieldmobno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtfieldstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(txtfieldspaadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(txtfieldfaadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtfieldmname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(txtfieldmaadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "बच्चों का विवरण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel34.setText("बच्चे :");

        CBchild.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        CBchild.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "बेटा", "बेटी" }));
        CBchild.setToolTipText("बेटा या बेटी का चयन करें");

        jLabel45.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel45.setText("व्यवसाय :");

        txtfieldcstatus.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldcstatus.setToolTipText("बच्चे का व्यवसाय दर्ज करें");

        jLabel46.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel46.setText("उत्तराधिकारी का पता :");

        jLabel47.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel47.setText("उत्तराधिकारी का खाता क्रमांक :");

        txtfieldsbankacc.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldsbankacc.setToolTipText("उत्तराधिकारी का खाता क्रमांक दर्ज करें");

        jLabel48.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel48.setText("उत्तराधिकारी का बैंक IFSC कोड :");

        txtfieldsifsc.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtfieldsifsc.setToolTipText("IFSC कोड दर्ज करें");

        txtareasadd.setColumns(20);
        txtareasadd.setFont(new java.awt.Font("Kokila", 0, 24)); // NOI18N
        txtareasadd.setRows(5);
        txtareasadd.setToolTipText("उत्तराधिकारी का पता दर्ज करें");
        jScrollPane4.setViewportView(txtareasadd);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(60, 60, 60)
                        .addComponent(CBchild, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtfieldsbankacc, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel48)
                        .addGap(49, 49, 49)
                        .addComponent(txtfieldsifsc, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel45)
                        .addGap(57, 57, 57)
                        .addComponent(txtfieldcstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel46)
                        .addGap(47, 47, 47)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(CBchild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(txtfieldcstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtfieldsifsc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfieldsbankacc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        subbtn.setBackground(new java.awt.Color(0, 0, 129));
        subbtn.setFont(new java.awt.Font("Kokila", 0, 36)); // NOI18N
        subbtn.setForeground(new java.awt.Color(255, 255, 255));
        subbtn.setText("दर्ज करें");
        subbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(0, 0, 129));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 2150, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("पद स्थापना पंजी");
        setBackground(new java.awt.Color(188, 208, 255));

        jPanel13.setBackground(new java.awt.Color(188, 208, 255));

        jPanel14.setBackground(new java.awt.Color(254, 0, 0));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/police.png"))); // NOI18N

        jLabel78.setFont(new java.awt.Font("Kokila", 1, 55)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("प्रथम   वाहिनी   विशेष   सशस्त्र   बल");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel51)
                .addGap(434, 434, 434)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel51)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel78)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(0, 0, 129));

        jLabel50.setFont(new java.awt.Font("Kokila", 1, 58)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("पदस्थापना पंजी उच्च न्यायालय सुरक्षा, इंदौर ( मध्यप्रदेश )");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(188, 208, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel53.setFont(new java.awt.Font("Kokila", 0, 36)); // NOI18N
        jLabel53.setText("यूनिक कोड :");

        txtfieldUC1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldUC1.setToolTipText("यूनिक कोड दर्ज करें");
        txtfieldUC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldUC1ActionPerformed(evt);
            }
        });

        searchbtn1.setBackground(new java.awt.Color(254, 0, 0));
        searchbtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchbtn1.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn1.setText("SEARCH");
        searchbtn1.setBorder(null);
        searchbtn1.setBorderPainted(false);
        searchbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtn1ActionPerformed(evt);
            }
        });

        updatebtn1.setBackground(new java.awt.Color(254, 0, 0));
        updatebtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updatebtn1.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn1.setText("UPDATE");
        updatebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtn1ActionPerformed(evt);
            }
        });

        exitbtn1.setBackground(new java.awt.Color(254, 0, 0));
        exitbtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exitbtn1.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn1.setText("EXIT");
        exitbtn1.setBorder(null);
        exitbtn1.setBorderPainted(false);
        exitbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtn1ActionPerformed(evt);
            }
        });

        backbtn1.setBackground(new java.awt.Color(255, 0, 0));
        backbtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backbtn1.setForeground(new java.awt.Color(255, 255, 255));
        backbtn1.setText("Go Back");
        backbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel53)
                .addGap(46, 46, 46)
                .addComponent(txtfieldUC1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(searchbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(updatebtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(exitbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(txtfieldUC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(exitbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel17.setBackground(new java.awt.Color(235, 250, 242));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "व्यक्तिगत विवरण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N
        jPanel17.setFont(new java.awt.Font("Kokila", 0, 36)); // NOI18N

        jLabel54.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel54.setText("पद :");

        jLabel55.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel55.setText("बैज क्र. :");

        txtfieldbadgeno1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldbadgeno1.setToolTipText("बैज क्रमांक दर्ज करें");

        jLabel56.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel56.setText("नाम :");

        txtfieldname1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtfieldname1.setToolTipText("नाम दर्ज करें");

        jLabel57.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel57.setText("पिता का नाम :");

        txtfieldfname1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtfieldfname1.setToolTipText("पिता का नाम दर्ज करें");

        jLabel58.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel58.setText("वर्ग :");

        CBcategory1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        CBcategory1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lkekU;", "vU; fiNM+k oxZ", "vtk", "våtåtk" }));
        CBcategory1.setToolTipText("वर्ग का चयन करें");

        jLabel59.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel59.setText("आधार क्र. :");

        txtfieldaadhar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldaadhar1.setToolTipText("आधार क्रमांक दर्ज करें");
        txtfieldaadhar1.setName(""); // NOI18N

        jLabel60.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel60.setText("पैन क्र. :");

        txtfieldpan1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldpan1.setToolTipText("पेन क्रमांक दर्ज करें");

        jLabel61.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel61.setText("GPF/DPF/NPS NO.");

        txtfieldgpfdpf1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldgpfdpf1.setToolTipText("जीपीएफ या डीपीएफ नंबर दर्ज करें");

        jLabel62.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel62.setText("बैंक खाता क्र.");

        txtfieldbankacc1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldbankacc1.setToolTipText("बैंक खाता क्रमांक दर्ज करें");

        jLabel63.setFont(new java.awt.Font("Kokila", 0, 30)); // NOI18N
        jLabel63.setText("IFSC  कोड:");

        txtfieldifsc1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldifsc1.setToolTipText("IFSC कोड दर्ज करें");

        jLabel64.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel64.setText("गृह ज़िला :");

        txtfieldhd1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtfieldhd1.setToolTipText("ग्रह जिला दर्ज करें");

        jLabel65.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel65.setText("जन्म दिनांक :");

        jLabel66.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel66.setText("स्थायी पता :");

        txtareapadd1.setColumns(20);
        txtareapadd1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtareapadd1.setRows(5);
        txtareapadd1.setToolTipText("स्थाई पता दर्ज करें");
        jScrollPane6.setViewportView(txtareapadd1);

        jLabel67.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel67.setText("वर्तमान पता :");

        txtarealadd1.setColumns(20);
        txtarealadd1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtarealadd1.setRows(5);
        txtarealadd1.setToolTipText("वर्तमान पता दर्ज करें");
        jScrollPane7.setViewportView(txtarealadd1);

        jLabel68.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel68.setText("ब्लड ग्रुप :");

        CBblood1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CBblood1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        CBblood1.setToolTipText("ब्लड ग्रुप दर्ज करें");

        jLabel69.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel69.setText("PRAN क्रमांक :");

        txtfieldpran1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldpran1.setToolTipText("पीआरऐन नंबर दर्ज करें");

        CBpost1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        CBpost1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "vfr- iqfyl vèkh{kd", "iqfyl mi vèkh{kd", "fujh{kd", "fujh{kd ¼efgyk½", "m-fu- ¼iq#\"k½", "m-fu- ¼efgyk½", "lmfu ¼iq#\"k½", "dk- lmfu- ¼iq#\"k½", "dk-e-lmfu-", "ç-vkj-", "dk-ç- vkj-", "ç-vkj- ¼efgyk½", "dk-e-ç-vkj-", "vkj{kd", "vkj{kd ¼efgyk½", "vkj{kd VªsMesu", "'kh?kzys[kd ¼LVsuks½", "mfu- ¼v½", "lmfu- ¼v½", "m-fu- ¼jsfM;ksa½", "ç-vkj-¼jsfM;ksa½", "vkj{kd ¼jsfM;ksa½", "ç-vkj- ¼vkElZ½", "vkj{kd ¼vkElZ½", "vkj{kd ¼M‚x gS.Myj½", "vkj{kd ¼pkyd½" }));

        DCbirth1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addComponent(jLabel57)
                    .addComponent(jLabel60)
                    .addComponent(jLabel63)
                    .addComponent(jLabel66))
                .addGap(66, 66, 66)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfieldfname1)
                    .addComponent(txtfieldpan1)
                    .addComponent(txtfieldifsc1)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(CBpost1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addComponent(jLabel58)
                    .addComponent(jLabel61)
                    .addComponent(jLabel64)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfieldbadgeno1)
                    .addComponent(CBcategory1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfieldhd1)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtfieldgpfdpf1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel59)
                    .addComponent(jLabel62)
                    .addComponent(jLabel65)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfieldname1)
                    .addComponent(txtfieldaadhar1)
                    .addComponent(txtfieldbankacc1)
                    .addComponent(CBblood1, 0, 295, Short.MAX_VALUE)
                    .addComponent(txtfieldpran1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DCbirth1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(CBcategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtfieldbadgeno1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(txtfieldaadhar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtfieldname1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel55)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtfieldfname1)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel57)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBpost1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel54)
                                        .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(70, 70, 70)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(txtfieldpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62)
                            .addComponent(txtfieldbankacc1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfieldgpfdpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(txtfieldifsc1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(txtfieldhd1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(DCbirth1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(CBblood1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel69))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(txtfieldpran1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel66)
                    .addComponent(jLabel67)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(0, 0, 129));

        jLabel99.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("Developed & Designed By Ankit Limone & Mahak Gupta ( students of ) International Institute of Professional Studies, Devi Ailya Vishwavidyalaya, Indore");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel99)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel99)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(235, 250, 242));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "प्रशिक्षण विवरण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N

        jLabel70.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel70.setText("बुनियादी प्रशिक्षण :");

        CBbasict1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        CBbasict1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mÙkh.kZ", "vuqÙkh.kZ" }));
        CBbasict1.setToolTipText("बुनियादी प्रशिक्षण का चयन करें");

        jLabel71.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel71.setText("यदि अनुत्तीर्ण हैं तो :");

        txtfieldiffail1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtfieldiffail1.setToolTipText("यदि अनुतीर्ण हैं तो विषय दर्ज करें");

        jLabel72.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel72.setText("भर्ती की तिथि :");

        jLabel73.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel73.setText("प्रथम नियुक्ति इकाई :");

        jLabel74.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel74.setText("पूर्व इकाई :");

        jLabel75.setFont(new java.awt.Font("Kokila", 0, 30)); // NOI18N
        jLabel75.setText("वर्तमान पदोन्नति दिनांक :");

        jLabel76.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel76.setText("मान.उ. न्याया. इंदौर में तैनाती दिनांक :");

        jLabel77.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel77.setText("बुनियादी प्रक्षिक्षण उत्तीर्ण दिनांक :");

        jLabel84.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel84.setText("शिक्षा:");

        jLabel85.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel85.setText("कोर्स :");

        txtfieldcourse1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtfieldcourse1.setToolTipText("कोर्स दर्ज करें");

        DCrecruit1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        previousunit.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N

        txtfieldedu1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N

        DCfirstjoiningunit1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        DCpromotion1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        DChighcourtdeploy1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        DCbasictpass1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addGap(18, 18, 18)
                                .addComponent(DCfirstjoiningunit1))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addGap(30, 30, 30)
                                .addComponent(CBbasict1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(jLabel74)
                                        .addGap(30, 30, 30)
                                        .addComponent(previousunit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel84)
                                        .addGap(50, 50, 50)
                                        .addComponent(txtfieldedu1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addGap(175, 175, 175)
                                        .addComponent(jLabel77)
                                        .addGap(29, 29, 29)
                                        .addComponent(DCbasictpass1)))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(jLabel75)
                                        .addGap(18, 18, 18)
                                        .addComponent(DCpromotion1))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(jLabel85)
                                        .addGap(34, 34, 34)
                                        .addComponent(txtfieldcourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel71)
                                .addGap(88, 88, 88)
                                .addComponent(txtfieldiffail1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel72)
                                .addGap(130, 130, 130)
                                .addComponent(DCrecruit1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addGap(28, 28, 28)
                        .addComponent(DChighcourtdeploy1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBbasict1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfieldiffail1)
                            .addComponent(jLabel72)))
                    .addComponent(DCrecruit1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DCfirstjoiningunit1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(previousunit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84)
                            .addComponent(txtfieldedu1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75)
                            .addComponent(DCpromotion1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(DCbasictpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel76)
                                    .addComponent(DChighcourtdeploy1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfieldcourse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85))
                        .addContainerGap(53, Short.MAX_VALUE))))
        );

        jPanel21.setBackground(new java.awt.Color(235, 250, 242));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "उत्तराधिकारी विवरण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N

        jLabel86.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel86.setText("जीवनसाथी का नाम :");

        txtfieldspname1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtfieldspname1.setToolTipText("जीवन साथी का नाम दर्ज करें");

        jLabel87.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel87.setText("लिंग :");

        CBgender1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        CBgender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "iq:\"k", "efgyk", "vU;" }));
        CBgender1.setToolTipText("लिंग का चयन करें");

        jLabel88.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel88.setText("मोबाइल नं :");

        txtfieldmobno1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldmobno1.setToolTipText("मोबाइल नम्बर दर्ज करें");

        jLabel89.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel89.setText("व्यवसाय :");

        txtfieldstatus1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtfieldstatus1.setToolTipText("जीवन साथी का व्यवसाय दर्ज करें");

        jLabel90.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel90.setText("जीवनसाथी का आधार क्रमांक:");

        txtfieldspaadhar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldspaadhar1.setToolTipText("जीवन साथी का आधार क्रमांक दर्ज करें");

        jLabel91.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel91.setText("पिता का आधार क्रमांक :");

        txtfieldfaadhar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldfaadhar1.setToolTipText("पिता का आधार क्रमांक दर्ज करें");

        jLabel92.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel92.setText("माता का नाम :");

        txtfieldmname1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtfieldmname1.setToolTipText("माता का नाम दर्ज करें");

        jLabel93.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel93.setText("माता का आधार क्रमांक :");

        txtfieldmaadhar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldmaadhar1.setToolTipText("माता का आधार  क्रमांक दर्ज करें");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86)
                    .addComponent(jLabel89)
                    .addComponent(jLabel92))
                .addGap(114, 114, 114)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfieldspname1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtfieldmname1)
                        .addComponent(txtfieldstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(142, 142, 142)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel90)
                            .addComponent(jLabel93))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfieldspaadhar1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(txtfieldmaadhar1))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel91)
                        .addGap(18, 18, 18)
                        .addComponent(txtfieldfaadhar1))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel87)
                        .addGap(49, 49, 49)
                        .addComponent(CBgender1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel88)
                        .addGap(76, 76, 76)
                        .addComponent(txtfieldmobno1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(txtfieldspname1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88)
                    .addComponent(txtfieldmobno1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBgender1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(txtfieldstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90)
                    .addComponent(txtfieldspaadhar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91)
                    .addComponent(txtfieldfaadhar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(txtfieldmname1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93)
                    .addComponent(txtfieldmaadhar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(235, 250, 242));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "बच्चों का विवरण", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokila", 0, 36))); // NOI18N

        jLabel94.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel94.setText("बच्चे :");

        CBchild1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        CBchild1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "iq=", "iq=h" }));
        CBchild1.setToolTipText("बेटा या बेटी का चयन करें");

        jLabel95.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel95.setText("व्यवसाय :");

        txtfieldcstatus1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtfieldcstatus1.setToolTipText("बच्चे का व्यवसाय दर्ज करें");

        jLabel96.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel96.setText("उत्तराधिकारी का पता :");

        jLabel97.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel97.setText("उत्तराधिकारी का खाता क्रमांक :");

        txtfieldsbankacc1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldsbankacc1.setToolTipText("उत्तराधिकारी का खाता क्रमांक दर्ज करें");

        jLabel98.setFont(new java.awt.Font("Kokila", 0, 33)); // NOI18N
        jLabel98.setText("उत्तराधिकारी का बैंक IFSC कोड :");

        txtfieldsifsc1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfieldsifsc1.setToolTipText("IFSC कोड दर्ज करें");

        txtareasadd1.setColumns(20);
        txtareasadd1.setFont(new java.awt.Font("Kruti Dev 010", 0, 24)); // NOI18N
        txtareasadd1.setRows(5);
        txtareasadd1.setToolTipText("उत्तराधिकारी का पता दर्ज करें");
        jScrollPane8.setViewportView(txtareasadd1);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel97)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel94)
                        .addGap(60, 60, 60)
                        .addComponent(CBchild1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtfieldsbankacc1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel98)
                        .addGap(49, 49, 49)
                        .addComponent(txtfieldsifsc1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel95)
                        .addGap(57, 57, 57)
                        .addComponent(txtfieldcstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel96)
                        .addGap(47, 47, 47)))
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(CBchild1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel95)
                    .addComponent(txtfieldcstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel96))
                .addGap(34, 34, 34)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(txtfieldsifsc1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfieldsbankacc1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jScrollPane5.setViewportView(jPanel13);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfieldUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldUCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldUCActionPerformed

    private void ubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubtnActionPerformed
        
    }//GEN-LAST:event_ubtnActionPerformed

    private void sbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbtnActionPerformed
       
    }//GEN-LAST:event_sbtnActionPerformed

    private void dbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbtnActionPerformed
       
    }//GEN-LAST:event_dbtnActionPerformed

    private void ebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebtnActionPerformed
       
    }//GEN-LAST:event_ebtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
      
    }//GEN-LAST:event_resetbtnActionPerformed

    private void ibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibtnActionPerformed

       
    }//GEN-LAST:event_ibtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void subbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subbtnActionPerformed
        
    }//GEN-LAST:event_subbtnActionPerformed

    private void txtfieldUC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldUC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldUC1ActionPerformed

    private void searchbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtn1ActionPerformed

          try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection Conn = DriverManager.getConnection(dataConn,username,password);

    String sqll = "Select * from personal_details where यूनिक_कोड=?";
    PreparedStatement pstmt = Conn.prepareStatement(sqll);
   
   
    
    String it = txtfieldUC1.getText();
    pstmt.setString(1, it);
    ResultSet rs1 = pstmt.executeQuery();
   
    if(rs1.next())
     {
      
        CBpost1.setSelectedItem(rs1.getString("पद"));
        txtfieldbadgeno1.setText(rs1.getString("बैज_क्रमांक"));
        txtfieldname1.setText(rs1.getString("नाम"));
        txtfieldfname1.setText(rs1.getString("पिता_का_नाम"));
        CBcategory1.setSelectedItem(rs1.getString("वर्ग"));
        txtfieldaadhar1.setText(rs1.getString("आधार_क्रमांक"));
        txtfieldpan1.setText(rs1.getString("पैन_कार्ड_क्रमांक"));
        txtfieldgpfdpf1.setText(rs1.getString("GPF_DPF_NPS_no"));
        txtfieldbankacc1.setText(rs1.getString("बैंक_खाता_क्र"));
        txtfieldifsc1.setText(rs1.getString("आईएफएससी_कोड"));
        txtfieldhd1.setText(rs1.getString("ग्रह_जिला"));
        DCbirth1.setDate(rs1.getDate("जन्म_दिनांक"));
        txtareapadd1.setText(rs1.getString("स्थायी_पता"));
        txtarealadd1.setText(rs1.getString("वर्तमान_पता"));
        CBblood1.setSelectedItem(rs1.getString("ब्लड_ग्रुप"));
        txtfieldpran1.setText(rs1.getString("PRAN_क्रमांक"));
}
else{

 JOptionPane.showMessageDialog(this, "personal_details का कोई रिकॉर्ड प्राप्त नही हुआ");
     
   }

//========================================================================================================================

 
String sqlla = "Select * from training_details where यूनिक_कोड=?";
PreparedStatement pstmt1 = Conn.prepareStatement(sqlla);

String it1 = txtfieldUC1.getText();
    pstmt1.setString(1, it1);
    ResultSet rs2 = pstmt1.executeQuery();



    if(rs2.next())
  {
CBbasict1.setSelectedItem(rs2.getString("बुनियादी_प्रक्षिक्षण"));
txtfieldiffail1.setText(rs2.getString("यदि_अनुत्तीर्ण_हैं_तो"));
DCrecruit1.setDate(rs2.getDate("भर्ती_की_दिनांक"));
DCfirstjoiningunit1.setText(rs2.getString("प्रथम_नियुक्ति_इकाई"));
previousunit.setText(rs2.getString("पूर्व_इकाई"));
DCpromotion1.setText(rs2.getString("वर्तमान_पदोन्नति_दिनांक"));
DChighcourtdeploy1.setText(rs2.getString("मान_उ_न्याया_इंदौर_में_तैनाती_दिनांक"));
DCbasictpass1.setText(rs2.getString("बुनियादी_प्रक्षिक्षण_उत्तीर्ण_दिनांक"));
txtfieldedu1.setText(rs2.getString("शिक्षा"));
txtfieldcourse1.setText(rs2.getString("कोर्स"));

}

else{

	JOptionPane.showMessageDialog(this, " प्रशिक्षण विवरण का कोई रिकॉर्ड प्राप्त नही हुआ ");

}

//========================================================================================================================


String sqllb = "Select * from successors_details where यूनिक_कोड=?";
PreparedStatement pstmt2 = Conn.prepareStatement(sqllb);

String it2 = txtfieldUC1.getText();
pstmt2.setString(1, it2);
ResultSet rs3 = pstmt2.executeQuery();

if(rs3.next())
{
txtfieldspname1.setText(rs3.getString("जीवनसाथी_का_नाम"));
CBgender1.setSelectedItem(rs3.getString("लिंग"));
txtfieldmobno1.setText(rs3.getString("मोबाइल_नं"));
txtfieldstatus1.setText(rs3.getString("व्यवसाय"));
txtfieldspaadhar1.setText(rs3.getString("जीवनसाथी_का_आधार_क्रमांक"));
txtfieldfaadhar1.setText(rs3.getString("पिता_का_आधार_क्रमांक"));
txtfieldmname1.setText(rs3.getString("माता_का_नाम"));
txtfieldmaadhar1.setText(rs3.getString("माता_का_आधार_क्रमांक"));
CBchild1.setSelectedItem(rs3.getString("बच्चे"));
txtfieldcstatus1.setText(rs3.getString("बच्चो_का_व्यवसाय"));
txtareasadd1.setText(rs3.getString("उत्तराधिकारी_का_पता"));
txtfieldsbankacc1.setText(rs3.getString("उत्तराधिकारी_का_खाता_क्रमांक"));
txtfieldsifsc1.setText(rs3.getString("उत्तराधिकारी_का_बैंक_IFSC_कोड"));    
}
else{

 JOptionPane.showMessageDialog(this, "successors_details का कोई रिकॉर्ड प्राप्त नही हुआ");
     
   }
    Conn.close();

   } catch (SQLException ex) {        
Logger.getLogger(UpdateFrame.class.getName()).log(Level.SEVERE, null, ex);
} catch (ClassNotFoundException ex) {
Logger.getLogger(UpdateFrame.class.getName()).log(Level.SEVERE, null, ex);
}        




    }//GEN-LAST:event_searchbtn1ActionPerformed
    private JFrame frame;
    private void exitbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtn1ActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"पुष्टि करें कि क्या आप बाहर निकलना चाहते हैं","POSTING REGISTER",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }

    }//GEN-LAST:event_exitbtn1ActionPerformed

    private void updatebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtn1ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);


            String value =(txtfieldUC1.getText());

            String insertintopersonal = "UPDATE `personal_details` SET पद=?,बैज_क्रमांक=?,नाम=?,पिता_का_नाम=?,वर्ग=?,आधार_क्रमांक=?,पैन_कार्ड_क्रमांक=?,GPF_DPF_NPS_no=?,बैंक_खाता_क्र=?,आईएफएससी_कोड=?,ग्रह_जिला=?,जन्म_दिनांक=?,स्थायी_पता=?,वर्तमान_पता=?,ब्लड_ग्रुप=?,PRAN_क्रमांक=? where यूनिक_कोड= "+value ;
            

            pst = sqlConn.prepareStatement(insertintopersonal);

            String post;
            post = CBpost1.getSelectedItem().toString();
            pst.setString(1, post);
            pst.setString(2, txtfieldbadgeno1.getText());
            pst.setString(3, txtfieldname1.getText());
            pst.setString(4, txtfieldfname1.getText());
            String category;
            category = CBcategory1.getSelectedItem().toString();
            pst.setString(5, category);
            pst.setString(6, txtfieldaadhar1.getText());
            pst.setString(7, txtfieldpan1.getText());
            pst.setString(8, txtfieldgpfdpf1.getText());
            pst.setString(9, txtfieldbankacc1.getText());
            pst.setString(10, txtfieldifsc1.getText());
            pst.setString(11, txtfieldhd1.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String Birthdate = sdf.format(DCbirth1.getDate());
            pst.setString(12, Birthdate);
            pst.setString(13, txtareapadd1.getText());
            pst.setString(14, txtareapadd1.getText());
            String bloodgroup;
            bloodgroup = CBblood1.getSelectedItem().toString();
            pst.setString(15, bloodgroup);
            pst.setString(16, txtfieldpran1.getText());

            pst.execute();

            String insertintotraining = "UPDATE `training_details` SET बुनियादी_प्रक्षिक्षण=?,यदि_अनुत्तीर्ण_हैं_तो=?,भर्ती_की_दिनांक=?,प्रथम_नियुक्ति_इकाई=?,पूर्व_इकाई=?,वर्तमान_पदोन्नति_दिनांक=?,मान_उ_न्याया_इंदौर_में_तैनाती_दिनांक=?,बुनियादी_प्रक्षिक्षण_उत्तीर्ण_दिनांक=?,शिक्षा=?,कोर्स=? where यूनिक_कोड= "+value;
            pst = sqlConn.prepareStatement(insertintotraining);

            
            String basictraining;
            basictraining = CBbasict1.getSelectedItem().toString();
            pst.setString(1, basictraining);
            pst.setString(2, txtfieldiffail1.getText());
            String Recruitdate = sdf.format(DCrecruit1.getDate());
            pst.setString(3, Recruitdate);
            
            pst.setString(4, DCfirstjoiningunit1.getText());
            
         
            pst.setString(5, previousunit.getText());

            pst.setString(6, DCpromotion1.getText());

            pst.setString(7, DChighcourtdeploy1.getText());
            pst.setString(8, DCbasictpass1.getText());
            
            pst.setString(9, txtfieldedu1.getText());
            pst.setString(10, txtfieldcourse1.getText());
            

            pst.execute();

            String insertintosuccesor = "UPDATE `successors_details` SET जीवनसाथी_का_नाम=?,लिंग=?,मोबाइल_नं=?,व्यवसाय=?,जीवनसाथी_का_आधार_क्रमांक=?,पिता_का_आधार_क्रमांक=?,माता_का_नाम=?,माता_का_आधार_क्रमांक=?,बच्चे=?,बच्चो_का_व्यवसाय=?,उत्तराधिकारी_का_पता=?,उत्तराधिकारी_का_खाता_क्रमांक=?,उत्तराधिकारी_का_बैंक_IFSC_कोड=? where यूनिक_कोड= "+value;
            pst = sqlConn.prepareStatement(insertintosuccesor);

            
            pst.setString(1, txtfieldspname1.getText());
            String gender;
            gender = CBgender1.getSelectedItem().toString();
            pst.setString(2, gender);
            pst.setString(3, txtfieldmobno1.getText());
            pst.setString(4, txtfieldstatus1.getText());
            pst.setString(5, txtfieldspaadhar1.getText());
            pst.setString(6, txtfieldfaadhar1.getText());
            pst.setString(7, txtfieldmname1.getText());
            pst.setString(8, txtfieldmaadhar1.getText());
            String child;
            child = CBchild1.getSelectedItem().toString();
            pst.setString(9, child);
            pst.setString(10, txtfieldcstatus1.getText());
            pst.setString(11, txtareasadd1.getText());
            pst.setString(12, txtfieldsbankacc1.getText());
            pst.setString(13, txtfieldsifsc1.getText());

            pst.execute();

            JOptionPane.showMessageDialog(this, "रिकॉर्ड सफलतापूर्वक अपडेट हो चुका है");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtn1ActionPerformed

    private void backbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn1ActionPerformed
        close();
        InsertFrame IF = new InsertFrame();
        IF.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_backbtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBbasict;
    private javax.swing.JComboBox<String> CBbasict1;
    private javax.swing.JComboBox<String> CBblood;
    private javax.swing.JComboBox<String> CBblood1;
    private javax.swing.JComboBox<String> CBcategory;
    private javax.swing.JComboBox<String> CBcategory1;
    private javax.swing.JComboBox<String> CBchild;
    private javax.swing.JComboBox<String> CBchild1;
    private javax.swing.JComboBox<String> CBedu;
    private javax.swing.JComboBox<String> CBgender;
    private javax.swing.JComboBox<String> CBgender1;
    private javax.swing.JComboBox<String> CBpost1;
    private javax.swing.JComboBox<String> CBresult;
    private javax.swing.JTextField DCbasictpass1;
    private com.toedter.calendar.JDateChooser DCbirth1;
    private javax.swing.JTextField DCfirstjoiningunit1;
    private javax.swing.JTextField DChighcourtdeploy1;
    private javax.swing.JTextField DCpromotion1;
    private com.toedter.calendar.JDateChooser DCrecruit1;
    private javax.swing.JButton backbtn1;
    private javax.swing.JButton dbtn;
    private javax.swing.JButton ebtn;
    private javax.swing.JButton exitbtn1;
    private javax.swing.JButton ibtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField previousunit;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton sbtn;
    private javax.swing.JButton searchbtn1;
    private javax.swing.JButton subbtn;
    private javax.swing.JTextArea txtarealadd;
    private javax.swing.JTextArea txtarealadd1;
    private javax.swing.JTextArea txtareapadd;
    private javax.swing.JTextArea txtareapadd1;
    private javax.swing.JTextArea txtareasadd;
    private javax.swing.JTextArea txtareasadd1;
    private javax.swing.JTextField txtfieldUC;
    private javax.swing.JTextField txtfieldUC1;
    private javax.swing.JTextField txtfieldaadhar;
    private javax.swing.JTextField txtfieldaadhar1;
    private javax.swing.JTextField txtfieldbadgeno;
    private javax.swing.JTextField txtfieldbadgeno1;
    private javax.swing.JTextField txtfieldbankacc;
    private javax.swing.JTextField txtfieldbankacc1;
    private javax.swing.JTextField txtfieldcourse;
    private javax.swing.JTextField txtfieldcourse1;
    private javax.swing.JTextField txtfieldcstatus;
    private javax.swing.JTextField txtfieldcstatus1;
    private javax.swing.JTextField txtfieldedu1;
    private javax.swing.JTextField txtfieldfaadhar;
    private javax.swing.JTextField txtfieldfaadhar1;
    private javax.swing.JTextField txtfieldfname;
    private javax.swing.JTextField txtfieldfname1;
    private javax.swing.JTextField txtfieldgpfdpf;
    private javax.swing.JTextField txtfieldgpfdpf1;
    private javax.swing.JTextField txtfieldgrade;
    private javax.swing.JTextField txtfieldhd;
    private javax.swing.JTextField txtfieldhd1;
    private javax.swing.JTextField txtfieldiffail;
    private javax.swing.JTextField txtfieldiffail1;
    private javax.swing.JTextField txtfieldifsc;
    private javax.swing.JTextField txtfieldifsc1;
    private javax.swing.JTextField txtfieldinstitutename;
    private javax.swing.JTextField txtfieldmaadhar;
    private javax.swing.JTextField txtfieldmaadhar1;
    private javax.swing.JTextField txtfieldmname;
    private javax.swing.JTextField txtfieldmname1;
    private javax.swing.JTextField txtfieldmobno;
    private javax.swing.JTextField txtfieldmobno1;
    private javax.swing.JTextField txtfieldname;
    private javax.swing.JTextField txtfieldname1;
    private javax.swing.JTextField txtfieldpan;
    private javax.swing.JTextField txtfieldpan1;
    private javax.swing.JTextField txtfieldpost;
    private javax.swing.JTextField txtfieldpran;
    private javax.swing.JTextField txtfieldpran1;
    private javax.swing.JTextField txtfieldsbankacc;
    private javax.swing.JTextField txtfieldsbankacc1;
    private javax.swing.JTextField txtfieldsifsc;
    private javax.swing.JTextField txtfieldsifsc1;
    private javax.swing.JTextField txtfieldspaadhar;
    private javax.swing.JTextField txtfieldspaadhar1;
    private javax.swing.JTextField txtfieldspname;
    private javax.swing.JTextField txtfieldspname1;
    private javax.swing.JTextField txtfieldstatus;
    private javax.swing.JTextField txtfieldstatus1;
    private javax.swing.JTextField txtfieldtrainingno;
    private javax.swing.JButton ubtn;
    private javax.swing.JButton updatebtn1;
    // End of variables declaration//GEN-END:variables
}
