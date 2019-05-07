/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Domenica Cañizares
 * @since 03-Mayo-2019
 * @version IDE 8.0.2
 */
public class TresEnRaya extends javax.swing.JFrame {

    /**
     * Creates new form TresEnRaya
     */
    public TresEnRaya() {
        initComponents();

        ingresar();

        pnlO.setBackground(Color.green);
        pnlX.setBackground(Color.yellow);

        //lineas horizontales
        jlbhor1.setVisible(false);
        jlbhor2.setVisible(false);
        jlbhor3.setVisible(false);

        //lineas verticales
        jlbver1.setVisible(false);
        jlbver2.setVisible(false);
        jlbver3.setVisible(false);

        //lineas diagonales
        jlbdia1.setVisible(false);
        jlbdia2.setVisible(false);

        this.setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pnlX = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlbX1 = new javax.swing.JLabel();
        pnlO = new javax.swing.JPanel();
        jlbO1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jlbhor1 = new javax.swing.JLabel();
        jlbhor2 = new javax.swing.JLabel();
        jlbhor3 = new javax.swing.JLabel();
        jlbver1 = new javax.swing.JLabel();
        jlbver2 = new javax.swing.JLabel();
        jlbver3 = new javax.swing.JLabel();
        jlbdia1 = new javax.swing.JLabel();
        jlbdia2 = new javax.swing.JLabel();
        btn00 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Juego de Tres en Raya");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Juegar de Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pnlX.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("X");

        jlbX1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbX1.setText("0");

        javax.swing.GroupLayout pnlXLayout = new javax.swing.GroupLayout(pnlX);
        pnlX.setLayout(pnlXLayout);
        pnlXLayout.setHorizontalGroup(
            pnlXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jlbX1)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlXLayout.setVerticalGroup(
            pnlXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlbX1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlO.setBackground(new java.awt.Color(204, 204, 204));

        jlbO1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbO1.setText("0");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("O");

        javax.swing.GroupLayout pnlOLayout = new javax.swing.GroupLayout(pnlO);
        pnlO.setLayout(pnlOLayout);
        pnlOLayout.setHorizontalGroup(
            pnlOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(jlbO1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOLayout.setVerticalGroup(
            pnlOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlbO1))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlO, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbhor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/hor1.png"))); // NOI18N
        jPanel5.add(jlbhor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, 10));

        jlbhor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/hor1.png"))); // NOI18N
        jPanel5.add(jlbhor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 10));

        jlbhor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/hor1.png"))); // NOI18N
        jPanel5.add(jlbhor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 300, 10));

        jlbver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/ver.png"))); // NOI18N
        jPanel5.add(jlbver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jlbver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/ver.png"))); // NOI18N
        jPanel5.add(jlbver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jlbver3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/ver.png"))); // NOI18N
        jPanel5.add(jlbver3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jlbdia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/raya 1.png"))); // NOI18N
        jlbdia1.setText("jLabel4");
        jPanel5.add(jlbdia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 10, 450, 250));

        jlbdia2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/raya 2.png"))); // NOI18N
        jlbdia2.setText("jLabel6");
        jPanel5.add(jlbdia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -240, -1, -1));

        btn00.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });
        jPanel5.add(btn00, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 70, 66));

        btn01.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });
        jPanel5.add(btn01, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 70, 66));

        btn02.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });
        jPanel5.add(btn02, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 70, 66));

        btn12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel5.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 70, 66));

        btn11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel5.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 70, 66));

        btn10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel5.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 70, 66));

        btn22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        jPanel5.add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 70, 66));

        btn21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        jPanel5.add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 70, 66));

        btn20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        jPanel5.add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 179, 70, 66));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 10, 240));

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 300, 10));

        jPanel6.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 300, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        opcion();

        //diagonal
        cont.rayar(matriz, jlbdia1, 7, 0, 0);

        cont.rayar1(matriz, jlbdia1, 15, 0, 0);

        //horizontal
        cont.rayar(matriz, jlbhor1, 1, 0, 0);

        cont.rayar1(matriz, jlbhor1, 9, 0, 0);

        //vertical
        cont.rayar(matriz, jlbver1, 4, 0, 0);

        cont.rayar1(matriz, jlbver1, 12, 0, 0);

        if (cont.jugar(btn00, 0, 0, matriz, jlbX1, jlbO1) == 1) {
            resp = true;
        } else {
            compu();
        }
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        opcion();

        //horizontal
        cont.rayar(matriz, jlbhor1, 1, 0, 1);

        cont.rayar1(matriz, jlbhor1, 9, 0, 1);

        //vertical
        cont.rayar(matriz, jlbver2, 5, 0, 1);

        cont.rayar(matriz, jlbver2, 12, 0, 1);

        if (cont.jugar(btn01, 0, 1, matriz, jlbX1, jlbO1) == 1) {
            resp = true;
        }
        else {
            compu();
        }
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        opcion();

        //horizontal
        cont.rayar(matriz, jlbhor1, 1, 0, 2);

        cont.rayar1(matriz, jlbhor1, 9, 0, 2);

        //vertical
        cont.rayar(matriz, jlbver3, 6, 0, 2);

        cont.rayar1(matriz, jlbver3, 14, 0, 2);

        //diagonal
        cont.rayar(matriz, jlbdia2, 8, 0, 2);

        cont.rayar1(matriz, jlbdia2, 16, 0, 2);

        if (cont.jugar(btn02, 0, 2, matriz, jlbX1, jlbO1) == 1) {
            resp = true;
        } else{
            compu();
        }
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        opcion();

        //horizontal
        cont.rayar(matriz, jlbhor2, 2, 1, 0);

        cont.rayar1(matriz, jlbhor2, 10, 1, 0);
        
        //vertical
        cont.rayar(matriz, jlbver1, 4, 1, 0);

        cont.rayar1(matriz, jlbver1, 12, 1, 0);

        if (cont.jugar(btn10, 1, 0, matriz, jlbX1, jlbO1) == 1) {
            resp = true;
        } else {
            compu();
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        opcion();

        //diagonal
        cont.rayar(matriz, jlbdia1, 7, 1, 1);
        cont.rayar(matriz, jlbdia2, 8, 1, 1);

        cont.rayar1(matriz, jlbdia1, 15, 1, 1);
        cont.rayar1(matriz, jlbdia2, 16, 1, 1);

        //horizontal
        cont.rayar(matriz, jlbhor2, 2, 1, 1);

        cont.rayar1(matriz, jlbhor2, 10, 1, 1);

        //vertical
        cont.rayar(matriz, jlbver2, 5, 1, 1);

        cont.rayar1(matriz, jlbver2, 13, 1, 1);

        if (cont.jugar(btn11, 1, 1, matriz, jlbX1, jlbO1) == 1) {
            resp = true;
        } else {
           compu();
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        opcion();

        //horizontal
        cont.rayar(matriz, jlbhor2, 2, 1, 2);

        cont.rayar1(matriz, jlbhor2, 10, 1, 2);

        //vertical
        cont.rayar(matriz, jlbver3, 6, 1, 2);

        cont.rayar1(matriz, jlbver3, 14, 1, 2);

        if (cont.jugar(btn12, 1, 02, matriz, jlbX1, jlbO1) == 1) {
            resp = true;
        } else {
            compu();
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        opcion();

        //horizontal
        cont.rayar(matriz, jlbhor3, 3, 2, 0);

        cont.rayar1(matriz, jlbhor3, 11, 2, 0);

        //vertical
        cont.rayar(matriz, jlbver1, 4, 2, 0);

        cont.rayar1(matriz, jlbver1, 12, 2, 0);

        //diagonal
        cont.rayar(matriz, jlbdia2, 8, 2, 0);

        cont.rayar1(matriz, jlbdia2, 16, 2, 0);

        if (cont.jugar(btn20, 2, 0, matriz, jlbX1, jlbO1) == 1) {
            resp = true;
        } else {
            compu();
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        opcion();

        //horizontal
        cont.rayar(matriz, jlbhor3, 3, 2, 1);

        cont.rayar1(matriz, jlbhor3, 11, 2, 1);

        //vertical
        cont.rayar(matriz, jlbver2, 5, 2, 1);

        cont.rayar1(matriz, jlbver2, 13, 2, 1);

        if (cont.jugar(btn21, 2, 1, matriz, jlbX1, jlbO1) == 1) {
            resp = true;
        } else{
            compu();
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        opcion();

        //diagonal
        cont.rayar(matriz, jlbdia1, 7, 2, 2);

        cont.rayar1(matriz, jlbdia1, 15, 2, 2);

        //horizontal
        cont.rayar(matriz, jlbhor3, 3, 2, 2);

        cont.rayar1(matriz, jlbhor3, 11, 2, 2);

        //vertical
        cont.rayar(matriz, jlbver3, 6, 2, 2);

        cont.rayar1(matriz, jlbver3, 14, 2, 2);

        if (cont.jugar(btn22, 2, 2, matriz, jlbX1, jlbO1) == 1) {
            resp = true;
        } else {
           compu();
        }
    }//GEN-LAST:event_btn22ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nuevo();
    }//GEN-LAST:event_jButton1ActionPerformed

    //iniciar palabras
    private int matriz[][] = new int[3][3];

    public void ingresar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (j + 10) * (i + 10);
            }
        }
    }

    Contenido cont = new Contenido(0, 0, 0);

    public void opcion() {

        if (cont.getTurno() == 1) {
            pnlX.setBackground(Color.yellow);
            pnlO.setBackground(Color.green);

        }
        if (cont.getTurno() == 0) {
            pnlX.setBackground(Color.green);
            pnlO.setBackground(Color.yellow);
        }

    }

    public void nuevo() {
        resp = false;
        ingresar();
        btn00.setText("");
        btn00.setEnabled(true);

        btn01.setText("");
        btn01.setEnabled(true);

        btn02.setText("");
        btn02.setEnabled(true);

        btn10.setText("");
        btn10.setEnabled(true);

        btn11.setText("");
        btn11.setEnabled(true);

        btn12.setText("");
        btn12.setEnabled(true);

        btn20.setText("");
        btn20.setEnabled(true);

        btn21.setText("");
        btn21.setEnabled(true);

        btn22.setText("");
        btn22.setEnabled(true);

        //lineas horizontales
        jlbhor1.setVisible(false);
        jlbhor2.setVisible(false);
        jlbhor3.setVisible(false);

        //lineas verticales
        jlbver1.setVisible(false);
        jlbver2.setVisible(false);
        jlbver3.setVisible(false);

        //lineas diagonales
        jlbdia1.setVisible(false);
        jlbdia2.setVisible(false);
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
            java.util.logging.Logger.getLogger(TresEnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TresEnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TresEnRaya().setVisible(true);
            }
        });
    }

    private boolean resp = false;

    public void compu() {
        if (resp == false) {

            int random = (int) Math.random() * 9 + 1;

            if (random == 1) {
                if (btn00.getText().equals("")) {
                    btn00.setText("O");
                    btn00.setForeground(Color.red);
                    btn00.setEnabled(false);
                } else {
                    random++;
                }
            }

            if (random == 2) {
                if (btn01.getText().equals("")) {
                    btn01.setText("O");
                    btn01.setForeground(Color.red);
                    btn01.setEnabled(false);
                } else {
                    random++;
                }
            }

            if (random == 3) {
                if (btn02.getText().equals("")) {
                    btn02.setText("O");
                    btn02.setForeground(Color.red);
                    btn02.setEnabled(false);
                } else {
                    random++;
                }
            }

            if (random == 4) {
                if (btn10.getText().equals("")) {
                    btn10.setText("O");
                    btn10.setForeground(Color.red);
                    btn10.setEnabled(false);
                } else {
                    random++;
                }
            }

            if (random == 5) {
                if (btn11.getText().equals("")) {
                    btn11.setText("O");
                    btn11.setForeground(Color.red);
                    btn11.setEnabled(false);
                } else {
                    random++;
                }
            }

            if (random == 6) {
                if (btn12.getText().equals("")) {
                    btn12.setText("O");
                    btn12.setForeground(Color.red);
                    btn12.setEnabled(false);
                } else {
                    random++;
                }
            }

            if (random == 7) {
                if (btn20.getText().equals("")) {
                    btn20.setText("O");
                    btn20.setForeground(Color.red);
                    btn20.setEnabled(false);
                } else {
                    random++;
                }
            }

            if (random == 8) {
                if (btn21.getText().equals("")) {
                    btn21.setText("O");
                    btn21.setForeground(Color.red);
                    btn21.setEnabled(false);
                } else {
                    random++;
                }
            }

            if (random == 9) {
                if (btn22.getText().equals("")) {
                    btn22.setText("O");
                    btn22.setForeground(Color.red);
                    btn22.setEnabled(false);
                } else {
                    random++;
                }
            }
            
        }
        
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlbO1;
    private javax.swing.JLabel jlbX1;
    private javax.swing.JLabel jlbdia1;
    private javax.swing.JLabel jlbdia2;
    private javax.swing.JLabel jlbhor1;
    private javax.swing.JLabel jlbhor2;
    private javax.swing.JLabel jlbhor3;
    private javax.swing.JLabel jlbver1;
    private javax.swing.JLabel jlbver2;
    private javax.swing.JLabel jlbver3;
    private javax.swing.JPanel pnlO;
    private javax.swing.JPanel pnlX;
    // End of variables declaration//GEN-END:variables
}
