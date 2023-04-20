package views;

import Formulas.Forms;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VaikenView extends javax.swing.JDialog {
    
    Vector<String> cabeceras = new Vector<>();
    Vector<Vector<String>> informacion = new Vector<>();
    DefaultTableModel modelo;
    DefaultListModel<String> listaJueces = new DefaultListModel();
    DefaultListModel<String> listaSuma = new DefaultListModel();
    DefaultListModel<String> listaNxC = new DefaultListModel();
    DefaultListModel<String> listaVaiken = new DefaultListModel();
    DefaultListModel<String> listaValidez = new DefaultListModel();
    Forms forms = new Forms();
    DecimalFormat df = new DecimalFormat("#0.000");
    
    public VaikenView() {
        
        super(new JFrame(), false);
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        modelo = new DefaultTableModel(informacion, cabeceras);
        tblJueces.setModel(modelo);
        lstTJueces.setModel(listaJueces);
        lstSuma.setModel(listaSuma);
        lstNxC.setModel(listaNxC);
        lstVaiken.setModel(listaVaiken);
        lstValidez.setModel(listaValidez);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnObtenerNxC = new javax.swing.JButton();
        txtTotalJueces = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTJueces = new javax.swing.JList<>();
        txtTotalSuma = new javax.swing.JTextField();
        btnCalcularTotales = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstVaiken = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstSuma = new javax.swing.JList<>();
        btnObtenerVaiken = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstNxC = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJueces = new javax.swing.JTable();
        btnAgregarJuez = new javax.swing.JButton();
        btnAgregarItems = new javax.swing.JButton();
        btnObtenerJueces = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnObtenerSuma = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNumRespuestas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstValidez = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnObtenerNxC.setText("Obtener n*(c-1)");
        btnObtenerNxC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerNxCActionPerformed(evt);
            }
        });

        txtTotalJueces.setEditable(false);
        txtTotalJueces.setText("-----");

        lstTJueces.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstTJueces);

        txtTotalSuma.setEditable(false);
        txtTotalSuma.setText("-----");

        btnCalcularTotales.setText("Calcular");
        btnCalcularTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTotalesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("T Jueces");

        jLabel5.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Vaiken");

        jLabel2.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Suma");

        lstVaiken.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(lstVaiken);

        lstSuma.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstSuma);

        btnObtenerVaiken.setText("Obtener Vaiken");
        btnObtenerVaiken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerVaikenActionPerformed(evt);
            }
        });

        lstNxC.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstNxC);

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

        jLabel3.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("n*(c-1)");

        btnObtenerSuma.setText("Obtener Suma");
        btnObtenerSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerSumaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TOTAL");

        txtNumRespuestas.setBackground(new java.awt.Color(255, 255, 255));
        txtNumRespuestas.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txtNumRespuestas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero de Respuestas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Validez");

        lstValidez.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(lstValidez);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarJuez)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarItems)
                        .addGap(18, 18, 18)
                        .addComponent(btnObtenerJueces)
                        .addGap(18, 18, 18)
                        .addComponent(btnObtenerSuma)
                        .addGap(22, 22, 22)
                        .addComponent(btnObtenerNxC)
                        .addGap(22, 22, 22)
                        .addComponent(btnObtenerVaiken))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNumRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(451, 451, 451)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalcularTotales))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTotalJueces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotalSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(81, 81, 81)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarJuez)
                            .addComponent(btnAgregarItems)
                            .addComponent(btnObtenerJueces)
                            .addComponent(btnObtenerSuma)
                            .addComponent(btnObtenerNxC)
                            .addComponent(btnObtenerVaiken))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTotalJueces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcularTotales)
                    .addComponent(txtNumRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnObtenerNxCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerNxCActionPerformed
        
        if (!txtNumRespuestas.getText().isEmpty()) {
            listaNxC.removeAllElements();
            for (int i = 0; i < modelo.getRowCount(); ++i) {
                int numJueces = modelo.getColumnCount();
                int numRespuestas = Integer.parseInt(txtNumRespuestas.getText());
                
                listaNxC.addElement("" + (numJueces * (numRespuestas - 1)));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el numero de respuestas");
        }
    }//GEN-LAST:event_btnObtenerNxCActionPerformed

    private void btnCalcularTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTotalesActionPerformed
        int totalJueces = 0;
        int totalSuma = 0;
        
        for (int i = 0; i < listaJueces.getSize(); ++i) {
            totalJueces += Integer.parseInt(listaJueces.get(i));
            totalSuma += Integer.parseInt(listaSuma.get(i));
        }
        
        txtTotalJueces.setText("" + totalJueces);
        txtTotalSuma.setText("" + totalSuma);

    }//GEN-LAST:event_btnCalcularTotalesActionPerformed

    private void btnObtenerVaikenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerVaikenActionPerformed
        for (int i = 0; i < modelo.getRowCount(); ++i) {
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

    }//GEN-LAST:event_btnObtenerVaikenActionPerformed

    private void btnAgregarJuezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarJuezActionPerformed
        String juez = "Juez " + (modelo.getColumnCount() + 1);
        modelo.addColumn(juez);
    }//GEN-LAST:event_btnAgregarJuezActionPerformed

    private void btnAgregarItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarItemsActionPerformed
        modelo.addRow(new Vector());
    }//GEN-LAST:event_btnAgregarItemsActionPerformed

    private void btnObtenerJuecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerJuecesActionPerformed
        listaJueces.removeAllElements();
        for (int i = 0; i < modelo.getRowCount(); ++i) {
            listaJueces.addElement("" + modelo.getColumnCount());
        }
    }//GEN-LAST:event_btnObtenerJuecesActionPerformed

    private void btnObtenerSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerSumaActionPerformed
        listaSuma.removeAllElements();
        for (int i = 0; i < modelo.getRowCount(); ++i) {
            int suma = 0;
            for (int j = 0; j < modelo.getColumnCount(); ++j) {
                suma += Integer.parseInt(modelo.getValueAt(i, j).toString());
            }
            listaSuma.addElement("" + suma);
        }
    }//GEN-LAST:event_btnObtenerSumaActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VaikenView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VaikenView dialog = new VaikenView();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarItems;
    private javax.swing.JButton btnAgregarJuez;
    private javax.swing.JButton btnCalcularTotales;
    private javax.swing.JButton btnObtenerJueces;
    private javax.swing.JButton btnObtenerNxC;
    private javax.swing.JButton btnObtenerSuma;
    private javax.swing.JButton btnObtenerVaiken;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList<String> lstNxC;
    private javax.swing.JList<String> lstSuma;
    private javax.swing.JList<String> lstTJueces;
    private javax.swing.JList<String> lstVaiken;
    private javax.swing.JList<String> lstValidez;
    private javax.swing.JTable tblJueces;
    private javax.swing.JTextField txtNumRespuestas;
    private javax.swing.JTextField txtTotalJueces;
    private javax.swing.JTextField txtTotalSuma;
    // End of variables declaration//GEN-END:variables
}
