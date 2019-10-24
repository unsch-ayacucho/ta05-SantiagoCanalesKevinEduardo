/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiante;

/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) {
        Estudiante oEstudiante =new Estudiante(272190103,"Santiago Canales","Ing. Sistemas",12,14,13,13);
        System.out.println(oEstudiante.promedio());
    }
    
}
