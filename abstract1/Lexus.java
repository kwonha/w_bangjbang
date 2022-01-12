package test.abstract1;

public class Lexus extends Car {
	private String producer;
	
	public Lexus(String name) {
		producer = name;
	}

	@Override
	public void drive() {
		System.out.println(producer + "�ڵ����� �����Ѵ�.");
	}//drive

	@Override
	public void stop() {
		System.out.println(producer + "�ڵ����� �m���.");
	}//stop

	@Override
	public void turnLeft() {
		System.out.println(producer + "�ڵ����� ��ȸ���Ѵ�.");
	}//tL

	@Override
	public void turnRight() {
		System.out.println(producer + "�ڵ����� ��ȸ���Ѵ�.");
	}//tR

}
