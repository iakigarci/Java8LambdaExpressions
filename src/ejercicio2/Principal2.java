package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {
	public static List<Persona> crearListaPersonas() {
        
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(
                new Persona("Ane", "12345678-F", 12));
        lista.add(
	            new Persona("Mikel", "98745678-G", 3));
        lista.add(
	            new Persona("Joseba", "12347895-I", 72));
        lista.add(
	            new Persona("Miren", "98764123-Z", 33));
        lista.add(
	            new Persona("Iker", "78965678-F", 12));
        
        return lista;
    }
 
 public static void main(String... args) {
        
        // Crear la lista para las pruebas
        List<Persona> z = crearListaPersonas();
    
        // 1.- Mostrar la list
        z.stream().forEach(p->System.out.println("Persona: "+p.getNombre()));
        
        // 2.- Adinen batazbestekoak kalkulatu
        Double media = z.stream().mapToInt(p->p.getEdad()).average().getAsDouble();
        System.out.println("Edad media: "+media);
        
        // 3.- Batazbestekoa baina zaharragoak direnak pantailaratu
        z.stream().filter(p->p.getEdad()>media).forEach(p2->System.out.println("Personas: "+p2.getNombre()));;
 }


}
