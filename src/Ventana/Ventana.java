/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;


public class Ventana {
    private int largo;
    private int ancho;
    private String barraTitulo;
    public Ventana(int largo,int ancho,String barraTitulo){
        this.ancho=ancho;
        this.barraTitulo=barraTitulo;
        this.largo=largo;
    }
    //get
    public int getLargo(){
        return this.largo;
    }
    public int getAncho(){
        return this.ancho;
        
    }
    public String getBarraTitulo(){
        return this.barraTitulo;
    }
    //set
    public void setLargo(int largo){
        this.largo=largo;
    }
    public void setAncho(int ancho){
        this.ancho=ancho;
        
    }
    public void setBarraTitulo(String barraTitulo){
        this.barraTitulo=barraTitulo;
    }
    //Metodos
    public int tamañoVentana(int largo, int ancho){
        return largo*ancho;
    }
    public void mostraBarraTitulo(){
        System.out.println(barraTitulo);
    }
    public void abrirVentana(){
        
    }
    public void cerrarVentana(){
        
    }
    public void visibilizarBarrasDeHerramientas(){
        
    }
    public void visibilizarBordesDeVentana(){
        
    }
}
