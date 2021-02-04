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
public class Escolar extends DePasajeros {
    private boolean lugarProyecto;
    
    public Escolar(){
        
    }

    public Escolar(boolean lugarProyecto, int totalPasj, String marca, String numMotor, String placas, double costo) {
        super(totalPasj, marca, numMotor, placas, costo);
        this.lugarProyecto = lugarProyecto;
    }
     public int getTotalPasajEscolar() {
        return getTotalPasaj();
    } 
     
    public double getCostoCamionEscolar() {
        return getCostoCamionDePasajeros();
    }
    
    public double calculaCostoServicio(){
        double costo;
        
        costo=(((this.getCostoCamion()*.01)/this.getTotalPasj())*250);
        return costo;
    }
    
    public double calculaCostoServicio(double km){
        double costo=0;
        
        return costo;
    }
    
}
