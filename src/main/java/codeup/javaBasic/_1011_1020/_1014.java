package codeup.javaBasic._1011_1020;
import java.util.*;

// 2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.

public class _1014 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next(); // next()는 공백 이전의 데이터만 출력하기 때문에 데이터타입이 String(문자열)이어도 문자만 출력된다.
        String b = sc.next();

        System.out.print(b + " "); // 1개 값 문자열 변환
        System.out.print(a); // 자동 변환

    }
}