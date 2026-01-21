package org.ies.tierno.readers.random;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.Animal;
import org.ies.tierno.models.Carnivore;
import org.ies.tierno.models.Herbivore;
import org.ies.tierno.readers.Reader;

import java.util.Random;

@AllArgsConstructor
public class AnimalRanDer implements Reader<Animal> {
    private final Random random;
    private final Reader <Carnivore> carReader;
    private final Reader <Herbivore> herReader;

    @Override
    public Animal read() {
        if (random.nextBoolean()) {
            return carReader.read();
        } else {
            return herReader.read();
        }
    }
}
