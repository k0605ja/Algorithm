package codeup.javaBasic._1021_1030;
import java.util.Scanner;

/*
다섯 자리로 이루어진 1개의 정수를 입력받는다.

입력: 75254
출력:
[70000]
[5000]
[200]
[50]
[4]
 */

public class _1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("");

        // parselnt 메서드는 () String 타입의 숫자를 int타입으로 변환해줌
        System.out.println("[" + Integer.parseInt(input[0]) * 10000 + "]");
        System.out.println("[" + Integer.parseInt(input[1]) * 1000 + "]");
        System.out.println("[" + Integer.parseInt(input[2]) * 100 + "]");
        System.out.println("[" + Integer.parseInt(input[3]) * 10 + "]");
        System.out.println("[" + Integer.parseInt(input[4]) + "]");

    }
}
