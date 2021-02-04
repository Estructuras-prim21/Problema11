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
public abstract class DePasajeros extends Camion {
    private int totalPasaj;

    public DePasajeros() {
        super();
    }
    
    public DePasajeros(String marca, String numMotor, String placas, double costoCamion, int totalPasaj) {
        super( marca, numMotor, placas, costoCamion);
        this.totalPasaj= totalPasaj; 
    }

    @Override
     public String toString() {
       StringBuilder cad=new StringBuilder();
       
       cad.append(super.toString()); 
       cad.append("\nTotal de pasajeros: "+totalPasaj);
       
       return cad.toString();
    }

    public int getTotalPasaj() {
        return totalPasaj;
    }
    
     public double getCostoCamionDePasajeros() {
        return getCostoCamion();
    }
    public double calculaCostoServicio(double kilometros){
        double total, costo;
        costo=getCostoCamionDePasajeros();
        total=((0.01*costo)/totalPasaj)*kilometros;
        return total;
    } 
    
    
    
    
    
    
    
}
