package test.darr;

import java.util.Scanner;

public class DynamicArrScore {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);//성명 입력받는 스캐너(String)
		Scanner s2 = new Scanner(System.in);//학생수,과목수,성적 등 정수를 입력받는 용도(int)
		
		System.out.println("===== 동적 배열을 사용한 성적 프로그램 ====\n");
		
		System.out.print("* 학생수 입력 : ");
		int stuNum = s2.nextInt();
		
		//성명을 저장하는 배열(1차원 배열)
		String[] stuNames = new String[stuNum];
		//각 학생의 성적을 저장하는 배열(동적 2차원 배열)
		int [][] scores = new int[stuNum][]; 
		//각 학생의 합계를 저장하는 배열(1차원 배열)
		int[]sums = new int[stuNum];
		
		
		for (int i = 0; i < scores.length; i++) { //행(학생수 만큼)에 대한 for
			System.out.print("학생이름 입력 : ");
			stuNames[i] = s1.nextLine();
			System.out.print("* 과목수 입력 : ");
			int subNum = s2.nextInt();
			scores[i] = new int[subNum];
			
			for (int j = 0; j < scores[i].length; j++) {//열 (과목수 만큼)에 대한 for
				System.out.println("->" + (j+1) + "과목 점수 입력");
				scores[i][j] = s2.nextInt();
				sums[i] += scores[i][j];
			}//for j			
		}//for i
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i+1)+". "+stuNames[i]+"\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}//for j
			System.out.print("합계 : " + sums[i]+"  ");
			System.out.printf("평균 : %.1f\n", ((double)sums[i]/scores[i].length));
			System.out.println("---------------------------------------------------------------");			
		}//for i
				
		s1.close();
		s2.close();

	}//main
}
