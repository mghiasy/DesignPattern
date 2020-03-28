public class Application {
    public static void main(String[] args) {
        ProductComponent product1 = new Product("product1");
        ProductComponent product2 = new Product("product2");
        ProductComponent product3 = new Product("product3");

        ProductComponent productcategory1 = new Product("productcategory1");
        ProductComponent productcategory2 = new Product("productcategory2");
        ProductComponent productcategory3 = new Product("productcategory3");

        productcategory1.addCategory(product1);
        productcategory2.addCategory(product2);
        productcategory3.addCategory(product3);

        productcategory1.print();
        productcategory2.print();
        productcategory3.print();

    }
}
