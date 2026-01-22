package org.ies.tierno.readers.random;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.*;
import org.ies.tierno.readers.Reader;

import java.util.Random;

@AllArgsConstructor
public class ZooRanDer implements Reader<Zoo> {
    private final static String[] CITIES = {
            // 16 [15]
            "Atlanta", "Beijing", "Casablanca", "Düsseldorf", "Estambul", "Hanoi", "Incheon", "Johannesburgo",
            "Londres", "Madrid", "Osaka", "París", "Roma", "Santiago", "Toronto", "Zúrich"
    };
    private final Random random;
    private final Reader <Area<Carnivore>> carReader;
    private final Reader <Area<Herbivore>> herReader;
    private final Reader <Area<Animal>> aniReader;

    @Override
    public Zoo read() {
        return new Zoo (
                "Zoo de " + CITIES[random.nextInt(CITIES.length)],
                carReader.read(),
                herReader.read(),
                aniReader.read()
        );
    }
}
