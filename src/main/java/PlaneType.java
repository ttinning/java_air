public enum PlaneType {

    AIRBUSA320(124, 183500),
    BOEING747(410, 830000);

    private int seatCapacity;
    private int weight;

    PlaneType(int seatCapacity, int weight) {
        this.seatCapacity = seatCapacity;
        this.weight = weight;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public int getWeight() {
        return weight;
    }
}
