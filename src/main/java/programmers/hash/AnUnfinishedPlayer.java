package programmers.hash;

/*
설명
참여자 completion, 완주자 participant 배열에서 완주하지 못한 선수의 이름만 return한다

제한사항
completion 길이는 participant 보다 1 작다. 즉, participant만 찾는 문제

풀이 1. sort/loop을 이용하는 방법
두 배열이 일치하는지 비교하고 일치하지 않는 값을 리턴한다
String[] participant = {A, B, C}
String[] completion = {A, B}
일 때, participant에만 있는 C를 리턴한다.
 */

import java.util.Arrays;

public class AnUnfinishedPlayer {
    public String sorting(String[] participant, String[] completion) {
        String answer = "";

        // 1. 두 배열 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        //2. 두 배열이 다를 때까지 찾는다
        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i]))
                answer = participant[i];
                break;
        }
        return answer;
    }


    public static void main(String[] args) {
        String[] participant = {"leo,", "kiki", "eden"};
        String[] completion = {"leo", "kiki"};
        AnUnfinishedPlayer anUnfinishedPlayer = new AnUnfinishedPlayer();
        System.out.println(anUnfinishedPlayer.sorting(participant, completion));
    }
} //class end
