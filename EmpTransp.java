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
        
       
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

