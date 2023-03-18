public class LoopWhileThree {public static void main(String[] arg) {
    double count = 5;

    double i = 0;
    while (i < count) {
        int k = 0;
        while (k < i + 1) {
            System.out.print("*");
            k++;
        }
        System.out.println();
        i++;
    }
}
}
