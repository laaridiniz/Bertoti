public class Main {
    public static void main(String[] args) {
        Product perfume = new Product(270, "La vie est belle", "Eau de parfum", "Lancome");
        Product lipstick = new Product(150, "Powder Kiss Velvet Blur", "Slim lipstick", "MAC");
        Product shampoo = new Product(200, "Symbiose Bain Crème", "Anti-dandruff shampoo", "Kérastase");
        CosmeticsStore store = new CosmeticsStore();
        store.addItems(perfume);
        store.addItems(lipstick);
        store.addItems(shampoo);

        System.out.println("Welcome to our store!");
        System.out.println("These are our available products:");
        store.getDetails();

        System.out.println("We're separating your selected products...");
        System.out.println("Done! Your total will be: $" + store.getPrice());
        System.out.println("Thanks for your purchase, see you soon!");

    }
}