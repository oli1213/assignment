import java.util.Scanner;

public class Ex2_4 {

	public static void main(String[] args) {
	    int price; //변수 price 선언
	    int discount; //변수 discount 선언
	    int sale; //변수 sale 선언
	    
	    //Scanner 객체 생성
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("상품 가격을 입력하세요: "); //상품 가격 입력받기
	    price = scanner.nextInt();    
	    System.out.print("할인율을 입력하세요(%): "); //할인율 입력받기
	    discount = scanner.nextInt();
	    
	    //세일 가격 계산
	    sale = price * (100 - discount) / 100;
	    
	    System.out.println("상품 가격: " + price); //상품 가격 출력
	    System.out.println("할인율: " + discount + "%"); //할인율 출력
	    System.out.println("세일 가격: " + sale); //세일 가격 출력
	    
	    scanner.close(); //Scanner 종료
	} }
