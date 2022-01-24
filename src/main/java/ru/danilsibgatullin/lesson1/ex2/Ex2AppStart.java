package ru.danilsibgatullin.lesson1.ex2;

public class Ex2AppStart {
    public static void main(String[] args) {
        Car car1 = new LightWeightCar(new Engine(),"red","BMW");
        Car car2 = new Lorry(new Engine(),"blue","SCANIA");

        car1.open();
        car1.start();
        car1.move();
        car1.stop();

        car2.open();
        car2.start();
        car2.move();
        car2.stop();
    }
}
