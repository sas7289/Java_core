public class Main {
    public static void main(String[] args) {
        spiral(5,5);
    }


    public static void spiral (int a, int b){
        int[][] result = new int[a][b];
        int height = a, width = b;
        int num = 0;
        int iter = 0;
        while (height != 0 && width != 0){
            for (int i = 0; i < height - 1; i++) {
                result[i + iter][iter] = num;
                num++;
            }
            for (int i = 0; i < width - 1; i++) {
                result[height - 1][i + 1] = num;
                num++;
            }
            for (int i = height - 2; i >= 0 + iter; i--) {
                result[i][width - 1] = num;
                num++;
            }
            for (int i = height - 2; i >= 1 + iter ; i--) {
                result[iter][i] = num;
                num++;
            }
            height--;
            width--;
            iter++;
        }
    }
}
