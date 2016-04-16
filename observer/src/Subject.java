import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> listeners = new ArrayList<>();
    private int age;

    public void register(Observer listener){
        listeners.add(listener);
    }

    public String inform(){
        String msg = "";
        for(int i = 0; i < listeners.size(); i++){
            msg += listeners.get(i).update() + "\n";
        }

        return msg;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
