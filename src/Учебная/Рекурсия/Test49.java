package Учебная.Рекурсия;

public class Test49 {
    public static void main(String[] args) {
        System.out.println(fac(4));
        System.out.println(factorial(3));
        System.out.println(fac(5));
    }

    // fac(4)
    // 4 * fac(3)
    // 3 * fac(2)
    // 2 * fac(1)
    // fac(1) = return 1;

    private static int fac(int n) {
        if (n == 1)
            return 1;

        return n * fac(n - 1);
    }

    public static int factorial(int x) {
        if (x == 0) return 1;
        System.out.println("x = " + x);
        x = x * (factorial(x - 1));
        System.out.println("Проход по стеку: x = " + x);
        return x;
    }












//    counter(3) -> counter(2) -> counter(1)
//    private static void counter(int n) {
//        if (n == 0)
//            return;
//
//        System.out.println(n);
//
//        counter(n - 1); // 3, 2, 1
//    }
}
