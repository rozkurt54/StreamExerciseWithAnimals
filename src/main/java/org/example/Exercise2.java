package org.example;

import org.example.domain.abstracts.Animal;
import org.example.domain.abstracts.Pet;
import org.example.domain.concretes.Cat;
import org.example.domain.concretes.Fish;
import org.example.domain.concretes.Spider;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exercise2 {
      private static final List<Animal> animals = Arrays.asList(
                  new Cat(),
                  new Spider(),
                  new Cat("Tekir"),
                  new Fish("Free Willy"),
                  new Spider(),
                  new Fish("Jaws"));
      private static final Predicate<Animal> isPet = Pet.class::isInstance;

      // Take a list of pets
      public static void main(String[] args) {
            List<Animal> petAnimals = animals.stream()
                        .filter(isPet)
                        .toList();

            petAnimals.stream()
                        .map(Object::getClass)
                        .map(Class::getSimpleName)
                        .distinct()
                        .forEach(System.out::println);
      }
}
