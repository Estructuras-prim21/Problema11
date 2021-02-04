/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema11;

/**
 *
 * @author ewara
 */
public class EmpTransp {
  private String nombreEmpresa;
    private DePasajeros[] camiones;
    private int totalCam;
    private int MAX=100;

    public EmpTransp() {
        totalCam=0;
        camiones= new DePasajeros[MAX];
    }
    
    public EmpTransp(String nombreEmpresa){
        this();
        this.nombreEmpresa=nombreEmpresa;
    } 
    
    //Alta Camiones
    //Escolar
    public void altaCamion (String marca, String numMotor, String placas, double costoCamion, int totalPasaj, boolean lugarProyecto){
        if(totalCam<camiones.length){
            camiones[totalCam]=new Escolar(marca, numMotor, placas, costoCamion, totalPasaj, lugarProyecto);
            totalCam++;
        }
    }
    //Turismo
    public void altaCamion (String marca, String numMotor, String placas, double costoCamion, int totalPasaj, boolean asientoCama, boolean serviBar){
        if(totalCam<camiones.length){
            camiones[totalCam]=new Turismo(marca,numMotor, placas, costoCamion, totalPasaj, asientoCama,serviBar);
            totalCam++;
        }
    }
    
    //5) Obtener y regresar el total de camiones de una cierta marca (la marca se recibe como parámetro), destinados al 
    //transporte de turistas que cuenten con servicio de bar y que el costo del servicio sea inferior a una cantidad recibida
    //como parámetro. También se recibe como parámetro la cantidad de kilómetros a recorrer.
    public double totalCamiones(String marca, double kilometros, double costo){
        double contador = 0;
        int posicion=-1;
        int i=0;
        boolean resp=false;
        
        while(i<totalCam && !camiones[i].getMarca().equalsIgnoreCase(marca)){
           posicion = i;
       }
        if(i<totalCam && camiones[i]instanceof Turismo){
         resp=true;
             if(((Turismo)camiones[posicion]).hayServiBar() && ((Turismo)camiones[posicion]).calculaCostoServicio(kilometros)< costo){
            contador ++;
             }
         }  
       return contador;
    }
}
