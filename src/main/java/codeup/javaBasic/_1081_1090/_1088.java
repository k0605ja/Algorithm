package codeup.javaBasic._1081_1090;
import java.util.Scanner;

public class _1088 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0){
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
