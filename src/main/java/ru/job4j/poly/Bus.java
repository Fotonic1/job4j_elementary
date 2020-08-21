package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passenger(int count) {

    }

    @Override
    public int refill(int liters) {
        return liters * 45;
    }
}
