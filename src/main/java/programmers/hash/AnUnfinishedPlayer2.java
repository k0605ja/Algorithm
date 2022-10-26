package programmers.hash;

/*
설명
참여자 completion, 완주자 participant 배열에서 완주하지 못한 선수의 이름만 return한다

제한사항
completion 길이는 participant 보다 1 작다

풀이 2. hashmap을 이용하는 방법
두 배열을 비교할 때 participant에 없는 completion 요소를 리턴한다.
String[] participant = {A, B, C}
String[] completion = {A, B}
일 때, participant에만 있는 C를 리턴한다.

 */

import java.util.HashMap;

public class AnUnfinishedPlayer2 {
    public String hashmap(String[] participant, String[] completion) {
        String answer = "";

        //1. participant hash map을 만든다
        //participant 요소를 검색하면서 key(이름)을 1씩 증가했을 때 중복(동명이인)은 value가 2임

        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);

        //2. completion hash map을 뺀다.
        //완주자들은 -1이 되지 않아서 value가 1임
        for (String player : completion)
            map.put(player, map.get(player) - 1);


        //3. value != 0을 찾는다.
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
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
