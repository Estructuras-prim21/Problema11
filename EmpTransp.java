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
    
    //3
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
        //pregunta 1
      public String rentaCamionTuristas(int totalPasaj, double km){
       StringBuilder sb=new StringBuilder();
       int i;
       
       /*i=0;
       while(i<ocupados && camiones[i].getTotalPasaj()!=totalPasaj)
           i++;
       
       if(i<ocupados && camiones[i]instanceof Turismo){*/
           for(i=0;i<ocupados;i++)
               if(camiones[i]instanceof Turismo && camiones[i].getTotalPasaj()==totalPasaj){
               sb.append(((Turismo)camiones[i]).toString()+"\n");
               sb.append(" ");
               sb.append("El costo del servicio es de: $"+((Turismo)camiones[i]).calculaCostoServicio(km));
               }
           
       
       return sb.toString();
   }
       
        //pregunta 4
    public String escolarProy20 (){
        String resp= "No hay camiones escolares que lleven mas de 20 alumnos y tengan espacio para proyectos";
   
        for(int i=0; i<totalCamiones; i++){
            if(camiones[i] instanceof Escolar){
                if(((Escolar)camiones[i]).isLugarProyecto()&& camiones[i].getTotalPasaj()>20){
                    resp=camiones[i].getPlacas() + "\n";
                }
            }
        }
        return resp;
    }
    
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

