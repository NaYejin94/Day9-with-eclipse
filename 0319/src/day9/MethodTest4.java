package day9;

public class MethodTest4 {
	public static double func1(int a,int b) {
		double result = (a*b)/2;
		return  result;  //return���ִ� ������� �ڷ����� ��ȯŸ������ �����Ѵ�
	}

	public static void main(String[] args) {
		double tResult = func1(20,7);
		System.out.println("�ﰢ���� ���� : "+tResult);
	}
}
