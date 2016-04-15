package composite;

import java.util.ArrayList;

public class Compose implements Shape{

	 private ArrayList<Shape> shapes = new ArrayList<Shape>();
     
	    @Override
	    public void print() {
	        for(int i = 0; i < shapes.size(); i++){
	        	shapes.get(i).print();
	        	System.out.println(i);
	        }
	    }
	     
	    public void add(Shape s){
	        this.shapes.add(s);
	    }
	     
	    public void remove(Shape s){
	        shapes.remove(s);
	    }
	     
	    public void clear(){
	        this.shapes.clear();
	    }
}
