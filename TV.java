package test.static1;

public class TV {
	public static String producer;//Ŭ���� ���� ->  ���������� �� 1���� �Ҵ��
	private int size;//�ν��Ͻ� ���� -> ��ü ������ ������ ������ ����� �Ҵ��
	private String color;//�ν��Ͻ� ����
		
	public TV(int size, String color) {
		this.size = size;
		this.color = color;
	}//�� TV


	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}
	
}//Ŭ TV
