public class Demand {
    private String titulo;
    private Location location;
    private DemandType demandType;
    private Demand notification;

    public Demand(String titulo, Location location, DemandType demandType){
        this.titulo = titulo;
        this.location = location;
        this.demandType = demandType;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public DemandType getDemandType() {
        return demandType;
    }

    public void setDemandType(DemandType demandType) {
        this.demandType = demandType;
    }

    public Demand getNotification() {
        return notification;
    }

    public void setNotification(Demand notification) {
        this.notification = notification;
    }

    @Override
    public String toString() {
        return "Nova demanda " + titulo + " em " + location + " do tipo " + demandType + ".";
    }
}
