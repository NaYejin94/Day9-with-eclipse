package day9;

public class MethodTest1 {

	public static void main(String[] args) {
		// [메서드 호출]
		/*
		 	static 메서드인 경우
		 	[1] 같은 클래스의 메서드 호출
		 	메서드명();
		 	
		 	[2] 다른 클래스의 메서드 호출
		 	클래스명.메서드명();
		 */

		//1. 메서드명을 써서 호출
		//calcInterest();

		//2. ()안에 입력값에 해당하는 값을 넣어준다
		//calcInterest(1000000);

		//3. 결과타입(반환타입)의 변수가 결과값을 받아온다
		double i=calcInterest(1000000);

		System.out.println("이자 : "+i);

	}

	// [메서드 정의 - 메서드 만들기]
	//1. ()안에 입력값 넣기
	//4. 메서드 이름 앞에 결과 타입(결과형태, 결과의 자료형)넣기
	public static double calcInterest(int money) {
		//2. 메서드 기능 구현
		double interest = money*0.016;

		//3. 결과값 리턴(반환)
		//return 결과값;
		return interest;
	}

	/*
	 	입력값 - 매개변수, 인수, 인자, parameter
	 	결과 타입(결과 형태) - 반환타입, 반환형, return type
	 					- 반환값이 없는 메서드 => 반환타입을 void로 지정
	 	
	 	return
	 		1) 메서드의 실행을 종료하고, 호출원(자신을 호출한 곳)으로 복귀함
	 		2) 메서드의 처리 결과를 호출원으로 돌려주는 기능도 함
	 		   return 결과값; (호출한 곳으로 결과값 반환), 한 개의 값만 반환해줌
	 */

}
