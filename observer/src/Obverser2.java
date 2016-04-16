public class Obverser2 extends Observer {

    public Obverser2(Subject subj){
        this.subj = subj;
        this.subj.register(this);
    }

    @Override
    public String update() {
        return "Observer 2 is updated, age: " + subj.getAge();
    }
}
