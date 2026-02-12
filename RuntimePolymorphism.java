
//Runtime Polymorphism Example

class Animal {

    void sound() {
        System.out.println("Animal make a sound");
    }
}

class cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}

public class RuntimePolymorphism {

    public static void main(String args[]) {

        Animal a = new cat(); //Upcasting
        a.sound(); //cat method execute
    }
}