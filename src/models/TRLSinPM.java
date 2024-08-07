/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.IOException;
import java.io.InputStream;
import weka.classifiers.functions.LinearRegression;
import weka.core.DenseInstance;
import weka.core.SerializationHelper;

/**
 *
 * @author Sofia
 */
public class TRLSinPM {
    private final LinearRegression regresion;
    private final int dia;
    private final int ciudad;
    private final int mes;
    private final int hr;
    private double maxima;
    
    public TRLSinPM(int dia, int ciudad, int mes, int hr, double maxima) throws IOException, Exception{
        
        InputStream is = getClass().getClassLoader().getResourceAsStream("dataset/TRLSinPM.model");
        regresion = (LinearRegression) SerializationHelper.read(is);
        
        this.dia = dia;
        this.ciudad = ciudad;
        this.mes = mes;
        this.hr = hr;
        this.maxima = maxima;
    }
    
    public LinearRegression getRegression() {
        return regresion;
    }
    
    public double classify() throws Exception {
   
        DenseInstance instance = new DenseInstance(6);
              
        instance.setValue(1, maxima);
        instance.setValue(2, hr);       
        instance.setValue(3, dia);
        instance.setValue(4, mes);
        instance.setValue(5, ciudad);      

        return getRegression().classifyInstance(instance);
    }
}
