package day9;

public class MethodTest2 {

	//1. �Ű������� ����, ��ȯ���� ���� �޼���
		public static void func1() {
			System.out.println("**********");
		}

		//2. �Ű������� �ְ�, ��ȯ���� ���� �޼���
		//�Է¹��� ������ŭ ���� ���
		public static void func2(int cnt) {
			for(int i=0;i<cnt;i++) {
				System.out.println("*");
			}
			System.out.println();
		}

		//3. �Ű������� ����, ��ȯ���� �ִ� �޼���
		//1~10������ ���� ���� �� 10���� ���� �� ����
		public static float func3() {
			int sum=0;
			for(int i=1;i<=10;i++) {
				sum+=i;
			}
			float avg = sum/10f;
			return avg;
		}

		//4. �Ű������� �ְ�, ��ȯ���� �ִ� �޼���
		//�� ������ ���� ���ϴ� �޼���
		public static int func4(int a, int b) {
			int c = a+b;

			return c;
		}

		public static void main(String[] args) {
			//[�޼��� ȣ��]
			//1. �Ű�����, ��ȯ���� ��� ���� �޼��� ȣ��
			func1();

			//2. �Ű������� �ְ�, ��ȯ���� ���� �޼��� ȣ��
			func2(3);

			//3. �Ű����Ҵ� ����, ��ȯ���� �ִ� �޼��� ȣ��
			float f = func3();

			//4.�Ű������� �ְ�, ��ȯ���� �ִ� �޼���
			int num = func4(3,5);
			System.out.println(num);
		}
}
