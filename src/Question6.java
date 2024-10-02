import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("생년을 입력하세요 : ");
        int n = sc.nextInt();

        if(n % 4 == 0 && n % 100 != 0 && n % 400 == 0){
            System.out.println("윤년입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}
