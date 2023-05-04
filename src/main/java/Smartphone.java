public class Smartphone extends Product {
    private String vendor;

    public Smartphone(int id, String name, int price, String vender) {
        super(id, name, price);
        this.vendor = vender;
    }

    public String getVender() {
        return vendor;
    }
}
