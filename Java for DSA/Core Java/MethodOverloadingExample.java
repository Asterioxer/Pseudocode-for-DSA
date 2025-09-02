class Calculator {
    
   
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public String add(String a, String b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Add(int, int): " + calculator.add(5, 10));
        System.out.println("Add(double, double): " + calculator.add(5.5, 10.3));
        System.out.println("Add(int, int, int): " + calculator.add(1, 2, 3));
        System.out.println("Add(String, String): " + calculator.add("Hello, ", "World!"));
    }
}