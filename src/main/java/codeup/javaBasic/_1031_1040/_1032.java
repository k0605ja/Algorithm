package codeup.javaBasic._1031_1040;
import java.util.Scanner;

/*
10진수를 입력받아 16진수(hexadecimal)로 출력해보자.

 */

public class _1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 불러오기
        int input = sc.nextInt();// 스캐너에 입력 받은 값 넣기

        System.out.printf("%x", input); // 16진수로 출력하기


    }
}
