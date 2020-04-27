public class Frog {
    private String colour;
    private int position;
    private String name;
    private int age;
    private static int count;
    public Frog(String colour, int position, String name, int age){
        this.colour = colour;
        this.position = position;
        this.name = name;
        this.age = age;
        count++;
    }
    public static int getCount(){
        return count;
    }
    public void right(){
        if(this.position>5){
            System.out.println(this.name + " has fallen off the log :(");
        }else{
            this.position++;
        }
    }
    public void left(){
        if(this.position<0){
            System.out.println(this.name + " has fallen off the log :(");
        }else{
            this.position--;
        }
    }
    public String getColour(){
        return colour;
    }
    public int getPosition(){
        return position;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setPosition(int position){
        this.position = position;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}

