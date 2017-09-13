package shejimoshi.命令模式;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver re = new Receiver();
		Command cmd = new MyCommend(re);
		Invoker inv = new Invoker(cmd);
		inv.action();
	}

}
