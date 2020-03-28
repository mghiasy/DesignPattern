import java.util.ArrayList;
import java.util.Collection;

public class ProductCategory extends ProductComponent {
    protected Collection<ProductComponent> productComponents= new ArrayList<ProductComponent>();
    public void print() {
        for (ProductComponent p : productComponents){
            System.out.println(p.name);
        }
    }

    public void addCategory(ProductComponent component) {
        productComponents.add(component);
    }
    public ProductCategory(String name) {
        super(name);
    }
}
