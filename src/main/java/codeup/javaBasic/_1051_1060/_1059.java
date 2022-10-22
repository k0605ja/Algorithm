package codeup.javaBasic._1051_1060;
import java.util.Scanner;

/*
비트단위로 NOT하여 출력하기
비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력한다.
입력 예시
2

출력 예시
-3
 */
public class _1059 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.printf("%d", ~a);
        }
    }
