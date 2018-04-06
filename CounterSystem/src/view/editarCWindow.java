
package view;

import domain.Counter;
import review.InfoReview;

public class editarCWindow extends javax.swing.JDialog {

    Counter theSystem;
    String clienteActual;
    
    public editarCWindow(java.awt.Frame parent, boolean modal, Counter info) {
        super(parent, modal);
        initComponents();
        theSystem = info;
        bloquearEspacios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        ediBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        correoTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        teleTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dirTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sexoCmb = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        fechaTxt = new javax.swing.JTextField();
        diaCmb = new javax.swing.JComboBox();
        mesCmb = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Cliente");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel2.setText("Id");

        ediBtn.setBackground(new java.awt.Color(255, 255, 255));
        ediBtn.setText("Editar");
        ediBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ediBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel5.setText("@gmail.com");

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel6.setText("Telefono");

        jLabel7.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel7.setText("Direccion");

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel8.setText("Sexo");

        sexoCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));

        jLabel9.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabel9.setText("Fecha");

        buscarBtn.setBackground(new java.awt.Color(255, 255, 255));
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        diaCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mesCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel5))
                                        .addComponent(nombreTxt)
                                        .addComponent(teleTxt)
                                        .addComponent(dirTxt)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(diaCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(mesCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(fechaTxt))
                                        .addComponent(sexoCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addComponent(ediBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buscarBtn)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(teleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dirTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sexoCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(diaCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mesCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(fechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(ediBtn)
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

    private void ediBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ediBtnActionPerformed
        String nombre, correo, telefono, direccion, fecha;
        int sexo, dia, mes;
        nombre = nombreTxt.getText();
        correo = correoTxt.getText();
        telefono = teleTxt.getText();
        direccion = dirTxt.getText();
        fecha = fechaTxt.getText();
        sexo = sexoCmb.getSelectedIndex();
        dia = diaCmb.getSelectedIndex()+1;
        mes = mesCmb.getSelectedIndex()+1;
        if((!InfoReview.fieldIsEmpty(nombre))&&(!InfoReview.fieldIsEmpty(correo))&&(!InfoReview.fieldIsEmpty(telefono))
                &&(!InfoReview.fieldIsEmpty(direccion))&&(!InfoReview.fieldIsEmpty(fecha))){
            if(InfoReview.validDate(dia, mes, fecha)){
                if(InfoReview.isTelephone(telefono)){
                    if(InfoReview.isNumber(fecha)){
                        int ID = Integer.parseInt(clienteActual);
                        fecha = fecha + "-" + String.valueOf(mes) + "-" + String.valueOf(dia);
                        theSystem.editarCliente(ID, nombre, correo, telefono, direccion, sexo, fecha);
                        this.dispose();
                    }else{
                        InfoReview.errorMessage("El anno deben estar conformados de numeros");
                    }
                }else{
                    InfoReview.errorMessage("Numero de telefono debe estar conformado de 8 digitos");
                }
            }else{
                InfoReview.errorMessage("Datos en la fecha incorrectos");
            }
        }else{
            InfoReview.errorMessage("Debe llenar todos los espacios");
        }
    }//GEN-LAST:event_ediBtnActionPerformed

    private void bloquearEspacios(){
        nombreTxt.setEnabled(false);
        correoTxt.setEnabled(false);
        teleTxt.setEnabled(false);
        dirTxt.setEnabled(false);
        fechaTxt.setEnabled(false);
        ediBtn.setEnabled(false);
    }
    
    private void desbloquearEspacios(){
        nombreTxt.setEnabled(true);
        correoTxt.setEnabled(true);
        teleTxt.setEnabled(true);
        dirTxt.setEnabled(true);
        fechaTxt.setEnabled(true);
        ediBtn.setEnabled(true);
    }
    
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        String id = idTxt.getText();
        int dia, mes;
        if((!InfoReview.fieldIsEmpty(id))&&(InfoReview.isNumber(id))){
            int ID = Integer.parseInt(id);
            if(theSystem.existeCliente(ID)){
                clienteActual = id;
                String[] datos = theSystem.infoCliente2(ID);
                desbloquearEspacios();
                nombreTxt.setText(datos[1]);
                correoTxt.setText(datos[2]);
                teleTxt.setText(datos[3]);
                dirTxt.setText(datos[4]);
                String[] fecha = datos[6].split("-");
                fechaTxt.setText(fecha[2]);
                dia = Integer.parseInt(fecha[0])-1;
                mes = Integer.parseInt(fecha[1])-1;
                if(datos[5].equals("Femenino")){
                    sexoCmb.setSelectedIndex(1);
                }
                diaCmb.setSelectedIndex(dia);
                mesCmb.setSelectedIndex(mes);
            }
        }
        
    }//GEN-LAST:event_buscarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JComboBox diaCmb;
    private javax.swing.JTextField dirTxt;
    private javax.swing.JButton ediBtn;
    private javax.swing.JTextField fechaTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox mesCmb;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JComboBox sexoCmb;
    private javax.swing.JTextField teleTxt;
    // End of variables declaration//GEN-END:variables
}
