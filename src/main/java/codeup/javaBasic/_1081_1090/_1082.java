package codeup.javaBasic._1081_1090;
import java.util.Scanner;

public class _1082 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    // s의 문자열을 16진수로 변환
    int num = Integer.parseInt(s,16);

        for(int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", num, i, num * i);
        }
    }
}
