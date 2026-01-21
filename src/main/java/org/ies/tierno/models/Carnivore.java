package org.ies.tierno.models;

import java.util.Objects;

public class Carnivore extends Animal {
    private String favoriteMeat;

    public Carnivore(String species, int age, String name, String favoriteMeat) {
        super(species, age, name);
        this.favoriteMeat = favoriteMeat;
    }

    public String getFavoriteMeat() {
        return favoriteMeat;
    }

    public void setFavoriteMeat(String favoriteMeat) {
        this.favoriteMeat = favoriteMeat;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Carnivore carnivore = (Carnivore) o;
        return Objects.equals(favoriteMeat, carnivore.favoriteMeat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), favoriteMeat);
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "favoriteMeat='" + favoriteMeat + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
