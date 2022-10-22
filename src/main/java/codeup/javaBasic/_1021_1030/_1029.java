package codeup.javaBasic._1021_1030;

// 소수점 아래 숫자가 11개 이하인 실수 1개가 입력된다. (단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.)

import java.util.Scanner;

public class _1029 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            double input = sc.nextDouble(); // double을 입력 받는다
            System.out.printf("%.11f, &d"); // 실수를 소수점 이하 11자리까지 반올림해서 출력한다.

        }
    }
