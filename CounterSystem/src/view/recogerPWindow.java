
package view;

import domain.Counter;
import review.InfoReview;

public class recogerPWindow extends javax.swing.JDialog {

    Counter theSystem;
    String clienteActual;
    
    public recogerPWindow(java.awt.Frame parent, boolean modal, Counter info) {
        super(parent, modal);
        initComponents();
        theSystem = info;
        String cambioD = theSystem.obtenerVenta();
        dolarLbl.setText("$1 / ₡" + cambioD);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        idTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTxt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        facturaTxt = new javax.swing.JTextArea();
        addBtn = new javax.swing.JButton();
        mailTxt = new javax.swing.JTextField();
        retBtn = new javax.swing.JButton();
        rettBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        dolarLbl = new javax.swing.JLabel();
        efectivoBtn = new javax.swing.JButton();
        tarjetaBtn = new javax.swing.JButton();
        tarjetaCmb = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recoger Paquetes");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Consultar Paquetes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        idTxt.setToolTipText("");

        infoTxt.setEditable(false);
        infoTxt.setColumns(20);
        infoTxt.setRows(5);
        jScrollPane1.setViewportView(infoTxt);

        facturaTxt.setEditable(false);
        facturaTxt.setColumns(20);
        facturaTxt.setRows(5);
        jScrollPane2.setViewportView(facturaTxt);

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Agregar Paquete");
        addBtn.setEnabled(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        mailTxt.setToolTipText("");
        mailTxt.setEnabled(false);

        retBtn.setBackground(new java.awt.Color(255, 255, 255));
        retBtn.setText("Retirar Seleccionados");
        retBtn.setEnabled(false);
        retBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retBtnActionPerformed(evt);
            }
        });

        rettBtn.setBackground(new java.awt.Color(255, 255, 255));
        rettBtn.setText("Retirar Todos");
        rettBtn.setEnabled(false);
        rettBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rettBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        dolarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dolarLbl.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(dolarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dolarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        efectivoBtn.setText("Pagar en Efectivo");
        efectivoBtn.setEnabled(false);
        efectivoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efectivoBtnActionPerformed(evt);
            }
        });

        tarjetaBtn.setText("Pagar con Tarjeta");
        tarjetaBtn.setEnabled(false);
        tarjetaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaBtnActionPerformed(evt);
            }
        });

        tarjetaCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MasterCard", "Visa", "American Express" }));
        tarjetaCmb.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addBtn)
                                .addGap(18, 18, 18)
                                .addComponent(retBtn)
                                .addGap(18, 18, 18)
                                .addComponent(rettBtn))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(efectivoBtn)
                        .addGap(18, 18, 18)
                        .addComponent(tarjetaBtn)
                        .addGap(18, 18, 18)
                        .addComponent(tarjetaCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn)
                    .addComponent(retBtn)
                    .addComponent(rettBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efectivoBtn)
                    .addComponent(tarjetaBtn)
                    .addComponent(tarjetaCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
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

    public void desbloquearRetiro(){
        mailTxt.setEnabled(true);
        addBtn.setEnabled(true);
        retBtn.setEnabled(true);
        rettBtn.setEnabled(true);
    }
    
    public void desbloquearPago(){
        efectivoBtn.setEnabled(true);
        tarjetaBtn.setEnabled(true);
        tarjetaCmb.setEnabled(true);
    }
    
    public void bloquearRetiro(){
        mailTxt.setEnabled(false);
        addBtn.setEnabled(false);
        retBtn.setEnabled(false);
        rettBtn.setEnabled(false);
    }    
    
    public void bloquearPago(){
        mailTxt.setText("");
        facturaTxt.setText("");
        efectivoBtn.setEnabled(false);
        tarjetaBtn.setEnabled(false);
        tarjetaCmb.setEnabled(false);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = idTxt.getText();
        
        if((InfoReview.isNumber(id))&&(!InfoReview.fieldIsEmpty(id))){
            if(theSystem.existeCliente(Integer.parseInt(id))){
                String respuesta = theSystem.getInfoRetirables(Integer.parseInt(id));
                infoTxt.setText(respuesta);
                clienteActual = id;
                if(! respuesta.isEmpty()){
                    desbloquearRetiro();
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String idMail = mailTxt.getText();
        if((InfoReview.isNumber(idMail))&&(!InfoReview.fieldIsEmpty(idMail))){
            int idM = Integer.parseInt(idMail);
            if((theSystem.esRetirable(idM))&&(theSystem.seRetira(idM))){
                theSystem.addRetirar(idM);
            }else{
                InfoReview.errorMessage("El objeto ya se eligio para retirar o no existe");
            }
        }else{
            InfoReview.errorMessage("El id debe ser un numero");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void rettBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rettBtnActionPerformed
        String info = theSystem.retirarTodos(Integer.parseInt(clienteActual));
        facturaTxt.setText(info);
        bloquearRetiro();
        desbloquearPago();
    }//GEN-LAST:event_rettBtnActionPerformed

    private void retBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retBtnActionPerformed
        String info = theSystem.retirarElegidos(Integer.parseInt(clienteActual));
        facturaTxt.setText(info);
        bloquearRetiro();
        desbloquearPago();
    }//GEN-LAST:event_retBtnActionPerformed

    private void efectivoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efectivoBtnActionPerformed
        theSystem.retirar();
        bloquearPago();
    }//GEN-LAST:event_efectivoBtnActionPerformed

    private void tarjetaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaBtnActionPerformed
        theSystem.retirar();
        bloquearPago();
    }//GEN-LAST:event_tarjetaBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel dolarLbl;
    private javax.swing.JButton efectivoBtn;
    private javax.swing.JTextArea facturaTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JTextArea infoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JButton retBtn;
    private javax.swing.JButton rettBtn;
    private javax.swing.JButton tarjetaBtn;
    private javax.swing.JComboBox tarjetaCmb;
    // End of variables declaration//GEN-END:variables
}
