package codeup.javaBasic._1031_1040;
import java.util.Scanner;

/*
8진수 정수를 입력받아 10진수로 출력하기
 */

public class _1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 불러오기

        // Integer.parseInt(String s): 숫자형의 문자열을 값으로 받고 10진수의 Integer타입으로 변환해줌

        String input = sc.nextLine();// 숫자를 String으로 받는다. String이니까 nextLine으로 스캐너로 받은 값을 입력함

        int intOctal = Integer.parseInt(input, 8); // parseInt로  10진수로 출력함

        System.out.printf("%d", intOctal); // 10진수로 출력하기


    }
}
