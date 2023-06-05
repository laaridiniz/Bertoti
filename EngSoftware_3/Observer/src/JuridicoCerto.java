public class JuridicoCerto implements Observer{
    @Override
    public void update(Demand demand) {
        System.out.println("Nova demanda no Portal Jurídico Certo:");
        System.out.println(demand);
    }
}
