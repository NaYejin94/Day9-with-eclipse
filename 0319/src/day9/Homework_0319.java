package day9;

//������

import java.util.Scanner;

public class Homework_0319 {

	// [p.28 - 2]
	public static String func1(int a) {
		String str="";
		if(a%2==0) {
			str = "¦��";
		}else {
			str = "Ȧ��";
		}
		return str;
	}

	// [p.28 - 3]
	public static String func2(int a) {
		String str="";
		if(a==1 || a==3) {
			str = "����";
		}else if(a==2 || a==4) {
			str = "����";
		}else {
			str="�߸��Է�";
		}
		return str;
	}

	// [p.29 - 1]
	public static int convToInt(String str) {
		int a = Integer.parseInt(str);
		return a;
	}

	// [p.29 - 2]
	public static void func3(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("A");
			}
			System.out.print("B");
			System.out.println();
		}
	}

	/*if(j==i)
		System.out.println("B");
		else
		System.out.println("A");*/

	// [p.30 - 2]
	public static boolean func4(String str) {
		boolean isNumber = true;

		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);

			if(!(ch>=48 && ch<=57)) {
				isNumber = false;
				break;
			}
		}
		return isNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// [p.28 - 2]
		System.out.println("������ �Է��ϼ���.");
		int num1 = sc.nextInt();

		String result1 = func1(num1);

		System.out.println(num1+"�� "+result1+"�Դϴ�.");

		System.out.println("\n==============================\n");

		// [p.28 - 3]
		System.out.println("������ �Է��ϼ��� [����(1,3), ����(2,4)]");
		int gender = sc.nextInt();

		String result2 = func2(gender);

		System.out.println("������ "+result2+"�Դϴ�.");

		System.out.println("\n==============================\n");

		// [p.29 - 1]
		System.out.print("0~9������ ���ڸ� �Է��ϼ��� :");
		sc.nextLine();
		String str2=sc.nextLine();

		int result3 = convToInt(str2);
		System.out.println(str2+"=>"+result3);
		System.out.println(result3+"*100="+(result3*100));

		System.out.println("\n==============================\n");

		// [p.29 - 2]
		System.out.println("�ݺ� Ƚ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();

		func3(num2);

		System.out.println("\n==============================\n");

		// [p.30 - 2]
		System.out.println("���� �Է��ϼ���");
		sc.nextLine();
		String str = sc.nextLine();

		String res = "";
		if(func4(str)) {
			res="�����Դϴ�";
		}else {
			res="���ڰ� �ƴմϴ�.";
		}
		System.out.println(str+"�� "+res);
	}
}
