package com.example.hw2_3.transport;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Lada","Grande", 2015, "России", "желтый", 185, 1.7, null, "седан", "Л123ТС159", 5, "summer", new Car.Key(false, false), new Car.Insurance(LocalDate.of(2021, 6, 30), 4500.00, "123658974"));
        Car audi = new Car("Audi","A8 50 L TDI quattro", 2020, "Германии", "чёрный", 250, 3.0, "tiptronic", "седан", "К707ТТ178", 5, "winter", new Car.Key(true, true), new Car.Insurance(LocalDate.of(2023, 7, 28), 10000.00, "389516742"));
        Car bmw = new Car("BMW","Z8", 2021, "Германии", "чёрный", 250, 3.0, "manual", "кабриолет","К333ВУ777", 2, "summer", new Car.Key(true,true), new Car.Insurance(LocalDate.of(2023, 3, 8), 12000.00, "568197634"));
        Car kia = new Car("Kia","Sportage 4 поколение", 2018, "Южной Корее", "красный", 184, 2.4,"automatic", "кроссовер","С333ТС777", 5, "winter", new Car.Key(true,false), new Car.Insurance(LocalDate.of(2023, 2, 25), 8000.00, "782946351"));
        Car hyundai = new Car("Hyundai","Avante", 2016, "Южной Корее", "оранжевый", 200, 1.6, "robot", "седан", "У231ПТ133", 5, "summer", new Car.Key(true,false), new Car.Insurance(LocalDate.of(2022, 9, 20), 5000.00, "68992362"));

        lada.infoCar();
        audi.infoCar();
        bmw.infoCar();
        kia.infoCar();
        hyundai.infoCar();
        System.out.println();
        System.out.println("Авто которым следует сменить резину в соответствии с сезоном:");
        lada.infoSignal();
        audi.infoSignal();
        bmw.infoSignal();
        kia.infoSignal();
        hyundai.infoSignal();
        System.out.println();
        System.out.println("Список страховок которые следует актуализировать или продлить:");
        lada.getInsurance().checkValidityOfInsurancel();
        audi.getInsurance().checkValidityOfInsurancel();
        bmw.getInsurance().checkValidityOfInsurancel();
        kia.getInsurance().checkValidityOfInsurancel();
        hyundai.getInsurance().checkValidityOfInsurancel();
        kia.refill();
        System.out.println();

        Train lastochka = new Train("Ласточка", "модель B-901", 2011, "Россия", null, 301, 3_500.00,"МСК Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "модель D-125", 2019, "Россия", null, 270,1_700.00, "МСК Ленинградский вокзал", " Ленинград-Пассажирский", 8);
        lastochka.infoTrain();
        leningrad.infoTrain();
        lastochka.refill();
        System.out.println();

        Bus maz = new Bus("МАЗ", "232", 2014,"Россия", "желтый", 85);
        Bus man = new Bus("MAN", "Lion’s Coach", 2018, "Германия", "бордовый", 120);
        Bus liaz = new Bus("ЛиАЗ", "4292",2015, "Россия", "серо-голубой", 85);
        maz.infoBus();
        man.infoBus();
        liaz.infoBus();
        liaz.refill();

    }

}
