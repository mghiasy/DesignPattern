public abstract class ProductComponent {
    protected String name;
    public abstract void print();
    //It is better to just be in ProductCategory because Product is not supposed to add any Item
    //public abstract void  addCategory(ProductComponent component);

    public ProductComponent(String name){
        this.name= name;
    }
    public String getName(){
        return this.name;
    }
}
