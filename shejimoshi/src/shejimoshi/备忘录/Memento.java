package shejimoshi.备忘录;

public class Memento {
	
	private String value;
	public Memento(String value){
		this.value = value;
	}
	
	public String getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
	public void setValue(String value){
		this.value = value;
	}

}
