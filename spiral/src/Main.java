public class Main {
    public static void main(String[] args) {
        spiral(18,15);
    }


    public static void spiral (int a, int b){
        int[][] result = new int[a][b];
        int height = a, width = b;
        int num = 1;
        int iter = 0;
        while (height != 0 && width != 0){
            int end = a * b;
            for (int i = iter; i < height; i++) {
                result[i][iter] = num;
                num++;
            }
            for (int i = iter + 1; i < width; i++) {
                result[height - 1][i] = num;
                num++;
            }
            if (num > end){
                break;
            }
            for (int i = height - 2; i >= iter; i--) {
                result[i][width - 1] = num;
                num++;
            }
            for (int i = width - 2; i >= 1 + iter ; i--) {
                result[iter][i] = num;
                num++;
            }
            height--;
            width--;
            iter++;
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.format("%4d", result[i][j]);
            }
            System.out.println();
        }
    }
}
