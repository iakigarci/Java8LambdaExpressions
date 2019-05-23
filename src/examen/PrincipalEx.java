package examen;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrincipalEx{

    private static final double _0_0 = 0.0;

	public static void main(String[] args) {
        ArrayList<MobileNumber> l = new ArrayList<>();
        l.add(new MobileNumber("1233"));
        l.add(new MobileNumber("1234"));

        Student student1 = new Student(
            "Jayesh",
            20,
            new Address("1234"),
            l);

        l = new ArrayList<>();
        l.add(new MobileNumber("1111"));
        l.add(new MobileNumber("3333"));
        l.add(new MobileNumber("1233"));
        Student student2 = new Student(
            "Khyati",
            20,
            new Address("1235"),
            l);
 
        l = new ArrayList<>();
        l.add(new MobileNumber("3333"));
        l.add(new MobileNumber("4444"));
        Student student3 = new Student(
            "Jason",
            20,
            new Address("1236"),
            l);
 
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        

        //Get student with exact match name "jayesh"
        String name = "jayesh";
        Optional opt = students.stream().filter(s->s.compareTo(name)).findFirst();
        System.out.println("The student is "+opt.get());

        //Get student with matching address "1235"
        System.out.println(">Student by address"+students.stream().filter(s2->s2.getAddress().getZipcode().equals("1235")).findAny().get());
        List<Student> studentByAddress = students.stream().filter(s3->s3.getAddress().getZipcode().equals("1235")).collect(Collectors.toList());
        System.out.println(studentByAddress+ "\n");

        //Get all student having mobile numbers 3333.        
        System.out.println(">All student with numbers 3333");
        System.out.println(students.stream().filter(s4->s4.hasMobileNumber("3333")).collect(Collectors.toList())+"\n");

        //Get all student having mobile number 1233 and 1234
        System.out.println(">All student with numer 1233 and 1234");
        System.out.println(students.stream().filter(s5->s5.hasMobileNumber("1233") && s5.hasMobileNumber("1234")).collect(Collectors.toList())+"\n"); 

        //Age average
        System.out.println("The age average is "+students.stream().mapToInt(s6->s6.getAge()).average().getAsDouble());

        //Count the mobiles of all student
        long cant = students.stream().mapToInt(s7->(int) s7.getMobileNumbers().stream().count()).sum();
        System.out.println("The count of mobiles is : "+cant);

        //Extract a slice of a list: 1,3
        /*students.add(student2);
        students.add(student1);
        students.add(student2);
        */
        System.out.println("Primary list size: "+students+"\n");
        System.out.println("Sliced 1st: "+students.stream().skip(1).collect(Collectors.toList())+"\n");
        List<Student> listaS = students.stream().skip(1).collect(Collectors.toList());
        Collections.reverse(listaS);
        System.out.println("Sliced 2nd; "+listaS.stream().skip(3).collect(Collectors.toList())+"\n");

        
    }
}