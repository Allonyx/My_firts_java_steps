/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class Reporte_contribuyentes extends javax.swing.JFrame {

    Menu m = new Menu();

    /**
     * Creates new form Reporte_contribuyentes
     */
    public Reporte_contribuyentes() {
        initComponents();
        llenar_tabla();
        setTitle("Reportes");
        this.getContentPane().setBackground(Color.black);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("TT.png")).getImage());
    }

    private void boton() {
        DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
        DecimalFormat decimalFormat = new DecimalFormat(",###");
        Object[] capturar_objetos = new Object[20];
        model1.setRowCount(1);

        int i = 0;
        String tx = jTextField1.getText();
        if (tx.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar el numero de DNI del Contribuyente para generar el reporte");
            return;
        }

        for (i = 0; i < m.vec_per.length; i++) {

            if (tx.equals(m.vec_per[i].getNdi())) {

                capturar_objetos[0] = m.vec_per[i].getTipo_dni();
                capturar_objetos[1] = m.vec_per[i].getNdi();
                capturar_objetos[2] = m.vec_per[i].getNom();
                capturar_objetos[3] = decimalFormat.format(m.vec_per[i].getPca());
                capturar_objetos[4] = decimalFormat.format(m.vec_per[i].getVp());
                double pt = m.vec_per[i].getVp();
                double pt50 = pt / 2;
                double imp;
                double VP = m.vec_per[i].getVp();
                double di = m.vec_per[i].getVp() - m.vec_per[i].getPca();
                double imp1;
                if (m.vec_per[i].getTipo_dni().equals("CC")) {
                    if (VP > 120000000 && di > 80000000) {
                        imp1 = VP * 0.03;
                        capturar_objetos[6] = decimalFormat.format(imp1);
                        capturar_objetos[5] = "3%";
                    } else if (VP > 120000000 && di <= 80000000) {
                        imp1 = VP * 0.015;
                        capturar_objetos[6] = decimalFormat.format(imp1);
                        capturar_objetos[5] = "1.5%";
                    } else if (VP < 120000000) {
                        capturar_objetos[6] = "NO PAGA";
                        capturar_objetos[5] = "0%";
                    } 
                } else {
                    if (pt > 90000000 && pt50 > 80000000) {
                        imp = m.vec_per[i].getVia() * 0.045; 
                        capturar_objetos[6] = decimalFormat.format(imp);
                        capturar_objetos[5] = "4.5%";
                    } else {
                        imp = m.vec_per[i].getVia() * 0.035;
                        capturar_objetos[6] = decimalFormat.format(imp);
                        capturar_objetos[5] = "3.5%";
                    }
                }
                model1.addRow(capturar_objetos);
                break;
            }
        }
        if (i >= m.vec_per.length) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Numero de DNI que coincida con\nla Base de Datosde los contribuyente para generar el reporte");
        }
    }

    void llenar_tabla() {
        Menu m = new Menu();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] capturar_objetos = new Object[20];

        int i = 0;
        for (i = 0; i < m.vec_per.length; i++) {
            if (m.vec_per[i].getTipo_dni().equals("NIT") || m.vec_per[i].getTipo_dni().equals("CC")) {

                capturar_objetos[0] = m.vec_per[i].getTipo_dni();
                capturar_objetos[1] = m.vec_per[i].getNdi();
                capturar_objetos[2] = m.vec_per[i].getNom();
                model.addRow(capturar_objetos);
            } else {
            }
        }

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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(67, 197, 67));
        jLabel1.setText("Reporte Impuestos de Renta por  contribuyente  ");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(67, 197, 67));
        jLabel2.setText("Ingrese el numero de DNI del contribuyente ");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(67, 197, 67));
        jLabel3.setText("Numero de DNI: ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(67, 197, 67));
        jLabel4.setText("Base de Datos Contribuyentes");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de DNI", "DNI", "Nombre "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de DNI", "Numero  DNI", "Nombre Contribuyente", "Pagos Crediticio Anuales", "Valor  Patrimonio", "Impuesto Sobre Patrimonio", "Valor impuesto a Pagar"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setBackground(new java.awt.Color(0, 129, 153));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Generear Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 129, 153));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Regresar a Contribuyentes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 129, 153));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Regresar a la Pagina Princial");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/l.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(67, 197, 67));
        jLabel6.setText("Para Generar el Reporte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(299, 299, 299))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(107, 107, 107))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jButton1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Contribuyentes c = new Contribuyentes();
        this.setVisible(false);
        c.setVisible(true);
        c.setResizable(false);
        c.setLocationRelativeTo(null);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        m.setVisible(true);
        m.setResizable(false);
        m.setLocationRelativeTo(null);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boton();
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
            java.util.logging.Logger.getLogger(Reporte_contribuyentes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_contribuyentes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_contribuyentes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_contribuyentes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte_contribuyentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
