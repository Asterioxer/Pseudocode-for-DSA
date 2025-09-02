class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    public double add(double n1, double n2) {
        return n1 + n2;
    }
}

public class methoverload {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int result = obj.add(8, 9);
        System.out.println(result);
    }
}
