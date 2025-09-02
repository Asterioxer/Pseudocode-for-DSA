interface Test {
    public void meth1();
    void meth2();
    //void meth3(); this is not supposed to be added just to show that interfaces are all abstract in nature
}

class TestImpl implements Test {
    @Override
    public void meth1() {
        System.out.println("Method 1");
    }
    @Override
    public void meth2() {
        System.out.println("Method 2");
    }

    public void meth3() {
        System.out.println("Method 3");
    }
}

class TestFrthr extends TestImpl {
    @Override
    public void meth1() {
        System.out.println("Overrides the previously implemented method 1");
    }
    @Override
    public void meth3() {
        System.out.println("Overrides method 3 of TestImpl class");
    }
}

public class Interface_implements {
    public static void main(String[] args) {
        Test t = new TestImpl();
        t.meth1();
        t.meth2();
        TestImpl x = new TestImpl();
        x.meth3();
        Test ts = new TestFrthr();
        ts.meth1();
        TestFrthr tsf = new TestFrthr(); // since the method 3 is not defined in the interface so, it is not accessible through the interface reference and needs an object of its own class which has extended the implemented class or implemented the interface
        tsf.meth3();
    }
}
