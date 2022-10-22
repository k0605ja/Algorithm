package codeup.javaBasic._1051_1060;
import java.util.Scanner;
// 입력된 값이 0이면 1, 1이면 0을 출력한다.

public class _1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a == 0) {
            System.out.println(1);
        } else if (a == 1) {
            System.out.println(0);
        }
    }
}
