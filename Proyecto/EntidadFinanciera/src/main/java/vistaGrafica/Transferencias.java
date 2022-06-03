/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaGrafica;

import controlador.ControladorBD;
import controlador.ControladorCuentasAhorros;
import controlador.ControladorCuentasCorriente;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;

/**
 *
 * @author rafael
 */
public class Transferencias extends javax.swing.JFrame {

    /**
     * Creates new form TransaccionesCli
     */
    Cliente cli;
    ControladorCuentasAhorros contrAho;
    ControladorCuentasCorriente contrCorr;
    ControladorBD contrBD;
    
    public Transferencias(Cliente cli) {
        initComponents();
        
        this.cli = cli;
        contrAho = new ControladorCuentasAhorros();
        contrCorr = new ControladorCuentasCorriente();
        contrBD = new ControladorBD();
        
        // Llenar el combobox con todas las cuentas que tiene el cliente:
        
        for(CuentaAhorros cuenta:contrAho.arregloCuentasAhorros)
            if(cuenta.getIdCliente() == cli.getCedula()){
                jComboBoxOrigen.addItem("Ahorros - "+cuenta.getIdCuentaAhorros());
                jLabelTotal.setText("Disponible: "+cuenta.getSaldoCuentaAhorros()+" $");
                jComboBoxOrigen.setSelectedItem("Ahorros - "+cuenta.getIdCuentaAhorros());
            }
        for(CuentaCorriente cuenta:contrCorr.arregloCuentasCorriente)
            if(cuenta.getIdCliente() == cli.getCedula()){
                jComboBoxOrigen.addItem("Corriente - "+cuenta.getIdCuentaCorriente());
                jLabelTotal.setText("Disponible: "+cuenta.getSaldoCuentaCorriente()+" $");
                jComboBoxOrigen.setSelectedItem("Corriente - "+cuenta.getIdCuentaCorriente());
            }
        
        
        jToggleButton1.addItemListener(new ItemListener(){
 
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                int estado = itemEvent.getStateChange();
                if(estado == ItemEvent.SELECTED){
                    jPasswordField.setEchoChar((char)0);
                } else {
                    jPasswordField.setEchoChar('*');
                }
            }
        });
    
        
        jComboBoxOrigen.addActionListener(new ActionListener() {  
                                            public void actionPerformed(ActionEvent e) {
                                                
                                                double saldo;
                                                saldo = 0;
                                                if(getTipoCuenta().equals("Ahorros - ")){
                                                    CuentaAhorros cuenta = (CuentaAhorros)getSelectedAccount("Ahorros - ");
                                                    saldo = cuenta.getSaldoCuentaAhorros();
                                                }
                                                if(getTipoCuenta().equals("Corriente - ")){
                                                    CuentaCorriente cuenta = (CuentaCorriente)getSelectedAccount("Corriente - ");
                                                    saldo = cuenta.getSaldoCuentaCorriente();
                                                }
                                                
                                                jLabelTotal.setText("Disponible: "+saldo+" $");
                                                
                                            }  
                                            });
        
    
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
        jComboBoxOrigen = new javax.swing.JComboBox<>();
        jTextFieldIdDestino = new javax.swing.JTextField();
        jTextFieldCedulaTitular = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonTransferir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jComboBoxTipoDestino = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldMonto = new javax.swing.JTextField();
        jLabelTotal = new javax.swing.JLabel();

        setTitle("Transferencias");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Número de Cuenta:");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Cedula del Titular:");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Clave Personal:");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Cuenta Origen:");

        jComboBoxOrigen.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jTextFieldIdDestino.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jTextFieldCedulaTitular.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextFieldCedulaTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCedulaTitularActionPerformed(evt);
            }
        });

        jPasswordField.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jButtonTransferir.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButtonTransferir.setText("Transferir");
        jButtonTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransferirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Datos Cuenta Destino");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Tipo de Cuenta:");

        jToggleButton1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jToggleButton1.setText("👁️");

        jComboBoxTipoDestino.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jComboBoxTipoDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahorros", "Corriente" }));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Detalles Transacción");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setText("Monto:");

        jTextFieldMonto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextFieldMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMontoActionPerformed(evt);
            }
        });

        jLabelTotal.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTotal.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldCedulaTitular)
                                    .addComponent(jTextFieldIdDestino)
                                    .addComponent(jComboBoxTipoDestino, 0, 215, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 137, Short.MAX_VALUE)))
                                    .addComponent(jLabelTotal)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButtonTransferir)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxTipoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldIdDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCedulaTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotal)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButtonTransferir)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private String getTipoCuenta(){
        
        String cuenta = (String)jComboBoxOrigen.getSelectedItem(); 
        String tipo = cuenta.replaceAll("[0-9]", "");
        
        return tipo;
    }
    
    
    
    private Object getSelectedAccount(String tipo){
        String cuenta = (String)jComboBoxOrigen.getSelectedItem(); 
        String idCuenta = cuenta.replaceAll("[^0-9]", "");


        if(tipo.equals("Ahorros - ")){
            CuentaAhorros cuentaAho = new CuentaAhorros();
            cuentaAho.setIdCuentaAhorros(idCuenta);

            cuentaAho = (CuentaAhorros)contrAho.consultarUno(cuentaAho);

            return cuentaAho;

            }
        else{
            CuentaCorriente cuentaCorr = new CuentaCorriente();
            cuentaCorr.setIdCuentaCorriente(idCuenta);

            cuentaCorr = (CuentaCorriente)contrCorr.consultarUno(cuentaCorr);

            return cuentaCorr;

        }
    }
    
    
    private void jButtonTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransferirActionPerformed
        
        
        int cedulaTitular = Integer.parseInt(jTextFieldCedulaTitular.getText());
        // Primero se valida que la clave sea correcta
        
        
        String pass = new String(jPasswordField.getPassword());
        
        if(!pass.equals(cli.getContrasena())){
            JOptionPane.showMessageDialog(null, "Clave incorrecta");
            return;
        }
        
        // Ahora se valida que si haya disponible el monto ingresado
        
        float monto = Float.parseFloat(jTextFieldMonto.getText());
        
        float saldo;
        saldo = 0;
        if(getTipoCuenta().equals("Ahorros - ")){
            CuentaAhorros cuenta = (CuentaAhorros)getSelectedAccount("Ahorros - ");
            cuenta.toString();
            saldo = cuenta.getSaldoCuentaAhorros();
        }
        if(getTipoCuenta().equals("Corriente - ")){
            CuentaCorriente cuenta = (CuentaCorriente)getSelectedAccount("Corriente - ");
            cuenta.toString();
            saldo = cuenta.getSaldoCuentaCorriente();
        }
        
        if(monto > saldo){
            JOptionPane.showMessageDialog(null, "No dispone de fondos suficientes para realizar esta transacción. Su saldo es: "+saldo);
            return;
        }
        
        // Ahora validamos que la cuenta destino si exista y en caso de que si le sumamos el monto de la transacción
        
        String tipoDestino = (String)jComboBoxTipoDestino.getSelectedItem();
        String idCuentaDestino = jTextFieldIdDestino.getText();
        
        if(tipoDestino.equals("Ahorros")){
            if(!contrAho.existeCuenta(idCuentaDestino)){
                JOptionPane.showMessageDialog(null, "La cuenta destino no existe");
                return;
            }
            else{
                CuentaAhorros cuenta_destino = new CuentaAhorros();
                cuenta_destino.setIdCuentaAhorros(idCuentaDestino);
                cuenta_destino = (CuentaAhorros)contrAho.consultarUno(cuenta_destino);
                
                if(cedulaTitular != cuenta_destino.getIdCliente()){
                    JOptionPane.showMessageDialog(null, "No se encontró la cuenta destino. Verifique los datos ingresados");
                    return;
                }
                
                CuentaAhorros cuenta_aux = new CuentaAhorros(cuenta_destino);
                cuenta_destino.setSaldoCuentaAhorros(cuenta_destino.getSaldoCuentaAhorros()+monto);
                
                contrAho.modificar(cuenta_aux, cuenta_destino);
                contrBD.modificarCuentaAho(cuenta_destino);
            }     
        }
        if(tipoDestino.equals("Corriente")){
           
            if(!contrCorr.existeCuenta(idCuentaDestino)){
                JOptionPane.showMessageDialog(null, "La cuenta destino no existe");
                return;
            }
            else{
                CuentaCorriente cuenta_destino = new CuentaCorriente();
                cuenta_destino.setIdCuentaCorriente(idCuentaDestino);
                cuenta_destino = (CuentaCorriente)contrCorr.consultarUno(cuenta_destino);
                
                
                if(cedulaTitular != cuenta_destino.getIdCliente()){
                    JOptionPane.showMessageDialog(null, "No se encontró la cuenta destino. Verifique los datos ingresados");
                    return;
                }
                
                CuentaCorriente cuenta_aux = new CuentaCorriente(cuenta_destino);
                
                cuenta_destino.setSaldoCuentaCorriente(cuenta_destino.getSaldoCuentaCorriente() + monto);
                contrCorr.modificar(cuenta_aux, cuenta_destino);
                contrBD.modificarCuentaCorr(cuenta_destino);
            }
        
        }
        
        // Ahora restamos de la cuenta origen
        
        if(getTipoCuenta().equals("Ahorros - ")){
            CuentaAhorros cuenta = (CuentaAhorros)getSelectedAccount("Ahorros - ");
            
            CuentaAhorros cuenta_aux = new CuentaAhorros(cuenta);
            
            cuenta.setSaldoCuentaAhorros(saldo-monto);
            
            contrAho.modificar(cuenta_aux, cuenta);
            contrBD.modificarCuentaAho(cuenta);
            
        }
        if(getTipoCuenta().equals("Corriente - ")){
            CuentaCorriente cuenta = (CuentaCorriente)getSelectedAccount("Corriente - ");
            
            CuentaCorriente cuenta_aux = new CuentaCorriente(cuenta);
            
            cuenta.setSaldoCuentaCorriente(saldo-monto);
            
            contrCorr.modificar(cuenta_aux, cuenta);
            contrBD.modificarCuentaCorr(cuenta);
        }
        
        // Si todo salió bien se imprime mensaje de exito:

        
        JOptionPane.showMessageDialog(null, "Transacción exitosa");
        
    }//GEN-LAST:event_jButtonTransferirActionPerformed

    private void jTextFieldMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMontoActionPerformed

    private void jTextFieldCedulaTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCedulaTitularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCedulaTitularActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Transferencias().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTransferir;
    private javax.swing.JComboBox<String> jComboBoxOrigen;
    private javax.swing.JComboBox<String> jComboBoxTipoDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldCedulaTitular;
    private javax.swing.JTextField jTextFieldIdDestino;
    private javax.swing.JTextField jTextFieldMonto;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
