
package Entidad;

import java.util.Date;
import java.util.Scanner;


public class Yates extends Barco{
    
    protected double boatPower; // potenci en CV 
    protected Integer NumberOfCabins; // numero de camarotes del yates

    public Yates() {
    }

    public Yates(double boatPower, Integer NumberOfCabins, String registration, double length, Date dateManufacturing) {
        super(registration, length, dateManufacturing);
        this.boatPower = boatPower;
        this.NumberOfCabins = NumberOfCabins;
    }

    public double getBoatPower() {
        return boatPower;
    }

    public void setBoatPower(double boatPower) {
        this.boatPower = boatPower;
    }

    public Integer getNumberOfCabins() {
        return NumberOfCabins;
    }

    public void setNumberOfCabins(Integer NumberOfCabins) {
        this.NumberOfCabins = NumberOfCabins;
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
        System.out.println("Power of boat:");
        boatPower = leer.nextDouble();
        leer.nextLine();
        System.out.println("Number Of Cabins:");
        NumberOfCabins = leer.nextInt();
        leer.nextLine();            
    }

    @Override
    public double module() {
        return (super.module()+ boatPower + NumberOfCabins); 
    }
        
}
