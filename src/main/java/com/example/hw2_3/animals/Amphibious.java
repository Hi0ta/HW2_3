package com.example.hw2_3.animals;

public class Amphibious extends Animals{


    public Amphibious(String name, String nickname, int age, String habitat) {
        super(name, nickname, age, habitat);
    }

    public void infoAmphibious() {
        System.out.print(this.toString());
        System.out.println();
        eat(); sleep(); go(); hunt();
    }
    @Override
    public boolean equals(Object o) {return super.equals(o);}
    @Override
    public int hashCode() {return super.hashCode();}
    @Override
    public String toString() {
        return super.toString() + ", принадлежит к классу земноводные";
    }
    @Override
    public void eat() {
        System.out.println("Я питаюсь насекомыми, червями, ракообразными, моллюсками");
    }
    @Override
    public void sleep() {
        System.out.println("Я сплю в воде или в норах, вырытых животными");
    }
    @Override
    public void go() {
        System.out.println("Я передвигаюсь как в воде, так и на суше");
    }
    public void hunt(){
        System.out.println("Я охочусь на: насекомых; червей; ракообразных; моллюсков");
    }
}
