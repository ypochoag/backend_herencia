
package Entidades;

import java.util.Scanner;


public class Televisor extends Electrodomestico {
    
    protected int resolucion;
    protected boolean sintonizador = false;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisor(int resolucion, boolean sintonizador, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    @Override
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    
    public void crearTelevisor() {
        crearElectrodomestico(); 
        System.out.println("Ingrese la resolucion del TV");
        resolucion = leer.nextInt();
        leer.nextLine();
        System.out.println("El TV tienes sintonizador de TDT?");
        sintonizador = leer.nextBoolean();
        precioFinal();
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if(resolucion> 40){
             precio = precio*1.30;
        } 
        
        if(sintonizador == true){
             precio = precio+ 500;
        } 
    }

    @Override
    public String toString() {
        return super.toString() + " la resolucion = " + resolucion + " ¿tiene sintonizador de TDT? " + sintonizador ; 
    }


    
    
    
}
