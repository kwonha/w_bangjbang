package test.this2;

public class PrintCircle {
	
	public static void print(Circle c) {
		System.out.printf("�������� %d�� ���� �ѷ��� %.2fcm�̴�.\n", c.getR(), c.getCircum());
		System.out.printf("�������� %d�� ���� ������ %.2fcm�̴�.\n", c.getR(), c.getArea());
	}//print

	public static void main(String[] args) {
		Circle c = new Circle(7);
		c.showInfo();
	}//main

}
