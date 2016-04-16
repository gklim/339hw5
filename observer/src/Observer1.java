public class Observer1 extends Observer {
    public Observer1(Subject sub){
        subj = sub;
        subj.register(this);
    }

    @Override
    public String update() {
        return "Observer 1 is updated, age: " + subj.getAge();
    }
}
