public class Product {
    private String name; // имя по каталогу
    private String description; // описание
    private double price; // цена одной штуки
    private int quantity; //количество
    private double sumByQuantity; // общая стоимость по количеству штук

    /*конструктор*/
    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.sumByQuantity = price * quantity;
    }


    public void setProce(double pr) {//установить прайс
        this.price = pr;
    }

    public double getPrice() // вернуть прайс
    {
        return price;
    }

    public String toString() // показать информацию
    {
        return String.format("%s %s %.2f %d ",
                name, description, price, quantity);
    }

    public void countSumm() { // посчитать стоимость по колличеству

        this.sumByQuantity = this.quantity * this.price;

        this.sumByQuantity = Math.rint(100.0 * this.sumByQuantity) / 100.0; // округление до сотых
    }


    public double getCurrentSum() { // вернуть текущую стоимость
        return this.sumByQuantity;
    }

    public static void main(String[] arg) {

        Product pr = new Product("булка, ", "булка с маслом, ", 5.2, 3);

        String str = pr.toString();
        System.out.println(str);

        // посчитать сумму
        pr.countSumm();

        System.out.println("Cумма = " + pr.getCurrentSum());
    }
}
