package com.example.hw2_3.animals;

public class main {


    public static void main(String[] args) {
        Amphibious frog = new Amphibious("лягушка", "фрогги", 3, "озеро");
        Amphibious snake = new Amphibious("уж", "вьюнок", 11, "участок земли близ реки");
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
        Predators giena = new Predators("гиена", "шензи", 7, "африка", 55);
        Predators tigr = new Predators("тигр", "левушка", 6, "леса дальнего востока", 65);
        Predators medved = new Predators("медведь", "миша", 19, "леса сибири", 60);
        giena.infoPredators();
        tigr.infoPredators();
        medved.infoPredators();
        System.out.println();
        Herbivorous gazel = new Herbivorous("газель", "гузелюшка", 2, "саванны африки", 50);
        Herbivorous giraf = new Herbivorous("жираф", "ивер", 3, "саванны африки", 55);
        Herbivorous loshad = new Herbivorous("лошадь", "зорька", 10, "домашнее животное", 60);
        Herbivorous loshad2 = new Herbivorous("лошадь", "зорька", 10, "домашнее животное", 60);
        gazel.infoHerbivorous();
        giraf.infoHerbivorous();
        loshad.infoHerbivorous();
        System.out.println(loshad.equals(loshad2));
        System.out.println(gazel.equals(loshad));

    }
}
