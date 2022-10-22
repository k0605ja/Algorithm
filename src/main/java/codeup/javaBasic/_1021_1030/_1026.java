package codeup.javaBasic._1021_1030;
import java.util.Scanner;

/*
시분초 입력받아 분만 출력하기
(입력: 17:35:21 / 출력: 35)
 */

public class _1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] result = input.split(":"); // :로 구분하기

        System.out.println(Integer.parseInt(result[1])); // 정수를 인덱스 1만 split하여 출력하기


    }
}
