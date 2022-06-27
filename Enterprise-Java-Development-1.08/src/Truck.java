public class Truck extends Car{
    double towingCapacity;

    public Truck(String vinNumber, String make, String model, double mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "towingCapacity=" + towingCapacity +
                "} " + super.toString();
    }
}
