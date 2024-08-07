package models;

import java.io.IOException;
import java.io.InputStream;
import weka.classifiers.functions.LinearRegression;
import weka.core.DenseInstance;
import weka.core.SerializationHelper;

public class TRLSinDPM {
    private final LinearRegression regresion;
    private final int ciudad;
    private final int mes;
    private final int hr;
    private final double maxima;
    
    public TRLSinDPM(int ciudad, int mes, int hr, double maxima) throws IOException, Exception{
        
        InputStream is = getClass().getClassLoader().getResourceAsStream("dataset/TRLSinDPM.model");
        regresion = (LinearRegression) SerializationHelper.read(is);
        
        this.ciudad = ciudad;
        this.mes = mes;
        this.hr = hr;
        this.maxima = maxima;

    }
    
    public LinearRegression getRegression() {
        return regresion;
    }
    
    public double classify() throws Exception {
   
        DenseInstance instance = new DenseInstance(5);
              
        instance.setValue(1, maxima);
        instance.setValue(2, hr);       
        instance.setValue(3, mes);
        instance.setValue(4, ciudad);   

        return getRegression().classifyInstance(instance);
    }
}
