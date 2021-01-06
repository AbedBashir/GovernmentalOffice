
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TableView;
import java.util.Random;
import javax.swing.Timer;

public class MainInterface extends javax.swing.JFrame {
 
    //this code is for the table.                                                           
ArrayList<citizen> list;
ArrayList<application> list2;
ArrayList<completedApp> list3;
String header[] = new String[]{"First Name", "Last Name", "Phone Number" , "Email"};
String header2[] = new String[]{"First Name", "Last Name", "Phone Number" , "Email","Issue","Time","Status"};
String header3[] = new String[]{"First Name", "Last Name", "Phone Number" , "Email","Issue"};
DefaultTableModel dtm,dtm2,dtm3;
int row,col;

    public MainInterface() {
        initComponents();
        list = new ArrayList<>();
        dtm = new DefaultTableModel(header,0);
        jTable2.setModel(dtm);   
        jTableSearch.setModel(dtm);
        
        list2 = new ArrayList<>();
        dtm2 = new DefaultTableModel(header2,0);
        jTableOnGoingApp.setModel(dtm2);
        
        list3 = new ArrayList<>();
        dtm3 = new DefaultTableModel(header3,0);
        jTableCompletedApp.setModel(dtm3);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jModify = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableSearch = new javax.swing.JTable();
        jSearchFN = new javax.swing.JTextField();
        jSearchLN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jFName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jEmailSamples = new javax.swing.JComboBox<>();
        jEmail = new javax.swing.JTextField();
        jLName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFName1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcNumber1 = new javax.swing.JTextField();
        jEmailSamples1 = new javax.swing.JComboBox<>();
        jEmail1 = new javax.swing.JTextField();
        jLName1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jGetNumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jGetFN = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jGetLN = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jGetEmail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jGetIssue = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableOnGoingApp = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableCompletedApp = new javax.swing.JTable();
        jExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Governmental Office");
        setResizable(false);

        jModify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jModifyMouseClicked(evt);
            }
        });

        jButton4.setText("Search");
        jButton4.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jButton4HierarchyChanged(evt);
            }
        });
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Phone Number", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSearchMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableSearch);

        jSearchFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchFNActionPerformed(evt);
            }
        });

        jSearchLN.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel6.setText("First Name");

        jLabel7.setText("Last Name");

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSearchFN)
                            .addComponent(jSearchLN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSearchFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSearchLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jModify.addTab("Search Citizen", jPanel3);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("First Name");

        jFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Number");

        jcNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNumberActionPerformed(evt);
            }
        });

        jLabel4.setText("Email");

        jEmailSamples.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@hotmail.com", "@outlook.com", "@msn.com", "@yahoo.com" }));
        jEmailSamples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailSamplesActionPerformed(evt);
            }
        });

        jEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailActionPerformed(evt);
            }
        });

        jLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLNameActionPerformed(evt);
            }
        });

        jLabel5.setText("Last Name");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcNumber)
                            .addComponent(jFName)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jEmailSamples, 0, 591, Short.MAX_VALUE))
                            .addComponent(jLName))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmailSamples, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jModify.addTab("New Cisitzen", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Issue", "Phone Number", "Email"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jModify.addTab("Waiting List", jScrollPane4);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please Make Sure To Check The Citizen Name From The Search Tab Before Using These Labels To Modify It's Data");

        jLabel8.setText("First Name");

        jFName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFName1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Number");

        jLabel10.setText("Email");

        jcNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNumber1ActionPerformed(evt);
            }
        });

        jEmailSamples1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@hotmail.com", "@outlook.com", "@msn.com", "@yahoo.com" }));
        jEmailSamples1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailSamples1ActionPerformed(evt);
            }
        });

        jEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmail1ActionPerformed(evt);
            }
        });

        jLName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLName1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Last Name");

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcNumber1)
                            .addComponent(jFName1)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jEmailSamples1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLName1))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jFName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jEmailSamples1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(123, 123, 123))
        );

        jModify.addTab("Modify Data", jPanel5);

        jLabel12.setText("Phone Number");

        jGetNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGetNumberActionPerformed(evt);
            }
        });

        jLabel13.setText("First Name");

        jLabel14.setText("Last Name");

        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel15.setText("Email");

        jLabel17.setText("Issue");

        jGetIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGetIssueActionPerformed(evt);
            }
        });

        jButton6.setText("Go");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jGetIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jGetNumber)
                    .addComponent(jGetFN, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jGetLN, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jGetEmail)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jGetNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jGetLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jGetFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jGetEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jGetIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jModify.addTab("Application", jPanel2);

        jTableOnGoingApp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Number", "Email", "Issue", "Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableOnGoingApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOnGoingAppMouseClicked(evt);
            }
        });
        jTableOnGoingApp.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTableOnGoingAppComponentShown(evt);
            }
        });
        jScrollPane6.setViewportView(jTableOnGoingApp);
        if (jTableOnGoingApp.getColumnModel().getColumnCount() > 0) {
            jTableOnGoingApp.getColumnModel().getColumn(5).setHeaderValue("Time");
            jTableOnGoingApp.getColumnModel().getColumn(6).setHeaderValue("Status");
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jModify.addTab("OnGoing Applications", jPanel7);

        jTableCompletedApp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Number", "Email", "Issue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCompletedApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCompletedAppMouseClicked(evt);
            }
        });
        jTableCompletedApp.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTableCompletedAppComponentShown(evt);
            }
        });
        jScrollPane7.setViewportView(jTableCompletedApp);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jModify.addTab("Completed App", jPanel6);

        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jModify)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jExit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jModify, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cFName = jFName.getText();
        String cLName = jLName.getText();
        String cNumber = jcNumber.getText();
        String cEmail = jEmail.getText()+jEmailSamples.getSelectedItem().toString();
       
        list.add(new citizen(cFName,cLName,cNumber,cEmail));
        dtm.setRowCount(0);//reset data model
        for (int i = 0; i < list.size(); i++) {
            Object[] objs = {list.get(i).cFName,list.get(i).cLName,list.get(i).cNumber,list.get(i).cEmail};
            dtm.addRow(objs);
        }
        clearField();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearField(){
        jFName.requestFocus();
        jFName.setText("");
        jcNumber.setText("");
        jEmailSamples.setSelectedIndex(0);
    }
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        row = jTable2.getSelectedRow();
        col = jTable2.getColumnCount();
        System.out.println(row+","+col);
        jFName.setText(dtm.getValueAt(row, 0).toString());
        jcNumber.setText(dtm.getValueAt(row, 1).toString());
        
        String location = dtm.getValueAt(row, 2).toString();
        for (int i = 0; i<(jEmailSamples.getItemCount());i++){
            if (jEmailSamples.getItemAt(i).equalsIgnoreCase(location)){
                jEmailSamples.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if(dialogResult == 0) {
            dtm.removeRow(row);
            list.remove(row);
            dtm.setRowCount(0);//reset table and populate again with foodlist
            for (int i = 0; i < list.size(); i++) {
                 Object[] objs = {list.get(i).cFName,list.get(i).cLName,list.get(i).cNumber,list.get(i).cEmail};
                dtm.addRow(objs);
            }
            clearField();
        }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String updatedFirstName = jFName1.getText();
        String updatedLastName = jLName1.getText();
        String updatedNumgber = jcNumber1.getText();
        String updatedEmail = jEmail1.getText()+jEmailSamples1.getSelectedItem().toString();
        list.get(row).cFName = updatedFirstName;
        list.get(row).cLName= updatedLastName;
        list.get(row).cNumber = updatedNumgber;
        list.get(row).cEmail = updatedEmail;
        dtm.setRowCount(0);//reset table and repopulated
        for (int i = 0; i < list.size(); i++) {
             Object[] objs = {list.get(i).cFName,list.get(i).cLName,list.get(i).cNumber,list.get(i).cEmail};
            dtm.addRow(objs);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLNameActionPerformed

    private void jEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmailActionPerformed

    private void jEmailSamplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmailSamplesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmailSamplesActionPerformed

    private void jcNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcNumberActionPerformed

    private void jFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFNameActionPerformed

    private void jModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jModifyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jModifyMouseClicked

    private void jTableSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSearchMouseClicked
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jTableSearchMouseClicked

    private void jSearchFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchFNActionPerformed

    private void jFName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFName1ActionPerformed

    private void jcNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcNumber1ActionPerformed
    }//GEN-LAST:event_jcNumber1ActionPerformed

    private void jEmailSamples1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmailSamples1ActionPerformed
    }//GEN-LAST:event_jEmailSamples1ActionPerformed

    private void jEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmail1ActionPerformed

    private void jLName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLName1ActionPerformed
    }//GEN-LAST:event_jLName1ActionPerformed

    private void jButton4HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jButton4HierarchyChanged
    }//GEN-LAST:event_jButton4HierarchyChanged

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        String SearchFN = jSearchFN.getText();
        String SearchLN = jSearchLN.getText();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).cFName.equalsIgnoreCase(SearchFN) && list.get(i).cLName.equalsIgnoreCase(SearchLN) ){
                JOptionPane.showMessageDialog(jButton4, "Found!","Search",2);
                
                 return;
            }
        }
        JOptionPane.showMessageDialog(jButton4, "Not Found!","Search",2);
        for (int i = 0; i < list.size(); i++) {
           //  Object[] objs = {list.get(i).cFName,list.get(i).cLName,list.get(i).cNumber,list.get(i).cEmail};
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String cFN = jGetFN.getText();
        String cLN = jGetLN.getText();
        String cNumb = jGetNumber.getText();
        String cEmailAdd = jGetEmail.getText();
        String cIssue= jGetIssue.getText();
        Random r = new Random();
        Integer cTime1 = r.nextInt(3);
        String cTime = cTime1 + " min(s)";
        String cStatus = "Pending";
        if(cTime1 == 0) {
            cStatus = "Done";
            list3.add(new completedApp(cFN,cLN,cNumb,cEmailAdd,cIssue));
            dtm3.setRowCount(0);//reset data model
            for (int i = 0; i < list3.size(); i++) {
                Object[] objs = {list3.get(i).cFName,list3.get(i).cLName,list3.get(i).cEmail,list3.get(i).cNumber,list3.get(i).cIssue};
                dtm3.addRow(objs); 
            }
        }
        list2.add(new application(cFN,cLN,cNumb,cEmailAdd,cIssue,cTime,cStatus));
        dtm2.setRowCount(0);//reset data model
        for (int i = 0; i < list2.size(); i++) {
            Object[] objs = {list2.get(i).cFName,list2.get(i).cLName,list2.get(i).cEmail,list2.get(i).cNumber,list2.get(i).cIssue,list2.get(i).cTime,list2.get(i).cStatus};
            dtm2.addRow(objs);
        }
        clearField();
    }//GEN-LAST:event_jButton5ActionPerformed
private void jTableOngoingAppMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        row = jTableOnGoingApp.getSelectedRow();
        col = jTableOnGoingApp.getColumnCount();
        System.out.println(row+","+col);
        jGetFN.setText(dtm.getValueAt(row, 0).toString());
        jGetNumber.setText(dtm.getValueAt(row, 1).toString());
        String location = dtm.getValueAt(row, 2).toString();
        for (int i = 0; i<(jEmailSamples.getItemCount());i++){
            if (jEmailSamples.getItemAt(i).equalsIgnoreCase(location)){
                jEmailSamples.setSelectedIndex(i);
            }
        }
    }   
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        String GetFN = jGetFN.getText();
        String GetLN = jGetLN.getText();
        String GetEmail = jGetEmail.getText();
        String GetNumber = jcNumber.getText();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).cNumber.equalsIgnoreCase(jGetNumber.getText())){
             //   JOptionPane.showMessageDialog(jButton6, "Found!!!","Search",2);
                jGetFN.setText(list.get(i).cFName);
                jGetLN.setText(list.get(i).cLName);
                jGetEmail.setText(list.get(i).cEmail);
                 return;//Quit after found
            }
        }
        JOptionPane.showMessageDialog(jButton4, "Not Found!","Search",2);
        for (int i = 0; i < list.size(); i++) {
             Object[] objs = {list.get(i).cFName,list.get(i).cNumber,list.get(i).cEmail};
            dtm.addRow(objs);
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jTableOnGoingAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOnGoingAppMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableOnGoingAppMouseClicked

    private void jGetNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGetNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGetNumberActionPerformed

    private void jGetIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGetIssueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGetIssueActionPerformed

    private void jTableOnGoingAppComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableOnGoingAppComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableOnGoingAppComponentShown

    private void jTableCompletedAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCompletedAppMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCompletedAppMouseClicked

    private void jTableCompletedAppComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableCompletedAppComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCompletedAppComponentShown

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
       if (JOptionPane.showConfirmDialog(jExit,"confirm if you Want to Exit","Governmental Office",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jExitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JTextField jEmail;
    private javax.swing.JTextField jEmail1;
    private javax.swing.JComboBox<String> jEmailSamples;
    private javax.swing.JComboBox<String> jEmailSamples1;
    private javax.swing.JButton jExit;
    private javax.swing.JTextField jFName;
    private javax.swing.JTextField jFName1;
    private javax.swing.JTextField jGetEmail;
    private javax.swing.JTextField jGetFN;
    private javax.swing.JTextField jGetIssue;
    private javax.swing.JTextField jGetLN;
    private javax.swing.JTextField jGetNumber;
    private javax.swing.JTextField jLName;
    private javax.swing.JTextField jLName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jModify;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jSearchFN;
    private javax.swing.JTextField jSearchLN;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableCompletedApp;
    private javax.swing.JTable jTableOnGoingApp;
    private javax.swing.JTable jTableSearch;
    private javax.swing.JTextField jcNumber;
    private javax.swing.JTextField jcNumber1;
    // End of variables declaration//GEN-END:variables
}