package test.abstract1;

public abstract class Car {
	public String name;
	
	public void showInfo() {
		System.out.println(name+"Ŭ������ ��� ���� Car�� �ڽ�Ŭ������ �԰�ȭ�ϴ� �߻�Ŭ�����̴�.");
		
	}//showInfo
	
	public abstract void drive();
	public abstract void stop();
	public abstract void turnLeft();
	public abstract void turnRight();
	
}
