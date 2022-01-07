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
	}//생 USB
	
	public String showInfo() {
		return capacity + "GB, " + color + "색상";
	}//showinfo
	
	public void writeMemory() {
		System.out.println(showInfo() + "의 USB Memory에 데이터를 저장한다.");
	}//write
	
	public void readMemory() {
		System.out.println(showInfo() + "의 USB Memory에 데이터를 읽어온다.");
	}//read
	
	
	
}//class USBMemory
