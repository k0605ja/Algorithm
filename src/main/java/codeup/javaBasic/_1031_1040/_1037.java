package codeup.javaBasic._1031_1040;
import java.util.Scanner;

/*
10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
단, 0 ~ 255 범위의 정수만 입력된다.
 */

public class _1037 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    System.out.println((char) input); // 문자로 형변환
    }
}
