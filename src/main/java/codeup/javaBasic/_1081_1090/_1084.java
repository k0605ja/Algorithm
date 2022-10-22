package codeup.javaBasic._1081_1090;
import java.util.Scanner;

public class _1084 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] num = input.split(" ");
        int r = Integer.parseInt(num[0]);
        int g = Integer.parseInt(num[1]);
        int b = Integer.parseInt(num[2]);
        int cnt = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < g; j++) {
                for(int k = 0; k < b; k++) {
                    System.out.printf("%d %d %d%n", i, j, k);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }

}