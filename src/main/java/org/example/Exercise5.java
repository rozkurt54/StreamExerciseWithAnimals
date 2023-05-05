package org.example;

import org.example.domain.abstracts.Animal;
import org.example.domain.concretes.Cat;
import org.example.domain.concretes.Fish;
import org.example.domain.concretes.Spider;

import java.util.Arrays;
import java.util.List;

public class Exercise5 {

      // Find the total number of legs.
      public static void main(String[] args) {

            List<Animal> animals = Arrays.asList(new Cat(), new Spider(), new Cat("Tekir"), new Fish("Free Willy"), new Spider(), new Fish("Jaws"));

            long totalNumberOfLegs = animals.stream().mapToLong(Animal::getLegs).sum();

            System.out.println(totalNumberOfLegs);
      }
}
