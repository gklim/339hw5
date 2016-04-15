package observer;

public class Square implements Shape{

	private int count = 0;
	
	Square(int count){
		super();
		this.count = count;
	}
	
	@Override
	public void print(int length){
		System.out.println("This is square #" + count + "Length: " + length + "cm");
	}
}
