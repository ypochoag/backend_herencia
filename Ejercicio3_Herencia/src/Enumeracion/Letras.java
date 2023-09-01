
package Enumeracion;


public enum Letras {
    A(1000d, "A"), B(800d,"B"), C(600d, "C"), D(500d, "D"), E(300d,"E"), F(100d,"F");
    
    private final double precio;
    private final String Valor;

    private Letras(double precio, String Valor) {
        this.precio = precio;
        this.Valor = Valor;
    }
 
    
    public char getValor() {
        return Valor.charAt(0);
    }
    
    public double getPrecio() {
        return precio;
    }
}
    

