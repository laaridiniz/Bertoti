import java.util.ArrayList;
import java.util.List;

public class App implements Subject {
    private List<Observer> app = new ArrayList<>();
    @Override
    public void register(Observer o) {
        app.add(o);
    }
    @Override
    public void remove(Observer o) {
        int index = app.indexOf(o);
        if(index > 0){
            app.remove(index);
        }
    }
    @Override
    public void notify(Demand demand) {
        System.out.println("---------------------------------");
        for(Observer o: app){
            o.update(demand);
        }
    }
}
