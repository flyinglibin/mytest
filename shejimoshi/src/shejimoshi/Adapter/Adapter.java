package shejimoshi.Adapter;
//类适配器 当希望将一个类转换成满足另一个新接口的类时，
//可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
public class Adapter extends Source implements Targetable{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method!");
	}

}
