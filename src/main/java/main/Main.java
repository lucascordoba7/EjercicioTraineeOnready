package main;
public class Main {
    public static void main(String[] args) {
        Concesionaria concesionaria=new Concesionaria();
        concesionaria.agregarAuto("Peugeot","206",4,200000.00);
        concesionaria.agregarMoto("Honda", "Titan", 125, 60000.00);
        concesionaria.agregarAuto("Peugeot", "208", 5, 250000.00);
        concesionaria.agregarMoto("Yamaha", "YBR", 160, 80500.50);
        concesionaria.mostrarLista();
        System.out.println("=============================");
        concesionaria.masCaro();
        concesionaria.masBarato();
        concesionaria.contiene("Y");
        System.out.println("=============================");
        concesionaria.listaOrdenada();
    }
}
