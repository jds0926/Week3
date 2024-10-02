import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수학 점수 입력 : ");
        int mt = sc.nextInt();
        System.out.print("과학 점수 입력 : ");
        int SC = sc.nextInt();
        System.out.print("국어 점수 입력 : ");
        int kr = sc.nextInt();
        System.out.print("영어 점수 입력 : ");
        int en = sc.nextInt();

        double[] arr = {mt, SC, kr, en};

        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        double avg = sum / arr.length;

        System.out.println(avg);
        
        if (avg >= 60){
            System.out.println("합격입니다.");
        }else{
            System.out.print("불합격입니다.");
        }

    }
}