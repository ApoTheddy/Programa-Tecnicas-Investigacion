package views;

import Formulas.Forms;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class CronbachView extends javax.swing.JDialog {

    Vector<String> cabeceras = new Vector<>();
    Vector<Vector<String>> informacion = new Vector<>();
    DefaultTableModel modeloItems;
    DefaultTableModel modeloSi;
    DefaultListModel<String> listaJueces = new DefaultListModel();
    DefaultListModel<String> listaSuma = new DefaultListModel();
    DefaultListModel<String> listaNxC = new DefaultListModel();
    DefaultListModel<String> listaVaiken = new DefaultListModel();
    DefaultListModel<String> listaValidez = new DefaultListModel();
    Forms forms = new Forms();
    DecimalFormat df = new DecimalFormat("#0.0000");

    public CronbachView() {
        super(new JFrame(), false);
        initComponents();

        modeloSi = new DefaultTableModel();
        tblSi.setModel(modeloSi);

        modeloItems = new DefaultTableModel(informacion, cabeceras);
        tblJueces1.setModel(modeloItems);

        lstSuma1.setModel(listaSuma);
        lstTJueces1.setModel(listaJueces);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnObtenerSi = new javax.swing.JButton();
        txtTotalSumatoriaDividida = new javax.swing.JTextField();
        btnCalcularTotales1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        lstSuma1 = new javax.swing.JList<>();
        btnObtenerVaiken1 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblJueces1 = new javax.swing.JTable();
        btnAgregarJuez1 = new javax.swing.JButton();
        btnAgregarItems1 = new javax.swing.JButton();
        btnObtenerJueces1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnObtenerSuma1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblSi = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        lstTJueces1 = new javax.swing.JList<>();
        txtTotalSuma2 = new javax.swing.JTextField();
        txtTotalSi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTotalK = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtAlfaCronbach = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnObtenerSi.setText("Obtener Si^2");
        btnObtenerSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerSiActionPerformed(evt);
            }
        });

        txtTotalSumatoriaDividida.setEditable(false);
        txtTotalSumatoriaDividida.setText("----------");

        btnCalcularTotales1.setText("Calcular");
        btnCalcularTotales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTotales1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Si^2");

        jLabel9.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Suma");

        lstSuma1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane9.setViewportView(lstSuma1);

        btnObtenerVaiken1.setText("Obtener Vaiken");
        btnObtenerVaiken1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerVaiken1ActionPerformed(evt);
            }
        });

        tblJueces1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(tblJueces1);

        btnAgregarJuez1.setText("Agregar Juez");
        btnAgregarJuez1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarJuez1ActionPerformed(evt);
            }
        });

        btnAgregarItems1.setText("Agregar Items");
        btnAgregarItems1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarItems1ActionPerformed(evt);
            }
        });

        btnObtenerJueces1.setText("Obtener T Jueces");
        btnObtenerJueces1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerJueces1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("1 - (Zsi^2)/S^2");

        btnObtenerSuma1.setText("Obtener Suma");
        btnObtenerSuma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerSuma1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("TOTAL");

        tblSi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tblSi);

        jLabel13.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("T Items(K)");

        lstTJueces1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane13.setViewportView(lstTJueces1);

        txtTotalSuma2.setEditable(false);
        txtTotalSuma2.setText("-----------------");

        txtTotalSi.setEditable(false);
        txtTotalSi.setText("--------------");

        jLabel14.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("K / K - 1");

        txtTotalK.setEditable(false);
        txtTotalK.setText("----------");

        jLabel15.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("cronbach");

        txtAlfaCronbach.setEditable(false);
        txtAlfaCronbach.setText("--------------");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                            .addComponent(jScrollPane7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtTotalSuma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAlfaCronbach, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel15)))
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTotalSumatoriaDividida, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(txtTotalK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addGap(11, 11, 11))))
                                        .addGap(44, 44, 44))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAgregarJuez1)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregarItems1)
                                .addGap(18, 18, 18)
                                .addComponent(btnObtenerJueces1)
                                .addGap(18, 18, 18)
                                .addComponent(btnObtenerSuma1)
                                .addGap(22, 22, 22)
                                .addComponent(btnObtenerSi)
                                .addGap(22, 22, 22)
                                .addComponent(btnObtenerVaiken1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(386, 386, 386)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTotalSi)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCalcularTotales1)))))
                        .addGap(37, 37, 37))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAgregarJuez1)
                                    .addComponent(btnAgregarItems1)
                                    .addComponent(btnObtenerJueces1)
                                    .addComponent(btnObtenerSuma1)
                                    .addComponent(btnObtenerSi)
                                    .addComponent(btnObtenerVaiken1))
                                .addGap(13, 13, 13)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(btnCalcularTotales1))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotalK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalSumatoriaDividida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAlfaCronbach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(txtTotalSuma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnObtenerSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerSiActionPerformed
        modeloSi.setDataVector(new Vector<>(), new Vector());

        double sumaSi[] = new double[modeloItems.getRowCount()];

        for (int i = 0; i < modeloItems.getColumnCount(); ++i) {
            for (int j = 0; j < modeloItems.getRowCount(); ++j) {
                sumaSi[j] = Integer.parseInt(modeloItems.getValueAt(j, i).toString());
            }
            modeloSi.addColumn(forms.varS(sumaSi));
        }

    }//GEN-LAST:event_btnObtenerSiActionPerformed


    private void btnCalcularTotales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTotales1ActionPerformed
        double totalSuma[] = new double[listaSuma.getSize()];
        double totalSi = 0;
        double totalSumatoriaDividida = 0;
        double totalK = Double.parseDouble(listaJueces.get(0)) / (Double.parseDouble(listaJueces.get(0)) - 1);

        for (int i = 0; i < listaSuma.getSize(); ++i) {
            totalSuma[i] = Double.parseDouble(listaSuma.get(i));
        }

        for (int i = 0; i < modeloSi.getColumnCount(); ++i) {
            totalSi += Double.parseDouble(modeloSi.getColumnName(i));
        }

        totalSumatoriaDividida = 1 - totalSi / forms.varS(totalSuma);

        txtTotalSuma2.setText(df.format(Math.abs(forms.varS(totalSuma))));
        txtTotalSumatoriaDividida.setText(df.format(Math.abs(totalSumatoriaDividida)));
        txtTotalK.setText(df.format(Math.abs(totalK)));
        txtTotalSi.setText(df.format(Math.abs(totalSi)));
        System.out.println(totalK);
        txtAlfaCronbach.setText(df.format(Math.abs(forms.cronbach(totalSumatoriaDividida,totalK))));
    }//GEN-LAST:event_btnCalcularTotales1ActionPerformed

    private void btnObtenerVaiken1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerVaiken1ActionPerformed
        for (int i = 0; i < modeloItems.getRowCount(); ++i) {
            String validez = "";
            double vaiken = forms.vaiken(listaSuma.get(i), listaNxC.get(i));
            listaVaiken.addElement("" + Double.parseDouble(df.format(Math.abs(vaiken))));

            if (vaiken <= .53) {
                validez = "Validez nula";
            } else if (vaiken >= .54 && vaiken <= .59) {
                validez = "Validez baja";
            } else if (vaiken >= .60 && vaiken <= .65) {
                validez = "Valida";
            } else if (vaiken >= .66 && vaiken <= .71) {
                validez = "Muy valida";
            } else if (vaiken >= .71 && vaiken <= 0.99) {
                validez = "Excelente validez";
            } else {
                validez = "Validez perfecta";
            }

            listaValidez.addElement(validez);
        }
    }//GEN-LAST:event_btnObtenerVaiken1ActionPerformed

    private void btnAgregarJuez1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarJuez1ActionPerformed
        String juez = "Juez " + (modeloItems.getColumnCount() + 1);
        modeloItems.addColumn(juez);
    }//GEN-LAST:event_btnAgregarJuez1ActionPerformed

    private void btnAgregarItems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarItems1ActionPerformed
        modeloItems.addRow(new Vector());
    }//GEN-LAST:event_btnAgregarItems1ActionPerformed

    private void btnObtenerJueces1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerJueces1ActionPerformed
        listaJueces.removeAllElements();
        for (int i = 0; i < modeloItems.getRowCount(); ++i) {
            listaJueces.addElement("" + modeloItems.getColumnCount());
        }
    }//GEN-LAST:event_btnObtenerJueces1ActionPerformed

    private void btnObtenerSuma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerSuma1ActionPerformed
        listaSuma.removeAllElements();

        for (int i = 0; i < modeloItems.getRowCount(); ++i) {
            int totalSuma = 0;
            for (int j = 0; j < modeloItems.getColumnCount(); ++j) {
                totalSuma += Integer.parseInt(modeloItems.getValueAt(i, j).toString());
            }
            listaSuma.addElement("" + totalSuma);
        }

    }//GEN-LAST:event_btnObtenerSuma1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CronbachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            CronbachView dialog = new CronbachView();
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarItems;
    private javax.swing.JButton btnAgregarItems1;
    private javax.swing.JButton btnAgregarJuez;
    private javax.swing.JButton btnAgregarJuez1;
    private javax.swing.JButton btnCalcularTotales;
    private javax.swing.JButton btnCalcularTotales1;
    private javax.swing.JButton btnObtenerJueces;
    private javax.swing.JButton btnObtenerJueces1;
    private javax.swing.JButton btnObtenerNxC;
    private javax.swing.JButton btnObtenerSi;
    private javax.swing.JButton btnObtenerSuma;
    private javax.swing.JButton btnObtenerSuma1;
    private javax.swing.JButton btnObtenerVaiken;
    private javax.swing.JButton btnObtenerVaiken1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JList<String> lstNxC;
    private javax.swing.JList<String> lstSuma;
    private javax.swing.JList<String> lstSuma1;
    private javax.swing.JList<String> lstTJueces;
    private javax.swing.JList<String> lstTJueces1;
    private javax.swing.JList<String> lstVaiken;
    private javax.swing.JList<String> lstValidez;
    private javax.swing.JTable tblJueces;
    private javax.swing.JTable tblJueces1;
    private javax.swing.JTable tblSi;
    private javax.swing.JTextField txtAlfaCronbach;
    private javax.swing.JTextField txtNumRespuestas;
    private javax.swing.JTextField txtTotalJueces;
    private javax.swing.JTextField txtTotalK;
    private javax.swing.JTextField txtTotalSi;
    private javax.swing.JTextField txtTotalSuma;
    private javax.swing.JTextField txtTotalSuma2;
    private javax.swing.JTextField txtTotalSumatoriaDividida;
    // End of variables declaration//GEN-END:variables
}
