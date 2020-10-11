public class Lesson_2 {
    public static void main(String[] args) {
        //Задание 1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0){
                arr1[i] = 1;
            }
            else {
                arr1[i] = 0;
            }
        }

        //Задание 2
        int[] arr2 = new int[8];
        int temp = 1;
        for (int i = 0; i < 8; i++){
            arr2[i] = temp * i;
            temp *= 3;
        }

        //Задание 3
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6){
                arr3[i] *= 2;
            }
        }

        //Задание 4
        int[][] arr4 = new int[7][7];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[arr4.length- 1 - i][i] = 1;
        }

        //Задание 5
        int[] arr5 = { 9,8,7,6,5,4,3,2,1};
        for (int i = 0; i < arr5.length/2; i++){
            for (int j = 0; j < arr5.length - 1 - i; j++) {
                if (arr5[j] > arr5[j+1]){
                    int tempor = arr5[j+1];
                    arr5[j+1] = arr5[j];
                    arr5[j] = tempor;
                }
                if (arr5[arr5.length - 1 - i - j] < arr5[arr5.length - 2 - i - j]){
                    int tempor = arr5[arr5.length - 2 - i - j];
                    arr5[arr5.length - 2 - i - j] = arr5[arr5.length - 1 - i - j];
                    arr5[arr5.length - 1 - i - j] = tempor;
                }
            }
        }

        //Задание 6
        int[] arr6 = {2, 2, 2, 1, 2, 2, 10};
        checkBalance(arr6);
        shift(arr6, -5);

    }



    //Задание 6
    static boolean checkBalance (int[] arr){
        boolean result = false;
        int edge = arr.length - 3;
        for (int i = 0; i < edge; i++){
            int sumLeft = 0, sumRight = 0;
            for (int j = 0; j < 2 + i; j++){
                sumLeft += arr[j];
            }
            for (int j = 2 + i; j < arr.length; j++) {
                sumRight += arr[j];
            }
            if (sumLeft == sumRight) {
                result = true;
                break;
            }
        }
        return result;
    }

    //Задание 7

    static void shift (int[] arr, int n){
        if (n > 0){
            for (int i = 0; i < n; i++) {
                stepRight(arr);
            }
        }
        else {
            n = Math.abs(n);
            for (int i = 0; i < n; i++) {
                stepLeft(arr);
            }
        }
    }

    static void stepRight (int[] arr){
        int temp = arr[arr.length - 1];
        int position = arr.length - 1;
        for (int i = position; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
    static void stepLeft (int[] arr){
        int temp = arr[0];
        int position = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[position] = temp;
    }
}
