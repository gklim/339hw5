package observer;

public class Demo {

	public static void main(String[] args) {
		MyObservable subject = new MyObservable();
		Shape s1 = new Square(1);
		Shape s2= new Square(2);
		subject.add(s1);
		subject.add(s2);
		subject.setLength(1);
		subject.addLength(3);
		
	}
}
