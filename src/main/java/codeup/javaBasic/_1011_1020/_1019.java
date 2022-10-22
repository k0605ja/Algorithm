package codeup.javaBasic._1011_1020;
import java.util.*;

// 연월일 입력받아 그대로 출력하기
// 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
// %02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.

public class _1019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b[] = a.split("[.]");
        // split()은 문자열을 자르고 배열로 리턴하는 함수
        // split을 사용해서 "."으로 구분해서 배열 b에 저장함
        // .을 기준으로 나눌 때 (split)은 [.]을 사용함

        int year = Integer.parseInt(b[0]); // Integer.parseInt로 정수형으로 변환함
        // parseInt()는 문자열 String 타입의 숫자를 int타입으로 변환해주는 함수임
        int month = Integer.parseInt(b[1]);
        int day = Integer.parseInt(b[2]);

        System.out.printf("%04d.%02d.%02d",year, month, day);


    }
}
