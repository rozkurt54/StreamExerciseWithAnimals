package org.example;

import org.example.domain.abstracts.Animal;
import org.example.domain.concretes.Cat;
import org.example.domain.concretes.Fish;
import org.example.domain.concretes.Spider;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Exercise7 {

      private static final BiConsumer<Class<?>, Long> printGroup = (clazz, count) -> System.out
                  .println(clazz.getSimpleName() + ": " + count);

      // Count the number of animals in each species

      public static void main(String[] args) {
            List<Animal> animals = Arrays.asList(new Cat(), new Spider(), new Cat("Tekir"), new Fish("Free Willy"),
                        new Spider(), new Fish("Jaws"));

            Map<Class<?>, Long> groupedAnimals = animals.stream()
                        .collect(Collectors.groupingBy(Animal::getClass, Collectors.counting()));

            groupedAnimals.forEach(printGroup);
      }
}
