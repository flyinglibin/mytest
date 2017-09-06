package shejimoshi.Adapter;

public class AdapterTest {
	public static void main(String[] args){
		Targetable target = new Adapter();
		target.method1();
		target.method2();
		Source s = new Source();
		Targetable t = new Wrapper(s);
		t.method1();
		t.method2();
	}
}
