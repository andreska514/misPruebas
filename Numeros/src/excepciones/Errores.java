package excepciones;

public class Errores {
	
	private int a;
	
	public static void main(String[] args) {
		Errores e = new Errores();
		e.DividirPorCero();
	}
	
	void DividirPorCero(){
		try {
			System.out.println(1/0);
		}
		catch(ArithmeticException exc){
			System.out.println("Ha habido un error");
		}
		finally {
			System.out.println("finally");
		}
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
}
