package day9;

public class ExamMethod {
	
	public static void func1() {
		System.out.println("Hello Java");
	}

	public static void func2(int a) {
		for(int i=0;i<a;i++) {
			System.out.println("Hello Java");
		}
	}

	public static int func3() {
		int sum=0;
		for(int i=1;i<=100;i+=2) {
			sum+=i;
		}
		System.out.println("1~100������ Ȧ���� ��="+sum);
		return sum;
	}

	public static double func4(double a, double b) {
		double db = a*b;
		System.out.println(a+"*"+b+"="+db);
		return db;
	}

	public static void main(String[] args) {
		System.out.println("�ǽ� 1");
		func1();

		System.out.println("\n�ǽ� 2");
		func2(3);

		System.out.println("\n�ǽ� 3");
		int totalSum = func3();

		System.out.println("\n�ǽ� 4");
		double result = func4(10.0,2.5);

	}
}
