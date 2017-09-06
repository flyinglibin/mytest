package shejimoshi.builder;
import java.util.ArrayList;
import java.util.List;

import shejimoshi.factory.*;
public class Builder {
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for(int i = 0 ; i < count; i++){
			list.add(new MailSender());
		}
	}
	public void produceSmsSender(int count){
		for(int i = 0 ; i < count; i++){
			list.add(new SmsSender());
		}
	}
	public void exeSender(){
		for(int i = 0 ; i < list.size(); i++){
			list.get(i).Send();
		}
	}
}
