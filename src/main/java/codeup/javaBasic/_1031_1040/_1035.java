package codeup.javaBasic._1031_1040;
/*
16진수 정수를 입력받아 8진수로 출력하기
 */

import java.util.Scanner;

public class _1035 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in); // 스캐너 불러오기
    int value = sc.nextInt(16); // 16진수로 바꾸기
    System.out.printf("%o",value); // 8진수로 출력
        
    }
}

