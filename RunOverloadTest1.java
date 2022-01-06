package test.overload;

import java.util.Scanner;

public class RunOverloadTest1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MathodOverloadTest1 ot1 = new MathodOverloadTest1();
		
		System.out.println("* 정수1 입력 : ");
		int n1 = s.nextInt();
		System.out.println("* 정수2 입력 : ");
		int n2 = s.nextInt();
		
		System.out.printf("%d * %d = %d\n", n1, n2, ot1.calc(n1,  n2));

		System.out.println("* 정수1 입력 : ");
		int n3 = s.nextInt();
		System.out.println("* 정수2 입력 : ");
		int n4 = s.nextInt();
		System.out.println("* 정수3 입력 : ");
		int n5 = s.nextInt();
		
		System.out.printf("%d + %d + %d = %d\n", n3, n4, n5, ot1.calc(n3,  n4, n5));
		
		s.close();
	}//main

}
