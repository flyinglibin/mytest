package shejimoshi.观察者;

public class ObserverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sub = new MySubject();
		Observer t1 = new Observer1();
		Observer t2 = new Observer2();
		Observer t3 = new Observer1();
		Observer t4 = new Observer2();
		sub.add(t1);
		sub.add(t2);
		sub.add(t3);
		sub.add(t4);
		
		sub.operation();
		sub.del(t4);
		sub.operation();
	}

}
