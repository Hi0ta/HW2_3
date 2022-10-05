package com.example.hw2_3.animals;

public abstract class Mammals extends Animals{

    private final int speed;

    public Mammals(String name, String nickname, int age, String habitat, int speed) {
        super(name, nickname, age, habitat);
        if (speed < 0){
            this.speed = 0;
        }else {
            this.speed = speed;
        }
    }
    public int getSpeed() {return speed;}

    public void infoMammals() {
        super.infoAnimals();
        System.out.print(", скорость = " + getSpeed());
    }

    @Override
    public String toString() {
        return super.toString() + ", скорость = " + speed;
    }

    @Override
    public abstract void eat();
    @Override
    public abstract void sleep();
    @Override
    public abstract void go();
    public abstract void walk();
}
