
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.DefaultEditorKit;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class Rice_Milling extends javax.swing.JFrame {

     Icon icon = new javax.swing.ImageIcon(getClass().getResource("/suc.png"));
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf1 = new SimpleDateFormat("hh.mm.ss.aa");

    Date d, d1;

    /**
     * Creates new form Customer_Reg
     */
    public Rice_Milling() {

        initComponents();

        setDate();
        setTime();

        setR_type();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(173, 225, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1013));

        jPanel2.setBackground(new java.awt.Color(173, 199, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("00 : 00 : 00");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Rice Mill Operation");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0000 / 00 / 00");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1199, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 99));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Quantity");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setMaximumRowCount(10);
        jComboBox1.setAutoscrolls(true);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox1MousePressed(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBox1KeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Bag size (kg)");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("R-Type");

        jButton1.setBackground(new java.awt.Color(23, 184, 46));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Total Raw (kg)");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("%");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(187, 187, 187)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel4)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel5Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.CENTER))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "R-Type", "Bag Size (kg)", "Quantity", "Total Raw (kg)", "Total Rice Mill", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1947, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1947, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        if (dtm.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please Add data to Table", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {

            for (int i = 0; i < dtm.getRowCount(); i++) {
                try {
                    ResultSet rs2 = DB.search("select * from rr_stock where rr_type = '" + dtm.getValueAt(i, 0).toString() + "' ");
                    if (rs2.next()) {

                        int qty1 = Integer.parseInt(rs2.getString("qty"));
                        int qty2 = Integer.parseInt(dtm.getValueAt(i, 2).toString());
                        int qty3 = qty1 - qty2;
                        DB.iud("UPDATE rr_stock SET `qty` = '" + String.valueOf(qty3) + "' WHERE `rr_type` = '" + dtm.getValueAt(i, 0).toString() + "' ");

                        DB.iud("insert into r_mill_operation  (`r_type`,`bag_size`,`qty`,`t_raw`,`t_r_mill`,`date`,`time`) values "
                                + "('" + dtm.getValueAt(i, 0).toString() + "',"
                                + "'" + dtm.getValueAt(i, 1).toString() + "',"
                                + "'" + dtm.getValueAt(i, 2).toString() + "',"
                                + "'" + dtm.getValueAt(i, 3).toString() + "',"
                                + "'" + dtm.getValueAt(i, 4).toString() + "',"
                                + "'" + dtm.getValueAt(i, 5).toString() + "',"
                                + "'" + dtm.getValueAt(i, 6).toString() + "')");

                        ResultSet rs3 = DB.search("select * from r_stock where r_type = '" + dtm.getValueAt(i, 0).toString() + "' ");
                        if (rs3.next()) {
                            int qty5 = Integer.parseInt(rs3.getString("r_qty"));
                            int qty6 = Integer.parseInt(dtm.getValueAt(i, 2).toString());
                            int qty4 = qty5 + qty6;
                            DB.iud("UPDATE r_stock SET `r_qty` = '" + String.valueOf(qty4) + "' WHERE `r_type` = '" + dtm.getValueAt(i, 0).toString() + "' ");
                        } else {
                            DB.iud("insert into r_stock  (`r_type`,`r_qty`) values ('" + dtm.getValueAt(i, 0).toString() + "','" + dtm.getValueAt(i, 2).toString() + "') ");

                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            JOptionPane.showMessageDialog(this, "Inventory Reduce & Rice Stock Added Succesfully", "DONE!", JOptionPane.INFORMATION_MESSAGE,icon);
            dtm.setRowCount(0);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased


    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked

    }//GEN-LAST:event_jTextField3MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        setR_type();
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1MousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

            Vector<Object> v = new Vector<>();
            v.add(jComboBox1.getSelectedItem());
            v.add(jTextField1.getText());
            v.add(jTextField2.getText());
            v.add(jTextField3.getText());

            double a = Double.parseDouble((jLabel13.getText())) / 100;
            double to = Double.parseDouble(jTextField3.getText());
            double sum = a * to;
            String sm = String.valueOf(sum);

            v.add(sm);
            v.add(jLabel3.getText());
            v.add(jLabel1.getText());
            dtm.addRow(v);

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");

            jTextField1.requestFocus();

        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jButton1.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed

    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jComboBox1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyReleased

    }//GEN-LAST:event_jComboBox1KeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        try {
            ResultSet r = DB.search("select * from rr_reg where r_name = '" + jComboBox1.getSelectedItem().toString() + "'");
            if (r.next()) {

                jLabel13.setText(r.getString("precentage"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            if (dtm.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Please Add data to Table", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    try {
                        ResultSet rs2 = DB.search("select * from rr_stock where rr_type = '" + dtm.getValueAt(i, 0).toString() + "' ");
                        if (rs2.next()) {

                            int qty1 = Integer.parseInt(rs2.getString("qty"));
                            int qty2 = Integer.parseInt(dtm.getValueAt(i, 2).toString());
                            int qty3 = qty1 - qty2;
                            DB.iud("UPDATE rr_stock SET `qty` = '" + String.valueOf(qty3) + "' WHERE `rr_type` = '" + dtm.getValueAt(i, 0).toString() + "' ");

                            DB.iud("insert into r_mill_operation  (`r_type`,`bag_size`,`qty`,`t_raw`,`t_r_mill`,`date`,`time`) values "
                                    + "('" + dtm.getValueAt(i, 0).toString() + "',"
                                    + "'" + dtm.getValueAt(i, 1).toString() + "',"
                                    + "'" + dtm.getValueAt(i, 2).toString() + "',"
                                    + "'" + dtm.getValueAt(i, 3).toString() + "',"
                                    + "'" + dtm.getValueAt(i, 4).toString() + "',"
                                    + "'" + dtm.getValueAt(i, 5).toString() + "',"
                                    + "'" + dtm.getValueAt(i, 6).toString() + "')");

                            ResultSet rs3 = DB.search("select * from r_stock where r_type = '" + dtm.getValueAt(i, 0).toString() + "' ");
                            if (rs3.next()) {
                                int qty5 = Integer.parseInt(rs3.getString("r_qty"));
                                int qty6 = Integer.parseInt(dtm.getValueAt(i, 2).toString());
                                int qty4 = qty5 + qty6;
                                DB.iud("UPDATE r_stock SET `r_qty` = '" + String.valueOf(qty4) + "' WHERE `r_type` = '" + dtm.getValueAt(i, 0).toString() + "' ");
                            } else {
                                DB.iud("insert into r_stock  (`r_type`,`r_qty`) values ('" + dtm.getValueAt(i, 0).toString() + "','" + dtm.getValueAt(i, 2).toString() + "') ");
                            }
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(this, "Inventory Reduce & Rice Stock & Rice Mill Operation Added Succesfully", "DONE!", JOptionPane.INFORMATION_MESSAGE,icon);
                dtm.setRowCount(0);
            }
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed

    }//GEN-LAST:event_jTable1KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jTextField2.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTable1.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jComboBox1.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField3.requestFocus();
            double s = Double.parseDouble(jTextField1.getText());
            double q = Double.parseDouble(jTextField2.getText());
            double sum = s * q;
            jTextField3.setText(String.valueOf(sum));

        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTable1.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jTextField1.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (Character.isDigit(evt.getKeyChar()) | evt.getKeyCode() == KeyEvent.VK_BACK_SPACE | evt.getKeyCode() == KeyEvent.VK_DELETE | evt.getKeyCode() == KeyEvent.VK_NUM_LOCK
                | evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_RIGHT | evt.getKeyCode() == KeyEvent.VK_LEFT | evt.getKeyCode() == KeyEvent.VK_UP
                | evt.getKeyCode() == KeyEvent.VK_DOWN | evt.getKeyCode() == KeyEvent.VK_PERIOD) {
            jTextField1.setEditable(true);
        } else {
            jTextField1.setEditable(false);
            JOptionPane.showMessageDialog(this, "Invalid Key", "ERROR!", JOptionPane.ERROR_MESSAGE);
            jTextField1.setText("");
            jTextField1.grabFocus();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        if (jTextField1.getText().isEmpty()) {
            jTextField1.grabFocus();
        }
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        if (Character.isDigit(evt.getKeyChar()) | evt.getKeyCode() == KeyEvent.VK_BACK_SPACE | evt.getKeyCode() == KeyEvent.VK_DELETE | evt.getKeyCode() == KeyEvent.VK_NUM_LOCK
                | evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_RIGHT | evt.getKeyCode() == KeyEvent.VK_LEFT
                | evt.getKeyCode() == KeyEvent.VK_DOWN) {

            jTextField2.setEditable(true);

        } else {
            jTextField2.setEditable(false);
            JOptionPane.showMessageDialog(this, "Invalid Key", "ERROR!", JOptionPane.ERROR_MESSAGE);
            jTextField2.setText("");
            jTextField2.grabFocus();
        }


    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        if (jTextField2.getText().isEmpty()) {
            jTextField2.grabFocus();
        }
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Rice_Milling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rice_Milling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rice_Milling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rice_Milling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rice_Milling().setVisible(true);
            }
        });
    }

    private void setDate() {
        d = new Date();
        jLabel3.setText(sdf.format(d));
    }

    private void setTime() {
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1 = new Date();
                jLabel1.setText(sdf1.format(d1));
            }
        });
        t.start();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void setR_type() {
        try {
            jComboBox1.removeAllItems();
            ResultSet rs = DB.search("select * from rr_reg order by r_name");
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("r_name"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
