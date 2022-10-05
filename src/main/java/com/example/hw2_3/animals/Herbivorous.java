package com.example.hw2_3.animals;

public class Herbivorous extends Mammals{
    private final String TUPE_FOOD = "вегетарианец";
    public Herbivorous(String name, String nickname, int age, String habitat, int speed) {
        super(name, nickname, age, habitat, speed);
    }

    public String getTypeFood() {return TUPE_FOOD;}

    public void infoHerbivorous() {
        super.infoMammals();
        System.out.println(", тип пищи: " + getTypeFood());
        eat(); sleep(); go(); walk(); graze();
        System.out.println("принадлежит к классу травоядные млекопитающие");
    }
    @Override
    public String toString() {
        return super.toString()  + ", тип пищи: " + TUPE_FOOD + "принадлежит к классу травоядные млекопитающие";
    }
    @Override
    public void eat() {System.out.println("Я вегетарианец");}
    @Override
    public void sleep() {
        System.out.println("Я сплю в соответствии со своим местом обитания");
    }
    @Override
    public void go() {System.out.println("Я передвигаюсь как в воде, так и на суше");}
    @Override
    public void walk() {
        System.out.println("Я гуляю");
    }
    public void graze(){
        System.out.println("Я пасусь");
    }
}
