import components.GraficoTD;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import models.*;
        
public class IngresoDatos extends javax.swing.JFrame {

    /**
     * Creates new form IngresoDatos
     */
    public IngresoDatos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cCiudad = new javax.swing.JComboBox<>();
        lProvincia = new javax.swing.JLabel();
        lMes = new javax.swing.JLabel();
        lDia = new javax.swing.JLabel();
        cMes = new javax.swing.JComboBox<>();
        lTitulo = new javax.swing.JLabel();
        tResultado = new javax.swing.JTextField();
        lResultado = new javax.swing.JLabel();
        bCalcular = new javax.swing.JButton();
        lTemperaturaMaxima = new javax.swing.JLabel();
        lTemperaturaMinima = new javax.swing.JLabel();
        lHumedad = new javax.swing.JLabel();
        lPresionAtmosferica = new javax.swing.JLabel();
        tTemMaxima = new javax.swing.JTextField();
        tTempMinima = new javax.swing.JTextField();
        tHumedad = new javax.swing.JTextField();
        tDia = new javax.swing.JTextField();
        tPresion = new javax.swing.JTextField();
        Graficar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cCiudad.setBackground(new java.awt.Color(102, 153, 255));
        cCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trelew", "Neuquen", "Usuhaia", "Cordoba", "Jujuy", "Iguazu" }));
        cCiudad.setPreferredSize(new java.awt.Dimension(70, 20));
        cCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCiudadActionPerformed(evt);
            }
        });

        lProvincia.setText("Ciudad");

        lMes.setText("Mes");

        lDia.setText("Día");

        cMes.setBackground(new java.awt.Color(102, 153, 255));
        cMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cMes.setToolTipText("");

        lTitulo.setText("Ingrese datos  para conocer la temperatura promedio");

        tResultado.setEditable(false);

        lResultado.setText("Temperatura Promedio");

        bCalcular.setText("Calcular");
        bCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcularActionPerformed(evt);
            }
        });

        lTemperaturaMaxima.setText("Temperatura Máxima");

        lTemperaturaMinima.setText("Temperatura Mínima");

        lHumedad.setText("Humedad");

        lPresionAtmosferica.setText("Presión Atmosférica");

        tTemMaxima.setToolTipText("");
        tTemMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTemMaximaActionPerformed(evt);
            }
        });
        tTemMaxima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tTemMaximaKeyTyped(evt);
            }
        });

        tTempMinima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tTempMinimaKeyTyped(evt);
            }
        });

        tHumedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tHumedadKeyTyped(evt);
            }
        });

        tDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tDiaKeyTyped(evt);
            }
        });

        tPresion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tPresionKeyTyped(evt);
            }
        });

        Graficar.setText("Graficar");
        Graficar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GraficarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lTemperaturaMaxima)
                                .addGap(18, 18, 18)
                                .addComponent(tTemMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lTemperaturaMinima)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tTempMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lHumedad)
                                    .addComponent(lPresionAtmosferica))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tPresion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lDia)
                            .addComponent(lMes))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tDia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cMes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lResultado)
                            .addComponent(tResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)))
                .addComponent(Graficar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTemperaturaMaxima)
                    .addComponent(tTemMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTemperaturaMinima)
                    .addComponent(tTempMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lMes))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lHumedad)
                    .addComponent(tHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDia)
                    .addComponent(tDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lPresionAtmosferica)
                    .addComponent(tPresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(lResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Graficar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tPresion.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcularActionPerformed
        
        if(tTemMaxima.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresar temperatura máxima");
        }
                
        int ciudad = cCiudad.getSelectedIndex();
        int mes = cMes.getSelectedIndex();
        double maxima = Double.parseDouble(tTemMaxima.getText());
        
        try {
            
            if(!tDia.getText().isEmpty()){
               
                int dia = Integer.parseInt(tDia.getText()) - 1;
                System.out.println(dia);
                
                if(tPresion.getText().isEmpty()){                    
                    calculandoPresionVacia(dia, ciudad, mes, maxima);
                
                } else if(tHumedad.getText().isEmpty()){
                    calculandoHumedadVacia(dia, ciudad, mes, Integer.parseInt(tPresion.getText()), maxima);

                } else if(tTempMinima.getText().isEmpty()){

                    int hr = Integer.parseInt(tHumedad.getText());
                    int presion = Integer.parseInt(tPresion.getText());

                    TRLSinDM td = new TRLSinDM(ciudad, mes, hr, presion, maxima);                         
                    tResultado.setText(String.format("%.1f", td.classify()));

                } else{           
                    
                    double minima = Double.parseDouble(tTempMinima.getText());
                    int hr = Integer.parseInt(tHumedad.getText());
                    int presion = Integer.parseInt(tPresion.getText());
        
                    TRegresionLineal td = new TRegresionLineal(dia, ciudad, mes, hr, presion, maxima, minima);                       
                    tResultado.setText(String.format("%.1f", td.classify()));
                }
                
            } else {
                calculandoDiaVacio(ciudad, mes, maxima);
            }       

        } catch (Exception ex) {
            Logger.getLogger(IngresoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bCalcularActionPerformed
    
    public void calculandoHumedadVacia(int dia, int ciudad, int mes, int presion, double maxima){
        try{
            if(tTempMinima.getText().isEmpty()){
                //Modelo TRLSinHM
                TRLSinHM td = new TRLSinHM(dia, ciudad, mes, presion, maxima);
                System.out.println(td.classify());                           
                tResultado.setText(String.format("%.1f", td.classify()));
                  
            }else{ 
                double minima = Double.parseDouble(tTempMinima.getText());
                TRLSinH td = new TRLSinH(dia, ciudad, mes, presion, maxima, minima);
                System.out.println(td.classify());                           
                tResultado.setText(String.format("%.1f", td.classify()));
            }
        } catch (Exception ex) {
            Logger.getLogger(IngresoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void calculandoPresionVacia(int dia, int ciudad, int mes, double maxima){
        try {
            
            if(tHumedad.getText().isEmpty()  && tTempMinima.getText().isEmpty()){
                
                double minima = Double.parseDouble(tTempMinima.getText());
                TRLSinDHP td = new TRLSinDHP(ciudad, mes, maxima, minima);                         
                tResultado.setText(String.format("%.1f", td.classify()));

            } else if(tHumedad.getText().isEmpty()){
                
                double minima = Double.parseDouble(tTempMinima.getText());
                TRLSinHP td = new TRLSinHP(dia,ciudad, mes, maxima, minima);                        
                tResultado.setText(String.format("%.1f", td.classify()));

            }else if(tTempMinima.getText().isEmpty()){
                 
                //Modelo TRLSinPM
                int hr = Integer.parseInt(tHumedad.getText());
                TRLSinPM td = new TRLSinPM(dia, ciudad, mes, hr, maxima);
                System.out.println(td.classify());                           
                tResultado.setText(String.format("%.1f", td.classify()));
                
            } else {
                //Modelo TRLSinP
                double minima = Double.parseDouble(tTempMinima.getText());
                int hr = Integer.parseInt(tHumedad.getText());

                TRLSinP td = new TRLSinP(dia, ciudad, mes, hr, maxima, minima);

                System.out.println(td.classify());                           
                tResultado.setText(String.format("%.1f", td.classify()));

            }
           

        } catch (Exception ex) {
            Logger.getLogger(IngresoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calculandoDiaVacio(int ciudad, int mes, double maxima){
        
        try{
            if(tHumedad.getText().isEmpty()){
                
                if(tPresion.getText().isEmpty() && tTempMinima.getText().isEmpty()){
                    
                    //Modelo TRLSinPHMD
                    TRLSinPHMD td = new TRLSinPHMD(ciudad, mes, maxima);
                    System.out.println(td.classify());                           
                    tResultado.setText(String.format("%.1f", td.classify()));
                
                } else if(tPresion.getText().isEmpty()){
                    
                    //Modelo TRLSinDHP
                    double minima = Double.parseDouble(tTempMinima.getText());

                    TRLSinDHP td = new TRLSinDHP(ciudad, mes, maxima, minima);
                    System.out.println(td.classify());                           
                    tResultado.setText(String.format("%.1f", td.classify()));
                    
                } else if(tTempMinima.getText().isEmpty()){
                    
                    //Modelo TRLSinDHM
                    int presion = Integer.parseInt(tPresion.getText());

                    TRLSinDHM td = new TRLSinDHM(ciudad, mes, presion, maxima);
                    System.out.println(td.classify());                           
                    tResultado.setText(String.format("%.1f", td.classify()));
                    
                } else{
                    //Modelo TRLSinDH
                    double minima = Double.parseDouble(tTempMinima.getText());
                    int presion = Integer.parseInt(tPresion.getText());

                    TRLSinDH td = new TRLSinDH(ciudad, mes, presion, maxima, minima);
                    System.out.println(td.classify());                           
                    tResultado.setText(String.format("%.1f", td.classify()));
                }
            } else if(tPresion.getText().isEmpty()){                   
                if(tTempMinima.getText().isEmpty()){
                    //Modelo TRLSinDPM
                    int hr = Integer.parseInt(tHumedad.getText());

                    TRLSinDPM td = new TRLSinDPM(ciudad, mes, hr, maxima);
                    System.out.println(td.classify());                           
                    tResultado.setText(String.format("%.1f", td.classify()));
                }else{
                    //Modelo TRLSinDP
                    double minima = Double.parseDouble(tTempMinima.getText());
                    int hr = Integer.parseInt(tHumedad.getText());

                    TRLSinDP td = new TRLSinDP(ciudad, mes, hr, maxima, minima);

                    System.out.println(td.classify());                           
                    tResultado.setText(String.format("%.1f", td.classify()));
                }            
            } else if(tTempMinima.getText().isEmpty()){
                //Modelo TRLSinDM

                int hr = Integer.parseInt(tHumedad.getText());
                int presion = Integer.parseInt(tPresion.getText());

                TRLSinDM td = new TRLSinDM(ciudad, mes, hr, presion, maxima);
                System.out.println(td.classify());                           
                tResultado.setText(String.format("%.1f", td.classify()));               

            } else {
                //Modelo TRLSinD
                double minima = Double.parseDouble(tTempMinima.getText());
                int hr = Integer.parseInt(tHumedad.getText());
                int presion = Integer.parseInt(tPresion.getText());

                TRLSinD td = new TRLSinD(ciudad, mes, hr, presion, maxima, minima);
                System.out.println(td.classify());                           
                tResultado.setText(String.format("%.1f", td.classify()));
            }
        } catch (Exception ex) {
            Logger.getLogger(IngresoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }                
    }
    
    private void tTemMaximaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tTemMaximaKeyTyped
        char c = evt.getKeyChar();           
        if (!(c >= '0' && c <= '9') && !(c == '-') && !(c == '.')  && c != '\b') {
            evt.consume();
        }   
    }//GEN-LAST:event_tTemMaximaKeyTyped

    private void tTempMinimaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tTempMinimaKeyTyped
        char c = evt.getKeyChar();           
        if (!(c >= '0' && c <= '9') && !(c == '-') && !(c == '.')  && c != '\b') {
            evt.consume();
        } 
    }//GEN-LAST:event_tTempMinimaKeyTyped

    private void tHumedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tHumedadKeyTyped
        char c = evt.getKeyChar();           
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_tHumedadKeyTyped

    private void tDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tDiaKeyTyped
        char c = evt.getKeyChar();    
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_tDiaKeyTyped

    private void tPresionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPresionKeyTyped
        char c = evt.getKeyChar();    
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_tPresionKeyTyped

    private void cCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCiudadActionPerformed

    private void GraficarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraficarMouseClicked
       
        JFrame frame = new JFrame("Temperatura promedio");
        final JFXPanel fxPanel = new JFXPanel();
        frame.add(fxPanel);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    initFX(fxPanel);
                } catch (Exception ex) {
                    Logger.getLogger(IngresoDatos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
       });
          
    }//GEN-LAST:event_GraficarMouseClicked

    private void tTemMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTemMaximaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTemMaximaActionPerformed
        
    private static void initFX(JFXPanel fxPanel) throws Exception {
        // This method is invoked on the JavaFX thread
        Scene scene = createScene();
        fxPanel.setScene(scene);
        GraficoTD p = new GraficoTD();
        p.start(fxPanel);
    }

    private static Scene createScene() {
        Group  root;
        root = new  Group();
        Scene  scene;
        scene = new  Scene(root, Color.ALICEBLUE);
        Text  text  =  new  Text();

        text.setX(40);
        text.setY(100);

        root.getChildren().add(text);

        return (scene);
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
            java.util.logging.Logger.getLogger(IngresoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Graficar;
    private javax.swing.JButton bCalcular;
    private javax.swing.JComboBox<String> cCiudad;
    private javax.swing.JComboBox<String> cMes;
    private javax.swing.JLabel lDia;
    private javax.swing.JLabel lHumedad;
    private javax.swing.JLabel lMes;
    private javax.swing.JLabel lPresionAtmosferica;
    private javax.swing.JLabel lProvincia;
    private javax.swing.JLabel lResultado;
    private javax.swing.JLabel lTemperaturaMaxima;
    private javax.swing.JLabel lTemperaturaMinima;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextField tDia;
    private javax.swing.JTextField tHumedad;
    private javax.swing.JTextField tPresion;
    private javax.swing.JTextField tResultado;
    private javax.swing.JTextField tTemMaxima;
    private javax.swing.JTextField tTempMinima;
    // End of variables declaration//GEN-END:variables
}
