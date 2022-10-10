package com.example.hw2_3.transport;

public final class Train extends Transport{
    private double  priceOfTrip;
    private String departureStation;
    private String arrivalStation;
    private int wagonsNumber;


    public Train(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxSpeed, double priceOfTrip, String departureStation, String arrivalStation, int wagonsNumber) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed);
        setPriceOfTrip(priceOfTrip);
        setDepartureStation(departureStation);
        setArrivalStation(arrivalStation);
        setWagonsNumber(wagonsNumber);
    }

    public double getPriceOfTrip() {return priceOfTrip;}
    public String getDepartureStation() {return departureStation;}
    public String getArrivalStation() {return arrivalStation;}
    public int getWagonsNumber() {return wagonsNumber;}

    public void setPriceOfTrip(double priceOfTrip) {
        if (priceOfTrip <= 0.00){
            this.priceOfTrip = 0.00;
        }else {
            this.priceOfTrip = priceOfTrip;
        }
    }
    public void setDepartureStation(String departureStation) {
        if (departureStation == null || departureStation.isBlank()) {
            this.departureStation = "default";
        } else {
            this.departureStation = departureStation;
        }
    }
    public void setArrivalStation(String arrivalStation) {
        if (arrivalStation == null || arrivalStation.isBlank()) {
            this.arrivalStation = "default";
        } else {
            this.arrivalStation = arrivalStation;
        }
    }
    public void setWagonsNumber(int wagonsNumber) {
        if (priceOfTrip <= 0){
            this.wagonsNumber = 1;
        }else {
            this.wagonsNumber = wagonsNumber;
        }
    }

    public void infoTrain() {
        System.out.print("Поезд: ");
        super.infoTransport();
        System.out.println(", стоимость поездки: " + priceOfTrip + " руб., станция отправления: " + departureStation
                            + ", станция прибытия: " + arrivalStation + ", количество вагонов: " + wagonsNumber);
    }

    @Override
    public void refill() {
        System.out.println("Поезда необходимо заправлять дизелем");
    }
}
