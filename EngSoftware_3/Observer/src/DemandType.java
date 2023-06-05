public enum DemandType {
    AUD("Audiência"),
    PET("Petição"),
    COP("Cópia");

    private final String DemandType;
    DemandType(String DemandType) {
        this.DemandType = DemandType;
    }
    public String getDemandType() {
        return DemandType;
    }
}
