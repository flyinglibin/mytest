package shejimoshi.访问者模式;



public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		// TODO Auto-generated method stub
		return "love";
	}

}
