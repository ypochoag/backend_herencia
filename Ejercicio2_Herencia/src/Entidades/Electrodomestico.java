/*
superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
13
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
 */
package Entidades;

import Enumeracion.Color;
import Enumeracion.Letras;
import java.util.Scanner;


public class Electrodomestico {
   protected double precio;
   protected String color;
   protected char consumoEnergetico;
   protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    //metodos de la superclase

    Scanner leer = new Scanner(System.in);
    
    public void crearElectrodomestico(){
        System.out.println("Ingrese el precio del electrodomestico");
        precio = (leer.nextDouble() + 1000);
        leer.nextLine();
        
        System.out.println("Ingrese el color del electrodomestico");
        color = comprobarColor(leer.nextLine().toUpperCase());
        
        System.out.println("Ingrese el Consumo Energetico del electrodomestico");
        consumoEnergetico =  comprobarConsumoEnergetico(leer.nextLine().toUpperCase().charAt(0));
        
        
        System.out.println("Ingrese el peso del electrodomestico");
        peso = (leer.nextDouble());
        
        //precioFinal(electrodomestico);
        
    }
    
    
    public char comprobarConsumoEnergetico(char letra){
        boolean bandera = false;
        for (Letras aux: Letras.values()){
            if(letra == aux.getValor()){
                bandera = true;
                break;
            }else {
                bandera = false;
            }             
        }
        if(bandera == true){
            return letra; 
        }else {
            return letra = 'F';
        }
                 
    }
    
    
    
    public String comprobarColor(String color){
        for (Color aux: Color.values()){
            if(aux.toString().equals(color)){
                return color;
            }else{
                color = "BLANCO";        
            }               
        }
        return color;   
    }
    
    public void precioFinal(){
       
        // aumento del valor precio por el consumo energetico
        for (Letras aux: Letras.values()){
            
            if(consumoEnergetico == aux.getValor()){
                precio = precio + aux.getPrecio();
            }    
        } 
        
        //aumento del valor precio por el peso  
        if (peso >= 1 && peso <= 19){
             precio = precio + 100;
        }else if(peso > 19 && peso<= 49){
            precio = precio + 500;
        }else if(peso > 49 && peso<= 79){
            precio = precio + 800;
        }else if(peso> 79){
            precio = precio + 1000;
        }
     }

    @Override
    public String toString() {
        return "Electrodomestico tiene: " + "precio " + precio + ", color " + color + ", consumoEnergetico " + consumoEnergetico + ", peso " + peso;
    }
   
}
