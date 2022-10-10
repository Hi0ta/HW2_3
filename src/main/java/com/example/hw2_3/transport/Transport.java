package com.example.hw2_3.transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String bodyColor;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxSpeed) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear <= 0){
            this.productionYear = 1900;
        }else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isBlank()) {
            this.productionCountry = "Россия";
        } else {
            this.productionCountry = productionCountry;
        }
        setBodyColor(bodyColor);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public int getProductionYear() {return productionYear;}
    public String getProductionCountry() {return productionCountry;}
    public String getBodyColor() {return bodyColor;}
    public int getMaxSpeed() {return maxSpeed;}

    public final void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            this.bodyColor = "белый";
        } else {
            this.bodyColor = bodyColor;
        }
    }
    public final void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0){
            this.maxSpeed = 100;
        }else {
            this.maxSpeed = maxSpeed;
        }
    }
    public void infoTransport() {
        System.out.print(getBrand() + " " + getModel() + ", " + getProductionYear()
                + " года выпуска, производство: " + getProductionCountry()
                + ", цвет: " + getBodyColor() + ", максимальная скорость: " + getMaxSpeed()
                + "км/ч");
    }
    public abstract void refill ();


}

