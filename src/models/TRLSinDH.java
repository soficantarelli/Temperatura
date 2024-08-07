package models;

import java.io.IOException;
import java.io.InputStream;
import weka.classifiers.functions.LinearRegression;
import weka.core.DenseInstance;
import weka.core.SerializationHelper;

public class TRLSinDH {
    
    private final LinearRegression regresion;
    private final int ciudad;
    private final int mes;
    private final int presion;
    private final double maxima;
    private final double minima;
    
    public TRLSinDH(int ciudad, int mes, int presion, double maxima, double minima) throws IOException, Exception{
        
        InputStream is = getClass().getClassLoader().getResourceAsStream("dataset/TRLSinDH.model");
        regresion = (LinearRegression) SerializationHelper.read(is);
        
        this.ciudad = ciudad;
        this.mes = mes;
        this.presion = presion;
        this.maxima = maxima;
        this.minima = minima;
    }
    
    public LinearRegression getRegression() {
        return regresion;
    }
    
    public double classify() throws Exception {
   
        DenseInstance instance = new DenseInstance(6);
              
        instance.setValue(1, maxima);
        instance.setValue(2, minima);                  
        instance.setValue(3, presion);
        instance.setValue(4, mes);
        instance.setValue(5, ciudad);      

        return getRegression().classifyInstance(instance);
    }
}
