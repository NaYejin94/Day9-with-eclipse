package day9;

import java.util.Scanner;

public class ExamMethod3 {

	public static String func1(int a) {
		String str="";
		if(a%400==0 || (a%4==0 && a%100!=0)) {
			str = "윤년";
		}else {
			str = "평년";
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
		return money; //리턴해주는 반환값의 반환형이 double
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = sc.nextInt();

		String result = func1(year); //

		System.out.println(year+"년은 "+result+"입니다.");

		System.out.println("\n========================\n");

		System.out.println("판매수량, 판매금약을 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		double result2 = func2(num1,num2);

		System.out.println("성과급 : "+result2);

	}

}
