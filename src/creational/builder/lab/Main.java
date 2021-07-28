package creational.builder.lab;

import creational.builder.lab.car.Car;
import creational.builder.lab.car.CarBuilder;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();

        Car sonata = carBuilder.setCarName("sonata").setCarType("세단").setHandlePosition("좌측").build();
        System.out.println(sonata.toString());
    }
}
