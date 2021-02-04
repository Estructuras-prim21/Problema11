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
public abstract class DePasajeros extends Camion{
    private int totalPasaj;
    private boolean disponible;

    public DePasajeros() {
        super();
        
    }

    public DePasajeros(int totalPasaj, String marca, String numMotor, String placas, double costoCamion, boolean disponible) {
        super(marca, numMotor, placas, costoCamion);
        this.totalPasaj = totalPasaj;
        this.disponible=disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb;
        sb= new StringBuilder();
        
        sb.append(super.toString());
        sb.append("Total pasajeros "+totalPasaj+"\n");
        
        return sb.toString();
    }
    
    public double calculaCostoServicio(double km){
        double costo=0.0001*super.getCostoCamion();
        double resp;
        
        resp=(costo/totalPasaj)*km;
        
        return resp;
        
    }

    public int getTotalPasaj() {
        return totalPasaj;
    }
    
    
}
