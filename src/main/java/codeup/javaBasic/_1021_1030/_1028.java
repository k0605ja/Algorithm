package codeup.javaBasic._1021_1030;

import java.util.Scanner;

// 정수 1개를 입력받아 그대로 출력해보자.
// (단, 입력되는 정수의 범위는 0 ~ 4,294,967,295 이다.)

public class _1028 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong(); // int 보다 더 많은 값을 저장해야하므로 long을 사용했음
        System.out.println(num);
    }


}
