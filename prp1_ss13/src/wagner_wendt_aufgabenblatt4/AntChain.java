package wagner_wendt_aufgabenblatt4;

import java.lang.reflect.Array;
import java.util.*;

public class AntChain {

	static Ant leader;
	List<Ant> listAnt = new ArrayList<Ant>();

	public static void main(String[] args) {
		AntChain chain = new AntChain();
//		Ant ant1= new Ant(5);
//		Ant ant2= new Ant(12);
		
chain.addtoFront(new Ant(5));		
chain.addtoFront(new Ant(6));

	}

	public  void addtoFront(Ant ants) {
	
		

	
			listAnt.add(ants);
	
	
			System.out.print(listAnt);
		

	
}
}