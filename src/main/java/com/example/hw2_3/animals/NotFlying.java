package com.example.hw2_3.animals;

public class NotFlying extends Bird {
    private static final String TUPE_MOVEMENT = "не летает";
    public NotFlying(String name, String nickname, int age, String habitat) {
        super(name, nickname, age, habitat);
    }
    public String getTypeMovement() {return TUPE_MOVEMENT;}
    public void infoNoFlying() {
        System.out.print(this.toString());
        System.out.println();
        eat(); sleep(); go(); hunt(); walk();
    }
    @Override
    public String toString() {return super.toString() + ", тип передвижения: " + TUPE_MOVEMENT + ", принадлежит к классу не летающие птицы";}
    @Override
    public void eat() {System.out.println("Я хищник");}
    @Override
    public void sleep() {
        System.out.println("Я сплю в соответствии со своим местом обитания");
    }
    @Override
    public void go() {
        System.out.println("Я передвигаюсь как по воде, так и по суше");
    }
    @Override
    public void hunt() {
        System.out.println("Я охочусь");
    }
    public void walk(){
        System.out.println("Я гуляю");
    }
}
