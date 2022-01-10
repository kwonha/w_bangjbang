package test.this2;

public class Circle {
	private int r;
	private double circum, area;
	
	public Circle(int r) {
		this.r = r;
	}//�� Circle

	public int getR() {
		return r;
	}//gr

	public double getCircum() {
		return circum;
	}//gc

	public double getArea() {
		return area;
	}//ga	
	
	public void calcCircum() {//�������� r�� ���� �ѷ��� ����ϴ� �޼ҵ�
		circum = 2 * Math.PI * r;
	}//calcCircum
	
	public void calcArea() {	//�������� r�� ������ ����ϴ� �޼ҵ�
		area = Math.PI * Math.pow(r, 2);
	}//calcArea
	
	public void showInfo() {
		calcCircum();
		calcArea();
		PrintCircle.print(this);
	}//showInfo
	
}//Ŭ Circle
