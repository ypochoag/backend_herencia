
package Entidad;

import java.util.Date;
import java.util.Scanner;


public class Veleros extends Barco {
    protected Integer NumberOfMast; //Numero de mastiles

    public Veleros() {
    }

    public Veleros(Integer NumberOfMast) {
        this.NumberOfMast = NumberOfMast;
    }

    public Veleros(Integer NumberOfMast, String registration, double length, Date dateManufacturing) {
        super(registration, length, dateManufacturing);
        this.NumberOfMast = NumberOfMast;
    }

    public Integer getNumberOfMast() {
        return NumberOfMast;
    }

    public void setMastNumber(Integer NumberOfMast) {
        this.NumberOfMast = NumberOfMast;
    }

    @Override
    public String getRegistration() {
        return registration;
    }

    @Override
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public Date getDateManufacturing() {
        return dateManufacturing;
    }

    @Override
    public void setDateManufacturing(Date dateManufacturing) {
        this.dateManufacturing = dateManufacturing;
    }

    @Override
    public void enterInformation() {
        Scanner leer = new Scanner(System.in);
        super.enterInformation(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Number Of Mast:");
        NumberOfMast = leer.nextInt();
        leer.nextLine();
    }

    @Override
    public double module() {
        return (super.module() + NumberOfMast);//To change body of generated methods, choose Tools | Templates. 
    }
  
}
