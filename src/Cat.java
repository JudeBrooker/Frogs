public class Cat {
    private String name;
    private int age;
    private String gender;
    private String breed;
    public Cat(String name, int age, String gender, String breed){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getBreed(){
        return breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
}
