
package view;

import domain.Counter;
import review.InfoReview;

public class agregarSWindow extends javax.swing.JDialog {

    Counter theSystem;
    
    public agregarSWindow(java.awt.Frame parent, boolean modal, Counter info) {
        super(parent, modal);
        initComponents();
        theSystem = info;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        remTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        desTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pesoTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        empCmb = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        tipoCmb = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        descTxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Sobre");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel3.setText("Remitente");

        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel4.setText("Destinatario");

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel6.setText("Descripcion");

        jLabel7.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel7.setText("Peso");

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel8.setText("Empaque");

        empCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Documento", "Otro" }));

        jLabel9.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel9.setText("Tipo");

        tipoCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aereo", "Manila" }));

        descTxt.setColumns(20);
        descTxt.setRows(5);
        jScrollPane1.setViewportView(descTxt);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(desTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addComponent(remTxt, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(pesoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tipoCmb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empCmb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(remTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(desTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String remitente, destinatario, descripcion, peso;
        int empaque, tipo;
        remitente = remTxt.getText();
        destinatario = desTxt.getText();
        descripcion = descTxt.getText();
        peso = pesoTxt.getText();
        empaque = empCmb.getSelectedIndex();
        tipo = tipoCmb.getSelectedIndex();
        if((!InfoReview.fieldIsEmpty(remitente))&&(!InfoReview.fieldIsEmpty(destinatario))
            &&(!InfoReview.fieldIsEmpty(descripcion))&&(!InfoReview.fieldIsEmpty(peso))){
            if((InfoReview.isNumber(remitente))&&(InfoReview.isNumber(destinatario))&&(InfoReview.isNumber(peso))){
                if((theSystem.existeCliente(Integer.parseInt(remitente)))&&(theSystem.existeCliente(Integer.parseInt(destinatario)))){
                    if(!remitente.equals(destinatario)){
                        int envia = Integer.parseInt(remitente);
                        int recibe = Integer.parseInt(destinatario);
                        int pesoT = Integer.parseInt(peso);
                        String mensaje = theSystem.agregarSobre(envia, recibe, descripcion, pesoT, empaque, tipo);
                        InfoReview.infoMessage(mensaje);
                    }else{
                        InfoReview.errorMessage("El destinatario y el remitente no pueden ser la misma persona");
                    }
                }else{
                    InfoReview.errorMessage("Usuario no existente");
                }
            }else{
                InfoReview.errorMessage("Los usuarios y el peso deben estar conformados de numeros");
            }
            
        }else{
            InfoReview.errorMessage("Debe llenar todos los espacios");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField desTxt;
    private javax.swing.JTextArea descTxt;
    private javax.swing.JComboBox empCmb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesoTxt;
    private javax.swing.JTextField remTxt;
    private javax.swing.JComboBox tipoCmb;
    // End of variables declaration//GEN-END:variables
}
