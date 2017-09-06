package shejimoshi.factory;

public class FactoryTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}

}
