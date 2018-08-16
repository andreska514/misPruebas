package generics;

import java.util.ArrayList;
import java.util.List;

public class MiListaGenerica <Number> extends ArrayList {
	
	double suma (){
		double resultado = 0;
		for (int x = 0; x < this.size(); x++ ) {
			resultado += (double)get (x);
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		List <Integer> l1 = new MiListaGenerica();
		List <Double> l2 = new MiListaGenerica();
		
		l1.add(3);
		l1.add(7);
		l1.add(5);
		l1.add(8);
		l2.add(4.3);
		l2.add(5.2);
		l2.add(3.1);
		l2.add(2.0);
		System.out.println(((MiListaGenerica) l1).toString());
		//System.out.println(((MiListaGenerica) l2).suma());
	}
}
