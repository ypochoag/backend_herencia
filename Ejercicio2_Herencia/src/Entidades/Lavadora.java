/*
Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
 */
package Entidades;


public class Lavadora extends Electrodomestico{
    protected int carga;
    
    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
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
    
    public void crearLavadora() {
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        carga = leer.nextInt();
        precioFinal();
    }    
       
    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if(carga > 30){
             precio = precio + 500;
        }    
    }

    @Override
    public String comprobarColor(String color) {
        return super.comprobarColor(color); 
    }

    @Override
    public char comprobarConsumoEnergetico(char letra) {
        return super.comprobarConsumoEnergetico(letra);
    }   

    @Override
    public String toString() {
        return super.toString() + ", Carga " + carga;
    }


    
}
