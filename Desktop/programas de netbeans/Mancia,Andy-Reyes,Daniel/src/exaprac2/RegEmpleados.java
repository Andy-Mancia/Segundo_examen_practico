/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;

import exaprac2.Datos_trabajadores;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiren saiyajin
 */
public class RegEmpleados extends javax.swing.JFrame {

    /**
     * PARA CAMBIAR COLUMNAS NECESITO UN MODELO
     */
    
    String [] columnas = {"NOMBRE","SALARIO POR HORA", "CANTIDAD DE HORAS TRABAJADAS"};
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
    public int contador= 0; //Si, yo se que rompe la encapsulacion. Pero funciona!
    //crear lista para guardar registros la llamare datos
    List<Datos_trabajadores> datos = new ArrayList<>();
    
    
    public RegEmpleados() {
        initComponents();
        //aca agrego mi orden de columnas
        tblDatos.setModel(modelo);
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
        txtnombreempleado = new javax.swing.JTextField();
        txtsalario = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        spcanthorastrabajadas = new javax.swing.JSpinner();
        btnModificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Aharoni", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nombre del empleado que más a ganado de todos los registrados:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre de Empleado:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Cantidad de horas trabajadas:");

        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("::::::::REGISTRO DE EMPLEADOS::::::::");

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tblDatos.setShowGrid(true);
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Salario por Hora:");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel5.setText("jLabel5");
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cosa(evt);
            }
        });

        jLabel7.setText("Total planilla:");

        jLabel8.setText("jLabel8");
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                otraCosa(evt);
            }
        });

        jLabel9.setText("Mayor sueldo;");

        jLabel10.setText("jLabel10");
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                unaCosaMas(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtsalario)
                                    .addComponent(txtnombreempleado)
                                    .addComponent(spcanthorastrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombreempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spcanthorastrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // Creare un objeto llamado prod
        Datos_trabajadores dat = new Datos_trabajadores();
        //cargar el objeto con datos
        dat.setNombre_empleado(txtnombreempleado.getText());
        dat.setSalario_por_hora(Double.parseDouble(txtsalario.getText()));
        dat.setCantidad_horas_trabajadas(Integer.parseInt(spcanthorastrabajadas.getValue().toString()));
        
        //meter el registro a la lista
        datos.add(dat);
        
        contador += 1;
        cargar();
        limpiar();
        
    }//GEN-LAST:event_btnAgregarMouseClicked
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // POR ACA PROGRAMARE MI BOTON ELIMINAR REGISTRO
        if(JOptionPane.showConfirmDialog(this, "Desea eliminar el registro?", "Titulo",
                JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE)==0){
            Datos_trabajadores dat = new Datos_trabajadores();
       
            dat.setNombre_empleado(txtnombreempleado.getText());
            dat.setSalario_por_hora(Double.parseDouble(txtsalario.getText()));
            dat.setCantidad_horas_trabajadas(Integer.parseInt(spcanthorastrabajadas.getValue().toString()));
            
            int index =0;
            for(Datos_trabajadores d: datos){
                if(d.getSalario_por_hora() == dat.getSalario_por_hora()){
                    break;
                }
                index++;
            }
            datos.remove(index);              
        }
        contador -=1;
        cargar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Aca modifico
        
        Datos_trabajadores dat = new Datos_trabajadores();
        
        //cargar el objeto con datos
            dat.setNombre_empleado(txtnombreempleado.getText());
            dat.setSalario_por_hora(Double.parseDouble(txtsalario.getText()));
            dat.setCantidad_horas_trabajadas(Integer.parseInt(spcanthorastrabajadas.getValue().toString()));
        
        //hacer la modificacion en la lista
           //buscar el index que se va modificar
            int index =0;
            for(Datos_trabajadores d: datos){
                if(d.getSalario_por_hora() == dat.getSalario_por_hora()){
                    break;
                }
                index++;
            }
           //hacer la modificacion
           datos.set(index, dat);
           
           cargar();
           limpiar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        // TODO add your handling code here:
        txtnombreempleado.setText(tblDatos.getValueAt(tblDatos.getSelectedRow(), 0).toString());
        txtsalario.setText(tblDatos.getValueAt(tblDatos.getSelectedRow(), 1).toString());
        
        SpinnerNumberModel smodel = new SpinnerNumberModel();
        smodel.setMaximum(100);
        smodel.setMinimum(0);
        smodel.setValue(Integer.parseInt(tblDatos.getValueAt(tblDatos.getSelectedRow(), 2).toString()));
        spcanthorastrabajadas.setModel(smodel);
        
    }//GEN-LAST:event_tblDatosMouseClicked

    private void cosa(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cosa
        // TODO add your handling code here:
        jLabel5.setText(planilla());
    }//GEN-LAST:event_cosa

    private void otraCosa(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otraCosa
        // TODO add your handling code here:
        jLabel8.setText(ganaMas());
        
    }//GEN-LAST:event_otraCosa

    private void unaCosaMas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unaCosaMas
        // TODO add your handling code here:
        jLabel10.setText("laskgnailgh");
    }//GEN-LAST:event_unaCosaMas
    public String ganaMas(){
       Datos_trabajadores dat = new Datos_trabajadores();

            dat.setNombre_empleado(txtnombreempleado.getText());
            dat.setSalario_por_hora(Double.parseDouble(txtsalario.getText()));
            dat.setCantidad_horas_trabajadas(Integer.parseInt(spcanthorastrabajadas.getValue().toString()));
            
            datos.add(dat);
                    
            double horas = dat.getCantidad_horas_trabajadas();
            double pHora = dat.getSalario_por_hora();
            
            double sueldo = (horas*pHora);
            double caja[] = new double[40];
            caja[contador] = sueldo;
        /*
            double horas = 0;
            double pHora = 0;
            double caja[] = new double[contador];
            
        for(int i=0;i<contador;i++){
            horas = Double.parseDouble(tblDatos.getValueAt(i, 2).toString());
            pHora = Double.parseDouble(tblDatos.getValueAt(i, 1).toString());
            double sueldo = (horas*pHora);
            caja[i] = sueldo;
        }
        double max = caja[0];
        for (int y = 1;y<caja.length;y++){
            if (caja[y] > max){
                max  = caja[y];
            }
        }
        */
        String x = String.valueOf(caja[contador]);
        return  x;
}

    public String planilla(){
        double horas = 0;
        double pHora = 0;
        for(int n=0;n<contador;n++){
            horas += Double.parseDouble(tblDatos.getValueAt(n, 2).toString());
            pHora += Double.parseDouble(tblDatos.getValueAt(n, 1).toString());
        }
        double sueldo = (horas*pHora);
        
        String x = String.valueOf(sueldo);
        return  x;
    }
    
    public void limpiar(){//aca limpio mis campos una ves se agrega mi registro
        txtnombreempleado.setText("");
        txtsalario.setText("");
        spcanthorastrabajadas.setValue(0);
    }
    
    public void cargar(){
         //cargar la lista al modelo, luego el modelo a la tabla
        modelo.setNumRows(0); //limpiando el modelo
        //metiendo los datos al modelo
        for(Datos_trabajadores d : datos){   //foreach(var item in lista)
            modelo.addRow(new Object[] {d.getNombre_empleado(),d.getSalario_por_hora(),
                d.getCantidad_horas_trabajadas()});
        }
        //aplicar el modelo a la tabla
        tblDatos.setModel(modelo);
        
    }
    
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
            java.util.logging.Logger.getLogger(RegEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spcanthorastrabajadas;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtnombreempleado;
    private javax.swing.JTextField txtsalario;
    // End of variables declaration//GEN-END:variables
}
