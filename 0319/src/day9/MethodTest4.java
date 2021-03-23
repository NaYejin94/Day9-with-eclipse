package day9;

public class MethodTest4 {
	public static double func1(int a,int b) {
		double result = (a*b)/2;
		return  result;  //return해주는 결과값의 자료형을 반환타입으로 지정한다
	}

	public static void main(String[] args) {
		double tResult = func1(20,7);
		System.out.println("삼각형의 면적 : "+tResult);
	}
}
