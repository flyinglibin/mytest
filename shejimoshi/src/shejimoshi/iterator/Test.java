package shejimoshi.iterator;

public class Test {
	public static void main(String[] args){
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("------");
		System.out.println(it.first());
		System.out.println(it.next());
		System.out.println(it.previous());

	}
}
