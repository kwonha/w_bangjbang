package test.class1;

public class TV {
	private String color, producer;
	private int size, channel, volume;
	
	public void setColor(String color) {
		this.color = color;
	}//setCo
	public String getColor() {
		return color;
	}//getCo
	public String getProducer() {
		return producer;
	}//ger P
	public void setProducer(String producer) {
		this.producer = producer;
	}//setP
	public int getSize() {
		return size;
	}//get S
	public void setSize(int size) {
		this.size = size;
	}//set S
	public int getChannel() {
		return channel;
	}//get Ch
	public void setChannel(int channel) {
		this.channel = channel;
	}//set Ch
	public int getVolume() {
		return volume;
	}//get V
	public void setVolume(int volume) {
		this.volume = volume;
	}//set V
	
	public void powerOn() {
		System.out.println(producer + " TV ���� ����.");
	}//powerOn

	public void powerOff() {
		System.out.println(producer + " TV ���� ����.");
	}//poweoff
	
	public void upChannel() {
		channel++;
		System.out.println("���� ä�� :  " + channel + "��");
	}//uc
	
	public void downChannel() {
		channel--;
		System.out.println("���� ä�� :  " + channel + "��");
	}//dc
	
	public void upVolume() {
		volume++;
		System.out.println("���� ���� : " + volume);
	}//uv
	
	public void downVolume() {
		volume--;
		System.out.println("���� ���� : " + volume);
	}//uv
	
	@Override
	public String toString() {
		return "TV [color=" + color + ", producer=" + producer + ", size=" + size + ", channel=" + channel + ", volume="
				+ volume + "]";
	}//toSt

	
	
}//class TV
