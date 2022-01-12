package test.abstract1;

public class Lexus extends Car {
	private String producer;
	
	public Lexus(String name) {
		producer = name;
	}

	@Override
	public void drive() {
		System.out.println(producer + "자동차가 주행한다.");
	}//drive

	@Override
	public void stop() {
		System.out.println(producer + "자동차가 몀춘다.");
	}//stop

	@Override
	public void turnLeft() {
		System.out.println(producer + "자동차가 좌회전한다.");
	}//tL

	@Override
	public void turnRight() {
		System.out.println(producer + "자동차가 우회전한다.");
	}//tR

}
