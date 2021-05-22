/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import editors.EditorRegistro;
import tools.PopupMessage;
import tools.Clase;
import tools.DBConnection;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edu
 */
public class ClaseFrame extends javax.swing.JFrame {
    DefaultTableModel model1 = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();
    DefaultTableModel model3 = new DefaultTableModel();
    DefaultTableModel model4 = new DefaultTableModel();

    /**
     * Creates new form MainFrame
     */
    public ClaseFrame() {
        initComponents();
        initModelConsultaAlumno();
        initModelListaAlumno();
        initModelListaSemanal();
        initModelRegistroClases();
        
        this.tablasemanal.setModel(model3);
        tablasemanal.setShowGrid(true);
        this.tablaregistro.setModel(model4);
        tablaregistro.setShowGrid(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablasemanal = new javax.swing.JTable();
        btnactualizarclases = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txthorario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        numclase = new javax.swing.JSpinner();
        boxdia = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txttematica = new javax.swing.JTextPane();
        btncrearclase = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaregistro = new javax.swing.JTable();
        btnactualizarregistro = new javax.swing.JButton();
        btnagregarregistro = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tablasemanal.setAutoCreateRowSorter(true);
        tablasemanal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablasemanal.setCellSelectionEnabled(true);
        tablasemanal.setSurrendersFocusOnKeystroke(true);
        tablasemanal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablasemanalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablasemanal);
        tablasemanal.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnactualizarclases.setText("Actualizar");
        btnactualizarclases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarclasesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnactualizarclases, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnactualizarclases, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Clases Semanales", jPanel8);

        jLabel8.setText("Horario: ");

        txthorario.setToolTipText("00:00");

        jLabel9.setText("Dia de la semana:");

        jLabel10.setText("N° de clase en el dia:");

        boxdia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" }));

        jLabel11.setText("Temática");

        jScrollPane7.setViewportView(txttematica);

        btncrearclase.setText("Crear");
        btncrearclase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearclaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txthorario, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numclase, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxdia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncrearclase, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txthorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(boxdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(numclase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btncrearclase, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Crear Clase Semanal", jPanel7);

        tablaregistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Dia de la semana", "Hora", "Alumnos esperados", "Ausentes"
            }
        ));
        tablaregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaregistroMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaregistro);

        btnactualizarregistro.setText("Actualizar");
        btnactualizarregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarregistroActionPerformed(evt);
            }
        });

        btnagregarregistro.setText("Agregar");
        btnagregarregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarregistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnagregarregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnactualizarregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactualizarregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregarregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Registro Clases", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnactualizarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarregistroActionPerformed
        // Deletes previous table
        int elitotal = tablaregistro.getRowCount();
        for(int i = elitotal-1; i>=0; i--){
            model4.removeRow(i);
        }
        
        //Creates new table
        String statement1 = "SELECT * FROM `registroclases`";
        String[] empty = new String[0];

        List<String[]> listaClase = DBConnection.getInstance().selectStatement(statement1, 4);
        
        for(int i = 0; i < listaClase.size(); i++){
            //Save base class info
            String[] str = listaClase.get(i);
            String ID = str[0];
            String fecha = str[1];
            String id_clase = str[2];
            String numero_alumnos = str[3];
            
            //Save class info
            String[] diahora = Clase.generateDisplayFromClassID(id_clase).split(" - ");
            String diasemana = diahora[0];
            String hora = diahora[1];
            
            //Save ausentes count
            String statement4 = "SELECT COUNT(*) AS count FROM `ausencias` WHERE `id_registroclase` = '" + ID + "'";
            List<String[]> numeroAusentes = DBConnection.getInstance().selectStatement(statement4, 1);
            String ausentes = numeroAusentes.get(0)[0];
            
            
            //Add the rows
            String[] infoRegistro = {ID, fecha, diasemana, hora, numero_alumnos, ausentes};
            model4.addRow(infoRegistro);
        }
        
        
    }//GEN-LAST:event_btnactualizarregistroActionPerformed

    private void btncrearclaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearclaseActionPerformed
        String horario = txthorario.getText();
        String dia = boxdia.getSelectedItem().toString();
        String num = numclase.getValue().toString();
        String tematica = txttematica.getText();

        // Checks if any value is null
        if(horario == null || "Seleccione".equals(dia) || "0".equals(num)){
            new PopupMessage("Error", Color.RED).setVisible(true);
            return;
        }
        if(horario.length() != 5 || horario.length() != 8){
            new PopupMessage("Error - Horario no valido", Color.RED).setVisible(true);
            return;
        }

        //Checks that created class doesn't already exist
        String diaDB = Clase.setDBValue(dia);
        List<String[]> list = DBConnection.getInstance().selectStatement("SELECT * FROM `clasesemanal`", 5);
        for(int i = 0; i < list.size(); i++){
            String[] str = list.get(i);
            if(diaDB.equals(str[1]) && horario.equals(str[2])){
            new PopupMessage("Error", Color.RED).setVisible(true);
                return;
            }
        }

        //Gets class ID and inserts class into database
        String[] doselementos = horario.split(":");
        String classID = Clase.generateClassID(dia, doselementos[0], doselementos[1]);
        String statement = "INSERT INTO `clasesemanal` VALUES ('";
        statement += classID + "', '" + diaDB + "', '" + horario + "', " + num + ", '0')";
        if(DBConnection.getInstance().modificationStatement(statement)){
            new PopupMessage("Clase agregada con exito", Color.GREEN).setVisible(true);
        }else{
            new PopupMessage("Error", Color.RED).setVisible(true);
            return;
        }
        
        //Inserts tematica
        if(tematica.trim().equals("")){
            String statement2 = "INSERT INTO `tematicaclases` VALUES('" + classID + "', null)";
            DBConnection.getInstance().modificationStatement(statement2);
        } else {
            String statement2 = "INSERT INTO `tematicaclases` VALUES('" + classID + "', '" + tematica + "')";
            DBConnection.getInstance().modificationStatement(statement2);
        }
            
        //Sets values back to empty
        txthorario.setText("");
        boxdia.setSelectedIndex(0);
        numclase.setValue(0);
        txttematica.setText("");

        //Checks if cell is already in use
        //-------------------------REVISAR ALGORITMO------------------------------------
        int intnum = Integer.parseInt(num);
        int intNumTableValue = intnum-1;
        try{
            while(tablasemanal.getValueAt((intNumTableValue), Integer.parseInt(diaDB)) != null){
                System.out.println("Cell not null values: ");
                System.out.println("    Row: " + intNumTableValue);
                System.out.println("    Column: " + diaDB);

                String selectstatement = "SELECT * FROM `clasesemanal` WHERE `diasemana` = '" + diaDB + "' AND `id` = '" + intnum + "'";
                List<String[]> results = DBConnection.getInstance().selectStatement(selectstatement, 5);
                String[] strRes = results.get(0);
                String diasemana = strRes[1];
                String horavieja = strRes[2];
                String numClase = strRes[3];

                int newNumClase = Integer.parseInt(numClase)+1;
                String stupdate = "UPDATE `clasesemanal` SET `ID` = '" + newNumClase + "' WHERE `clasesemanal`.`diasemana` = " + diasemana + " AND `clasesemanal`.`hora` = '" + horavieja + "'";
                DBConnection.getInstance().modificationStatement(stupdate);
                intnum++;
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btncrearclaseActionPerformed

    private void btnactualizarclasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarclasesActionPerformed
        //Deletes previous table
        int elitotal = tablasemanal.getRowCount();
        for(int i = elitotal-1; i>=0; i--){
            model3.removeRow(i);
        }

        Clase.updateClassNumber();
        
        //Creates new table
        String statement = "SELECT * FROM `clasesemanal`";
        String[] empty = new String[0];

        List<String[]> list = DBConnection.getInstance().selectStatement(statement, 5);
        for(int i = 0; i < list.size(); i++){
            //Save the info
            String[] str = list.get(i);
            String diasemana = str[1];
            String hora = str[2];
            String num = str[3];
            String cantidad = str[4];

            //Add the rows
            int diasemanaInt = Integer.parseInt(diasemana);
            int numDBValue = Integer.parseInt(num)-1;
            int numeroUltimaFila = tablasemanal.getRowCount()-1;

            if(numeroUltimaFila > numDBValue+1){
                model3.setValueAt(hora + " - Ver Alumnos(" + cantidad + ")", numDBValue, diasemanaInt);
            }else{
                for(int l = numDBValue - numeroUltimaFila; l > 0; l--){
                    model3.addRow(empty);
                }
                model3.setValueAt(hora + " - Ver Alumnos(" + cantidad + ")", numDBValue, diasemanaInt);
            }
        }
    }//GEN-LAST:event_btnactualizarclasesActionPerformed

    private void tablasemanalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablasemanalMouseClicked
        if(tablasemanal.getValueAt(tablasemanal.getSelectedRow(), tablasemanal.getSelectedColumn()) != null){
            String doselementos[] = tablasemanal.getValueAt(tablasemanal.getSelectedRow(), tablasemanal.getSelectedColumn()).toString().split(" - ");
            String statement = "SELECT * FROM `clasesemanal` AS t1 INNER JOIN `tematicaclases` AS t2 ON t1.ID = t2.id_clase WHERE `hora` = '" + doselementos[0] + "' AND `diasemana` = " + tablasemanal.getSelectedColumn() + " ";
            List<String[]> list = DBConnection.getInstance().selectStatement(statement, 7);

            ViewerClaseSemanal VCS = new ViewerClaseSemanal();
            VCS.setClase(list.get(0));
            VCS.setAlumnos();
            VCS.setAnotaciones();
            VCS.setTabla(tablasemanal);
            VCS.setVisible(true);
        }
    }//GEN-LAST:event_tablasemanalMouseClicked

    private void btnagregarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarregistroActionPerformed
        CreadorRegistro CR = new CreadorRegistro();
        CR.setVisible(true);
    }//GEN-LAST:event_btnagregarregistroActionPerformed

    private void tablaregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaregistroMouseClicked
        List<String> info = new ArrayList();
        info.add(tablaregistro.getValueAt(tablaregistro.getSelectedRow(), 0).toString());
        info.add(tablaregistro.getValueAt(tablaregistro.getSelectedRow(), 1).toString());
        String diaclase = tablaregistro.getValueAt(tablaregistro.getSelectedRow(), 2).toString();
        String horaclase = tablaregistro.getValueAt(tablaregistro.getSelectedRow(), 3).toString();
        info.add(diaclase + " - " + horaclase);
        
        EditorRegistro ER = new EditorRegistro();
        ER.setInfo(info);
        ER.setVisible(true);
    }//GEN-LAST:event_tablaregistroMouseClicked

    private void initModelConsultaAlumno(){
        model1.addColumn("Nombre");
        model1.addColumn("DNI");
        model1.addColumn("Telefono");
        model1.addColumn("Mail");
        model1.addColumn("Edad");
        model1.addColumn("Estado");
    }
    private void initModelListaAlumno(){
        model2.addColumn("Nombre");
        model2.addColumn("DNI");
        model2.addColumn("Mail");
        model2.addColumn("Telefono");
        model2.addColumn("Edad");
        model2.addColumn("Fecha inicio");
        model2.addColumn("Estado");
    }
    private void initModelListaSemanal(){
        model3.addColumn("Lunes");
        model3.addColumn("Martes");
        model3.addColumn("Miercoles");
        model3.addColumn("Jueves");
        model3.addColumn("Viernes");
        model3.addColumn("Sabado");
        tablasemanal.setRowHeight(50);
    }
    private void initModelRegistroClases(){
        model4.addColumn("ID");
        model4.addColumn("Fecha");
        model4.addColumn("Dia de la Semana");
        model4.addColumn("Hora");
        model4.addColumn("Alumnos esperados");
        model4.addColumn("Ausentes");
    }
    
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
            java.util.logging.Logger.getLogger(ClaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClaseFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxdia;
    private javax.swing.JButton btnactualizarclases;
    private javax.swing.JButton btnactualizarregistro;
    private javax.swing.JButton btnagregarregistro;
    private javax.swing.JButton btncrearclase;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable4;
    private javax.swing.JSpinner numclase;
    private javax.swing.JTable tablaregistro;
    private javax.swing.JTable tablasemanal;
    private javax.swing.JTextField txthorario;
    private javax.swing.JTextPane txttematica;
    // End of variables declaration//GEN-END:variables
}