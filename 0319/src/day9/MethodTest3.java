package day9;

public class MethodTest3 {
	public static int getSum(int count) { //count 매개변소
		int sum = 0; //지역변수

		for(int i=0;i<count;i++) { //i=>블럭변수
			sum+=i;
		}

		return sum;
	}

	public static void main(String[] args) {
		int sum=getSum(10);

		int count=30;
		sum=getSum(count);

		System.out.println("1~"+count+"까지의 합 : "+sum);

	}

}
