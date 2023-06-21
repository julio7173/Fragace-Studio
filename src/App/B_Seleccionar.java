package App;

import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class B_Seleccionar extends javax.swing.JPanel {
    
    private Crear prueba;
    
    public B_Seleccionar(Crear prueba) {
        this.prueba = prueba;
        
        initComponents();

        per1.setSize(150,150);
        setImageButton(per1, "src/Imagenes-Perfumes/PCi1.png");
        per2.setSize(150,150);
        setImageButton(per2, "src/Imagenes-Perfumes/PCi2.png");
        per3.setSize(150,150);
        setImageButton(per3, "src/Imagenes-Perfumes/PCu1.png");
        per4.setSize(150,150);
        setImageButton(per4, "src/Imagenes-Perfumes/PCu2.png");
    }

    private void setImageButton(JButton buttonName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(buttonName.getWidth(),buttonName.getHeight(), Image.SCALE_DEFAULT)); // Crea otro objeto ImageIcon a partir del objeto anterior, pero escalando la imagen al tamaño del botón
        buttonName.setIcon(icon);
        this.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        per1 = new javax.swing.JButton();
        per2 = new javax.swing.JButton();
        per3 = new javax.swing.JButton();
        per4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        per1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per1ActionPerformed(evt);
            }
        });

        per2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per2ActionPerformed(evt);
            }
        });

        per3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per3ActionPerformed(evt);
            }
        });

        per4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(per1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(per2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(per3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(per4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(per2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(per1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(per3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(per4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean perSelected = false;
    
    private void per1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per1ActionPerformed
        starButton(per2, per3, per4, "PCi1.png");
    }//GEN-LAST:event_per1ActionPerformed

    private void per2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per2ActionPerformed
        starButton(per1, per3, per4, "PCi2.png");
    }//GEN-LAST:event_per2ActionPerformed

    private void per3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per3ActionPerformed
        starButton(per1, per2, per4, "PCu1.png");
    }//GEN-LAST:event_per3ActionPerformed

    private void per4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per4ActionPerformed
        starButton(per1, per2, per3, "PCu2.png");
    }//GEN-LAST:event_per4ActionPerformed

    private void starButton(JButton uno, JButton dos, JButton tres, String nombreArchivo){
        perSelected = !perSelected;
        uno.setEnabled(!perSelected);
        dos.setEnabled(!perSelected);
        tres.setEnabled(!perSelected);
        File archivo = new File("src/Imagenes-Perfumes/" + nombreArchivo);
        try{
            prueba.seleccionarImagen(archivo);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton per1;
    protected javax.swing.JButton per2;
    protected javax.swing.JButton per3;
    protected javax.swing.JButton per4;
    // End of variables declaration//GEN-END:variables
}
