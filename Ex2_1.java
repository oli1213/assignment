import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2_1 {

	public static void main(String[] args) throws IOException {
        String name; //이름을 저장할 변수 선언
        int number, score; //학번과 토플점수를 저장할 변수 선언

        // BufferedReader 객체 생성
        BufferedReader BufferReader = new BufferedReader(new InputStreamReader(System.in));
        
        //이름, 학번, 토플점수 입력받기
        System.out.print("이름, 학번, 토플점수를 입력하세요! : ");
        name = BufferReader.readLine();
        number = Integer.parseInt(BufferReader.readLine());
        score = Integer.parseInt(BufferReader.readLine());
        
        // 입력받은 이름, 학번, 토플점수 출력
        System.out.println("나의 이름은 " + name + "입니다.");
        System.out.println("학번은 " + number + "입니다.");
        System.out.println("그리고 토플점수는 " + score + "점 입니다.");
    } }
