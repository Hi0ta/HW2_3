package com.example.hw2_3.transport;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.time.Month.*;

public final class Car extends Transport {
    public static class Key{

        private final boolean remoteEngineStart;
        private final boolean keylessAccess;
        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {return remoteEngineStart;}
        public boolean isKeylessAccess() {return keylessAccess;}
    }
    public static class Insurance{
        private final LocalDate insuranceValidityPeriod;
        private final double costOfInsurance;
        private final String insuranceNumber;
        public Insurance(LocalDate insuranceValidityPeriod, double costOfInsurance, String insuranceNumber) {
           if (insuranceValidityPeriod == null) {
               this.insuranceValidityPeriod = LocalDate.now();
           } else {
              this.insuranceValidityPeriod = insuranceValidityPeriod;
           }
            if (costOfInsurance <= 0.00) {
                this.costOfInsurance = 0.00;
            } else {
                this.costOfInsurance = costOfInsurance;
            }
            if(insuranceNumber.length() != 9 ) {
                this.insuranceNumber = "введен некорректный номер страховки!";
            } else if (insuranceNumber == null || insuranceNumber.isEmpty() || insuranceNumber.isBlank()) {
                this.insuranceNumber = "123456789";
            } else {
                this.insuranceNumber = insuranceNumber;
            }
        }
        public LocalDate getInsuranceValidityPeriod() {return insuranceValidityPeriod;}
        public double getCostOfInsurance() {return costOfInsurance;}
        public String getInsuranceNumber() {return insuranceNumber;}
        public void checkValidityOfInsurancel() {
            if (insuranceNumber.length() != 9) {
                System.out.println("невозможно проверить срок действия страховки  - введен некорректный номер");
            } else if (insuranceValidityPeriod.isBefore(LocalDate.now())
               || insuranceValidityPeriod.isEqual(LocalDate.now())){
                System.out.println("Страховой полис номер: " + insuranceNumber + " не действителен или не актуален(просрочен), нужно срочно ехать оформлять страховку!");
           }
        }

    }
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String tireSign;
    private Key key;
    private Insurance insurance;
    public Car(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxSpeed,
            double engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats, String tireSign,
               Key key, Insurance insurance) {
       super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        setRegistrationNumber(registrationNumber);
        if (numberOfSeats == 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        setTireSign(tireSign);
        this.key = key;
        this.insurance = insurance;
    }

    /*public Car(){
        this.engineVolume = 1.5;
        this.transmission = "manual";
        this.bodyType = "седан";
        this.registrationNumber =  "х000хх000";
        this.numberOfSeats = 5;
        this.tireSign = "summer";
        this.key = key;
        this.insurance = insurance;
    }*/
    public void infoCar() {
        System.out.print("Автомобиль: ");
        super.infoTransport();
        System.out.println(", объем двигателя: " + engineVolume + " литра, коробка передач: " + transmission + ", тип кузова: " + bodyType
                + ", регистрационный номер: " + registrationNumber + ", количество мест: " + numberOfSeats
                + ", резина: " + tireSign + ", cрок действия страховки до: " +  insurance.insuranceValidityPeriod
                + ", стоимость страховки: " + insurance.costOfInsurance + " руб., номер страховки: " + insurance.insuranceNumber
                + ", удалённый запуск двигателя: " + key.remoteEngineStart + ", бесключевой доступ: " + key.remoteEngineStart);
    }

    public String getBodyType() {return bodyType;}

    public int getNumberOfSeats() {return numberOfSeats;}
    public double getEngineVolume() {return engineVolume;}
    public String getTransmission() {return transmission;}
    public String getRegistrationNumber() {return registrationNumber;}
    public String getTireSign() {return tireSign;}
    public Key getKey() {return key;}
    public Insurance getInsurance() {return insurance;}
    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "manual";
        } else {
            this.transmission = transmission;
        }
    }
    public void setRegistrationNumber(String registrationNumber) {
        Matcher m = Pattern.compile("[А-Я]\\d\\d\\d[А-Я][А-Я]\\d\\d\\d").matcher(registrationNumber);
        if (m.find()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "некорректный номер";
        }
    }
    public void setTireSign(String tireSign) {
        if (tireSign == null || tireSign.isEmpty() || tireSign.isBlank()) {
            this.tireSign = "summer";
        } else {
            this.tireSign = tireSign;
        }
    }
    public void infoSignal() {
        if (LocalDate.now().getMonth() == OCTOBER
                || LocalDate.now().getMonth() == NOVEMBER
                || LocalDate.now().getMonth() == DECEMBER
                || LocalDate.now().getMonth() == JANUARY
                || LocalDate.now().getMonth() == FEBRUARY
                || LocalDate.now().getMonth() == MARCH){
            if (tireSign == "summer"){
                System.out.println("Необходимо сменить резину на зимнюю!!" + getBrand() + " " + getModel() + " " + registrationNumber);
            }
        }else{
            if (tireSign == "winter"){
                System.out.println("Необходимо сменить резину на летнюю!!" + getBrand() + " " + getModel() + " " + registrationNumber);
            }
        }

    }
    @Override
    public void refill() {
        System.out.println("Автомобили можно заправлять бензином, дизелем на заправке или заряжать на специальных электро-парковках, если это электрокар");
    }
}
