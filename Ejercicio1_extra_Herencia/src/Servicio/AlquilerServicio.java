
package Servicio;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcosMotor;
import Entidad.Veleros;
import Entidad.Yates;
import java.util.Date;
import java.util.Scanner;


public class AlquilerServicio {
    Scanner leer = new Scanner(System.in);
    Alquiler alquiler = new Alquiler();
    
    public void rentPrice(){

        //Calculation of rented days
        double differenceDays;
        differenceDays = (alquiler.getReturnDate().getTime()- alquiler.getRentalDate().getTime())/(24 * 60 * 60 * 1000);
        
        double modulo = ( alquiler.getBoat().getLength() * 10);
        
        if (alquiler.getBoat() instanceof Veleros){
            Veleros object = (Veleros) alquiler.getBoat();
            modulo = object.module();
        }else if(alquiler.getBoat() instanceof BarcosMotor){
            BarcosMotor object = (BarcosMotor) alquiler.getBoat();
            modulo = object.module();    
        } else if(alquiler.getBoat() instanceof Yates){
            Yates object = (Yates) alquiler.getBoat();
            modulo = object.module();    
        } 
        
        //Show the final price
        System.out.println ("The final price of your rental is: " + differenceDays * modulo);      
    }
    
    public void rentInformation(){
        System.out.println("Enter the following information: ");
        System.out.println("Name: ");
        alquiler.setName(leer.nextLine());
        System.out.println("DNI:");
        alquiler.setDni(leer.nextInt());
        leer.nextLine();
        
        System.out.println("Rental date");
        System.out.println("Day:");
        int day = leer.nextInt();
        leer.nextLine();
        System.out.println("month");
        int month = leer.nextInt();
        leer.nextLine();
        System.out.println("Year");
        int year = leer.nextInt();
        leer.nextLine();
        Date fecha1 = new Date(year-1900, month-1, day);
        alquiler.setRentalDate(fecha1);
        
        
        System.out.println("Return date");
        System.out.println("Day:");
        day = leer.nextInt();
        leer.nextLine();
        System.out.println("month");
        month = leer.nextInt();
        leer.nextLine();
        System.out.println("Year");
        year = leer.nextInt();
        leer.nextLine();
        Date fecha2 = new Date(year-1900, month-1, day);
        alquiler.setReturnDate(fecha2);

        System.out.println("What is your type of boat? please select one option" );
        System.out.println("1. Boat");
        System.out.println("2. sailboats"); //veleros
        System.out.println("3. Boats whit motor");
        System.out.println("4. Yacht");
        
        switch(leer.nextInt()){
            case 1:
                Barco boat = new Barco();
                boat.enterInformation();
                alquiler.setBoat(boat);
                break;
            case 2:
                Veleros sailboats = new Veleros();
                sailboats.enterInformation();
                alquiler.setBoat(sailboats);
                break;                
            case 3:
                BarcosMotor motorBoat = new BarcosMotor();
                motorBoat.enterInformation();
                alquiler.setBoat(motorBoat);
                break;
            case 4:
                Yates yacht = new Yates();
                yacht.enterInformation();
                alquiler.setBoat(yacht);
                break;                
        }       
    }   
}
