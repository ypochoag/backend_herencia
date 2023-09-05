
package Entidad;

import java.util.Date;
import java.util.Scanner;


public class Barco {
    protected String registration; // Matricula del barco
    protected double length; //Eslora del barco
    protected Date dateManufacturing; // fecha de fabricación

    public Barco() {
    }

    public Barco(String registration, double length, Date dateManufacturing) {
        this.registration = registration;
        this.length = length;
        this.dateManufacturing = dateManufacturing;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Date getDateManufacturing() {
        return dateManufacturing;
    }

    public void setDateManufacturing(Date dateManufacturing) {
        this.dateManufacturing = dateManufacturing;
    }

    
    
    
    public double module(){
         return length * 10;
    }
    
    public void enterInformation(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Enter the following information about the boat: ");
        System.out.println("registration: ");
        registration = leer.nextLine();
        System.out.println("length:");
        length = leer.nextDouble();
        leer.nextLine();
        
        
        System.out.println("Manufacturing date");
        System.out.println("Day:");
        int day = leer.nextInt();
        leer.nextLine();
        System.out.println("month");
        int month = leer.nextInt();
        leer.nextLine();
        System.out.println("Year");
        int year = leer.nextInt();
        leer.nextLine();
        dateManufacturing = new Date(year-1900, month-1, day);    
    }
   
}
