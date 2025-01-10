package explWildcard.expl02;

import java.util.ArrayList;
import java.util.List;

public class WildCardWithSuperExample {

    // adaugam elemente de tip Dog sau subclase ale lui Dog
    public static void addAnimalsToList(List<? super Dog> animals) {
        animals.add(new Dog());
        animals.add(new Puppy());
    }

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        addAnimalsToList(animalList);

        for (Object obj : animalList) {
            if (obj instanceof Animal animal) {
                animal.makeSound();
            }
        }

        List<Dog> dogList = new ArrayList<>();
        addAnimalsToList(dogList);
        for (Dog dog : dogList) {
            dog.makeSound();
        }

    }
}
