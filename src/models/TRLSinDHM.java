package models;

import java.io.IOException;
import java.io.InputStream;
import weka.classifiers.functions.LinearRegression;
import weka.core.DenseInstance;
import weka.core.SerializationHelper;

public class TRLSinDHM {
    private final LinearRegression regresion;
    private final int ciudad;
    private final int mes;
    private final int presion;
    private double maxima;

    
    public TRLSinDHM(int ciudad, int mes, int presion, double maxima) throws IOException, Exception{
        
        InputStream is = getClass().getClassLoader().getResourceAsStream("dataset/TRLSinDHM.model");
        regresion = (LinearRegression) SerializationHelper.read(is);
        
        this.ciudad = ciudad;
        this.mes = mes;
        this.presion = presion;
        this.maxima = maxima;
    }
    
    public LinearRegression getRegression() {
        return regresion;
    }
    
    public double classify() throws Exception {
   
        DenseInstance instance = new DenseInstance(5);
              
        instance.setValue(1, maxima);                 
        instance.setValue(2, presion);
        instance.setValue(3, mes);
        instance.setValue(4, ciudad);    

        return getRegression().classifyInstance(instance);
    }
}
