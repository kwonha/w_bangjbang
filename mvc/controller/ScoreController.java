package mvc.controller;

import java.util.Scanner;

public class ScoreController {

	public static void main(String[] args) {
		//�л� �����͸� �Է� �޾Ƽ� StudentVO��ü�� ����
		//������ StudentVO��ü�� ArrayList�� �߰�
		Scanner s1 = new Scanner(System.in); //���ڿ� �Է¿� Scanner
		Scanner s2 = new Scanner(System.in); //���� �Է¿� Scanner
		
		System.out.println("** �л�����  ������ �Է��� �ּ���  ***");
		
		while(true) {
			System.out.print("* �����Է� : ");
			String name = s1.nextLine();
			
			System.out.print("* �й��Է� : ");
			int stuId = s2.nextInt();
			
		
			
			System.out.print("* ����ؼ� ���� �л��� ������ �Է��Ͻðڽ��ϱ�?(y/n");
			String msg = s1.nextLine();
			if(msg.equals("n")|| msg.equals("no")) break;
		}//while
		
		s1.close();
		s2.close();
		

	}//main
}
