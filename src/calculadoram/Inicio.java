
package calculadoram;

import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    private int maH, maV;

    private double maA[][] = new double[this.maH][this.maV];
    private double maB[][] = new double[this.maH][this.maV];

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mH = new javax.swing.JComboBox<>();
        view_tamaño = new javax.swing.JLabel();
        mV = new javax.swing.JComboBox<>();
        Sumar = new javax.swing.JButton();
        matrizA = new javax.swing.JButton();
        matrizB = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Multiplicacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6" }));
        mH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mHActionPerformed(evt);
            }
        });

        view_tamaño.setText("0 x 0");

        mV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6" }));
        mV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mVActionPerformed(evt);
            }
        });

        Sumar.setText("Sumar");
        Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarActionPerformed(evt);
            }
        });

        matrizA.setText("Ingresar matriz A");
        matrizA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrizAActionPerformed(evt);
            }
        });

        matrizB.setText("Ingresar matriz B");
        matrizB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrizBActionPerformed(evt);
            }
        });

        Resta.setText("Resta");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        Multiplicacion.setText("Multiplicacion");
        Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(mH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(mV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(view_tamaño))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(matrizA)
                        .addGap(49, 49, 49)
                        .addComponent(matrizB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Sumar)
                        .addGap(41, 41, 41)
                        .addComponent(Resta)
                        .addGap(18, 18, 18)
                        .addComponent(Multiplicacion)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(view_tamaño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrizA)
                    .addComponent(matrizB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sumar)
                    .addComponent(Resta)
                    .addComponent(Multiplicacion))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mHActionPerformed
        setmaH(Integer.parseInt(mH.getSelectedItem().toString()));
        view_tamaño.setText(this.maH + " x " + this.maV);
    }//GEN-LAST:event_mHActionPerformed

    private void mVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVActionPerformed
        setmaV(Integer.parseInt(mV.getSelectedItem().toString()));
       view_tamaño.setText(this.maH + " x " + this.maV);
    }//GEN-LAST:event_mVActionPerformed

    private void SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarActionPerformed

        if (this.maH == this.maV) {
            CalculadoraDeMatrices ca = new CalculadoraDeMatrices();
            ca.suma(this.maA, this.maB, this.maH);
        } else {
            JOptionPane.showMessageDialog(null, "Deben ser simetricas");
        }

    }//GEN-LAST:event_SumarActionPerformed
    
       
    private void matrizAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrizAActionPerformed
        double mA[][] = new double[this.maH][this.maV];

        if (this.maH == this.maV) {
            for (int i = 0; i < this.maH; i++) {
                for (int j = 0; j < this.maV; j++) {
                    mA[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Matriz A \n Ingrese el valor para la posicion: " + (i + 1) + "x" + (j + 1)));
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "deben ser simetricas");
        }
        setMaA(mA);
    }//GEN-LAST:event_matrizAActionPerformed

    private void matrizBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrizBActionPerformed
        double mB[][] = new double[this.maH][this.maV];
        if (this.maH == this.maV) {
            for (int i = 0; i < this.maH; i++) {
                for (int j = 0; j < this.maV; j++) {
                    mB[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Matriz B \n Ingrese el valor para la posicion: " + (i + 1) + "x" + (j + 1)));
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Para las operaciones las matrices deben ser simetricas");
        }
        setMaB(mB);
    }//GEN-LAST:event_matrizBActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        if (this.maH == this.maV) {
            CalculadoraDeMatrices ca = new CalculadoraDeMatrices();
            ca.resta(this.maA, this.maB, this.maH);
        } else {
            JOptionPane.showMessageDialog(null, "Para las operaciones las matrices deben ser simetricas");
        }
    }//GEN-LAST:event_RestaActionPerformed

    private void MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacionActionPerformed
        if(this.maH == this.maV){
            CalculadoraDeMatrices ca= new CalculadoraDeMatrices();
            ca.Multiplicacion(this.maA, this.maB, this.maH);
        }else{
            JOptionPane.showMessageDialog(null, "Para las operaciones las matrices deben ser simetricas");
        }
    }//GEN-LAST:event_MultiplicacionActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    public void setmaH(int maH) {
        this.maH = maH;
    }

    public void setmaV(int maV) {
        this.maV = maV;
    }

    public int getmaH() {
        return maH;
    }

    public int getmaV() {
        return maV;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Multiplicacion;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Sumar;
    private javax.swing.JComboBox<String> mH;
    private javax.swing.JComboBox<String> mV;
    private javax.swing.JButton matrizA;
    private javax.swing.JButton matrizB;
    private javax.swing.JLabel view_tamaño;
    // End of variables declaration//GEN-END:variables

    public double[][] getMaA() {
        return maA;
    }

    public void setMaA(double[][] maA) {
        this.maA = maA;
    }

    public double[][] getMaB() {
        return maB;
    }

    public void setMaB(double[][] maB) {
        this.maB = maB;
    }

}
