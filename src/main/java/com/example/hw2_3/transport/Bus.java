package com.example.hw2_3.transport;

public final class Bus extends Transport{

    public Bus(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed);
    }
    public void infoBus() {
        System.out.print("Автобус: ");
        super.infoTransport();
        System.out.println();
    }
    @Override
    public void refill() {
        System.out.println("Автобусы можно заправлять бензином или дизелем");
    }
}
