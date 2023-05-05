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

public class Exercise6 {

      private static final BiConsumer<Integer, List<Animal>> printGroup = (count, list) -> System.out
                  .println(count + ": " + list.toString());

      // Group the animals by their number of legs.

      public static void main(String[] args) {
            List<Animal> animals = Arrays.asList(new Cat(), new Spider(), new Cat("Tekir"), new Fish("Free Willy"),
                        new Spider(), new Fish("Jaws"));

            Map<Integer, List<Animal>> groupedAnimals =
                        animals.stream()
                                    .collect(Collectors.groupingBy(Animal::getLegs));

            groupedAnimals.forEach(printGroup);
      }
}
