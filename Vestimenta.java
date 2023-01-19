public class Vestimenta
{
    // Color ropa
    private String color;
    // Marca ropa
    private String marca;

    /**
     * Constructor for objects of class Vestimenta
     */
    public Vestimenta(String colorRopa, String marcaRopa)
    {
        color = colorRopa;
        marca = marcaRopa;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setColor(String colorN){
        color = colorN;
    }
    
    public void setMarca(String marcaN){
        marca = marcaN;
    }
    
    public void imprimirDetalles() {
        System.out.println(marca + " " + color);
    }
}
