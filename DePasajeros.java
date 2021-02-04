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
public abstract class DePasajeros extends Camion {
    private int totalPasj;
    
    public DePasajeros(){
        super();
    }

    public DePasajeros(int totalPasj, String marca, String numMotor, String placas, double costo) {
        super(marca, numMotor, placas, costo);
        this.totalPasj = totalPasj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append("totalPasaj: "+totalPasj+"\n");
        return sb.toString();
    }
    
    public abstract double calculaCostoServicio(double km);

    public int getTotalPasj() {
        return totalPasj;
    }
    
    

    
    
    
    
    
    
    
    
}
