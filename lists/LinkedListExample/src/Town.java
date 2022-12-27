public class Town {
    private double distance;
    private String nameOfTown;

    public Town(double distance, String nameOfTown) {
        this.distance = distance;
        this.nameOfTown = nameOfTown;
    }

    public double getDistance() {
        return distance;
    }

    public String getNameOfTown() {
        return nameOfTown;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
