package codeup.javaBasic._1081_1090;
import java.util.Scanner;

// 주사위 2개를 던졌을 때 나올 수 있는 모든 경우의 수

public class _1081 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= y; j++){
                System.out.println(i +","+ j);
            }
        }
    }
}
