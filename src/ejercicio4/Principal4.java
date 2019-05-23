package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Principal4 {

	public static void main(String[] args) {
       
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(30);
        l.add(4);
        l.add(7);

		Integer max = l.stream().mapToInt(a->a).max().orElse(0);
		System.out.println("Resultado: "+max);
		
		Optional<Integer> max2 = l.stream().max((a1, a2) -> a1.compareTo(a2));
		System.out.println("Resultado: "+max2.get());
   }
	
}
