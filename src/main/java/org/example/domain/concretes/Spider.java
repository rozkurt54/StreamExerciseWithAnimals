package org.example.domain.concretes;

import org.example.domain.abstracts.Animal;

public class Spider extends Animal {

      public Spider() {
            super(8);
      }

      @Override
      public void eat() {
            System.out.println("Spider is eating now...");
      }
}
