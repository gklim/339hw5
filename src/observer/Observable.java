package observer;

import java.util.ArrayList;

public abstract class Observable {

	private ArrayList<Shape> shapes;
	private int length;
	
	Observable(){
		shapes = new ArrayList<Shape>();
	}
	
	public int getLength(){
		return length;
	}
	
	public void setLength(int length){
		this.length = length;
		update();
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
	
	protected void update(){
		for (int i = 0; i < shapes.size(); i++){
			shapes.get(i).print(length);
		}
		
	}
}
