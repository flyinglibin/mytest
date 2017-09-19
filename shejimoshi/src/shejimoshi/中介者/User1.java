package shejimoshi.中介者;

public class User1 extends User {

	public User1(Mediator mediator){
		super(mediator);
	}
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("user1 working...");
	}

}
