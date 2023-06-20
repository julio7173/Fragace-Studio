package App;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;

public class B_Buscar extends javax.swing.JPanel {

    public B_Buscar(File archivo) {
        initComponents();
        try{
            ImageIcon imagen = new ImageIcon(archivo.toURI().toURL());
            prueba.setIcon(imagen);
        }catch(Exception e){
            e.printStackTrace();
        }
        add(prueba, BorderLayout.CENTER);
    }

    public void mostrarImagen (File archivo) {

        try {
            ImageIcon imagen = new ImageIcon (archivo.toURI ().toURL ());
            ImageIcon imagenEscalada = new ImageIcon (imagen.getImage().getScaledInstance (/*prueba.getWidth ()*/220, /*prueba.getHeight ()*/225, Image.SCALE_SMOOTH));
            prueba.setIcon (imagenEscalada);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
    
    private URL convertirArchivoURL(File archivo) throws MalformedURLException, IOException {
        try(FileInputStream fis = new FileInputStream(archivo)){
            return archivo.toURI().toURL();
        }catch(FileNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        prueba = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    protected javax.swing.JLabel prueba;
    // End of variables declaration//GEN-END:variables
}