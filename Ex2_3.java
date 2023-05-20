package assignment;



public class Ex2_3 {

	public static void main(String[] args) {
		int x = 300; //변수 x 선언, 300 할당
        int y = 300; //변수 y 선언, 300 할당
        
        //각각 42, 38로 나눈 몫과 나머지 구하기
        int quotientX = x / 42; //x를 나눈 몫
        int remaindeX = x % 42; //x를 나눈 나머지
        int quotientY = y / 38; //y를 나눈 몫
        int remainderY = y % 38; //y를 나눈 나머지

        System.out.println("x = " + x); //x의 값 출력
        System.out.println("y = " + y); //y의 값 출력
        System.out.println("x를 42로 나눈 몫은 " + quotientX + ", 나머지는 " + remaindeX + " 입니다."); //몫과 나머지 출력
        System.out.println("y를 38로 나눈 몫은 " + quotientY + ", 나머지는 " + remainderY + " 입니다."); //몫과 나머지 출력
    } }
