package shejimoshi.责任链;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHandler h1 = new MyHandler("h1");
		MyHandler h2 = new MyHandler("h2");
		MyHandler h3 = new MyHandler("h3");
		MyHandler h4 = new MyHandler("h4");
		h1.setHandler(h2);
		h2.setHandler(h3);
		h3.setHandler(h4);
		h1.operator();
	}

}
