package day9;

import java.util.Scanner;

public class ExamMethod3 {

	public static String func1(int a) {
		String str="";
		if(a%400==0 || (a%4==0 && a%100!=0)) {
			str = "����";
		}else {
			str = "���";
		}
		return str;
	}

	public static double func2(int x, int y) {
		double money=0;
		if(x>=200) {
			money = y*0.3;
		}else if(x>=100) {
			money = y*0.2;
		}else {
			money = y*0.1;
		}
		return money; //�������ִ� ��ȯ���� ��ȯ���� double
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���");
		int year = sc.nextInt();

		String result = func1(year); //

		System.out.println(year+"���� "+result+"�Դϴ�.");

		System.out.println("\n========================\n");

		System.out.println("�Ǹż���, �Ǹűݾ��� �Է��ϼ���");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		double result2 = func2(num1,num2);

		System.out.println("������ : "+result2);

	}

}
