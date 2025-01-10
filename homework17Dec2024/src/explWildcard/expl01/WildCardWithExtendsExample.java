package explWildcard.expl01;

import java.util.ArrayList;
import java.util.List;

public class WildCardWithExtendsExample {

    // listam elementele de orice tip care sunt o subclasa a lui Animal
    public static void printAnimalSounds(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        List<Puppy> puppies = new ArrayList<>();
        puppies.add(new Puppy());
        puppies.add(new Puppy());

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Puppy());

        System.out.println("Dog sounds:");
        printAnimalSounds(dogs);

        System.out.println("\nCat sounds:");
        printAnimalSounds(cats);

        System.out.println("\nPuppy sounds:");
        printAnimalSounds(puppies);

        System.out.println("\nGeneral animal sounds:");
        printAnimalSounds(animals);
    }
}
