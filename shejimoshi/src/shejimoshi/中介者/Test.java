package shejimoshi.中介者;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
		((MyMediator) mediator).getUser1().work();
		((MyMediator) mediator).getUser2().work();
	}

}
