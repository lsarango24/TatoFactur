/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Kintia Ankuash
 */
public class PanelCliente extends javax.swing.JPanel {

    /**
     * Creates new form PanelCliente
     */
    public PanelCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelNuevoCliente = new javax.swing.JPanel();
        TxtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtApellido = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jButtonModificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        TxtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(874, 450));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Administrar Cliente");

        jPanelNuevoCliente.setBackground(new java.awt.Color(255, 0, 102));
        jPanelNuevoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        jPanelNuevoCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelNuevoCliente.add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 54, 181, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cédula/Ruc:");
        jPanelNuevoCliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 84, 76, -1));
        jPanelNuevoCliente.add(TxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 82, 163, -1));

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanelNuevoCliente.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 154, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres:");
        jPanelNuevoCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 31, 76, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos:");
        jPanelNuevoCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 33, 62, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dirección:");
        jPanelNuevoCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 56, 76, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono:");
        jPanelNuevoCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 56, 62, -1));
        jPanelNuevoCliente.add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 29, 181, -1));
        jPanelNuevoCliente.add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 54, 193, -1));
        jPanelNuevoCliente.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 29, 193, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email:");
        jPanelNuevoCliente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 84, 62, -1));
        jPanelNuevoCliente.add(TxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 82, 181, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado:");
        jPanelNuevoCliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 34, 60, -1));

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Debaja" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });
        jPanelNuevoCliente.add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 29, 71, -1));

        jButtonModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        jPanelNuevoCliente.add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 154, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Buscar Por:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 76, -1));

        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Nombres", "Apellidos" }));
        jPanel2.add(jComboBoxFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 12, -1, -1));

        TxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarActionPerformed(evt);
            }
        });
        TxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBuscarKeyTyped(evt);
            }
        });
        jPanel2.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 14, 224, 20));

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 830, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                            .addComponent(jPanelNuevoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
//        Cliente objeto_cliente = new Cliente();
//        objeto_cliente.setNombre_cliente(TxtNombre.getText());
//        objeto_cliente.setApellido_cliente(TxtApellido.getText());
//        objeto_cliente.setCedula_cliente(TxtCedula.getText());
//        objeto_cliente.setDireccion_cliente(TxtDireccion.getText());
//        objeto_cliente.setTelefono_cliente(TxtTelefono.getText());
//        objeto_cliente.setEmail_cliente(TxtEmail.getText());
//        objeto_cliente.setEstado_cliente((String)jComboBoxEstado.getSelectedItem());
//        escribirFichero(objeto_cliente);
//        JOptionPane.showMessageDialog(null, "su cliente se guardo con exito");
//        limpiarCampos();
//        cargarTabla();

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
//        try {
//            List<Cliente> lista = this.modelo.getLista();
//            lista.remove(this.jTableCliente.getSelectedRow());
//            Cliente u = new Cliente();
//            u.setNombre_cliente(TxtNombre.getText());
//            u.setApellido_cliente(TxtApellido.getText());
//            u.setCedula_cliente(TxtCedula.getText());
//            u.setDireccion_cliente(TxtDireccion.getText());
//            u.setTelefono_cliente(TxtTelefono.getText());
//            u.setEmail_cliente(TxtEmail.getText());
//            u.setEstado_cliente((String)jComboBoxEstado.getSelectedItem());
//            lista.add(u);
//            borrardatosfichero();
//            for (int i = 0; i < lista.size(); i++) {
//                escribirFichero(lista.get(i));
//            }
//            JOptionPane.showMessageDialog(null, "Su Usuario se Modifico Correctamente");
//            limpiarCampos();
//            cargarTabla();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Debe selecionar una fila");
//        }

    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void TxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarActionPerformed

    private void TxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscarKeyTyped
        // TODO add your handling code here:
//        TxtBuscar.addKeyListener(new KeyAdapter() {
//            public void  keyReleased(final KeyEvent e){
//                String cadena = (TxtBuscar.getText());
//                repaint();
//                filtro();
//            }
//        });
//        trsFiltro = new TableRowSorter(jTableCliente.getModel());
//        jTableCliente.setRowSorter(trsFiltro);
    }//GEN-LAST:event_TxtBuscarKeyTyped

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        // TODO add your handling code here:
//        String ced = jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 2).toString();
//        Cliente user = new LeerArchivos().obtenerCliente(ced);
//        if (user != null) {
//            TxtNombre.setText(user.getNombre_cliente());
//            TxtApellido.setText(user.getApellido_cliente());
//            TxtCedula.setText(user.getCedula_cliente());
//            TxtDireccion.setText(user.getDireccion_cliente());
//            TxtTelefono.setText(user.getTelefono_cliente());
//            TxtEmail.setText(user.getEmail_cliente());
//        }

    }//GEN-LAST:event_jTableClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelNuevoCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableCliente;
    // End of variables declaration//GEN-END:variables
}
