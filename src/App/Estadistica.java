package App;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

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
                .addGap(66, 66, 66)
                .addComponent(graficaCircular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(graficaBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addComponent(graficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    ChartPanel chartPanel_1;
    ChartPanel chartPanel_2;
    ChartPanel chartPanel_3;
    ChartPanel chartPanel_4;
    
    
    private void graficaCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaCircularActionPerformed
        /*------------------MÁS BUSCADOS------------------*/
        DefaultPieDataset pMB = new DefaultPieDataset();
        pMB.setValue("PCi1", Crear.frecuenciasMB[0]); // accedes al arreglo estático así
        pMB.setValue("PCi2", Crear.frecuenciasMB[1]);
        pMB.setValue("PCu1", Crear.frecuenciasMB[2]);
        pMB.setValue("PCu2", Crear.frecuenciasMB[3]);
        JFreeChart chart1 = ChartFactory.createPieChart(
            "PERFUMES MÁS BUSCADOS", // título del gráfico
            pMB, // datos
            true, // incluir leyenda
            true, 
            false 
            );
        chartPanel_1 = new ChartPanel(chart1);
        chartPanel_1.setPreferredSize(new java.awt.Dimension(324, 208));
        /*------------------MÁS SELECCIONADOS------------------*/
        DefaultPieDataset pMS = new DefaultPieDataset();
        pMS.setValue("PCi1", B_Seleccionar.frecuenciasMS[0]); // accedes al arreglo estático así
        pMS.setValue("PCi2", B_Seleccionar.frecuenciasMS[1]);
        pMS.setValue("PCu1", B_Seleccionar.frecuenciasMS[2]);
        pMS.setValue("PCu2", B_Seleccionar.frecuenciasMS[3]);
        JFreeChart chart2 = ChartFactory.createPieChart(
            "PERFUMES MÁS SELECCIONADOS", // título del gráfico
            pMS, // datos
            true, // incluir leyenda
            true, 
            false 
            );
        chartPanel_2 = new ChartPanel(chart2);
        chartPanel_2.setPreferredSize(new java.awt.Dimension(324, 208));
        
        graficas.setLayout(new BorderLayout());
        graficas.add(chartPanel_1, BorderLayout.NORTH);
        graficas.add(chartPanel_2, BorderLayout.SOUTH);
        
        chartPanel_3.setVisible(false);
        chartPanel_4.setVisible(false);
        
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.pack();
    }//GEN-LAST:event_graficaCircularActionPerformed

    private void graficaBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaBarraActionPerformed
        /*------------------MÁS BUSCADOS------------------*/
        DefaultCategoryDataset pMB = new DefaultCategoryDataset();
        pMB.addValue(Crear.frecuenciasMB[0], "PCi1", "PCi1");
        pMB.addValue(Crear.frecuenciasMB[1], "PCi2", "PCi2");
        pMB.addValue(Crear.frecuenciasMB[2], "PCu1", "PCu1");
        pMB.addValue(Crear.frecuenciasMB[3], "PCu2", "PCu2");
        JFreeChart chart3 = ChartFactory.createBarChart(
        "PERFUMES MÁS BUSCADOS", // título del gráfico
        "Perfume", // etiqueta del eje horizontal
        "Frecuencia", // etiqueta del eje vertical
        pMB, // datos
        PlotOrientation.VERTICAL, // orientación
        true, // incluir leyenda
        true, // usar tooltips
        false // generar URLs
        );
        chartPanel_3 = new ChartPanel(chart3);
        chartPanel_3.setPreferredSize(new java.awt.Dimension(324, 208));
        graficas.add(chartPanel_3, BorderLayout.WEST);
        /*------------------MÁS SELECCIONADOS------------------*/
        DefaultCategoryDataset pMS = new DefaultCategoryDataset();
        pMS.addValue(B_Seleccionar.frecuenciasMS[0], "PCi1", "PCi1");
        pMS.addValue(B_Seleccionar.frecuenciasMS[1], "PCi2", "PCi2");
        pMS.addValue(B_Seleccionar.frecuenciasMS[2], "PCu1", "PCu1");
        pMS.addValue(B_Seleccionar.frecuenciasMS[3], "PCu2", "PCu2");
        JFreeChart chart4 = ChartFactory.createBarChart(
        "PERFUMES MÁS SELECCIONADOS", // título del gráfico
        "Perfume", // etiqueta del eje horizontal
        "Frecuencia", // etiqueta del eje vertical
        pMS, // datos
        PlotOrientation.VERTICAL, // orientación
        true, // incluir leyenda
        true, // usar tooltips
        false // generar URLs
        );
        chartPanel_4 = new ChartPanel(chart4);
        chartPanel_4.setPreferredSize(new java.awt.Dimension(324, 208));
        
        graficas.setLayout(new BorderLayout());
        graficas.add(chartPanel_3, BorderLayout.WEST);
        graficas.add(chartPanel_4, BorderLayout.EAST);
        
        chartPanel_1.setVisible(false);
        chartPanel_2.setVisible(false);
        
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.pack();
    }//GEN-LAST:event_graficaBarraActionPerformed

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        boolean hayGrafica = chartPanel_1.isVisible() || 
			     chartPanel_2.isVisible() || 
	  		     chartPanel_3.isVisible() || 
			     chartPanel_4.isVisible();
        if(hayGrafica){
            Salida sal = new Salida();
            FraganceStudio fs = (FraganceStudio)this.getTopLevelAncestor();
            fs.showPanel(sal);
            fs.btnEstadistica.setEnabled(false);
            fs.btnGuardar.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(this, "Debes de seleccionar alguna gráfica", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnListoActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnListo;
    protected javax.swing.JButton graficaBarra;
    protected javax.swing.JButton graficaCircular;
    private javax.swing.JPanel graficas;
    // End of variables declaration//GEN-END:variables
}
