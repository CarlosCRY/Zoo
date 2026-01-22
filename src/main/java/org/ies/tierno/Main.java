package org.ies.tierno;

import org.ies.tierno.models.*;
import org.ies.tierno.readers.random.*;

import java.util.Random;

public class Main {
    public static void main (String[] args) {
        Random random = new Random();
        CarnivoreRanDer carReader = new CarnivoreRanDer(random);
        HerbivoreRanDer herReader = new HerbivoreRanDer(random);
        AnimalRanDer aniReader = new AnimalRanDer(random, carReader, herReader);
        AreaRanDer<Carnivore> cAReader = new AreaRanDer<Carnivore> (random, carReader);
        AreaRanDer<Herbivore> hAReader = new AreaRanDer<Herbivore> (random, herReader);
        AreaRanDer<Animal> aAReader = new AreaRanDer<Animal> (random, aniReader);
        ZooRanDer zReader = new ZooRanDer (random, cAReader, hAReader, aAReader);

        System.out.println(zReader.read());
    }

}
