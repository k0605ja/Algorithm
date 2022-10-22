package codeup.javaBasic._1021_1030;
import java.util.Scanner;

/*
년월일(yyyy.mm.dd)를 입력받아, 일월년(dd-mm-yyyy)로 출력해보자.
 */

public class _1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value[] = sc.next().split("[.]"); // 배열을 .을 기준으로 나눈다.

        System.out.println(value[2] + "-" + value[1] + "-" + value[0]);

    }
}
