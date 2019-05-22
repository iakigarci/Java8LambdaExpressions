package mayo2017;

import java.util.ArrayList;

public class Principal{

    public static void main(String[] args) {
		Barco b1=new Barco("Barco 1");
		Barco b2=new Barco("Barco 2");
		Barco b3=new Barco("Barco 3");		
		Casilla cas1 = new Casilla(1,2);
		Casilla cas2 = new Casilla(3,2);
		Casilla cas3 = new Casilla(4,2);
		Casilla cas4 = new Casilla(5,2);
		Casilla cas5 = new Casilla(4,5);
		Casilla cas6 = new Casilla(4,6);
		Tablero unTab=new Tablero();
		b1.add(cas1);
		b2.add(cas2);
		b2.add(cas3);
		b2.add(cas4);
		b3.add(cas5);
		b3.add(cas6);
		unTab.add(b1);
		unTab.add(b2);
		unTab.add(b3);
		ArrayList<Casilla> l = unTab.dispararMisilBOOM(5, 2);
		System.out.println(l);

		System.out.println("Segundo Ejercicio");
		unTab.imprimirCasillas(5, 2);
    }

}