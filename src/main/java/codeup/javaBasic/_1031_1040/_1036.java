package codeup.javaBasic._1031_1040;
import java.util.Scanner;

/*
영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
 */

public class _1036 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // charAt()은 Scanner로 스캔받은 String 문자열 중에 원하는 인덱스문자를 char타입으로 저장할 수 있게 한다
        // 문자를 char로 변환해서 저장하고 int로 형변환핵서 출력하면 아스키코드에 따라 숫자로 자동 변환됨

        char value = sc.nextLine().charAt(0);
        int input = (int) value; // char -> int로 형변환
        System.out.println(input);


    }
}
