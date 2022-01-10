package test.static1;

public class TV {
	public static String producer;//클래스 변수 ->  공유영역에 단 1번만 할당됨
	private int size;//인스턴스 변수 -> 객체 생성될 때마다 독립된 멤버로 할당됨
	private String color;//인스턴스 변수
		
	public TV(int size, String color) {
		this.size = size;
		this.color = color;
	}//생 TV


	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}
	
}//클 TV
