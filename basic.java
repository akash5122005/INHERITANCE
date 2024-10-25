import java.util.Scanner;

class Animal{
    public void makeSound(){
        System.out.println("Some generic animal sound.");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();

        Animal animal = new Animal();
     
        if (s.equals("dog")) {
            animal = new Dog(); 
            animal.makeSound(); 
        } else {
            System.out.println("Unknown animal type");
            }
}
}
