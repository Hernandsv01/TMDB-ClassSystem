/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Edu
 */
public class EditorAlumno extends javax.swing.JFrame {
    
    private static String nombre;
    private static String dni;
    private static String telefono;
    private static String mail;
    private static String edad;
    private static String fechainicio;
    private static String estado;
    private static String diaclase;
    private static String horaclase;
    private static String anotaciones;
    private static String[][] arrClases;
    javax.swing.DefaultComboBoxModel boxclasemodel;
    private static String exboxitem;
    private final DBConnection dbconn = new DBConnection();
    private final Connection conn;
    private ResultSet rs;
    private PreparedStatement prepSt;
    Clase clase = new Clase();
    EditorAlumno EA;

    /**
     * Creates new form EditorAlumno
     */
    public EditorAlumno() {
        initComponents();
        conn = dbconn.connection();
    }
    
    public void setEA(EditorAlumno EA){
        this.EA = EA;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnvolver = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        numedad = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        txtfechainicio = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtanotaciones = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtalumno = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        btnaplicar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        boxestado = new javax.swing.JComboBox<>();
        btneliminar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        boxclase = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        jLabel19.setText("Edad");

        jLabel20.setText("Anotaciones");

        jLabel12.setText("DNI");

        numedad.setModel(new javax.swing.SpinnerNumberModel(0, null, 99, 1));

        jLabel15.setText("Nombre");

        txtfechainicio.setToolTipText("aaaa/mm/dd");

        jLabel16.setText("Mail");

        txtanotaciones.setColumns(20);
        txtanotaciones.setRows(5);
        jScrollPane6.setViewportView(txtanotaciones);

        jLabel17.setText("Fecha de inicio");

        jLabel18.setText("Teléfono");

        txtalumno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnaplicar.setText("Aplicar cambios");
        btnaplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaplicarActionPerformed(evt);
            }
        });

        jLabel21.setText("Estado");

        boxestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        boxestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxestadoActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar alumno");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel22.setText("Clase");

        boxclase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnvolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxclase, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtalumno)
                                        .addComponent(txtdni)
                                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numedad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)))
                        .addGap(63, 63, 63)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnaplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnvolver)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtalumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxclase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnaplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btnaplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaplicarActionPerformed
        boolean first = true;
        String statement = "UPDATE `alumnos` SET ";
        
        if(!txtalumno.getText().equals(nombre)){
            if(!first){
                statement += ", ";
            }
            statement += "`nombre` = '" + txtalumno.getText().toUpperCase() + "' ";
            first = false;
        }
        if(!txtdni.getText().equals(dni)){
            if(!first){
                statement += ", ";
            }
            statement += "`dni` = '" + txtdni.getText().toUpperCase() + "' ";
            first = false;
        }
        if(!txttelefono.getText().equals(telefono)){
            if(!first){
                statement += ", ";
            }
            statement += "`telefono` = '" + txttelefono.getText().toUpperCase() + "' ";
            first = false;
        }
        if(!txtmail.getText().equals(mail)){
            if(!first){
                statement += ", ";
            }
            statement += "`mail` = '" + txtmail.getText().toUpperCase() + "' ";
            first = false;
        }
        if(!numedad.getValue().toString().equals(edad)){
            if(!first){
                statement += ", ";
            }
            statement += "`edad` = '" + numedad.getValue().toString() + "' ";
            first = false;
        }
        if(!txtfechainicio.getText().equals(fechainicio)){
            if(!first){
                statement += ", ";
            }
            statement += "`fechainicio` = '" + txtfechainicio.getText() + "' ";
            first = false;
        }
        if(!boxestado.getSelectedItem().toString().equals(estado)){
            if(!first){
                statement += ", ";
            }
            if("Activo".equals(boxestado.getSelectedItem().toString())){
                statement += "`estado` = '1' ";
            }else{
                statement += "`estado` = '0' ";
            }
            first = false;
        }
        if(!boxclase.getSelectedItem().toString().equals(diaclase + " - " + horaclase)){
            if(!first){
                statement += ", ";
            }
            String diaDB = "null";
            String[] doselementos = {"null", "null"};
            if(!"Ninguna".equals(boxclase.getSelectedItem().toString())){
                doselementos = (boxclase.getSelectedItem().toString()).split(" - ");
                diaDB = clase.setDBValue(doselementos[0]);
                
                statement += "`diaclase` = '" + diaDB + "', `horaclase` = '" + doselementos[1] + "' ";
            }else{
                statement += "`diaclase` = null, `horaclase` = null ";
            }
            first = false;
            
            
            int intnumeroalumnosau;
            String stnumeroalumnosau = null;
            int intnumeroalumnosdis;
            String stnumeroalumnosdis = null;
            try{
                if(!"null".equals(doselementos[1])){
                    String selectstatementau = "SELECT * FROM `clasesemanal` WHERE `diasemana` = '" + diaDB + "' AND `hora` = '" + doselementos[1] + "'";
                    System.out.println(selectstatementau);
                    prepSt = conn.prepareStatement(selectstatementau);
                    rs = prepSt.executeQuery();
                    while(rs.next()){
                        stnumeroalumnosau = rs.getString("numeroalumnos");
                    }
                    intnumeroalumnosau = Integer.parseInt(stnumeroalumnosau);
                    intnumeroalumnosau++;
                    String updatestatementau = "UPDATE `clasesemanal` SET `numeroalumnos` = '" + intnumeroalumnosau + "' WHERE `diasemana` = '" + diaDB + "' AND `hora` = '" + doselementos[1] + "'";
                    System.out.println(updatestatementau);
                    prepSt = conn.prepareStatement(updatestatementau);
                    prepSt.execute();
                }
                
                if(!"Ninguna".equals(exboxitem)){
                    diaDB = clase.setDBValue(diaclase);
                    String selectstatementdis = "SELECT * FROM `clasesemanal` WHERE `diasemana` = '" + diaDB + "' AND `hora` = '" + horaclase + "'";
                    System.out.println(selectstatementdis);
                    prepSt = conn.prepareStatement(selectstatementdis);
                    rs = prepSt.executeQuery();
                    while(rs.next()){
                        stnumeroalumnosdis = rs.getString("numeroalumnos");
                    }
                    intnumeroalumnosdis = Integer.parseInt(stnumeroalumnosdis);
                    intnumeroalumnosdis--;
                    String updatestatementdis = "UPDATE `clasesemanal` SET `numeroalumnos` = '" + intnumeroalumnosdis + "' WHERE `diasemana` = '" + diaDB + "' AND `hora` = '" + horaclase + "'";
                    System.out.println(updatestatementdis);
                    prepSt = conn.prepareStatement(updatestatementdis);
                    prepSt.execute();
                    prepSt.close();
                }
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            
            
        }
        if(!txtanotaciones.getText().equals(anotaciones)){
            if(!first){
                statement += ", ";
            }
            statement += "`comentarios` = '" + txtanotaciones.getText() + "' ";
        }
        statement += "WHERE `alumnos`.`DNI` = " + dni;
        System.out.println(statement);
        try{
            prepSt = conn.prepareStatement(statement);
            prepSt.execute();
            prepSt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        if(first){
            PopupMessage pum = new PopupMessage(0);
            pum.setVisible(true);
        }else{
            PopupMessage pum = new PopupMessage(1);
            pum.setVisible(true);
            dispose();
        }
        
        
    }//GEN-LAST:event_btnaplicarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        ConfirmMessage cm = new ConfirmMessage();
        cm.setEA(EA);
        cm.setDNI(dni);
        cm.setType(1);
        cm.setVisible(true);
    }//GEN-LAST:event_btneliminarActionPerformed

    private void boxestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxestadoActionPerformed
        if("Inactivo".equals(boxestado.getSelectedItem().toString())){
            boxclase.setSelectedIndex(0);
            boxclase.setEnabled(false);
        }else{
            boxclase.setEnabled(true);
        }
    }//GEN-LAST:event_boxestadoActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
    public static void main2(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditorAlumno().setVisible(true);
            }
        });
    }
    
    public void setInfo(String[] str){
        nombre = str[0];
        txtalumno.setText(str[0]);
        dni = str[1];
        txtdni.setText(str[1]);
        telefono = str[2];
        txttelefono.setText(str[2]);
        mail = str[3];
        txtmail.setText(str[3]);
        edad = str[4];
        estado = str[5];
        diaclase = str[6];
        horaclase = str[7];
        
        try{
            numedad.setValue(Integer.parseInt(edad));
            if("Activo".equals(str[5])){
                boxestado.setSelectedIndex(0);
            }else{
                boxestado.setSelectedIndex(1);
            }
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        fechainicio = str[8];
        txtfechainicio.setText(str[8]);
        anotaciones = str[9];
        txtanotaciones.setText(str[9]);
    }
    public void setClases(String[][] arrClases) {
        EditorAlumno.arrClases = arrClases;
        
        boxclasemodel = new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna" });
        boxclase.setModel(boxclasemodel);
        String itembox;
        for (String[] arrClase : arrClases) {
            itembox = arrClase[0] + " - " + arrClase[1];
            if (boxclasemodel.getIndexOf(itembox) == -1) {
                boxclase.addItem(itembox);
            }
        }
//        for (String[] arrClase : arrClases) {
//            if (boxclasemodel.getIndexOf(arrClase[0]) == -1) {
//                boxclase.addItem(arrClase[0]);
//            }
//        }
    }
    public void setBox(){
        boxclase.setSelectedItem(diaclase + " - " + horaclase);
        System.out.println("Setting box: " + diaclase + " - " + horaclase);
        exboxitem = boxclase.getSelectedItem().toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxclase;
    private javax.swing.JComboBox<String> boxestado;
    private javax.swing.JButton btnaplicar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner numedad;
    private javax.swing.JTextField txtalumno;
    private javax.swing.JTextArea txtanotaciones;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtfechainicio;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

}
