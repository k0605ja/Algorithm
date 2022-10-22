package codeup;

import java.util.Scanner;

// 홀수 짝수 구별하기

public class _1156 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자을 입력하세요: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }
}
