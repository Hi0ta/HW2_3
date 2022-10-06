package com.example.hw2_3.animals;

public abstract class Birds extends Animals{
    public Birds(String name, String nickname, int age, String habitat) {
        super(name, nickname, age, habitat);}
    @Override
    public boolean equals(Object o) {return super.equals(o);}
    @Override
    public int hashCode() {return super.hashCode();}
    @Override
    public String toString() {return super.toString();}
    @Override
    public abstract void eat();
    @Override
    public abstract void sleep();
    @Override
    public abstract void go();
    public abstract void hunt();
}
