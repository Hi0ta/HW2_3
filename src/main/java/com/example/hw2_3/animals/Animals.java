package com.example.hw2_3.animals;

import java.util.Objects;

public abstract class Animals {
    private final String name;
    private String nickname;
    private final int age;
    private final String habitat;

    public Animals(String name, String nickname, int age, String habitat) {

        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "здесь должно быть название животного";
        } else {
        this.name = name;
        }
        setNickname(nickname);
        if (age < 0){
            this.age = 0;
        }else {
            this.age = age;
        }
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = "здесь должна быть среда обитания";
        } else {
            this.habitat = habitat;
        }
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public String getNickname() {return nickname;}

    public String getHabitat() {return habitat;}

    public final void setNickname(String nickname) {
        if (nickname == null || nickname.isEmpty() || nickname.isBlank()) {
            this.nickname = "здесь должна быть кличка животного";
        } else {
            this.nickname = nickname;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Название животного/птицы: " + name + ", кличка животного: " + nickname + ", возраст: " + age + " год/лет, среда обитания: " + habitat;
    }

    public void infoAnimals() {
        System.out.print("Название животного/птицы: " + getName() + ", кличка животного: " + getNickname()
                       + ", возраст: " + getAge() + " год/лет , среда обитания: " + getHabitat());
    }

    public abstract void eat ();
    public abstract void sleep ();
    public abstract void go ();
}
