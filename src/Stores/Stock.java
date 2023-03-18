package Stores;

public class Stock {
    // tv
    // utug
    // holodos
    int[] plApple = {7,15,3};
    //monitor
    //compucter
    //keyboard
    int[] plSamsung = {5,10,9};
    public void send(int quantity, String nameShop, String nameItem) {

        if (nameShop.equals("Samsung")) {
            switch (nameItem) {
                case "monitor":
                    gide(quantity,0, nameShop);
                    break;
                case "compucter":
                    gide(quantity,1, nameShop);
                    break;
                case "keyboard":
                    gide(quantity,2, nameShop);
                    break;
                default:
                    System.out.println("Ты ошибся товаром, друг");
            }
        } else if (nameShop.equals("Apple")) {
            switch (nameItem) {
                case "tv":
                    gide(quantity,0, nameShop);
                    break;
                case "utug":
                    gide(quantity,1, nameShop);
                    break;
                case "holodos":
                    gide(quantity,2, nameShop);
                    break;
                default:
                    System.out.println("Ты ошибся товаром, друг");
            }
        } else {
            System.out.println("ТЫ куда звОнишь? По какому номеру звОнишь, сынок ёбаный?!");
        }
    }

    private void gide(int ou, int nomer, String nam) {
        int[] list = nam.equals("Apple") ? plApple : plSamsung;
        if (ou > list[nomer]) {
            System.out.println("У нас только " + list[nomer]);
        } else {
            list[nomer] = list[nomer] - ou;
            System.out.println("У нас  осталось " + list[nomer]);
        }
    }
}
