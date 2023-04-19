package test.object;

public class TV {
	private String producer;
	private String modelNum;
	private String color;
	private int size;
	private int channel;
	private int volume;
	
//	setter 메소드: 필드값을 설정하는 메소드    set필드명()    setProducer()
//	getter 메소드: 필드값을 반환하는 메소드    get
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getModelNum() {
		return modelNum;
	}
	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

//	추상화 과정에ㅔ소 선택된 기능은 메소드로
	
	public void powerOn() {
		System.out.println(color + "색상 TV 전원을 켜다");
	}
	public void powerOff() {
		System.out.println(color + "색상 TV 전원을 끄다");
	}
	public void upChannel() {
		System.out.println("현재 체널은"+ ++channel +"번 입니다.");
	}
	public void downChannel() {
		System.out.println("현재 체널은"+ --channel +"번 입니다.");
	}
	public void upVolume() {
		System.out.println("현재 볼륨은"+ ++volume +"입니다.");
	}
	public void downVolume() {
		System.out.println("현재 볼륨은"+ --volume +"입니다.");
	}

}


