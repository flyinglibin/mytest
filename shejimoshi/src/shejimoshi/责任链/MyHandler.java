package shejimoshi.责任链;


public class MyHandler extends AbstractHandler implements Handler{

	private String name;
	public MyHandler(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void operator() {
		// TODO Auto-generated method stub
		System.out.println(this.name +"  deal! ");
		if(getHandler() != null){
			getHandler().operator();
		}
	}
	
}
