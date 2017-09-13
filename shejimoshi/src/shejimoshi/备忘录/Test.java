package shejimoshi.备忘录;

public class Test {
	public static void main(String[] args){
		
		Original original = new Original("egg");
		
		Storage storage = new Storage(original.createMemento());
		
		System.out.println("初始化状态 " + original.getValue());
		
		original.setValue("Niu");
		Storage s1 = new Storage(original.createMemento());
		
		System.out.println("修改后状态 " + original.getValue());
		
		original.restoreMemento(storage.getMemento());
		
		System.out.println("恢复后状态 " + original.getValue());
		original.restoreMemento(s1.getMemento());
		
		System.out.println("恢复到修改状态 " + original.getValue());
	}
}
