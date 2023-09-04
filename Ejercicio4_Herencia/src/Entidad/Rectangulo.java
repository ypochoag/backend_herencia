
package Entidad;

import Interfaces.calculosFormas;


public class Rectangulo implements calculosFormas {
    private Integer base;
    private Integer altura;

    public Rectangulo() {
    }

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calculoArea() {
        System.out.println("El area del rectangulo es de: ");
        System.out.println(base * altura);
    }

    @Override
    public void calculoPerimetro() {
        System.out.println("El perimetro del rectangulo es de: ");
        System.out.println((base + altura) * 2);
    }
   
}
