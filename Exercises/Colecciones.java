package Exercises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;


public class Colecciones {
    public ArrayList<String> cars ;
    public String[] bikes;
    public Set<String> bicicles;
    public HashMap<Integer, String> transport;
        
   

    public Colecciones(){
        this.cars = new ArrayList<String>();
        this.bikes = new String[10];
        this.bicicles = new HashSet<String>();
        this.transport= new HashMap<Integer, String>();
    }

    public void inicializar(){
        //carros
        cars.add("VW Vento");
        cars.add("Nisan Versa");
        cars.add("Ford Fiesta");
        cars.add("Mazda 2");
        //motos
        this.bikes[1]="Yamaha V-Star 250";
        this.bikes[2]="Royal Enfield Meteor 350";
        this.bikes[3]="Kawasaki Eliminator";
        this.bikes[4]="Honda CMX500A2 SE Rebel.";
        //bicicletas 
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
    }

public HashMap<Integer, String> obtenerHash() {
        HashSet<String> uniqueElements = new HashSet<>();  // Conjunto de elementos únicos
        
        // Agregar todos los elementos de `cars`
        uniqueElements.addAll(this.cars);

        // Agregar todos los elementos de `bikes` (evitando nulos y vacíos)
        for (String bike : this.bikes) {
            if (bike != null && !bike.trim().isEmpty()) {
                uniqueElements.add(bike);
            }
        }

        // Agregar todos los elementos de `bicicles`
        uniqueElements.addAll(this.bicicles);

        // Llenar el HashMap `transport` con elementos únicos
        this.transport.clear();  
        int count = 1;
        for (String element : uniqueElements) {
            this.transport.put(count++, element);
        }

        return this.transport;  
    }

    // Método getter para obtener `transport`
    public HashMap<Integer, String> getTransport() {
        return this.transport;
    }
}