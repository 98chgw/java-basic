package basic.array;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
//        2차원배열
//        배열 안에 배열이 존재하는 형태의 2차원 배열
//        실제 배열에는 배열의 주소값이 들어가게 됩니다.


//        int[] arr = {1, 2, 3};
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12, 13, 14}
        };

        System.out.println(arr.length); //4
//        System.out.println("arr[0] = " + arr[0]); //주소값 발생
        System.out.println("arr = " + Arrays.toString(arr[0]));
        System.out.println("arr = " + Arrays.toString(arr[1]));
        System.out.println("arr = " + Arrays.toString(arr[2]));

        System.out.println("arr[1][2] = " + arr[1][2]); //1번에 2번
        System.out.println("arr[2][0] = " + arr[2][0]); //1번에 2번
        
        //2차원 배열 내부의 배열 요소들을 한 눈에 확인할 수 있는 메서드
        System.out.println(Arrays.deepToString(arr)); //배열 내부 모든 것 출력

        System.out.println("--------------------------------------------------");
        //빈 2차원 배열 만들기
        int[][] arr2 = new int[3][4]; //배열 덩어리 3개에 int값이 4개 들어감
        System.out.println(Arrays.deepToString(arr2));

        //대입
        arr2[1][2] = 50;
        arr2[2][1] = 70;
        
        for(int[] array : arr2) {  // 배열안에 배열을 가지고 있기 때문에 int[]로 선언
            for(int n : array) {
                System.out.print(n + " ");
            }
            System.out.println();  //단순 줄 개행
        }
        
    }
}
