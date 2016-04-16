import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("observer/output.txt");
        Subject sub = new Subject();
        new Observer1(sub);
        new Obverser2(sub);

        sub.setAge(11);
        out.println(sub.inform());

        sub.setAge(30);
        out.println(sub.inform());
        out.close();
    }
}
