 package components;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class GraficoTD {

    public void start(JFXPanel stage) throws Exception {
        
        final NumberAxis yAxis = new NumberAxis(0, 30, 1);
        final CategoryAxis xAxis = new CategoryAxis();
        final LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxis);        
        yAxis.setLabel("Temperatura");
        xAxis.setLabel("Mes");
        
        XYChart.Series cordoba = new XYChart.Series();
        XYChart.Series usuhaia = new XYChart.Series();
        XYChart.Series trelew = new XYChart.Series();
        XYChart.Series jujuy = new XYChart.Series();
        XYChart.Series iguazu = new XYChart.Series();
        XYChart.Series neuquen = new XYChart.Series();
        
        cordoba.setName("Cordoba");
        usuhaia.setName("Usuhaia");
        trelew.setName("Trelew");
        jujuy.setName("Jujuy");
        iguazu.setName("Iguazu");
        neuquen.setName("Neuquen");
        
        float prom[], prom1[], prom2[], prom3[], prom4[], prom5[];
        prom = new float[12];
        prom1 = new float[12];
        prom2 = new float[12];
        prom3 = new float[12];
        prom4 = new float[12];
        prom5 = new float[12];
        float cant[], cant1[], cant2[], cant3[], cant4[], cant5[];
        cant = new float[12];
        cant1 = new float[12];
        cant2 = new float[12];
        cant3 = new float[12];
        cant4 = new float[12];
        cant5 = new float[12];
       
        ArrayList<String> meses = new ArrayList();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");
        
        //lectura de mi archivo de datos
        try {
            CSVReader dataReader = new CSVReader(new FileReader("../Temperatura.csv"));
            String[] nextLine;
           
            //TD, MAX, MIN, HR, PRESION, DIA, MES, CIUDAD
            while ((nextLine = dataReader.readNext()) != null) {
                
                String ciudad = String.valueOf(nextLine[7]);  
                String mes = String.valueOf(nextLine[6]);  
                float td = Float.parseFloat(nextLine[0]);
                
                if("Cordoba".equals(ciudad)){                                                          
                    switch(mes){
                        case "Enero":
                            prom[0] += td;                           
                            cant[0] += 1;
                            break;
                        case "Febrero":
                            prom[1] += td;
                            cant[1] += 1;
                            break;
                        case "Marzo":
                            prom[2] += td;
                            cant[2] += 1;
                            break;
                        case "Abril":
                            prom[3] += td;
                            cant[3] += 1;
                            break;
                        case "Mayo":
                            prom[4] += td;
                            cant[4] += 1;
                            break;
                        case "Junio":
                            prom[5] += td;
                            cant[5] += 1;
                            break;
                        case "Julio":
                            prom[6] += td;
                            cant[6] += 1;
                            break;
                        case "Agosto":
                            prom[7] += td;
                            cant[7] += 1;
                            break;
                        case "Septiembre":
                            prom[8] += td;
                            cant[8] += 1;
                            break;
                        case "Octubre":
                            prom[9] += td;
                            cant[9] += 1;
                            break;
                        case "Noviembre":
                            prom[10] += td;
                            cant[10] += 1;
                            break;
                        case "Diciembre":
                            prom[11] += td;
                            cant[11] += 1;
                            break;
                        default:
                            break;
                    }
                } else if("Usuhaia".equals(ciudad)){                                                          
                    switch(mes){
                        case "Enero":
                            prom1[0] += td;                           
                            cant1[0] += 1;
                            break;
                        case "Febrero":
                            prom1[1] += td;
                            cant1[1] += 1;
                            break;
                        case "Marzo":
                            prom1[2] += td;
                            cant1[2] += 1;
                            break;
                        case "Abril":
                            prom1[3] += td;
                            cant1[3] += 1;
                            break;
                        case "Mayo":
                            prom1[4] += td;
                            cant1[4] += 1;
                            break;
                        case "Junio":
                            prom1[5] += td;
                            cant1[5] += 1;
                            break;
                        case "Julio":
                            prom1[6] += td;
                            cant1[6] += 1;
                            break;
                        case "Agosto":
                            prom1[7] += td;
                            cant1[7] += 1;
                            break;
                        case "Septiembre":
                            prom1[8] += td;
                            cant1[8] += 1;
                            break;
                        case "Octubre":
                            prom1[9] += td;
                            cant1[9] += 1;
                            break;
                        case "Noviembre":
                            prom1[10] += td;
                            cant1[10] += 1;
                            break;
                        case "Diciembre":
                            prom1[11] += td;
                            cant1[11] += 1;
                            break;
                        default:
                            break;
                    }
                } else if("Trelew".equals(ciudad)){                                                          
                    switch(mes){
                        case "Enero":
                            prom2[0] += td;                           
                            cant2[0] += 1;
                            break;
                        case "Febrero":
                            prom2[1] += td;
                            cant2[1] += 1;
                            break;
                        case "Marzo":
                            prom2[2] += td;
                            cant2[2] += 1;
                            break;
                        case "Abril":
                            prom2[3] += td;
                            cant2[3] += 1;
                            break;
                        case "Mayo":
                            prom2[4] += td;
                            cant2[4] += 1;
                            break;
                        case "Junio":
                            prom2[5] += td;
                            cant2[5] += 1;
                            break;
                        case "Julio":
                            prom2[6] += td;
                            cant2[6] += 1;
                            break;
                        case "Agosto":
                            prom2[7] += td;
                            cant2[7] += 1;
                            break;
                        case "Septiembre":
                            prom2[8] += td;
                            cant2[8] += 1;
                            break;
                        case "Octubre":
                            prom2[9] += td;
                            cant2[9] += 1;
                            break;
                        case "Noviembre":
                            prom2[10] += td;
                            cant2[10] += 1;
                            break;
                        case "Diciembre":
                            prom2[11] += td;
                            cant2[11] += 1;
                            break;
                        default:
                            break;
                    }
                }else if("Jujuy".equals(ciudad)){                                                          
                    switch(mes){
                        case "Enero":
                            prom3[0] += td;                           
                            cant3[0] += 1;
                            break;
                        case "Febrero":
                            prom3[1] += td;
                            cant3[1] += 1;
                            break;
                        case "Marzo":
                            prom3[2] += td;
                            cant3[2] += 1;
                            break;
                        case "Abril":
                            prom3[3] += td;
                            cant3[3] += 1;
                            break;
                        case "Mayo":
                            prom3[4] += td;
                            cant3[4] += 1;
                            break;
                        case "Junio":
                            prom3[5] += td;
                            cant3[5] += 1;
                            break;
                        case "Julio":
                            prom3[6] += td;
                            cant3[6] += 1;
                            break;
                        case "Agosto":
                            prom3[7] += td;
                            cant3[7] += 1;
                            break;
                        case "Septiembre":
                            prom3[8] += td;
                            cant3[8] += 1;
                            break;
                        case "Octubre":
                            prom3[9] += td;
                            cant3[9] += 1;
                            break;
                        case "Noviembre":
                            prom3[10] += td;
                            cant3[10] += 1;
                            break;
                        case "Diciembre":
                            prom3[11] += td;
                            cant3[11] += 1;
                            break;
                        default:
                            break;
                    }
                }else if("Iguazu".equals(ciudad)){                                                          
                    switch(mes){
                        case "Enero":
                            prom4[0] += td;                           
                            cant4[0] += 1;
                            break;
                        case "Febrero":
                            prom4[1] += td;
                            cant4[1] += 1;
                            break;
                        case "Marzo":
                            prom4[2] += td;
                            cant4[2] += 1;
                            break;
                        case "Abril":
                            prom4[3] += td;
                            cant4[3] += 1;
                            break;
                        case "Mayo":
                            prom4[4] += td;
                            cant4[4] += 1;
                            break;
                        case "Junio":
                            prom4[5] += td;
                            cant4[5] += 1;
                            break;
                        case "Julio":
                            prom4[6] += td;
                            cant4[6] += 1;
                            break;
                        case "Agosto":
                            prom4[7] += td;
                            cant4[7] += 1;
                            break;
                        case "Septiembre":
                            prom4[8] += td;
                            cant4[8] += 1;
                            break;
                        case "Octubre":
                            prom4[9] += td;
                            cant4[9] += 1;
                            break;
                        case "Noviembre":
                            prom4[10] += td;
                            cant4[10] += 1;
                            break;
                        case "Diciembre":
                            prom4[11] += td;
                            cant4[11] += 1;
                            break;
                        default:
                            break;
                    }
                }else if("Neuquen".equals(ciudad)){                                                          
                    switch(mes){
                        case "Enero":
                            prom5[0] += td;                           
                            cant5[0] += 1;
                            break;
                        case "Febrero":
                            prom5[1] += td;
                            cant5[1] += 1;
                            break;
                        case "Marzo":
                            prom5[2] += td;
                            cant5[2] += 1;
                            break;
                        case "Abril":
                            prom5[3] += td;
                            cant5[3] += 1;
                            break;
                        case "Mayo":
                            prom5[4] += td;
                            cant5[4] += 1;
                            break;
                        case "Junio":
                            prom5[5] += td;
                            cant5[5] += 1;
                            break;
                        case "Julio":
                            prom5[6] += td;
                            cant5[6] += 1;
                            break;
                        case "Agosto":
                            prom5[7] += td;
                            cant5[7] += 1;
                            break;
                        case "Septiembre":
                            prom5[8] += td;
                            cant5[8] += 1;
                            break;
                        case "Octubre":
                            prom5[9] += td;
                            cant5[9] += 1;
                            break;
                        case "Noviembre":
                            prom5[10] += td;
                            cant5[10] += 1;
                            break;
                        case "Diciembre":
                            prom5[11] += td;
                            cant5[11] += 1;
                            break;
                        default:
                            break;
                    }
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }                        
        for(int i = 0; i < 12; i++){        
            cordoba.getData().add(new XYChart.Data(meses.get(i), prom[i]/cant[i]));
            usuhaia.getData().add(new XYChart.Data(meses.get(i), prom1[i]/cant1[i]));
            trelew.getData().add(new XYChart.Data(meses.get(i), prom2[i]/cant2[i]));
            jujuy.getData().add(new XYChart.Data(meses.get(i), prom3[i]/cant3[i]));
            iguazu.getData().add(new XYChart.Data(meses.get(i), prom4[i]/cant4[i]));
            neuquen.getData().add(new XYChart.Data(meses.get(i), prom5[i]/cant5[i]));
        }
                     
        lineChart.getData().add(cordoba);
        lineChart.getData().add(usuhaia);
        lineChart.getData().add(trelew);
        lineChart.getData().add(jujuy);
        lineChart.getData().add(iguazu);
        lineChart.getData().add(neuquen);
        Scene scene = new Scene(lineChart, 700, 400);
        stage.setScene(scene);
    }
}