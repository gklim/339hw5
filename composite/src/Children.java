import java.util.ArrayList;

/**
 * Created by chiajun on 4/15/16.
 */
public class Children implements FamilyMembers {
    private String name;
    private int age;
    private ArrayList<String> parents = new ArrayList<>();

    Children(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String getChildren() {
        return "Name: " + name + ", Age: " + age + "\n";
    }

    public String getName(){
        return name;
    }

    public double getAge(){
        return age;
    }

    public void addParents(String name){
        parents.add(name);
    }

    @Override
    public ArrayList<String> getParents() {
        return parents;
    }
}
