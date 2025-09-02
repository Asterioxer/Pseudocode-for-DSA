class Animal {
    String name;
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called for: " + name);
   }}
class Dog extends Animal {
    String breed;
    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog constructor called for: " + breed);
    }
}
class Puppy extends Dog {
    int age;
    Puppy(String name, String breed, int age) {
        super(name, breed);
        this.age = age;
        System.out.println("Puppy constructor called, Age: " + age);
    }
}
public class ConstructorInheritanceDemo {
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Buddy", "Golden Retriever", 1);
    }
}