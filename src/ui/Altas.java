package ui;

import connection.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Altas extends javax.swing.JFrame {

    public Altas() {
        initComponents();

        setTitle("Altas - Fannog");
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        try {
            ConnectionManager cm = new ConnectionManager();
            Connection cn = cm.connect();

            String query = "SELECT NOMBRE FROM ROL";

            try {
                PreparedStatement pst = cn.prepareStatement(query);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    comboRol.addItem(rs.getString("NOMBRE"));
                }

            } catch (SQLException e) {
                System.out.println("Hubo un error en la query de los roles");
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inptApellido2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inptApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inptNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inptMail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inptNombre2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inptDocumento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inptFechaNacimiento = new javax.swing.JTextField();
        inptClave = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        comboRol = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inptNombreRol = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcionRol = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel1.setText("Alta de personas");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        inptApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inptApellido2ActionPerformed(evt);
            }
        });
        jPanel2.add(inptApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 160, 30));

        jLabel2.setText("Segundo apellido (Opcional)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        inptApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inptApellidoActionPerformed(evt);
            }
        });
        jPanel2.add(inptApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 160, 30));

        jLabel3.setText("Apellido");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));
        jPanel2.add(inptNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 160, 30));

        jLabel4.setText("Nombre");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        jPanel2.add(inptMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 160, 30));

        jLabel5.setText("Segundo nombre (Opcional)");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));
        jPanel2.add(inptNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 160, 30));

        jLabel6.setText("Fecha de nacimiento");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel7.setText("Mail");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        inptDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inptDocumentoActionPerformed(evt);
            }
        });
        jPanel2.add(inptDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 160, 30));

        jLabel8.setText("Documento");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel9.setText("Clave");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));
        jPanel2.add(inptFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 160, 30));
        jPanel2.add(inptClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 360, 30));

        jLabel10.setText("Rol");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jButton1.setText("Crear persona");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 370, 40));

        jPanel2.add(comboRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 332, 160, 30));

        jButton4.setText("Volver");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jTabbedPane1.addTab("Personas", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel11.setText("Alta de roles");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel12.setText("Descripción");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        jPanel1.add(inptNombreRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 370, 30));

        txtAreaDescripcionRol.setColumns(20);
        txtAreaDescripcionRol.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescripcionRol);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 370, -1));

        jLabel14.setText("Nombre");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jButton2.setText("Crear Rol");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 370, 40));

        jButton3.setText("Volver");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jTabbedPane1.addTab("Roles", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Funcionalidades", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inptApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inptApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inptApellidoActionPerformed

    private void inptApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inptApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inptApellido2ActionPerformed

    private void inptDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inptDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inptDocumentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String nombre = inptNombre.getText();
        String nombre2 = inptNombre2.getText();
        String apellido = inptApellido.getText();
        String apellido2 = inptApellido.getText();
        int documento = Integer.valueOf(inptDocumento.getText());
        String fechaDeNacimiento = inptFechaNacimiento.getText();
        int idRol = comboRol.getSelectedIndex() + 1;
        String mail = inptMail.getText();
        String clave = inptClave.getText();

        try {
            ConnectionManager cm = new ConnectionManager();

            Connection cn = cm.connect();

            String query = "INSERT INTO PERSONA "
                    + "(ID_PERSONA, DOCUMENTO, APELLIDO1, APELLIDO2, NOMBRE1, NOMBRE2, FECHA_NAC, CLAVE, MAIL, ID_ROL) "
                    + "VALUES (SEQ_ID_PERSONA.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = cn.prepareStatement(query);
                pst.setInt(1, documento);
                pst.setString(2, apellido);
                pst.setString(3, apellido2);
                pst.setString(4, nombre);
                pst.setString(5, nombre2);
                pst.setString(6, fechaDeNacimiento);
                pst.setString(7, clave);
                pst.setString(8, mail);
                pst.setInt(9, idRol);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Persona creada con éxito");

                inptApellido.setText("");
                inptApellido2.setText("");
                inptClave.setText("");
                inptDocumento.setText("");
                inptFechaNacimiento.setText("");
                inptNombre.setText("");
                inptMail.setText("");
                inptNombre2.setText("");
            } catch (SQLException e) {
                System.out.println("Ha ocurrido un error en el insert de la persona");
                e.printStackTrace();
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String nombre = inptNombreRol.getText();
        String descripcion = txtAreaDescripcionRol.getText();

        try {
            ConnectionManager cm = new ConnectionManager();
            Connection cn = cm.connect();

            String sql = "INSERT INTO ROL(ID_ROL, NOMBRE, DESCRIPCION) VALUES (SEQ_ID_ROL.NEXTVAL, ?, ?)";

            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, nombre);
                pst.setString(2, descripcion);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Rol creado con éxito");

                inptNombreRol.setText("");
                txtAreaDescripcionRol.setText("");
            } catch (SQLException e) {
                System.out.println("Fallo el insert de roles");
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.dispose();
        Menu menu = new Menu();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        this.dispose();
        Menu menu = new Menu();
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Altas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboRol;
    private javax.swing.JTextField inptApellido;
    private javax.swing.JTextField inptApellido2;
    private javax.swing.JPasswordField inptClave;
    private javax.swing.JTextField inptDocumento;
    private javax.swing.JTextField inptFechaNacimiento;
    private javax.swing.JTextField inptMail;
    private javax.swing.JTextField inptNombre;
    private javax.swing.JTextField inptNombre2;
    private javax.swing.JTextField inptNombreRol;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txtAreaDescripcionRol;
    // End of variables declaration//GEN-END:variables
}
