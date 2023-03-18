public class ContinueFirstLoopForWithIfOne {public static void main(String[] arg) {
    int count = 10;

    // Внешний цикл
    for(int i=0; i < count; i++) {
        // Внутренний цикл для печати одной строки
        for(int k=0; k < count; k++) {
            // Вот наше сложное условие
            if( k==count-1 ||k ==  -i+4 || i==count-1) {
                System.out.print("1");
            } else {
                System.out.print(" ");
            }
        }
        // Переход на следующую строку
        System.out.println();
    }

}
}
