package codeup;

/*
9개의 서로 다른 자연수가 주어질 때, 이들 중 최대값을 찾고 그 최대값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

입력: 첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100보다 작다

출력: 첫째 줄에 최대값을 출력하고, 둘째 줄에 최대값이 몇 번째 수인지를 출력한다.
 */

public class _2081 {
    public static int[] getMax(int[] arr) {
        // int maxValue = 0; arr이 모두 음수인 경우 0으로 하면 0이 max로 되는 ㅜㅁㄴ제

        int maxIndex = 0;
        int maxValue = arr[0]; //3
        for (int i = 0; i < arr.length; i++) { // arr을 받아서 최댓값을 int로 리턴
            System.out.println(arr[i]);
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i; // 최댓값 있는 인덱스
            }

        }
        // return maxValue;
        return new int[] {maxValue, maxIndex};
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 29, 38, 12, 57, 74, 40, 85, 61}; // 값들을 변수 묶음에 저장

        _2081 codeUp_2081 = new _2081(); // 인스턴스 생성
        // int result = CodeUp_2081.getMax(arr); // 최댓값 변수 생성
        int[] result = _2081.getMax(arr);

        // if (result == 85) 배열은 == 못 씀
        if (result[0] == 85) {
            System.out.println("테스트 통과");
        } else {
            System.out.println("테스트 실패. result: " + result);
        }

    }
}
