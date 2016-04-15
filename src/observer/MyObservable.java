package observer;

public class MyObservable extends Observable{
	
	MyObservable(){
		super();
	}

	public void addLength(int i){
		setLength(getLength() + i);
	}
}
