package sources;


import controllers.Controller;
import controllers.ControllerUI;
import controllers.threads.clockThread;
import javax.swing.JButton;
import javax.swing.JTextField;



/**
 *
 * @author Raziel
 */
public class UserUi extends javax.swing.JFrame {

    /**
     * Creates new form UserUi
     */
    
    private Controller ct;
    private ControllerUI ctui;
    
    public UserUi() {
        initComponents();
        ct = new Controller(jLabelClock1,jLabelClock2,
                jLabelClock3,jLabelClock4);
        ctui = new ControllerUI();
        ct.iniciar();
        disableTxtFields();
        setLocationRelativeTo(null);
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelClock1 = new javax.swing.JLabel();
        jLabelClock2 = new javax.swing.JLabel();
        jLabelClock3 = new javax.swing.JLabel();
        jLabelClock4 = new javax.swing.JLabel();
        jButtonModify1 = new javax.swing.JButton();
        jTextHour1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextMin1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextSec1 = new javax.swing.JTextField();
        jButtonModify2 = new javax.swing.JButton();
        jTextHour2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextMin2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextSec2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextMin3 = new javax.swing.JTextField();
        jTextHour3 = new javax.swing.JTextField();
        jButtonModify3 = new javax.swing.JButton();
        jTextSec3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextSec4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextMin4 = new javax.swing.JTextField();
        jTextHour4 = new javax.swing.JTextField();
        jButtonModify4 = new javax.swing.JButton();
        jButtonDown = new javax.swing.JButton();
        jButtonUp = new javax.swing.JButton();
        jButtonDown1 = new javax.swing.JButton();
        jButtonUp1 = new javax.swing.JButton();
        jButtonDown2 = new javax.swing.JButton();
        jButtonUp2 = new javax.swing.JButton();
        jButtonDown3 = new javax.swing.JButton();
        jButtonUp3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelClock1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelClock1.setText("jLabel1");

        jLabelClock2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelClock2.setText("jLabel1");

        jLabelClock3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelClock3.setText("jLabel1");

        jLabelClock4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelClock4.setText("jLabel1");

        jButtonModify1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonModify1.setText("Detener");
        jButtonModify1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModify1ActionPerformed(evt);
            }
        });

        jTextHour1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextHour1.setText("0");
        jTextHour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHour1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(":");

        jTextMin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextMin1.setText("0");
        jTextMin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMin1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(":");

        jTextSec1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextSec1.setText("0");
        jTextSec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSec1ActionPerformed(evt);
            }
        });

        jButtonModify2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonModify2.setText("Detener");
        jButtonModify2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModify2ActionPerformed(evt);
            }
        });

        jTextHour2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextHour2.setText("0");
        jTextHour2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHour2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(":");

        jTextMin2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextMin2.setText("0");
        jTextMin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMin2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText(":");

        jTextSec2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextSec2.setText("0");
        jTextSec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSec2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText(":");

        jTextMin3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextMin3.setText("0");
        jTextMin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMin3ActionPerformed(evt);
            }
        });

        jTextHour3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextHour3.setText("0");
        jTextHour3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHour3ActionPerformed(evt);
            }
        });

        jButtonModify3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonModify3.setText("Detener");
        jButtonModify3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModify3ActionPerformed(evt);
            }
        });

        jTextSec3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextSec3.setText("0");
        jTextSec3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSec3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText(":");

        jTextSec4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextSec4.setText("0");
        jTextSec4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSec4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText(":");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText(":");

        jTextMin4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextMin4.setText("0");
        jTextMin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMin4ActionPerformed(evt);
            }
        });

        jTextHour4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextHour4.setText("0");
        jTextHour4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHour4ActionPerformed(evt);
            }
        });

        jButtonModify4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonModify4.setText("Detener");
        jButtonModify4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModify4ActionPerformed(evt);
            }
        });

        jButtonDown.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDown.setText("<<");
        jButtonDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDownActionPerformed(evt);
            }
        });

        jButtonUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUp.setText(">>");
        jButtonUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpActionPerformed(evt);
            }
        });

        jButtonDown1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDown1.setText("<<");
        jButtonDown1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDown1ActionPerformed(evt);
            }
        });

        jButtonUp1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUp1.setText(">>");
        jButtonUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUp1ActionPerformed(evt);
            }
        });

        jButtonDown2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDown2.setText("<<");
        jButtonDown2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDown2ActionPerformed(evt);
            }
        });

        jButtonUp2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUp2.setText(">>");
        jButtonUp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUp2ActionPerformed(evt);
            }
        });

        jButtonDown3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDown3.setText("<<");
        jButtonDown3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDown3ActionPerformed(evt);
            }
        });

        jButtonUp3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUp3.setText(">>");
        jButtonUp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUp3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonModify2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDown1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonUp1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextHour2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextMin2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextSec2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelClock2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(312, 312, 312)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextHour4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextMin4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextSec4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonModify4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonDown3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonUp3))
                                    .addComponent(jLabelClock4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabelClock3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextHour3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextMin3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextSec3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonModify3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonDown2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonUp2))
                                    .addComponent(jLabelClock1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonModify1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonDown)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonUp))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextHour1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextSec1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelClock2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextHour2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextSec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonModify2)
                            .addComponent(jButtonDown1)
                            .addComponent(jButtonUp1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelClock1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextHour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jTextMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextSec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonModify1)
                            .addComponent(jButtonDown)
                            .addComponent(jButtonUp))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelClock4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextHour4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextSec4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonModify4)
                            .addComponent(jButtonDown3)
                            .addComponent(jButtonUp3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabelClock3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextHour3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextSec3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonModify3)
                            .addComponent(jButtonDown2)
                            .addComponent(jButtonUp2))))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jTextHour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHour1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextHour1ActionPerformed

    private void jTextMin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMin1ActionPerformed

    private void jTextSec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSec1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSec1ActionPerformed

    private void jTextHour2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHour2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHour2ActionPerformed

    private void jTextMin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMin2ActionPerformed

    private void jTextSec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSec2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSec2ActionPerformed

    private void jTextMin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMin3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMin3ActionPerformed

    private void jTextHour3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHour3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHour3ActionPerformed

    private void jTextSec3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSec3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSec3ActionPerformed

    
    
    private void jButtonModify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModify1ActionPerformed
        modify(jTextHour1, jTextMin1, jTextSec1, jButtonModify1, 1);
    }//GEN-LAST:event_jButtonModify1ActionPerformed

    private void jButtonModify2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModify2ActionPerformed
        modify(jTextHour2, jTextMin2, jTextSec2, jButtonModify2, 2);
    }//GEN-LAST:event_jButtonModify2ActionPerformed

    private void jButtonModify3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModify3ActionPerformed
        modify(jTextHour3, jTextMin3, jTextSec3, jButtonModify3, 3);
    }//GEN-LAST:event_jButtonModify3ActionPerformed

    private void jTextSec4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSec4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSec4ActionPerformed

    private void jTextMin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMin4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMin4ActionPerformed

    private void jTextHour4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHour4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHour4ActionPerformed

    private void jButtonModify4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModify4ActionPerformed
        modify(jTextHour4, jTextMin4, jTextSec4, jButtonModify4, 4);
    }//GEN-LAST:event_jButtonModify4ActionPerformed

    private void jButtonDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDownActionPerformed
        speedClock(1, 200);
    }//GEN-LAST:event_jButtonDownActionPerformed

    private void jButtonUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpActionPerformed
        speedClock(1, -200);
    }//GEN-LAST:event_jButtonUpActionPerformed

    private void jButtonDown1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDown1ActionPerformed
        speedClock(2, 200);
    }//GEN-LAST:event_jButtonDown1ActionPerformed

    private void jButtonUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUp1ActionPerformed
        speedClock(2, -200);
    }//GEN-LAST:event_jButtonUp1ActionPerformed

    private void jButtonDown2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDown2ActionPerformed
        speedClock(3, 200);
    }//GEN-LAST:event_jButtonDown2ActionPerformed

    private void jButtonUp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUp2ActionPerformed
        speedClock(3, -200);
    }//GEN-LAST:event_jButtonUp2ActionPerformed

    private void jButtonDown3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDown3ActionPerformed
        speedClock(4, 200);
    }//GEN-LAST:event_jButtonDown3ActionPerformed

    private void jButtonUp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUp3ActionPerformed
        speedClock(4, -200);
    }//GEN-LAST:event_jButtonUp3ActionPerformed

    
    private void speedClock(int numClock, int speed){
        ct.adjustSpeed(numClock, speed);
    }
    
    
    public void disableTxtFields(){
        jTextHour1.setEnabled(false);
        jTextMin1.setEnabled(false);
        jTextSec1.setEnabled(false);
        jTextHour2.setEnabled(false);
        jTextMin2.setEnabled(false);
        jTextSec2.setEnabled(false);
        jTextHour3.setEnabled(false);
        jTextMin3.setEnabled(false);
        jTextSec3.setEnabled(false);
        jTextHour4.setEnabled(false);
        jTextMin4.setEnabled(false);
        jTextSec4.setEnabled(false);
    }
    
    
    public void modify(JTextField hour, JTextField minute, JTextField second,
            JButton modifyButton, int numberClock){
        //TRUE WHEN THE CLOCK IS BOUT TO BE MODIFIED
        //FALSE IF THE USER HAD ENTERED THE NEW VALUES
        if(!hour.isEnabled()){
            hour.setEnabled(true);
            minute.setEnabled(true);
            second.setEnabled(true);
            ct.modify(numberClock, true);
            modifyButton.setText("Modificar");
        }else{
            //THE ADJUST FUNCTION WILL VERIFY IF THE FILEDS AREN'T EMPTY 
            //IF THEIR VALUES ARE BIGGER THAN THEY SHOULD, LIKE HOUR=45 IT'LL ADJUST THEM
            ctui.adjust(hour, minute, second);
            //PASSING VALUES THE THREAD CONTROLLER
            ct.modify(numberClock, false, ctui.getHour(), ctui.getMinute(), ctui.getSecond());
            hour.setEnabled(false);
            minute.setEnabled(false);
            second.setEnabled(false);
            modifyButton.setText("Detener");
        }
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
            java.util.logging.Logger.getLogger(UserUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDown;
    private javax.swing.JButton jButtonDown1;
    private javax.swing.JButton jButtonDown2;
    private javax.swing.JButton jButtonDown3;
    private javax.swing.JButton jButtonModify1;
    private javax.swing.JButton jButtonModify2;
    private javax.swing.JButton jButtonModify3;
    private javax.swing.JButton jButtonModify4;
    private javax.swing.JButton jButtonUp;
    private javax.swing.JButton jButtonUp1;
    private javax.swing.JButton jButtonUp2;
    private javax.swing.JButton jButtonUp3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelClock1;
    private javax.swing.JLabel jLabelClock2;
    private javax.swing.JLabel jLabelClock3;
    private javax.swing.JLabel jLabelClock4;
    private javax.swing.JTextField jTextHour1;
    private javax.swing.JTextField jTextHour2;
    private javax.swing.JTextField jTextHour3;
    private javax.swing.JTextField jTextHour4;
    private javax.swing.JTextField jTextMin1;
    private javax.swing.JTextField jTextMin2;
    private javax.swing.JTextField jTextMin3;
    private javax.swing.JTextField jTextMin4;
    private javax.swing.JTextField jTextSec1;
    private javax.swing.JTextField jTextSec2;
    private javax.swing.JTextField jTextSec3;
    private javax.swing.JTextField jTextSec4;
    // End of variables declaration//GEN-END:variables
}
