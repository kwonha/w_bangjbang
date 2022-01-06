package test.overload;

public class MathodOverloadTest1 {
//매개변수 개수를 다르게 선언한 메소드 오버로딩	
	public int calc(int n1, int n2) {
		return n1*n2;
	}//calc 매개변수 2
	
	public int calc(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}//calc 매개변수 3
	
}//class mathod
