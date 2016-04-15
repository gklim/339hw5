package decorator;

public class SampleDecorator extends AbstractDecorator{

	public SampleDecorator(Shape decoratedShape){
		super(decoratedShape);
	}
	
	@Override
	public void print(){
		decoratedShape.print();
		setWidth(decoratedShape);
		setLength(decoratedShape);
	}
	
	private void setWidth(Shape decoratedShape){
		System.out.println("Width: 10cm");
	}
	
	private void setLength(Shape decoratedShape){
		System.out.println("Length: 10cm");
	}
}
