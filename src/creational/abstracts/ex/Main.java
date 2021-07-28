package creational.abstracts.ex;

import creational.abstracts.ex.Factory.AvanteFactory;
import creational.abstracts.ex.Factory.Factory;
import creational.abstracts.ex.Factory.SonataFactory;

public class Main {
    public static <CarFactory> void main(String[] args) {
        Factory avanteFactory = new AvanteFactory();
        Car avante = new Car(avanteFactory.createFrame(), avanteFactory.createWheel());
        avante.getFrame().shape();
        avante.getWheel().size();

        System.out.println("================");

        Factory sonataFactory = new SonataFactory();
        Car sonata = new Car(sonataFactory.createFrame(), sonataFactory.createWheel());
        sonata.getFrame().shape();
        sonata.getWheel().size();
    }
}