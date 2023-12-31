package App;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Crear extends javax.swing.JPanel {
    
    FraganceStudio app;
    JPanel panelContenido;
    ImageIcon imagenSelec;
    public String tituloPerfume;

    boolean imagenSeleccionada = false;
    
    public Crear(FraganceStudio app, JPanel panelContenido){
        initComponents();
        this.app = app;
        this.panelContenido = panelContenido;
        
        titulo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              titulo.setText("");
            }
        });
    }
    
    protected void seleccionarImagen(File archivo) throws MalformedURLException{
        imagenSelec = new ImageIcon(archivo.toURI().toURL());
        imagenSeleccionada = true;
    }
    
    private void verificarSeleccion(){
        if(!titulo.getText().isEmpty() && imagenSeleccionada){
            tituloPerfume = titulo.getText();
            Animar ani = new Animar(imagenSelec);
            app.showPanel(ani);
            app.btnAnimar.setEnabled(true);
            app.btnCrear.setEnabled(false);
        }else{
            if(titulo.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debes elegir un título", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Debes elegir alguna imagen", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        perfumes = new javax.swing.JPanel();
        btnListo = new javax.swing.JButton();
        titulo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));

        btnBuscar.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSeleccionar.setBackground(new java.awt.Color(102, 102, 102));
        btnSeleccionar.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(0, 0, 0));
        btnSeleccionar.setText("SELECCIONAR");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        perfumes.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout perfumesLayout = new javax.swing.GroupLayout(perfumes);
        perfumes.setLayout(perfumesLayout);
        perfumesLayout.setHorizontalGroup(
            perfumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );
        perfumesLayout.setVerticalGroup(
            perfumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        btnListo.setBackground(new java.awt.Color(102, 102, 102));
        btnListo.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        btnListo.setForeground(new java.awt.Color(0, 0, 0));
        btnListo.setText("LISTO");
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });

        titulo.setBackground(new java.awt.Color(0, 204, 204));
        titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Título");
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addComponent(perfumes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(perfumes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public static int[] frecuenciasMB = new int[4];
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String ruta = "";
        JFileChooser catalogo = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("png", "png");
        catalogo.setFileFilter(filtrado);
        String rutaPer = System.getProperty("user.dir") + "/src/Imagenes-Perfumes";
        File dirPer = new File(rutaPer);
        catalogo.setCurrentDirectory(dirPer);

        int respuesta = catalogo.showOpenDialog(this);
        
        if(respuesta == JFileChooser.APPROVE_OPTION){ try {
            ruta = catalogo.getSelectedFile().getAbsolutePath();
            dirPer = catalogo.getSelectedFile();
            seleccionarImagen(dirPer);
            switch (dirPer.getName()) {
                case "PCi1.png":
                    frecuenciasMB[0]++;
                    break;
                case "PCi2.png":
                    frecuenciasMB[1]++;
                    break;
                case "PCu1.png":
                    frecuenciasMB[2]++;
                    break;
                case "PCu2.png":
                    frecuenciasMB[3]++;
                    break;
                default:
                    break;
            }
            } catch (MalformedURLException ex) {
                Logger.getLogger(Crear.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
              
        if (perfumes.getComponentCount () > 0) {
            B_Buscar bus = (B_Buscar)perfumes.getComponent(0);
            bus.mostrarImagen(dirPer);
            showPanel(bus);
        } else {
            B_Buscar bus = new B_Buscar (dirPer);
            perfumes.add (bus);
            showPanel(bus);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        B_Seleccionar sel = new B_Seleccionar(this);
        showPanel(sel);
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        verificarSeleccion();
    }//GEN-LAST:event_btnListoActionPerformed

    private void showPanel(JPanel p){
        p.setSize(650,418);
        p.setLocation(0,0);
        
        perfumes.removeAll();
        perfumes.add(p, BorderLayout.CENTER);
        perfumes.revalidate();
        perfumes.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnBuscar;
    protected javax.swing.JButton btnListo;
    protected javax.swing.JButton btnSeleccionar;
    private javax.swing.JPanel perfumes;
    protected javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
