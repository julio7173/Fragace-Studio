package App;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;

public class FraganceStudio extends javax.swing.JFrame {
    
    boolean presionado = false;
    
    public FraganceStudio() {
        try {
            // Establece el aspecto visual de FlatLaf en modo oscuro
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        
        initComponents();
        // Centra la ventana en la pantalla
        this.setLocationRelativeTo(null);
        // Establece el icono y el título de la ventana
        setIconImage(new ImageIcon(getClass().getResource("/Icon/FRAGANCE_STUDIO-int.png")).getImage());
        this.setTitle("Fragrance Studio"); 
        // Crea un panel de inicio y lo muestra en la ventana
        Inicio b1 = new Inicio();
        showPanel(b1);
        // Deshabilita algunos botones al inicio
        btnAnimar.setEnabled(false);
        btnEstadistica.setEnabled(false);
        btnGuardar.setEnabled(false);
        
        ImageIcon iconOFF = new ImageIcon("src/Microfonos/OFF.png");
        ImageIcon iconON = new ImageIcon("src/Microfonos/ON.png");
        
        Image imagenOFF = iconOFF.getImage();
        Image imagenON = iconON.getImage();
        
        Image nuevaImagenOFF = imagenOFF.getScaledInstance(voz.getWidth(), voz.getHeight(), Image.SCALE_SMOOTH);
        Image nuevaImagenON = imagenON.getScaledInstance(voz.getWidth(), voz.getHeight(), Image.SCALE_SMOOTH);
        
        ImageIcon nuevoIconoOFF = new ImageIcon(nuevaImagenOFF);
        ImageIcon nuevoIconoON = new ImageIcon(nuevaImagenON);
        
        voz.setIcon(nuevoIconoOFF);
        
        ActionListener microfono = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(!presionado){
                    voz.setIcon(nuevoIconoON);
                    presionado = true;
                }else{
                    voz.setIcon(nuevoIconoOFF);
                    presionado = false;
                }
            }
        };
        voz.addActionListener(microfono);
    }
    // Método que muestra un panel dado en la ventana, reemplazando el anterior
    protected void showPanel(JPanel p){
        p.setSize(650,500);
        p.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateral = new javax.swing.JPanel();
        btnEstadistica = new javax.swing.JButton();
        btnAnimar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        contenido = new javax.swing.JPanel();
        voz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLateral.setBackground(new java.awt.Color(51, 51, 51));
        panelLateral.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEstadistica.setBackground(new java.awt.Color(102, 102, 102));
        btnEstadistica.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnEstadistica.setForeground(new java.awt.Color(0, 0, 0));
        btnEstadistica.setText("ESTADÍSTICAS");

        btnAnimar.setBackground(new java.awt.Color(102, 102, 102));
        btnAnimar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnAnimar.setForeground(new java.awt.Color(0, 0, 0));
        btnAnimar.setText("ANIMACIÓN");

        btnGuardar.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(102, 102, 102));
        btnCrear.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(0, 0, 0));
        btnCrear.setText("CREACIÓN");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        contenido.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        voz.setBackground(new java.awt.Color(51, 51, 51));
        voz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vozActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLateralLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAnimar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEstadistica, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(panelLateralLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(voz, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLateralLayout.createSequentialGroup()
                        .addComponent(voz, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnimar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vozActionPerformed
        //
    }//GEN-LAST:event_vozActionPerformed
    
    Crear nuevo = null;
    
    // Método que recibe un objeto de tipo Crear y retorna el texto del JTextField titulo
    protected String getTituloPerfume(String s){
        return s;
    }
    
    public void guardarGraficas(ChartPanel[] graficas, String folder){
        for(ChartPanel grafica : graficas){
            String titulo = grafica.getChart().getTitle().getText();
            String ruta = System.getProperty("user.home") + "/Desktop/" + folder + "/" + titulo + ".png";
            File archivo = new File(ruta);
            try{
                ChartUtilities.saveChartAsPNG(archivo, grafica.getChart(), 324, 208);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Hubo un error al guardar la gráfica " + titulo, "Error", JOptionPane.ERROR_MESSAGE); 
            }
        }
    }
    
    // Método que se ejecuta al presionar el botón de guardar
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        if(nuevo != null){
            String nombreFolder = getTituloPerfume(nuevo.tituloPerfume);
            String rutaEscritorio = System.getProperty("user.home") + "/Desktop";
            File folder = new File(rutaEscritorio + "/" + nombreFolder);
            boolean creado = folder.mkdir();
            if(creado){
                JOptionPane.showMessageDialog(this, "El folder se creó con éxito", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                Estadistica est = new Estadistica();
                ChartPanel[] graficas = est.getGraficasGeneradas();
                guardarGraficas(graficas, nombreFolder);
                btnCrear.setEnabled(true);
                btnCrearActionPerformed(evt);
                btnGuardar.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(this, "Hubo un error al crear el folder", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }                                          
    // Método que se ejecuta al presionar el botón de crear
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {
        nuevo = new Crear(this, contenido);
        showPanel(nuevo);
    }                                        
    
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
            java.util.logging.Logger.getLogger(FraganceStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FraganceStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FraganceStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FraganceStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FraganceStudio().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnAnimar;
    protected javax.swing.JButton btnCrear;
    protected javax.swing.JButton btnEstadistica;
    protected javax.swing.JButton btnGuardar;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JButton voz;
    // End of variables declaration//GEN-END:variables
}
