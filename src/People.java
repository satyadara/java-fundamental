public class People {
    private double height;
    private double weight;
    private String address;

    public People() {
    }

    public People(double height, double weight, String address) {
        this.height = height;
        this.weight = weight;
        this.address = address;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "People{" +
                "height=" + height +
                ", weight=" + weight +
                ", address='" + address + '\'' +
                '}';
    }
}
