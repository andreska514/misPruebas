package creational.singleton;

public class Principal {
    
    public static void main(String[] args) {
        
        // Ejemplo Singleton - aunque se intenten crear mas instancias solo devuelve la 1ª
        
        Singleton single = Singleton.getInstance(333,"Solo 1 instancia!!");
        Singleton single2 = Singleton.getInstance(7, "nosenose");
        System.out.println("Entero: "+single2.getMyInt() 
            + "\nString: " +  single2.getMyString());
                
    }
}
