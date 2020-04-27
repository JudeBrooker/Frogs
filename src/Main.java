public class Main {
    public static void main(String[] args){
        Frog frog1 = new Frog("green", 10, "Bob", 12);
        frog1.setColour("red");
        System.out.println(frog1.getColour());
        frog1.setName("Steve");
        System.out.println(frog1.getName());

        Frog frog2 = new Frog("red", 6, "Jeff", 3);
        frog2.setPosition(3);
        System.out.println("Position: " + frog2.getPosition());
        frog2.setAge(4);
        System.out.println("Age: " + frog2.getAge());
        frog2.setColour("Pink");
        System.out.println("Colour: " + frog2.getColour());

        Frog frog3 = new Frog("blue", 2, "Richard", 5);
        System.out.println(frog3.getName());
        frog3.setPosition(3);
        System.out.println(frog3.getPosition());

        frog1.left();
        frog2.right();
        frog3.right();
        System.out.println(frog3.getPosition());
        System.out.println("Frog count: " + Frog.getCount());

        Cat cat1 = new Cat("Chloe", 3, "Female", "British Shorthair");
        cat1.setAge(4);
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Breed: " + cat1.getBreed());
    }
}
