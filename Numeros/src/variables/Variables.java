package variables;

public class Variables {
	private static int a;
	private int b;
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		Variables.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public static void main(String[] args) {
		Variables v1 = new Variables();
		Variables v2 = new Variables();
		
		v1.setA(1);
		v1.setB(1);
		
		v2.setA(2);
		v2.setB(2);
		
		System.out.println("v1 A - B\t "+v1.getA()+" - "+v1.getB());
		System.out.println("v2 A - B\t "+v2.getA()+" - "+v2.getB());
	}
}
