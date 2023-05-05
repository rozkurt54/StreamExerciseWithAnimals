package org.example;

import org.example.domain.abstracts.Animal;
import org.example.domain.concretes.Cat;
import org.example.domain.concretes.Fish;
import org.example.domain.concretes.Spider;

import java.util.Arrays;
import java.util.List;

public class Exercise8 {
      public static void main(String[] args) {
            List<Animal> animals = Arrays.asList(new Cat(), new Spider(), new Cat("Tekir"), new Fish("Free Willy"),
                        new Spider(), new Fish("Jaws"));

            long totalNumberOfSpecies = animals.stream().map(Animal::getClass).map(Class::getSimpleName).distinct().count();

            System.out.println(totalNumberOfSpecies);
      }


}
