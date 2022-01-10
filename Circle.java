package test.this2;

public class Circle {
	private int r;
	private double circum, area;
	
	public Circle(int r) {
		this.r = r;
	}//생 Circle

	public int getR() {
		return r;
	}//gr

	public double getCircum() {
		return circum;
	}//gc

	public double getArea() {
		return area;
	}//ga	
	
	public void calcCircum() {//반지름이 r인 원의 둘레를 계산하는 메소드
		circum = 2 * Math.PI * r;
	}//calcCircum
	
	public void calcArea() {	//반지름이 r의 면적을 계산하는 메소드
		area = Math.PI * Math.pow(r, 2);
	}//calcArea
	
	public void showInfo() {
		calcCircum();
		calcArea();
		PrintCircle.print(this);
	}//showInfo
	
}//클 Circle
