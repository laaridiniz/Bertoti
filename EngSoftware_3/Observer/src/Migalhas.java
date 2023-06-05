public class Migalhas implements Observer{
    @Override
    public void update(Demand demand) {
        System.out.println("Nova demanda no Portal Migalhas:");
        System.out.println(demand);
    }
}
