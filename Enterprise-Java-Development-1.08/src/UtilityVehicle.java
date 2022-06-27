public class UtilityVehicle extends Car{

    boolean fourWheelDrive = true;

    public UtilityVehicle(String vinNumber, String make, String model, double mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    @Override
    public String toString() {
        return "UtilityVehicle{" +
                "fourWheelDrive=" + fourWheelDrive +
                "} " + super.toString();
    }
}