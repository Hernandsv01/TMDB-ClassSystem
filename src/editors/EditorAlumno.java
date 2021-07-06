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
import tools.Clase;
import tools.ConfirmMessage;
import tools.DBConnection;
import tools.PopupMessage;

/**
 *
 * @author Edu
 */
public class EditorAlumno extends javax.swing.JFrame {
    
    private String[] infoAlumno;
    //Content: 0.DNI, 1.Nombre, 2.Mail, 3.Telefono, 4.FechaNacimiento, 5.FechaInicio, 6.Estado, 7.Anotaciones
    private final List<String> listClases = new ArrayList();
    private String anotaciones;
    private DefaultComboBoxModel boxclasemodel;
    private final DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form EditorAlumno
     */
    public EditorAlumno() {
        initComponents();
        initModelClasesAlumno();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txttelefono = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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
        btnagregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaclasesalumno = new javax.swing.JTable();
        txtnacimiento = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel20.setText("Anotaciones");

        jLabel12.setText("DNI");

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

        btneliminar.setBackground(new java.awt.Color(255, 0, 0));
        btneliminar.setText("Eliminar alumno");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel22.setText("Clase");

        boxclase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lista de clases" }));

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        tablaclasesalumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaclasesalumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clase"
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
        tablaclasesalumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclasesalumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaclasesalumno);

        txtnacimiento.setToolTipText("aaaa/mm/dd");

        jLabel23.setText("Fecha nacimiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtnacimiento)
                                .addComponent(txtfechainicio)
                                .addComponent(txtmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txttelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdni, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtalumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boxestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnaplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxclase, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnagregar)
                        .addGap(84, 84, 84)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnaplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxclase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnagregar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
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
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaplicarActionPerformed
        boolean isFirst = true;
        boolean changedDNI = false;
        List<String[]> infoComentarios = new ArrayList();
        List<String[]> infoRegistroPresentes = new ArrayList();
        List<String[]> infoRazonesAusencias = new ArrayList();
        List<String[]> infoAusencias = new ArrayList();
        List<String[]> infoClasesAlumnos = new ArrayList();
        
        List<String> newClases = new ArrayList();
        for(int i = 0; i < tablaclasesalumno.getRowCount(); i++){
            newClases.add(tablaclasesalumno.getValueAt(i, 0).toString());
        }
        
        String statement = "UPDATE `alumnos` SET ";
        
        //If info empty then = null
        for(int i = 0; i < infoAlumno.length; i++){
            if(infoAlumno[i] == null){
                infoAlumno[i] = "";
            }
        }
        
        if(!txtalumno.getText().equals(infoAlumno[1])){
            if(!isFirst){
                statement += ", ";
            }
            if(txtalumno.getText().equals("")){
                statement += "`nombre` = null ";
            }else{
                statement += "`nombre` = '" + txtalumno.getText().toUpperCase() + "' ";
            }
            isFirst = false;
        }
        if(!txtdni.getText().equals(infoAlumno[0])){
            if(!isFirst){
                statement += ", ";
            }
            statement += "`dni` = '" + txtdni.getText() + "' ";
            
            //Save and delete info of tables with DNI
            String statement1 = "SELECT * FROM `comentariosalumnos` WHERE `dni_alumno` = '" + infoAlumno[0] + "'";
            infoComentarios = DBConnection.getInstance().selectStatement(statement1, 2);
            statement1 = "SELECT * FROM `registropresentes` WHERE `dni_alumno` = '" + infoAlumno[0] + "'";
            infoRegistroPresentes = DBConnection.getInstance().selectStatement(statement1, 3);
            statement1 = "SELECT * FROM `razonesausencias` WHERE `dni_alumno` = '" + infoAlumno[0] + "'";
            infoRazonesAusencias = DBConnection.getInstance().selectStatement(statement1, 3);
            statement1 = "SELECT * FROM `ausencias` WHERE `id_alumno` = '" + infoAlumno[0] + "'";
            infoAusencias = DBConnection.getInstance().selectStatement(statement1, 5);
            statement1 = "SELECT * FROM `clasesalumnos` WHERE `dni_alumno` = '" + infoAlumno[0] + "'";
            infoClasesAlumnos = DBConnection.getInstance().selectStatement(statement1, 3);
            statement1 = "DELETE FROM `comentariosalumnos` WHERE `dni_alumno` = '" + infoAlumno[0] + "'";
            DBConnection.getInstance().selectStatement(statement1, 0);
            statement1 = "DELETE FROM `registropresentes` WHERE `dni_alumno` = '" + infoAlumno[0] + "'";
            DBConnection.getInstance().selectStatement(statement1, 0);
            statement1 = "DELETE FROM `razonesausencias` WHERE `dni_alumno` = '" + infoAlumno[0] + "'";
            DBConnection.getInstance().selectStatement(statement1, 0);
            statement1 = "DELETE FROM `ausencias` WHERE `id_alumno` = '" + infoAlumno[0] + "'";
            DBConnection.getInstance().selectStatement(statement1, 0);
            statement1 = "DELETE FROM `clasesalumnos` WHERE `dni_alumno` = '" + infoAlumno[0] + "'";
            DBConnection.getInstance().selectStatement(statement1, 0);
            
            changedDNI = true;
            isFirst = false;
        }
        if(!txttelefono.getText().equals(infoAlumno[3])){
            if(!isFirst){
                statement += ", ";
            }
            if(txttelefono.getText().equals("")){
                statement += "`telefono` = null ";
            }else{
                statement += "`telefono` = '" + txttelefono.getText() + "' ";
            }
            isFirst = false;
        }
        if(!txtmail.getText().equals(infoAlumno[2])){
            if(!isFirst){
                statement += ", ";
            }
            if(txtmail.getText().equals("")){
                statement += "`mail` = null ";
            }else{
                statement += "`mail` = '" + txtmail.getText().toUpperCase() + "' ";
            }
            isFirst = false;
        }
        if(!txtnacimiento.getText().equals(infoAlumno[4])){
            if(!isFirst){
                statement += ", ";
            }
            if(txtnacimiento.getText().equals("")){
                statement += "`fechanacimiento` = null ";
            }else{
                statement += "`fechanacimiento` = '" + txtnacimiento.getText() + "' ";
            }
            isFirst = false;
        }
        if(!txtfechainicio.getText().equals(infoAlumno[5])){
            if(!isFirst){
                statement += ", ";
            }
            statement += "`fechainicio` = '" + txtfechainicio.getText() + "' ";
            isFirst = false;
        }
        if(!boxestado.getSelectedItem().toString().equals(infoAlumno[6])){
            if(!isFirst){
                statement += ", ";
            }
            if("Activo".equals(infoAlumno[6])){
                String delstatement = "DELETE FROM `clasesalumnos` WHERE `dni_alumno` = '" + infoAlumno[0] + "'";
                DBConnection.getInstance().modificationStatement(delstatement);
            }
            if("Activo".equals(boxestado.getSelectedItem().toString())){
                statement += "`estado` = '1' ";
            }else{
                statement += "`estado` = '0' ";
            }
            isFirst = false;
        }
        statement += "WHERE `alumnos`.`DNI` = " + infoAlumno[0];
        if(!isFirst){
            if(!DBConnection.getInstance().modificationStatement(statement)){
                new PopupMessage("Error", Color.RED).setVisible(true);
                return;
            }
        }
        
        //Re-insert info if changedDNI
        if(changedDNI){
            for(int i = 0; i < infoComentarios.size(); i++){
                String statement1 = "INSERT INTO `comentariosalumnos` VALUES ('" + txtdni.getText() + "', '" + infoComentarios.get(i)[1] + "')";
                DBConnection.getInstance().modificationStatement(statement1);
            }
            for(int i = 0; i < infoRegistroPresentes.size(); i++){
                String statement1 = "INSERT INTO `registropresentes` VALUES ('" + infoRegistroPresentes.get(i)[0] + "', '" + txtdni.getText() + "', '" + infoRegistroPresentes.get(i)[2] + "')";
                DBConnection.getInstance().modificationStatement(statement1);
            }
            for(int i = 0; i < infoAusencias.size(); i++){
                String statement1 = "INSERT INTO `ausencias` VALUES ('" + infoAusencias.get(i)[0] + "', '" + txtdni.getText() + "', '" + infoAusencias.get(i)[2] + "', " + infoAusencias.get(i)[3] + ", " + infoAusencias.get(i)[4] + ")";
                DBConnection.getInstance().modificationStatement(statement1);
            }
            for(int i = 0; i < infoRazonesAusencias.size(); i++){
                String statement1 = "INSERT INTO `razonesausencias` VALUES ('" + txtdni.getText() + "', '" + infoRazonesAusencias.get(i)[1] + "', '" + infoRazonesAusencias.get(i)[2] + "')";
                DBConnection.getInstance().modificationStatement(statement1);
            }
            for(int i = 0; i < infoClasesAlumnos.size(); i++){
                String statement1 = "INSERT INTO `clasesalumnos` VALUES ('" + txtdni.getText() + "', '" + infoClasesAlumnos.get(i)[1] + "', '" + infoClasesAlumnos.get(i)[2] + "')";
                DBConnection.getInstance().modificationStatement(statement1);
            }
        }
        
        //Check if changed anotaciones
        if(!txtanotaciones.getText().equals(anotaciones)){
            if(txtanotaciones.getText().trim().length() != 0){
                String statement1 = "UPDATE `comentariosalumnos` SET `comentario` = '" + txtanotaciones.getText() + "' WHERE `dni_alumno` = '" + txtdni.getText() + "'";
                DBConnection.getInstance().modificationStatement(statement1);
            }else{
                String statement1 = "UPDATE `comentariosalumnos` SET `comentario` = null WHERE `dni_alumno` = '" + txtdni.getText() + "'";
                DBConnection.getInstance().modificationStatement(statement1);
            }
        }
        
        //Check if added classes
        for(int i = 0; i < newClases.size(); i++){
            if(!listClases.contains(newClases.get(i))){
                String ID = Clase.generateClassIDFromDisplay(newClases.get(i));
                String statement1 = "INSERT INTO `clasesalumnos` VALUES ('" + txtdni.getText() + "', '" + ID + "', 0)";
                DBConnection.getInstance().modificationStatement(statement1);
            }
        }
        //Check if removed classes
        for(int i = 0; i < listClases.size(); i++){
            if(!newClases.contains(listClases.get(i))){
                String ID = Clase.generateClassIDFromDisplay(listClases.get(i));
                String statement1 = "DELETE FROM `clasesalumnos` WHERE `dni_alumno` = '" + txtdni.getText() + "' AND `id_clase` = '" + ID + "'";
                DBConnection.getInstance().modificationStatement(statement1);
            }
        }
        
        new PopupMessage("Alumno actualizado con éxito", Color.GREEN).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnaplicarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        ConfirmMessage cm = new ConfirmMessage();
        cm.setEA(this);
        cm.setDNI(infoAlumno[0]);
        cm.setType(ConfirmType.E_ALUMNO);
        cm.setVisible(true);
    }//GEN-LAST:event_btneliminarActionPerformed

    private void boxestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxestadoActionPerformed
        if("Inactivo".equals(boxestado.getSelectedItem().toString())){
            boxclase.setSelectedIndex(0);
            boxclase.setEnabled(false);
            btnagregar.setEnabled(false);
        }else{
            boxclase.setEnabled(true);
            btnagregar.setEnabled(true);
        }
    }//GEN-LAST:event_boxestadoActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        if(boxclase.getSelectedItem().toString().equals("Lista de clases")){
            new PopupMessage("Error", Color.RED).setVisible(true);
            return;
        }
        
        String[] str = {boxclase.getSelectedItem().toString()};
        int index = boxclase.getSelectedIndex();
        model.addRow(str);
        
        //Check if exceeds max number (12 normally, 24 on fridays(dia == 4))
        String selstatement1 = "SELECT * FROM `clasesemanal` WHERE `ID` = '" + Clase.generateClassIDFromDisplay(boxclase.getSelectedItem().toString()) + "'";
        List<String[]> dia = DBConnection.getInstance().selectStatement(selstatement1, 7);
        if(dia.get(0)[2].equals("4")){
            String selstatement2 = "SELECT COUNT(*) FROM `clasesalumnos` WHERE `id_clase` = '" + Clase.generateClassIDFromDisplay(boxclase.getSelectedItem().toString()) + "'";
            List<String[]> number = DBConnection.getInstance().selectStatement(selstatement2, 1);
            if(Integer.parseInt(number.get(0)[0]) >= 24){
                new PopupMessage("Maximo numero de alumnos alcanzado", Color.YELLOW).setVisible(true);
            }
        }else{
            String selstatement2 = "SELECT COUNT(*) FROM `clasesalumnos` WHERE `id_clase` = '" + Clase.generateClassIDFromDisplay(boxclase.getSelectedItem().toString()) + "'";
            List<String[]> number = DBConnection.getInstance().selectStatement(selstatement2, 1);
            if(Integer.parseInt(number.get(0)[0]) >= 12){
                new PopupMessage("Maximo numero de alumnos alcanzado", Color.YELLOW).setVisible(true);
            }
        }
        
        boxclase.setSelectedIndex(0);
        boxclase.removeItemAt(index);
        
    }//GEN-LAST:event_btnagregarActionPerformed

    private void tablaclasesalumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclasesalumnoMouseClicked
        String claseSelec = tablaclasesalumno.getValueAt(tablaclasesalumno.getSelectedRow(), 0).toString();
        model.removeRow(tablaclasesalumno.getSelectedRow());
        boxclase.addItem(claseSelec);
    }//GEN-LAST:event_tablaclasesalumnoMouseClicked

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
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditorAlumno().setVisible(true);
            }
        });
    }
    
    public void setInfo(String[] str){
        this.infoAlumno = str;
        txtdni.setText(str[0]);
        txtalumno.setText(str[1]);
        txtmail.setText(str[2]);
        txttelefono.setText(str[3]);
        txtfechainicio.setText(str[5]);
        
        txtnacimiento.setText(infoAlumno[4]);
        if("Activo".equals(str[6])){
            boxestado.setSelectedIndex(0);
        }else{
            boxestado.setSelectedIndex(1);
        }
    }
    
    public void setOpcionesClases(List<String[]> listaClases) {
        boxclasemodel = new javax.swing.DefaultComboBoxModel<>(new String[] { "Lista de clases" });
        boxclase.setModel(boxclasemodel);
        String itembox;
        for (String[] listClase : listaClases) {
            itembox = listClase[2] + " - " + listClase[3];
            if (boxclasemodel.getIndexOf(itembox) == -1) {
                boxclase.addItem(itembox);
            }
        }
        
        if(listClases != null){
            for(int i = 0; i < listClases.size(); i++){
                boxclase.removeItem(listClases.get(i));
            }
        }
    }
    public void setClasesAlumno(){
        String statement1 = "SELECT * FROM `clasesalumnos` WHERE `dni_alumno` = '" + infoAlumno[0] + "'";
        List<String[]> list = DBConnection.getInstance().selectStatement(statement1, 3);
        for(int i = 0; i < list.size(); i++){
            String[] str1 = list.get(i);
            
            String statement2 = "SELECT * FROM `clasesemanal` WHERE `ID` = '" + str1[1] + "'";
            List<String[]> list2 = DBConnection.getInstance().selectStatement(statement2, 5);
            String classDisplay = Clase.generateDisplayFromClassID(list2.get(0)[0]);
            classDisplay += ":00";
            listClases.add(classDisplay);
            String[] item = {classDisplay};
            model.addRow(item);
        }
    }
    public void setAnotaciones(){
        String dni = infoAlumno[0];
        String statement = "SELECT * FROM `comentariosalumnos` WHERE `dni_alumno` = '" + dni + "'";
        List<String[]> anoList = DBConnection.getInstance().selectStatement(statement, 2);
        anotaciones = anoList.get(0)[1];
        txtanotaciones.setText(anotaciones);
    }
    
    private void initModelClasesAlumno(){
        model.addColumn("Clase");
        tablaclasesalumno.setRowHeight(20);
        tablaclasesalumno.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxclase;
    private javax.swing.JComboBox<String> boxestado;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnaplicar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tablaclasesalumno;
    private javax.swing.JTextField txtalumno;
    private javax.swing.JTextArea txtanotaciones;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtfechainicio;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtnacimiento;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

}
