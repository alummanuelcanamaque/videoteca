
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel Cañamaque
 */
public class Ventana extends javax.swing.JFrame {    
    ListaPeliculas lista = new ListaPeliculas();
    
    public Ventana() {
        initComponents();
        modificar.setEnabled(false);
        borrar.setEnabled(false);
    }
    
    private void limpiarCampos(){
        titulo.setText("");
        director.setText("");
        año.setText("");
        posicion.setText("");
    }
    
    private void mostrarLista() {
        if(lista.getListaPeliculas().length!=0){
            listado.setListData(lista.getListaPeliculas());
        }else{
            listado.setListData(new String[0]);
        }
        
    }
    private void activarCampos(Boolean activar){
        titulo.setEnabled(activar);
        director.setEnabled(activar);
        año.setEnabled(activar);
        posicion.setEnabled(activar);
        guardar.setEnabled(activar);
        modificar.setEnabled(activar);
        buscar.setEnabled(activar);
        borrar.setEnabled(activar);
        eliminar_Todo.setEnabled(activar);
        
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
        titulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        director = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        posicion = new javax.swing.JTextField();
        borrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar_Todo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listado = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Titulo:");

        jLabel2.setText("Director:");

        jLabel3.setText("Año:");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel4.setText("Posicion:");

        posicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicionActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar_Todo.setText("Eliminar todas las peliculas");
        eliminar_Todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_TodoActionPerformed(evt);
            }
        });

        listado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(director, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(titulo)
                                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(eliminar_Todo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar_Todo)
                    .addComponent(borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try{            
            int añadir=0;
            if(!titulo.getText().isEmpty() && !director.getText().isEmpty() && !año.getText().isEmpty() && posicion.getText().isEmpty()){
                añadir=1;
            }else{
                if(!titulo.getText().isEmpty() || !director.getText().isEmpty() || !año.getText().isEmpty() && !posicion.getText().isEmpty()){
                añadir=2;
                }
            }
            switch(añadir){
                case 0:
                   JOptionPane.showMessageDialog(this, "Relleno los campos Titulo, Director y Año como minimo");
                    break;
                case 1:
                    lista.anadirPelicula(titulo.getText(), director.getText(), año.getText());
                    break;
                case 2:
                    lista.anadirPelicula(titulo.getText(), director.getText(), año.getText(), Integer.valueOf(posicion.getText()));
                    break;
            }
            
            mostrarLista();
            limpiarCampos();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "La posición debe ser un número entero");
        }
        
    }//GEN-LAST:event_guardarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if(listado.getSelectedIndex()!=-1) {              
            lista.modificarListaPeliculas(titulo.getText(), director.getText(), año.getText(), listado.getSelectedIndex());
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Debe seleccionar la linea a modificar",
                    "Atención",
                    JOptionPane.WARNING_MESSAGE);
        }
        activarCampos(true);
        modificar.setEnabled(false);
        borrar.setEnabled(false);
        mostrarLista();
        limpiarCampos();
    }//GEN-LAST:event_modificarActionPerformed

    private void posicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicionActionPerformed
    
    }//GEN-LAST:event_posicionActionPerformed

    private void listadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadoMouseClicked
        if(evt.getButton()==MouseEvent.BUTTON1 && evt.getClickCount()==2) {
            Pelicula pelicula = (Pelicula)listado.getSelectedValue();
            titulo.setText(pelicula.getTitulo());
            director.setText(pelicula.getDirector());
            año.setText(pelicula.getAño());
            posicion.setText(""+listado.getSelectedIndex());
            activarCampos(false);
            modificar.setEnabled(true);
            borrar.setEnabled(true);
            titulo.setEnabled(true);
            director.setEnabled(true);
            año.setEnabled(true);
            
        }
    }//GEN-LAST:event_listadoMouseClicked

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if(listado.getSelectedIndex()!=-1) { 
            Pelicula pelicula = (Pelicula)listado.getSelectedValue();
            lista.borrarLineaPelicula(pelicula);
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Debe seleccionar la linea a eliminar",
                    "Atención",
                    JOptionPane.WARNING_MESSAGE);
        }
        activarCampos(true);
        modificar.setEnabled(false);
        borrar.setEnabled(false);
        mostrarLista();
        limpiarCampos();
    }//GEN-LAST:event_borrarActionPerformed

    private void eliminar_TodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_TodoActionPerformed
        lista.borrarTodo();
        mostrarLista();
    }//GEN-LAST:event_eliminar_TodoActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        mostrarLista();
//        listado.setSelectedIndex(lista.buscar(titulo.getText()));
        listado.setSelectedIndices(lista.buscar(titulo.getText()));
    }//GEN-LAST:event_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField año;
    private javax.swing.JButton borrar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField director;
    private javax.swing.JButton eliminar_Todo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listado;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField posicion;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
