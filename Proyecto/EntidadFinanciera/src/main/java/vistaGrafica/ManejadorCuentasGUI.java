/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaGrafica;


import controlador.ControladorBD;
import controlador.ControladorClientes;
import controlador.ControladorCuentasCorriente;
import controlador.ControladorCuentasAhorros;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Administrador;
import modelo.Cajero;
import modelo.Cliente;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;
import modelo.Usuario;

/**
 *
 * @author rafael
 */
public class ManejadorCuentasGUI extends javax.swing.JFrame {

    /**
     * Creates new form CuentasCorrienteGUI
     */
    
    private ControladorCuentasCorriente contrCuentasCorriente;
    private ControladorCuentasAhorros contrCuentasAhorros;
    ControladorClientes contrCli;
    ControladorBD contrBD;
    
    
    static DefaultTableModel model;
    Object rowData[];
    
    Usuario usu;
    public ManejadorCuentasGUI(Usuario usu) {
        initComponents();
        contrCuentasCorriente = new ControladorCuentasCorriente();
        contrCuentasAhorros = new ControladorCuentasAhorros();
        contrCli = new ControladorClientes();
        contrBD = new ControladorBD();
        
        model = (DefaultTableModel)jTableCuentasCorriente.getModel();
        rowData = new Object [3];
        
        // Llenar el controlador de acuerdo a la base de datos:
        
        
        // Llenar la tabla con los datos del controlador:
        for(CuentaAhorros cuentaAhorros:contrCuentasAhorros.arregloCuentasAhorros){
            rowData[0] = cuentaAhorros.getIdCliente();
            rowData[1] = cuentaAhorros.getIdCuentaAhorros();
            rowData[2] = cuentaAhorros.getSaldoCuentaAhorros();
            model.addRow(rowData);
        }
        
        
        for (Cliente c:ControladorClientes.arregloClientes)
            jComboBoxIdTitular.addItem(Integer.toString(c.getCedula()));
        
        
        
        this.usu = usu;
        
        
        Cajero caj = new Cajero();
        
        if(caj.getClass() == usu.getClass()){
            // Se esconde el botón de borrar:
            jButtonBorrar.setVisible(false);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextIdCuenta = new javax.swing.JTextField();
        jTextSaldoCuenta = new javax.swing.JTextField();
        jButtonInsertar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCuentasCorriente = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxTipoCuenta = new javax.swing.JComboBox<>();
        jComboBoxIdTitular = new javax.swing.JComboBox<>();
        jLabelTipoCuenta = new javax.swing.JLabel();
        jButtonOrdenar = new javax.swing.JButton();

        setTitle("Manejador de Cuentas");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Administrar las Cuentas");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Identificador de la Cuenta");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Saldo de la Cuenta");

        jButtonInsertar.setText("Insertar");
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar Todas");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jTableCuentasCorriente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Titular", "Id Cuenta", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCuentasCorriente);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Cedula del Titular");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Tipo de Cuenta");

        jComboBoxTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahorros", "Corriente" }));
        jComboBoxTipoCuenta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxTipoCuentaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBoxTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoCuentaActionPerformed(evt);
            }
        });

        jLabelTipoCuenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelTipoCuenta.setText("Cuentas Ahorros");

        jButtonOrdenar.setText("Ordenar");
        jButtonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jComboBoxTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxIdTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextIdCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonOrdenar)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonBorrar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTipoCuenta)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonInsertar)
                                .addGap(40, 40, 40)
                                .addComponent(jButtonConsultar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jTextSaldoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxIdTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextIdCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextSaldoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertar)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonOrdenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabelTipoCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        // TODO add your handling code here:
        String tipo = (String)jComboBoxTipoCuenta.getSelectedItem();
        
        CuentaCorriente cuentaCorriente = new CuentaCorriente();
        CuentaAhorros cuentaAhorros = new CuentaAhorros();
        if(tipo.equals("Corriente")){
            cuentaCorriente.setIdCliente(Integer.parseInt((String)jComboBoxIdTitular.getSelectedItem()));
            cuentaCorriente.setIdCuentaCorriente(jTextIdCuenta.getText());
            cuentaCorriente.setSaldoCuentaCorriente(Float.parseFloat(jTextSaldoCuenta.getText()));
            if(contrCli.existeCliente(Integer.parseInt((String)jComboBoxIdTitular.getSelectedItem())))
            {
            if(!contrCuentasCorriente.insertar(cuentaCorriente))
                JOptionPane.showMessageDialog(null, "Error al crear cuenta (Posible repetida)");
            else{
                contrBD.insertarCuentaCorr(cuentaCorriente);
            }
            }
            else
                JOptionPane.showMessageDialog(null, "El cliente no existe en el sistema, debe crearlo primero.");
        }
        else{ 
            cuentaAhorros.setIdCliente(Integer.parseInt((String)jComboBoxIdTitular.getSelectedItem()));
            cuentaAhorros.setIdCuentaAhorros(jTextIdCuenta.getText());
            cuentaAhorros.setSaldoCuentaAhorros(Float.parseFloat(jTextSaldoCuenta.getText()));
        
            if(contrCli.existeCliente(Integer.parseInt((String)jComboBoxIdTitular.getSelectedItem())))
            {
            if(!contrCuentasAhorros.insertar(cuentaAhorros))
                JOptionPane.showMessageDialog(null, "Error al crear cuenta (Posible repetida)");
            else
            {
                rowData[0] = cuentaAhorros.getIdCliente();
                rowData[1] = cuentaAhorros.getIdCuentaAhorros();
                rowData[2] = cuentaAhorros.getSaldoCuentaAhorros();
                model.addRow(rowData);
                contrBD.insertarCuentaAho(cuentaAhorros);
                
            }
            }
            else
                JOptionPane.showMessageDialog(null, "El cliente no existe en el sistema, debe crearlo primero.");
        }
        
        
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void vaciarTablas(){
        model.setRowCount(0);
    }
    
    private void llenarTablas(){
        String tipo = (String)jComboBoxTipoCuenta.getSelectedItem();
        if(tipo.equals("Ahorros")){
            contrCuentasAhorros.consultarTodos();
            for(CuentaAhorros cuentaAhorros:contrCuentasAhorros.arregloCuentasAhorros){
                rowData[0] = cuentaAhorros.getIdCliente();
                rowData[1] = cuentaAhorros.getIdCuentaAhorros();
                rowData[2] = cuentaAhorros.getSaldoCuentaAhorros();
                model.addRow(rowData);
            }
        }
        else{
            contrCuentasCorriente.consultarTodos();
            for(CuentaCorriente cuenta:contrCuentasCorriente.arregloCuentasCorriente){
                rowData[0] = cuenta.getIdCliente();
                rowData[1] = cuenta.getIdCuentaCorriente();
                rowData[2] = cuenta.getSaldoCuentaCorriente();
                model.addRow(rowData);
            }
        
        }
    }
    
    private void actualizarTablas(){
        vaciarTablas();
        llenarTablas();
    }
    
    
    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        jLabelTipoCuenta.setText("Cuentas "+jComboBoxTipoCuenta.getSelectedItem());
       actualizarTablas(); 
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jComboBoxTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoCuentaActionPerformed

    private void jComboBoxTipoCuentaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxTipoCuentaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoCuentaAncestorAdded

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // TODO add your handling code here:
        
        String tipo = (String)jComboBoxTipoCuenta.getSelectedItem();
        int row = jTableCuentasCorriente.getSelectedRow();
        String idCuenta = jTableCuentasCorriente.getModel().getValueAt(row, 1).toString();
        
        
        if (tipo.equals("Corriente"))
        {
            CuentaCorriente cuenta = new CuentaCorriente();
            cuenta.setIdCuentaCorriente(idCuenta);
            if(!contrCuentasCorriente.borrar(cuenta)) // Eliminar del controlador
            {
                JOptionPane.showMessageDialog(null, "No ha sido posible eliminar la cuenta");
            }else{
                contrBD.eliminarCuentaCorr(cuenta);  // Eliminar de la base de datos
                model.removeRow(row);
                JOptionPane.showMessageDialog(null, "La cuenta corriente con id "+idCuenta+" ha sido eliminada");
            }
        }
        else{
            CuentaAhorros cuenta = new CuentaAhorros();
            cuenta.setIdCuentaAhorros(idCuenta);
            if(!contrCuentasAhorros.borrar(cuenta)) // Eliminar del controlador
            {
                JOptionPane.showMessageDialog(null, "No ha sido posible eliminar la cuenta");
            }else{
                contrBD.eliminarCuentaAho(cuenta);  // Eliminar de la base de datos
                model.removeRow(row);
                JOptionPane.showMessageDialog(null, "La cuenta de ahorros con id "+idCuenta+" ha sido eliminada");
            }
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarActionPerformed
        // TODO add your handling code here:
        
        if(jComboBoxTipoCuenta.equals("Ahorros")){
            contrCuentasAhorros.ordenar();
        }
        else{
            contrCuentasCorriente.ordenar();
        }
        
        actualizarTablas();
        
    }//GEN-LAST:event_jButtonOrdenarActionPerformed

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
//            java.util.logging.Logger.getLogger(CuentasCorrienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CuentasCorrienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CuentasCorrienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CuentasCorrienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CuentasCorrienteGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JButton jButtonOrdenar;
    private javax.swing.JComboBox<String> jComboBoxIdTitular;
    private javax.swing.JComboBox<String> jComboBoxTipoCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTipoCuenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCuentasCorriente;
    private javax.swing.JTextField jTextIdCuenta;
    private javax.swing.JTextField jTextSaldoCuenta;
    // End of variables declaration//GEN-END:variables
}