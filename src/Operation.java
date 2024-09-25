public class Operation{

    public static void main(String[] age){

        int result = (5 + 3) * 2; //16

        int x = 5;
        int y = ++x;

        System.out.println("y = "+ y); //6

        int z = ++x;
        System.out.println("z = "+ z); //7

        boolean flag = false;
        boolean notflag =!flag; //flag가 false 일 때, notflag는 true

        System.out.println("flag = "+notflag); //true
        boolean flag2 =!notflag;
        System.out.println("flag2 = "+flag2); //false

        int a = 10;
        int b = 3;
        int product = a * b; //곱셈, 결과 : 30
        int quotient = a / b; //나눗셈, 결과 : 3
        int remainder = a % b; //나머지, 결과 : 1

        int bit1 = 4 << 2; // 왼쪽으로 2비트 이동 , 결과 16
        int bit2 = 16 >> 2; // 오른쪽으로 2비트 이동 , 결과 4

        boolean isLess = (5 < 10);  // 결과: true
        boolean isGreaterOrEqual = (10 >= 10);  // 결과: true

        boolean isEqual = (5 == 5);  // 결과: true
        boolean isNotEqual = (5 != 3);  // 결과: true

        boolean andand = (true && false);  // AND 연산, 결과: false
        boolean or0r = (true || false);  // OR 연산, 결과: true

        int variable = ( a > b ) ? a - b : b - a;  // (a>b) 가 treu 면 a-b , false 면 b-a
        int xx = 5;


    }

}
