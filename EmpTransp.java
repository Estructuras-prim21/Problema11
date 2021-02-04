/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a_gog
 */
public class EmpTransp {
    
    private String nombreEmpresa;
    private int totalCamiones;
    private DePasajeros camiones[];
    private int ocupados;
    private final int MAX=totalCamiones;

    public EmpTransp() {
        camiones= new DePasajeros[MAX];
        ocupados=0;
    }

    public EmpTransp(String nombreEmpresa, int totalCamiones) {
        this.nombreEmpresa = nombreEmpresa;
        this.totalCamiones = totalCamiones;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public int getTotalCamiones() {
        return totalCamiones;
    }
   
    //Alta camiones
    //Escolar
    public void altaCamion(boolean lugarProyecto, int totalPasaj, String marca, String numMotor, String placas, double costoCamion){
        
        if(ocupados<totalCamiones){
            camiones[ocupados]=new Escolar(lugarProyecto, totalPasaj,marca,numMotor,placas,costoCamion);
            ocupados++;
        }
    }
    //Turista
    public void altaCamion(boolean asientoCama, boolean serviBar, int totalPasaj, String marca, String numMotor, String placas, double costoCamion){
        if(ocupados<totalCamiones){
            camiones[ocupados]=new Turismo(asientoCama,serviBar,totalPasaj,marca,numMotor,placas,costoCamion);
            ocupados++;
        }
    }
    
   public String rentaCamionTuristas(int totalPasaj, double km){
       StringBuilder sb=new StringBuilder();
       int i;
       
       /*i=0;
       while(i<ocupados && camiones[i].getTotalPasaj()!=totalPasaj)
           i++;
       
       if(i<ocupados && camiones[i]instanceof Turismo){*/
           for(i=0;i<ocupados;i++)
               if(camiones[i]instanceof Turismo && camiones[i].getTotalPasaj()==totalPasaj){
               sb.append(((Turismo)camiones[i]).toString());
               sb.append(" ");
               sb.append("El costo del servicio es de: $"+((Turismo)camiones[i]).calculaCostoServicio(km));
               }
           
       
       return sb.toString();
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
