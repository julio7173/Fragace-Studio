package pp;

import java.util.HashMap;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

class Estadistica extends javax.swing.JPanel {

    HashMap<String, Integer> mapa; // Un atributo que almacena el mapa recibido desde la clase Crear
    
    public Estadistica(/*HashMap<String, Integer> mapa*/) {
        initComponents();
        //this.mapa = mapa; // Asigna el mapa recibido al atributo de la clase
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        graCircular = new javax.swing.JButton();
        graBarra = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        graCircular.setBackground(new java.awt.Color(102, 102, 102));
        graCircular.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        graCircular.setForeground(new java.awt.Color(0, 0, 0));
        graCircular.setText("CIRCULAR");
        graCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graCircularActionPerformed(evt);
            }
        });

        graBarra.setBackground(new java.awt.Color(102, 102, 102));
        graBarra.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        graBarra.setForeground(new java.awt.Color(0, 0, 0));
        graBarra.setText("BARRAS");
        graBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graBarraActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(graCircular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(graBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graCircular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void graCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graCircularActionPerformed
        /*JPanel panel = crearGraficoTorta(mapa); // Crea el panel con el gráfico usando el método anterior
        jPanel2.add(panel); // Agrega el panel al jPanel2
        jPanel2.validate(); // Valida los cambios en el jPanel2*/
    }//GEN-LAST:event_graCircularActionPerformed

    private void graBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graBarraActionPerformed

    
    /*private static JPanel crearGraficoTorta (HashMap<String, Integer> mapa) {
        // Crear el dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (String nombre : mapa.keySet()) { // Recorre el conjunto de claves del mapa
            dataset.setValue(nombre, mapa.get(nombre)); // Agrega el nombre y la frecuencia al dataset
        }

        // Crear el gráfico
        JFreeChart chart = ChartFactory.createPieChart(
            "Frecuencia de perfumes", // título
            dataset, // datos
            true, // leyenda
            true, // tooltips
            false // urls
        );

        // Mostrar el gráfico en un panel
        ChartPanel panel = new ChartPanel(chart); // Crea un objeto ChartPanel a partir del gráfico
        return panel; // Retorna el panel con el gráfico
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton graBarra;
    private javax.swing.JButton graCircular;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
