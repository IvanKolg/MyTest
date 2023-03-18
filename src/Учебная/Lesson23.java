package Учебная;

public class Lesson23 {
    public static void main(String[] args) {
//        String string1 = "Hello";
//        String string2 = " my";
//        String string3 = " friend";
//        String stringAll = string1 + string2 + string3;
//        System.out.println(stringAll);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString());





        Ber ber = new Ber();
        ber.Br();
    }
}
class Ber {
    public void Br() {
        System.out.println(1+2+3+4+5+"6");
    }
}
