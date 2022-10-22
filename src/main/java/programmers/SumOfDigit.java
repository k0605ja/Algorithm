package programmers;

/*
프로그래머스 자릿수 더하기

자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return하는 solution 함수를 만들어주세요.
( N = 123이면 1 + 2 + 3 = 6을 return )
 */

public class SumOfDigit {

        public int solution(int n) {
            int answer = 0;

            // 자릿수를 몰라서 for문을 쓸 수 없어서 while문을 씀
            while (n > 0) {
                answer += n % 10;
                n = n / 10;

                // i = 0
                System.out.println(n / 10); // 1234/10 = 몫 123
                System.out.println(n % 10); // 나머지 4

                // i = 1
                System.out.println(n / 10); // 123/10 = 몫 12
                System.out.println(n % 10); // 나머지 3

                // i = 2
                System.out.println(n / 10); // 12/10 = 몫 1
                System.out.println(n % 10); // 나머지 2

                // i = 3
                System.out.println(n / 10); // 1/10 = 몫 0
                System.out.println(n % 10); // 나머지 1
            }
            return answer;
        }

        public static void main(String[] args) {
        SumOfDigit sod = new SumOfDigit();
        int result = sod.solution(1234);

        if(result == 10) {
            System.out.println("테스트 통과했습니다");
        }else {
            System.out.printf("테스트 실패 result: %d \n, result");
        }
    }

}


