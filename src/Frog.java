public class Frog {
    private String colour;
    private int position;

    public Frog(String colour, int position){
        this.colour = colour;
        this.position = position;
    }

    public String getColour(){
        return colour;
    }

    public int getPosition(){
        return position;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setPosition(int position){
        this.position = position;
    }
}
