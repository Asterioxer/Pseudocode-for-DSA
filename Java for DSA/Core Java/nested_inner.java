class Outer {
    static int x = 90;
    Inner i = new Inner();
    class Inner {
        int y = 10;
        public void innerdisplay() {
            System.out.println(x+" "+y);
        }
    }
    public void outerdisplay() {
        i.innerdisplay(); 
        System.out.println(i.y);
    }
}
public class nested_inner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerdisplay();
        Outer.Inner oi = new Outer().new Inner(); //this is how we can create an object of inner class
        oi.innerdisplay();
    }
}
