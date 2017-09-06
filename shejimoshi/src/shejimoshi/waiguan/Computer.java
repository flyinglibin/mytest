package shejimoshi.waiguan;

public class Computer extends Init {
	
	private CPU cpu;
	private Memory memory;
	private Disk disk;
	public Computer(){
		this.cpu = new CPU();
		this.memory = new Memory();
		this.disk = new Disk();
	}

	@Override
	public void startup() {
		// TODO Auto-generated method stub
       System.out.println("start the computer!");  
       cpu.startup();  
       memory.startup();  
       disk.startup();  
       System.out.println("start computer finished!");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
       System.out.println("begin to close the computer!");  
       disk.shutdown(); 
       memory.shutdown();
       cpu.shutdown();  
       System.out.println("computer closed!");  
	}
	public void run(){
		System.out.println("-----------hello i am running-----------");
	}

}
