package com.example.hw2_3.animals;

public class Main {


    public static void main(String[] args) {
        Amphibian frog = new Amphibian("лягушка", "фрогги", 3, "озеро");
        Amphibian snake = new Amphibian("уж", "вьюнок", 11, "участок земли близ реки");
       // System.out.println(frog.toString());
        frog.infoAmphibious();
        snake.infoAmphibious();
        System.out.println();
        Flying chaika = new Flying("чайка", "джонатан", 5,"морское побережье");
        Flying albatros = new Flying("альбатрос", "вилбур", 33, "океанское побережье");
        Flying sokol = new Flying("сокол", "купер", 15, "степь");
        chaika.infoFlying();
        albatros.infoFlying();
        sokol.infoFlying();
        System.out.println();
        NotFlying pavlin = new NotFlying("павлин", "павлина", 9, "саванна");
        NotFlying pingvin = new NotFlying("пингвин", "ковальски", 20, "полюс");
        NotFlying dodo = new NotFlying("додо", "эндемик", 0, "остров");
        pavlin.infoNoFlying();
        pingvin.infoNoFlying();
        dodo.infoNoFlying();
        System.out.println();
        Predator giena = new Predator("гиена", "шензи", 7, "африка", 55);
        Predator tigr = new Predator("тигр", "левушка", 6, "леса дальнего востока", 65);
        Predator medved = new Predator("медведь", "миша", 19, "леса сибири", 60);
        giena.infoPredators();
        tigr.infoPredators();
        medved.infoPredators();
        System.out.println();
        Herbivore gazel = new Herbivore("газель", "гузелюшка", 2, "саванны африки", 50);
        Herbivore giraf = new Herbivore("жираф", "ивер", 3, "саванны африки", 55);
        Herbivore loshad = new Herbivore("лошадь", "зорька", 10, "домашнее животное", 60);
        Herbivore loshad2 = new Herbivore("лошадь", "зорька", 10, "домашнее животное", 60);
        gazel.infoHerbivorous();
        giraf.infoHerbivorous();
        loshad.infoHerbivorous();
       System.out.println(loshad.equals(loshad2));
        System.out.println(gazel.equals(loshad));

    }
}
