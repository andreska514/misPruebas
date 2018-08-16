package creational.singleton;

final class Singleton {
    
    static Singleton singleton;
    
    private int myInt;
    private String myString;
    
    private Singleton(int x, String s) {
        myInt = x;
        myString = s;
    }
    public static Singleton getInstance(int x, String s) {
        if (singleton == null)
            singleton = new Singleton(x, s);
        return singleton;
    }
    
    public int getMyInt() {
        return myInt;
    }
    public String getMyString() {
        return myString;
    }
}
