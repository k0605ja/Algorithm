package codeup.javaBasic._1021_1030;
import java.util.Scanner;

// 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
// 1.414213

// 출력 결과
// 1
// 414213

public class _1023 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine(); // 문자열로 받는다
        String[] b = a.split("\\."); // String.split으로 \\으로 "."를 자름

        // split 메서드로 구분한다

        System.out.println(b[0]); // 1
        System.out.println(b[1]); // 414213

    }
}
