
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){ return this.name;}
    public SimpleDate getBirthday(){ return this.birthday;}
    public int getHeight(){ return this.height;}
    public int getWeight(){ return this.weight;}
    
    @Override
    public boolean equals(Object compared){
        if(!(compared instanceof Person)) return false;
        Person comp = (Person) compared;
        if(this.name.equals(comp.getName()) && this.getBirthday().equals(comp.getBirthday()) && this.height==comp.getHeight() && this.weight==comp.getWeight() ) return true;
        return false;
    }
    // implement an equals method here for checking the equality of objects
}
