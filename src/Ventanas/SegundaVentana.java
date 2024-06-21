/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Ventanas;


/**
 *
 * @author Carla Daniela
 */
public class SegundaVentana extends javax.swing.JFrame {
    /** Creates new form SegundaVentana */
    public SegundaVentana() {
        initComponents();

        this.setLocationRelativeTo(null);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        note = new javax.swing.JLabel();
        iconotienda = new javax.swing.JLabel();
        MENU = new javax.swing.JButton();
        compraver = new javax.swing.JButton();
        compras = new javax.swing.JLabel();
        saliir = new javax.swing.JButton();
        notee = new javax.swing.JButton();
        product = new javax.swing.JButton();
        verproductos1 = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        note1 = new javax.swing.JLabel();
        barra = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        note.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        note.setText("No sé");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconotienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tendas.png"))); // NOI18N
        getContentPane().add(iconotienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 330, 340));

        MENU.setBackground(new java.awt.Color(227, 245, 240));
        MENU.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        MENU.setText("MENÚ");
        MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUActionPerformed(evt);
            }
        });
        getContentPane().add(MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 40));

        compraver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito (1) (1).png"))); // NOI18N
        compraver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraverActionPerformed(evt);
            }
        });
        getContentPane().add(compraver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 30, 20));

        compras.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        compras.setText("      Comprar");
        getContentPane().add(compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 80));

        saliir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CERRAR.png"))); // NOI18N
        saliir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saliirActionPerformed(evt);
            }
        });
        getContentPane().add(saliir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 30, 20));

        notee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orden (1).png"))); // NOI18N
        notee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteeActionPerformed(evt);
            }
        });
        getContentPane().add(notee, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 30, 20));

        product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/qq1 (1).png"))); // NOI18N
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });
        getContentPane().add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 30, 20));

        verproductos1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        verproductos1.setText("      Productos");
        getContentPane().add(verproductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, 80));

        salir.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        salir.setText("Salir");
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 140, 80));

        note1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        note1.setText("Ordenes");
        getContentPane().add(note1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 140, 80));

        barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondito1.png"))); // NOI18N
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondito.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compraverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraverActionPerformed
        new Compras().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_compraverActionPerformed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        new Productos().setVisible(true);
            this.dispose();     
        
    }//GEN-LAST:event_productActionPerformed

    private void noteeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteeActionPerformed
        new Ordenes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_noteeActionPerformed

    private void saliirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saliirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_saliirActionPerformed

    private void MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUActionPerformed

    }//GEN-LAST:event_MENUActionPerformed

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
            java.util.logging.Logger.getLogger(SegundaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SegundaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SegundaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SegundaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SegundaVentana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton MENU;
    private javax.swing.JLabel barra;
    private javax.swing.JLabel compras;
    private javax.swing.JButton compraver;
    private javax.swing.JLabel iconotienda;
    private javax.swing.JLabel note;
    private javax.swing.JLabel note1;
    private javax.swing.JButton notee;
    private javax.swing.JButton product;
    private javax.swing.JButton saliir;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel verproductos1;
    // End of variables declaration//GEN-END:variables
}

