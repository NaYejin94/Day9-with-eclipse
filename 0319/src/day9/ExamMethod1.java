package day9;

import java.util.Scanner;

public class ExamMethod1 {
	//inch를 cm로 변환하는 메서드
		//1 inch = 2.52cm
		public static float toCm(float inch) {
			float cm = inch * 2.54f;
			return cm;
		}
		public static void main(String[] args) {
			//1
			float cm = toCm(3);
			System.out.println("3inch => "+cm+"cm");

			//2
			float inch = 5;
			cm=toCm(inch);
			System.out.println(inch+"inch => "+cm+"cm");

			//3
			Scanner sc = new Scanner(System.in);
			System.out.println("변환하려는 inch입력!");
			float inch2 = sc.nextFloat();
			cm=toCm(inch2);
			System.out.println(inch2+"inch =>"+cm+"cm");

		}
}
