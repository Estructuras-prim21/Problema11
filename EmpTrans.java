/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10.empresa.minera;

/**
 *
 * @author santi
 */
public class EmpTrans {
    private String nombre;
    private int totalCam;
    private DePasajeros[] camiones;
    private final int MAX=10;
    
    public EmpTrans(){
        camiones= new DePasajeros[MAX];
        totalCam=0;
    }

    public EmpTrans(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    //Escolar
    public boolean altaCamion(String marca, String numMotor, String placas, double costoCamion, int totalPasaj, boolean lugarProyecto){
        int i;
        boolean resp;
        Escolar uno;
        
        if(totalCam<MAX){//si hay lugar
            uno=new Escolar(lugarProyecto, totalPasaj, marca, numMotor, placas, costoCamion);
            i=0;
            while(i<totalCam && !camiones[i].getPlacas().equals(placas))
            i++;
            if(i<totalCam) //si se sale es pq ya esta ocupado
                resp=false;
            else{
                camiones[totalCam]=uno;
                totalCam++;
                resp=true;
            }
        }
        else
            resp=false; //no hay lugar
        return resp;
        
        
    }
    
    public boolean altaCamion(String marca, String numMotor, String placas, double costoCamion, int totalPasaj, boolean asientoCama, boolean serviBar){
        int i;
        boolean resp;
        Turismo uno;
        
        if(totalCam<MAX){//si hay lugar
            uno=new Turismo(asientoCama, serviBar, totalPasaj, marca, numMotor, placas, costoCamion);
            i=0;
            while(i<totalCam && !camiones[i].getPlacas().equals(placas))
            i++;
            if(i<totalCam) //si se sale es pq ya esta ocupado
                resp=false;
            else{
                camiones[totalCam]=uno;
                totalCam++;
                resp=true;
            }
        }
        else
            resp=false; //no hay lugar
        return resp;
    }
    
    //Turismo
    /*public void altaCamion (String marca, String numMotor, String placas, double costoCamion, int totalPasaj, boolean asientoCama, boolean serviBar){
        if(totalCam<camiones.length){
            camiones[totalCam]=new Turismo(marca,numMotor, placas, costoCamion, totalPasaj, asientoCama,serviBar);
            totalCam++;
        }
    }*/
    
     // 2)
    public boolean indicaCupoEscolares(int cantN, int cantC){ //cant camiones y cant niños
        boolean resp=false;
        int i, contC=0, contN=0;
        
        for(i=0;i<totalCam;i++)
            if(camiones[i]instanceof Escolar){
                contC++;
                if (camiones[i].getTotalPasj()>= cantN)
                    contN++; //si la capacidad de pasajeros es mayor a la que piden, aumenta el contador de camiones que pueden llevar esa capacidad      
            }
        
        if(contC >= cantC && contN >= cantN){
            resp=true;
        }
        
        return resp;
        
            
        
    }
    
    
    
    
    
    
}
