package codeup.javaBasic._1051_1060;
import java.util.Scanner;

/*
두 개의 참(1) 또는 거짓(0)이 입력됨
둘 다 거짓일 경우(0 0)에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.

입력 예시
0 1

출력 예시
0
 */
public class _1058 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();

            if ((a == 0) && (b == 0)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
