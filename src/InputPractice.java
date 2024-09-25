import java.util.Scanner;

public class InputPractice {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("첫번째 숫자 입력 : ");
            int a = sc.nextInt();

            System.out.print("두번째 숫자 입력 : ");
            int b = sc.nextInt();

            System.out.print("연산자 선택 (+, -, %, x) : ");
            String c = sc.next();

            System.out.println("결과 : " + a + " " + c + " " + b);
            sc.close();
        }
}

