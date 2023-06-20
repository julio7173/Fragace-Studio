package App;

class Estadistica extends javax.swing.JPanel {
    
    public Estadistica() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        graficaCircular = new javax.swing.JButton();
        graficaBarra = new javax.swing.JButton();
        graficas = new javax.swing.JPanel();
        btnListo = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        graficaCircular.setBackground(new java.awt.Color(102, 102, 102));
        graficaCircular.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        graficaCircular.setForeground(new java.awt.Color(0, 0, 0));
        graficaCircular.setText("CIRCULAR");
        graficaCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficaCircularActionPerformed(evt);
            }
        });

        graficaBarra.setBackground(new java.awt.Color(102, 102, 102));
        graficaBarra.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        graficaBarra.setForeground(new java.awt.Color(0, 0, 0));
        graficaBarra.setText("BARRAS");
        graficaBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficaBarraActionPerformed(evt);
            }
        });

        graficas.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout graficasLayout = new javax.swing.GroupLayout(graficas);
        graficas.setLayout(graficasLayout);
        graficasLayout.setHorizontalGroup(
            graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        graficasLayout.setVerticalGroup(
            graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        btnListo.setBackground(new java.awt.Color(102, 102, 102));
        btnListo.setFont(new java.awt.Font("Castellar", 0, 14)); // NOI18N
        btnListo.setForeground(new java.awt.Color(0, 0, 0));
        btnListo.setText("LISTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(graficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(graficaCircular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(graficaBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graficaCircular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graficaBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(graficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void graficaCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaCircularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graficaCircularActionPerformed

    private void graficaBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graficaBarraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnListo;
    protected javax.swing.JButton graficaBarra;
    protected javax.swing.JButton graficaCircular;
    private javax.swing.JPanel graficas;
    // End of variables declaration//GEN-END:variables
}
