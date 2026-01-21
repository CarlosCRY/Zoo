package org.ies.tierno.readers.random;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.Carnivore;
import org.ies.tierno.readers.Reader;

import java.util.Random;

@AllArgsConstructor
public class CarnivoreRanDer implements Reader<Carnivore> {
    private final static String[] CARSPECIES = {
        "Leon", "Zorro", "Perro salvaje", "Serpiente", "Mapache", "Chacal"
    };
    private final static String[] CARNAMES = {
        "Artoria", "Boudica", "Caine", "Medusa", "Raiko", "Zenobia"
    };
    private final static String[] CARFOOD = {
            "Cerdo", "Venado", "Ternera", "Conejo", "Ratón"
    };

    private final Random random;

    @Override
    public Carnivore read() {
        return new Carnivore(
                CARSPECIES[random.nextInt(CARSPECIES.length)],
                random.nextInt(10),
                CARNAMES[random.nextInt(CARNAMES.length)],
                CARFOOD[random.nextInt(CARFOOD.length)]
        );
    }




}
