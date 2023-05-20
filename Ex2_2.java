import java.util.Scanner;

public class Ex2_2 {
	
    public static void main(String[] args) {
        int a, b; //변수 a, b 선언
        
        //Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        //두 개의 정수 입력받기
        System.out.print("두 개의 정수를 입력하시오: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("a + b = " + (a + b)); //덧셈을 계산하고 결과 출력
        System.out.println("a - b = " + (a - b)); //뺄셈을 계산하고 결과 출력
        System.out.println("a * b = " + (a * b)); //곱셈을 계산하고 결과 출력
        System.out.println("a / b = " + (a / b)); //나눗셈을 계산하고 결과 출력
        System.out.println("a % b = " + (a % b)); //나머지를 계산하고 결과 출력
        
	    scanner.close(); //Scanner 종료

    } }
