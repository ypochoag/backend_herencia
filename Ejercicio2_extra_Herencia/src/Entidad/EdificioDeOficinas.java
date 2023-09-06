
package Entidad;

public class EdificioDeOficinas extends Edificio{
    
    private Integer oficinas;
    private Integer personasPorOficina;
    private Integer pisos;


    public EdificioDeOficinas(Integer oficinas, Integer personasPorOficina, Integer pisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.personasPorOficina = personasPorOficina;
        this.pisos = pisos;
    }

    public Integer getOficinas() {
        return oficinas;
    }

    public void setOficinas(Integer oficinas) {
        this.oficinas = oficinas;
    }

    public Integer getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(Integer personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    @Override
    public double getAncho() {
        return ancho;
    }

    @Override
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double getAlto() {
        return alto;
    }

    @Override
    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public double getLargo() {
        return largo;
    }

    @Override
    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println(((ancho + largo)*2) * alto);
    }

    @Override
    public void calcularVolumen() {
        System.out.println(ancho * largo * alto);
    }
    
    public void cantPersonas() {
        System.out.println("La cantidad de personas que entrarian en un piso son: " + (personasPorOficina * oficinas));
        System.out.println("La cantidad de personas que pueden trabajar en todo el edificio son: " + (pisos * personasPorOficina * oficinas));
    }
}
