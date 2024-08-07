package models;

import java.io.IOException;
import java.io.InputStream;
import weka.classifiers.functions.LinearRegression;
import weka.core.DenseInstance;
import weka.core.SerializationHelper;

public class TRLSinHPM {
    private final LinearRegression regresion;
    private final int dia;
    private final int ciudad;
    private final int mes;
    private final double maxima;
    
    public TRLSinHPM(int dia, int ciudad, int mes, double maxima) throws IOException, Exception{
        
        InputStream is = getClass().getClassLoader().getResourceAsStream("dataset/TRLSinHPM.model");
        regresion = (LinearRegression) SerializationHelper.read(is);
        
        this.dia = dia;
        this.ciudad = ciudad;
        this.mes = mes;
        this.maxima = maxima;
    }
    
    public LinearRegression getRegression() {
        return regresion;
    }
    
    public double classify() throws Exception {
   
        DenseInstance instance = new DenseInstance(5);
              
        instance.setValue(1, maxima);       
        instance.setValue(2, dia);
        instance.setValue(3, mes);
        instance.setValue(4, ciudad);    

        return getRegression().classifyInstance(instance);
    }
}
