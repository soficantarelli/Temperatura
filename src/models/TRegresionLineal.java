package models;

import java.io.IOException;
import java.io.InputStream;
import weka.classifiers.functions.LinearRegression;
import weka.core.DenseInstance;
import weka.core.SerializationHelper;

public class TRegresionLineal {
    
    private final LinearRegression regresion;
    private final int dia;
    private final int ciudad;
    private final int mes;
    private final int hr;
    private final int presion;
    private final double maxima;
    private final double minima;
    
    /* public TRegresionLineal() throws IOException, Exception{
         InputStream is = getClass().getClassLoader().getResourceAsStream("dataset/TRegresionLineal.model");
        regresion = (LinearRegression) SerializationHelper.read(is);
        
        this.hr = 55;
        this.presion = 1000;
        this.maxima = 20;
        this.minima = 10;
     }*/
    
    public TRegresionLineal(int dia, int ciudad, int mes, int hr, int presion, double maxima, double minima) throws IOException, Exception{
        
        InputStream is = getClass().getClassLoader().getResourceAsStream("dataset/TRegresionLineal.model");
        regresion = (LinearRegression) SerializationHelper.read(is);
        
        this.dia = dia;
        this.ciudad = ciudad;
        this.mes = mes;
        this.hr = hr;
        this.presion = presion;
        this.maxima = maxima;
        this.minima = minima;
    }
    
    public LinearRegression getRegression() {
        return regresion;
    }
    
    public double classify() throws Exception {
        DenseInstance instance;
        instance = new DenseInstance(8);   
        
         System.out.println(instance.numValues());     
        
        instance.setValue(1, maxima);
        instance.setValue(2, minima);                  
        instance.setValue(3, hr);
        instance.setValue(4, presion);       
        instance.setValue(5, dia); //dia
        instance.setValue(6, mes); //mes
        instance.setValue(7, ciudad); //ciudad
        
        System.out.println(instance);       
        
        return getRegression().classifyInstance(instance);
    } 
}
