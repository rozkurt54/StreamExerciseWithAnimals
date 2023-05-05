package org.example.domain.abstracts;

public abstract class Animal {
      private int legs;

      public Animal(int legs) {
            this.legs = legs;
      }

      public int getLegs() {
            return legs;
      }

      public void walk() {
            System.out.printf("Animal with %d legs is walking now...%n", legs );
      }

      public abstract void eat();
}
