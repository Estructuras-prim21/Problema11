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
public class Escolar extends DePasajeros{
    private boolean lugarProyecto;
    
    

    public Escolar() {
        super();
        
    }

    public Escolar(boolean lugarProyecto, int totalPasaj, String marca, String numMotor, String placas, double costoCamion, boolean disponible) {
        super(totalPasaj, marca, numMotor, placas, costoCamion,disponible);
        this.lugarProyecto = lugarProyecto;
    }
    
    public double calculaCostoServicio(){
        double costo;
        costo= ((super.getCostoCamion()*0.0001)/super.getTotalPasaj())*250;
        return costo;
    }
    
            
            
    
}
