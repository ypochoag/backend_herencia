
package Entidad;


public class Polideportivo extends Edificio {
    private String nombre;
    private String instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String instalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
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

    
}
