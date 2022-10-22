package codeup.javaBasic._1081_1090;

import java.util.Scanner;

// 369 게임
// 1~10까지 수 중에 3, 6, 9만 X 표시하기

public class _1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.print("X" + " ");
            } else {
                System.out.print(i+" ");
            }
        }
    }
}
