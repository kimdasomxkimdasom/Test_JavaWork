package test.mart;

public class Computer {
	//필드
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	//생성자                Cpu cpu=new Cpu 대입한다고 생각(대입연산자)
	public Computer(Cpu cpu, Memory memory, HardDisk hardDisk) {
		this.cpu=cpu; //파란색 글씨체는 필드 
		this.memory=memory;
		this.hardDisk=hardDisk;
	}
	//constructor overload ; 생성자가 다중 의미
	//생성자는 여러개 만들 수 있고, 이미 생성자가 정의가 되어 있기 때문에
	//디폴트 생성자는 현재 만들어져 있지 않고, 내가 원하면 직접 만들 수 있다.
	//예를들면 public Copumter() {}
	
	//메소드
	public void playGame() {
		System.out.println("게임을 해요!");
	}
	public void sendEmail(String addr) {
		System.out.println(addr+"이라는 주소로 이메일을 보내요!");
	}
}
