package day9;

import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		/*
		 public static double random()
		 
		 Math.random() : 0.0�� 1.0 ������ ������ �Ǽ��� �������ִ� �޼���
		 				��, 0.0 <= x < 1.0
		 
		 1) 1~100������ ������ ���� ���ϱ�
		 	0.0 <= Math.random()*100 < 100.0
		 	1.0 <= Math.random()*100+1 < 101.0
		 	1 <= (int)(Math.random()*100+1) < 101
		 	
		 2) 'A' ~ 'Z' ������ ������ char ���ϱ� (65~90)
		 	0.0 <= Math.random()*26 < 26.0
		 	65.0 <= Math.random()*26+65 < 91.0
		 	65 <= (int)(Math.random()*26+65) < 91
		 	
		 	[1] �߻���Ű���� ���� ������ �� ���� ���Ѵ�
		 	[2] ���۰��� ���Ѵ�
		 	[3] int�� ����ȯ�Ѵ�
		 	
		 3) 97~100(a~d) ������ ������ �ڵ尪 ���ϱ�
		 	0.0 <= Math.random()*4 < 4.0
		 	97.0 <= Math.random()*4+97 < 101.0
		 	97 <= (int)(Math.random()*4+97) < 101
		 */

			/* for(int i=0;i<5;i++) {
		         double d=Math.random();
		         System.out.println(d);
		         
		         int n = (int)(Math.random()*100+1);
		         System.out.println("1~100 ���� ������ : "+n);
		      }//for
		      */

		      //1. ������ �̱� - ����
		      int answer = rnd();

		      Scanner sc = new Scanner(System.in);

		      //2. 4���� ��ȸ - �ݺ��� for
		      for(int i=0;i<4;i++) {
		         //3. ����ڷκ��� �Է� �ޱ�
		    	  System.out.println("1~100 ������ ���� �Է�!");
		    	  int num = sc.nextInt();

		    	  //4. ���� ó�� - �Է°��� ���� ��
		    	  //5. ��� ���
		    	  if(num==answer) {
		    		  System.out.println("�����Դϴ�.");
		    		  break;  
		    	  }

		    	  if(i==3) {
		    		  System.out.println("��! ^��^ ������ȸ��! ������ "+answer);
		    	  }else if(num>answer) {
		    		  System.out.println("�ʹ� Ů�ϴ�. ���� ���� �Է��ϼ���\n");
		    	  }else {
		    		  System.out.println("�� �� ū ���� �Է��ϼ���\n");
		    	  }


		      }//for

		   }

		   //1~100 ������ ������ ���� ���ϴ� �޼���
		   public static int rnd() {
		      int n = (int)(Math.random()*100+1);
		      return n;

		   }
}
