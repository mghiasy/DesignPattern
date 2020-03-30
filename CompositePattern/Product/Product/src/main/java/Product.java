public class Product extends ProductComponent {

    private int productNumber;
    private double price;
    public Product(String name) {
        super(name);
    }

    public void print() {
        System.out.println(super.name);
    }

//    public void addCategory(ProductComponent component) {
//
//    }


}
