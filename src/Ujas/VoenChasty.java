package Ujas;

public class VoenChasty {
    Soldat soldat;
    public void nabor() {
        if (soldat.vision > 500) {
            System.out.println("Иди домой, сынок");
        } else {
            System.out.println("Лопату взял!");
        }
    }
    public void pushMyaso() {
        System.out.println("Help me");
    }
    public void setSoldat(Soldat soldat) {
        this.soldat = soldat;
    }
}
