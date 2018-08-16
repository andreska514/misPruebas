package xyz;

public class MainXyz {
	public static void main(String[] args) {
		Productos p1 = new Ropa(2,3,4,"str", "str2");
		Productos p2 = new Ropa (4, 6, 6, "cosa", "cosa2");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
