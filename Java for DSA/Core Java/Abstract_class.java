
abstract class Super {
    public Super() { System.out.println("Super constructor called"); }

    public void meth1() {
        System.out.println("meth1 of super");
    }
    abstract public void meth2();
}

class Sub extends Super {
    @Override //overriding the abstract method meth2() of Super class
    public void meth2() {
        System.out.println("meth2 of sub");
    }
}

public class Abstract_class {
    public static void main(String[] args) {
        Super s = new Sub();
        s.meth1();
        s.meth2();
        
        Sub s1 = new Sub();
        s1.meth1();
        s1.meth2();
    }
}