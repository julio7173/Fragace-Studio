package pp;

import java.awt.Image;
import java.io.File;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Crear extends javax.swing.JPanel {
    
    HashMap<String, Integer> mapa; // Un mapa que almacena los nombres y las frecuencias de los perfumes
    private Estadistica estadistica; // Un atributo de tipo Estadistica
    
    public Crear() {
        initComponents();
        prueba.setVisible(false);
        per1.setVisible(false);
        per2.setVisible(false);
        per3.setVisible(false);
        per4.setVisible(false);
        
        // Este bloque inicializa el mapa con los nombres y las frecuencias de los perfumes
        mapa = new HashMap();
        mapa.put("PCi1", 0);
        mapa.put("PCi2", 0);
        mapa.put("PCu1", 0);
        mapa.put("PCu2", 0);
        estadistica = new Estadistica(mapa);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        perfumes = new javax.swing.JPanel();
        prueba = new javax.swing.JLabel();
        per1 = new javax.swing.JButton();
        per2 = new javax.swing.JButton();
        per3 = new javax.swing.JButton();
        per4 = new javax.swing.JButton();

        btnBuscar.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSeleccionar.setBackground(new java.awt.Color(102, 102, 102));
        btnSeleccionar.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(0, 0, 0));
        btnSeleccionar.setText("SELECCIONAR");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        perfumes.setBackground(new java.awt.Color(255, 255, 255));

        prueba.setBackground(new java.awt.Color(204, 255, 153));
        prueba.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        per1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        per1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per1ActionPerformed(evt);
            }
        });

        per2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        per2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per2ActionPerformed(evt);
            }
        });

        per3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        per3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per3ActionPerformed(evt);
            }
        });

        per4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        per4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout perfumesLayout = new javax.swing.GroupLayout(perfumes);
        perfumes.setLayout(perfumesLayout);
        perfumesLayout.setHorizontalGroup(
            perfumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfumesLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(perfumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(perfumesLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(per1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(per2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(per3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(per4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );
        perfumesLayout.setVerticalGroup(
            perfumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfumesLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(perfumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(perfumesLayout.createSequentialGroup()
                    .addGap(144, 144, 144)
                    .addGroup(perfumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(per1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(per2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(per3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(per4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(144, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addComponent(perfumes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(perfumes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        prueba.setVisible(true);
        
        per1.setVisible(false);
        per2.setVisible(false);
        per3.setVisible(false);
        per4.setVisible(false);
        
        String ruta = ""; // Declara una variable de tipo String para almacenar la ruta del archivo elegido
        JFileChooser catalogo = new JFileChooser(); // Crea un objeto JFileChooser para mostrar el selector de archivos
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("png", "png"); // Crea un objeto FileNameExtensionFilter para filtrar los archivos con extensión png
        catalogo.setFileFilter(filtrado); // Establece el objeto FileNameExtensionFilter como el filtro de archivos del objeto JFileChooser
        String rutaPer = System.getProperty("user.dir") + "/src/Imagenes-Perfumes"; // Obtiene la ruta del directorio usando la propiedad user.dir
        File dirPer = new File(rutaPer); // Crea un objeto File con la ruta del directorio
        catalogo.setCurrentDirectory(dirPer); // Establece el directorio actual del selector de archivos

        int respuesta = catalogo.showOpenDialog(this); // Muestra el selector de archivos y guarda la respuesta del usuario en una variable de tipo int
        
        if(respuesta == JFileChooser.APPROVE_OPTION){ // Si el usuario aprueba la selección del archivo
            ruta = catalogo.getSelectedFile().getAbsolutePath(); // Obtiene la ruta completa del archivo seleccionado y la guarda en la variable ruta
            Image per = new ImageIcon(ruta).getImage(); // Crea un objeto Image a partir de la ruta del archivo
            ImageIcon perIco = new ImageIcon(per.getScaledInstance(prueba.getWidth(), prueba.getHeight(), Image.SCALE_SMOOTH)); // Crea un objeto ImageIcon a partir del objeto Image y lo escala al tamaño de la etiqueta 5
            prueba.setIcon(perIco); // Establece el objeto ImageIcon como el icono de la etiqueta 5
            
            // Este bloque obtiene el nombre del archivo seleccionado y actualiza el mapa con la frecuencia incrementada en uno
            String nombre = catalogo.getSelectedFile().getName(); // Obtiene el nombre del archivo seleccionado
            int frecuencia = mapa.get(nombre); // Obtiene la frecuencia actual del archivo en el mapa
            frecuencia++; // Incrementa la frecuencia en uno
            mapa.put(nombre, frecuencia); // Actualiza el mapa con el nuevo valor de frecuencia para el archivo
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void graCircularActionPerformed(java.awt.event.ActionEvent evt) {                                                
       estadistica.setVisible(true); // Muestra el objeto de tipo Estadistica 
    }  
    
    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        prueba.setVisible(false);
        
        per1.setVisible(true);
        per2.setVisible(true);
        per3.setVisible(true);
        per4.setVisible(true);
        
        // Estos métodos asignan una imagen a cada botón de perfume usando una ruta relativa
        SetImageButton(per1, "src/Imagenes-Perfumes/PCi1.png");
        SetImageButton(per2, "src/Imagenes-Perfumes/PCi2.png");
        SetImageButton(per3, "src/Imagenes-Perfumes/PCu1.png");
        SetImageButton(per4, "src/Imagenes-Perfumes/PCu2.png");
        
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void per1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_per1ActionPerformed

    private void per2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_per2ActionPerformed

    private void per3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_per3ActionPerformed

    private void per4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_per4ActionPerformed
    
    private void SetImageButton(JButton buttonName, String root){ // Este método recibe como parámetros un botón y una ruta de una imagen
        ImageIcon image = new ImageIcon(root); // Crea un objeto ImageIcon a partir de la ruta de la imagen
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(buttonName.getWidth(),buttonName.getHeight(), Image.SCALE_DEFAULT)); // Crea otro objeto ImageIcon a partir del objeto anterior, pero escalando la imagen al tamaño del botón
        buttonName.setIcon(icon); // Establece el objeto ImageIcon como el icono del botón
        this.repaint(); // Repinta la ventana para reflejar los cambios
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton per1;
    private javax.swing.JButton per2;
    private javax.swing.JButton per3;
    private javax.swing.JButton per4;
    private javax.swing.JPanel perfumes;
    private javax.swing.JLabel prueba;
    // End of variables declaration//GEN-END:variables
}
