package shejimoshi.访问者模式;

public class Test {
	public static void main(String[] args){
		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
		Subject sub1 = new MySubject1("libin");
		sub1.accept(visitor);
	}
}
