package examen;

import java.util.ArrayList;

public class Student{

    private String name;
    private int age;
    private Address address;
    private ArrayList<MobileNumber> mobileNumbers = new ArrayList<>();
 
    public Student(String name, int age, Address address, ArrayList<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public Address getAddress() {
        return address;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }

 
    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", address=" + address +
            ", mobileNumbers=" + mobileNumbers +
            '}';
    }

    public ArrayList<MobileNumber> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    public boolean compareTo(String pName){
        if (this.name.equalsIgnoreCase(pName)) return true;
        else return  false;
    }

    public boolean hasMobileNumber(String pNumber){
        return mobileNumbers.stream().anyMatch(n->n.getNumber().equalsIgnoreCase(pNumber));
    }
}