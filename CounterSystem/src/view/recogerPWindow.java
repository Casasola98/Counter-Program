
package view;

import domain.Counter;
import review.InfoReview;

public class recogerPWindow extends javax.swing.JDialog {

    Counter theSystem;
    
    public recogerPWindow(java.awt.Frame parent, boolean modal, Counter info) {
        super(parent, modal);
        initComponents();
        theSystem = info;
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
        facturaTxt.setEnabled(false);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mailTxt)
                        .addGap(18, 18, 18)
                        .addComponent(addBtn)
                        .addGap(18, 18, 18)
                        .addComponent(retBtn)
                        .addGap(18, 18, 18)
                        .addComponent(rettBtn))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(162, 162, 162))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
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

    public void desbloquearBotones(){
        mailTxt.setEnabled(true);
        addBtn.setEnabled(true);
        retBtn.setEnabled(true);
        rettBtn.setEnabled(true);
    }
    
    public void bloquearBotones(){
        mailTxt.setEnabled(false);
        addBtn.setEnabled(false);
        retBtn.setEnabled(false);
        rettBtn.setEnabled(false);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = idTxt.getText();
        
        if((InfoReview.isNumber(id))&&(!InfoReview.fieldIsEmpty(id))){
            if(theSystem.existeCliente(Integer.parseInt(id))){
                String respuesta = theSystem.getInfoRetirables(Integer.parseInt(id));
                infoTxt.setText(respuesta);
                if(! respuesta.isEmpty()){
                    desbloquearBotones();
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String idMail = mailTxt.getText();
        if((InfoReview.isNumber(idMail))&&(!InfoReview.fieldIsEmpty(idMail))){
            int idM = Integer.parseInt(idMail);
            if((theSystem.esRetirable(idM))&&(! theSystem.seRetira(idM))){
                theSystem.addRetirar(idM);
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void rettBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rettBtnActionPerformed
        String info = theSystem.retirarTodos();
        facturaTxt.setText(info);
    }//GEN-LAST:event_rettBtnActionPerformed

    private void retBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retBtnActionPerformed
        String info = theSystem.retirarElegidos();
        facturaTxt.setText(info);
    }//GEN-LAST:event_retBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextArea facturaTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JTextArea infoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JButton retBtn;
    private javax.swing.JButton rettBtn;
    // End of variables declaration//GEN-END:variables
}
