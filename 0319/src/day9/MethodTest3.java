package day9;

public class MethodTest3 {
	public static int getSum(int count) { //count �Ű�����
		int sum = 0; //��������

		for(int i=0;i<count;i++) { //i=>������
			sum+=i;
		}

		return sum;
	}

	public static void main(String[] args) {
		int sum=getSum(10);

		int count=30;
		sum=getSum(count);

		System.out.println("1~"+count+"������ �� : "+sum);

	}

}
