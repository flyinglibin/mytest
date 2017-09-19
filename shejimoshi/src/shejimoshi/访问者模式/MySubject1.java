package shejimoshi.访问者模式;

public class MySubject1 implements Subject {
	
	private String name;
	
	public  MySubject1(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		// TODO Auto-generated method stub
		return name;
	}

}
