package models;

import java.io.IOException;
import java.io.InputStream;
import weka.classifiers.functions.LinearRegression;
import weka.core.DenseInstance;
import weka.core.SerializationHelper;

public class TRLSinPHMD {
    private final LinearRegression regresion;
    private final int ciudad;
    private final int mes;
    private final double maxima;
    
    public TRLSinPHMD(int ciudad, int mes, double maxima) throws IOException, Exception{
        
        InputStream is = getClass().getClassLoader().getResourceAsStream("dataset/TRLSinPHMD.model");
        regresion = (LinearRegression) SerializationHelper.read(is);
        
        this.ciudad = ciudad;
        this.mes = mes;
        this.maxima = maxima;
    }
    
    public LinearRegression getRegression() {
        return regresion;
    }
    
    public double classify() throws Exception {
   
        DenseInstance instance = new DenseInstance(4);
              
        instance.setValue(1, maxima);
        instance.setValue(2, mes);
        instance.setValue(3, ciudad);   

        return getRegression().classifyInstance(instance);
    }
}
