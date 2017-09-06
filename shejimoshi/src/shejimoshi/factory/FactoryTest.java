/**
 * 1.创建共同的接口Sender，定义发送方法 
 * 2.创建实现类 mailSender smsSender
 * 3.创建工厂SendFactory;
 */

package shejimoshi.factory;

public class FactoryTest {
	public static void main(String args[]){
		SendFactory factory = new SendFactory();
		//普通工厂
		Sender sender1 = factory.produce("sms");
		Sender sender2 = factory.produce("mail");
		sender1.Send();
		sender2.Send();
		//多个工厂方法
		Sender sender3 = factory.produceMail();
		Sender sender4 = factory.produceSms();
		sender3.Send();
		sender4.Send();
		//静态工厂方法
		Sender s = SendFactory.produceMail1();
		s.Send();
		Sender d = SendFactory.produceSms1();
		d.Send();
		
	}
}