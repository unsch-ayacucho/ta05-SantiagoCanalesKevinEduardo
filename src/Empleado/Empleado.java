/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author USER
 */
public class Empleado {
    private int código;
    private String nombre;
    private String areaLaboral; 
    private double sueldo;
    private double horasExtras;
    private String afiliacionAfp;
    //Metodo Constructor
    public Empleado (int codigo,String nombre,String areaLaboral,double sueldo,double horasExtras,String afiliacionAfp){
        this.código=codigo;
        this.areaLaboral=areaLaboral;
        this.nombre=nombre;
        this.sueldo=sueldo;
        this.horasExtras=horasExtras;
        this.afiliacionAfp=afiliacionAfp;
        
    }
    //metodos o funciones
    public double horasExtras(){
        return (sueldo*horasExtras/240);
    }
    public double descuentoAfiliacionAfp(){
        double descuento;
        descuento=(sueldo*11/100);
        return descuento;
    }public double descuentoAfiliacionSNP(){
        double descuento1;
        descuento1=(sueldo*13/100);
        return (double)descuento1;
    }
    public double descuentoAfiliacionSalud(){
        double descuento2;
        descuento2=(sueldo*3/100);
        return (double)descuento2;
    }public double montoTotalDecuentos(){
        double montoTotal=(sueldo*11/100)+(sueldo*3/100)+(sueldo*13/100);
        return montoTotal;
    }
    public double sueldoTotal(){
        return (double)sueldo + (double)(sueldo*horasExtras/240);
        
    }
    public double  sueldoNeto(){
        return sueldo+(double)(sueldo*horasExtras/240)-(sueldo*11/100)+(sueldo*3/100)+(sueldo*13/100);
    }

}
