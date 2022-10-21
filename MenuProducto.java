package AH5;
import conexionConsola.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PCJUAREZ
 */
public class MenuProducto extends javax.swing.JFrame {
    
//# CODIFICACION DE VARIABLE GLOBAL_____________________________________________
        ProductoDAO qpex = new ProductoDAO();
        DefaultTableModel tabla_modelo;

//______________________________________________________________________________
    public MenuProducto() {
        initComponents();
        //#CODIFICACION
        Tabla();
    }
//#CODIFICACION________________________________________________________________
    public void Tabla() {
        ArrayList<Productodb> DDatos = qpex.listar();
        String titulos[] = {"Codigo", "Producto", "Cantidad", "Fabricacion", "Fecha"};
        tabla_modelo = new DefaultTableModel(null, titulos);
        for (Productodb general : DDatos) {
            Object informacion[] = new Object[5];
            informacion[0] = general.getCodigo();
            informacion[1] = general.getDesc_producto();
            informacion[2] = general.getCantidad();
            informacion[3] = general.getFabri_origen();
            informacion[4] = general.getFechaingreso();
            tabla_modelo.addRow(informacion);
        }
        Tabla_General.setModel(tabla_modelo);
    }

//MOSTRAR    cl:qpex ___________________________________________________________
    public void mostrar() {       
        qpex.buscar(Integer.parseInt(Tabla_General.getValueAt(Tabla_General.getSelectedRow(), 0).toString())); 

    }
    
//REF#(6)______________________________________________________________________________
    public void mostrarmenu(int codigo, String producto, int cantidad, String fabricacion, String fecha) {
        //enviar datos de modificar a las cajitas
        txtCaja1.setText(codigo+""); // (codigo+"") se agrega comillas dobles para que se lea como un string
        txtCaja2.setText(producto);
        txtCaja3.setText(cantidad+""); // (cantidad+"") se agrega comillas dobles para que se lea como un string
        txtCaja4.setText(fabricacion);
        txtCaja5.setText(fecha);
    }
    
//REF#(7)______________________________________________________________________________
    public void eliminar(){
    ProductoDAO eliminarDao = new ProductoDAO();
    eliminarDao.eliminar(Integer.parseInt(txtCaja1.getText()));
    } 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCaja1 = new javax.swing.JTextField();
        txtCaja2 = new javax.swing.JTextField();
        txtCaja3 = new javax.swing.JTextField();
        txtCaja4 = new javax.swing.JTextField();
        CREATEP = new javax.swing.JButton();
        READP = new javax.swing.JButton();
        UPDATEP = new javax.swing.JButton();
        DELETEP = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_General = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtCaja5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setText("AH5 - CRUD with Database");

        jLabel2.setText("Codigo:");

        jLabel3.setText("Producto:");

        jLabel4.setText("Cantidad:");

        jLabel5.setText("Fabricacion:");

        txtCaja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaja1ActionPerformed(evt);
            }
        });

        txtCaja3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaja3ActionPerformed(evt);
            }
        });

        CREATEP.setText("Crear | C");
        CREATEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREATEPActionPerformed(evt);
            }
        });

        READP.setText("Listar | R");
        READP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                READPActionPerformed(evt);
            }
        });

        UPDATEP.setText("Modificar | U");
        UPDATEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEPActionPerformed(evt);
            }
        });

        DELETEP.setText("Eliminar | D");
        DELETEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEPActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(Tabla_General);

        jLabel6.setText("ScrollPane/Table");

        jLabel7.setText("Fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24)
                        .addComponent(txtCaja3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCaja4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCaja5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCaja1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCaja2))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CREATEP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(READP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UPDATEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DELETEP)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCaja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaja3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCaja4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCaja5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UPDATEP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CREATEP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(READP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DELETEP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCaja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaja1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaja1ActionPerformed

    private void txtCaja3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaja3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaja3ActionPerformed

    private void CREATEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATEPActionPerformed
    ////REF#(2) Codigo boton CREAR
        try {
            ProductoDAO cl = new ProductoDAO();        
            cl.crear(Integer.parseInt(txtCaja1.getText()), txtCaja2.getText(), Integer.parseInt(txtCaja3.getText()), txtCaja4.getText(), txtCaja5.getText() );
            txtCaja1.setText(null);
            txtCaja2.setText(null);
            txtCaja3.setText(null);
            txtCaja4.setText(null);
            txtCaja5.setText(null);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puedo Crear el registro! "+e);
        }       
        Tabla();
    }//GEN-LAST:event_CREATEPActionPerformed

    private void READPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_READPActionPerformed
        //#codificando boton MODIFICAR
        //txtCaja1.setEditable(false);
        try {
            mostrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operación realizada correctamente "+e);
        }
        
    }//GEN-LAST:event_READPActionPerformed

    private void UPDATEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEPActionPerformed
    //REF#(3) codigo boton MODIFICAR
        try {
                ProductoDAO modificarmenu = new ProductoDAO();        
                modificarmenu.modificar(Integer.parseInt(txtCaja1.getText()), txtCaja2.getText(), Integer.parseInt(txtCaja3.getText()), txtCaja4.getText(), txtCaja5.getText() );
                txtCaja1.setText("");
                txtCaja2.setText("");
                txtCaja3.setText("");
                txtCaja4.setText("");
                txtCaja5.setText("");
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se puedo Modificar el registro! "+e);
        }
        Tabla(); //actualiza tabla
  
    }//GEN-LAST:event_UPDATEPActionPerformed

    private void DELETEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEPActionPerformed
    //REF#(7) codigo boton ELIMINAR OTRA FORMA DE EJECUTAR
    
        try {
            eliminar();//REF#(7)
            txtCaja1.setText("");
            Tabla();
            System.out.println("Mensaje en consola: Registro eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puedo eliminar el registro! "+e);
        }

    }//GEN-LAST:event_DELETEPActionPerformed
    
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            //REF#(8)
               new MenuProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CREATEP;
    private javax.swing.JButton DELETEP;
    private javax.swing.JButton READP;
    private javax.swing.JButton Salir;
    private javax.swing.JTable Tabla_General;
    private javax.swing.JButton UPDATEP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCaja1;
    private javax.swing.JTextField txtCaja2;
    private javax.swing.JTextField txtCaja3;
    private javax.swing.JTextField txtCaja4;
    private javax.swing.JTextField txtCaja5;
    // End of variables declaration//GEN-END:variables
}
