package codeup.javaBasic._1051_1060;
import java.util.Scanner;

/*
참/거짓이 서로 다를 때에만 참 출력하기
입력
1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.

출력
참/거짓이 서로 다를 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.

입력 예시
1 1

출력 예시
0
 */

public class _1056 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a != b) { // 입력한 a, b 값 중 1개라도 1이면 참. 즉, 입력되는 수는 0과 1 밖에 없으므로 두 수가 다른 경우를 조건으로 둠
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
