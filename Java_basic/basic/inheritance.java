package basic;
public class inheritance {
    public static void main(String[] args) {
        Animal a= new Animal();
        a.eat();  
        a.run();

        Cat c = new Cat();
        c.meow();
        System.out.println(c);
 
    }
}
// Parent Class
class Animal {
    String s;
    int a=90;
    
    void eat() {
        System.out.println("This animal eats food.");
        
    }
    int run(){
      int b = 3444;
      System.out.println(b);
      
        return 0;
    }
}

// Child Class
class Dog extends Animal {
    String breed;

    void bark() {
        System.out.println("Woof woof!");
    }
}
class Cat extends Animal{
    String sniff;
    int d = 39;

    void meow(){
        System.out.println(" meow meow ");
        System.out.println(a);
    }
}