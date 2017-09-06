package shejimoshi.builder;

public class BuilderTest {
	public static void main(String[] args){
		Builder build = new Builder();
		build.produceMailSender(5);
		//build.exeSender();
		build.produceSmsSender(4);
		build.exeSender();
	}
}
