import java.math.BigDecimal;
import java.math.BigInteger;

/*	
 * Deben funcionar solo Long, Double, Integer, BigDecimal (Number tb)
 * Debe haber una clase abstracta que extienda de acciones y otra concreta que la extienda
 * Debe haber un metodo que compruebe que solo funcionen los Number validos
 * */ 

public class numeros {
	
    public static void main (String[] args) {
    	
    	// Valores
    	
    	Number myNull = null;
    	Number myNumber = (Number)new Double(3d);
    	String myString = "string";
    	
    	Float myFloat = 3f;
    	BigInteger myBigInteger = new BigInteger("3");
    	Short myShort = 3;
    	
    	Long myLong = 30l;
    	Double myDouble = 30d;
    	Integer myInteger = 30;
    	BigDecimal myBigDecimal = new BigDecimal(3);

    	// Pruebas
    	
    	Object parametroPasado = myLong;
    	new Concreta();
    	
    }
}