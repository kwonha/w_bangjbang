package test.constructor2;

public class USBMemory {

	private int capacity;
	private String color;
	
	public int getCapacity() {
		return capacity;
	}//getCap
	public String getColor() {
		return color;
	}//getCol
	
	public USBMemory(int capacity, String color) {
		this.capacity = capacity;
		this.color = color;
	}//�� USB
	
	public String showInfo() {
		return capacity + "GB, " + color + "����";
	}//showinfo
	
	public void writeMemory() {
		System.out.println(showInfo() + "�� USB Memory�� �����͸� �����Ѵ�.");
	}//write
	
	public void readMemory() {
		System.out.println(showInfo() + "�� USB Memory�� �����͸� �о�´�.");
	}//read
	
	
	
}//class USBMemory
