package shejimoshi.观察者;

import java.util.Enumeration;
import java.util.Vector;

public class AbstractSubject implements Subject{
	private Vector<Observer> vector = new Vector<Observer>();

	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		// TODO Auto-generated method stub
		vector.remove(observer);
	}

	@Override
	public void notifyObsevers() {
		// TODO Auto-generated method stub
		Enumeration<Observer> enumo = vector.elements();
		while(enumo.hasMoreElements()){
			enumo.nextElement().update();
		}
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		
	}
	
	
}
