package org.example;

import org.example.domain.abstracts.Animal;
import org.example.domain.abstracts.Pet;
import org.example.domain.concretes.Cat;
import org.example.domain.concretes.Fish;
import org.example.domain.concretes.Spider;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise1 {
      private static final List<Animal> animals = Arrays.asList(new Cat(),
                  new Spider(),
                  new Cat("Tekir"),
                  new Fish("Free Willy"),
                  new Spider(),
                  new Fish("Jaws"));
      private final static Predicate<Animal> isPet = Pet.class::isInstance;
      private final static Predicate<Animal> isWild = isPet.negate();

      // Take a list of wild animals.
      public static void main(String[] args) {

            List<Animal> wildAnimals = animals.stream()
                        .filter(isWild)
                        .toList();

            wildAnimals.stream()
                        .map(Object::getClass)
                        .map(Class::getSimpleName)
                        .distinct()
                        .forEach(System.out::println);

      }
}
