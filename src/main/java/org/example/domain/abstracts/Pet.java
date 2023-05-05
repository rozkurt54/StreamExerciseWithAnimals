package org.example.domain.abstracts;

public interface Pet {
      void setName(String name);

      String getName();

      void play();

      static void  playIfPet(Animal animal) {
            if(animal instanceof Pet) {
                  ((Pet) animal).play();
            }
      }
}
