package main;
public class Main {
    public static void main(String[] args) {
        Concesionaria concesionaria=new Concesionaria();
        concesionaria.agregarVehiculo("Peugeot","206",4,200000.00);
        concesionaria.agregarVehiculo("Honda", "Titan", "125cc", 60000.00);
        concesionaria.agregarVehiculo("Peugeot", "208", 5, 250000.00);
        concesionaria.agregarVehiculo("Yamaha", "YBR", "160cc", 80500.50);
        concesionaria.mostrarLista();
        System.out.println("=============================");
        concesionaria.masCaro();
        concesionaria.masBarato();
        concesionaria.contiene("Y");
        System.out.println("=============================");
        concesionaria.listaOrdenada();
    }
}
