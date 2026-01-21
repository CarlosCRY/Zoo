package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Area <T extends Animal> {
    private int number;
    private T[] animals;
}
