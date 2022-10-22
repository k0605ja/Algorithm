package codeup.javaBasic._1051_1060;

import java.util.Scanner;
/*
b가 a보다 크거나 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.

출력
b가 a보다 크거나 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
 */

public class _1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b >= a) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
