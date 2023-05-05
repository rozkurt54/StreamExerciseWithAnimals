package org.example;

import org.example.domain.abstracts.Animal;
import org.example.domain.concretes.Cat;
import org.example.domain.concretes.Fish;
import org.example.domain.concretes.Spider;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Exercise3 {
      private static final List<Animal> animals = Arrays.asList(new Cat(), new Spider(), new Cat("Tekir"), new Fish("Free Willy"),
                  new Spider(), new Fish("Jaws"));

      private static final Consumer<Animal> printAnimal = animal -> System.out.println(animal.getClass().getSimpleName() + " with " + animal.getLegs() + " legs");

      // Find the animal with the highest number of legs
      public static void main(String[] args) {

            animals.stream()
                        .max(Comparator.comparing(Animal::getLegs)).ifPresent(printAnimal);

      }
}
