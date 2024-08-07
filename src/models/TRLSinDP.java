package models;

import java.io.IOException;
import java.io.InputStream;
import weka.classifiers.functions.LinearRegression;
import weka.core.DenseInstance;
import weka.core.SerializationHelper;

public class TRLSinDP {
    private final LinearRegression regresion;
    private final int ciudad;
    private final int mes;
    private final int hr;
    private final double maxima;
    private final double minima;
    
    public TRLSinDP(int ciudad, int mes, int hr, double maxima, double minima) throws IOException, Exception{
        
        InputStream is = getClass().getClassLoader().getResourceAsStream("dataset/TRLSinDP.model");
        regresion = (LinearRegression) SerializationHelper.read(is);
        
        this.ciudad = ciudad;
        this.mes = mes;
        this.hr = hr;
        this.maxima = maxima;
        this.minima = minima;
    }
    
    public LinearRegression getRegression() {
        return regresion;
    }
    
    public double classify() throws Exception {
   
        DenseInstance instance = new DenseInstance(4);
              
        instance.setValue(0, maxima);
        instance.setValue(1, minima);  
        instance.setValue(2, hr);       
        instance.setValue(3, mes);
        instance.setValue(4, ciudad);   

        return getRegression().classifyInstance(instance);
    }
}
