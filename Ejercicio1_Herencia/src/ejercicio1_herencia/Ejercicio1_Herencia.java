/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package ejercicio1_herencia;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;


public class Ejercicio1_Herencia {


    public static void main(String[] args) {
      //Declaracion del objeto perro
      Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
      perro1.feed();
      
      //Declaracion de otro objeto Perro
      Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
      perro1.feed();

      //Declaracion del objeto Gato
      Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
      gato1.feed();
      
      //Declaracion del objeto Caballo
      Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
      caballo1.feed();      
    }
    
}
