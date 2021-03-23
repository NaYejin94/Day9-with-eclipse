package day9;

import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		/*
		 public static double random()
		 
		 Math.random() : 0.0과 1.0 사이의 임의의 실수를 리턴해주는 메서드
		 				단, 0.0 <= x < 1.0
		 
		 1) 1~100사이의 임의의 정수 구하기
		 	0.0 <= Math.random()*100 < 100.0
		 	1.0 <= Math.random()*100+1 < 101.0
		 	1 <= (int)(Math.random()*100+1) < 101
		 	
		 2) 'A' ~ 'Z' 사이의 임의의 char 구하기 (65~90)
		 	0.0 <= Math.random()*26 < 26.0
		 	65.0 <= Math.random()*26+65 < 91.0
		 	65 <= (int)(Math.random()*26+65) < 91
		 	
		 	[1] 발생시키려는 수의 개수를 각 변에 곱한다
		 	[2] 시작값을 더한다
		 	[3] int로 형변환한다
		 	
		 3) 97~100(a~d) 사이의 임의의 코드값 구하기
		 	0.0 <= Math.random()*4 < 4.0
		 	97.0 <= Math.random()*4+97 < 101.0
		 	97 <= (int)(Math.random()*4+97) < 101
		 */

			/* for(int i=0;i<5;i++) {
		         double d=Math.random();
		         System.out.println(d);
		         
		         int n = (int)(Math.random()*100+1);
		         System.out.println("1~100 사이 랜덤값 : "+n);
		      }//for
		      */

		      //1. 랜덤값 뽑기 - 정답
		      int answer = rnd();

		      Scanner sc = new Scanner(System.in);

		      //2. 4번의 기회 - 반복문 for
		      for(int i=0;i<4;i++) {
		         //3. 사용자로부터 입력 받기
		    	  System.out.println("1~100 사이의 숫자 입력!");
		    	  int num = sc.nextInt();

		    	  //4. 로직 처리 - 입력값과 정답 비교
		    	  //5. 결과 출력
		    	  if(num==answer) {
		    		  System.out.println("정답입니다.");
		    		  break;  
		    	  }

		    	  if(i==3) {
		    		  System.out.println("꽝! ^▽^ 다음기회에! 정답은 "+answer);
		    	  }else if(num>answer) {
		    		  System.out.println("너무 큽니다. 작은 수를 입력하세요\n");
		    	  }else {
		    		  System.out.println("좀 더 큰 수를 입력하세요\n");
		    	  }


		      }//for

		   }

		   //1~100 사이의 임의의 정수 구하는 메서드
		   public static int rnd() {
		      int n = (int)(Math.random()*100+1);
		      return n;

		   }
}
