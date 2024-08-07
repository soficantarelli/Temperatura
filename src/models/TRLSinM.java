package models;

import java.io.IOException;
import java.io.InputStream;
import weka.classifiers.functions.LinearRegression;
import weka.core.DenseInstance;
import weka.core.SerializationHelper;

public class TRLSinM {
    private final LinearRegression regresion;
    private final int dia;
    private final int ciudad;
    private final int mes;
    private final int hr;
    private final int presion;
    private final double maxima;
    
    public TRLSinM(int dia, int ciudad, int mes, int hr, int presion, double maxima) throws IOException, Exception{
        
        InputStream is = getClass().getClassLoader().getResourceAsStream("dataset/TRLSinM.model");
        regresion = (LinearRegression) SerializationHelper.read(is);
        
        this.dia = dia;
        this.ciudad = ciudad;
        this.mes = mes;
        this.hr = hr;
        this.presion = presion;
        this.maxima = maxima;
    }
    
    public LinearRegression getRegression() {
        return regresion;
    }
    
    public double classify() throws Exception {
   
        DenseInstance instance = new DenseInstance(7);
              
        instance.setValue(1, maxima);                
        instance.setValue(2, presion);
        instance.setValue(3, hr);       
        instance.setValue(4, dia);
        instance.setValue(5, mes);
        instance.setValue(6, ciudad);  
        return getRegression().classifyInstance(instance);
    }
}
