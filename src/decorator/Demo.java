package decorator;

public class Demo {

	public static void main(String[] args){
		Shape square = new Square();
		
		Shape realSquare = new SampleDecorator(new Square());
		
		square.print();
		System.out.println("\n");
		realSquare.print();		
	}
}
