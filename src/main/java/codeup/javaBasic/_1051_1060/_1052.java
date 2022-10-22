package codeup.javaBasic._1051_1060;
import java.util.Scanner;
// a와 b가 다른 경우 1을, 그렇지 않은 경우 0을 출력한다.

public class _1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a != b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
