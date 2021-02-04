/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10.empresa.minera;

import java.util.Objects;

/**
 *
 * @author santi
 */
public abstract class Camion {
    private String marca;
    private String numMotor;
    private String placas;
    private double costoCamion;

    public Camion(){
        
    }
    
    // para el problema 10
   /* public Camion(String marca, String numMotor, String placas) {
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
    }*/
    
    //para el problema 11
    public Camion(String marca, String numMotor, String placas, double costoCamion) {
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
        this.costoCamion = costoCamion;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Marca:               "+marca+"\n");
        sb.append("NumMotor:            "+numMotor+"\n");
        sb.append("Placas:              "+placas+"\n");
        sb.append("Costo del camion:    "+costoCamion+"\n");
        return sb.toString();
        
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Camion other = (Camion) obj;
        if (!Objects.equals(this.placas, other.placas)) {
            return false;
        }
        return true;
    }

    public String getPlacas() {
        return placas;
    }

    public String getMarca() {
        return marca;
    }

    public double getCostoCamion() {
        return costoCamion;
    }
    
    
    
    
    
    
    
}
