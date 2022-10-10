package com.example.hw2_3.animals;

import java.util.Objects;

public abstract class Mammal extends Animal {

    private final int speed;

    public Mammal(String name, String nickname, int age, String habitat, int speed) {
        super(name, nickname, age, habitat);
        if (speed < 0){
            this.speed = 0;
        }else {
            this.speed = speed;
        }
    }
    public int getSpeed() {return speed;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed;
    }
    @Override
    public int hashCode() {return Objects.hash(super.hashCode(), speed);}

    @Override
    public String toString() {return super.toString() + ", скорость = " + speed;}
    @Override
    public abstract void eat();
    @Override
    public abstract void sleep();
    @Override
    public abstract void go();
    public abstract void walk();
}
