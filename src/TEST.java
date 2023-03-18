import java.util.Arrays;

public class TEST {
//    public static void main(String[] args) {
//        int[][] arr = {{1, 1, 0, 0, 0, 0}, {1, 1, 0, 0, 0, 0}, {1, 1, 0, 0, 0, 0}, {1, 1, 0, 0, 0, 0}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int k = 0; k < arr[i].length; k++) {
//                if ( k == 0 || k == 1) {
//                    arr[i][k] = 0;
//                } else if ( k == 2 || k == 3) {
//                    arr[i][k] = 1;
//                } else {
//                    arr[i][k] = 2;
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));
//    }

    public static void main(String[] args) {
        int[] arr =  {1, 9, 4, 4, 0, 5, 7, 3, 2, 6, 6};
        int[] chot = new int[10];
        int[] nechot = new int[10];
        int counter = 0;
        int nechotCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (0 != arr[i] %2) {
                chot[counter] = arr[i];
                counter++;
            } else {
                nechot[nechotCounter] = arr[i];
                nechotCounter++;
            }
        }
        System.out.println(Arrays.toString(chot));
        System.out.println(Arrays.toString(nechot));
    }




}
