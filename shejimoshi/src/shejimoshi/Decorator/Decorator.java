package shejimoshi.Decorator;

public class Decorator implements Sourceable {
	
	private Sourceable source;
    public Decorator(Sourceable source) {
		// TODO Auto-generated constructor stub
		this.source = source;
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before decorator ");
		source.method();
		System.out.println("after decorator ");
	}

}
