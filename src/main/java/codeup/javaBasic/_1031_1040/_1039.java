package codeup.javaBasic._1031_1040;
import java.util.Scanner;

// 정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
// 입력되는 정수는 -2147483648 ~ +2147483648 이다.

public class _1039 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        long first = sc.nextLong();
        long second = sc.nextLong();
        long result = first + second;

        System.out.println(result);


    }
}
