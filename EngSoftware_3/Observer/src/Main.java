public class Main {
    public static void main(String[] args) {

        System.out.println("===================================");

        Demand demand1 = new Demand("Audiência de Instrução e Julgamento - 4ª Vara Criminal de São José dos Campos", Location.SP, DemandType.AUD);

        App app = new App();
        app.register(new Migalhas());
        app.register(new JuridicoCerto());

        Migalhas migalhas = new Migalhas();

        app.register(migalhas);

        app.notify(demand1);

        Demand demand2 = new Demand("Recurso de Apelação em Ação Indenizatória - 1ª Vara Cível de São José dos Campos", Location.SP, DemandType.PET);

        app.remove(migalhas);

        app.notify(demand2);

    }
}