package org.ies.tierno.models;

import lombok.Data;

@Data
public abstract class Animal {
    protected String species;
    protected int age;
    protected String name;

    public Animal (String species, int age, String name) {
        this.species = species;
        this.age = age;
        this.name = name;
    }
}
