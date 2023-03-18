package смитхх;

public class Jasper implements Robot{
    private String name;
    private int age;
    private double iD;
    @Override
    public void say() {
        System.out.println("Hi");
    }
    @Override
    public String fight(boolean strong, int winStreak) {
        switch (winStreak) {
            case 2:
                System.out.println("Неплохо");
                break;
            case 4:
                System.out.println("Норм");
                break;
            case 6:
                System.out.println("Супер");
                break;
            default:
                System.out.println("Не оч(");
                break;
        }
        return "false";
    }

    public Jasper(){
        System.out.println("Ya nihuya ne ponyal kak eto rabotaet");
    }
}
