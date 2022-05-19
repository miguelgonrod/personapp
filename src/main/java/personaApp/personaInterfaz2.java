/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package personaApp;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author miguel
 */
public class personaInterfaz2 extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    /**
     * Creates new form personaInterfaz2
     */
    public personaInterfaz2() {
        initComponents();
        this.setLocationRelativeTo(null);
        MostrarTabla();
    }
   
    void MostrarTabla(){
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Edad");
        modelo.addColumn("Genero");
        modelo.addColumn("Cedula");
        this.jtPersonas.setModel(modelo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gru_botones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gen_f = new javax.swing.JRadioButton();
        gen_m = new javax.swing.JRadioButton();
        gen_o = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        txt_cc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Edad");

        jLabel4.setText("Genero");

        gru_botones.add(gen_f);
        gen_f.setText("F");
        gen_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_fActionPerformed(evt);
            }
        });

        gru_botones.add(gen_m);
        gen_m.setText("M");
        gen_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_mActionPerformed(evt);
            }
        });

        gru_botones.add(gen_o);
        gen_o.setText("O");
        gen_o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_oActionPerformed(evt);
            }
        });

        jLabel5.setText("C. C");

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Contar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Modificar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Ir a telefono");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Salir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        jtPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtPersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton1)
                                    .addComponent(gen_m, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gen_f)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(gen_o)
                                .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_cc, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gen_m)
                    .addComponent(gen_f)
                    .addComponent(gen_o))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gen_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gen_fActionPerformed

    private void gen_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gen_mActionPerformed

    private void gen_oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_oActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gen_oActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        gru_botones.add(gen_m);
        gru_botones.add(gen_f);
        gru_botones.add(gen_o);
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/persona_22_db", "persona_app", "123");
            PreparedStatement pst = cn.prepareStatement("INSERT INTO persona VALUES (?,?,?,?,?)");
            
            pst.setString(1, txt_cc.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_apellido.getText().trim());
            pst.setString(4, txt_edad.getText().trim());
            if(gen_m.isSelected()){pst.setString(5, "M");}
            else if(gen_f.isSelected()){pst.setString(5, "F");}
            else if(gen_o.isSelected()){pst.setString(5, "O");}
            
            if(!txt_cc.getText().trim().equals("") && !txt_nombre.getText().trim().equals("") && !txt_apellido.getText().trim().equals("") && (gen_m.isSelected() || gen_f.isSelected() || gen_o.isSelected())){
                pst.executeUpdate();

                txt_cc.setText("");
                txt_nombre.setText("");
                txt_apellido.setText("");
                txt_edad.setText("");
                JOptionPane.showMessageDialog(null,"El registro se ha guardado correctamente");
            }
            else{
                if(txt_cc.getText().trim().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe ingresar un numero de cedula");
                }
                if(txt_nombre.getText().trim().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe ingresar un nombre");
                }
                if(txt_apellido.getText().trim().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe ingresar un apellido");
                }
                if (!(gen_m.isSelected() || gen_f.isSelected() || gen_o.isSelected())){
                    JOptionPane.showMessageDialog(null,"Debe selecionar un genero");
                }
            }
   
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/persona_22_db","persona_app","123");
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM persona WHERE cedula = ?");
            pst.setString(1, txt_cc.getText().trim());
            
            ResultSet rs = pst.executeQuery();
                    
            if(rs.next()){
                txt_nombre.setText(rs.getString("nombre"));
                txt_apellido.setText(rs.getString("apellido"));
                txt_edad.setText(rs.getString("edad"));
                if(rs.getString("genero").equals("M")){
                    gen_m.setSelected(true);
                }
                else if(rs.getString("genero").equals("F")){
                    gen_f.setSelected(true);
                }
                else if(rs.getString("genero").equals("O")){
                    gen_o.setSelected(true);
                }
                // txt_nombre.setText(rs.getString("genero")); revisar como seleccionar los circulos de genero
            }else{
                JOptionPane.showMessageDialog(null, "Cedula no encontrada");
            }
            
        }catch(Exception e){
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try{
            jtPersonas.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/persona_22_db", "persona_app", "123");
            String sql = "SELECT nombre, apellido, edad, genero, cedula FROM persona";
            PreparedStatement pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            
            
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                
                for(int i = 0; i < cantidadColumnas; i++){
                    filas[i] = rs.getObject(i + 1);
                }
                
                modelo.addRow(filas);
            }
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/persona_22_db", "persona_app", "123");
            String sql = "SELECT nombre, apellido, edad, genero, cedula FROM persona";
            PreparedStatement pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();    
            
            int cantPersonas = 0;
            
            while(rs.next()){
                cantPersonas++;
            }
            JOptionPane.showMessageDialog(null, "Hay " + cantPersonas+" registros");
        }catch(SQLException ex){
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            String cedula_val = txt_cc.getText().trim();
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/persona_22_db", "persona_app", "123");
            PreparedStatement pst = cn.prepareStatement("UPDATE persona SET nombre = ?, apellido = ?, edad = ?, genero = ? WHERE cedula = " + cedula_val);
            
            pst.setString(1, txt_nombre.getText().trim());
            pst.setString(2, txt_apellido.getText().trim());
            pst.setString(3, txt_edad.getText().trim());
            if(gen_m.isSelected()){
                pst.setString(4, "M");
            }
            else if(gen_f.isSelected()){
                pst.setString(4, "F");
            }
            else if(gen_o.isSelected()){
                pst.setString(4, "O");
            }
            
            if(!txt_cc.getText().trim().equals("") && !txt_nombre.getText().trim().equals("") && !txt_apellido.getText().trim().equals("") && (gen_m.isSelected() || gen_f.isSelected() || gen_o.isSelected())){
                pst.executeUpdate();

                txt_cc.setText("");
                txt_nombre.setText("");
                txt_apellido.setText("");
                txt_edad.setText("");
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            }
            else{
                if(txt_cc.getText().trim().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe ingresar un numero de cedula");
                }
                if(txt_nombre.getText().trim().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe ingresar un nombre");
                }
                if(txt_apellido.getText().trim().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe ingresar un apellido");
                }
                if (!(gen_m.isSelected() || gen_f.isSelected() || gen_o.isSelected())){
                    JOptionPane.showMessageDialog(null,"Debe selecionar un genero");
                }
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/persona_22_db", "persona_app", "123");
            PreparedStatement pst = cn.prepareStatement("DELETE FROM persona WHERE cedula = ?");
            
            pst.setString(1, txt_cc.getText().trim());
            pst.executeUpdate();
            
            txt_cc.setText("");
            txt_nombre.setText("");
            txt_apellido.setText("");
            txt_edad.setText("");
            
            JOptionPane.showMessageDialog(null, "El registro fue eliminado");
            
        }catch(Exception e){
        
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        telefonoInterfaz telefono = new telefonoInterfaz();
        telefono.setVisible(true);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(personaInterfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personaInterfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personaInterfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personaInterfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personaInterfaz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton gen_f;
    private javax.swing.JRadioButton gen_m;
    private javax.swing.JRadioButton gen_o;
    private javax.swing.ButtonGroup gru_botones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPersonas;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cc;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
