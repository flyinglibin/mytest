package shejimoshi.Adapter;
//对象适配器
//当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，
//持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
public class Wrapper implements Targetable {
	
	private Source source;
	public  Wrapper(Source source) {
		// TODO Auto-generated constructor stub
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		this.source.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method !!");
	}

}
