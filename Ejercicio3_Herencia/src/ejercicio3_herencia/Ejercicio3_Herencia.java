/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package ejercicio3_herencia;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;


public class Ejercicio3_Herencia {


    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();   


        System.out.println("Creacion de Lavadora");
        Lavadora lavadora1 = new Lavadora();
        lavadora1.crearLavadora();
        System.out.println(lavadora1.toString());
        electrodomesticos.add(lavadora1);


        System.out.println("Creacion de Lavadora");
        Lavadora lavadora2 = new Lavadora();
        lavadora2.crearLavadora();
        System.out.println(lavadora2);
        electrodomesticos.add(lavadora2);

        System.out.println("Creacion de Televisor");
        Televisor televisor1 = new Televisor();
        televisor1.crearTelevisor();
        System.out.println(televisor1);
        electrodomesticos.add(televisor1);

        System.out.println("Creacion de Televisor");
        Televisor televisor2 = new Televisor();
        televisor2.crearTelevisor();
        System.out.println(televisor2);
        electrodomesticos.add(televisor2);


        double precioF = 0;
        for(Electrodomestico aux: electrodomesticos){
            
            
            if(aux instanceof Lavadora){
                Lavadora object = (Lavadora) aux;
                precioF = precioF + object.getPrecio();
                System.out.println("El precio de esta lavadora es de " + object.getPrecio());
                continue;           
            }
            
            if(aux instanceof Televisor){
                Televisor object = (Televisor) aux;
                precioF = precioF + object.getPrecio();                
                System.out.println("El precio de este televisor es de " + object.getPrecio());                
            }    
        }
        
        System.out.println("El precio final de todos los electrodomesticos es de: " + precioF);
    }
    
    

    
}
