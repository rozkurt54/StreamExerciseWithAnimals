package org.example;

import org.example.domain.abstracts.Animal;
import org.example.domain.concretes.Cat;
import org.example.domain.concretes.Fish;
import org.example.domain.concretes.Spider;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Exercise4 {
      private static final Random RANDOM = new SecureRandom();
      private static final Supplier<Animal> spiderCreator = Spider::new;
      private static final Supplier<Animal> catCreator = Cat::new;

      private static final Supplier<Animal> fishCreator = () -> new Fish("Çakıl");
      private static final List<Supplier<Animal>> suppliers = Arrays.asList(spiderCreator, catCreator, fishCreator);

      //Take a lit of 100 random animals
      public static void main(String[] args) {
            final List<Animal> randomAnimals = IntStream.generate(()-> RANDOM.nextInt(suppliers.size())).mapToObj(suppliers::get)
                        .map(Supplier::get)
                        .limit(100)
                        .toList();
            randomAnimals.forEach(item -> System.out.println(item.getClass().getSimpleName()));
      }
}
