import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("decorator/output.txt");
        Shape square = new Square();

        Shape realSquare = new SampleDecorator(new Square());

        out.println("Before decorating:\n" + square.print() + "\n");
        out.println("After decorating:\n" + realSquare.print());
        out.close();
    }
}
