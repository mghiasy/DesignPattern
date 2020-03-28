public abstract class ProductComponent {
    protected String name;
    public abstract void print();
    public abstract void  addCategory(ProductComponent component);

    public ProductComponent(String name){
        this.name= name;
    }
}
