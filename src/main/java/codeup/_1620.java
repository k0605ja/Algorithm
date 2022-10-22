package codeup;
import java.util.Scanner;

/*
자릿수 합 구하기
어떤 숫자가 입력되면 그 숫자가 몇 자릿수 숫자인지 알아내는 프로그램을 작성하시오.

예)
7   ----> 1   (1자릿수)
10  ----> 2   (2자릿수)
4322 ----> 4   (4자릿수)
 */

public class _1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}