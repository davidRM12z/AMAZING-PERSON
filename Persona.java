public class Persona
{
    // instance variables - replace the example below with your own
    private int edad;
    private int altura;
    private Vestimenta ropa;

    
    public Persona(int edadPersona, int alturaPersona, Vestimenta ropaPersona){
        edad = edadPersona;
        altura = alturaPersona;
        ropa = ropaPersona;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public Vestimenta getRopa(){
        return ropa;
    }
    
    public void setEdad(int edadN) {
        edad = edadN;
    }
    
    public void setAltura(int alturaN) {
        altura = alturaN;
    }
    
    public void setRopa(Vestimenta ropaN) {
        ropa = ropaN;
    }
    
    public void imprimirDetalles() {
        System.out.println("Tiene una edad de: "+ edad + ", una altura de: " + altura + ", lleva la ropa de la marca: " + ropa.getMarca() + "y el color de su ropa es: " + ropa.getColor());
    }
}
