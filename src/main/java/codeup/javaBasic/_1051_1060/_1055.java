package codeup.javaBasic._1051_1060;
import java.util.Scanner;

/*
입력
1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.

출력
하나라도 참일 경우 1을 출력하고, 그 외의 경우에는 0을 출력한다.

입력 예시
1 1

출력 예시
1
 */

public class _1055 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 1 || b == 1) { // 입력한 a, b 값 중 1개라도 1이면 참
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
