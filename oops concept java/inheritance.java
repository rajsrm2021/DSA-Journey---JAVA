public class inheritance {

    static class Animal {
        public void behaviour() {
            System.out.println("Different animals have different sounds");
        }
    }

    static class Dog extends Animal {
        @Override
        public void behaviour() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        public void behaviour() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.behaviour(); // Outputs: Different animals have different sounds

        Dog myDog = new Dog();
        myDog.behaviour(); // Outputs: Dog barks

        Cat myCat = new Cat();
        myCat.behaviour(); // Outputs: Cat meows
    }
}
