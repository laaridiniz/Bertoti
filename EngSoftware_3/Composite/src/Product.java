import javax.xml.namespace.QName;

public class Product implements Details{
    int Price;
    String Name;
    String Type;
    String Brand;
    public Product(int price, String name, String type, String brand){
        this.Price = price;
        this.Name = name;
        this.Type = type;
        this.Brand = brand;

    }

    @Override
    public void getDetails() {
        System.out.println(this.Name + ", " + this.Type + ", " + this.Brand+", " + "$ " +this.getPrice());
    }

    @Override
    public int getPrice() {
        return this.Price;
    }
}
