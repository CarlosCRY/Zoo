package org.ies.tierno.readers.random;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.Animal;
import org.ies.tierno.models.Area;
import org.ies.tierno.readers.Reader;

import java.util.Random;

@AllArgsConstructor
public class ZooRanDer implements Reader<Area> {
    private final Random random;
    private final Reader <Animal> aniReader;

    @Override
    public Area read() {
        Animal[] animals = new Animal[random.nextInt(2-10)];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = aniReader.read();
        }

        return new Area (
                random.nextInt(10-100),
                animals
        );
    }
}
