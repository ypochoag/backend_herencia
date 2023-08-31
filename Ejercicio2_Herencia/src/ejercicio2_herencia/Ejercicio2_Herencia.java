/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package ejercicio2_herencia;

import Entidades.Lavadora;
import Entidades.Televisor;


public class Ejercicio2_Herencia {


    public static void main(String[] args) {
     System.out.println("Creacion de Lavadora");
     Lavadora lavadora1 = new Lavadora();     
     lavadora1.crearLavadora();
     System.out.println(lavadora1);
 
     System.out.println("Creacion de Televisor");
     Televisor televisor1 = new Televisor();
     televisor1.crearTelevisor();
     System.out.println(televisor1);
     
     
    }
    
}
