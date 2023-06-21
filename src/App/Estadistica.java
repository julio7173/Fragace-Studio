package App;
/*
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;*/

class Estadistica extends javax.swing.JPanel {
    
    /*int contadorPCi1 = 0;
    int contadorPCi2 = 0;
    int contadorPCu1 = 0;
    int contadorPCu2 = 0;*/
    
    public Estadistica(/*Crear crear*/) {
        initComponents();
        
        /*contadorPCi1 = crear.contadorPCi1;
        contadorPCi2 = crear.contadorPCi2;
        contadorPCu1 = crear.contadorPCu1;
        contadorPCu2 = crear.contadorPCu2;*/
        
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
        graficaCircular.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        graficaCircular.setForeground(new java.awt.Color(0, 0, 0));
        graficaCircular.setText("CIRCULAR");
        graficaCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficaCircularActionPerformed(evt);
            }
        });

        graficaBarra.setBackground(new java.awt.Color(102, 102, 102));
        graficaBarra.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
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
        btnListo.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
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
        /*DefaultPieDataset perMB = new DefaultPieDataset();
        perMB.setValue("PCi1", contadorPCi1);
        perMB.setValue("PCi2", contadorPCi2);
        perMB.setValue("PCu1", contadorPCu1);
        perMB.setValue("PCu2", contadorPCu2);
        JFreeChart chart = ChartFactory.createPieChart("EL PERFUME MÁS BUSCADO", perMB , true, true, false);
        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new Dimension(324,208));
        graficas.setLayout(new BorderLayout());
        graficas.add(panel, BorderLayout.NORTH);
        graficas.validate();
        //graficas.removeAll();
        //graficas.add(panel, BorderLayout.CENTER);
        //graficas.validate();*/
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
