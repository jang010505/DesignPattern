package creational.builder.lab.car;

public class Car {
    private final String wheelSize;
    private final String frameShape;
    private final String carName;
    private final String carType;
    private final String handlePosition;

    public Car(String wheelSize, String frameShape, String carName, String carType, String handlePosition) {
        this.wheelSize = wheelSize;
        this.frameShape = frameShape;
        this.carName = carName;
        this.carType = carType;
        this.handlePosition = handlePosition;
    }

    @Override
    public String toString() {
        return "Car" + "\nwheelSize = " + wheelSize + "\nframeShape = " + frameShape + "\ncarName = " + carName + "\ncarType = "+ carType + "\nhandlePosition = " + handlePosition;
    }
}
