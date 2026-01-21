package org.ies.tierno.readers.random;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.Area;
import org.ies.tierno.models.Animal;
import org.ies.tierno.readers.Reader;

import java.util.Random;

@AllArgsConstructor
public class AreaRanDer <T extends Animal> implements Reader<Area<T>> {
    private final Random random;
    private final Reader<T> aniReader;

    @Override
    public Area<T> read() {
        T[] animals = (T[]) new Animal[random.nextInt(2-10)];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = aniReader.read();
        }

        return new Area<> (
                random.nextInt(10-100),
                animals
        );
    }
}
