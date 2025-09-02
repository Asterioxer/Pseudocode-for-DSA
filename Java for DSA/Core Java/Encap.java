public class Encap {
    public Encap() {
        this(" ", 1, 0);
    }
    public Encap(String s) {
        this(s, 1, 0);
    }
    public Encap(String s, int i) {
        this(s, i, 0);
    }
    public Encap(String s, int i, double d) {
        dataField1 = new String(s);
        dataField2 = i;
        dataField3 = d;
    }
    public void method1() {
        System.out.println(dataField1 + " " + dataField2 + " " + dataField3);
    }
    public void method2(int i) {
        method2(i, "unknown");
    }
    public void method2(int i, String s) {
        dataField2 = i;
        System.out.println(i + " received from " + s);
    }
    private String dataField1;
    private int dataField2;
    private double dataField3;
    public static void main(String[] args) {
        Encap obj1 = new Encap("obj1", 100, 200), obj2 = new Encap("obj2"), obj3 = new Encap();
        obj1.method2(123);
        obj1.method1();
        obj2.method2(123, "obj2");
    }
}