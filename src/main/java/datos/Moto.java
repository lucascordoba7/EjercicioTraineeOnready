package datos;

public class Moto extends Vehiculo {
    private int cilindrada;
    
    public Moto(String marca, String modelo, int cilindrada,double precio)
    {
        super(marca,modelo,precio);
        this.cilindrada=cilindrada;
        
    }
    @Override
    public String toString(){
        return "Marca: "+marca+" // Modelo: "+modelo+" // Cilindrada: "+cilindrada+"cc // Precio: $"+precio;
        
    }
}
