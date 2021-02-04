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
    
}
