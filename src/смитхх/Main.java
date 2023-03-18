package смитхх;

public class Main{
    public static void main(String[] args) {
        Jasper jas = new Jasper();
        jas.say();
        jas.fight(true, 4);
        System.out.println(jas.fight(true,6));
        Terminator ter = new Terminator("5S",23,"3000$");
        ter.say();
        System.out.println(ter.fight(false,9));
    }

}
