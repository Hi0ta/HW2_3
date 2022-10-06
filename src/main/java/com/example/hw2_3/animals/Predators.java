package com.example.hw2_3.animals;

public class Predators extends Mammals{
    private static final String TUPE_FOOD = "хищник";
    public Predators(String name, String nickname, int age, String habitat, int speed) {
        super(name, nickname, age, habitat, speed);
    }
    public String getTypeFood() {return TUPE_FOOD;}

    public void infoPredators() {
        System.out.print(this.toString());
        System.out.println();
        eat(); sleep(); go(); walk(); hunt();
    }
    @Override
    public boolean equals(Object o) {return super.equals(o);}
    @Override
    public int hashCode() {return super.hashCode();}
    @Override
    public String toString() {
        return super.toString() + ", тип пищи: " + TUPE_FOOD + ", принадлежит к классу хищные млекопитающие";
    }
    @Override
    public void eat() {System.out.println("Я хищник");}
    @Override
    public void sleep() {System.out.println("Я сплю в соответствии со своим местом обитания");}
    @Override
    public void go() {System.out.println("Я передвигаюсь как в воде, так и на суше");}
    @Override
    public void walk() {System.out.println("Я гуляю");}
    public void hunt(){System.out.println("Я охочусь");}
}
