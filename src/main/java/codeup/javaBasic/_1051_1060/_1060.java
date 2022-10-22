package codeup.javaBasic._1051_1060;
import java.util.Scanner;

/*
비트단위로 AND 하여 출력하기
입력된 정수 두 개를 비트단위로 and 연산한 후 그 결과를 정수로 출력해보자.
 */

public class _1060 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a & b); // 비트단위(bitwise)연산자 &를 사용

    }
}
