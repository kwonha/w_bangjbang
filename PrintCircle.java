package test.this2;

public class PrintCircle {
	
	public static void print(Circle c) {
		System.out.printf("반지름이 %d인 원의 둘레는 %.2fcm이다.\n", c.getR(), c.getCircum());
		System.out.printf("반지름이 %d인 원의 면적은 %.2fcm이다.\n", c.getR(), c.getArea());
	}//print

	public static void main(String[] args) {
		Circle c = new Circle(7);
		c.showInfo();
	}//main

}
