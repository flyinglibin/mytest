package shejimoshi.观察者;

public class MySubject extends AbstractSubject{
	public void operation(){
		System.out.println("update self! ");
		notifyObsevers();
	}
}
