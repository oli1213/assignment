

import java.io.*;

public class f3_pr_5 {
	public static void main(String[] args) throws IOException{ 
	  int[] num; //변수 num 선언
	  int temp =  0; //변수 temp 선언
	  num = new int[5];
	  
	  //InputStreamReader, BufferedReader 객체 생성
	  InputStreamReader isr = new InputStreamReader(System.in); 
	  BufferedReader inbr = new BufferedReader(isr); 
	  
	  //5개의 숫자 입력받기
	  for(int i=0;i<5;i++){
		  System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
		  num[i]=Integer.parseInt(inbr.readLine());
	  }
	  //입력받은 수 중 최대값 구하기
	  for(int i=0;i<5;i++){ 
		  if(temp < num[i]) {
			  temp = num[i];
			  }
		  }
	  //결과 출력
	  System.out.println("****최대값 구하기 ****");
	  for(int i=0;i<5;i++){
		  System.out.println((i+1)+"번째 입력 값 : "+num[i]); //입력받은 값 출력
	  }
	  System.out.println("최  대  값  :  "+temp); //최대값 temp 출력
   }  }
