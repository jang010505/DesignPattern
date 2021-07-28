package creational.builder.lab.car;

public class CarBuilder {
    private String wheelSize;
    private String frameShape;
    private String carName;
    private String carType;
    private String handlePosition;

    public CarBuilder setWheelSize(String wheelSize){
        this.wheelSize = wheelSize;
        return this;
    }

    public CarBuilder setFrameShape(String frameShape){
        this.frameShape = frameShape;
        return this;
    }

    public CarBuilder setCarName(String carName){
        this.carName = carName;
        return this;
    }

    public CarBuilder setCarType(String carType){
        this.carType = carType;
        return this;
    }

    public CarBuilder setHandlePosition(String handlePosition){
        this.handlePosition = handlePosition;
        return this;
    }

    public Car build(){
        return new Car(wheelSize, frameShape, carName, carType, handlePosition);
    }
}
