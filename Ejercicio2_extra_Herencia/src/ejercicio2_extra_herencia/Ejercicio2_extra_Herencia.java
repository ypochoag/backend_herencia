/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
16
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package ejercicio2_extra_herencia;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;

public class Ejercicio2_extra_Herencia {

    public static void main(String[] args) {
        
        ArrayList<Edificio> edificios = new ArrayList();
        
        Polideportivo polideportivo1 = new Polideportivo("Altorendimiento", "Techado", 40d, 20d, 60d);
        edificios.add(polideportivo1);

        Polideportivo polideportivo2 = new Polideportivo("Altapotencia", "Abierto", 100d, 110d, 80d);
        edificios.add(polideportivo2);        
        
        EdificioDeOficinas edificiosOficinas1 = new EdificioDeOficinas(4, 10, 8, 50, 10, 50);
        edificios.add(edificiosOficinas1);
        
        EdificioDeOficinas edificiosOficinas2 = new EdificioDeOficinas(6, 15, 10, 80, 10, 80);
        edificios.add(edificiosOficinas2);
        
        int contT = 0;
        int contA = 0;
        for (Edificio aux: edificios){
            
            if (aux instanceof Polideportivo){
                System.out.println("\nPolideportivo con las siguientes caracteristicas");
                System.out.print("Superficie: ");
                aux.calcularSuperficie();
                System.out.print("Volumen:");
                aux.calcularVolumen();
                if (((Polideportivo) aux).getInstalacion().equalsIgnoreCase("Techado")){
                    contT++;
                }else{
                    contA++;
                }
               }else if(aux instanceof EdificioDeOficinas){
                System.out.println("\nEdificio de oficinas con las siguientes caracteristicas");
                System.out.print("Superficie:");                
                aux.calcularSuperficie();
                System.out.print("Volumen:");
                aux.calcularVolumen();
                ((EdificioDeOficinas) aux).cantPersonas();
            }                    
        }
        
        System.out.println("\nLa cantidad de polideportivos techados es de: " + contT);
        System.out.println("La cantidad de polideportivos abiertos es de: " + contA);        
            
    }
    
}
