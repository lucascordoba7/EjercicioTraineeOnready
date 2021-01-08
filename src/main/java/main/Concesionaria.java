package main;
import datos.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concesionaria {
    List<Vehiculo> lista;
    
    
    public Concesionaria(){
        lista=new ArrayList<>();
        
        
    }
        
        
    
    
    
    
    
    public void mostrarLista(){
        for(Vehiculo v:lista)
        {
            System.out.println(v.toString());
        }
        
    }
    /*public void agregarAuto(String marca,String modelo,int puertas,double precio)
    {
        lista.add(new Auto(marca,modelo,puertas,precio));
    }
    public void agregarMoto(String marca,String modelo,int cilindrada,double precio)
    {
        lista.add(new Moto(marca,modelo,cilindrada,precio));
    }*/
    public void agregarVehiculo(String marca,String modelo,int puertas,double precio)
    {
        lista.add(new Auto(marca,modelo,puertas,precio));
    }
    public void agregarVehiculo(String marca,String modelo,String cilindrada,double precio)
    {
        lista.add(new Moto(marca,modelo,cilindrada,precio));
    }
    public void masCaro(){
        double max=0;
        String temp=null;
        for (Vehiculo v:lista)
        {
            if(v.getPrecio()>max)
            {
                max=v.getPrecio();
                temp=v.getMarca()+" "+v.getModelo();
            }
        }
        System.out.println("Vehiculo mas caro: "+temp);
    }
    public void masBarato(){
        double min=Double.MAX_VALUE;
        String temp=null;
        for(Vehiculo v:lista)
        {
            if(v.getPrecio()<min)
            {
                min=v.getPrecio();
                temp=v.getMarca()+" "+v.getModelo();
            }
        }
        System.out.println("Vehiculo mas barato: "+temp);
    }
   public void contiene(String buscar){
       String temp="";
       for(Vehiculo v:lista)
       {
           String cadena=v.getModelo();
           if(cadena.indexOf(buscar)>=0)
           {
               System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+v.getMarca()+" "+v.getModelo()+" $"+v.getPrecio());
           }
           
       }
       
     }
   public void listaOrdenada()
   {
       List<Vehiculo> ordenada=lista;
       Collections.sort(lista);
       for (Vehiculo v :ordenada)
       {
           System.out.println(v.getMarca()+" "+v.getModelo());
       }
   }
    
    
}
