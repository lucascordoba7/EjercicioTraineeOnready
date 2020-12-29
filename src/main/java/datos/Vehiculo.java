
package datos;


public abstract class Vehiculo implements Comparable<Vehiculo> {
    protected String marca;
    protected String modelo;
    protected double precio;
    
    public Vehiculo(String marca, String modelo, double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    
    }
    @Override
    public abstract String toString();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Vehiculo otroVehiculo) {
        return (int) Math.floor(otroVehiculo.precio-this.precio);
        
    }
    
}
