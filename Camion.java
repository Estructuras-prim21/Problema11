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
public abstract class Camion {
    private String marca;
    private String numMotor;
    private String placas;
    private double costoCamion;
    
    public Camion(){
        
    }

    public double getCostoCamion() {
        return costoCamion;
    }

    public String getMarca() {
        return marca;
    } 

    public Camion(String marca, String numMotor, String placas, double costoCamion) {
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
        this.costoCamion = costoCamion;
    }

    @Override
    public String toString() {
        return "Camion{" + "marca=" + marca + ", numMotor=" + numMotor + ", placas=" + placas + ", costoCamion=" + costoCamion + '}';
    }
    
    public boolean equals (Object obj){
        boolean resp=false;
        if(obj!=null && obj instanceof Camion);
        resp=((Camion)obj).placas.equalsIgnoreCase(marca);
        return resp;
        
    }
    
}
