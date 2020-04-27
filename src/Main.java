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
    }
}
