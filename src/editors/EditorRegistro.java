/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editors;

import enums.ConfirmType;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import tools.Alumno;
import tools.Clase;
import tools.ConfirmMessage;
import tools.DBConnection;
import tools.PopupMessage;

/**
 *
 * @author Edu
 */
public final class EditorRegistro extends javax.swing.JFrame {
    DefaultTableModel modelPresentes = new DefaultTableModel();
    DefaultTableModel modelAusentes = new DefaultTableModel();
    
    List<String> infoRegistro = new ArrayList();
    List<String> ausentes = new ArrayList();
    
    
    /**
     * Creates new form EditorRegistro
     */
    public EditorRegistro() {
        initComponents();
        initModelPresentes();
        initModelAusentes();
        setBoxClases();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablapresentes = new javax.swing.JTable();
        txtfecha = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        boxclase = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaausentes = new javax.swing.JTable();
        btnaplicarcambios = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        btneliminarregistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tablapresentes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablapresentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Presentes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablapresentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablapresentesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablapresentes);

        txtfecha.setToolTipText("aaaa/mm/dd");

        jLabel13.setText("Fecha");

        jLabel22.setText("ID");

        jLabel23.setText("Clase");

        boxclase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una clase" }));
        boxclase.setEnabled(false);

        tablaausentes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaausentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ausentes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaausentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaausentesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaausentes);

        btnaplicarcambios.setText("Aplicar cambios");
        btnaplicarcambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaplicarcambiosActionPerformed(evt);
            }
        });

        txtid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btneliminarregistro.setBackground(new java.awt.Color(255, 0, 0));
        btneliminarregistro.setText("Eliminar Registro");
        btneliminarregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarregistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btneliminarregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnaplicarcambios, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxclase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txtfecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxclase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaplicarcambios, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminarregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tablapresentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablapresentesMouseClicked
        String[] alumno = {tablapresentes.getValueAt(tablapresentes.getSelectedRow(), 0).toString()};
        modelPresentes.removeRow(tablapresentes.getSelectedRow());
        modelAusentes.addRow(alumno);
    }//GEN-LAST:event_tablapresentesMouseClicked

    private void tablaausentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaausentesMouseClicked
        String[] alumno = {tablaausentes.getValueAt(tablaausentes.getSelectedRow(), 0).toString()};
        modelAusentes.removeRow(tablaausentes.getSelectedRow());
        modelPresentes.addRow(alumno);
    }//GEN-LAST:event_tablaausentesMouseClicked

    private void btnaplicarcambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaplicarcambiosActionPerformed
        List<String[]> registroPresentesInfo = null;
        List<String[]> razonesAusenciasInfo = null;
        List<String[]> registroAusenciasInfo = null;
        
        //Save the info
        String newID = txtid.getText();
        String newFecha = txtfecha.getText();
        List<String> newAusentes = new ArrayList();
        for(int i = 0; i < tablaausentes.getRowCount(); i++){
            newAusentes.add(tablaausentes.getValueAt(i, 0).toString());
        }
        List<String> newPresentes = new ArrayList();
        for(int i = 0; i < tablapresentes.getRowCount(); i++){
            newPresentes.add(tablapresentes.getValueAt(i, 0).toString());
        }
        
        //check changes and build update string
        boolean isFirst = true;
        boolean changedID = false;
        String updstatement = "UPDATE `registroclases` SET ";
        
        //Check if newID changed and if it doesnt already exist
        if(!newID.equals(infoRegistro.get(0))){
            String statement = "SELECT `ID` FROM `registroclases` WHERE `ID` = '" + newID + "'";
            List<String[]> list = DBConnection.getInstance().selectStatement(statement, 1);
            if(!list.isEmpty()){
                new PopupMessage("Error", Color.RED).setVisible(true);
                return;
            }
            changedID = true;
        }
        
        if(changedID){
            //Save and delete all data from other tables
            String statement1 = "SELECT * FROM `registropresentes` WHERE `id_registroclase` = '" + infoRegistro.get(0) + "'";
            registroPresentesInfo = DBConnection.getInstance().selectStatement(statement1, 2);
            String statement2 = "DELETE FROM `registropresentes` WHERE `id_registroclase` = '" + infoRegistro.get(0) + "'";
            DBConnection.getInstance().modificationStatement(statement2);
            
            String statement3 = "SELECT * FROM `razonesausencias` WHERE `id_registroclase` = '" + infoRegistro.get(0) + "'";
            razonesAusenciasInfo = DBConnection.getInstance().selectStatement(statement3, 3);
            String statement4 = "DELETE FROM `razonesausencias` WHERE `id_registroclase` = '" + infoRegistro.get(0) + "'";
            DBConnection.getInstance().modificationStatement(statement4);
            
            String statement5 = "SELECT * FROM `ausencias` WHERE `id_registroclase` = '" + infoRegistro.get(0) + "'";
            registroAusenciasInfo = DBConnection.getInstance().selectStatement(statement5, 5);
            String statement6 = "DELETE FROM `ausencias` WHERE `id_registroclase` = '" + infoRegistro.get(0) + "'";
            DBConnection.getInstance().modificationStatement(statement6);
            
            //Change the id
            updstatement += "`ID` = '" + newID + "'";
            isFirst = false;
        }
        if(!newFecha.equals(infoRegistro.get(1))){
            if(!isFirst){
                updstatement += ", ";
            }
            updstatement += "`Fecha` = '" + newFecha + "'";
            isFirst = false;
        }
        
        updstatement += "WHERE `ID` = '" + infoRegistro.get(0) + "'";
        if(!isFirst){
            if(!DBConnection.getInstance().modificationStatement(updstatement)){
                new PopupMessage("Error", Color.RED).setVisible(true);
                return;
            }
        }
        
        if(changedID){
            //Re-insert info into other tables
            if(registroPresentesInfo != null){
                for(int i = 0; i < registroPresentesInfo.size(); i++){
                    String statement = "INSERT INTO `registropresentes` VALUES ('" + newID + "', '" + registroPresentesInfo.get(i)[1] + "')";
                    DBConnection.getInstance().modificationStatement(statement);
                }
            }
            if(razonesAusenciasInfo != null){
                for(int i = 0; i < razonesAusenciasInfo.size(); i++){
                    String statement = "INSERT INTO `razonesausencias` VALUES ('" + razonesAusenciasInfo.get(i)[0] + "', '" + newID + "', '" + razonesAusenciasInfo.get(i)[2] + "')";
                    DBConnection.getInstance().modificationStatement(statement);
                }
            }
            if(registroAusenciasInfo != null){
                for(int i = 0; i < registroAusenciasInfo.size(); i++){
                    String statement = "INSERT INTO `ausencias` VALUES ('" + newID + "', '" + registroAusenciasInfo.get(i)[1] + "', '" + registroAusenciasInfo.get(i)[2] + "', '" + registroAusenciasInfo.get(i)[3] + "', " + registroAusenciasInfo.get(i)[4] + ")";
                    DBConnection.getInstance().modificationStatement(statement);
                }
            }
        }
        
        //Check if alumno removed from ausentes and remove
        for(int i = 0; i < ausentes.size(); i++){
            if(!newAusentes.contains(ausentes.get(i))){
                String[] doselementos = ausentes.get(i).split(" - ");
                String statement1 = "DELETE FROM `razonesausencias` WHERE `id_registroclase` = '" + newID + "' AND `dni_alumno` = '" + Alumno.getDNIFromName(doselementos[0]) + "'";
                DBConnection.getInstance().modificationStatement(statement1);
                String statement2 = "DELETE FROM `ausencias` WHERE `id_registroclase` = '" + newID + "' AND `id_alumno` = '" + Alumno.getDNIFromName(doselementos[0]) + "'";
                DBConnection.getInstance().modificationStatement(statement2);
                if(doselementos.length != 1){
                    String statement3 = "UPDATE `ausencias` SET `recuperada` = '1', `Fecha_recuperacion` = '" + newFecha + "' WHERE `id_alumno` = '" + Alumno.getDNIFromName(doselementos[0]) + "' AND `id_claserecupera` = '" + Clase.generateClassIDFromDisplay(boxclase.getSelectedItem().toString()) + "' AND `recuperada` IS NULL";
                    DBConnection.getInstance().modificationStatement(statement3);
                }
            }
        }

        //Check if alumno added to ausentes and add
        for(int i = 0; i < newAusentes.size(); i++){
            if(!ausentes.contains(newAusentes.get(i))){
                String[] doselementos = newAusentes.get(i).split(" - ");
                if(doselementos.length == 1){
                    String statement1 = "INSERT INTO `ausencias` VALUES ('" + newID + "', '" + Alumno.getDNIFromName(doselementos[0]) + "', null, null, null)";
                    DBConnection.getInstance().modificationStatement(statement1);
                }else{
                    String statement1 = "UPDATE `ausencias` SET `recuperada` = null, `Fecha_recuperacion` = null WHERE `id_alumno` = '" + Alumno.getDNIFromName(doselementos[0]) + "' AND `id_claserecupera` = '" + Clase.generateClassIDFromDisplay(boxclase.getSelectedItem().toString()) + "' AND `recuperada` = '1'";
                    DBConnection.getInstance().modificationStatement(statement1);
                    String statement2 = "INSERT INTO `ausencias` VALUES ('" + newID + "', '" + Alumno.getDNIFromName(doselementos[0]) + "', '" + Clase.generateClassIDFromDisplay(boxclase.getSelectedItem().toString()) + "', null, 0)";
                    DBConnection.getInstance().modificationStatement(statement2);
                }
                String statement = "INSERT INTO `razonesausencias` VALUES ('" + Alumno.getDNIFromName(doselementos[0]) + "', '" + newID + "', null)";
                DBConnection.getInstance().modificationStatement(statement);
            }
        }

        //Delete and reupload presentes
        String statement1 = "DELETE FROM `registropresentes` WHERE `id_registroclase` = '" + newID + "'";
        DBConnection.getInstance().modificationStatement(statement1);
        for(int i = 0; i < newPresentes.size(); i++){
            String[] doselementos = newPresentes.get(i).split(" - ");
            String DNI = Alumno.getDNIFromName(doselementos[0]);
            if(doselementos.length != 1){
                String statement2 = "INSERT INTO `registropresentes` VALUES ('" + newID + "', '" + DNI + "', '1')";
                DBConnection.getInstance().modificationStatement(statement2);
            }else{
                String statement2 = "INSERT INTO `registropresentes` VALUES ('" + newID + "', '" + DNI + "', '0')";
                DBConnection.getInstance().modificationStatement(statement2);
            }
        }

        new PopupMessage("Registro actualizado con éxito", Color.GREEN).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnaplicarcambiosActionPerformed

    private void btneliminarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarregistroActionPerformed
        ConfirmMessage CM = new ConfirmMessage();
        CM.setIDClase(infoRegistro.get(0));
        CM.setER(this);
        CM.setType(ConfirmType.E_REGISTROCLASE);
        CM.setVisible(true);
    }//GEN-LAST:event_btneliminarregistroActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
    public static void main2(String args[]) {
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
            java.util.logging.Logger.getLogger(EditorRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditorRegistro().setVisible(true);
            }
        });
    }
    
    public void setInfo(List<String> info){
        //Get and save info of class
        this.infoRegistro = info;
        txtid.setText(info.get(0));
        txtfecha.setText(info.get(1));
        boxclase.setSelectedItem(info.get(2));
        
        
        //Get and set alumnos in presentes
        String statement1 = "SELECT * FROM `registropresentes` WHERE `id_registroclase` = '" + info.get(0) + "'";
        List<String[]> DNIAlumnosPresentes = DBConnection.getInstance().selectStatement(statement1, 3);
        for(int i = 0; i < DNIAlumnosPresentes.size(); i++){
            String statement2 = "SELECT `Nombre` FROM `alumnos` WHERE `DNI` = '" + DNIAlumnosPresentes.get(i)[1] + "'";
            List<String[]> nombresAlumnos = DBConnection.getInstance().selectStatement(statement2, 1);
            if("1".equals(DNIAlumnosPresentes.get(i)[2])){
                nombresAlumnos.get(0)[0] += " - RECUPERA";
            }
            modelPresentes.addRow(nombresAlumnos.get(0));
        }
        
        //Get and set alumnos in ausentes
        String statement3 = "SELECT * FROM `ausencias` WHERE `id_registroclase` = '" + info.get(0) + "'";
        List<String[]> DNIAlumnosAusentes = DBConnection.getInstance().selectStatement(statement3, 5);
        for(int i = 0; i < DNIAlumnosAusentes.size(); i++){
            String statement4 = "SELECT `Nombre` FROM `alumnos` WHERE `DNI` = '" + DNIAlumnosAusentes.get(i)[1] + "'";
            List<String[]> nombresAlumnos = DBConnection.getInstance().selectStatement(statement4, 1);
            if("0".equals(DNIAlumnosAusentes.get(i)[4])){
                nombresAlumnos.get(0)[0] += " - RECUPERA";
            }
            modelAusentes.addRow(nombresAlumnos.get(0));
            ausentes.add(nombresAlumnos.get(0)[0]);
        }
        
    }
    
    public void setBoxClases(){
        String statement = "SELECT * FROM `clasesemanal`";
        List<String[]> list = DBConnection.getInstance().selectStatement(statement, 7);
        
        DefaultComboBoxModel boxclasemodel = new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una clase" });
        boxclase.setModel(boxclasemodel);
        String itembox;
        
        for(int i = 0; i < list.size(); i++){
            String[] str = list.get(i);
            str[2] = Clase.setClassValue(str[2]);
            itembox = str[2] + " - " + str[3];
            if(boxclasemodel.getIndexOf(itembox) == -1){
                boxclase.addItem(itembox);
            }
        }
    }
    
    public void initModelPresentes(){
        modelPresentes.addColumn("Presentes");
        tablapresentes.setModel(modelPresentes);
    }
    public void initModelAusentes(){
        modelAusentes.addColumn("Ausentes");
        tablaausentes.setModel(modelAusentes);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxclase;
    private javax.swing.JButton btnaplicarcambios;
    private javax.swing.JButton btneliminarregistro;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaausentes;
    private javax.swing.JTable tablapresentes;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
