package test.final1;


public class Child extends Parent{
	public final int time = 3;//final 필드는 나중에 필드 값을 변경하는것을 금지 
	
	@Override
	public void rest() {
//		time = 5;
		System.out.println(time + "시간 휴식한다.");
	}//rest
}
