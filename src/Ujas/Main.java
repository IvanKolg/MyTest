package Ujas;

public class Main {
    public static void main(String[] args) {

        Soldat bobee = new Soldat("Боби", 329);
        System.out.println("Имя бойца: " + bobee.getName());
        System.out.println("Зрение бойца: " + bobee.getVision());

        VoenChasty voenChasty = new VoenChasty();
        voenChasty.setSoldat(new Soldat("Stone",9999));

        Oblasty oblasty = new Oblasty(voenChasty);
        oblasty.buildGorod();
    }
}
