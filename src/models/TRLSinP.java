package models;

import java.io.IOException;
import java.io.InputStream;
import weka.classifiers.functions.LinearRegression;
import weka.core.DenseInstance;
import weka.core.SerializationHelper;

public class TRLSinP {
    private final LinearRegression regresion;
    private final int dia;
    private final int ciudad;
    private final int mes;
    private final int hr;
    private final double maxima;
    private final double minima;
    
    public TRLSinP(int dia, int ciudad, int mes, int hr,double maxima, double minima) throws IOException, Exception{
        
        InputStream is = getClass().getClassLoader().getResourceAsStream("dataset/TRLSinP.model");
        regresion = (LinearRegression) SerializationHelper.read(is);
        
        this.dia = dia;
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
   
        DenseInstance instance = new DenseInstance(7);
        
        instance.setValue(1, maxima);
        instance.setValue(2, minima); 
        instance.setValue(3, hr);       
        instance.setValue(4, dia);
        instance.setValue(5, mes);
        instance.setValue(6, ciudad);    

        return getRegression().classifyInstance(instance);
    }
}
