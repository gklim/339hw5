package composite;

public class Demo {

	public static void main(String[] args){
		Shape square1 = new Square();
		Shape square2 = new Square();
		Shape square3 = new Square();
		
		Compose compose = new Compose();
		compose.add(square1);
		compose.add(square2);
		compose.add(square3);

		compose.print();
		
		compose.remove(square2);
		
		compose.print();
	}
}
