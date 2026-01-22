package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Zoo {
    private String name;
    private Area<Carnivore> carniArea;
    private Area<Herbivore> herbiArea;
    private Area<Animal> mixedArea;
}
