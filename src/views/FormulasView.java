package views;

import Formulas.Forms;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class FormulasView extends javax.swing.JFrame {

    Vector<String> cabeceras = new Vector<>();
    Vector<Vector<String>> informacion = new Vector<>();
    DefaultTableModel modelo;
    DefaultListModel<String> listaJueces = new DefaultListModel();
    DefaultListModel<String> listaTsi = new DefaultListModel();
    DefaultListModel<String> listaPValor = new DefaultListModel();
    DefaultListModel<String> listaConcordancia = new DefaultListModel();
    Forms form = new Forms();
    DecimalFormat df = new DecimalFormat("#0.000");

    public FormulasView() {
        initComponents();

        modelo = new DefaultTableModel(informacion, cabeceras);
        tblJueces.setModel(modelo);
        lstTJueces.setModel(listaJueces);
        lstTsi.setModel(listaTsi);
        lstPValor.setModel(listaPValor);
        lstConcordancia.setModel(listaConcordancia);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJueces = new javax.swing.JTable();
        btnAgregarJuez = new javax.swing.JButton();
        btnAgregarItems = new javax.swing.JButton();
        btnObtenerJueces = new javax.swing.JButton();
        btnObtenerTsi = new javax.swing.JButton();
        btnObtenerPValor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTJueces = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstTsi = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstPValor = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTotalJueces = new javax.swing.JTextField();
        txtTotalTsi = new javax.swing.JTextField();
        btnCalcularTotales = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstConcordancia = new javax.swing.JList<>();
        btnObtenerConcordancia = new javax.swing.JButton();
        btnVentanaVaiken = new javax.swing.JButton();
        btnVentanaVaiken1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblJueces.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblJueces);

        btnAgregarJuez.setText("Agregar Juez");
        btnAgregarJuez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarJuezActionPerformed(evt);
            }
        });

        btnAgregarItems.setText("Agregar Items");
        btnAgregarItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarItemsActionPerformed(evt);
            }
        });

        btnObtenerJueces.setText("Obtener T Jueces");
        btnObtenerJueces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerJuecesActionPerformed(evt);
            }
        });

        btnObtenerTsi.setText("Obtener TSI");
        btnObtenerTsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerTsiActionPerformed(evt);
            }
        });

        btnObtenerPValor.setText("Obtener P Valor");
        btnObtenerPValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerPValorActionPerformed(evt);
            }
        });

        lstTJueces.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstTJueces);

        jLabel1.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("T Jueces");

        jLabel2.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TSI");

        lstTsi.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstTsi);

        lstPValor.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstPValor);

        jLabel3.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("P Valor");

        jLabel4.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TOTAL");

        txtTotalJueces.setEditable(false);
        txtTotalJueces.setText("-----");

        txtTotalTsi.setEditable(false);
        txtTotalTsi.setText("-----");

        btnCalcularTotales.setText("Calcular");
        btnCalcularTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTotalesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Concordancia");

        lstConcordancia.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(lstConcordancia);

        btnObtenerConcordancia.setText("Obtener Concordancia");
        btnObtenerConcordancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerConcordanciaActionPerformed(evt);
            }
        });

        btnVentanaVaiken.setText("Vaiken");
        btnVentanaVaiken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentanaVaikenActionPerformed(evt);
            }
        });

        btnVentanaVaiken1.setText("Crombach");
        btnVentanaVaiken1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentanaVaiken1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVentanaVaiken)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVentanaVaiken1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregarJuez)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarItems)
                        .addGap(18, 18, 18)
                        .addComponent(btnObtenerJueces)
                        .addGap(18, 18, 18)
                        .addComponent(btnObtenerTsi)
                        .addGap(22, 22, 22)
                        .addComponent(btnObtenerPValor)
                        .addGap(22, 22, 22)
                        .addComponent(btnObtenerConcordancia))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(653, 653, 653)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalcularTotales))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTotalJueces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalTsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarJuez)
                            .addComponent(btnAgregarItems)
                            .addComponent(btnObtenerJueces)
                            .addComponent(btnObtenerTsi)
                            .addComponent(btnObtenerPValor)
                            .addComponent(btnObtenerConcordancia))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTotalJueces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalTsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcularTotales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVentanaVaiken, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVentanaVaiken1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Binomial", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnObtenerConcordanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerConcordanciaActionPerformed
        for (int i = 0; i < listaPValor.getSize(); ++i) {
            if (Double.parseDouble(listaPValor.get(i)) < 0.05) {
                listaConcordancia.addElement("Ha");
            } else {
                listaConcordancia.addElement("Ho");
            }
        }
    }//GEN-LAST:event_btnObtenerConcordanciaActionPerformed

    private void btnCalcularTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTotalesActionPerformed
        int totalJueces = 0;
        int totalTsi = 0;

        if (listaJueces.getSize() > 0 && listaJueces.getSize() > 0) {
            for (int i = 0; i < listaJueces.getSize(); ++i) {
                totalJueces += Integer.parseInt(listaJueces.get(i));
                totalTsi += Integer.parseInt(listaTsi.get(i));
            }
        }

        txtTotalJueces.setText("" + totalJueces);
        txtTotalTsi.setText("" + totalTsi);

    }//GEN-LAST:event_btnCalcularTotalesActionPerformed

    private void btnObtenerPValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerPValorActionPerformed
        listaPValor.removeAllElements();
        for (int i = 0; i < modelo.getRowCount(); ++i) {
            int tsi = Integer.parseInt(listaTsi.get(i));
            int tjueces = Integer.parseInt(listaJueces.get(i));
            double pValor = Double.parseDouble(df.format(Math.abs(form.distrBinom(tsi, tjueces, .5))));
            listaPValor.addElement("" + pValor);
        }
    }//GEN-LAST:event_btnObtenerPValorActionPerformed

    private void btnObtenerTsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerTsiActionPerformed
        listaTsi.removeAllElements();
        for (int i = 0; i < modelo.getRowCount(); ++i) {
            int sumaTsi = 0;
            for (int j = 0; j < modelo.getColumnCount(); ++j) {
                if (Integer.parseInt(modelo.getValueAt(i, j).toString()) == 1) {
                    sumaTsi += 1;
                }
            }
            listaTsi.addElement("" + sumaTsi);
        }
    }//GEN-LAST:event_btnObtenerTsiActionPerformed

    private void btnObtenerJuecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerJuecesActionPerformed
        listaJueces.removeAllElements();
        for (int i = 0; i < modelo.getRowCount(); ++i) {
            listaJueces.addElement("" + modelo.getColumnCount());
        }
    }//GEN-LAST:event_btnObtenerJuecesActionPerformed

    private void btnAgregarItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarItemsActionPerformed
        modelo.addRow(new Vector());
    }//GEN-LAST:event_btnAgregarItemsActionPerformed

    private void btnAgregarJuezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarJuezActionPerformed
        String juez = "Juez " + (modelo.getColumnCount() + 1);
        modelo.addColumn(juez);
    }//GEN-LAST:event_btnAgregarJuezActionPerformed

    private void btnVentanaVaikenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentanaVaikenActionPerformed
        VaikenView vaikenView = new VaikenView();
        
        vaikenView.setVisible(true);
    }//GEN-LAST:event_btnVentanaVaikenActionPerformed

    private void btnVentanaVaiken1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentanaVaiken1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentanaVaiken1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormulasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormulasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormulasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormulasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormulasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarItems;
    private javax.swing.JButton btnAgregarJuez;
    private javax.swing.JButton btnCalcularTotales;
    private javax.swing.JButton btnObtenerConcordancia;
    private javax.swing.JButton btnObtenerJueces;
    private javax.swing.JButton btnObtenerPValor;
    private javax.swing.JButton btnObtenerTsi;
    private javax.swing.JButton btnVentanaVaiken;
    private javax.swing.JButton btnVentanaVaiken1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> lstConcordancia;
    private javax.swing.JList<String> lstPValor;
    private javax.swing.JList<String> lstTJueces;
    private javax.swing.JList<String> lstTsi;
    private javax.swing.JTable tblJueces;
    private javax.swing.JTextField txtTotalJueces;
    private javax.swing.JTextField txtTotalTsi;
    // End of variables declaration//GEN-END:variables
}
