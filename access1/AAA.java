package test.access1;

public class AAA {
	
	public void test() {
		AccessBase ab = new AccessBase();
//		System.out.println("n1(private) = " + ab.n1); private 필드는 같은 패케지에서 접근 불가능
		System.out.println("n2(public) = " + ab.n2); //pulic 필드는 같은 패키지에서 접근 가능
		System.out.println("n3(protected) = " + ab.n3);//protected필드는 같은 패키지에서 접근 가능
		System.out.println("n4(default) = " + ab.n4);//default필드는 같은 패키지에서 접근 가능
	}

}//aaa
