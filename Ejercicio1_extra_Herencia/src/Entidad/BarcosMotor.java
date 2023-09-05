
package Entidad;

import java.util.Date;
import java.util.Scanner;


public class BarcosMotor extends Barco {
    
    protected double boatPower; // potencia en CV para barcos a motor

    public BarcosMotor() {
    }
  
    public BarcosMotor(double boatPower, String registration, double length, Date dateManufacturing) {
        super(registration, length, dateManufacturing);
        this.boatPower = boatPower;
    }

    public double getBoatPower() {
        return boatPower;
    }

    public void setBoatPower(double boatPower) {
        this.boatPower = boatPower;
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
        super.enterInformation();
        System.out.println("Power of boat:");
        boatPower = leer.nextDouble();
        leer.nextLine();
    }

    @Override
    public double module() {
        return (super.module()+ boatPower);    
    }   
}
