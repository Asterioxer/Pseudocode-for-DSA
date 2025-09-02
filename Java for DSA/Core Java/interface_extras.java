// package Core_Java;
interface Demo {
    static final int S = 12; //by default static and final
    void method1();
    void method2();
    default void method25() { //default methods may be created as being concrete.
        System.out.println("Default method 25");
    }
    public static void method3() { //static methods may be created as being concrete.
        System.out.println("Public method 3");
    }
    private void meths() {
        System.out.println("Private method");
    }
    default void methsd() {
        meths();
    }
}

interface Demx extends Demo {
    public void method4();
}

class Ox implements Demx {
    @Override
    public void method1() {}
    @Override
    public void method2() {}
    @Override
    public void method4() {
        System.out.println("Method 4");
    }
    @Override
    public void method25() {
        System.out.println("Overridden default method 25");
    }
}
public class interface_extras {
    public static void main(String[] args) {
        System.out.println(Demo.S); //interface can be called without creating an object
        Demo.method3(); //method called without creating an object
        //Demo.method25(); error due to default type method
        Ox o = new Ox();
        o.method1();
        o.method2();
        o.method4();
        o.method25();
        o.methsd();
    }
}
