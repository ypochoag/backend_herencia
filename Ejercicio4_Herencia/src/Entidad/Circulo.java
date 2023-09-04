
package Entidad;

import Interfaces.calculosFormas;
import static java.lang.Math.PI;


public class Circulo implements calculosFormas {
    private Integer radio;

    public Circulo() {
    }

    public Circulo(Integer radio) {
        this.radio = radio;
    }

    @Override
    public void calculoArea() {
        System.out.println("El area del circulo es de: ");
        System.out.println(PI * (radio ^ 2));
    }

    @Override
    public void calculoPerimetro() {
        System.out.println("El perimetro del circulo es de: ");
        System.out.println(PI * (radio * 2));
    }
  
}
