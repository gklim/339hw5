import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter out = new PrintWriter("composite/output.txt");
        Parents parent1 = new Parents(new ArrayList<>());
        parent1.addChildren(new Children("John", 12));
        parent1.addChildren(new Children("Peter", 15));
        parent1.addChildren(new Children("Lucas", 21));
        out.println(parent1.getChildren());

        Parents parent2 = new Parents(new ArrayList<>());
        parent2.addChildren(new Children("Vivian", 18));
        parent2.addChildren(new Children("Lucy", 21));
        parent2.addChildren(new Children("Patrick", 23));
        Children child = new Children("Lucy", 21);
        parent2.removeChild(child);
        out.println(parent2.getChildren());
        out.close();
    }
}
