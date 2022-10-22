package codeup.javaBasic._1011_1020;
import java.util.*;

// 실수 1개 입력받아 소수점 셋째자리에서 반올림하여 둘째 자리까지 출력하기

public class _1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();

        System.out.printf("%.2f", f); // %.2f는 소수점 이하 셋째자리에서 반올림해서 소수점 이하 둘째자리까리 출력함

    }
}
