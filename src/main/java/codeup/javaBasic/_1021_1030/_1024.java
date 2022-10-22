package codeup.javaBasic._1021_1030;
import java.util.Scanner;

// 입력: Boy
// 출력: 'B'
//      'o'
//      'y'

public class _1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value = sc.next();
        String[] data = value.split(""); // split 메서드로 구분한다

        for (int i = 0; i < data.length; i++) {
            System.out.println("\'" + data[i] + "\'");

        }
    }
}
