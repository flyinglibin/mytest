package shejimoshi.观察者;

public interface Subject {
	public void add(Observer observer);
	public void del(Observer observer);
	public void notifyObsevers();
	public void operation();
}
