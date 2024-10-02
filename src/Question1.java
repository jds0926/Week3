import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.print("짝수입니다.");
        }else if (a % 3 == 0){
            System.out.print("홀수입니다.");
        }

    }
}
