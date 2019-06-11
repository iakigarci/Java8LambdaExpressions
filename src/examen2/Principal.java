package examen2;

import java.util.*;

public class Principal{

    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<Alumno>();

		listaAlumnos.add(new Alumno(1, "1717213183", "Javier Ignacio", "Molina Cano", "Java 8", 7, 28));
		listaAlumnos.add(new Alumno(2, "1717456218", "Lillian Eugenia", "Gómez Álvarez", "Java 8", 10, 33));
		listaAlumnos.add(new Alumno(3, "1717328901", "Sixto Naranjoe", "Marín", "Java 8", 8.6, 15));
		listaAlumnos.add(new Alumno(4, "1717567128", "Gerardo Emilio", "Duque Gutiérrez", "Java 8", 10, 13));
		listaAlumnos.add(new Alumno(5, "1717902145", "Jhony Alberto", "Sáenz Hurtado", "Java 8", 9.5, 15));
		listaAlumnos.add(new Alumno(6, "1717678456", "Germán Antonio", "Lotero Upegui", "Java 8", 8, 34));
		listaAlumnos.add(new Alumno(7, "1102156732", "Oscar Darío", "Murillo González", "Java 8", 8, 32));
		listaAlumnos.add(new Alumno(8, "1103421907", "Augusto Osorno", "Palacio Martínez", "PHP", 9.5, 17));
		listaAlumnos.add(new Alumno(9, "1717297015", "César Oswaldo", "Alzate Agudelo", "Java 8", 8, 26));
		listaAlumnos.add(new Alumno(10, "1717912056", "Gloria Amparo", "González Castaño", "PHP", 10, 28));
		listaAlumnos.add(new Alumno(11, "1717912058", "Jorge León", "Ruiz Ruiz", "Python", 8, 22));
		listaAlumnos.add(new Alumno(12, "1717912985", "John Jairo", "Duque García", "Java Script", 9.4, 32));
		listaAlumnos.add(new Alumno(13, "1717913851", "Julio Cesar", "González Castaño", "C Sharp", 10, 22));
		listaAlumnos.add(new Alumno(14, "1717986531", "Gloria Amparo", "Rodas Monsalve", "Ruby", 7, 18));
		listaAlumnos.add(new Alumno(15, "1717975232", "Gabriel Jaime", "Jiménez Gómez", "Java Script", 10, 18));
    
        //Students that their names start with L or G
        System.out.println(">L or G: ");
        listaAlumnos.stream().filter((a)->a.getNombres().charAt(0)=='L' || a.getNombres().charAt(0)=='G').forEach((a0)->System.out.println(a0));
        System.out.println("\n");
        //Number of student
        System.out.println(">The number of student is: "+listaAlumnos.stream().count()+"\n");

        //Student with a grade higher than 9 and they course PHP
        listaAlumnos.stream().filter((a1)->a1.getNota()>9 && a1.getNombreCurso().equalsIgnoreCase("PHP")).forEach((a2)->System.out.println(a2.getNombres()+","));

        //Print the first two student
        listaAlumnos.stream().limit(2).forEach((a2)->System.out.println(a2));

        //Changing values of a list
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(">Increase in 1 the numbers of a list");
        l.stream().map((n)->n+1).forEach((n1)->System.out.println(n1));
        System.out.println(l);
        
        System.out.println("Increasing the age of each");
        listaAlumnos.stream().mapToInt((a5)->a5.getEdad()+10).forEach((i)->System.out.println(i));
    }
}