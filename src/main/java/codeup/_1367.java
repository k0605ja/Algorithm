package codeup;

/*
평행사변형 출력하기

000****
00****
0****
****

외부루프 행=4
i문으로 짠다 4번 반복되게 1씩 증가됨

내부루프 열
0과 * 2개 요소를 찍으니까 나눠서 생각하자

1. 0는 j문으로 짠다
3부터 0까지 4번 반복되고 1씩 감소한다

2. *은 k문으로 짠다
4부터 4까지 4번 반복되고 증감 없다 그냥 프린트하면됨
 */

public class _1367 {
    public static void main (String[]args) {
        // 000
        // 00
        // 0
        for(int i=1; i <= 4; i++){ // 0이 3부터 0까지 찍혀야함
            for(int j = 4; j >= 4; j--){
                System.out.print(0);
            }
//            for(int k=1; ; k++) { // **** 찍으면 됨
//                System.out.println("****");
//            }
            System.out.println();

        }
    }
}
