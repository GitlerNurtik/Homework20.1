public class Turtle implements Swimable{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Turtle(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    private String color;

    @Override
    public void swim() {
        System.out.println(name+" плывет.");
    }

    @Override
    public String toString() {
        return "name: "+getName()
                +"\n age: "+getAge()
                +"\n color: "+getColor();
    }
}
