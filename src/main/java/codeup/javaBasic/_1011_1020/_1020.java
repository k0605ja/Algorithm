package codeup.javaBasic._1011_1020;
import java.util.*;

// 주민번호 입력받아 형태 바꿔 출력하기
// String.replace()로 문자열 치환하기

public class _1020 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        a = a.replace("-", ""); // replace([기존문자],[바꿀문자])
        System.out.println(a);

    }
}
