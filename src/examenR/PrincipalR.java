package examenR;

import java.util.ArrayList;

public class PrincipalR{

    public static void main(String[] args) {
        Par p1 = new Par(4,2.5);
        Par p2= new Par(4,3.5);
        Par p3 = new Par(4,4.5);
        Par p4 = new Par(5,1.1);
        Par p5 = new Par(5,2.1);
        Par p6 = new Par(5,3.1);
        Par p7 = new Par(6,3.6);
        Par p8 = new Par(6,4.6);
        Par p9 = new Par(6,5.6);

        Elemento e1 = new Elemento(1,p1);
        Elemento e2 = new Elemento(1,p4);
        Elemento e3 = new Elemento(1,p7);
        Elemento e4 = new Elemento(2,p2);
        Elemento e5 = new Elemento(2,p5);
        Elemento e6 = new Elemento(2,p8);
        Elemento e7 = new Elemento(3,p3);
        Elemento e8 = new Elemento(3,p6);
        Elemento e9 = new Elemento(3,p9);

        ArrayList<Elemento> l = new ArrayList<>();
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
        l.add(e5);
        l.add(e6);
        l.add(e7);
        l.add(e8);
        l.add(e9);

        Matriz m = new Matriz();
        m.setLista(l);
        
        //Get vector por fila
        System.out.println("\n"+">getVectorFila: param usuario y devuelve la lista de valores que ha otorgado a las peliculas");
        System.out.println("Prueba 1: primer usu: "+m.getVectorFila(1));
        System.out.println("Prueba 2: segundo usu: "+m.getVectorFila(2));
        System.out.println("Prueba 3: tercer usu: "+m.getVectorFila(3));

        //Get vector por columna
        System.out.println("\n"+">getVectorColumna: param id peli y devuelve la colccion de valoraciones que los usus han dado a la peli");
        System.out.println("Prueba 1: primera columna: "+m.getVectorColumna(4));
        System.out.println("Prueba 2: segunda columna: "+m.getVectorColumna(5));
        System.out.println("Prueba 3: tercera columna: "+m.getVectorColumna(6));

        //Get normalizado vector de peliculas
        System.out.println("\n"+">normalizarColumna: param id de pelicula y devuelve normalizada");
        System.out.println("Pelicula 4: "+m.normalizarColumna(4));
        System.out.println("Pelicula 5: "+m.normalizarColumna(5));
        System.out.println("Pelicula 6: "+m.normalizarColumna(6));
   
    }

}