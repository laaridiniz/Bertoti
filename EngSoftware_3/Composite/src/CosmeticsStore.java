import java.util.ArrayList;

public class CosmeticsStore implements Details{
    private ArrayList<Product> productsList = new ArrayList<Product>();
    public void addItems(Product products){
        productsList.add(products);
    }
    @Override
    public void getDetails() {
        for(Product products: productsList){
            products.getDetails();
        }
    }

    @Override
    public int getPrice() {
        int total = 0;
        for(Product products: productsList){
           total = total +  products.getPrice();
        }
        return total;
    }
}
