/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptransp;

/**
 *
 * @author Patricia
 */
public class EmpTransp {
    private String nombre;
    private final int MAX=10;
    private DePasajeros camiones[];
    private int ocupados;

    public EmpTransp() {
        camiones= new DePasajeros[MAX];
        ocupados=0;
    }

    public EmpTransp(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    public String estaDisponible(String placas){
        int i=0;
        boolean encontre=false;
        int resp=0;
        boolean disp=false;
        while(i<ocupados && !encontre){
            if(camiones[i].getPlacas().equals(placas)){
                encontre=true;
                if(camiones[i].isDisponible()){
                    disp=true;
                    resp=i;
                    }
                }
            else
                i++;
                    
            }
        
         if(encontre){
            if(disp)
                return camiones[i].getClass().getSimpleName();
            else
                return ("No está disponible");
        }
         else
             return ("No existe");
       
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

