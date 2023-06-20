package App;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Animar extends javax.swing.JPanel {

    ImageIcon imagenAnimar = null;
    
    public Animar(ImageIcon imagenAnimar){
        this.imagenAnimar = imagenAnimar;
        initComponents();
        
        if(imagenAnimar != null){
            imagenAnimar = new ImageIcon(imagenAnimar.getImage().getScaledInstance(/*animo.getPreferredSize().width*/210, /*animo.getPreferredSize().height*/220, Image.SCALE_SMOOTH));
            animo.setIcon(imagenAnimar);
        }
        
        predeterminado.setModel(modeloPreAni);
        frames.setModel(modeloFotoAni); 
    }
    
    String[] opcionesPreAni = {"Introduccion", "Despedida"};
    String[] opcionesFotoAni = {"Caida Derecha", "Caida Izquierda"};
    
    DefaultComboBoxModel modeloPreAni = new DefaultComboBoxModel(opcionesPreAni);
    DefaultComboBoxModel modeloFotoAni = new DefaultComboBoxModel(opcionesFotoAni);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        predeterminado = new javax.swing.JComboBox<>();
        frames = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        animaciones = new javax.swing.JPanel();
        animo = new javax.swing.JLabel();
        btnListo = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        predeterminado.setBackground(new java.awt.Color(102, 102, 102));
        predeterminado.setFont(new java.awt.Font("Castellar", 0, 10)); // NOI18N
        predeterminado.setForeground(new java.awt.Color(0, 0, 0));
        predeterminado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        predeterminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                predeterminadoActionPerformed(evt);
            }
        });

        frames.setBackground(new java.awt.Color(102, 102, 102));
        frames.setFont(new java.awt.Font("Castellar", 0, 10)); // NOI18N
        frames.setForeground(new java.awt.Color(0, 0, 0));
        frames.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        frames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                framesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PREDETERMINADO");

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FRAMES");

        animaciones.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout animacionesLayout = new javax.swing.GroupLayout(animaciones);
        animaciones.setLayout(animacionesLayout);
        animacionesLayout.setHorizontalGroup(
            animacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, animacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(animo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );
        animacionesLayout.setVerticalGroup(
            animacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(animacionesLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(animo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        btnListo.setBackground(new java.awt.Color(102, 102, 102));
        btnListo.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        btnListo.setForeground(new java.awt.Color(0, 0, 0));
        btnListo.setText("LISTO");
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(predeterminado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(frames, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addComponent(animaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(predeterminado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frames, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(animaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void framesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_framesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_framesActionPerformed

    private void predeterminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_predeterminadoActionPerformed
        String opcion = (String)predeterminado.getSelectedItem();
        switch(opcion){
            case "Introduccion": 
                int xOriginal_1 = animo.getX();
                int yOriginal_1 = animo.getY();
                Timer timer_1 = new Timer(10, new ActionListener(){
                    int paso = 0;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        paso++;
                        if (paso <= 300) { 
                            animo.setVisible(false); 
			}else if (paso > 300 && paso <= 800) { 
                            animo.setVisible(true);
                            int x = xOriginal_1;
                            int y = (int) (animaciones.getHeight() - (animaciones.getHeight() - yOriginal_1) * (paso - 300) / 500.0);
                            animo.setLocation(x, y);
                        }else { 
                            ((Timer) e.getSource()).stop(); 
			}
                    }
                });
                timer_1.start(); 
		        break;
            case "Despedida": 
                int xOriginal_2 = animo.getX();
                int yOriginal_2 = animo.getY();
                Timer timer_2 = new Timer(10, new ActionListener(){
                    int paso = 0;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        paso++;
                        if (paso <= 200) { 
                            animo.setVisible(true); 
		        }else if (paso > 200 && paso <= 700) { 
                            animo.setVisible(true);
                            int x = xOriginal_2;
                            int y = yOriginal_2 - (int) (animo.getHeight() * (paso - 200) / 300.0);
                            animo.setLocation(x, y);
                        }else { 
                            ((Timer) e.getSource()).stop(); 
                            animo.setLocation(xOriginal_2,yOriginal_2);
		        }
                    }
                });
                timer_2.start(); 
	        break;
            default:
                System.out.println("No has elegido ninguna animación");
                break;
        }
    }//GEN-LAST:event_predeterminadoActionPerformed

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel animaciones;
    private javax.swing.JLabel animo;
    private javax.swing.JButton btnListo;
    private javax.swing.JComboBox<String> frames;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> predeterminado;
    // End of variables declaration//GEN-END:variables
}
