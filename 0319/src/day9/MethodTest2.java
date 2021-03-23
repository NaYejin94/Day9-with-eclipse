package day9;

public class MethodTest2 {

	//1. 매개변수도 없고, 반환값도 없는 메서드
		public static void func1() {
			System.out.println("**********");
		}

		//2. 매개변수는 있고, 반환값은 없는 메서드
		//입력받은 개수만큼 별을 출력
		public static void func2(int cnt) {
			for(int i=0;i<cnt;i++) {
				System.out.println("*");
			}
			System.out.println();
		}

		//3. 매개변수는 없고, 반환값은 있는 메서드
		//1~10까지의 합을 구한 후 10으로 나눈 값 리턴
		public static float func3() {
			int sum=0;
			for(int i=1;i<=10;i++) {
				sum+=i;
			}
			float avg = sum/10f;
			return avg;
		}

		//4. 매개변수도 있고, 반환값도 있는 메서드
		//두 정수의 합을 구하는 메서드
		public static int func4(int a, int b) {
			int c = a+b;

			return c;
		}

		public static void main(String[] args) {
			//[메서드 호출]
			//1. 매개변수, 반환값이 모두 없는 메서드 호출
			func1();

			//2. 매개변수는 있고, 반환값은 없는 메서드 호출
			func2(3);

			//3. 매개변소는 없고, 반환값은 있는 메서드 호출
			float f = func3();

			//4.매개변수도 있고, 반환값도 있는 메서드
			int num = func4(3,5);
			System.out.println(num);
		}
}
