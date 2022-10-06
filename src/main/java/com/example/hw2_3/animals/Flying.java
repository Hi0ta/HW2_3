package com.example.hw2_3.animals;

public class Flying extends Birds{
    private final String TUPE_MOVEMENT = "летает";
    public Flying(String name, String nickname, int age, String habitat) {
        super(name, nickname, age, habitat);
    }
    public String getTypeMovement() {return TUPE_MOVEMENT;}

    public void infoFlying() {
        System.out.print(this.toString());
        System.out.println();
        eat(); sleep(); go(); hunt(); flying();
    }
    @Override
    public boolean equals(Object o) {return super.equals(o);}
    @Override
    public int hashCode() { return super.hashCode();}
    @Override
    public String toString() {
        return super.toString() + ", тип передвижения: " + TUPE_MOVEMENT + ", принадлежит к классу летающие птицы";
    }
    @Override
    public void eat() {System.out.println("Я хищник");}
    @Override
    public void sleep() {
        System.out.println("Я сплю в соответствии со своим местом обитания");
    }
    @Override
    public void go() {
        System.out.println("Я передвигаюсь как по воздуху, так и по суше");
    }
    @Override
    public void hunt() {
        System.out.println("Я охочусь");
    }
    public void flying(){
        System.out.println("Я летаю");
    }
}
