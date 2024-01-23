/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

/**
 *
 * @author wayne
 */
public class TelaTriangulo extends javax.swing.JFrame {

    /**
     * Creates new form TelaTriangulo
     */
    public TelaTriangulo() {
        initComponents();
        panResposta.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sliA = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        sliB = new javax.swing.JSlider();
        sliC = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        panResposta = new javax.swing.JPanel();
        lblForma = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        sliA.setMaximum(20);
        sliA.setValue(0);
        sliA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliAStateChanged(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Triangulo.png"))); // NOI18N

        sliB.setMaximum(20);
        sliB.setValue(0);
        sliB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliBStateChanged(evt);
            }
        });

        sliC.setMaximum(20);
        sliC.setValue(0);
        sliC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliCStateChanged(evt);
            }
        });

        jLabel2.setText("Segmento A");

        jLabel3.setText("Segmento B");

        jLabel4.setText("Segmento C");

        lblA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblA.setForeground(new java.awt.Color(153, 153, 153));
        lblA.setText("0");

        lblB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblB.setForeground(new java.awt.Color(153, 153, 153));
        lblB.setText("0");

        lblC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblC.setForeground(new java.awt.Color(153, 153, 153));
        lblC.setText("0");

        btnVerificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        lblForma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblForma.setForeground(new java.awt.Color(0, 0, 255));
        lblForma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblForma.setText("Forma ou não");

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 0, 0));
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo");

        javax.swing.GroupLayout panRespostaLayout = new javax.swing.GroupLayout(panResposta);
        panResposta.setLayout(panRespostaLayout);
        panRespostaLayout.setHorizontalGroup(
            panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRespostaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblForma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panRespostaLayout.setVerticalGroup(
            panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRespostaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblForma)
                .addGap(26, 26, 26)
                .addComponent(lblTipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sliB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(sliC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(sliA, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblB)
                            .addComponent(lblC)
                            .addComponent(lblA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panResposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sliA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(lblA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sliB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(lblB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sliC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(lblC)))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panResposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        panResposta.setVisible(true);
        
        int a = sliA.getValue();
        int b = sliB.getValue();
        int c = sliC.getValue();
        if(a<b+c && b<a+c && c<a+b){
            lblForma.setText("Formam um triângulo!");
                if(a==b && b==c){
                    lblTipo.setText("Triângulo Equilátero!");
                }else if(a!=b && b!=c){
                    lblTipo.setText("Triangulo Escaleno!");
                }else{
                    lblTipo.setText("Triângulo Isóceles");
                }
        } else{
            lblForma.setText("Não formam um triângulo!");
            lblTipo.setVisible(false);
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void sliAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliAStateChanged
        lblA.setText(Integer.toString(sliA.getValue()));
    }//GEN-LAST:event_sliAStateChanged

    private void sliBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliBStateChanged
        lblB.setText(Integer.toString(sliB.getValue()));
    }//GEN-LAST:event_sliBStateChanged

    private void sliCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliCStateChanged
        lblC.setText(Integer.toString(sliC.getValue()));
    }//GEN-LAST:event_sliCStateChanged

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
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblForma;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel panResposta;
    private javax.swing.JSlider sliA;
    private javax.swing.JSlider sliB;
    private javax.swing.JSlider sliC;
    // End of variables declaration//GEN-END:variables
}
