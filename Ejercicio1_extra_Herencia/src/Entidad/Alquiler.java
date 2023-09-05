
package Entidad;

import java.util.Date;


public class Alquiler {
    protected String name;
    protected Integer dni;
    protected Date rentalDate; //fecha de alquiler
    protected Date returnDate; //fecha de devolucion
    protected String mooringPosition; // posicion de amarre
    protected Barco boat; 

    public Alquiler() {
    }

    public Alquiler(String name, Integer dni, Date rentalDate, Date returnDate, String mooringPosition, Barco boat) {
        this.name = name;
        this.dni = dni;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.mooringPosition = mooringPosition;
        this.boat = boat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getMooringPosition() {
        return mooringPosition;
    }

    public void setMooringPosition(String mooringPosition) {
        this.mooringPosition = mooringPosition;
    }

    public Barco getBoat() {
        return boat;
    }

    public void setBoat(Barco boat) {
        this.boat = boat;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "name=" + name + ", dni=" + dni + ", rentalDate=" + rentalDate + ", returnDate=" + returnDate + ", mooringPosition=" + mooringPosition + ", boat=" + boat + '}';
    }
    
    
    
   
}
