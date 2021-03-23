package day9;

import java.util.Scanner;

public class ExamMethod2 {

	public static int scan1(int num1, int num2) {
		int bigger=0;
		if(num1>num2) {
			bigger = num1;
		}else {
			bigger = num2;
		}
		return bigger;
	}

	public static int scan2(int num1,int num2) {
			int res = num1%num2;
			return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int result = scan1(n1,n2);

		System.out.println("더 큰수는 "+result);

		System.out.println("\n==========================\n");

		int result2 =0, n11=0, n22=0;
		while(true) {
			System.out.println("두 수를 입력하세요");
			n11 = sc.nextInt();
			n22 = sc.nextInt();

			if(n11==0||n22==0) break;

			result2 = scan2(n11,n22);

			System.out.println("나머지 연산 결과 : "+n11+"%"+n22+" = "+result2);
		}
	}

}
