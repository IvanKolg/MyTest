package Ujas;

public class Oblasty {
    VoenChasty voenChasty;
    public Oblasty(VoenChasty voenChasty) {
        this.voenChasty = voenChasty;
    }
    public void buildGorod() {
        openVoenChasty();
        voenChasty.nabor();
    }
    public void openVoenChasty() {
        voenChasty.pushMyaso();
    }
}
