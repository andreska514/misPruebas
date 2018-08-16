import java.math.BigDecimal;

public abstract class MyAbstract implements iAcciones{
	
	Object object;
	
	MyAbstract(){
		this(null);
	}
	
	MyAbstract(Object object){
		this.object = object;
		check();
		print();
	}
	
	@Override
	public void print () {
		System.out.println ("\n\t - Soy un "+object.getClass().getSimpleName());
	}

	@Override
	public void check() {
		if (object == null)
			throw new IllegalArgumentException(" - El parámetro n no debe ser nulo -");
		if (!(object instanceof Number))
			throw new IllegalArgumentException(" - El parámetro n debe ser tipo Number - ");
		if (!(object instanceof Long) && !(object instanceof Double) && !(object instanceof Integer) && !(object instanceof BigDecimal))
			throw new IllegalArgumentException(" - El parámetro n debe ser Long, Double, Integer o BigDecimal - ");
	}
}
