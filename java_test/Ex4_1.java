import java.util.*;

public class Ex4_1 {
	public static void main(String[] args) {
		int r[] = new int[10]; //배열 r 선언
		//합계, 평균 계산을 위한 변수 선언
		int number;
		int avg, sum = 0;
		
		//Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		//정수를 입력받아 r에 저장
		System.out.print("정수 10개를 입력하세요! : ");
		for(int x=0; x<r.length; x++) { 
			r[x] = scan.nextInt(); 
			}
		//입력받은 r의 값 출력
		System.out.print("입력 데이터 값 : ");
		for(int x=0; x<r.length; x++) { 
			System.out.print(r[x] + "..");
			}
		//r을 오름차순으로 정렬
		System.out.println();
		for(int x=0; x<r.length; x++) {
			for(int y=x+1; y<r.length; y++)
			{
				if(r[x] > r[y] ) { 
					number = r[x]; 
					r[x] = r[y]; 	
					r[y] = number;
    	} }
    	}
		//정렬한 r의 값 출력
		System.out.print("오름차순 데이터 값 : ");
		for (int x = 0; x < r.length; x++) {
        System.out.print(r[x] + "..");
        sum += r[x]; //r의 합계 계산
        }
		avg = sum / r.length; //r의 평균 계산
    
		System.out.println();
		System.out.println("합계 : " + sum); //합계 출력
		System.out.println("평균 : " + avg); //평균 출력
		
		scan.close(); //Scanner 종료
	} }
