/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conversor;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author g.guzman
 */
public class ConversorGUI extends javax.swing.JFrame {

    private ConversorGenerico conversorSeleccionado;
    final List<ConversorGenerico> conversores;
    
    /**
     * Creates new form Conversor
     */
    public ConversorGUI() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Mi Conversor");
        
        conversores = new ArrayList();
        conversores.add(new ConversorCentPulg());
        conversores.add(new ConversorMetrosKm());
        conversores.add(new ConversorMetrosKm());
        conversores.add(new ConversorMetrosKm());
        
        for (ConversorGenerico conversor : conversores) {
            conversoresComboBox.addItem(conversor.getTipo());
        }
        //refrescarConversor();
    }

    private void refrescarConversor() {
        conversorSeleccionado = conversores.get(conversoresComboBox.getSelectedIndex());
        
        value1Label.setText(conversorSeleccionado.getLabel1());
        value2Label.setText(conversorSeleccionado.getLabel2());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        value1Label = new javax.swing.JLabel();
        valor1TextField = new javax.swing.JTextField();
        convertirButton = new javax.swing.JButton();
        value2Label = new javax.swing.JLabel();
        valor2TextField = new javax.swing.JTextField();
        conversoresComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        value1Label.setText("Label 1");

        valor1TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                valor1TextFieldFocusLost(evt);
            }
        });
        valor1TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valor1TextFieldKeyPressed(evt);
            }
        });

        convertirButton.setText("Convertir");
        convertirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirButtonActionPerformed(evt);
            }
        });

        value2Label.setText("Label 2");

        valor2TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                valor2TextFieldFocusLost(evt);
            }
        });

        conversoresComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversoresComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo de Conversión");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(value2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valor2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(value1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valor1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(205, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(convertirButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(conversoresComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conversoresComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(value1Label)
                    .addComponent(valor1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertirButton)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(value2Label)
                    .addComponent(valor2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirButtonActionPerformed
        if (convertirAValor2) {
            convertirAValor2();    
        }
        else {
            
        }
    }//GEN-LAST:event_convertirButtonActionPerformed

    private void convertirAValor2() throws HeadlessException {
        System.out.println("aPulgButtonActionPerformed");
        final String valor1Text = valor1TextField.getText().toLowerCase();
        System.out.println("centTextField.getText() " + valor1Text);
        Double valor1Double;
        try {
            if (valor1Text.endsWith("f") || valor1Text.endsWith("d")) {
                throw new NumberFormatException("contiene una f o una d");
            }
            valor1Double = Double.valueOf(valor1Text.replace(',', '.'));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error al convertir ("+ex.getLocalizedMessage()+")", 
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        Double valor2Double = conversorSeleccionado.convertirAValor2(valor1Double);
        // BigDecimal pulg = BigDecimal.valueOf(pulgDouble).setScale(2, RoundingMode.HALF_UP);
        valor2TextField.setText(String.format("%.2f", valor2Double));
        // pulgTextField.setText(String.valueOf(pulg));
    }

    private void valor1TextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valor1TextFieldKeyPressed
        System.out.println("Tecla presionada: "+evt.getKeyChar());
        if (evt.getKeyChar()==KeyEvent.VK_ENTER) {
            convertirAValor2();
        }
    }//GEN-LAST:event_valor1TextFieldKeyPressed

    private void valor1TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valor1TextFieldFocusLost
      convertirAValor2 = true;
    }//GEN-LAST:event_valor1TextFieldFocusLost

    private void valor2TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valor2TextFieldFocusLost
      convertirAValor2 = false;
    }//GEN-LAST:event_valor2TextFieldFocusLost

    private void conversoresComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversoresComboBoxActionPerformed
        System.out.println("cambió el combo");
        refrescarConversor();
    }//GEN-LAST:event_conversoresComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(ConversorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> conversoresComboBox;
    private javax.swing.JButton convertirButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField valor1TextField;
    private javax.swing.JTextField valor2TextField;
    private javax.swing.JLabel value1Label;
    private javax.swing.JLabel value2Label;
    // End of variables declaration//GEN-END:variables

    private boolean convertirAValor2;
}
