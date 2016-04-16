public class AbstractDecorator implements Shape{

	 protected Shape decoratedShape;

	   public AbstractDecorator(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   public String print(){
	      return decoratedShape.print();
	   }	
}
