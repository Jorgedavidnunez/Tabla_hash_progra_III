/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.HashMap;
import java.util.StringTokenizer;


/**
 *
 * @author david
 */
public class frm_tabla_hash extends javax.swing.JFrame {
HashMap<String,String> hash;
    /**
     * Creates new form tabla_hash
     */
    public frm_tabla_hash() {
        initComponents();
        hash = new HashMap();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_entrada = new javax.swing.JTextArea();
        btn_agregar = new javax.swing.JButton();
        btn_mostrar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_texto = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_salida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        txt_entrada.setBackground(new java.awt.Color(0, 0, 0));
        txt_entrada.setColumns(20);
        txt_entrada.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_entrada.setForeground(new java.awt.Color(0, 255, 51));
        txt_entrada.setRows(5);
        txt_entrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jScrollPane1.setViewportView(txt_entrada);

        btn_agregar.setBackground(new java.awt.Color(0, 204, 0));
        btn_agregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_mostrar.setBackground(new java.awt.Color(51, 153, 255));
        btn_mostrar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_mostrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostrar.setText("Mostrar");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(255, 102, 0));
        btn_limpiar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(0, 255, 51));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTabbedPane1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        txt_texto.setBackground(new java.awt.Color(0, 0, 0));
        txt_texto.setColumns(20);
        txt_texto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_texto.setForeground(new java.awt.Color(0, 255, 51));
        txt_texto.setRows(5);
        txt_texto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jScrollPane2.setViewportView(txt_texto);

        jTabbedPane1.addTab("Texto", jScrollPane2);

        txt_salida.setBackground(new java.awt.Color(0, 0, 0));
        txt_salida.setColumns(20);
        txt_salida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_salida.setForeground(new java.awt.Color(0, 255, 51));
        txt_salida.setRows(5);
        txt_salida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jScrollPane3.setViewportView(txt_salida);

        jTabbedPane1.addTab("Salida Consola", jScrollPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btn_agregar)
                .addGap(18, 18, 18)
                .addComponent(btn_mostrar)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar)
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_mostrar)
                    .addComponent(btn_limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
       
        hash.clear();
        int fila = 0;
        String eToken = "",ePuntocoma, clave;
        String entrada = txt_entrada.getText();
        StringTokenizer st = new StringTokenizer(entrada,"\n");
        txt_salida.setText("");
        while(st.hasMoreElements()){
            Object elemento = st.nextElement();
            eToken = elemento.toString();
            StringTokenizer st2 = new StringTokenizer(eToken," ");
            while(st2.hasMoreElements()){
                Object elementoToken = st2.nextElement();
                //System.out.println(elementoToken);
                //System.out.println(String.valueOf(fila) + String.valueOf(eToken.indexOf(elementoToken.toString())));
                ePuntocoma = elementoToken.toString();
                StringTokenizer stp = new StringTokenizer(ePuntocoma,";",true);
                while(stp.hasMoreElements()){
                    Object elementop = stp.nextElement();
                    clave = String.valueOf(fila) + String.valueOf(eToken.indexOf(elementop.toString()));
                    hash.put(clave, elementop.toString());
                    //System.out.println("Ingreso Exitoso\n" + hash);
                    txt_salida.append("Ingreso Exitoso\n" + hash +"\n");
                }
                /*clave = String.valueOf(fila) + String.valueOf(eToken.indexOf(elementoToken.toString()));
                hash.put(clave, elementoToken.toString());
                System.out.println("Ingreso Exitoso\n" + hash);*/
            }
            fila += 1;
            txt_texto.setText("");
            txt_texto.setText(entrada);
            txt_entrada.setText("");
            
            //System.out.println(elemento);
            //System.out.println(entrada.indexOf(elemento.toString()));
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        
        //Salida Consola
        System.out.println("____________________________________");
        System.out.println("Clave: " +hash.keySet());
        System.out.println("Valor: "+hash.values());
        System.out.println("____________________________________");
        hash.forEach((k,v) ->{
                System.out.println("Key: " + k ) ;
                System.out.println("Value: " + v) ;
                        });
        //Salida TextArea
        txt_salida.append("____________________________________"+"\n");
        txt_salida.append("Clave: "+hash.keySet()+"\n");
        txt_salida.append("Valor: "+hash.values()+"\n");
        txt_salida.append("____________________________________"+"\n");
        hash.forEach((k,v) ->{
                txt_salida.append("Key: " + k +"\n");
                txt_salida.append("Value: " + v +"\n");
                        });
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_entrada.setText("");
        txt_texto.setText("");
        txt_salida.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_tabla_hash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_tabla_hash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_tabla_hash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_tabla_hash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_tabla_hash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txt_entrada;
    private javax.swing.JTextArea txt_salida;
    private javax.swing.JTextArea txt_texto;
    // End of variables declaration//GEN-END:variables
}
