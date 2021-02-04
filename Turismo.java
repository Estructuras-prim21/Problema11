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
public class Turismo extends DePasajeros{
    private boolean asientoCama;
    private boolean serviBar;

    public Turismo() {
        super();
        
    }

    public Turismo(boolean asientoCama, boolean serviBar, int totalPasaj, String marca, String numMotor, String placas, double costoCamion, boolean disponible) {
        super(totalPasaj, marca, numMotor, placas, costoCamion,disponible);
        this.asientoCama = asientoCama;
        this.serviBar = serviBar;
    }
    
    public String toString(){
        StringBuilder sb;
        sb= new StringBuilder();
        
        sb.append(super.toString());
        if(asientoCama)
            sb.append("Cuenta con asiento cama \n");
        else
            sb.append("No cuenta con asiento cama \n");
        if(serviBar)
            sb.append("Cuenta con servicio de Bar \n");
        else
            sb.append("No cuenta con servicio de Bar \n");
        
        return sb.toString();
        
       
    }

    public boolean isAsientoCama() {
        return asientoCama;
    }

    public boolean isServiBar() {
        return serviBar;
    }
    
    
    
    public double calculaCostoServicio(double km){
        double costo=super.calculaCostoServicio(km);
        
        if(isAsientoCama()){
            costo=costo*1.05;
        }
        if(isServiBar()){
            costo=costo*1.05;
        }
        
        return costo;
    }
    
}
