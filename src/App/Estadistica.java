package App;

import java.awt.GridLayout;
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
        
        /*------------------MÁS BUSCADOS/CIRCULARES------------------*/
        DefaultPieDataset pMBC = new DefaultPieDataset();
        pMBC.setValue("PCi1", Crear.frecuenciasMB[0]); // accedes al arreglo estático así
        pMBC.setValue("PCi2", Crear.frecuenciasMB[1]);
        pMBC.setValue("PCu1", Crear.frecuenciasMB[2]);
        pMBC.setValue("PCu2", Crear.frecuenciasMB[3]);
        JFreeChart chart1 = ChartFactory.createPieChart(
            "PERFUMES MÁS BUSCADOS", // título del gráfico
            pMBC, // datos
            true, // incluir leyenda
            true, 
            false 
            );
        chartPanel_1 = new ChartPanel(chart1);
        chartPanel_1.setPreferredSize(new java.awt.Dimension(324, 208));
        /*------------------MÁS SELECCIONADOS/CIRCULARES------------------*/
        DefaultPieDataset pMSC = new DefaultPieDataset();
        pMSC.setValue("PCi1", B_Seleccionar.frecuenciasMS[0]); // accedes al arreglo estático así
        pMSC.setValue("PCi2", B_Seleccionar.frecuenciasMS[1]);
        pMSC.setValue("PCu1", B_Seleccionar.frecuenciasMS[2]);
        pMSC.setValue("PCu2", B_Seleccionar.frecuenciasMS[3]);
        JFreeChart chart2 = ChartFactory.createPieChart(
            "PERFUMES MÁS SELECCIONADOS", // título del gráfico
            pMSC, // datos
            true, // incluir leyenda
            true, 
            false 
            );
        chartPanel_2 = new ChartPanel(chart2);
        chartPanel_2.setPreferredSize(new java.awt.Dimension(324, 208));
        /*------------------MÁS ANIMADO PREDETERMINADO/CIRCULARES------------------*/
        DefaultPieDataset pIDC = new DefaultPieDataset();
        pIDC.setValue("Introduccion", Animar.frecuenciasP[0]);
        pIDC.setValue("Despedida", Animar.frecuenciasP[1]);
        JFreeChart chart3 = ChartFactory.createPieChart(
        "MÁS ANIMADO-PREDETERMINADO", // título del gráfico
        pIDC, // datos
        true, // incluir leyenda
        true, 
        false 
        );
        chartPanel_3 = new ChartPanel(chart3);
        chartPanel_3.setPreferredSize(new java.awt.Dimension(324, 208));
        /*------------------MÁS ANIMADO FRAMES/CIRCULARES------------------*/
        DefaultPieDataset fIDC = new DefaultPieDataset();
        fIDC.setValue("Caida Izquierda", Animar.frecuenciasF[0]);
        fIDC.setValue("Caida Derecha", Animar.frecuenciasF[1]);
        JFreeChart chart4 = ChartFactory.createPieChart(
        "MÁS ANIMADO-FRAMES", // título del gráfico
        fIDC, // datos
        true, // incluir leyenda
        true, 
        false 
        );
        chartPanel_4 = new ChartPanel(chart4);
        chartPanel_4.setPreferredSize(new java.awt.Dimension(324, 208));
        /*------------------MÁS BUSCADOS/BARRAS------------------*/
        DefaultCategoryDataset pMBB = new DefaultCategoryDataset();
        pMBB.addValue(Crear.frecuenciasMB[0], "PCi1", "PCi1");
        pMBB.addValue(Crear.frecuenciasMB[1], "PCi2", "PCi2");
        pMBB.addValue(Crear.frecuenciasMB[2], "PCu1", "PCu1");
        pMBB.addValue(Crear.frecuenciasMB[3], "PCu2", "PCu2");
        JFreeChart chart5 = ChartFactory.createBarChart(
        "PERFUMES MÁS BUSCADOS", // título del gráfico
        "Perfume", // etiqueta del eje horizontal
        "Frecuencia", // etiqueta del eje vertical
        pMBB, // datos
        PlotOrientation.VERTICAL, // orientación
        true, // incluir leyenda
        true, // usar tooltips
        false // generar URLs
        );
        chartPanel_5 = new ChartPanel(chart5);
        chartPanel_5.setPreferredSize(new java.awt.Dimension(324, 208));
        /*------------------MÁS SELECCIONADOS/BARRAS------------------*/
        DefaultCategoryDataset pMSB = new DefaultCategoryDataset();
        pMSB.addValue(B_Seleccionar.frecuenciasMS[0], "PCi1", "PCi1");
        pMSB.addValue(B_Seleccionar.frecuenciasMS[1], "PCi2", "PCi2");
        pMSB.addValue(B_Seleccionar.frecuenciasMS[2], "PCu1", "PCu1");
        pMSB.addValue(B_Seleccionar.frecuenciasMS[3], "PCu2", "PCu2");
        JFreeChart chart6 = ChartFactory.createBarChart(
        "PERFUMES MÁS SELECCIONADOS", // título del gráfico
        "Perfume", // etiqueta del eje horizontal
        "Frecuencia", // etiqueta del eje vertical
        pMSB, // datos
        PlotOrientation.VERTICAL, // orientación
        true, // incluir leyenda
        true, // usar tooltips
        false // generar URLs
        );
        chartPanel_6 = new ChartPanel(chart6);
        chartPanel_6.setPreferredSize(new java.awt.Dimension(324, 208));
        /*------------------MÁS ANIMADO PREDETERMINADO/BARRAS------------------*/
        DefaultCategoryDataset pIDB = new DefaultCategoryDataset();
        pIDB.addValue(Animar.frecuenciasF[0], "Caida Derecha", "Caida Derecha");
        pIDB.addValue(Animar.frecuenciasF[1], "Caida Izquierda", "Caida Izquierda");
        JFreeChart chart7 = ChartFactory.createBarChart(
        "MÁS ANIMADO-PREDETERMINADO", // título del gráfico
        "Frames", // etiqueta del eje horizontal
        "Frecuencia", // etiqueta del eje vertical
        pIDB, // datos
        PlotOrientation.VERTICAL, // orientación
        true, // incluir leyenda
        true, // usar tooltips
        false // generar URLs
        );
        chartPanel_7 = new ChartPanel(chart7);
        chartPanel_7.setPreferredSize(new java.awt.Dimension(324, 208));
        /*------------------MÁS ANIMADO FRAMES/BARRAS------------------*/
        DefaultCategoryDataset fIDB = new DefaultCategoryDataset();
        fIDB.addValue(Animar.frecuenciasF[0], "Caida Derecha", "Caida Derecha");
        fIDB.addValue(Animar.frecuenciasF[1], "Caida Izquierda", "Caida Izquierda");
        JFreeChart chart8 = ChartFactory.createBarChart(
        "MÁS ANIMADO-FRAMES", // título del gráfico
        "Frames", // etiqueta del eje horizontal
        "Frecuencia", // etiqueta del eje vertical
        fIDB, // datos
        PlotOrientation.VERTICAL, // orientación
        true, // incluir leyenda
        true, // usar tooltips
        false // generar URLs
        );
        chartPanel_8 = new ChartPanel(chart8);
        chartPanel_8.setPreferredSize(new java.awt.Dimension(324, 208));
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
    ChartPanel chartPanel_5;
    ChartPanel chartPanel_6;
    ChartPanel chartPanel_7;
    ChartPanel chartPanel_8;
    
    private boolean graficaC_BPresionado;
    
    
    private void graficaCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaCircularActionPerformed
        graficaC_BPresionado = true;
        GridLayout gridLayout = new GridLayout(2, 2);

        graficas.setLayout(gridLayout);
        
        graficas.remove(chartPanel_5);
        graficas.remove(chartPanel_6);
        graficas.remove(chartPanel_7);
        graficas.remove(chartPanel_8);
        
        graficas.add(chartPanel_1);
        graficas.add(chartPanel_3);
        graficas.add(chartPanel_2);
        graficas.add(chartPanel_4);
        
        graficas.revalidate();
        graficas.repaint();
   
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.pack();
    }//GEN-LAST:event_graficaCircularActionPerformed

    private void graficaBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaBarraActionPerformed
        graficaC_BPresionado = false;
        GridLayout gridLayout = new GridLayout(2, 2);
        
        graficas.setLayout(gridLayout);
        
        graficas.remove(chartPanel_1);
        graficas.remove(chartPanel_2);
        graficas.remove(chartPanel_3);
        graficas.remove(chartPanel_4);
        
        graficas.add(chartPanel_5);
        graficas.add(chartPanel_7);
        graficas.add(chartPanel_6);
        graficas.add(chartPanel_8);
        
        graficas.revalidate();
        graficas.repaint();

        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.pack();
    }//GEN-LAST:event_graficaBarraActionPerformed

    public ChartPanel[] getGraficasGeneradas(){
        ChartPanel[] graficasGeneradas = new ChartPanel[4];
        if(graficaC_BPresionado){
            graficasGeneradas[0] = chartPanel_1;
            graficasGeneradas[1] = chartPanel_3; 
            graficasGeneradas[2] = chartPanel_2;
            graficasGeneradas[3] = chartPanel_4;
        }else{
            graficasGeneradas[0] = chartPanel_5;
            graficasGeneradas[1] = chartPanel_7; 
            graficasGeneradas[2] = chartPanel_6;
            graficasGeneradas[3] = chartPanel_8;
        }
        return graficasGeneradas;
    }
    
    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        int numGraficas = graficas.getComponentCount();
        if(numGraficas > 0){
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
