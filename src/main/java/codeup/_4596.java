package codeup;

// 첫째 줄에 최대값을 출력하고, 둘째 줄에 최대값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다.
// 답이 여러개인 경우 그 중 하나만 출력한다.(최대값이 두 개이상 존재하는 경우)

public class _4596 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80},
        };

        // loop를 돌아야함 9 * 9

        int maxValue = arr[0][0];
        int[] maxIndex = {0, 0}; // i, j
        String location = "";

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; i <= 9; j++) {

                if (arr[i][j] > maxValue) {
                    int a = arr[i][j];
                    maxIndex[0] = i;
                    maxIndex[1] = j;
                    System.out.println();
                }
            }
        }
        System.out.println(maxValue);
        System.out.println(location);
    }
}

