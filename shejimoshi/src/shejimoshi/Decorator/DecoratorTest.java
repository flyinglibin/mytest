package shejimoshi.Decorator;

public class DecoratorTest {
	public static void main(String[] args){
		Sourceable source = new Source();
		Sourceable dec = new Decorator(source);
		dec.method();
	}
}
