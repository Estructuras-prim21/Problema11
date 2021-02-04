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
public class Turismo extends DePasajeros {
    private boolean asientoCama;
    private boolean serviBar;

    public Turismo() {
        super();
    }
    
    public Turismo(String marca, String numMotor, String placas, double costoCamion, int totalPasaj, boolean asientoCama, boolean serviBar) {
        super( marca,  numMotor, placas, costoCamion, totalPasaj);
        this.asientoCama=asientoCama;
        this.serviBar=serviBar;
    }
    
     @Override
     public String toString() {
       StringBuilder cad=new StringBuilder();
       
       cad.append(super.toString()); 
       cad.append("\nAsiento Cama: "+asientoCama);
       cad.append("\nServicio Bar: "+serviBar);
       
       return cad.toString();
    }
    public int getTotalPasajTurismo() {
        return getTotalPasaj();
    } 
     
    public double getCostoCamionTurismo() {
        return getCostoCamionDePasajeros();
    }

    public boolean isAsientoCama() {
        return asientoCama;
    }

    public void setAsientoCama(boolean asientoCama) {
        this.asientoCama = asientoCama;
    }

    public boolean isServiBar() {
        return serviBar;
    }

    public void setServiBar(boolean serviBar) {
        this.serviBar = serviBar;
    }
    
    public boolean hayServiBar(){
        boolean resp=false;
        if(isServiBar()==true){
            resp=true;
        }
        return resp;
    }
    public double calculaCostoServicio(double kilometros){
        double total, costo, pasajeros;
        costo=getCostoCamionTurismo();
        pasajeros=getTotalPasajTurismo();
        total=((0.01*costo)/pasajeros)*kilometros;
        if(asientoCama){
            total=+(5*costo);
        }
        if(serviBar){
            total=+(5*costo);
        }
        return total;
    }
    
    
    
    
}
