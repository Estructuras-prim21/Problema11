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
public class Escolar extends DePasajeros {
    private boolean lugarProyecto;

    public Escolar() {
        super();
    }
    
    public Escolar(String marca, String numMotor, String placas, double costoCamion, int totalPasaj, boolean lugarProyecto) {
        super( marca, numMotor, placas, costoCamion, totalPasaj);
        this.lugarProyecto=lugarProyecto;
    }
    
    public int getTotalPasajEscolar() {
        return getTotalPasaj();
    } 
     
    public double getCostoCamionEscolar() {
        return getCostoCamionDePasajeros();
    }
    public double calculaCostoServicio(double kilometros){
        double total, costo, pasajeros;
        costo=getCostoCamionEscolar();
        pasajeros=getTotalPasajEscolar();
        total=(((0.01*costo)/pasajeros)*kilometros)*250;
        
        return total;
    }
    
    
}
