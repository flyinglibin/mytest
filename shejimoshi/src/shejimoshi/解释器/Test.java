package shejimoshi.解释器;

public class Test {
	public static void main(String[] args){
		 
		int result = new Minus().interpret(new Context(new Plus().interpret(new Context(4, 5)), 6));
		System.out.println(result);
		
		Context c1 = new Context(4,5);
		int result1 = new Plus().interpret(c1);
		Context c2 = new Context(result1,6);
		int result2 = new Minus().interpret(c2);
		System.out.println("reuslt2:" + result2);
		System.out.printf("result is %d", result2);
	}
}