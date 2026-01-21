package org.ies.tierno.readers.random;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.Herbivore;
import org.ies.tierno.readers.Reader;

import java.util.Random;

@AllArgsConstructor
public class HerbivoreRanDer implements Reader<Herbivore> {
    private final static String[] HERSPECIES = {
        "Asno salvaje", "Caballo cimarrón", "Loro", "Tortuga angulada", "Conejo de campo", "Elefante"
    };
    private final static String[] HERNAMES = {
        "Shirou", "Kiryu", "Joseph", "Masayoshi", "Jazz", "Donald"
    };
    private final static String[] HERFOOD = {
            "Hierba", "Fruta", "Semillas", "Zanahorias", "Pasto"
    };

    private final Random random;

    @Override
    public Herbivore read() {
        return new Herbivore(
                HERSPECIES[random.nextInt(HERSPECIES.length)],
                random.nextInt(10),
                HERNAMES[random.nextInt(HERNAMES.length)],
                HERFOOD[random.nextInt(HERFOOD.length)]
        );
    }




}
