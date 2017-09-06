package shejimoshi.factory;

public class SendFactory {
	public Sender produce(String type){
		if ("mail".equals(type)){
			return new MailSender();
		} else if("sms".equals(type)){
			return new SmsSender();
		}else{
			return null;
		}
	}
	
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
	
	public static Sender produceMail1(){
		return new MailSender();
	}
	public static Sender produceSms1(){
		return new SmsSender();
	}
}
