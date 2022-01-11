package test.final1;


public /*final*/ class Parent {//final클래스는 자식 클래스가 없다-> 다른 클래스가 상속을 받을 수 업다.
	
	public /*final*/ void rest() {//부모 클래스의 final 메소드는 재정의 할 수 없다.(메소드 재정의(override) 금지)
		System.out.println("10분간 휴식한다.");
	}//rest

}
