package com.study.d06;

public class CarStore {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setName("V6");
        engine.setPower(6000);
        engine.setPrice(50_0000);
        SteeringWheel steeringWheel = new SteeringWheel();
        steeringWheel.setName("方向盤");
        steeringWheel.setPrice(12_0000);
        
        Car car = new Car();
        car.setEngine(engine);
        car.setSteeringWheel(steeringWheel);
        System.out.println(car.getEngine());
        System.out.println(car.getSteeringWheel());
        
    }
}
