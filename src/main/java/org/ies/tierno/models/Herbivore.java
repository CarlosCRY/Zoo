package org.ies.tierno.models;

import java.util.Objects;

public class Herbivore extends Animal {
    private String favoriteVeggie;

    public Herbivore(String species, int age, String name, String favoriteVeggie) {
        super(species, age, name);
        this.favoriteVeggie = favoriteVeggie;
    }

    public String getFavoriteVeggie() {
        return favoriteVeggie;
    }

    public void setFavoriteVeggie(String favoriteVeggie) {
        this.favoriteVeggie = favoriteVeggie;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore carnivore = (Herbivore) o;
        return Objects.equals(favoriteVeggie, carnivore.favoriteVeggie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), favoriteVeggie);
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "favoriteMeat='" + favoriteVeggie + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
