package codeup.javaBasic._1031_1040;
import java.util.Scanner;

/*
10진수를 입력받아 8진수(octal)로 출력해보자.

참고
%d(10진수 형태)로 입력받고,
%o를 사용해 출력하면 8진수(octal)로 출력된다.
 */

public class _1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 불러오기
        int input = sc.nextInt();// 스캐너에 입력 받은 값 넣기

        System.out.printf("%o", input);


    }
}
