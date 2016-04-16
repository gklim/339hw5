import java.util.ArrayList;

public class Parents implements FamilyMembers{
    private ArrayList<Children> children;

    public Parents(ArrayList<Children> children){
        this.children = children;
    }

    public void addChildren(Children child){
        children.add(child);
    }

    public void removeChild(Children child){
        for(int i = 0; i < children.size(); i++){
            if(child.getName().equals(children.get(i).getName()) && child.getAge() == children.get(i).getAge())
                children.remove(i);
        }

    }

    @Override
    public String getChildren() {
        String msg = "Children: \n";

        for( Children child : children){
            msg += child.getChildren();
        }

        return msg;
    }

    @Override
    public ArrayList<String> getParents() {
        return null;
    }
}
