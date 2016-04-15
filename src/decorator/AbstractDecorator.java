package decorator;

public class AbstractDecorator implements Shape{

	 protected Shape decoratedShape;

	   public AbstractDecorator(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   public void print(){
	      decoratedShape.print();
	   }	
}
