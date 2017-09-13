package shejimoshi.命令模式;

public class MyCommend implements Command {
	
	private Receiver receiver;
	
	public MyCommend(Receiver receiver){
		this.receiver = receiver;
	}
	
	@Override
	public void exe() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
