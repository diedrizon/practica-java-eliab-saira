/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package datos.estudiantes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author diedr
 */
public class InternalFrameEstudiante extends javax.swing.JInternalFrame {

    ArrayList<estudiante> listestudiante=new ArrayList<estudiante>();
    /**
     * Creates new form InternalFrameEstudiante
     */
    public InternalFrameEstudiante() {
        initComponents();
    }
     private void limpiarCampo(){
        this.jTextFieldcarnet.setText("");
        this.jTextFieldnombre.setText("");
        this.jTextFieldapellido.setText("");
        this.jTextFieldcarrera.setText("");
        this.jTextFieldnivel.setText("");
        this.jTextAreaestudiante.setText("");
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
        jTextFieldcarnet = new javax.swing.JTextField();
        jTextFieldnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldcarrera = new javax.swing.JTextField();
        jTextFieldnivel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonagregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaestudiante = new javax.swing.JTextArea();
        jButtonver_estudiante = new javax.swing.JButton();
        jButtonlimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Datos Estudiantes");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Carnet");

        jTextFieldcarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcarnetActionPerformed(evt);
            }
        });

        jTextFieldnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Apellidos");

        jTextFieldapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldapellidoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("carrera");

        jTextFieldcarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcarreraActionPerformed(evt);
            }
        });

        jTextFieldnivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnivelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Nivel");

        jButtonagregar.setText("Agregar");
        jButtonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonagregarActionPerformed(evt);
            }
        });

        jTextAreaestudiante.setColumns(20);
        jTextAreaestudiante.setRows(5);
        jTextAreaestudiante.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextAreaestudianteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTextAreaestudiante);

        jButtonver_estudiante.setText("Ver estudiante");
        jButtonver_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonver_estudianteActionPerformed(evt);
            }
        });

        jButtonlimpiar.setText("Limpiar");
        jButtonlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldcarnet)
                            .addComponent(jTextFieldnombre)
                            .addComponent(jTextFieldapellido)
                            .addComponent(jTextFieldcarrera)
                            .addComponent(jTextFieldnivel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonagregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonlimpiar)))))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButtonver_estudiante))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldcarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldnivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonagregar)
                    .addComponent(jButtonlimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonver_estudiante)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldcarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcarnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcarnetActionPerformed

    private void jTextFieldnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnombreActionPerformed

    private void jTextFieldapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldapellidoActionPerformed

    private void jTextFieldcarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcarreraActionPerformed

    private void jTextFieldnivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnivelActionPerformed

    private void jButtonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonagregarActionPerformed
        String carneT=this.jTextFieldcarnet.getText();
        String nombrE=this.jTextFieldnombre.getText();
        String apellidO=this.jTextFieldapellido.getText();
        String carrerA=this.jTextFieldcarrera.getText();
        String niveL=this.jTextFieldnivel.getText();

        try{
            double car=Double.parseDouble(carneT);

            estudiante Estudiante=new estudiante(car, nombrE, apellidO, carrerA, niveL);
            this.listestudiante.add(Estudiante);
            this.limpiarCampo();
            JOptionPane.showMessageDialog(null, "Daros agregado correctamente");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Los datos no se an agregado", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonagregarActionPerformed

    private void jTextAreaestudianteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextAreaestudianteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaestudianteAncestorAdded

    private void jButtonver_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonver_estudianteActionPerformed
        String LE ="";
        for (estudiante es : listestudiante){
            LE += es.getNombre()  +  es.getApellido()+  "\n";
        }
        this.jTextAreaestudiante.setText(LE);
    }//GEN-LAST:event_jButtonver_estudianteActionPerformed

    private void jButtonlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlimpiarActionPerformed
        this.limpiarCampo();
    }//GEN-LAST:event_jButtonlimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonagregar;
    private javax.swing.JButton jButtonlimpiar;
    private javax.swing.JButton jButtonver_estudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaestudiante;
    private javax.swing.JTextField jTextFieldapellido;
    private javax.swing.JTextField jTextFieldcarnet;
    private javax.swing.JTextField jTextFieldcarrera;
    private javax.swing.JTextField jTextFieldnivel;
    private javax.swing.JTextField jTextFieldnombre;
    // End of variables declaration//GEN-END:variables
}