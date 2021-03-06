package com.akash.creational.abstract_factory;

class TestAbstractFactory {

    public static void main(String[] args) {

        WheelFactory carWheelFactory = FactoryProducer.getFactory("CarWheel");
        Wheel carWheel = carWheelFactory.makeWheel();
        WheelFittingExpert carExpert = carWheelFactory.makeFittingExpert();

        System.out.println(carWheel.getDescription()); // I am a car wheel
        System.out.println(carExpert.getDescription()); // I can only fit car wheels

        // Same for the Bike wheel
        WheelFactory bikeWheelFactory = FactoryProducer.getFactory("BikeWheel");

        Wheel bikeWheel = bikeWheelFactory.makeWheel();
        WheelFittingExpert bikeExpert = bikeWheelFactory.makeFittingExpert();

        System.out.println(bikeWheel.getDescription()); // I am a bike wheel
        System.out.println(bikeExpert.getDescription()); // I can only fit bike wheels

    }
}