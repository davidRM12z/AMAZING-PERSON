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
}
