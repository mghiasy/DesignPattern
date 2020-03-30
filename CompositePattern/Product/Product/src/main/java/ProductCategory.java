import jdk.jfr.Category;

import java.util.ArrayList;
import java.util.Collection;

public class ProductCategory extends ProductComponent {
    //List of the paret class
    protected Collection<ProductComponent> productComponents= new ArrayList<ProductComponent>();
    public void print() {
        for (ProductComponent p : productComponents){
            System.out.println(p.getName());
        }
    }

    public void addCategory(ProductComponent component) {
        productComponents.add(component);
    }
    public ProductCategory(String name) {
        super(name);
    }
    public Category findCategoryByName(String name){
        Category result = null;
    }
}
